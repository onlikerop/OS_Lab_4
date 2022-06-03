import time

t0 = time.time()
print("Введите размер:")
n = int(input())
a = []
b = 3
c = 3
d = 0
a.append(0)
for i in range(1, n):
    d += a[i - 1]
    for j in range(1, 100000001):
        d += 2 * b + c - i
    a.append(d)
t1 = time.time() - t0
print("Time elapsed: ", t1*1000)
