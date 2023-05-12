import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HippodromeTest {

    @Test
    public void constructorNullParamsTextException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Hippodrome(null)
        );

        assertEquals("Horses cannot be null.", exception.getMessage());
    }

    @Test
    public void constructorEmptyListParamsTextException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Hippodrome(new ArrayList<>())
        );

        assertEquals("Horses cannot be empty.", exception.getMessage());
    }

    @Test
    void getHorses() {
        List<Horse> horsesList = get30HorseList();
        Hippodrome hippodrome = new Hippodrome(horsesList);

        assertEquals(horsesList, hippodrome.getHorses());
    }

    @Test
    void move() {
        List<Horse> horsesList = get50HorseList();

        Hippodrome hippodrome = Mockito.mock(Hippodrome.class);
        hippodrome.move();

        Mockito.verify(hippodrome).move();
    }

    @Test
    void getWinner() {
        int maxDistance = 50;

        List<Horse> horsesList = get50HorseList();
        Hippodrome hippodrome = new Hippodrome(horsesList);
        Horse horse = hippodrome.getWinner();

        assertEquals(maxDistance, horse.getDistance());
    }

    private List<Horse> get30HorseList() {
        List<Horse> horsesList = new ArrayList<>();

        horsesList.add(new Horse("blue", 0, 0));
        horsesList.add(new Horse("red", 0, 0));
        horsesList.add(new Horse("Garry", 0, 0));
        horsesList.add(new Horse("Genry", 0, 0));
        horsesList.add(new Horse("Леонид", 0, 0));
        horsesList.add(new Horse("Федор", 0, 0));
        horsesList.add(new Horse("Самалет", 0, 0));
        horsesList.add(new Horse("Верталет", 0, 0));
        horsesList.add(new Horse("Суп", 0, 0));
        horsesList.add(new Horse("тарелка", 0, 0));
        horsesList.add(new Horse("Игорь", 0, 0));
        horsesList.add(new Horse("каракут", 0, 0));
        horsesList.add(new Horse("сирень", 0, 0));
        horsesList.add(new Horse("Апекс", 0, 0));
        horsesList.add(new Horse("Тиодор", 0, 0));
        horsesList.add(new Horse("Трумен", 0, 0));
        horsesList.add(new Horse("Звездочка", 0, 0));
        horsesList.add(new Horse("Лошадка", 0, 0));
        horsesList.add(new Horse("Пони", 0, 0));
        horsesList.add(new Horse("Луна", 0, 0));
        horsesList.add(new Horse("Изобилие", 0, 0));
        horsesList.add(new Horse("Серпентарий", 0, 0));
        horsesList.add(new Horse("Квадракоптер", 0, 0));
        horsesList.add(new Horse("Галерея", 0, 0));
        horsesList.add(new Horse("Тире", 0, 0));
        horsesList.add(new Horse("Дым", 0, 0));
        horsesList.add(new Horse("Поле", 0, 0));
        horsesList.add(new Horse("Леон", 0, 0));
        horsesList.add(new Horse("Топ", 0, 0));
        horsesList.add(new Horse("Бегун", 0, 0));

        return horsesList;
    }

    private List<Horse> get50HorseList() {
        List<Horse> horsesList = get30HorseList();

        horsesList.add(new Horse("Цвет", 0, 0));
        horsesList.add(new Horse("Мед", 0, 0));
        horsesList.add(new Horse("Дуб", 0, 0));
        horsesList.add(new Horse("Липа", 0, 0));
        horsesList.add(new Horse("Медведь", 0, 0));
        horsesList.add(new Horse("Лиса", 0, 0));
        horsesList.add(new Horse("Лист", 0, 0));
        horsesList.add(new Horse("Прилив", 0, 0));
        horsesList.add(new Horse("Сияние", 0, 50));
        horsesList.add(new Horse("Творение", 0, 0));
        horsesList.add(new Horse("Осень", 0, 0));
        horsesList.add(new Horse("Лето", 0, 0));
        horsesList.add(new Horse("Зима", 0, 0));
        horsesList.add(new Horse("Весна", 0, 0));
        horsesList.add(new Horse("Кофе", 0, 0));
        horsesList.add(new Horse("Край", 0, 0));
        horsesList.add(new Horse("Мера", 0, 0));
        horsesList.add(new Horse("Аршин", 0, 0));
        horsesList.add(new Horse("Куна", 0, 0));
        horsesList.add(new Horse("Крен", 0, 0));
        horsesList.add(new Horse("Лед", 0, 0));

        return horsesList;
    }
}