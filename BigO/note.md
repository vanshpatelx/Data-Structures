# Time Complexity and Analysis

## Problems 1
```java
class NestedLoop {
  public static void main(String[] args) {
    int n = 10;
    int sum = 0;
    double pie = 3.14;
    
    for (int var = 0; var < n; var = var + 3) {
      System.out.println("Pie: " + pie);
      for (int j = 0; j < n; j = j + 2) {
        sum++;
        System.out.println("Sum = " + sum);
      }
    }
  }
}
```

### Analysis

- `var = 0 => 1`
- `var < n => n/3 + 1`
- `var+=3 => n/3`
- `Sout => n/3`
- `j = 0 => n/3`
- `j < n => n/3 * (n/2 + 1)`
- `j+=2 => n/3 * n/2`
- `Sum => n/3 * n/2`
- `sout => n/3 * n/2`

### Complexity
```
15 + 5n + 2n^2 / 3 => O(N * N)
```

# Problems 2

```java
class NestedLoop {
  public static void main(String[] args) {
    int n = 10; 
    int sum = 0;
    double pie = 3.14;
    
    for (int var = n; var >= 1; var = var - 3) {
      System.out.println("Pie: " + pie);
      for (int j = n; j >= 0; j = j - 1) {
        sum++;
      }
    }
  System.out.println("Sum: " + sum);
  }
} 
```

### Analysis

- `var = n => 1`
- `var >= 1 => n/3 + 1`
- `var = var - 3 => n/3`
- `Sout => n/3`
- `j = n => n/3`
- `j>=0 => n/3 * (n + 2)`
- `j-- => n/3 * (n + 1)`
- `sum => n/3 * (n + 1)`
- `sout => 1`

### Complexity
```
6 + n^2 + 8n/3 => O(N * N)
```

# Problems 3

```java
class NestedLoop {
  public static void main(String[] args) {
    int n = 10; 
    int sum = 0;
    double pie = 3.14;
    int var = 1; 

    while(var < n) {
      System.out.println("Pie: " + pie); 
      for (int j = 0; j < var; j++) {
        sum++;
      }
      var *= 2;
      
    }
    System.out.println("Sum: " + sum);
  } 
}
```

### Analysis

- `var < n => log2(n) + 1`
- `sout => log2(n)`
- `j = 0 => log2(n)`
- `j < var => 2n`
- `j++ => 2n - 1`
- `sum++ => 2n - 1`
- `var*=2 => log2(n)`
- `sout => 1`

### Complexity
```
4 + 4log2(n) + 6n => O(N)
```

# Problems 4

```java
class NestedLoop {
  public static void main(String[] args) {
    int n = 10;
    int sum = 0;
    double pie = 3.14;
    int var = 1;
    while(var < n) { 
      System.out.println("Pie: " + pie);
      for (int j = 1; j < n; j = j + 2) {   
        sum++;  
      }
      var *= 3;  
    }
    System.out.println("Sum: " + sum);
  }
}
```

### Analysis

- `var < c => log3(n) + 1`
- `sout => log3(n)`
- `j = 1 => log3(n)`
- `j < n => log3(n) * (n/2 + 1)`
- `j+=2 => log3(n) * n/2`
- `sum++ => log3(n) * n/2`
- `var*=3 => log3(n)`

### Complexity
```
6 + 5log3(n) + 3/2 * nlog3(n) => O(N * logN)
```

# Problems 5

```java
class NestedLoop {
  public static void main(String[] args) {
    int n = 10;
    int sum = 0;
    int j = 1;
    double pie = 3.14;
  
    for (int var = 1; var < n; var += 3) {
      System.out.println("Pie: " + pie);
      j = 1;
      while (j < n) {
        sum += 1;     
        j *= 3;       
      }
    }
    System.out.println("Sum: " + sum);
  } 
} 
```

### Analysis

- `var = 1 => 1`
- `var < n => n/3 + 1`
- `var+=3 => n/3`
- `j = 1 => n/3`
- `j < n => n/3 * (log3(N) + 1)`
- `sum+= 1 => n/3 * (log3(N))`
- `J*=3 => n/3 * (log3(N))`
- `sout => 1`

### Complexity
```
4n/3 + 2 + n * log3(N) => N * log3(N)
```

# Problems 6

