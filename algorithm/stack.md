# 😊 오늘 공부한 내용

### Stack
- 쌓다, 쌓이다라는 뜻
- 데이터를 쌓는 자료 구조

### 특징
- 후입선출(LIFO : Last In First Out)
- 데이터를 하나씩만 넣고 빼기 가능

---
### 💡 스택 선언
```java
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
    }
}
```

---
### 💡 스택의 메서드
```java
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        
        // 1. 삽입
        stack.push(1);
        stack.add(1);
        
        // 2. 가장 위 요소 삭제 + 반환
        // 공백일 시 - EmptyStackException 발생
        stack.pop();
        
        // 3. 스택의 가장 top 요소 반환
        stack.peek();
        
        // 4. 스택이 비어있는지 
        // 비어있다 : true, 아니다: false
        stack.isEmpty();
        
        // 5. 스택 크기 반환
        stack.size();
        
        // 6. 스택 값 존재 여부 확인
        // 반환값 : top으로부터 몇번째 존재인지 - int형 index
        stack.search(value);

        // 7. 해당 index 요소 삭제 
        stack.remove(index);
        
        // 8. 스택 값 변경 + 변경 전 value 반환
        stack.set(index, 변경할 value);
        
        // 9. 해당 인덱스 값 반환
        stack.elementAt(index);
        
    }
}
```

- 참고 : https://kwin0825.tistory.com/156