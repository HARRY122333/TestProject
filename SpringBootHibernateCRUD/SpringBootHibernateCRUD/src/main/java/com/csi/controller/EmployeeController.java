package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/savedata")
    public String saveData(@RequestBody Employee employee)
    {
        log.info("*************Trying to save data fro Employee: "+employee.getEmpName());
        employeeServiceImpl.saveData(employee);
        return "Data Saved Successfully";
    }

    @GetMapping("/getdata")
    public List<Employee> getAllData()
    {
        return employeeServiceImpl.getAllData();
    }

    @PutMapping("/updatedata/{empId}")
    public String updateData(@PathVariable int empId, @RequestBody Employee employee)
    {
        log.info("***********Trying to update data fro Employee: "+employee.getEmpName());
        employeeServiceImpl.updateData(empId, employee);
        return "Update Data Successfully";
    }

    @DeleteMapping("/deletedata/{empId}")
    public String deleteData(@PathVariable int empId)
    {
        employeeServiceImpl.deleteData(empId);
        return "Data Deleted Successfully";
    }
}
