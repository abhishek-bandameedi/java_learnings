package com.pocketpay.transaction.service;
import com.pocketpay.transaction.dto.OwnerDto;
import com.pocketpay.transaction.entity.Owner;
import com.pocketpay.transaction.repository.OwnerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerServiceImpl implements OwnerService{
    @Autowired
    private OwnerRepository ownerRepository;

    private ModelMapper modelMapper;

    public void OwnerServiceimpl(){
        modelMapper = new ModelMapper();
    }

    @Override
    public OwnerDto createOwner(OwnerDto ownerDto){

        Owner owner = modelMapper.map(ownerDto,Owner.class);
        Owner savedOwner = ownerRepository.save(owner);
        return modelMapper.map(savedOwner,OwnerDto.class);

    }

    @Override
    public List<OwnerDto> getAllOwner(){

        List<Owner> owner = ownerRepository.findAll();
        System.out.println(owner);
        System.out.println(owner.stream()
                .map(owner1->modelMapper.map(owner,OwnerDto.class))
                .collect(Collectors.toList()));
        return owner.stream()
                .map(data->modelMapper.map(data,OwnerDto.class))
                .collect(Collectors.toList());




    }

}
