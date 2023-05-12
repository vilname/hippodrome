import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

class MainTest {
    @Disabled("Тест отключен")
    @Test
    @Timeout(value = 22, unit = TimeUnit.SECONDS)
    void mainTest() throws Exception {
        String[] str = new String[1];

        Main.main(str);
    }
}