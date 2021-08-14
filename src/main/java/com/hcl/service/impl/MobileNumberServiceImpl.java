package com.hcl.service.impl;

import com.hcl.entity.MobileNumber;
import com.hcl.repository.MobileNumberRepository;
import com.hcl.service.MobileNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MobileNumberServiceImpl implements MobileNumberService {

    @Autowired
    private MobileNumberRepository repository;

    @Override
    public Page<MobileNumber> listMobileNumbers(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repository.findAll(pageable);
    }
}
