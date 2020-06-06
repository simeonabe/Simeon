package com.example.Simeon.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String Firstname;
    private String lastname;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(String firstname, String lastname) {
        Firstname = firstname;
        this.lastname = lastname;

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<book> getBooks() {
        return books;
    }

    public void setBooks(Set<book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "Id=" + Id +
                ", Firstname='" + Firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return Id != null ? Id.equals(author.Id) : author.Id == null;
    }

    @Override
    public int hashCode() {
        return Id != null ? Id.hashCode() : 0;
    }
}
