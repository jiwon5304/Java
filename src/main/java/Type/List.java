package Type;

import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* 7. 리스트(List): 크키가 정해져 있지 않아 원하는 만큼의 값을 담을 수 있음 */
public class List {
    public static void main(String[] args) {
        //ArrayList<String> pitches = new ArrayList<>();  // 제네릭스: 객체를 포함하는 자료형도 어떤 객체를 초함하는지 명확하게 표현할 것을 권고
        ArrayList pitches_1 = new ArrayList();

        // to do: add에서 인덱스 넣어주려면 순서 지켜줘야하나?
        pitches_1.add(0,"138");
        pitches_1.add(1,"129");
        pitches_1.add(2,"142");

        System.out.println(pitches_1);
        System.out.println(pitches_1.get(1));             // 특정인덱스
        System.out.println(pitches_1.size());             // 갯수
        System.out.println(pitches_1.contains("142"));    // 포함여부
        System.out.println(pitches_1.remove("129"));   // true: 삭제한 결과를 반환
        System.out.println(pitches_1.remove(0));    // 삭제하고 삭제된 항목 리턴

        // 이미 데이터가 존재할 경우 편하게 ArrayList 생성
        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches_2 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches_2);  // [138, 129, 142] 출력

        // String 배열 대신 String 자료형을 여러개 전달하여 생성
        ArrayList<String> pitches_3 = new ArrayList<>(Arrays.asList("138", "129", "140"));
        System.out.println(pitches_3);

        // String.join: [138, 129, 142] --> 138,129,142
        // String[] pitches = new String[]{"138", "129", "142"}; // 문자열에도 사용 가능
        ArrayList<String> pitches_4 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = String.join(",", pitches_4);
        System.out.println(result);  // 138,129,142 출력

        // 리스트 정렬
        ArrayList<String> pitches_5 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches_5.sort(Comparator.naturalOrder());  // [129, 138, 142]: 오름차순으로 정렬
        pitches_5.sort(Comparator.reverseOrder());  // [142, 138, 129]: 내림차순으로 정렬
        System.out.println(pitches_5);
    }
}
