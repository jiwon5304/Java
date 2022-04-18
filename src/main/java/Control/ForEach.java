package Control;
import java.lang.String;
import java.util.Arrays;
import java.util.ArrayList;

/* for each문 : 반복회수를 명시적으로 주는 것이 불가능, 1스탭씩 순차적으로 반복될때만 사용 가능 */

/*
기본문법

for (type var: iterate) {
    body-of-loop
}
*/

public class ForEach {
    public static void main(String[] args) {
        String[] numbers_1 = {"one", "two", "three"};
        for(String number: numbers_1) {
            System.out.println(number);
        }
        ArrayList<String> numbers_2 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String number : numbers_2) {
            System.out.println(number);
        }
    }
}
