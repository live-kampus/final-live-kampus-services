package com.capgemini.schoolservice.service;

import java.util.List;


import com.capgemini.schoolservice.entity.School;


public interface SchoolService {

	public School addNew(School school);

	public List<School> getAllSchools();

	public School getSchoolById(int schoolId);

	public void deleteBySchoolId(int schoolId);
	
	public School update(School school);
}
