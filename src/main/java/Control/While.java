package Control;
import java.lang.String;

/* while문: 조건문이 참인 동안 문장 수행*/

/*
기본문법
while (조건문) {
    <수행할 문장1>;
    <수행할 문장2>;
    <수행할 문장3>;
    ...
}
*/

public class While {
    public static void main(String[] args) {
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit += 1;                                           // treeHit++; 와 동일
            System.out.println("나무를  " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다.");
            }
        }

        // 무한루프
//        while (true) {
//            System.out.println("Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.");
//        }

        // break: while 문 빠져 나가기
        int coffee = 10;
        int money = 300;

        while (money > 0) {
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은 " + coffee + "입니다.");
            if (coffee == 0) {
                System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
                break;
            }
        }

        // continue: while문 조건문으로 돌아가기
        int a = 0;
        while (a < 10) {
            a++;
            if (a % 2 == 0) {
                continue;                   // 짝수인 경우 조건문으로 돌아간다.
            }
            System.out.println(a);          // 1 3 5 7 9
        }
    }
}
