package Task10.model;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class Fruit {
    private final FruitType type;

    public Fruit(String type) {
        this.type = FruitType.valueOf(type);
    }

    public String getType() {
        return type;
    }

}
