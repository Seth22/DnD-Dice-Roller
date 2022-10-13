import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Test 1: Set Max")
    void test1() {
    Main.setMax(10);
    assertEquals(Main.getMax(),10);
    Main.setMax(200);
    assertEquals(Main.getMax(),200);
    System.out.println("Test 1 passed! Set Max is working!");
    }
    @Test
    @DisplayName("Test 2: Set Random")
    void test2() {
        Main.setRandom(39);
        assertEquals(Main.getRandom(),39);
        Main.setRandom(739);
        assertEquals(Main.getRandom(),739);
        System.out.println("Test 2 passed! Set Random is working!");
    }
    @Test
    @DisplayName("Test 3: Min test")
    void test3() {
        assertEquals(Main.min,1);
        System.out.println("Test 3 passed! Min is 1");
    }
    @Test
    @DisplayName("Test 4: digit puller ")
    void test4() {
        assertEquals(4,49/10);
        assertEquals(9,49%10);

        assertEquals(9,99/10);
        assertEquals(9,99%10);

        assertEquals(9,98/10);
        assertEquals(8,98%10);

        assertEquals(9,978/100);
        assertEquals(7,((978%100)/10));
        assertEquals(8,978%10);

        assertEquals(9,999/100);
        assertEquals(9,((999%100)/10));
        assertEquals(9,999%10);

        System.out.println("Test 4 passed! Digit puller works!");
    }
}