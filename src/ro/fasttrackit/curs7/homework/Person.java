package ro.fasttrackit.curs7.homework;

public class Person {
    private String name;
    private int age;
    private boolean married;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public int ageValid(int age) {
        if (age < 1) {
            return age = 1;
        } else {
            return age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String marriedValid() {
        if (married) {
            return "Married";
        } else {
            return "No married";
        }
    }
}
