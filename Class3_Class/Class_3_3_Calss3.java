/*
    클래스의 구성 맴버.
        1. 필드. -> 맴버변수
        2. 생성자. -> 초기화 그거 맞음 ㅇㅇ
        3. 메소드. -> 그거맞음..

 */

class Exam{

    int nData;

    Exam()
    {
        System.out.println("클래스 생성");
    }

    void GetData(int n)
    {
       nData =n;
    }
}

public class CLass_3_3_Calss3 {
    public static void main(String[] args) {
        Exam Exam1 = new Exam();
        Exam1.GetData(10);
        System.out.print(Exam1.nData);

    }
}
