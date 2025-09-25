package Arrays.Algorithms;

/*
 * Variable Size Sliding Window:

The general steps to solve these questions by following below steps:

In this type of sliding window problem, we increase our right pointer one by one till our condition is true.
At any step if our condition does not match, we shrink the size of our window by increasing left pointer.
Again, when our condition satisfies, we start increasing the right pointer and follow step 1.
We follow these steps until we reach to the end of the array.

How to Identify Sliding Window Problems?
These problems generally require Finding Maximum/Minimum Subarray, Substrings which satisfy some specific condition.
The size of the subarray or substring ‘k’ will be given in some of the problems.
These problems can easily be solved in O(n2) time complexity using nested loops, using sliding window we can solve these in O(n) Time Complexity.
Required Time Complexity: O(n) or O(n log n)
Constraints: n <= 106 
 */
public class SlidingWindow {

    public static void main(String[] args) {

    }
}
