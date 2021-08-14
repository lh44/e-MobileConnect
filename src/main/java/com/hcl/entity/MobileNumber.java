package com.hcl.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MobileNumber {

    @Id
    private String mobileNumber;

    @Column
    @Enumerated(EnumType.STRING)
    private MobileNumberStatus status = MobileNumberStatus.NEW;

    //plan_id
}
