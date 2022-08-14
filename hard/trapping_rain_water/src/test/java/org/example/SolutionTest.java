package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest
{

    @Test
    public void TestTrap()
    {
        Solution solution = new Solution();
        assertEquals( 1, solution.trap(new int[]{1,0,1}) );
        assertEquals( 1, solution.trap(new int[]{2,0,1}) );
        assertEquals( 2, solution.trap(new int[]{2,0,2}) );
        assertEquals( 5, solution.trap(new int[]{2,0,1,0,2}) );
        assertEquals( 6, solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}) );
        assertEquals( 9, solution.trap(new int[]{4,2,0,3,2,5}) );
    }
}
