import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AssertionsDemo {

    Calculator calc = new Calculator();


    @Test
    @DisplayName("Assert Equal Test Cases")
    public void assertEqualTest(){

        //Assertions.assertEquals(4,calc.add(2,2),"Assert Equal Test Failed");
        Assertions.assertEquals(4,calc.add(2,2), () -> "Assert Equal Test Failed");



    }

    @Test
    @DisplayName("Assert Not Equal Test Cases")
    public void assertNotEqualTest(){

        Assertions.assertNotEquals(3,calc.add(2,2));

    }

    @Test
    @DisplayName("Assert Array Equal Test Cases")
    public void assertArraytEqualTest(){

        Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,3,2});
    }


    @Test
    @DisplayName("Assert Iterable Equal Test Cases")
    public void assertIterableEqualTest(){

        Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1,2,3));
        Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1,2,3));

        Assertions.assertIterableEquals(listOne,listTwo);
    }

    @Test
    @DisplayName("Assert Not Null Test")
    public void assertNotNullTest(){

       String nullString = null;
       String notnullString = "ABC";

       //Assertions.assertNotNull(nullString);
        Assertions.assertNotNull(notnullString);
    }

    @Test
    @DisplayName("Assert True Test")
    public void assertTrueTest(){

        boolean trueBoolean = true;
        boolean falseBoolean = false;

        //Assertions.assertTrue(trueBoolean,"Assert true Test Failed");
        Assertions.assertTrue(falseBoolean,"Assert true Test Failed");
    }

    @Test
    @DisplayName("Assert False Test")
    public void assertFalseTest(){

        boolean trueBoolean = true;
        boolean falseBoolean = false;

        Assertions.assertFalse(trueBoolean,"Assert false Test Failed");
        //Assertions.assertFalse(falseBoolean,"Assert false Test Failed");
    }

    @Test
    @DisplayName("Assert Exception Test")
    public void assertExceptionTest(){

        Assertions.assertThrows(ArithmeticException.class, () -> calc.divide(1,0),"Assert Exception Test Case Failed");
        //Assertions.assertThrows(NullPointerException.class, () -> calc.divide(1,0),"Assert Exception Test Case Failed");
    }

    @Test
    @DisplayName("Assert All Test")
    public void assertAllTest(){

        Assertions.assertAll(
                () -> Assertions.assertEquals(4,calc.add(1,3)),
                () -> Assertions.assertEquals(3,calc.add(-1,3)),
                () -> Assertions.assertEquals(-4,calc.add(-1,-3)),
            () -> Assertions.assertEquals(2,calc.add(0,-3))

        );

    }


    @Test
    @DisplayName("Assert Fail Test Case")
    public void assertFailTest(){

        Assertions.fail("This Test Case is Failed");
    }



}
