package com.hcl.service;

import com.hcl.entity.MobileNumber;
import org.springframework.data.domain.Page;

public interface MobileNumberService {

    Page<MobileNumber> listMobileNumbers(int page, int size);
}