```java
class NestedLoop {
  public static void main(String[] args) {
    int n = 10;   
    int sum = 0; 
    double pie = 3.14; 

    for (int var = 0; var < n; var++) {   
      int j = 1;  
      System.out.println("Pie: " + pie);
      while(j < var) { 
        sum += 1;  
        j *= 2;  
      }
    } 
    System.out.println("Sum: " + sum); 
  } 
} 
```

### Analysis

- `var = 0 => 1`
- `var < n => n + 1`
- `var++ => n`
- `j = 1 => n`
- `sout => n`
```
j < var =>
n * log2(var)
log2(1) + log2(2) + .... + log2(n)
= log2(1 + 2 + ... + n)
= log2(N!)
= log2(N!) also defined as Nlog2(N)
```
- `sum++ => log2(N!)`
- `j*=2 => log2(N!)`
- `sout => 1`

### Complexity
```
7 + 4n + 3log2(N!) => O(nlogn)
```

# NestedLoop Class 7

```java
class NestedLoop {
  public static void main(String[] args) {
    int n = 10;   
    int sum = 0;  
    int j = 1;   
    double pie = 3.14; 

    for (int var = 0; var < n; var++) {  
      System.out.println("Pie: " + pie); 
      while(j < var) { 
        sum += 1;  
        j *= 2;  
      }
    } 
    System.out.println("Sum: " + sum); 
  }
}
```

### Analysis

- `var = 0 => 1`
- `var < n => n + 1`
- `var++ => n`
- `sout => n`
- `while => n`
- `sum++ => n * logn`
- `j*=2 => n * logn`

### Complexity
```
n * logn
```

---

## Algorithm Analysis and Examples

### Questions
Suppose your friend discovers a new algorithm and in his excitement tells you that his algorithm has a lower bound of O(n2). Can you explain why your friend's statement makes no sense?

### Ans
Does not make sense because we typically refer to the upper bound in Big-O notation. It describes the worst-case scenario of the algorithm's growth rate.

### O(2^(2n)) vs O(2^n)
O(2^(2n)) is not equal to O(2^n). For instance:

```
0 <= 2 ^ 2n <=  c2^2n
0 <= 2 ^ n <=  c2^n

=> 0 <= 2 ^ 2n <=  c2^2n
Divide by 2^n
0 <= 2 ^ 2 <= c * 2 ^ 2
which is not equivalent
```

### Best Case = Worst Case Example
General Bubble Sort without optimizations and Radix Sort.

### Algorithm Complexity Examples

#### Example 1
```java
void averager(int[] A) {
  float avg = 0.0f;
  int j, count;

  for (j = 0; j < A.length; j++) {
    avg += A[j];
  }

  avg = avg / A.length;
  count = j = 0;

  do {
    while (j < A.length && A[j] != avg) {
      j++;
    }

    if (j < A.length) {
      A[j++] = 0;
      count++;
    }
  } while (j < A.length);
}
```
```
O(N)
```

#### Example 2
```java
for (int i = 0; i < array.length; i++) {
  for (int j = 0; j < 10000; j++) {
    // some useful work done here.
  }
}
```
```
O(N)
```

#### Example 3
```java
void complexMethod(int[] array) {
  int n = array.length;
  int runFor = Math.pow(-1, n) * Math.pow(n, 2);
  for (int i = 0; i < runFor; i++) {
    System.out.println("Find how complex I am ?");
  }
}
```
```
O(N * N)
```

#### Example 4
```java
void complexMethod(int n, int m) {
  for (int j = 0; j < n; j++) {
    for (int i = 0; i < m % n; i++) {
      System.out.println("");
    }
  }
}
```
```
O(n * (m % n)) => m % n => O(N) => O(N*N)
```

#### Example 5
```java
void someMethod(int n) {
  for (int j = 0; j < n; j++) {
    for (int i = 0; i < 3; i++) {
      for (int k = 0; k < n; k++) {
        System.out.println("I have 3 loops");
      }
    }
  }
}
```
```
O(N * N)
```

#### Example 6
```java
void someMethod(int n, int m) {
  for (int j = 0; j < n; j++) {
    for (int i = 0; i < m; i++) {
      System.out.println("I have 2 loops");
    }
  }
}
```
```
O(N * M)
```






## Shortcuts and Quick Notes

```java
for(int i = 0; i < n; i++) {
  // Statements
}
```

- `i = 0` => 1
- `i < n` => n + 1
- `i++` => n
- `Statements` => n

**Conditions:**
- `i += k` => n / k
- `i *= 2` => log₂(n)
- `i *= k` => log₍ₖ₎(n)