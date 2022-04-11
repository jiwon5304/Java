import java.lang.String;
/* 6. 배열(Array): 자료형의 종류가 아닌 자료형의 집합을 의미, 들어가는 갯수가 정해져있음 */

public class Array {
    public static void main(String[] args) {
        String[] weeks_1 = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(weeks_1);

        String[] weeks_2 = new String[7];
        weeks_2[0] = "월";
        weeks_2[1] = "화";
        weeks_2[2] = "수";
        weeks_2[3] = "목";
        weeks_2[4] = "금";
        weeks_2[5] = "토";
        weeks_2[6] = "일";
        System.out.println(weeks_2);

        // 배열의 길이 구하기
        String[] weeks_3 = {"월", "화", "수", "목", "금", "토", "일"};
        for (int i = 0; i < weeks_3.length; i++) {
            System.out.println(weeks_3[i]);
        }
    }
}
