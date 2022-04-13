package Type;

import java.lang.String;
import java.util.HashMap;

/* 맵(Map):  대응관계를 쉽게 표현할 수 있게 해 주는 자료형, 순서에 의존하지 않고 key로 value를 가져옴 */

/*
순서대로 데이터 가져오고 싶을 때
1. LinkedHashMap은 입력된 순서대로 데이터를 저장
2. TreeMap은 입력된 key의 오름차순 순서로 데이터를 저장
*/

public class Map {
    public static void main(String[] args) {
        // put: 항목 입력
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");

        // get: key에 해당하는 value 값
//        System.out.println(map.get("people"));                                // 사람
//        System.out.println(map.get("java"));                                  // null
//        System.out.println(map.getOrDefault("java", "자바"));  // 자바
//
//        // containsKey: 맵(Map)에 해당 키(key)가 있는지를 조사하여 그 결과값을 리턴
//        System.out.println(map.containsKey("people")); // true
//
//        // remove: key값에 해당되는 아이템(key, value)을 삭제한 후 그 value 값을 리턴
//        System.out.println(map.remove("people"));  // 사람
//        System.out.println(map);                        // {baseball=야구}
//
//        // size: map의 갯수
//        System.out.println(map.size());  // 1
//
//        // KeySet:  모든 Key를 모아서 리턴
//        HashMap<Char, Char> map_2 = new HashMap<>();
//        map_2.put("people", "사람");
//        map_2.put("baseball", "야구");
//        System.out.println(map_2.keySet());  // [baseball, people]
    }
}

