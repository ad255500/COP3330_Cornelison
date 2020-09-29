import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexTest {

    @Test
    void test1() {
        BodyMassIndex bmi = new BodyMassIndex(72, 180);
        assertEquals("Normal", bmi.Cat());
    }

}