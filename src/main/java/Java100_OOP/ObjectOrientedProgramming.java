package Java100_OOP;
import  java.lang.String;

class Calculator {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }
}
class Number{
    static int num = 0;     //클래스 필드: 정적(static) 변수는 하나의 저장공간을 공유
    int num2 = 0;           //인스턴스 필드: 인스턴스가 생성될 때마다 새로 생성
}


public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // 만약 여러대의 계산기가 필요하다면?
        Calculator cal1 = new Calculator();             // 계산기1 객체 생성
        Calculator cal2 = new Calculator();             // 계산기2 객체 생성

        System.out.println(cal1.add(3));                // 3
        System.out.println(cal1.add(4));                // 7

        System.out.println(cal2.add(5));                // 5
        System.out.println(cal2.add(8));                // 13

        Number number1 = new Number();                  //첫번째 number
        Number number2 = new Number();                  //두번쨰 number

        number1.num++;
        number1.num2++;
        System.out.println(number1.num);                // 1
        System.out.println(number1.num2);               // 1

        System.out.println(number2.num);                // 1
        System.out.println(number2.num2);               // 0
    }
}
