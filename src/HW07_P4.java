public class HW07_P4 {

    public static void main(String[] args) {
        displayPermutations("abc");
    }
    public static void displayPermutations (String s)
    {
        displayPermutations("", s);
    }
    public static void displayPermutations (String s1, String s2) {
        int length = s2.length();
        if (length == 1) System.out.println(s1+s2);
        else {
            for (int i = 0; i < length; i++)
                displayPermutations(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1, length));
        }
    }
}
/*
Analysis:
    The method is used to find out all of the string permutations of a particualr string and print them out. The input for this would be the string. The output
    would be the string permutations for this particular string.
Design:
    There are multiple steps in this problem. The first problem is the algorithm. The first thing we can see that is that the first letter of the string had a few permutations.
    If the length is0 the base is called. In addition as more calls are made recursively, the length of the string s2 gets smaller and smaller which is oppsite of s1 which
    gets an additional letter every time.

Testing:
    I tested this code with multiple inputs that were checkable. The concrete test case that i used was the give test case of "abc". This gave the proper output which was given in the
    directions. In addition I used strings "asd" and "fasd."
*/