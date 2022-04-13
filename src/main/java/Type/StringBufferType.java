package Type;

import java.lang.String;
/* 5. StringBuffer: 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형 */
// StringBuffer: 멀티 스레드 환경에서 안전
// StringBuilder: 성능우수, 동기화를 고려할 필요가 없는 상황에서 사용

public class StringBufferType {
    public static void main(String[] args) {
        // 객체 한번 생성
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result_2 = sb.toString();
        System.out.println(result_2);

        // 총 4개의 객체 생성
        String result2 = "";
        result2 += "hello";
        result2 += " ";
        result2 += "jump to java";
        System.out.println(result2);

        StringBuffer sb_2 = new StringBuffer();
        sb_2.append("jump to java");
        sb_2.insert(0, "hello ");
        System.out.println(sb_2.toString());

        // Hell
        StringBuffer sb_3 = new StringBuffer();
        sb_3.append("Hello jump to java");
        System.out.println(sb_3.substring(0, 4));
    }
}
