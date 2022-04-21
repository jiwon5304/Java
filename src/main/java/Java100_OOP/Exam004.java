// 클래스에서 생성자란 무엇이고 어떤 특징을 갖고 있는지 말해보시오.
// 이 문제는 클래서에서 생성자의 개념과 역할, 특징 등에 대해서 알고 있는지를 묻는 문제이다.

package Java100_OOP;

class Person {

    // 1. 속성(Attribute)
    int age;
    String name;

    // 2. 생성자(Constructor)
    //  class 이름과 동일한 생성자, 객체가 생성될 때 자동으로 호출되는 반환값도 가지고 있지 않은 메소드
    Person() {  }

    // 3. 메서드(Method)
    // 자동으로 호출되는 메소드가 아님
    void move() {
        System.out.println( "Person is moving." );
    }

}

public class Exam004 {

}