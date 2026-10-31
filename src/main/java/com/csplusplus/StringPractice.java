package com.csplusplus;

/*
 * AI Use Statement
 * ----------------
 * Did you use AI on this assignment? (yes):
 *
 * If yes, briefly describe how (planning, debugging, drafting code, etc.):
 *It ran the code for me and walked me through my issuees.
 *
 * Reminder: retype any AI-generated code yourself. Do not paste it in.
 */

public class StringPractice {

    // Task 1: print every character of s, one per line.
    // Example: printChars("cat") prints c, then a, then t (each on its own line).
    public static void printChars(String s) {
        // PLAN (write your steps in plain English first):
        // Goes through each letter in the word
        // Each letter it will print it out

        // DO THIS: write your code below
        for (int i=0; i < s.length(); i++){
            System.out.println(s.substring(i,i+1));
        }
    }

    // Task 2: print every character of s from LAST to FIRST, one per line.
    // Example: printReverse("cat") prints t, then a, then c.
    public static void printReverse(String s) {
        // PLAN (write your steps in plain English first):
        //Traverse the index from the last to first
        //print it out

        // DO THIS: write your code below
        for (int i = s.length()-1; i>=0; i--){
            System.out.println(s.substring(i, i+1));
        }
    }

    // Task 3: return how many times target appears inside text, including overlaps.
    // Example: countOccurrences("banana", "ana") returns 2.
    public static int countOccurrences(String text, String target) {
        // PLAN (write your steps in plain English first):
        // traverse the target text with the length of the target text
        // DO THIS: write your code below
        int count = 0;
        for (int i = 0; i <= text.length()-target.length(); i++){
            if (text.substring(i,i+target.length()).equals(target)){
                count++;
            }
        }
        return count; // replace this line when your method is ready
    }

    // Task 4: return a NEW string with the word inserted after every word of the sentence.
    // Example: insertWord("how is your morning going", "like")
    //          returns "how like is like your like morning like going like"
    // Assume single spaces between words and no space at the start or end.
    public static String insertWord(String sentence, String word) {
        // PLAN (write your steps in plain English first):
        // every time there is a space, add a like

        // DO THIS: write your code below
        String result = "";
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.substring(i, i+1).equals(" ")){
                result = result + sentence.substring(i,i+1) + word + " ";
            }
            else{
                result = result + sentence.substring(i,i+1);
            }
        }
        result = result + " " + word;
        return result; // replace this line when your method is ready
    }

    // STRETCH A (optional): return true if s reads the same forward and backward.
    public static boolean isPalindrome(String s) {
        // DO THIS
        return false;
    }

    // STRETCH B (optional): return a NEW string with every copy of letter removed.
    public static String removeAll(String text, String letter) {
        // DO THIS
        return "";
    }

    public static void main(String[] args) {
        // Try your methods here. Run this file to see your output.
    }

    /* REFLECTION: Answer in your own words below.

        1. Why does countOccurrences stop at text.length() - target.length()?

            Your answer: Because the window is potentially greater than traversing
            through one index so you can't just have it less than length of text.
            So you actually have to subtract target length from text length.

        2. Why can’t insertWord change the original sentence? Use the words immutable and reassign.

            Your answer: Because string is immutable meaning you cannot change the value, but you can reassign it to a different one.
            The previous one exists, but you change the location it's pointing at.

        3. Which task was hardest, and what did you do when you got stuck?

            Your answer: Any task past 1. I asked AI to walk me through it.
    */
}
