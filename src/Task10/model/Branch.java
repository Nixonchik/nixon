package Task10.model;

import java.util.List;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class Branch {
    List<Branch> branches;

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    List<Fruit> fruits;

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}
