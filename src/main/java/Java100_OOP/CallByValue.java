package Java100_OOP;

class Updater_1 {
    void update(int count) {
        count++;
    }
}

class Updater_2 {
    void update(Counter counter) {
        counter.count++;
    }
}

class Counter {
    int count = 0;  // 객체변수
}

public class CallByValue {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);       // before update:0

        // update 메소드는 값(int 자료형)을 전달받음
        Updater_1 myUpdater_1 = new Updater_1();
        myUpdater_1.update(myCounter.count);
        System.out.println("after update:"+myCounter.count);        // after update:0

        // update 메소드는 객체를 전달받음
        Updater_2 myUpdater_2 = new Updater_2();
        myUpdater_2.update(myCounter);
        System.out.println("after update:"+myCounter.count);        // after update:1

    }
}
