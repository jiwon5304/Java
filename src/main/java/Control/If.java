package Control;
import java.lang.String;
import java.util.ArrayList;

/* 조건문 if문 */

/* 기본문법:

if (조건문) {
    <수행할 문장1>
    <수행할 문장2>
    ...
}else if (조건문) {
    <수행할 문장1>
    <수행할 문장2>
    ...
}else if (조건문) {
    <수행할 문장1>
    <수행할 문장2>
    ...
...
} else {
   <수행할 문장1>
   <수행할 문장2>
   ...
}
*/

public class If {
    public static void main(String[] args) {
        int money = 2000;

        if (money >= 3000) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");     // 걸어가라
        }

        // 비교연산자
        int x = 3;
        int y = 2;
        System.out.println(x > y);              // true

        // and(&&): 모두 참
        // or(||): 둘 중 적어도 하나 참
        // not(!)
        int money2 = 2000;
        boolean hasCard = true;

        if (money2>=3000 || hasCard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }                                       // 택시를 타고 가라: hasCard가 true이기 때문에

        // contains: 포함
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("money");

        System.out.println(pocket);             // [paper, handphone, money]
        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");         // 택시를 타고 가라"
        }

        // else if: 다중 조건 판단
        boolean hasCard2 = true;
        ArrayList<String> pocket2 = new ArrayList<String>();
        pocket2.add("paper");
        pocket2.add("handphone");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        }else if(hasCard) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        }

    }
}
