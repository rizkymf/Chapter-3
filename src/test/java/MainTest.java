import org.binaracademy.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainTest {

    @Test
    public void testMain() {
        Assertions.assertThrows(NullPointerException.class, () -> Main.main(null));
    }

    @Test
    public void testScanner() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        org.binaracademy.topic4.Test t = new org.binaracademy.topic4.Test();
        t.testing();
    }
}
