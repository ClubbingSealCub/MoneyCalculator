package model;

/**
 * Fraction methods for adding, subtracting, multiplying, and dividing rational
 * number also will have to compute greatest common denominator for use with the
 * add/subtract feature and can reduce the numbers after the appropriate
 * operations have been completed. version 1.3
 */
public class Fraction {
	private final int num;
	private final int den;

	public Fraction(int n, int d) {
		if (d == 0) {
			throw new IllegalArgumentException("Denominator cannot be zero.");
		} else if (d < 0) {
			num = -n;
			den = -d;
		} else {
			num = n;
			den = d;
		}
	}

	public Fraction add(Fraction b) {
		int numerator = (num * b.den) + (b.num * den);
		return reduce(numerator, den * b.den);
	}

	private Fraction reduce(int n, int d) {
		int gcd = gcd(n, d);
		return new Fraction(n / gcd, d / gcd);
	}

	private static int gcd(int x, int y) {
		return (x == 0) ? y : gcd(y, x % y);
	}

	public Fraction subtract(Fraction b) {
		return add(b.negative());
	}

	public Fraction negative() {
		return new Fraction(-num, den);
	}

	public Fraction multiply(Fraction b) {
		return reduce(num * b.num, den * b.den);
	}

	public Fraction divide(Fraction b) {
		return multiply(b.reciprocal());
	}

	public Fraction reciprocal() {
		return new Fraction(den, num);
	}

	@Override
	public String toString() {
		if (num > den && den > 1) {
			return (num + "/" + den + " or " + (num / den) + " " + (num % den) + "/" + den);
		} else {
			return (num + "/" + den);
		}
	}
}

