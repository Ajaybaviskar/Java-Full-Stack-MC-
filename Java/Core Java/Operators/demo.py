def bubble(arr):
    n = len(arr)
    for i = 0 to n - 1:
        for j = 0 to n - i - 1:
                if arr[j] > arr[j + 1]:
                    swap arr[j] and arr[j + 1]
