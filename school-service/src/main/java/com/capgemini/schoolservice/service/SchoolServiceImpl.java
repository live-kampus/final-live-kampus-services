package com.capgemini.schoolservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.schoolservice.dao.SchoolDao;
import com.capgemini.schoolservice.entity.School;


@Service
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolDao dao;
	
	
	@Override
	public School addNew(School school) {
		return dao.save(school) ;
	}


	@Override
	public List<School> getAllSchools() {
		return dao.findAll();
	}


	@Override
	public School getSchoolById(int schoolId) {
		return dao.findByschoolId(schoolId);
	}


	@Override
	public void deleteBySchoolId(int schoolId) {
		dao.deleteByschoolId(schoolId);
		
	}


	@Override
	public School update(School school) {
		School updateSchool= dao.findByschoolId(school.getSchoolId());
		updateSchool.setSchoolId(school.getSchoolId());
		updateSchool.setSchoolName(school.getSchoolName());
		updateSchool.setSchoolCity(school.getSchoolCity());
		updateSchool.setSchoolState(school.getSchoolState());
		return dao.save(updateSchool);
	}

}
