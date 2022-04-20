package Control;
import java.lang.String;

public class Practice_Control {
    public static void main(String[] args) {
        // 1. 아래코드의 출력결과는?
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }

        // 2. while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합 구하기
        int i = 1;
        int result = 0;
        while (i <= 1000) {
            if (i % 3 == 0) {
                result += i;
            }
            i += 1;
        }
        System.out.println(result);

        // 3. while문 혹은 for문을 사용하여 * 찍기를 하여라
        int j;
        int k;
        for(j=1; j<6; j++) {
            for(k=1; k<j+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 4. for 문을 사용해 1부터 100까지 숫자를 출력
        for(int b=1; b<101; b++){
            System.out.println(b);
        }

        // 5. A학급에 총 10명의 점수가 아래와 같을 때 for each 문을 사용해 평균점수를 구하여라
        // int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0;
        for(Integer mark: marks) {
            sum = sum+ mark;
        }
        float average = sum / marks.length;
        System.out.println(average);
    }
}
