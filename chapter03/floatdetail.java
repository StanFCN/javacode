public class floatdetail{
	public static void main(String[] args){
		float num2 = 1.1F;
		double num1 = 1.1;
		double num3 = 1.1f;

		double num5 = .123;	// 0.123
		double num6 = 5.12e2;
		double num7 = 5.12e-2;

		System.out.println(num6);
		System.out.println(num7);

		double num9 = 2.123456789;
		float num10 = 2.123456789f;
		System.out.println(num9);
		System.out.println(num10);


		double num11 = 2.7;
		double num12 = 8.1 / 3;	//2.699999999997
		if (num11 == num12){
			System.out.println("yes!");
		}else{
			System.out.println("no!");
		}

		System.out.println(Math.abs(num11 - num12));

	}
}