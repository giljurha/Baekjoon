import sys
input = sys.stdin.read
data = input().split()

t = int(data[0])
index = 1
results = []

for _ in range(t):
    n = int(data[index])
    index += 1
    note1 = set(data[index:index + n])
    index += n

    m = int(data[index])
    index += 1
    note2 = data[index:index + m]
    index += m

    for num in note2:
        if num in note1:
            results.append("1")
        else:
            results.append("0")

print("\n".join(results))