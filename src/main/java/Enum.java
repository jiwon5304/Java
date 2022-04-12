import java.lang.String;

/* 상수집합(Enum): 서로 관련이 있는 여러 개의 상수 집합을 정의할 때 사용하는 자료형 */

/*
사용이유1. 매직넘버(1과 같은 숫자 상수값)를 사용할 때보다 코드가 명확해 진다.
사용이유2. 잘못된 값을 사용함으로 인해 발생할수 있는 위험성이 사라진다.
*/

public class Enum {
    // 상수집합 만들기
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);       // AMERICANO
        System.out.println(CoffeeType.ICE_AMERICANO);   // ICE_AMERICANO
        System.out.println(CoffeeType.CAFE_LATTE);      // CAFE_LATTE

        for (CoffeeType type : CoffeeType.values()) {
            System.out.println(type);                   // AMERICANO // ICE_AMERICANO // CAFE_LATTE
        }
    }
}
