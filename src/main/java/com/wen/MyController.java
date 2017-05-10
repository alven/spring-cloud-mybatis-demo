package com.wen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	CityMapper city;
	
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	public String query(@RequestParam(value = "id") String id){
		return city.queryByid(id);
	}
	
}
