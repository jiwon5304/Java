package Control;
import java.lang.String;

/* for문 */

/*
기본문법
for (초기치; 조건문; 증가치) {
    ...
}
 */

public class For {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] marks_1 = {90, 25, 67, 45, 80};
        for(int i=0; i<marks_1.length; i++) {
            if (marks_1[i] >= 60) {
                System.out.println((i+1)+"번 학생은 합격입니다.");
            }
            else {
                System.out.println((i+1)+"번 학생은 불합격입니다.");
            }
        }
        // for 와 continue
        int[] marks_2 = {90, 25, 67, 45, 80};
        for(int i=0; i<marks_2.length; i++) {
            if (marks_2[i] < 60) {
                continue;
            }
            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
        }

        // 이중 for 문
        for(int i=2; i<10; i++) {
            for(int j=1; j<10; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }

    }
}
