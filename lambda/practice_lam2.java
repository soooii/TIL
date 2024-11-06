import java.util.Arrays;

public class practice_lam2 {

    //2.문자열 배열 strArr의 모든 문자열의 길이를 더한 결과를 출력하시오.
    public static void main(String[] args) {
        String[] strArr = {"aaa","bb","c","dddd"};
        int result= Arrays.stream(strArr)
                .mapToInt(len->len.length())
                .sum();
        System.out.println("sum="+result);
    }
}
