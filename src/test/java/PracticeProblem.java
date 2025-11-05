public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void insertionSort(char[] characters) {
		if (characters == null || characters.length < 2) return;

		for (int i = 1; i < characters.length; i++) {
			char key = characters[i];
			int j = i - 1;

			while (j >= 0 && characters[j] > key) {
				characters[j + 1] = characters[j];
				j--;
			}
			characters[j + 1] = key;
		}
	}


}
