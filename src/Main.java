import models.*;


public class Main {
    public static void main(String[] args) {
        Book hp = new Book("J. Rouling", "Harry Potter");
        Book interstellar = new Book("Kip Thorn", "Interstellar");
        Book holms = new Book("Arthur Conan Doyle", "Sherlock Holms");

        System.out.println("________________________________________________________");

        Reader student1 =new Reader("David Ackerman", 123456L, "ML", "29112000", "0755981698");
        student1.takeBook(6);
        student1.takeBook(new Book[]{hp, interstellar, holms});
        student1.returnBook(1);
        student1.returnBook(new String[]{holms.getName()});

        System.out.println("________________________________________________________");

        Reader student2 = new Reader("Adam Tomson", 234567L, "PI", "24092001", "0770678945");
        student2.takeBook(new String[]{hp.getName(), interstellar.getName(), "All About Love"});
        student2.returnBook(2);
        student2.returnBook(new Book[]{hp, interstellar});
    }
}