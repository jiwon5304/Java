package Java100;

public class Method_1 {

    public static void showMenu() {
        System.out.println("showMenu() 메소드가 호출되었습니다");
    }

    public static void plusMethod(int a,int b) {
        System.out.printf("인자로 넘겨받은 2개의 값은 %d과 %d입니다.%n",a,b);

        // 연산
        int rst=a + b;
        System.out.println("두 수를 더한 값은 = " + rst);
    }

    public static int returnMethod() {
        int ret=100;
        ret *= 100;
        return ret;
    }

    public static String capitalMethod(String str) {
        String ret = str.toUpperCase();
        return ret;
    }

    public static void main(String[] args) {

        // 1. 반환값 X, 받는 인자값 X
        showMenu();

        // 2. 반환값 X, 받는 인자값 2개있는 덧셈 메소드 구현
        // 메소드가 받는 인자값이 있다는 것: 호출부에서 파라미터 값을 넘긴다는
        int a =100,b=200;
        plusMethod(a,b);

        // 3. 반환값 O, 받는 인자값 X
        // 반환값이 있다는 것은 메소드(함수) 호출에 따른 리턴값이 있는 것이므로 호출 시 리턴값을 받을 변수 정의
        int rst_1;
        rst_1 = returnMethod();

        System.out.println("메소드 호출에 따른 리턴된 값은 = " +rst_1);

        // 4. 반환값 O, 받는 인자값 O
        // 반환값이 있다는 것은 메소드(함수) 호출에 따른 리턴값이 있는 것이므로 호출시 리턴값을 받는 변수를 정의
        String rst_2;
        rst_2 = capitalMethod("korea");

        System.out.println("입력한 소문자의 대문자는 = " + rst_2);


    }
}
