package Java100_OOP;
import  java.lang.String;

class Calculator {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}
public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // 만약 여러대의 계산기가 필요하다면?
        Calculator cal1 = new Calculator(); // 계산기1 객체 생성
        Calculator cal2 = new Calculator(); // 계산기2 객체 생성

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(5));
        System.out.println(cal2.add(8));
    }
}
