class TestCustomException1 {

	static void validate(int age) {
		if (age < 18)
			try {
				throw new InvalidAgeException("not valid");
			} catch (InvalidAgeException e) {
				e.printStackTrace();
			}
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) throws InvalidAgeException {
		validate(13);
		System.out.println("rest of the code...");
	}
}