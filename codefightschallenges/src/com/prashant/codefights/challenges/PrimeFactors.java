package com.prashant.codefights.challenges;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeFactors pf = new PrimeFactors();
		System.out.println(pf.primefactors(1000000));
	}

	public String primefactors(int n) {
		String factors = "";

		for (int i = 2; i <= n / 2; i++) {
			if (isPrime(i)) {
				while (n % i == 0) {
					n /= i;
					if (isPrime(n) && n != 1) {
						factors = factors + Integer.valueOf(i).toString() + "*"
								+ Integer.valueOf(n).toString();
						break;
					} else if (n == 1)
						factors = factors + Integer.valueOf(i).toString();
					else
						factors = factors + Integer.valueOf(i).toString() + "*";

				}
			}
		}
		return factors;
	}

	public boolean isPrime(int n) {
		boolean prime = true;
		if (n == 1)
			return false;
		else if (n % 2 == 0 && n!=2)
			return false;
		else if (n % 3 == 0 && n!=3)
			return false;
		
		else {

			for (int j = 2; j < n / 2; j++) {
				if (n % j == 0) {
					return false;
				}
			}
		}
		return prime;
	}
}
