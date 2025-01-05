# 😊 오늘 공부한 내용

### 특정 문자열 찾기

- contains() : 문자열에 특정문자 포함 여부 확인 / boolean
- indexOf() : 문자열에 특정문자 시작 index 반환 / 찾지 못하면 -1 반환

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        // 변수명 카멜 케이스 권장
        // 첫 단어 소문자로 시작, 그 이후 단어 대문자로 시작
        boolean contains = s.contains("사과");
        int startIndex = s.indexOf("사과");
    }
}

```