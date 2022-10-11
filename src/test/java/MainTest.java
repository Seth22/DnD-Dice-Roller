import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Test 1: Max set test")
    void test1() {
        Main.setMax(10);
        assertEquals(Main.getMax(),10);
        Main.setMax(15);
        assertEquals(Main.getMax(),15);
        System.out.println("Test 1 passed");
    }

}