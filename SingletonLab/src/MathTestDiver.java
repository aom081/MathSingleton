
public class MathTestDiver {

	public static void main(String[] args) {
		 MathSingleton m1 = MathSingleton.getInstance();
		System.out.println("316 +13 = "+m1.add(316,13));
		
		 MathSingleton m2 =  MathSingleton.getInstance();
		 System.out.println(m1.equals(m2));
	}

}
