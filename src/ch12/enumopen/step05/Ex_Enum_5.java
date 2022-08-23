package ch12.enumopen.step05;

interface FRUIT {
    int APPLE = 1, PEACH = 2, BANANA = 3;
}

interface COMPANY {
    int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}

public class Ex_Enum_5 {

    public static void main(String[] args) {

        // 인터페이스를 이렇게 사용할 수 있는 것은 인터페이스에서 선언된 변수는 무조건 public static final의 속성을 갖기 때문이다.
        // int type = COMPANY.GOOGLE 으로 바꾼다면?
        // 위 코드는 서로 다른 상수그룹의 비교를 시도했고 양쪽 모두 값이 정수 1이기 때문에 오류를 사전에 찾아주지 못하고 있다.
        // 컴파일러가 이런 실수를 사전에 찾아줄 수 있게 하려면 어떻게 해야 할까?
        int type = FRUIT.APPLE;
        switch (type) {
            case FRUIT.APPLE:
                System.out.println(57 + " kcal");
                break;
            case FRUIT.PEACH:
                System.out.println(34 + " kcal");
                break;
            case FRUIT.BANANA:
                System.out.println(93 + " kcal");
                break;
        }

    }

}
