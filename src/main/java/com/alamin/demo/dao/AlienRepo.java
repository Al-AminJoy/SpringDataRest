package com.alamin.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.alamin.demo.model.Alien;
@RepositoryRestResource(collectionResourceRel="aliens",path="aliens")
public interface AlienRepo extends JpaRepository<Alien,Integer> {
 @Query("from Alien where lang=?1 order by a_name")
 List<Alien> findByLangSorted(String lang);

}
