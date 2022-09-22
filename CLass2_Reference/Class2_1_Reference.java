
/*
 * 2-1 데이터 타입 분류 
 * 
 * 		데이터 타입의 분류 
 * 			원시타입(=기본타입)(primitive_type) : 정수타입(byte char, short, int, long), 실수타입(float, double), 논리타입(bollean)
 * 
 *  		참조타입(reference_type) : Array, Union, class, interface..
 *  		
 *  		실제 '실체' 를 저장한다- > 원시타입
 *  		(메모리)주소가 적힌 종이를 저장한다 -> 참조타입 
 * 
 */

class Data_Type {
	//기본타입 변수
	int age = 20;
	double price = 100.5;
	
	//참조타입 변수
	String name = "띵상어";
	String hobby = "Coding";
	
}


/*
 *  2-2 메모리 사용 영역
 *  	java.exe 로 JVM이 시작되면 JVM은 운영체제에 할당받은 메모리 영역을 세부영역으로 구분하여 사용한다.
 * 
 *  RunTime_Data_Area
 *  	- Method Area : Class 식구들( 필드, 데이터, 메소드, 상수풀 생성자.. 들이 있는 영역 
 *  	- JVN(Stack) : JVM 스택 영역은 각 스레드마다 하나씩 존재하며, 스래드가 시작할때 할당 ( 기본 디폴트 = main 하나)
 *  	- Heap Area : 스택과 힙영역은 그거 맞음 ㅇㅇ
 * 
 */

class Runtime_Data_Area {
	
	char v1 = 'a';
	 // 스택영역에 저장 댐 ㅇㅇ
	
	if(v1=='a')
	{
		int v1 =100; // 스택 ->if문 탈출시 자동삭제
		double v4 = 3.14; //스택 -> if문 탈출시 자동 삭제 
	}
	
	
	boolean v4 = true; //스택
	
	int[] score = {10,20,30};
	// 스택 영역 :[score \ 힙메모리 주소]
	// 힙 영역  : 그 주소 ->[10, 20 ,30] ...
	
}

/*
 * 2-3 참조 변수의 논리연산 ( ==, !=)
 * 		
 * 		기본타입의 변수들은 '값'의 해석이 같은지, 아닌지를 조사하지만,,
 * 
 * 		참조타입의 변수들은 동일한 객체를 참조하는지 알아볼때 사용한다.
 */ 


class reference_value_operator {
	
	int[] refVar1 = {10,20,30,40}; //객체1 초기화
	int[] refVar2 = refVar1; //같은 객체를 참조;
	
	int[] refVar3 = {10,20,30}; //객체2 초기화
	
	if(refVar1==refVar2) // True;
	if(refVar!=refVar2)//False;
	if(refVat1 == refVar3) //False
	
}







