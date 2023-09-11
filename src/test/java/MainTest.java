import org.binaracademy.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testMain() {
        Assertions.assertThrows(NullPointerException.class, () -> Main.main(null));
    }
}
