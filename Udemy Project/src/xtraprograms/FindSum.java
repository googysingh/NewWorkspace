package xtraprograms;

public class FindSum {


	int[] number;
	int length;
	int sum = 0;
	StringBuilder s;

	FindSum(int[] input) {
		number = input;
		length = number.length;
		s = new StringBuilder();

	}

	public void caller() {
		for (int j = 0; j < number.length; j++) {

			find(j);
			sum = 0;
			s.setLength(0);
		}

	}

	public void find(int i) {
		sum = sum + number[i];
		s.append(number[i]);

		if (sum > 5) {

			return;

		}
		if (sum == 5) {
			// sum-=number[i];
			System.out.println("Answer:" + s);
			// s.setLength(s.length()-1);
			return;
		}

		for (int j = i + 1; j < number.length; j++) {

			// System.out.println(sum);
			// System.out.println("Answer:"+s);
			find(j);

			sum -= number[j];
			s.setLength(s.length() - 1);
		}

		return;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int search = 7;
		int array[] = { 0, 1, 2, 3, 4, 6, 7, 8 };

		int j = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] < search) {
				array[j++] = array[i];
			}
		}
		int[] b = new int[j];
		System.arraycopy(array, 0, b, 0, j);
		array = b;
		FindSum test = new FindSum(array);
		test.caller();

	}

}