
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Objects.isNull;

public class Hippodrome {

    private final List<Horse> horses;
    private static final Logger logger = LoggerFactory.getLogger(Hippodrome.class);

    public Hippodrome(List<Horse> horses) {

        logger.info("Начало скачек. Количество участников: " + horses.size());

        if (isNull(horses)) {
            throw new IllegalArgumentException("Horses cannot be null.");
        } else if (horses.isEmpty()) {
            throw new IllegalArgumentException("Horses cannot be empty.");
        }

        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return Collections.unmodifiableList(horses);
    }

    public void move() {
        horses.forEach(Horse::move);
    }

    public Horse getWinner() {
        return horses.stream()
                .max(Comparator.comparing(Horse::getDistance))
                .get();
    }
}
