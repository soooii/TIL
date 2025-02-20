### 우선순위 큐 (priority-queue)
- 대기열에서 우선순위가 높은 요소가 먼저 나가는 자료구조
- 힙(heap)을 기반으로 구현
  - 힙은 일반적으로 배열로 구현
---

### 맵 (map)
- 특정 순서에 따라 `키(key)`와 `매핑된 값(value)`의 조합으로 구성된 자료구조
    - HashMap : key에 대한 입력 순서 보장 x
    - LikedHashMap : key에 대한 입력 순서 보장
    - TreeMap : key 데이터 크기 비교 가능 경우 오름차순 정렬
- map<string,int>
- key 중복 x, value 중복 o
- 정렬을 보장하지 않는 unordered_map과 정렬을 보장하는 map 두 종류 존재

---

### 셋
- 특정 순서에 따라 고유한 요소를 저장하는 컨테이너
  - HashSet : 입력 순서 보장 x
  - LinkedHashSet : 입력 순서 보장
  - TreeSet : 데이터 크기 비교 가능 경우 오름차순 정렬
- 중복된 요소 X

___
### 해시 테이블
- 무한에 가까운 데이터들(key)을 유한한 개수의 해시 값(Hash Value)으로 매핑한 테이블
- key를 해시 함수에 넣으면 Hash Value가 나옴
  - 이는 해시 테이블의 index가 됨
  - 해당 index에는 key의 값 저장
- 삽입/삭제/탐색 : 평균 O(1)
- unordered_map으로 구현
