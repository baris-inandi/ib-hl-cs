import random


def is_sorted(arr):
    for i in range(len(arr) - 1):
        if arr[i] > arr[i + 1]:
            return False
    return True


def shuffle(arr):
    for i in range(len(arr)):
        j = random.randint(0, len(arr) - 1)
        arr[i], arr[j] = arr[j], arr[i]


def bogo(arr):
    while not is_sorted(arr):
        shuffle(arr)
    return arr


def random_arr():
    arr = []
    for i in range(10):
        arr.append(random.randint(0, 100))
    return arr


if __name__ == "__main__":
    print(bogo(random_arr()))
