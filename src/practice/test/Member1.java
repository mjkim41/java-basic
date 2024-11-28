package practice.test;

import java.util.UUID;

public class Member1 {

    String name;
    int age;
    Gender1 gender;
    String identifier;

    Member1(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = Gender1.fromString(gender);
        this.identifier = UUID.randomUUID().toString();
    }


    public void inform() {
        System.out.println(
                "Member1{\n" +
                "name:" + name + "\n" +
                "age:" + age + '\n' +
                "gender:" + gender +  '\n' +
                "identifier:" + identifier + '\n');
    }

    @Override
    public String toString() {
        return "Member1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", identifier='" + identifier + '\'' +
                '}';
    }
}
