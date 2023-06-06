package com.example.DataCSVFile.repository;

import com.example.DataCSVFile.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
    // Add any custom query methods if needed
}



