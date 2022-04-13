package Type;

import java.lang.String;
import java.util.Arrays;
import java.util.HashSet;
/* 7. 집합(Set): 중복을 허락하지 않는 집합 자료형, 순서가 없음 */

public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);            // [e, H, l, o]


        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        // 교집합수행
        HashSet<Integer> intersection = new HashSet<>(s1);  // HashSet 객체를 복사하여 intersection 생성: s1 자체가 변경되는 것을 막기위해
        intersection.retainAll(s2);                         // 교집합 수행
        System.out.println(intersection);                   // [4, 5, 6]

        // 합집합수행
        HashSet<Integer> union = new HashSet<>(s1);         // s1으로 union 생성
        union.addAll(s2);                                   // 합집합 수행
        System.out.println(union);                          // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // 차집합수행
        HashSet<Integer> substract = new HashSet<>(s1);     // s1으로 substract 생성
        substract.removeAll(s2);                            // 차집합 수행
        System.out.println(substract);                      // [1, 2, 3]

        // 값 추가
        HashSet<String> set2 = new HashSet<>();
        set2.add("Jump");
        set2.add("To");
        set2.add("Java");
        System.out.println(set2);                           // [Java, To, Jump]

        // 값 여러개 추가하기
        HashSet<String> set3 = new HashSet<>();
        set3.add("Jump");
        set3.addAll(Arrays.asList("To", "Java"));
        System.out.println(set3);                           // [Java, To, Jump]

        // 특정 값 제거
        HashSet<String> set4 = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set4.remove("To");
        System.out.println(set4);                           // [Java, Jump]


    }
}
