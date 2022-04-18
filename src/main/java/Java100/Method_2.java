// static 선언이 안되어있는 메서드를 사용하는 방법에 대해서 코드로 구현해보시오.
// 이 문제는 메인 메서드에서 static 선언이 없는 메서드를 사용하는 방법에 대해서 아는지를 묻는 문제이다.
// 참고로 이 문제는 클래스와 객체에 대한 선행 학습이 필요하므로 이에 대한 학습 후 본 문제를 다시 풀어보는 것이 좋다.


package Java100;

public class Method_2 {
    // 1. static 선언시
//    public static void helloWorld() {
//        System.out.println( "Hello, World~" );
//    }
//    public static void main(String[] args) {
//        // 메소드 호출
//         helloWorld();
//    }

    // 2. static 선언 x
    public void helloWorld() {
        System.out.println( "Hello, World~" );
    }

    public static void main(String[] args) {
        // 객체 생성 후 메소드 호출
        Method_2 m2 = new Method_2();
        m2.helloWorld();
    }

}
