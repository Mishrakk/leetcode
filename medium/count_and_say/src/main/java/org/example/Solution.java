package org.example;

public class Solution
{
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuilder output = new StringBuilder();
        char[] previousOutput = countAndSay(n-1).toCharArray();
        char current = previousOutput[0];
        int occurrence = 0;
        for (char c : previousOutput) {
            if (current == c) {
                occurrence++;
            } else {
                output.append(occurrence).append(current);
                current = c;
                occurrence = 1;
            }
        }
        output.append(occurrence).append(current);
        return output.toString();
    }
}
