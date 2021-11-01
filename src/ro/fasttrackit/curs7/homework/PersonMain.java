package ro.fasttrackit.curs7.homework;

//Exercises 1 and 2

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Ioan Marcu", 45, true);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.marriedValid());
        System.out.println();

        Person person1 = new Person("Gica Muresan", 65, false);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.marriedValid());
        System.out.println();

        Person person2 = new Person("Gina Geta", 23, false);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.marriedValid());
        System.out.println();

        Person person3 = new Person("Ion Ficus", 2, false);
        System.out.println(person3.getName());
        System.out.println(person3.getAge());
        System.out.println(person3.marriedValid());
    }
}
