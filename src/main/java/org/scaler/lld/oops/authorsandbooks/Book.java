package org.scaler.lld.oops.authorsandbooks;

public class Book {
    private String name;
    private double price;
    private int qtyInStock;
    private Author author;

    public Book (String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;


    }
    public Book (String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

//    public methods getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock().
    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getAuthorName(){
        return this.author.getName();
    }

//    Printing the name and email of the author from a Book instance.
//    (Hint: aBook.getAuthor().getName(), aBook.getAuthor().getEmail()).

//    public Author get

    //toString() that returns "'book-name' by author-name (gender) at email".
    public String toString(){
        return name+" "+author;
    }

}
