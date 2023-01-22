package models;

import java.util.Arrays;

public class Reader {
    private String fio;
    private String faculty;
    private long readerNum;
    private String birthDate;
    private String phone;

    public Reader() {

    }

    public Reader(String fio, long readerNum, String faculty, String birthDate, String phone) {
        this.fio = fio;
        this.readerNum = readerNum;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public long getReaderNum() {
        return readerNum;
    }

    public void setReaderNum(int readerNum) {
        this.readerNum = readerNum;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void takeBook(int bookCount) {
        if (bookCount == 1) {
            System.out.printf("Студент %s из факультета %s взял %d книгу \n", fio, faculty, bookCount);
        } else if (bookCount > 1 && bookCount < 5) {
            System.out.printf("Студент %s из факультета %s взял %d книги \n", fio, faculty, bookCount);
        } else {
            System.out.printf("Студент %s из факультета %s взял %d книг \n", fio, faculty, bookCount);
        }
    }

    public void takeBook(Book[] books) {
        if (books.length == 1) {
            System.out.printf("Студент %s из факультета %s взял книгу %s \n", fio, faculty, books[0]);
        } else {
            System.out.printf("Студент %s из факультета %s взял книги %s \n", fio, faculty, new Book().booksInfo(books));
        }
    }

    public void takeBook(String[] books){
        if (books.length == 1) {
            System.out.printf("Студент %s из факультета %s взял книгу %s \n", fio, faculty, books[0]);
        } else {
            System.out.printf("Студент %s из факультета %s взял книги %s \n", fio, faculty, Arrays.toString(books).substring(1, Arrays.toString(books).length()-1));
        }
    }

    public void returnBook(int bookCount) {
        if (bookCount == 1) {
            System.out.printf("Студент %s из факультета %s вернул %d книгу \n", fio, faculty, bookCount);
        } else if (bookCount > 1 && bookCount < 5) {
            System.out.printf("Студент %s из факультета %s вернул %d книги \n", fio, faculty, bookCount);
        } else {
            System.out.printf("Студент %s из факультета %s вернул %d книг \n", fio, faculty, bookCount);
        }
    }

    public void returnBook(Book[] books) {
        if (books.length == 1) {
            System.out.printf("Студент %s из факультета %s вернул книгу %s \n", fio, faculty, books[0]);
        } else {
            System.out.printf("Студент %s из факультета %s вернул книги %s \n", fio, faculty, new Book().booksInfo(books));
        }
    }

    public void returnBook(String[] books){
        if (books.length == 1) {
            System.out.printf("Студент %s из факультета %s вернул книгу %s \n", fio, faculty, books[0]);
        } else {
            System.out.printf("Студент %s из факультета %s вернул книги %s \n", fio, faculty, Arrays.toString(books).substring(1, Arrays.toString(books).length()-1));
        }
    }

}
