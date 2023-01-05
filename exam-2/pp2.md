# Past Paper Question

0, 1, 1, 2, 3, 5, 8, 13, ...
With the exception of the leading 0 and 1 (the zeroth term and 1st term), the terms in the sequence are the sum of the two preceding terms. For example, F is the 5th term of the sequence, which is 5, and is the sum of the 3rd and 4th terms, which are 2 and 3 respectively.

___
**(a)** State the value of the 8th term in the sequence. *[1]*

> 13

___

The following method, fibo(N), generates the Nth term in the sequence. The return statement returns the value that the method generates.

```ibps
fibo (N)
    if (N=0 OR N=1) then
        return N
    end if
    return (fibo (N-1) + fibo (N-2))
end sub
```

___
**(b)** Trace fibo(4), showing the different levels of recursion. *[3]*

```text
                               fibo(4)
              fibo(3)             +          fibo(2)
        fibo(2)    +    fibo(1)       fibo(1)    +    fibo(0)
fibo(1)   +    fibo(0)    +    1         1       +    0
    1     +    0
                            
                            1+0+1+1+0 = 3
```
