package ch.coop.java.oop.person;

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


        Book book = new Book();
        book.setTitle("Title");
        book.setIsbn(1223);
        book.setAuthor("test-author");

        Book book2 = new Book();
        book2.setTitle("Title2");
        book2.setIsbn(122345);
        book2.setAuthor("test-author-2");

        System.out.println(book);


        Library library1 = new Library();
        library1.setBooks(new Book[]{book, book2});

        System.out.println(library1);

    }
}
