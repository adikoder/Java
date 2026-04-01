
public class DataTypes {

	public static void main(String[] args) {
		// Numeric DT - short,byte, int, long
		byte num1 = 127;
		System.out.println(num1);
		
		short num2 = 32767;
		System.out.println(num2);
		
		int num3 = 50000;
		System.out.println(num3);
		
		long num4 = 329421370;
		System.out.println(num4);
		
		//floating DTs
		
		float num5 = 3.14f; // 6 decimal digits precision
		System.out.println(num5);
		
		double num6 = 3.29421370; // 15 decimal digits precision
		System.out.println(num6);
		
		// Other - char Boolean
		
		boolean eligibleToVote = true; // 1 or 0 int cannot be converted to boolean
		System.out.println(eligibleToVote );
		
		char firstCharacter = 'a';
		System.out.println("My first character is : " + firstCharacter);
		
		System.out.println("My first character is : " + (char)(firstCharacter+2));
		
		
		
		
		// DataType Implicit or Explicit Conversion (TypeCasting)
		

		// Implicit conversion 
		
		byte num7 = 127;
		
		long newNum = num7;
		System.out.println("New Num: " + newNum);
		
		// Explicit Conversion (TypeCasting)
		
		long value1 = 123456789; // The literal 12345678999 of type int is out of range 
		int value2 = (int)value1;
		System.out.println(value2);
		
	}

}
