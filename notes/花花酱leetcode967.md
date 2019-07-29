-

## 花花酱leetcode

#### 2019.07.29 
#### 967.Numbers With Same Consecutive Differences 【搜索】

- 解提思路
![image-20190729111243857](/Users/caiguoqing/Library/Application Support/typora-user-images/image-20190729111243857.png)
- DFS实现
- 时间复杂度
- 空间复杂度 O(N) 
![image-20190729111216322](/Users/caiguoqing/Library/Application Support/typora-user-images/image-20190729111216322.png)
- BFS实现
- 时间复杂度
- 空间复杂度 O(2^N) 
![image-20190729111440802](/Users/caiguoqing/Library/Application Support/typora-user-images/image-20190729111440802.png)

- 总结
- BFS算法
```
BFS algorithm's schema

1. insert to the queue q the chosen graph's vertex and set its array m value to true,
2. while the queue q is not empty:
(a) take the first element of the queue q
(b) append to the queue q all unvisited graph's vertexes, which are the taken vertex's neighbours
(c) for all new inserted vertexes set theirs array m value to true
(d) remove the taken vertex for the queue q
```

- DFS算法schema

```
DFS algorithm's schema

1. set the current vertex array m value to true,
2. for every neighbour vertex x do:
 (a) if x is not visited (i.e. m[x] = false), then use recursively the same procedure.
```

- 参考资料

https://edux.pjwstk.edu.pl/mat/258/lec/asd12/main12_p2.html