import org.junit.jupiter.api.DisplayName;
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

}