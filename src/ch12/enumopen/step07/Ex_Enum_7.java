package ch12.enumopen.step07;

enum Fruit {
    APPLE, PEACH, BANANA;
}
enum Company {
    GOOGLE, APPLE, ORACLE;
}

public class Ex_Enum_7 {

    public static void main(String[] args) {
        /*
        // enum이 서로 다른 상수 그룹에 대한 비교를 컴파일 시점에서 차단할 수 있다는 것을 의미한다.
        // 상수 그룹 별로 클래스를 만든 것의 효과를 enum도 갖는다는 것을 알 수 있다.
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
/*
enum은 사실상 class이다

enum Fruit {
    APPLE, PEACH, BANANA;
}

위의 코드는 아래 코드와 사실상 같다.

class Fruit{
    public static final Fruit APPLE  = new Fruit();
    public static final Fruit PEACH  = new Fruit();
    public static final Fruit BANANA = new Fruit();
    private Fruit() {} // 생성자의 접근 제어자가 private 이다. 그것이 클래스 Fruit 를 인스턴스로 만들 수 없다는 것을 의미한다
}


enum을 사용하는 이유를 정리하면 아래와 같다.

코드가 단순해진다.
인스턴스 생성과 상속을 방지한다.
키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼 수 있다.

*/