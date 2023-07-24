package com.example.obrestdatajpa.services;

import com.example.obrestdatajpa.entities.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookPriceCalculatorTest {

    @Test
    void calculatePriceTest() {
        //Configuración de la prueba
        Book book = new Book(1L, "Copa Mundial", "Iván Merlano", 450, 49.99, LocalDate.now(), true);
        BookPriceCalculator calculator = new BookPriceCalculator();

        // Se ejecuta el comportamineto a testear
        double price = calculator.calculatePrice(book);
        System.out.println(price);

        //Comprobando asserciones
        assertTrue(price > 0);
        assertEquals(57.980000000000004, price);
    }
}