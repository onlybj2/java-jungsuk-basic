package ch14;

@FunctionalInterface
interface MyFunction_1 {
    public abstract int max(int a, int b);
}

public class Ex14_0 {

    public static void main(String[] args) {

        /*
        MyFunction f = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        int big = f.max(5, 3);
        */

        MyFunction_1 f = (int a, int b) -> a > b ? a : b;
        int big = f.max(5, 3);
    }
}
