import java.util.Arrays;

public class practice_lam3 {

    //3.문자열 배열 strArr의 문자열 중에서 가장 긴 것의 길이를 출력하시오.
    public static void main(String[] args) {
        String[] strArr = {"aaa","bb","c","dddd"};
        /*
        MyFunction f = (a,b) -> a>b ? a : b;
        int result =0;
        for(int i=0;i<strArr.length-1;i++){
            result = f.max(strArr[i].length(),strArr[i+1].length());
        }
        */

        int result = Arrays.stream(strArr)
                .mapToInt(len->len.length())
                .max()
                .getAsInt();
        System.out.println(result);
    }
}

/*
interface MyFunction{
    int max(int a, int b);
}*/
