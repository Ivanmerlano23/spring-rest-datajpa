package com.example.obrestdatajpa;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repositories.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);
        BookRepository repository = context.getBean(BookRepository.class);

        Book book1 = new Book(null, "Código Limpio", "Iván Merlano", 400, 40.8, LocalDate.of(2020, 02, 25), true);
        Book book2 = new Book(null, "Sangre de Campeones", "Iván Merlano", 300, 20.6, LocalDate.of(2021, 02, 23), false);
        Book book3 = new Book(null, "Amor a Primera Vista", "Iván Merlano", 250, 199.4, LocalDate.of(2023, 06, 12), true);

        repository.save(book1);
        repository.save(book2);
        repository.save(book3);

        System.out.println(repository.findAll());
	}

}
