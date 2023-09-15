import org.binaracademy.topic3.Lambda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LambdaTest {

    Lambda lambda;

    @BeforeEach
    void init() {
        lambda = new Lambda();
    }

    @Test
    public void testContohLambda() {
        lambda.contohLambda();
    }
}
