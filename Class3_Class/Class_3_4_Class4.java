/*
    필드 :
        객체고유의 데이터.
        객체가 가져야할 부품객체.
        객체의 현재 상태 데이터.
*/
class Body{

}
class Engine{

}

class Tire{

}


class MakeCar {
    //자동차 만들깅.
    MakeCar(){
        System.out.println("클래스 생성");
    }
    //고유의 데이터
    String company;
    String model = "그랜다이저"; //선언과 동시 초기화 가능.
    String color;
    int max_speed;

    //상태 데이터.
    int speed;
    int rpm;

    //객체가 가져야할 부품객체;
    Body body;
    Engine engine;
    Tire tire;

    
    //메소드들
    void GetData(String company_1,String model_1, String coror_1)
    {
        company = company_1;
        model = model_1;
        color = coror_1;

    }
    void PrintData()
    {
        System.out.println(company);
        System.out.println(model);
        System.out.println(color);
    }
}
//필드 선언.
//  타입 필드 = [init]
//
//필드 사용
//  객체 내부 => 이름으로 바로접근
//  객체 외부 => 변수.필드이름
//

public class Class_4_4_Class4{
    public static  void main(String[] args)
    {
        MakeCar myCar = new MakeCar();
        myCar.GetData("현대","소나타","검정");
        myCar.PrintData();
    }
}
