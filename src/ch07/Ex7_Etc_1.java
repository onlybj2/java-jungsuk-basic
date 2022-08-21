package ch07;

public class Ex7_Etc_1 {

    public static void main(String[] args) {
        Car1 c1 = new Car1();
        FireEngine2 f1 = new FireEngine2();
        Car1 cf1 = new FireEngine2();

        if (c1 instanceof FireEngine2) { // false
            System.out.println(">> c1 instanceof FireEngine2");
        }
        if (f1 instanceof FireEngine2) { // true
            System.out.println(">> f1 instanceof FireEngine2");
        }
        if (cf1 instanceof FireEngine2) { // true
            System.out.println(">> cf1 instanceof FireEngine2");
//            cf1.water(); // 이렇게 사용할 수 없음. Car1 타입으로 참조하기에, Car1 에는 water() 가 존재하지 않음, 그래서 FireEngine2 로 형변환한 뒤에 water() 를 사용해야함.
            FireEngine2 a = (FireEngine2) cf1;
            a.water();
        }
        if (c1 instanceof Car1) { // true
            System.out.println(">> c1 instanceof Car1");
        }
        if (f1 instanceof Car1) { // 이것도 true 임, false 일 줄 알았음
            System.out.println(">> f1 instanceof Car1");
            f1.water();
        }
        if (cf1 instanceof Car1) { // 이것도 true 임, false 일 줄 알았음
            System.out.println(">> cf1 instanceof Car1");
//            cf1.water(); // 이렇게 사용할 수 없음. Car1 타입으로 참조하기에, Car1 에는 water() 가 존재하지 않음, 그래서 FireEngine2 로 형변환한 뒤에 water() 를 사용해야함.
            FireEngine2 a = (FireEngine2) cf1;
            a.water();
        }

    }

}

class Car1 {
    String color;
    int door;

    void drive() {    // 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop() {    // 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine2 extends Car1 {    // 소방차
    void water() {    // 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}
