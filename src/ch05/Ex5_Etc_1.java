package ch05;

public class Ex5_Etc_1 {

    public static void main(String[] args) {
        String str = "JAVA";
        System.out.println(str.toString());
        str = str + "8";
        System.out.println(str.toString());
        // 문자열 str 의 내용이 변경되는 것 같지만,
        // String객체(문자열)은 읽을 수만 있을 뿐 내용을 변경할 수 없기 때문에, 새로운 내용의 문자열이 생성되는 것이다.
    }

}
