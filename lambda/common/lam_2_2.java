package common;

import java.util.Scanner;
import java.util.function.Predicate;

public class lam_2_2 {
    // 2. 성인 여부 검사기
    // 주어진 나이가 18 이상이면 true, 그렇지 않으면 false를 반환하는
    // Predicate<Integer> 타입의 람다식을 작성하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //조건 만족 시 true 반환
        Predicate<Integer> p = i -> i>=18;
        System.out.println(p.test(age));
    }
}
