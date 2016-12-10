package com.sjostric.boot.calc.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjostric.boot.calc.domain.Calculation;

/**
 * REST resources
 */
@RestController
public class CalcController {

	private static final Logger logger = LoggerFactory.getLogger(CalcController.class);

	@RequestMapping("calc/add/{a}/{b}")
	public Integer add(@PathVariable Integer a, @PathVariable Integer b) {
		logger.info(String.format("Doing addition: %s + %s", a, b));
		return new Calculation(a, b, Calculation.OP.ADD).calc().result();
	}

}
