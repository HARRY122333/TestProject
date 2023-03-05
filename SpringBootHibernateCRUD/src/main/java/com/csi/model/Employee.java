package com.csi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    private String empName;

    private long empContactNumber;

    private String empAddress;


}
