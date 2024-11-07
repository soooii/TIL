package common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lam_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //선언
        getOper f1 = s1 -> s1.split(" ");
        calc f2 = (a,b) -> a+b;
        calc f3 = (a,b) -> a-b;

        //계산
        String[] arr = f1.getOper(s);
        int result =Integer.parseInt(arr[0]);
        for(int i=1; i<arr.length-1; i++){
            if(arr[i].equals("+")){
                result = f2.calc(result , Integer.parseInt(arr[i+1]));
            }
            else if(arr[i].equals("-")){
                result = f3.calc(result, Integer.parseInt(arr[i+1]));
            }
        }
        System.out.println(result);
    }
}

@FunctionalInterface
interface calc{
    int calc(int a, int b);
}

@FunctionalInterface
interface getOper{
    String[] getOper(String s);
}