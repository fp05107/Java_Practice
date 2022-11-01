package Enums;

public enum City {
	DELHI {
		@Override
		public void message() {
			System.out.println("Welcome user you are in capital");
			System.out.println("Tower in your area is: " + noOfTowers);
		}
	},
	MUMBAI, KOLKATA, CHENNAI("50 towers");

	String noOfTowers;

	private City() {
		this.noOfTowers = "100 towers";
	}

	private City(String noOfTowers) {
		this.noOfTowers = noOfTowers;
	}

	public void message() {
		System.out.println("Welcome user");
		System.out.println("Tower in your area is: " + noOfTowers);
	}

}
