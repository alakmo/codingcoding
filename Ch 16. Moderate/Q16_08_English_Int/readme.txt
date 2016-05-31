This is not an especially challenging problem, but it is a somewhat tedious one. The key
is to be organized in how you approach the problem—and to make sure you have good
test cases.
We can think about converting a number like 19,323,984 as converting each of three
3-digit segments of the number, and inserting "thousands"and "millions" in between as
appropriate. That is,
convert(19,323,984) = convert(19) + " million " +
convert(323) + " thousand " +
convert(984)
The code below implements this algorithm.
1 public String[] digits = {"One", "T
