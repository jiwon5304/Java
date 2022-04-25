// 다형성 : 하나의 객체가 여러개의 자료형 타입을 가질 수 있는 것
package Java100_OOP;

interface Predator {
    String getFood();
}

interface Barkable {
    void bark();
}

class Animals {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animals implements Predator, Barkable {
    public String getFood() {
        return "apple";
    }
    public void bark() {
        System.out.println("어흥");
    }

}

class Lion extends Animals implements Predator, Barkable {
    public String getFood() {
        return "banana";
    }
    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper {
    void feed(Predator predator) {  // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed "+predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal) {  // Animal 대신 Barkable을 사용
        animal.bark();
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed banana 출력

        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}

