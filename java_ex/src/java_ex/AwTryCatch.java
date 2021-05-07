package java_ex;

public class AwTryCatch {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("매개변수의 수가 부족합니다.");
			return;
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환될 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
