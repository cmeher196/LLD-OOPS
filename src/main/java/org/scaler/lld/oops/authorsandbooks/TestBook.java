package org.scaler.lld.oops.authorsandbooks;

public class TestBook {

    public static void main(String[] args) {
        Author anAuthor = new Author("Chandra Meher","meher@gmail.com",'m');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);

        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthorName());

        System.out.println(aBook);
    }
}
