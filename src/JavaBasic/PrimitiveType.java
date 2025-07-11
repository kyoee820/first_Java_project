package JavaBasic;

public class PrimitiveType {

    public static void main(String[] args) {
        // 정수형
        byte byteNum = 127; // -128 ~ 127 (1바이트 지원)
        short shortNumber = 32767; // -32768 ~ 32767
        int intNum = 2147483647; // - 2,147,483,648 ~ 2,147,483,647
        long longNum = 9223372036854775807L; // 매우 큰 숫자

        // 실수형
        float floatNum = 3.14f; // float은 f 접미사가 필요
        double doubleNum = 3.141592; // float보다 더 정밀한 실수

        // 문자형
        char grade = 'A'; // '' 작은따옴표 사용, 단 하나의 문자만

        // 논리형
        boolean isPass = true;
        boolean isPass2 = false;

        // 문자열
        String name = "홍길동";
        String prefix = "a";

        // 레퍼런스 타입
        // 1. 문자열 변환이 필요할 때
        String ageStr = "25"; // ""안에 있기 때문에 25는 숫자가 아닌 문자로 볼것

        // 문자열을 숫자로 변환
        int age1 = Integer.parseInt(ageStr); // 기본형으로 변환
        System.out.println(age1);
        // 문자열이던 '25'가 기본 자료형 '25'로 변환

        // 기본형을 레퍼런스 타입으로 변환할때
        Integer age2 = Integer.valueOf(ageStr); // valueOf - 반환 값이 integer 형태로 반환
        System.out.println(age2);

        // 레퍼런스 타입은 null을 허용한다(매우 중요)
        Integer age = null;
        System.out.println(age);
 //       int height; // 이 경우 오류!

        // 최대/최소값을 확인하는 예제
        System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE);
        System.out.println("Integer.MINX_VALUE : " + Integer.MIN_VALUE);

        System.out.println("Double.MAX_VALUE : " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE : " + Double.MIN_VALUE);

        int number = 42;
        System.out.println("2진수로 변환 : " + Integer.toBinaryString(number));
        System.out.println("16진수로 변환 : " + Integer.toHexString(number));

        // 박싱 & 언박싱
        int a = 5;
        Integer bb = new Integer(a);
        System.out.println("박싱 : " + bb);

        // 언박싱
        Integer b = new Integer(5);
        int bbb = b.intValue();
        System.out.println ("언박싱 : " + bbb);

        // JDK5 이후부터 오토 박싱, 오토 언박싱
        int aaa = 5;
        Integer aaa2 = aaa; // 오토 박싱
        System.out.println("오토 박싱 : " + aaa2);

        int c = aaa2; // 오토 언박싱
        System.out.println("오토 언박싱 : " + c);
        




    }
}
