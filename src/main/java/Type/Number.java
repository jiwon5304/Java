package Type;

/* 1. 숫자(Number) */
public class Number {
    public static void main(Char[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a+b);    // 15
        System.out.println(a-b);    // 5
        System.out.println(a*b);    // 50
        System.out.println(a/b);    // 2

        float c = 7;
        float d = 3;
        System.out.println(c%d);    // 1.0
        System.out.println(c/d);    // 2.3333

        int i = 0;
        int j = 10;
        System.out.println(i++);      // 0: 값이 참조된 후 증가
        System.out.println(i);        // 1
        System.out.println(++j);      // 11: 값이 증가 후 출력
    }
}

