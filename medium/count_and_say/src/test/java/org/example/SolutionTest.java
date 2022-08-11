package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest
{
    @Test
    public void shouldAnswerWithTrue()
    {
        Solution solution = new Solution();
        assertEquals("1", solution.countAndSay(1));
        assertEquals("11", solution.countAndSay(2));
        assertEquals("21", solution.countAndSay(3));
        assertEquals("1211", solution.countAndSay(4));
        assertEquals("111221", solution.countAndSay(5));
    }
}
