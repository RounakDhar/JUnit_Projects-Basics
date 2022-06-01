import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class JunitMiscellaneousTest {

    private Calculator calc = new Calculator();

    @Nested
    class additionTests {


        @Test
        void additionTest1() {
            //Assertions.assertEquals(3, calc.add(1, 2),"Assertion Failed for Addition");
            Assertions.assertEquals(3, calc.add(1, 2), () -> "Assertion Failed for Addition");
        }

        @Test
        void additionTest2() {
            Assertions.assertEquals(-3, calc.add(-1, -2));
        }

        @Test
        void additionTest3() {
            Assertions.assertEquals(3, calc.add(-1, 2));
        }


        @Test
        void additionTest4(RepetitionInfo info) {

            if (info.getCurrentRepetition() == 2) {
                Assertions.assertEquals(3, calc.add(0, 2));
            } else {
                Assertions.assertEquals(6, calc.add(4, 2));
            }
        }


        @Test
        @RepeatedTest(3)
        void multiply() {
            Assertions.assertEquals(3, calc.multiply(0, 2));
        }

        @EnabledOnOs(OS.WINDOWS)
        @Test
        void divide() {
            //boolean needToDivide = true;
            boolean needToDivide = false;


            Assumptions.assumeTrue(needToDivide);
            Assertions.assertEquals(2, calc.divide(10, 5));
        }
    }
}
