package com.fernedisx.edisson_practica.repository;

import com.fernedisx.edisson_practica.model.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO,String> {


        }