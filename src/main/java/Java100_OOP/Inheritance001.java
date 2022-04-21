// 클래스의 상속을 코드로 구현해보시오.
// 이 문제는 자바 OOP 문법에서 상속에 대한 개념과 그것을 코드로 구현할 수 있는지를 묻는 문제이다.

package Java100_OOP;

class Person_3 {
    // Field(변수)
    int gender;
    int power;

    // Constructor(생성자)
    Person_3() {
        this.gender = 1;		// 1: 남성, 2: 여성
        this.power = 100;	    // 기본파워
    }

    // Method
    void walk() {
        System.out.println( "걸어가고 있어요~" );
    }
}

// Person_3 부모 클래스를 상속받아 Hero 자식 클래스 생성
class Hero extends Person_3 {
    // Field
    String name;
    int age;

    // Constructor
    Hero() {}           // 빈 생성자 생성
    Hero( String name, int age ) {
        super();            // 부모 클래스의 생성자 호출, 생략을 하더라도 컴파일러가 자동으로 호출
        this.name = name;
        this.age = age;
    }

    // Method : 부모 클래스 Method 오버라이딩(!오버로딩과는 다름)
     void walk() {
     System.out.println( "2배로 빨리 걸어가고 있어요~" );
     }

    void eat() {
        System.out.println( "밥먹고 있어요~" );
    }

    void displayPerson() {
        System.out.println( "이름 : " + name  + ", 나이 : " + age + ", 성별 : " + gender + ", 파워 : " + power );
    }
}

class Villain {}

public class Inheritance001 {
    public static void main(String[] args) {

        // 1. 객체 생성
        Person_3 p1 = new Person_3();
        p1.walk();
        // p1.eat();        // Hero에 있는 메소드이므로 에러

        // 2. 상속을 통한 슈퍼맨 객체 생성
        // 1) gender, power 가 먼저 초기값세팅 2)name, age 초기값 세팅
        Hero h1 = new Hero( "슈퍼맨", 20 );
        System.out.println( h1.name );
        System.out.println( h1.age );
        System.out.println( h1.gender );	// 부모 클래스 필드(변수)
        System.out.println( h1.power );	    // 부모 클래스 필드(변수)

        // 메소드 오버라이딩: 부모 클래스에서 상속받았지만 자식자식 클래스에서 오버라이딩
        h1.walk();              //2배로 빨리 걸어가고 있어요~

        // 3. 원더우먼 객체 생성
        Hero h2 = new Hero( "원더우먼", 30);
        h2.displayPerson();
        h2.gender = 2;
        h2.power = 300;
        h2.displayPerson();
        h2.walk();
    }
}
