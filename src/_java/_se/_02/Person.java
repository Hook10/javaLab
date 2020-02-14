package _java._se._02;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public int compareTo(Person anotherPerson) {
        int anotherPersonAge = anotherPerson.getAge();
        return this.age - anotherPersonAge;
    }

    private int getAge() {
        return 0;

    }
}
