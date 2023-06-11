package assignmert7;

public class CustomArrayListApplication {

	public static void main(String[] args) {
		exampleHulkHogan();
		exampleUndertaker();
		System.out.println("");
		exampleStoneCold();
		System.out.println("");
		exampleTheRock();
	}

	private static void exampleHulkHogan() {
		CustomList<Integer> hulkHoganList = new CustomArrayList<>();
		for (int i = 0; i < 20; i++) {
			hulkHoganList.add(i, i + 10);
		}
		hulkHoganList.add(1, 1000);
		for (int i = 0; i < 20; i++) {
			System.out.println(hulkHoganList.get(i));
		}
	}

	private static void exampleUndertaker() {
		CustomList<Integer> undertakerList = new CustomArrayList<>();
		for (int i = 0; i < 15; i++) {
			undertakerList.add(i, i * 2);
		}
		undertakerList.add(5, 20);
		for (int i = 0; i < 15; i++) {
			System.out.println(undertakerList.get(i));
		}
	}

	private static void exampleStoneCold() {
		String[] stoneColdNames = { "Austin 3:16", "The Rattlesnake", "Stunner", "Broken Skull", "Texas Rattlesnake",
				"The Bionic elbow", "Cold Stone" };
		CustomList<String> stoneColdList = new CustomArrayList<>();
		for (int i = 0; i < stoneColdNames.length; i++) {
			stoneColdList.add(stoneColdNames[i]);
		}
		for (int i = 0; i < stoneColdList.getSize(); i++) {
			System.out.println(stoneColdList.get(i));
		}
		System.out.println(stoneColdList.getSize());
	}

	private static void exampleTheRock() {
		CustomList<Integer> theRockData = new CustomArrayList<>();

		// Add numbers to the list
		for (int i = 1; i <= 5; i++) {
			theRockData.add(i * 10);
		}

		// Get numbers at indexes in the list
		for (int i = 0; i < theRockData.getSize(); i++) {
			System.out.println(theRockData.get(i));
		}
		System.out.println(theRockData.getSize());
		System.out.println(theRockData.get(3));
	}
}