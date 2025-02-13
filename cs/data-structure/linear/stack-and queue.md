# 스택 (stack)
- 쌓다, 쌓이다라는 뜻
- 데이터를 쌓는 자료 구조

### 특징
- 후입선출(LIFO : Last In First Out)
- 데이터를 하나씩만 넣고 빼기 가능
- 삽입 / 삭제 : O(1)
- 탐색(특정 값을 찾는 것) : O(n)

### 언제 사용될까?
- 역순 문자열 만들기 (가장 마지막에 입력된 문자부터 출력)
- 후위 표기법 계산
- 수식의 괄호 검사 (연산자 우선순위 표현을 위한 괄호 검사)

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
---
# 큐 (queue)
- 줄을 서서 기다리는 것.
- 은행에 먼저 온 사람의 업무를 창구에서 처리하는 것과 같은 방식

### 특징
- FIFO(First In First Out)
- 삽입 / 삭제 : O(1)
- 탐색(특정 값을 찾는 것) : O(n)

---
### 💡 큐의 메서드
- 데이터 추가 연산 : enqueue (뒤쪽 rear)
- 데이터 제거 연산 : dequeue (앞쪽 front)
---

### 💡 언제 사용될까?
- 데이터가 입력된 순서에 따라 처리되어야 할 때
- 너비 우선 탐색 (BFS) 구현

---

- 참고
- https://kwin0825.tistory.com/156
- https://jhbljs92.tistory.com/entry/1-Stack-Queue-%EC%8A%A4%ED%83%9D%EA%B3%BC-%ED%81%90