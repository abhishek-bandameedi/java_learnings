package com.pocketpay.transaction.controller;

import com.pocketpay.transaction.dto.TransactionDto;
import com.pocketpay.transaction.entity.Transaction;
import com.pocketpay.transaction.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<TransactionDto>> getAllTransaction() {
        List<TransactionDto> transaction = transactionService.getAllTransaction();
        return new ResponseEntity<>(transaction, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<TransactionDto> getTransactionById(@PathVariable Long id) {

        TransactionDto transactionDto = transactionService.getTransactionById(id);
        return new ResponseEntity<>(transactionDto, HttpStatus.OK);

    }
    @PostMapping("")
    public ResponseEntity<TransactionDto> createTransaction(@RequestBody TransactionDto transactionDto){
        TransactionDto savedTransactionDto = transactionService.createTransaction(transactionDto);
        return new ResponseEntity<>(savedTransactionDto,HttpStatus.CREATED);
    }

}

