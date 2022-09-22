/*
 * 		커맨드 라인 입력.
 * 			프로그램을 실행하기위해 amin 메소드가 필요한건ok 근대 main(String[] arg)이건 뭐냐..?
 * 
 * 		java 클래스 로 프로그램을 실행하면, JVM은 길이가 0인 String 배열을 먼저 생성하고 main() 메소드를 호출할때 매게 값으로 전달한다.
 * 			
 * 		만약 다음과 같이 java 클래스 뒤에 공백으로 구분된 문자열 목록을 주고 실행하면, 문자열 목록으로 구성된 String[] 배열이 생성되고 main() 메소드르 호출할떄 전달 
 * 
 */

// java 클래스명 String[] args = { };

// 만약 
// java 클래스명 문자열1, 문자열2,,, 이라고 생성을 하면 
//		String[] args = {문자열1, 문자열2...}
//			main(String[] args) 에 파라미터로 전달 -> 변수를 얻을수 있음.
//				{
//					args[0], arg[1] 로 참조 가능. 			
//				}
//
// run 버튼을 누르면 java 클래스명 하고 실행한다는 의미 
//
//		
//

public class CommandLine{
	public static void main(String[] args)
	{
		System.out.println("배열의 길이 : "+ args.length);
		
	}

}
