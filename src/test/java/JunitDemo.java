import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JunitDemo {

    //private short expected;

//    @BeforeAll
//    static void beforeClass(){
//        System.out.println("Running....before class");
//    }

    void beforeEach() {
        System.out.println("Running....before each");
    }

    @Test
    @DisplayName("Hello World Test Cases")
    @Disabled
    void junitTest1() {
        String actualValue = "Hello World";
        Assertions.assertEquals("Hello World", actualValue);
    }

    @Test
    @DisplayName("Coding Simplified Test Cases")
    void junitTest2() {
        String actualValue = "Coding Simplified";
        Assertions.assertEquals("Coding Simplified", actualValue);
    }

//    @AfterAll
//    static void afterAll(){
//        System.out.println("Running....after class");
//    }


    void afterEach() {
        System.out.println("Running....after each");
    }

}