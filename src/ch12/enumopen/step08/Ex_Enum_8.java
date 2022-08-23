package ch12.enumopen.step08;

enum Fruit {
    APPLE, PEACH, BANANA;

    // 이것은 enum의 생성자가 접근 제어자 private 만을 허용하기 때문이다.
    // 덕분에 Fruit를 직접 생성할 수 없다.
    // 그렇다면 이 생성자의 매개변수를 통해서 필드(APPLE..)의 인스턴스 변수 값을 부여 할 수 있다는 말일까? 있다. 그런데 방식이 좀 생경하다.
    Fruit() {
        System.out.println("Call Constructor "+this);
    }
}

enum Company {
    GOOGLE, APPLE, ORACLE;
}

public class Ex_Enum_8 {

    public static void main(String[] args) {

        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
        Fruit type = Fruit.APPLE;
        switch(type) {
            case APPLE:
                System.out.println(57+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }

}
