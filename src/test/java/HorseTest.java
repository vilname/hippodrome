import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class HorseTest {
//    @Test
//    public void constructorNullParamsException() {
//        assertThrows(
//                IllegalArgumentException.class,
//                () -> new Horse(null, 0, 0)
//        );
//    }

    @Test
    public void constructorNullParamsTextException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Horse(null, 0, 0)
        );

        assertEquals("Name cannot be null.", exception.getMessage());
    }

//    @ParameterizedTest
//    @ValueSource(strings = { "", " ", "\t" })
//    public void constructorEmptyParamsException(String argument)
//    {
//        assertThrows(
//                IllegalArgumentException.class,
//                () -> new Horse(argument, 0, 0)
//        );
//    }

    @ParameterizedTest
    @ValueSource(strings = { "", " ", "\t" })
    public void constructorEmptyParamsTextException(String argument)
    {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Horse(argument, 0, 0)
        );

        assertEquals("Name cannot be blank.", exception.getMessage());
    }

    @Test
    public void constructorNegativeSecondParameterTextException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Horse("name", -1, 0)
        );

        assertEquals("Speed cannot be negative.", exception.getMessage());
    }

    @Test
    public void constructorNegativeThirdParameterTextException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Horse("name", 0, -1)
        );

        assertEquals("Distance cannot be negative.", exception.getMessage());
    }

    @Test
    public void gettersConstructorParams() {
        String name = "Геворг";
        double speed = 5.5;
        double distance = 7.5;

        Horse horse = new Horse(name, speed, distance);

        assertEquals(name, horse.getName());
        assertEquals(speed, horse.getSpeed());
        assertEquals(distance, horse.getDistance());
    }

    @Test
    public void move()
    {
        Horse horse = Mockito.mock(Horse.class);
        horse.move();

        Mockito.verify(horse).move();
    }
}