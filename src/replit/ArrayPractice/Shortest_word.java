package replit.ArrayPractice;

public class Shortest_word {

    public static void main(String[] args) {

        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        str = str.replace(" ", "");

        for (int i = 0; i < str.length()-1; i++) {


        }
    }
}
/*
Given a String str, find and print the shortest words. The String will have multiple words separated by commas and spaces. If there is words that have the same length, they should all be displayed at the end. Print all the shortest words in the following format:
Input: word1, word2, word3, word4, etc...

Output: [short1, short2, short3, etc...]

Hint: Think about what comes between each word in the sentence

Main topics: arrays, String, loops, if statements, primitive datatypes, operators

Example:

Input:
  olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

Output:
  [old, cat, ray]
 */