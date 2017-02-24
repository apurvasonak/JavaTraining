package com.synerzip.service;

import java.sql.SQLException;

import com.synerzip.db.Student;

public interface Newframe_buttons {
	
public void save(Student studentModel) throws SQLException, ClassNotFoundException;
	
	public void update(Student studentModel) throws ClassNotFoundException, SQLException;
	
	public void delete(int rollNo) throws ClassNotFoundException, SQLException;
	
	public Student search(int rollNo) throws ClassNotFoundException, SQLException;
	
	public Student next () throws ClassNotFoundException, SQLException;
	
	public Student last() throws ClassNotFoundException, SQLException;
	
	public Student prev(Student studentModel) throws ClassNotFoundException, SQLException;
	
	public Student first() throws ClassNotFoundException, SQLException;
}
