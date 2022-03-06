package com.example.app.Services;

import com.example.app.Objects.Borrowing;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class BorrowingService {
    BookService bookService;
    CustomerService customerService;

    public BorrowingService(BookService bookService, CustomerService customerService) {
        this.bookService = bookService;
        this.customerService = customerService;
    }

    /*
    private final List<Borrowing> borrowings= new ArrayList<>();

    public Borrowing getBorrowingbyId(@PathVariable Integer borrowingId){
        return borrowings.get(borrowingId-1);
    }
    public List<Borrowing> getBorrowings(){
        return borrowings;
    }


    public Borrowing createBorrowing(@RequestBody Borrowing borrowing) {
        borrowing.book = bookService.getBook(borrowing.getBookId());
        borrowing.user = customerService.getCustomersById(borrowing.getCustomerId());
        borrowings.add(borrowing);
        borrowing.id = borrowings.indexOf(borrowing) + 1;
        return borrowing;
    }
    public void deleteBorrowing(@RequestParam Integer borrowingId){
        borrowings.remove(borrowingId-1);
    }*/

}
