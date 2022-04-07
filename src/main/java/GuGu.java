// 1.클래스 생성
public class GuGu {
    // 메소드 생성
    // public: 접근제어자, 어떤 곳에서든지 호출가능
    public void dan(int n) {
        for (int i = 1; i<10; i++) {            // for(초기치; 조건문; 증가치)
            System.out.println(n * i);
        }
    }
    // 2.메인 메소드 생성
    // 메소드 호출: main 메소드에서 dan 메소드를 호출
    public static void main(String[] args) {
        GuGu gugu = new GuGu();                 // 객체 생성
        for (int i =2; i < 10; i++) {
            gugu.dan(i);
        }
    }
}