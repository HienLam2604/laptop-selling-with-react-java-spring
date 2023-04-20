package com.example.JavaSpring.repository;

import com.example.JavaSpring.models.CategoryModel;
import com.example.JavaSpring.models.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<CategoryModel,String> {

    @Query("{cateID:/?0/}") //SELECT * FROM Product WHERE ProID = ?0
    CategoryModel getCateByID(String cateID);

}
