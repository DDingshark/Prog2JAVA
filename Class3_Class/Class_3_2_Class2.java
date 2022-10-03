/*
    객체의 생성과 클래스변수
        1.new 연산자로 생성하자 -> Heap메모리에 넣는게 씹이득.
            new 클래스();

        2. 클래스 변수
            new연산자에 의해 리턴된 객체의 주소를 저장하는 변수(참조타입)

                => 변수 = new 클래스();
                   Stack     Heap

      클래스용도.
        1.AIP용 라이브러리 -> 자체적으로 샐행되지 않으나 다른클레스에서 사용할 목적으로 만든 클래스.

        2. 실해용 -> main()메소드를 갖고있는 클래스.
 */

class Student {

}

public class Class_3_2_Class2 {
    public  static  void main(String[] args)
    {
        Student s1 = new Student(); // 클래스 변수의 선언.
        for(int i=0; i<5;i++)
        {
            Student s2 = new Student();
        }

//        s2= s1; // s2는 스택에 저장되어있기에 블록을 나오면 사라짐.
    }
}
