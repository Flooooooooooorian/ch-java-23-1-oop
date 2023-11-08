package person;

import person.Person;

public class Main {

    public static void main(String[] args) {
        Person daniel = new Person("Daniel", 30, "m");

        daniel.introduce();

        daniel.setAge(31);

        System.out.println(daniel.getAge());
        System.out.println(daniel.getName());
        System.out.println(daniel.getGender());

        System.out.println(daniel);

        Person daniel2 =  new Person("Daniel", 31, "m");

        System.out.println(daniel2);

        if (daniel.getAge() >= daniel2.getAge()) {
            System.out.println("Daniel ist älter");
        }
        else {
            System.out.println("Florian ist älter");
        }


        if (daniel2.equals(daniel)) {
            System.out.println("Daniel und Florian sind die gleiche Person");
        }
        else {
            System.out.println("Sind nicht gleich!");
        }

    }
}
