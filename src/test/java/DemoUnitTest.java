import org.binaracademy.topic1.UnitTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

public class DemoUnitTest {

    UnitTest unitTest;

    @BeforeAll
    public static void initAll() {

    }

    @AfterAll
    public static void afterAll() {

    }

    @BeforeEach
    public void init() {
        unitTest = new UnitTest();
        System.out.println("Ini beforeEach");
    }

    @AfterEach
    public void tearDown() {
        unitTest = null;
        System.out.println("ini afterEach");
    }

    @Test
    @DisplayName("Test Tambah - Positive")
    public void testTambah() {
        System.out.println("Test Tambah - Positive");
        Integer hasil = unitTest.tambah(1, 1);
        Assertions.assertEquals(2, hasil);
    }

    @Test
    public void testKurang() {
        System.out.println("testKurang");
        Integer hasil = unitTest.kurang(5, 2);
        Assertions.assertEquals(3, hasil);
    }

    @Test
    public void testKurangYangSalah() {
        System.out.println("testKurangYangSalah");
        Integer hasil = unitTest.kurangYangSalah(5, 2);
        Assertions.assertEquals(3, hasil);
    }

    @Test
    public void testAppender_success() {
        System.out.println("testAppender_success");
        String hasil = unitTest.appender(10);
        Assertions.assertDoesNotThrow(() -> unitTest.appender(10));
        Assertions.assertEquals("aaaaaaaaaa", hasil);
        Assertions.assertNotNull(hasil);
        Assertions.assertEquals(10, hasil.length());
    }

    @Test
    public void testAppender_failed_null() {
        System.out.println("testAppender_failed_null");
        Assertions.assertThrows(NullPointerException.class, () -> unitTest.appender(null));
    }

    @Test
    public void testAppender_failed_lessThanZero() {
        System.out.println("testAppender_failed_lessThanZero");
        String hasil = unitTest.appender(0);
        Assertions.assertTrue(hasil.equals("salah"));
        Assertions.assertNotNull(hasil);
    }

    @Test
    public void testAppender_success_ganjil() {
        String hasil = Assertions.assertDoesNotThrow(() -> unitTest.appender(3));
        Assertions.assertTrue(hasil.equals("ganjil"));
        Assertions.assertNotNull(hasil);
    }

    @Test
    public void testAppender_failed_inputMismatch() {
        System.out.println("testAppender_failed_null");
        Assertions.assertThrows(InputMismatchException.class, () -> unitTest.appender(null));
    }

}
