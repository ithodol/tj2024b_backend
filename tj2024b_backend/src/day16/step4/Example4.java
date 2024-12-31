package day16.step4;

/*
 	질문
	1. 전체적인 코드 흐름
	2. 각 클래스간의 관계
 	3. 어째서 콘솔에 결과물처럼 실행되는지
*/

class Car {
    Tire tire;
    public void run(){  this.tire.roll();    }
}
class Tire {
    public void roll(){
        System.out.println("일반 타이어가 회전합니다.");
    }
}
class HankookTire extends Tire {
    @Override
    public void roll(){
        System.out.println("한국 타이어가 회전합니다.");
    }
}
class KumhoTire extends Tire {
    @Override
    public void roll(){
        System.out.println("금호 타이어가 회전합니다.");
    }
}

public class Example4 {
    public static void main(String[] args) {

        Car myCar = new Car();
        //myCar.run();
        Car yourCar = new Car();
        yourCar.tire = new Tire();
        yourCar.run(); // 일반타이어

        myCar.tire = new Tire();
        myCar.run(); // 일반타이어

        myCar.tire = new HankookTire();
        myCar.run(); // 한국타이어

        myCar.tire = new KumhoTire();
        myCar.run(); // 금호타이어
        yourCar.run(); // 일반타이어

        System.out.println( myCar.tire instanceof  KumhoTire  ); // true
        if( myCar.tire instanceof Tire ){
            myCar.tire = new HankookTire();
        }
        myCar.run(); // 한국타이어
    }
}