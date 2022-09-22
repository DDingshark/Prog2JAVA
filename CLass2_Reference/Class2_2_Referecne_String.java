/*
 * 
 * String 변수 
 * 
 * 	String name; 선언 
 *  name = " String"; 초기화
 * 
 * 	String name = " String"; 선언과 동시에 초기화
 * 
 */


class String_Creation {
	
	String name;
	name  = "문자열";
	
	String name_2 = "문자열"; // 참조변수의 주소를 따라가서 같은 값을 가지면( = 같은 문자열 리터럴을 가지면) 주소도 같음
	
	String name_Heap = new String("String");
	String name_Heap2= new String("String"); // 이렇게 new연산자로 생성할시에는 주소가 각각 다름
		// => 아마 new연산자 자체가 빈 공간을 할당시키는 기능을 내포하고 있어서 그런듯.
	
	
	if(name == name_2); // True
	if(name = name_Heap); // False;
	if(name == name_Heap2); // False
	
	
	boolean result = name.equals(name_2); // 문자열을 비교 ( 참조된것의 값을 비교);
	

}


//example
public class Class2_Reference_String {
	public static void main(String[] args) {
		String strVar = "띵주";
		String strVar2 = "띵주";
		
		if(strVar == strVar2)
		{
			System.out.println("Str 과 Str2는참조가 같음 = 같은 곳을 가리킴");
		}
		
		else
		{
			System.out.println("str 과 Str2는 참조가 다름  = 다른곳을 가리킴 ");
		}
		
	
		String strVar3 = new String("띵주");
		String strVar4 = new String("띵주");
		
		if(strVar3 == strVar4)
		{
			System.out.println("strVar3 과 strVar4는참조가 같음 ");
		}
		else
		{
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4))
		{
			System.out.println("strVar3 과 strVar4는 문자열이 같음");
		}
	}
}
