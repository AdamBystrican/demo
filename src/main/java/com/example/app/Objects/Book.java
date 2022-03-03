package com.example.app.Objects;

public class Book {

    public long id;
    public String authorFirstName;
    public String authorLastName;
    public String name;
    public String isbn;
    public int BookCount;

    public void setId(long id) {
        this.id = id;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBookCount(int bookCount) {
        BookCount = bookCount;
    }

    public long getId() {
        return id;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getBookCount() {
        return BookCount;
    }

    public Book(){
    }

}
