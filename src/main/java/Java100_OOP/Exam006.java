// 객체 생성시 초깃값을 생성자 메서드에서 설정하는 클래스를 구현해보시오.
// 이 문제는 클래스의 인스턴스 생성시 생성자를 통해서 초기화하는 것을 알고 있는지 묻는 문제이다.

package Java100_OOP;

class Person_2 {

    // 1. 속성(Attribute)
    int age;			// 나이
    String name;		// 이름

    // 2. 생성자(Constructor): 오버로딩이 가능하다 -> 여러개의 생성자를 만들 수 있음.
    Person_2() {}             // 받는 인자값X
    Person_2( int age, String name ) {
        this.age = age;     // this: 생성자 자기 자신 (self)
        this.name = name;
    }                       // 받는 인자값 O, 반환값 X

    // [3] : 메서드(Method)
    void printPerson_2() {
        System.out.println( "나이 : " + age + ", 이름 : " + name );
    }

}

public class Exam006 {
    public static void main(String[] args) {

        // 1. 객체 생성
        Person_2 p1 = new Person_2( 20, "홍길동" );
//         System.out.println( p1 );
//         System.out.println( p1.age );  		// 20
//         System.out.println( p1.name );   	// 홍길동
        p1.printPerson_2();

        Person_2 p2 = new Person_2( 30, "이순신" );
        p2.printPerson_2();

        Person_2 p3 = new Person_2( 40, "을지문덕" );
        p3.printPerson_2();

    }
}