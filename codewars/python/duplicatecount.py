from collections import defaultdict


def duplicate_count(text):
    d = defaultdict(lambda: 0)
    for i in list(text):
        d[i] += 1
    return max(d.values())


print(duplicate_count("allllah"))
