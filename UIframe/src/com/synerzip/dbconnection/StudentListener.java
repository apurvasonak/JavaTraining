package com.synerzip.dbconnection;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;

import com.synerzip.db.Student;
import com.synerzip.service.Newframe_buttons;
import com.synerzip.serviceimpl.Newframe_buttonimpl;
import com.synerzip.entry.NewFrame;

public class StudentListener implements ActionListener, WindowListener {

	private NewFrame myFrame;
	private Student studentModel;
	Newframe_buttonimpl studentService = new Newframe_buttonimpl();

	public StudentListener(NewFrame myFrame) {
		// TODO Auto-generated constructor stub
		this.myFrame = myFrame;
	}

	
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		myFrame.dispose();

	}

	
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	
	public void actionPerformed(ActionEvent actionEvent) {
		Button button = (Button)actionEvent.getSource();
       

        String buttonLabel = button.getLabel();
		// TODO Auto-generated method stub
		studentModel = new Student();
		
		
		if(buttonLabel.equals("Save")){
		try {
		
			studentModel.setRollno(Integer.parseInt(myFrame.t1.getText()));
			studentModel.setName(myFrame.t2.getText());
			studentModel.setAddress(myFrame.t3.getText());
			studentModel.setMarks(Float.parseFloat(myFrame.t4.getText()));
			studentModel.setAge(myFrame.age.getSelectedItem());
			studentModel.setGender(myFrame.gender.getSelectedCheckbox().getLabel());
			
			studentService.save(studentModel);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		else
		if(buttonLabel.equals("Update")){
		try {
			studentModel.setRollno(Integer.parseInt(myFrame.t1.getText()));
			studentModel.setName(myFrame.t2.getText());
			studentModel.setAddress(myFrame.t3.getText());
			studentModel.setMarks(Float.parseFloat(myFrame.t4.getText()));
			studentModel.setAge(myFrame.age.getSelectedItem());
			studentModel.setGender(myFrame.gender.getSelectedCheckbox().getLabel());
			
			studentService.update(studentModel);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else if(buttonLabel.equals("Delete")){
			try {
				studentService.delete(Integer.parseInt(myFrame.t1.getText()));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		if(buttonLabel.equals("Search")){
			try {
				studentModel =studentService.search(Integer.parseInt(myFrame.t1.getText()));
				
				myFrame.t1.setText(String.valueOf(studentModel.getRollno()));
				myFrame.t2.setText(studentModel.getName());
				myFrame.t3.setText(studentModel.getAddress());
				myFrame.t4.setText(String.valueOf(studentModel.getMarks()));
				myFrame.age.select(studentModel.getAge());
				if(studentModel.getGender().equals("Male")){
					myFrame.ck1.setState(true);
				}
				else 
				{
					myFrame.ck2.setState(true);
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (buttonLabel.equals("First")) {
			try {
				studentModel = studentService.first();

				myFrame.t1.setText(String.valueOf(studentModel.getRollno()));
				myFrame.t2.setText(studentModel.getName());
				myFrame.t3.setText(studentModel.getAddress());
				myFrame.t4.setText(String.valueOf(studentModel.getMarks()));
				myFrame.age.select(studentModel.getAge());
				if(studentModel.getGender().equals("Male")){
					myFrame.ck1.setState(true);
				}
				else 
				{
					myFrame.ck2.setState(true);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (buttonLabel.equals("Previous")) {
			try {
				studentModel = studentService.prev(studentModel);
				myFrame.t1.setText(String.valueOf(studentModel.getRollno()));
				myFrame.t2.setText(studentModel.getName());
				myFrame.t3.setText(studentModel.getAddress());
				myFrame.t4.setText(String.valueOf(studentModel.getMarks()));
				myFrame.age.select(studentModel.getAge());
				if(studentModel.getGender().equals("Male")){
					myFrame.ck1.setState(true);
				}
				else 
				{
					myFrame.ck2.setState(true);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (buttonLabel.equals("Next")) {
			try {
				studentModel = studentService.next();

				myFrame.t1.setText(String.valueOf(studentModel.getRollno()));
				myFrame.t2.setText(studentModel.getName());
				myFrame.t3.setText(studentModel.getAddress());
				myFrame.t4.setText(String.valueOf(studentModel.getMarks()));
				myFrame.age.select(studentModel.getAge());
				if(studentModel.getGender().equals("Male")){
					myFrame.ck1.setState(true);
				}
				else 
				{
					myFrame.ck2.setState(true);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (buttonLabel.equals("Last")) {
			try {
				studentModel = studentService.last();

				myFrame.t1.setText(String.valueOf(studentModel.getRollno()));
				myFrame.t2.setText(studentModel.getName());
				myFrame.t3.setText(studentModel.getAddress());
				myFrame.t4.setText(String.valueOf(studentModel.getMarks()));
				myFrame.age.select(studentModel.getAge());
				if(studentModel.getGender().equals("Male")){
					myFrame.ck1.setState(true);
				}
				else 
				{
					myFrame.ck2.setState(true);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			}
	}

