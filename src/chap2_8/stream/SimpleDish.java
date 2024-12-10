package chap2_8.stream;

import java.util.Objects;

public class SimpleDish {

    private String name;
    private int calories;

    public SimpleDish() {
    }

    public SimpleDish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SimpleDish that = (SimpleDish) o;
        return calories == that.calories && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, calories);
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }

    public SimpleDish(Dish dish)  {
        this.name = dish.getName();
        this.calories = dish.getCalories();
    }
}
