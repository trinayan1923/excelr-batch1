package core_java;
class SumOftwoDigits {
	public static int getSumOftwoDigits(int n){
		int a = n / 10;
		int b = n % 10;
		int sum = a + b;
		return sum;
	}
}

public class Demo017 {
    public static void main(String[] args) {
        SumOftwoDigits obj = new SumOftwoDigits();
		int n = 78;
		int sum = obj.getSumOftwoDigits(n);
		System.out.println("The sum of two digits is : "+sum);
	}
}

