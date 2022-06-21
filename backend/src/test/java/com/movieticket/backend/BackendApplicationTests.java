package com.movieticket.backend;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.movieticket.backend.entity.Province;
import com.movieticket.backend.repository.ProvinceRepository;

@SpringBootTest
class BackendApplicationTests {
	@Autowired
	ProvinceRepository provinceRepository;

	@Test
	void contextLoads() {
		
	}

}
