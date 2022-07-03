package com.movieticket.backend;

import java.util.ArrayList;
import java.util.List;

import com.movieticket.backend.entity.Cinema;
import com.movieticket.backend.repository.CinemaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.movieticket.backend.entity.Province;
import com.movieticket.backend.repository.ProvinceRepository;

@SpringBootTest
class BackendApplicationTests {
	@Autowired
	CinemaRepository cinemaRepository;

	@Autowired
	ProvinceRepository provinceRepository;

//	@Test
//	void tes1() {
//		System.out.println(cinemaRepository.findAll());
//	}
	@Test
	void tes2() {
		List<Province> list = provinceRepository.findAll();
		System.out.println(list);
	}


}
