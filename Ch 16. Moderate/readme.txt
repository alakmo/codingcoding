17.1 Write a function to swap a number in place (that is, without temporary variables).



17.4 Design an algorithm to figure out if someone has won a game of tic-tac-toe.


17.5 Write an algorithm which computes the number of trailing zeros in n factorial.
__


17.7 Write a method which finds the maximum of two numbers. You should not use
if-else or any other comparison operator.

17.15 The Game of Master Mind is played as follows:
The computer has four slots, and each slot will contain a ball that is red (R), yellow
(Y), green (G) or blue (B). For example, the computer might have RGGB {Slot #1 is
red, Slots #2 and #3 are green, Slot #4 is blue).
You, the user, are trying to guess the solution. You might, for example, guess
YRGB.
When you guess the correct color for the correct slot, you get a "hit." If you guess
a color that exists but is in the wrong slot, you get a "pseudo-hit." Note that a slot
that is a hit can never count as a pseudo-hit.
For example, if the actual solution is RGBY and you guess GGRR, you have one
hit and one pseudo-hit.
Write a method that, given a guess and a solution, returns the number of hits
and pseudo-hits.


17.16 Given an array of integers, write a method to find indices m and n such that if you
sorted elements m through n, the entire array would be sorted. Minimize n - m
(that is, find the smallest such sequence).
EXAMPLE
Input: 1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19
Output: (3, 9)


17.8 Given any integer, print an English phrase that describes the integer (e.g., "One
Thousand, Two Hundred Thirty Four").


17.17  You are given an array of integers (both positive and negative). Find the contiguous
sequence with the largest sum. Return the sum.
EXAMPLE
Input: 2, -8, 3, -2, 4, -10
Outputs (i.e., {3, -2, 4})


17.2 Design a method to find the frequency of occurrences of any given word in a
book.


17.12 Since XML is very verbose, you are given a way of encoding it where each
tag gets mapped to a pre-defined integer value. The language/grammar is as
follows:
Element --> Tag Attributes END Children END
Attribute --> Tag Value
END --> 0
Tag --> some predefined mapping to int
Value --> string value END
For example, the following XML might be converted into the compressed string
below (assuming a mapping of family -> 1, person ->2, firstName ->
3, lastName -> 4, state -> 5).
<family lastName="McDowell" state="CA">
<person firstName="Gayle">Some Message</person>
</family>
Becomes:
1 4 McDowell 5 CA 0 2 3 Gayle 0 Some Message 0 0.
Write code to print the encoded version of an XML element (passed in Element
and Attribute objects).



17.23 Implement a method rand7() given randSQ.That is, given a method that
generates a random number between 0 and 4 (inclusive), write a method that
generates a random number between 0 and 6 (inclusive).
17.12 Design an algorithm to find all pairs of integers within an array which sum to a
specified value.


































17.14 Oh, no! You have just completed a lengthy document when you have an unfortunate
Find/Replace mishap. You have accidentally removed all spaces, punctuation,
and capitalization in the document. A sentence like "I reset the
computer. It still didn't boot!"would become"iresetthecomputeritstilldidntboot".
You figure that you can add back in the punctation and
capitalization later, once you get the individual words properly separated. Most
of the words will be in a dictionary, but some strings, like proper names, will not.
Given a dictionary (a list of words), design an algorithm to find the optimal way
of "unconcatenating"a sequence of words. In this case, "optimal" is defined to be
the parsing which minimizes the number of unrecognized sequences of characters.
For example, the string "jesslookedjustliketimherbrother" would be
optimally parsed as "JESS looked just like TIM her brother". This
parsing has seven unrecognized characters, which we have capitalized for clarity.






17.13 Consider a simple node-like data structure called BiNode, which has pointers to
two other nodes.
1 public class BiNode {
2 public BiNode nodel, node2j
3 public int data;
4 }
The data structure BiNode could be used to represent both a binary tree (where
nodel is the left node and node2 is the right node) or a doubly linked list (where
nodel is the previous node and node2 is the next node). Implement a method
to convert a binary search tree (implemented with BiNode) into a doubly linked
list. The values should be kept in order and the operation should be performed
in place (that is, on the original data structure).
pg :
