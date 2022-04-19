package Type;
import java.lang.String;
import java.util.*;


public class Practice_Type {

    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);

        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args) {
        // 1. 홍길동씨 평균점수
        int a = 80;
        int b = 75;
        int c = 55;
        System.out.println((a+b+c)/3);

        // 2. 13은 짝수? 홀수?
        if (13 % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        // 3. 주민번호 연원일 - 숫자로 나누어 출력
        String d = "881120-1068234";
        System.out.println(d.substring(0,6));
        System.out.println(d.substring(7));  // d.substring(7,14) 도 가능

        // 4. 주민번호 뒷자리의 성별을 나타내는 숫자 출력
        String pin = "881120-1068234";
        System.out.println(pin.charAt(7));

        // 5. a:b:c:d 를 a#b#c#d로 출력
        String e = "a:b:c:d";
        System.out.println(e.replaceAll(":", "#"));

        // 6. [1,3,5,4,2] 를 [5,4,3,2,1]로
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);

        // 7. ['Life', 'is', 'too', 'short']를 "Life is too short" 문자열로
        ArrayList<String> myList_2 = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList_2);
        System.out.println(result);

        // 8. 맵 grade에서 "B"에 해당되는 값 추출
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        System.out.println(grade.remove("B"));

        // 9. numbers 리스트에서 중복 숫자를 제거
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> numbers_1 = new HashSet<>(numbers);
        System.out.println(numbers_1);

        // 10. 커피의 가격을 알려주는 프로그램을 만들어보자
        printCoffeePrice(CoffeeType.AMERICANO);  // "가격은 3000원 입니다." 출력
    }
}
