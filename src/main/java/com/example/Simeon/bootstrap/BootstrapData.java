package com.example.Simeon.bootstrap;

import com.example.Simeon.domain.Author;
import com.example.Simeon.domain.Book;
import com.example.Simeon.domain.Publisher;
import com.example.Simeon.repositories.AuthorRepository;
import com.example.Simeon.repositories.BookRepository;
import com.example.Simeon.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {


    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository PublisherRepository;

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new publisher();
        publisher.setName("Hellopublishing");
        publisher.setCity("Riga");

        PublisherRepository.save(publisher);

        System.out.println("Publisher Count:"+ publisherRepository.count());


        Author eric = new Author("Eric","evans");
        Book ddd = new Book("DomainDrivendesign", "32123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);
        publisherRepository.save(Publisher);


        authorRepository.save(eric);
        bookRepository.save(ddd);


        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development withoutEJB", "34564336789");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books:" +bookRepository.count());
        System.out.println("Publisher number of Books" +publisher.getBooks().size());


    }
}
