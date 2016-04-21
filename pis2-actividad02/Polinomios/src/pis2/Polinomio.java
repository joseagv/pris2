package pis2;

import java.util.ArrayList;

public class Polinomio {

	ArrayList<Integer> polinomio = new ArrayList<Integer>();

	public static ArrayList<Integer> suma(ArrayList<Integer> array1,
			ArrayList<Integer> array2) {

		ArrayList<Integer> sol = new ArrayList<Integer>();
		// Return the sum of itself and other polynomial
		if (array1.size() > array2.size()) {

			int auxSizes = (array1.size() - array2.size());
			for (int i = 0; i < auxSizes; i++)

				array2.add(0);
			for (int i = 0; i < array1.size(); i++) {
				sol.add(array1.get(i) + array2.get(i));

			}

		} else if (array1.size() < array2.size()) {
			int auxSizes = (array2.size() - array1.size());
			for (int i = 0; i < auxSizes; i++)
				array1.add(0);
			for (int i = 0; i < array2.size(); i++) {
				sol.add(array2.get(i) + array1.get(i));
			}
		}

		else {
			for (int i = 0; i < array2.size(); i++) {
				sol.add(array2.get(i) + array1.get(i));
			}
		}

		return sol;
	}

	public static ArrayList<Integer> product(ArrayList<Integer> array1,
			ArrayList<Integer> array2) {
		// Return the product of itself and other polynomial

		ArrayList<Integer> sol = new ArrayList<Integer>();
		int aux = (array1.size() + array2.size() - 2);
		for (int i = 0; i <= aux; i++)
			sol.add(0);
		for (int i = 0; i < array1.size(); i++) {
			for (int j = 0; j < array2.size(); j++) {
				sol.set(i + j, (array1.get(i) * array2.get(j)) + sol.get(i + j));
			}
		}
		return sol;
	}

	public static ArrayList<Integer> divide_by(ArrayList<Integer> array1,
			ArrayList<Integer> array2) throws PolynominalTooLongError {
		// Return a tuple with the quotient and remainder

		ArrayList<Integer> sol = new ArrayList<Integer>();
		for (int i = 0; i < array1.size(); i++)
			sol.add(0);
		if (array2.size() > 2)
			throw new PolynominalTooLongError();
		int carry = 0;
		int divisor = -array2.get(0);
		for (int i = array1.size() - 1; i >= 0; i--) {
			sol.set(i, (carry + array1.get(i)));
			carry = sol.get(i) * divisor;
		}

		return sol;

	}

	public static ArrayList<Integer> derivate(ArrayList<Integer> array1) {
		// Return an array with the derivated polynome.
		ArrayList<Integer> sol = new ArrayList<Integer>();
		for (int i = 0; i < array1.size() - 1; i++)
			sol.add(0);

		for (int i = 1, j = 0; i < array1.size(); i++, j++) {
			sol.set(j, (i * array1.get(i)));
		}
		return sol;
	}

	static class PolynominalTooLongError extends Exception {
		// Parameterless Constructor
		public PolynominalTooLongError() {
		}

		// Constructor that accepts a message
		public PolynominalTooLongError(String message) {
			super(message);
		}
	}

}
