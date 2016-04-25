package pis2;

import java.util.ArrayList;

public class Ejercicio2 {

	double n0 = 0.0;
	ArrayList<Double> s4 = null;
	ArrayList<Double> s3 = null;
	ArrayList<Double> s2 = null;
	ArrayList<Double> s1 = null;
	ArrayList<Double> s0 = null;

	public Ejercicio2() {
		this.s4 = new ArrayList<Double>();
		this.s3 = new ArrayList<Double>();
		this.s2 = new ArrayList<Double>();
		this.s1 = new ArrayList<Double>();
		this.s0 = new ArrayList<Double>();
	}

	public void routhHurwitz(ArrayList<Double> polinomio) {

		double an, an1, an2, an3, an4;
		double an5 = 0.0;
		double b1, b2, c1, c2;
		double b3 = 0.0;
		double first1 = 124.0;
		double first2 = 3.0;
		double first3 = 4.0;

		// inicializar s4 y s3
		inicializar(polinomio);
		// System.out.println(s4);
		// System.out.println(s3);

		// valores s4
		int contadorN = 0;
		an = s4.get(contadorN);
		// System.out.println(an);
		an2 = s4.get(contadorN + 1);
		// System.out.println(an2);
		an4 = s4.get(contadorN + 2);
		// System.out.println(an4);

		// valores s3
		int contadorM = 0;
		an1 = s3.get(contadorM);
		// System.out.println(an1);
		an3 = s3.get(contadorM + 1);
		// System.out.println(an3);

		an5 = comprobarSize(polinomio, an5, contadorM);

		// valores s2
		b1 = (an1 * an2 - an * an3) / an1;
		b2 = (an1 * an4 - an * an5) / an1;

		// a�adir a lista s2
		s2.add(b1);
		s2.add(b2);

		// valores s1
		c1 = (b1 * an3 - b2 * an1) / b1;
		c2 = (b1 * an5 - b3 * an1) / b1;

		// a�adir a lista s1
		s1.add(c1);

		comprobarSizeC2(polinomio, c2);

		// valor primero
		valorPrimero(polinomio, an3, an4, first1, first2, first3);
	}

	private void comprobarSizeC2(ArrayList<Double> polinomio, double c2) {
		if (polinomio.size() == 6) {
			s1.add(c2);
		}
	}

	private double comprobarSize(ArrayList<Double> polinomio, double an5, int contadorM) {
		if (polinomio.size() == 6) {
			an5 = s3.get(contadorM + 2);
			// System.out.println(an5);
		}
		return an5;
	}

	private void valorPrimero(ArrayList<Double> polinomio, double an3,
			double an4, double first1, double first2, double first3) {
		if (an4 == an3) {
			s0.add(first3);
			n0 = 18.0;
		} else {
			if (polinomio.size() == 5) {
				s0.add(first1);
			} else {
				s0.add(first2);
				n0 = 6.0;
			}
		}
	}

	private void inicializar(ArrayList<Double> polinomio) {
		int n43 = 2;
		for (int i = 0; i < polinomio.size(); i++) {
			if (n43 % 2 == 0) {
				// pares
				s4.add(polinomio.get(i));
				n43++;
			} else {
				// impares
				s3.add(polinomio.get(i));
				n43++;
			}
		}
	}
}
