At first glance, this problem seems really straightforward. We're just checking a tic-tactoe
board; how hard could it be? It turns out that the problem is a bit more complex,
and there is no single "perfect" answer. The optimal solution very much depends on
your preferences.
There are a few major design decisions to consider:

1. Will hasWon be called just once, or many times (for instance, as part of a tic-tac-toe
website)? If the latter is the case, we may want to add pre-processing time in order to
optimize the runtime of hasWon.

2. Tic-tac-toe is usually on a 3x3 board. Do we want to design for just that, or do we
want to implement it as an NxN solution?

3. In general, how much do we prioritize compactness of code vs. speed of execution
vs. clarity of code? Remember that the most efficient code may not always be the
best. Your ability to understand and maintain the code matters too.


CrackingTheCodinglnterview.com 431
Solutions to Chapter 17 | Moderate
Solution #1: If hasWon is called many times
There are only 39, or about 20,000 tic-tac-toe boards (assuming a 3x3 board). We can
therefore represent our tic-tac-toe board as an int, with each digit representing a piece
(0 means Empty, 1 means Red, 2 means Blue). We set up a hash table or array in advance
with all possible boards as keys and the value indicating who has won. Our function
then is simply this:
