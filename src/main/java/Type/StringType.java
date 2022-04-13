package Type;

import java.lang.String;
import java.util.Arrays;

public class StringType {
    public static void main(String[] args) {
        String a = "Happy Java";                     // 추천! 리터널 표기법, 문자열을 intern pool에 저장 후 cache 된 문자열 리턴
        String b = new String("Happy Java");           // 항상 새로운 String 객체 생성

        System.out.println(a);  // Happy Java
        System.out.println(b);  // Happy Java

        // 내장 메소드
        // 1) equals: 문자열의 값 비교 & ==: 두개가 동일한 객체인지 비교
        System.out.println(a.equals(b));        // true
        System.out.println(a == b);             // false

        // 2) indexOf: 특정문자가 시작되는 위치
        System.out.println(a.indexOf("Java")); // 6

        // 3) contains: 특정 문자열이 포함되어 있는지의 여부
        System.out.println(a.contains("Java")); // true

        // 4) charAt: 특정위치의 문자 리턴
        System.out.println(a.charAt(6));        // J

        // 5) replaceAll: 특정 문자열을 다른 문자열로 변경
        System.out.println(a.replaceAll("Java", "World")); // Happy World

        // 6) substring(시작위치, 끝위치+1): 문자열 중 특정 부분을 뽑아낼 경우에 사용
        System.out.println(a.substring(0,4));           // Happ, index 0~3까지

        // 7) toUpperCase: 문자열을 모두 대문자로 변경
        System.out.println(a.toUpperCase());            // HAPPY JAVA

        // 8) split: 특정 구분자로 문자열 분리
        String c = "a:b:c:d";
        String[] result = c.split(":");
        System.out.println(Arrays.toString(result));

        /* 문자열 포매팅: 문자열 안에 어떤 값을 삽입하는 방법 */
        // 1) 숫자 대입
        System.out.println(String.format("I eat %d apples.", 3));  // I eat 3 apples.

        // 2) 문자열 대임
        System.out.println(String.format("I eat %s apples.", "five"));  // I eat five apples.

        // 3) 숫자를 나타내는 변수로 대입
        int number = 3;
        System.out.println(String.format("I eat %d apples.", number));  // I eat 3 apples.

        // 4) 2개 이상의 값 넣기
        String day = "three";

        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
        // I ate 3 apples. so I was sick for three days.

        // 포매팅 연산자 %d와 %를 같이 쓸 때는 %% 사용
        System.out.println(String.format("Error is %d%%.", 98));  // Error is 98%.

        // 정렬과 공백
        System.out.println(String.format("%10s", "hi"));  // ********hi
        System.out.println(String.format("%-10sjane.", "hi"));  // hi********jane
        System.out.println(String.format("%.4f", 3.42134234));  // 3.4213
        System.out.println(String.format("%10.4f", 3.42134234));  // ****3.4213


    }


}
