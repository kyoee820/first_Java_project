package JavaChallenge;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();

        // 1. 추가
        hashMap.put("A", "a");
        hashMap.put("B", "b");
        System.out.println(hashMap);

        // 2. 삭제
        hashMap.remove("A");
        System.out.println(hashMap);

        // 3. 중복값 추가
        hashMap.put("B", "bbbb");
        System.out.println(hashMap);

        // 4. 조회
        System.out.println(hashMap.get("B"));
        System.out.println(hashMap.get("A"));
        System.out.println(hashMap.getOrDefault("A","default")); //null이 아닌 다른 문자를 넣고 싶을 때!

    }
}
