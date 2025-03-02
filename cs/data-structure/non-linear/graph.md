# 비선형 자료 구조
- 일렬로 나열하지 않고 자료 순서나 관계가 복잡한 구조

---

## 그래프 
- 정점(node)과 간선(edge)으로 이루어진 자료 구조
- `어떠한 곳`(정점)에서 `어떠한 곳`으로 `무언가`(간선)를 통해 갈 때
---

### 그래프의 연결 방식에 따른 분류
1. 무향 그래프 : 연결 간 방향이 정해지지않은 그래프 (사실상 양방향 그래프와 같은 의미)
2. 단방향 그래프 : 연결 간 방향이 한쪽으로만 이어진 그래프
3. 양방향 그래프 : 연결 간 방향이 양쪽 모두 이어진 그래프

---
- degree(차수) : 한 정점에서 연결된 간선 개수
    - outdegree : 해당 정점에서 나가는 간선
    - indegree : 해당 정점으로 들어노는 간선
---

### 가중치
- 간선과 정점 사이에 드는 비용

### 그래프의 연결에 가중치에 따른 분류
1. 가중치 그래프 : 연결 간 가중치가 존재하는 그래프
   - example :
   - 도시 간 연결망 그래프라면 이동 소요시간, 비용등이 가중치가 될 수 있음
2. 비 가중치 그래프 : 연결 간 가중치가 따로 없는 그래프

---

### 그래프의 표현
1. `인접 행렬`
    - 2차원 배열 이용해 간선 정보 저장
    - `ad[i][j] : 노드 i에서 노드 j로 가는 간선이 있으면 1, 없으면 0`
    - 간선에 가중치가 있다면?
      - 1 대신에 가중치 값을 직접 넣어 구현
2. `인접 리스트`
    - vector(vector<int> adj[]) 배열로 노드의 번호가 직접 저장
    - (vector는 ArrayList와 거의 같다)
    - `adj[i] : 노드 i에 연결된 노드들을 원소로 갖는다`
    - 간선에 가중치가 있다면?
      - pain<int,int> adj[]로 구현 (노드번호, 가중치)
3. `간선 리스트`
    - 간선(시작 정점, 끝 정점)을 객체로 표현해 리스트에 저장