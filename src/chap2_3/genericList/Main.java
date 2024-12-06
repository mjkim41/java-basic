package chap2_3.genericList;

public class Main {

    public static void main(String[] args) {

        GenericList<String> foods = new GenericList<>();
        foods.push("짬뽕");
        foods.push("짜장");
        foods.push("볶음밥");

        foods.pop();

        System.out.println("foods = " + foods);

        GenericList<Integer> numbers = new GenericList<>(10, 20, 30);
        numbers.push(50);
        numbers.push(70);

        numbers.pop();
        numbers.pop();
        numbers.pop();

        System.out.println("numbers = " + numbers);

        GenericList<Frog> frogList = new GenericList<>();
        frogList.push(new Frog("케로로", 30, "초록"));

    }

}

class Frog {
    String name;
    double height;
    String color;

    public Frog(String name, double height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Frog{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
