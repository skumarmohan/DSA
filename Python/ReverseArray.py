# Read the size of the array
n = int(input())

# Read the array elements
arr = list(map(int, input().split()))

# Reverse the array in place
left, right = 0, n - 1

while left < right:
    arr[left], arr[right] = arr[right], arr[left]
    left += 1
    right -= 1

# Print the reversed array
print(*arr)