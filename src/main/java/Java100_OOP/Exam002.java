// FarmMachine의 속성과 동작들을 가지는 클래스를 코드로 구현하고 객체를 생성하여 동작시켜보시오.
// 이 문제는 어떤 사물에 대한 클래스를 실제 코드로 구현할 수 있는지를 묻는 문제이다.

package Java100_OOP;

// 클래스 만들기
// 객체의 특징: 속성(attribute)
// 객체의 동작: 메서드(method)

class FarmMachine {

    // 1. 변수선언: 속성(특징)
    int price;			// 가격
    int year;			// 연식
    String color;		// 색상

    // 2. 메소드(동작/기능/행동) 생성: 기계 마다 동작이 다양할 것이므로 처음에는 공통적인 동작
    // move 라는 메소드를 만들었고, 반환되는 타입은 없어서 void
    void move() {
        System.out.println( "Farm-machine is moving." );
    }

    void dig() {
        System.out.println( "Farm-machine is digging." );
    }

    void grind() {
        System.out.println( "Farm-machine is grinding." );
    }

}

public class Exam002 {
    public static void main(String[] args) {

        // 1. 객체 생성
        FarmMachine fm = new FarmMachine(); // new는 객체를 생성해서 그 주소값까지 반환
        System.out.println( fm );

        // 2.  생성된 객체에 속성 값 입력하기
        fm.price = 1000000;                 // class객체.속성값
        fm.year = 2020;
        fm.color = "red";

        // 3. 출력하기
        System.out.println( fm.price );
        System.out.println( fm.year );
        System.out.println( fm.color );

        // [4] : 동작 수행하기
        fm.move();
        fm.dig();
        fm.grind();

    }
}
