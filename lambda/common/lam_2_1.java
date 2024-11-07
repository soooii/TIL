package common;

import java.util.Scanner;
import java.util.function.Function;

public class lam_2_1 {
    // 1. 나이 변환기
    // 정수형 나이를 받아 “나이는 XX입니다” 라는 형식의 문자열로 변환하는
    // Function<Integer, String> 타입의 람다식을 작성하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        Function<Integer,String> f = i -> "나이는 " + i +"입니다";
        System.out.println(f.apply(age));
    }
}
