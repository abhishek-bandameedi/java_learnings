package com.pocketpay.transaction.service;
import com.pocketpay.transaction.dto.RecipientDto;
import com.pocketpay.transaction.entity.Recipient;
import com.pocketpay.transaction.repository.RecipientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipientServiceImpl implements RecipientService{
    @Autowired
    private RecipientRepository recipientRepository;

    private ModelMapper modelMapper;

    public void RecipientServiceimpl(){
        modelMapper = new ModelMapper();
    }

    @Override
    public RecipientDto createRecipient(RecipientDto recipientDto){

        Recipient recipient = modelMapper.map(recipientDto,Recipient.class);
        Recipient savedRecipient = recipientRepository.save(recipient);
        return modelMapper.map(savedRecipient,RecipientDto.class);

    }

    @Override
    public List<RecipientDto> getAllRecipient(){

        List<Recipient> recipient = recipientRepository.findAll();
        System.out.println(recipient);
        System.out.println(recipient.stream()
                .map(recipient1->modelMapper.map(recipient,RecipientDto.class))
                .collect(Collectors.toList()));
        return recipient.stream()
                .map(data->modelMapper.map(data,RecipientDto.class))
                .collect(Collectors.toList());




    }

}


