package com.pocketpay.transaction.service;
import com.pocketpay.transaction.dto.TransactionDto;
import com.pocketpay.transaction.entity.Transaction;
import com.pocketpay.transaction.repository.TransactionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService{
    @Autowired
    private TransactionRepository transactionRepository;

    private ModelMapper modelMapper;

    public  TransactionServiceImpl(){
        modelMapper = new ModelMapper();
    }

    @Override
    public TransactionDto createTransaction(TransactionDto transactionDto){

        Transaction transaction = modelMapper.map(transactionDto,Transaction.class);
        Transaction savedTransaction = transactionRepository.save(transaction);
        return modelMapper.map(savedTransaction,TransactionDto.class);

    }
    @Override
    public TransactionDto getTransactionById(Long id) {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        return modelMapper.map(transaction, TransactionDto.class);
    }

    @Override
    public List<TransactionDto> getAllTransaction(){

        List<Transaction> transaction = transactionRepository.findAll();
        System.out.println(transaction);
        System.out.println(transaction.stream()
                .map(transaction1->modelMapper.map(transaction,TransactionDto.class))
                .collect(Collectors.toList()));
        return transaction.stream()
                .map(data->modelMapper.map(data,TransactionDto.class))
                .collect(Collectors.toList());




    }
    @Override
    public void patchTransaction(Long id, Map<String, Object> updates) {
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow();
        applyUpdates(Optional.of(transaction), updates);
        transactionRepository.save(transaction);
    }

    private void applyUpdates(Optional<Transaction> transaction, Map<String, Object> updates) {
        for (Map.Entry<String, Object> entry : updates.entrySet()) {
            String propertyName = entry.getKey();
            Object value = entry.getValue();

            // Handle property updates based on your entity structure
            // For example, using reflection or specific setter methods
            // entity.setXXX(value);
        }
    }

}




