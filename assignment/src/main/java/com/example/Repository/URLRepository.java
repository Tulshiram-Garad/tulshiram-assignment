package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.Entity.URLData;

public interface URLRepository extends CrudRepository<URLData, Long>{

}
