package com.nt.dao;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public interface CollegeDAO {
    public int insertStudent(StudentBO bo);
    public int insertEmployee(EmployeeBO bo);
}
