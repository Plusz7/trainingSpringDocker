package com.example.demo.utility;

import com.example.demo.data.entity.Customers;
import org.apache.commons.csv.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static String CSV_TYPE = "text/csv";
    public static String XML_TYPE = "xml";

    public static boolean hasCSVFormat(MultipartFile file) {

        if (!CSV_TYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }    public static boolean hasXMLFormat(MultipartFile file) {

        if (!XML_TYPE.equals(file.getContentType())) {
            return false;
        }
        return true;
    }

    public static List<Customers> csvToCustomers(InputStream is) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
             CSVParser csvParser = new CSVParser(fileReader,
                     CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim())) {

            List<Customers> listCustomers = new ArrayList<>();

            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for(CSVRecord csvRecord : csvRecords){
                Customers customers = new Customers(
                        csvRecord.get("Name"),
                        csvRecord.get("Surname"),
                        csvRecord.get("Age"),
                        csvRecord.get("City")
                );
                listCustomers.add(customers);
            }

            return listCustomers;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }

    public static List<Customers> xmlToCustomers(MultipartFile file){

        List<Customers> listCustomers = new ArrayList<>();

        return listCustomers;
    }
}