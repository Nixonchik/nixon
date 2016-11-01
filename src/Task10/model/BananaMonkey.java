package Task10.model;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class BananaMonkey extends AbstractMonkey {

    private  final String type = "BANANA";

    @Override
    protected boolean isCalculatable(Fruit fruit) {
        return TYPE.equals(fruit.getType().name());
    }
}
