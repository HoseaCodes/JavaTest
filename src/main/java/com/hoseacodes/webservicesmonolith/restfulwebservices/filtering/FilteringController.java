package com.hoseacodes.webservicesmonolith.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("value1", "value2", "value3");
	}
	
	@GetMapping("/filtering2")
	public SomeBean2 retrieveSomeBean2() {
		return new SomeBean2("value1", "value2", "value3");
	}
	
	@GetMapping("/filtering-list")
	public List<SomeBean> retrieveListOfSomeBean() {
		return Arrays.asList(new SomeBean("value1", "value2", "value3"), 
				new SomeBean("value12", "value22", "value32"));
	}
	
	@GetMapping("/filtering-list2")
	public List<SomeBean2> retrieveListOfSomeBean2() {
		return Arrays.asList(new SomeBean2("value1", "value2", "value3"), 
				new SomeBean2("value12", "value22", "value32"));
	}

}
