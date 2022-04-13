package Type;

public class Boolean {
    public static void main(Char[] args) {
        /* 2. 불(Boolean) */
        System.out.println(2 > 1);                // 참
        System.out.println(1 == 2);               // 거짓
        System.out.println(3 % 2 == 1);           // 참
        System.out.println("3".equals("2"));      // 거짓

        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if (isTall) {
            System.out.println("키가 큽니다.");
        }
    }
}
