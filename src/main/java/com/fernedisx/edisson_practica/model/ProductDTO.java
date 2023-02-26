package com.fernedisx.edisson_practica.model;

import lombok.Data;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class ProductDTO {

    @Id
    private String _id;

    private String name;

    private Double price;

    private LocalDate expiry_date;

}
