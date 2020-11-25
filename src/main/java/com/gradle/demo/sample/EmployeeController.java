package com.gradle.demo.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the Employee service.
 */
@Controller
public class EmployeeController {

	@RequestMapping(value = "/api/sample", method = RequestMethod.GET)
	public @ResponseBody void getDummyEmployee() {

		System.out.println("");

	}
}
