package JavaChallenge;

import java.util.HashSet;

public class HashSetDuplicateExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // 1. 추가
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);

        // 2. 삭제
        set.remove("C");
        set.remove("B");
        System.out.println(set);

        // 3. 중복 방지
        set.add("A");
        System.out.println(set);
    }
}
