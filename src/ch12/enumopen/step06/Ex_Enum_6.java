package ch12.enumopen.step06;

class Fruit {
    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();
}

class Company {
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
}

public class Ex_Enum_6 {
    public static void main(String[] args) {
        // 결과는 17행에서 에러가 발생한다. 이것이 우리가 바라던 것이다.
        // 서로 다른 카테고리의 상수에 대해서는 비교조차 금지하게 된 것이다.
        // 언제나 오류는 컴파일 시에 나타나도록 하는 것이 바람직하다. 실행 중에 발생하는 오류는 찾아내기가 더욱 어렵다.
        // 그런데 위의 코드는 두 가지 문제점이 있는데 하나는 switch 문에서 사용할 수 없고 또 하나는 선언이 너무 복잡하다는 것이다. 주인공이 등장할 시간이 되었다.
        //if (Fruit.APPLE == Company.APPLE) {
            System.out.println("과일 애플과 회사 애플이 같다.");
        //}
    }

}
