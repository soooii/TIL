# 😊 오늘 공부한 내용

### 특정 문자열 원하는 문자열로 치환하기

- replace()
  - String replace(CharSequence target, CharSequence replacement)
- replaceAll() 
  - String replaceAll(String regex, String replacement)

- 두 함수의 차이 -> 입력인자

💡 replaceAll은 입력 인자를 regular expression (정규 표현식)으로 인식한다.

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s.replace(" ","");
        // s가 aaaa라면 **으로 치환된다. (앞부터 차례대로 치환됨)
        s.replace("aa","*");
        
        // 정규표현식에서 .은 "모든 문자"를 의미
        // replaceAll 사용 시 원치 않는 결과를 얻을 수 있다
        // replaceAll 사용 시에는 특수 문자를 주의하자
        String str = "aa..bbcc";
        System.out.println(str.replace(".", "dd")); // aaddddbbcc
        System.out.println(str.replaceAll(".", "dd")); // dddddddddddddddd

    }
}

```

- 참고 : https://velog.io/@m1naworld/Java-replace-vs-replaceAll 