package com.alamin.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.alamin.demo.dao.AlienRepo;
import com.alamin.demo.model.Alien;
@RestController
public class Controller {
	@Autowired
	AlienRepo repo;
	 @RequestMapping("/selectedAliens/{lang}")
	 @ResponseBody
	 public List<Alien> complexOp(@PathVariable("lang") String lang) {
		 
		 return repo.findByLangSorted(lang);
	 }

}
