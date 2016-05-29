# Given a sorted array of size N of int32, find an element that repeats > ceil(N / 2) times. #Your algo may assume that there will be always such element. Space/time O(1). 
# Follow up question: Now element repeats > ceil(N / 4) times. Space/time O(1)

def find_repeat(a):
    b = len(a)
    print(b)
    if((a[int(b/4)] == a[int(b/2)])or(a[int(b/2)] == a[int(3*b/4)-1])
       or(a[int(3*b/4)-1] == a[b-1])):
        return 1
    else:
        return 0
    
        
#x = [1,1,1,1,2,2,2,3,3]
x = [1,2,3,4,5,6,7,89]
if(find_repeat(x) == 1):
    print("Yes")
else:
    print("No")
