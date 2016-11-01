package Task10.service;

import Task10.model.BananaMonkey;
import Task10.model.Branch;
import Task10.model.Calculation;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class MonkeyService {
    public static void main(String[] args) {
        Branch tree = createTree(FruitType.COCOS.name());
        Calculation monkey = new BananaMonkey();
        int result = calculate(monkey, tree);
    }

    public int calculate(Calculation monkey, Branch tree) {
        return monkey.calculate(tree);
    }

    public static Branch createTree(String type) {
        Branch tree = new Branch();
        List<Branch> children = new ArrayList<>();

        for(int i = 0; i<4; i++) {

        }

        List<Branch> children = new ArrayList<>();
        tree.setBranches(children1);

        List<Fruit> fruits = new ArrayList<>();

        for(int i = 1; i<10; i++) {
            fruits.add(new Fruit("cocos"));
        }
        for(int i = 1; i<5; i++) {
            fruits.add(new Fruit("banana"));
        }
        return tree;
    }
        public static Branch createTree(Branch tree, String type) {
            Branch child1 = new Branch();
            Branch child2 = new Branch();
            Branch child3 = new Branch();

        List<Branch> children = new ArrayList<>();
        tree.setBranches(children);
        return tree;

}
public enum Fruit {
        COCOS,
        BANANA;
    }
}
