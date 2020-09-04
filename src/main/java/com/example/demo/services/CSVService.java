package com.example.demo.services;

import com.example.demo.data.entity.Customers;
import com.example.demo.data.repository.CustomersRepo;
import com.example.demo.utility.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CSVService {
    @Autowired
    CustomersRepo customersRepo;

    public void save(MultipartFile file) {
        if(Helper.CSV_TYPE.equals(file.getContentType())) {
            try {
                List<Customers> customers = Helper.csvToCustomers(file.getInputStream());
                customersRepo.saveAll(customers);
            } catch (IOException e) {
                throw new RuntimeException("fail to store csv data: " + e.getMessage());
            }
        } else if(Helper.XML_TYPE.equals(file.getContentType())){
            try {
                List<Customers> customers = Helper.xmlToCustomers(file);
                customersRepo.saveAll(customers);
            } catch (Exception e) {
                throw new RuntimeException("fail to store xml data: " + e.getMessage());
            }
        }

    }
}