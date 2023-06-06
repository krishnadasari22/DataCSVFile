package com.example.DataCSVFile.controller;

import com.example.DataCSVFile.model.Data;
import com.example.DataCSVFile.repository.DataRepository;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {
    @Autowired
    private DataRepository dataRepository;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadCSVFile(@RequestParam("file") MultipartFile file) throws IOException, CsvException {
        try (CSVReader reader = new CSVReader(new InputStreamReader(file.getInputStream()))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                // Process each row of the CSV file and save it to the database
                Data data = new Data();
                data.setIntensity(Integer.parseInt(nextLine[0]));
                data.setLikelihood(Integer.parseInt(nextLine[1]));
                data.setRelevance(Integer.parseInt(nextLine[2]));
                data.setYear(Integer.parseInt(nextLine[3]));
                data.setCountry(nextLine[4]);
                data.setTopics(nextLine[5]);
                data.setRegion(nextLine[6]);
                data.setCity(nextLine[7]);
                dataRepository.save(data);
            }
            return ResponseEntity.ok("CSV file uploaded and processed successfully.");
        }
    }
}

