import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {
    private static final Logger log = LoggerFactory.getLogger(MathUtilsTest.class);

    @BeforeAll
    public static void setUpBeforeClass() {
        log.info("=== Bat dau MathUtilsTest ===");
    }

    @AfterAll
    public static void tearDownAfterClass() {
        log.info("=== Ket thuc ===");
    }

    @Test
    @DisplayName("Kiem tra max khi a > b")
    public void testMax_AGreaterThanB() {
        assertEquals(5, MathUtils.max(5, 3));
    }

    @Test
    @DisplayName("Kiem tra max khi a = b")
    public void testMax_AEqualsB() {
        assertEquals(4, MathUtils.max(4, 4));
    }

    @Test
    @DisplayName("Kiem tra max khi a < b")
    public void testMax_ALessThanB() {
        assertEquals(8, MathUtils.max(2, 8));
    }

    @Test
    @DisplayName("Kiem tra max voi gia tri bien Integer.MAX_VALUE")
    public void testMax_MaxValue() {
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, 0));
    }

    @Test
    @DisplayName("Kiem tra max voi gia tri bien Integer.MIN_VALUE")
    public void testMax_MinValue() {
        assertEquals(0, MathUtils.max(Integer.MIN_VALUE, 0));
    }

    @Test
    @DisplayName("Kiem tra divide khi b > 0")
    public void testDivide_BGreaterThanZero() {
        assertEquals(5, MathUtils.divide(10, 2));
    }

    @Test
    @DisplayName("Kiem tra divide khi b < 0")
    public void testDivide_BLessThanZero() {
        assertEquals(-5, MathUtils.divide(10, -2));
    }

    @Test
    @DisplayName("Kiem tra ngoai le divide khi b = 0")
    public void testDivide_BEqualsZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.divide(10, 0);
        });
        assertEquals("Divider must not be zero", exception.getMessage());
    }

    @Test
    @DisplayName("Kiem tra phep tru")
    public void testSubtract() {
        assertEquals(2, MathUtils.subtract(5, 3));
        assertEquals(-5, MathUtils.subtract(0, 5));
        assertEquals(0, MathUtils.subtract(10, 10));
    }

    @Test
    @DisplayName("Kiem tra phep nhan")
    public void testMultiply() {
        assertEquals(15, MathUtils.multiply(5, 3));
        assertEquals(0, MathUtils.multiply(10, 0));
        assertEquals(-8, MathUtils.multiply(2, -4));
        assertEquals(12, MathUtils.multiply(-3, -4));
    }

    @Test
    @DisplayName("Kiem tra so duong")
    public void testIsPositive() {
        assertEquals(true, MathUtils.isPositive(5));
        assertEquals(false, MathUtils.isPositive(-1));
        assertEquals(false, MathUtils.isPositive(0));
    }
}