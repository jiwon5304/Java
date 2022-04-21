// 추상 클래스와 추상 메서드란 무엇인지 설명하고 관련된 예제 코드를 구현해보시오.
// 이 문제는 자바의 추상 클래스, 추상 메서드의 개념과 역할에 대해서 알고 있는지를 묻는 문제이다.

package Java100_OOP;

abstract class Animal {
    // 구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언: 리턴값 조차도 없이 메서드명만 선언.
    abstract void cry();

    void eat() {
        System.out.println("먹다.");           // 일반 메소드도 포함할 수 있다.
    }
}

class Dog extends Animal {
    void cry() { System.out.println( "멍멍~" ); }
}

class Cat extends Animal {
    void cry() { System.out.println( "야옹야옹~" ); }
}

class Cow extends Animal {
    void cry() { System.out.println( "음메~" ); }
}

class Animal2 {
    void fly() { System.out.println( "날다." ); }
}

public class AbstractClass001 {
    public static void main(String[] args) {

        // 1. 추상 클래스는 구체적인 내용이 없기 때문에 객체를 생성할 수 없다.
        // Animal dog = new Animal();  			// 에러: 추상클래스로는 객체를 생성할 수 없기 때문에
        Animal2 dragonfly = new Animal2();
        dragonfly.fly();

        // 2. 추상 클래스 사용은? 추상(부모) 클래스를 상속받은 자식 클래스에서 해당 메서드를 오버라이딩하여 재정의한 후 사용한다.
        Dog dog = new Dog();
        dog.cry();  //--- 멍멍~

        Cat cat = new Cat();
        cat.cry();  //--- 야옹야옹~

        Cow cow = new Cow();
        cow.cry();  //--- 음메~

    }
}