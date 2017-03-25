public class RationalNumber {

	int numerator;
	int denominator;

	RationalNumber(){
		numerator = 0;
		denominator = 1;
	}

	RationalNumber(int n, int m){
		numerator = n;
		denominator = m;
	}

	double normalize(int n, int d){
		if (n != 0)
			double normal = n / d;
		return normal;
	}
}