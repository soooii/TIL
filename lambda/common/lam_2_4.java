package common;

import java.util.function.Supplier;

public class lam_2_4 {
    // 4.기본 나이 생성기
    // 기본 나이 20을 반환하는
    // Supplier<Integer> 타입의 람다식을 작성하세요.
    public static void main(String[] args) {
        Supplier<Integer> age = () -> 20;
        System.out.println(age.get());
    }
}
