package java_ex;

public class AiEnumMethodExample {
	
	public static void main(String[] args) {
		// name()
		AhEnumTypeWeek a = AhEnumTypeWeek.A;
		String name = a.name();
		System.out.println(name);
		System.out.println();
		
		//ordinal()
		int ordinal = a.ordinal();
		System.out.println(ordinal);
		System.out.println();
		
		//compare
		AhEnumTypeWeek eTypeOne = AhEnumTypeWeek.B;
		AhEnumTypeWeek eTypeTwo = AhEnumTypeWeek.D;
		int result1 = eTypeOne.compareTo(eTypeTwo);
		int result2 = eTypeTwo.compareTo(eTypeOne);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println();
		
		//valueOf()
		String testStr = "C";
		AhEnumTypeWeek testEnum = AhEnumTypeWeek.valueOf(testStr);
		System.out.println(testEnum.name());
		System.out.println();
		
		AhEnumTypeWeek[] enums = AhEnumTypeWeek.values();
		for(AhEnumTypeWeek e : enums) {
			System.out.println(e);
		}
	}
}
