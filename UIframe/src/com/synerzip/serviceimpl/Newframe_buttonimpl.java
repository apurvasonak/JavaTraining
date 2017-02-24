package com.synerzip.serviceimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
import com.synerzip.db.Student;
import com.synerzip.dbconnection.*;
import com.synerzip.db.Student;
import com.synerzip.db.Student;
import com.synerzip.service.Newframe_buttons;

public class Newframe_buttonimpl implements Newframe_buttons {
	java.sql.PreparedStatement ps;
	private DB_connection dbHelper;
	private Student studentModel;
public ResultSet result;


	
	public void save(Student studentModel) throws SQLException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
ps = dbHelper.getConnection().prepareStatement("insert into new_table values(?,?,?,?,?,?)");
		
		ps.setInt(1, studentModel.getRollno());
		ps.setString(2, studentModel.getName());
		ps.setString(3, studentModel.getAddress());
		ps.setFloat(4, studentModel.getMarks());
		ps.setString(6, studentModel.getAge());
		ps.setString(5, studentModel.getGender());

		ps.execute();
		
	}

	public void update(Student studentModel) throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
ps = dbHelper.getConnection().prepareStatement("update new_table set name=?, address=?, marks=?, age=?, gender=? where rollno=? ");
		
		ps.setString(1,studentModel.getName());
		ps.setString(2, studentModel.getAddress());
		ps.setFloat(3, studentModel.getMarks());
		ps.setString(4, studentModel.getAge());
		ps.setString(5,  studentModel.getGender());
		ps.setInt(6,studentModel.getRollno());
		
		ps.execute();
		
	}

	public void delete(int rollNo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ps=dbHelper.getConnection().prepareStatement("delete from new_table where rollno="+rollNo);
		ps.execute();
	}

	public Student search(int rollNo) throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		String searchquery="select * from new_table where rollno="+rollNo;
		Statement statement=(Statement) dbHelper.getConnection().createStatement();
		ResultSet rs;
		rs=statement.executeQuery(searchquery);
		if(rs!= null){
			studentModel = new Student();
		while(rs.next()){
			studentModel.setRollno(rs.getInt("rollno"));
			studentModel.setName(rs.getString("name"));
			studentModel.setAddress(rs.getString("address"));
			studentModel.setMarks(rs.getFloat("marks"));
			studentModel.setAge(rs.getString("age"));
			studentModel.setGender(rs.getString("gender"));
		}
		}
		return studentModel;
		
		
	}

	public Student next() throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		
		if(!result.isLast() && result.next()){
			studentModel.setRollno(result.getInt("rollno"));
			studentModel.setName(result.getString("name"));
			studentModel.setAddress(result.getString("address"));
			studentModel.setMarks(result.getFloat("marks"));
			studentModel.setAge(result.getString("age"));
			studentModel.setGender(result.getString("gender"));
		
		}  
return studentModel;
			
	}

	public Student last() throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		if(result.last()){
			studentModel.setRollno(result.getInt("rollno"));
			studentModel.setName(result.getString("name"));
			studentModel.setAddress(result.getString("address"));
			studentModel.setMarks(result.getFloat("marks"));
			studentModel.setAge(result.getString("age"));
			studentModel.setGender(result.getString("gender"));
		
		}
		return studentModel;
	}

	public Student prev(Student studentModel) throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
	
		if (!result.isBeforeFirst() && !result.isFirst() && result.previous())  {
				studentModel.setRollno(result.getInt("rollno"));
				studentModel.setName(result.getString("name"));
				studentModel.setAddress(result.getString("address"));
				studentModel.setMarks(result.getFloat("marks"));
				studentModel.setAge(result.getString("age"));
				studentModel.setGender(result.getString("gender"));

			}
			
		
		return studentModel;
	}

	public Student first() throws ClassNotFoundException,
			SQLException {
		if(result.first()){
			studentModel.setRollno(result.getInt("rollno"));
			studentModel.setName(result.getString("name"));
			studentModel.setAddress(result.getString("address"));
			studentModel.setMarks(result.getFloat("marks"));
			studentModel.setAge(result.getString("age"));
			studentModel.setGender(result.getString("gender"));
		}
		return studentModel;
	}
	public void resulset() throws SQLException, ClassNotFoundException {

		String chkquery = "select * from student";
		Statement statement = (Statement) dbHelper.getConnection().createStatement();

		result = statement.executeQuery(chkquery);

		if (result != null) {
			studentModel = new Student();
			result.beforeFirst();

		}
	}
}
