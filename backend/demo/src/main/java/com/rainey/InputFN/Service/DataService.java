package com.rainey.InputFN.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rainey.InputFN.Model.InputData;
import com.rainey.InputFN.Repository.DataRepository;

@Service
public class DataService {
	@Autowired
	private DataRepository dataRepository;
	public List<InputData> getDatas(){
		return dataRepository.findAll();
	}
}
