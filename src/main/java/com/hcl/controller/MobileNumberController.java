package com.hcl.controller;

import com.hcl.entity.MobileNumber;
import com.hcl.service.MobileNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mobile-numbers")
public class MobileNumberController {

    @Autowired
    private MobileNumberService service;

    @GetMapping
    public Page<MobileNumber> listMobileNumbers(@RequestParam int page, @RequestParam int size) {
        return service.listMobileNumbers(page, size);
    }
}
