import java.lang.String;
import java.util.Arrays;
import java.util.ArrayList;

/* 형변환과 final */
public class Addtion {
    public static void main(String[] args) {

        // 형변환: 문자열을 정수로
        String num1 = "123";
        int n1 = Integer.parseInt(num1);
        System.out.println(n1);             // 123

        // 형변환: 정수를 문자열로
        int n2 = 123;
        String num2 = "" + n2;
        System.out.println(num2);           // 123

        String num3 = String.valueOf(n2);
        String num4 = Integer.toString(n2);
        System.out.println(num3);           // 123
        System.out.println(num4);           // 123


        // 형변환: 소숫점이 포함되어 있는 숫자형태의 문자열
        String num5 = "123.456";
        double d1 = Double.parseDouble(num5);
        System.out.println(d1);              // 123.456

        // 형변환: 정수와 실수 사이의 형 변환
        int n3 = 123;
        double d2 = n3;                      // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
        System.out.println(d2);              // 123.0

        double d3 = 123.456;
        int n4 = (int) d3;                   // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅
        System.out.println(n4);              // 123

        // final: 자료형에 값을 단 한번만 설정할수 있게 강제하는 키워드
        // 리스트의 경우 final로 선언시 리스트에 값을 더하거나(add) 빼는(remove) 것은 가능, 재할당이 불가능

        /*
         final int n5 = 123;
         n5 = 456;                        // 컴파일 에러 발생

         final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
         a = new ArrayList<>(Arrays.asList("c", "d"));    //컴파일 에러 발생

         // 리스트 값 더하기, 빼기도 불가능하게 하고 싶을 때
         final List<String> a = List.of("a", "b");
         a.add("c");                                      // UnsupportedOperationException 발생
         */









    }
}
