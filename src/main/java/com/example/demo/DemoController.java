package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    // BOOK-------------------------------------------
    private final List<Book> books = new ArrayList<>();

    @GetMapping("/api/books")
    public List<Book> getBooks(){

        return books;
    }

    @DeleteMapping("/api/books/{bookId}")
        public void deleteBook(@RequestParam Integer bookId){
            books.remove(bookId-1);
    }
    @PutMapping("/api/books/{bookId}")
        public Book updateBook(@RequestParam Integer bookId, @RequestBody Book book){
        book.id = bookId;
        books.set(bookId-1,book);
        return book;
    }


    @PostMapping("/api/books")
    public Book createBook(@RequestBody Book book){
        books.add(book);
        book.id = books.indexOf(book)+1;
        return book;
    }
    @GetMapping("/api/books/{bookId}")
    public Book getBookById(@RequestParam Integer bookId){
        return books.get(bookId-1);
    }
    // BOOK-------------------------------------------

    //Customers----------------------------------------
    private final List<Customer> customers = new ArrayList<>();
    @GetMapping("/api/customers")
    public List<Customer> getCustomers(){

        return customers;
    }
    @PostMapping("/api/customers")
    public List<Customer> createCustomers(@RequestBody Customer customer){
        customers.add(customer);
        customer.id = customers.indexOf(customer)+1;
        return customers;
    }

     @GetMapping("/api/customers/{customerId}")
    public Customer getCustomersById(@RequestParam Integer customerId ){
        return customers.get(customerId-1);

    }
    @DeleteMapping("/api/customers/{customerId}")
    public void deleteCustomers(@RequestParam Integer customerId){
        customers.remove(customerId-1);
    }
    @PutMapping("/api/customers/{customerId}")
    public Customer updateCustomers(@RequestParam Integer customerId, @RequestBody Customer customer){
        customer.id = customerId;
        customers.set(customerId-1,customer);
        return customer;
    }
    //Customers----------------------------------------
    // BORROWING-------------------------------------------
    private final List<Borrowing> borrowings= new ArrayList<>();

    @GetMapping("/api/borrowings")
    public List<Borrowing> getBorrowings(){
        return borrowings;
    }

    @GetMapping("/api/borrowings/{borrowingId}")
    public Borrowing getBorrowingById(@RequestParam Integer borrowingId){
        return borrowings.get(borrowingId-1);
    }

    @PostMapping("/api/borrowings")
    public Borrowing createBorrowing(@RequestBody Borrowing borrowing) {
        borrowings.add(borrowing);
        borrowing.id = borrowings.indexOf(borrowing) + 1;
        borrowing.book = getBookById(borrowing.getBookId());
        borrowing.user = getCustomersById(borrowing.getCustomerId());
        return borrowing;
    }

    @DeleteMapping("/api/borrowings/{borrowingId}")
    public void deleteBorrowing(@RequestParam Integer borrowingId){
        borrowings.remove(borrowingId-1);
    }
    // BORROWING-------------------------------------------




}
