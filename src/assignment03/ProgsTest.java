package assignment03;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ProgsTest {
    //Prog1 Start//
    @Test
    void TestPowerCase1(){ //positive x power by positive x
        double expect = Prog1.power(2, 4);
        double actual = Math.pow(2, 4);
        assertEquals(expect, actual);

    }
    @Test
    void TestPowerCase2(){ // positive x power by negative x
        double expect = Prog1.power(5, -2);
        double actual = Math.pow(5, -2);
        assertEquals(expect, actual);
    }
    @Test
    void TestPowerCase3(){ //0 power by negative x
        double actual = Math.pow(0, -1);
        double expect = Prog1.power(0, -1);
        assertEquals(expect, actual);
    }
    @Test
    void TestPowerCase4(){ //positive x power by 0
        double expect = Prog1.power(5, 0);
        double actual = Math.pow(5, 0);
        assertEquals(expect, actual);
    }
    @Test
    void TestPowerCase5(){ //negative x power by positive n
        double expect = Prog1.power(-5, 2);
        double actual = Math.pow(-5, 2);
        assertEquals(expect, actual);

    }
    @Test
    void TestPowerCase6(){ //negative x power by negative n
        double expect = Prog1.power(-5, -2);
        double actual = Math.pow(-5, -2);
        assertEquals(expect, actual);
    }
    //Prog2 Start//
    @Test
    void TestMinCharOfString1(){ //Non-Empty String
        double expect = Prog2.minCharOfString("Hello, MIU.");
        char actual = ' ';
        assertEquals(expect, actual);
    }
    @Test
    void TestMinCharOfString2(){ //Empty String
        double expect = Prog2.minCharOfString("");
        char actual = '\u0000';
        assertEquals(expect, actual);
    }
    @Test
    void TestMinCharOfString3(){ //Empty String
        double expect = Prog2.minCharOfString(null);
        char actual = '\0';
        assertEquals(expect, actual);
    }
    //Prog3 Start//
    @Test
    void TestReverseArray1(){ // Non-Empty Array
        int[] expect = Prog3.reverseArray(new int[] {1, 3, 4, 7, 9, 13}).clone();
        int[] actual = new int[] {13, 9, 7, 4, 3, 1};
        assertArrayEquals(expect, actual); //array
    }
    @Test
    void TestReverseArray2(){ //Empty Array
        int[] expect = Prog3.reverseArray(new int[] {}).clone();
        int[] actual = new int[] {};
        assertArrayEquals(expect, actual); //array
    }
    @Test
    void TestReverseArray3(){ //Undefined Array
        int[] expect = Prog3.reverseArray(null);
        int[] actual = null;
        assertArrayEquals(expect, actual); //array
    }

    //Prog4
    @Test
    void TestIsPalindrome1(){ //positive number
        boolean actual = Prog4.isPalindrome(121);
        boolean expect = true;
        assertEquals(expect, actual);
    }
    @Test
    void TestIsPalindrome2(){ //negative number
        boolean actual = Prog4.isPalindrome(-323);
        boolean expect = true;
        assertEquals(expect, actual);
    }
    //Prog5
    @Test
    void TestMaxValueInArray1(){ //Non-Empty Array
        int actual = Prog5.maxValueInArray(new int[] {5, -3, 6, 1, 9, 4, 24});
        int expect = 24;
        assertEquals(expect, actual);
    }
    @Test
    void TestMaxValueInArray2(){ //Empty Array
        int actual = Prog5.maxValueInArray(new int[] {});
        int expect = -1;
        assertEquals(expect, actual);
    }
    @Test
    void TestMaxValueInArray3(){ //Empty Array
        int actual = Prog5.maxValueInArray(null);
        int expect = -1;
        assertEquals(expect, actual);
    }
}