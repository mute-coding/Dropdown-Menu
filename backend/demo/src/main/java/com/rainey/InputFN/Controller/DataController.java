package com.rainey.InputFN.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rainey.InputFN.Model.InputData;
import com.rainey.InputFN.Service.DataService;

@RestController
@RequestMapping("/api")
public class DataController {
	@Autowired
	private DataService dataService;
	@GetMapping("/list")
	public List<InputData> getList(){
		return dataService.getDatas();
	}
}
