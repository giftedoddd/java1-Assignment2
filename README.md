---
title: "Java Programming 101"
subtitle: "Assignment 2: Bouncing Ball"
---

---

### Problem Statement

In a new version of the popular Pinball game, the game field includes a sequence of $n$ bumpers arranged in a row, numbered from $1$ to $n$ from left to right. Each bumper is of one of two types, represented by the symbols '<' and '>'. When a ball hits the bumper at position $i$:  

- If the bumper is '>', the ball moves one position to the right (to position $i+1$).
- If the bumper is '<', the ball moves one position to the left (to position $i-1$).

If the ball attempts to move outside the range of the bumpers (i.e., $i-1 < 1$ or $i+1 > n$), it falls off the game field.  

Given the string describing the bumpers' types, determine how many starting positions for the ball will ultimately cause it to fall off the game field, regardless of the number of moves it takes.

---

**Input**

The first line of the input contains a single integer $n (1 \le n \le 200000)$ — the length of the sequence of bumpers. The second line contains the string, which consists of the characters '<' and '>'. The character at the $i$-th position of this string corresponds to the type of the $i$-th bumper.

**Output**

Print one integer — the number of positions in the sequence such that the ball will eventually fall from the game field if it starts at that position.

---

**Examples**

- Example 1

**Input**

```
4
<<><
```

**Output**

```
2
```

- Example 2

**Input**

```
5
>>>>>
```

**Output**

```
5
```

- Example 3

**Input**

```
4
>><<
```

**Output**

```
0
```

---


**Note**

In the first sample, the ball will fall from the field if starts at position 1 or position 2.

In the second sample, any starting position will result in the ball falling from the field.