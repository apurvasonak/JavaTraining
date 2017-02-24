package com.synerzip.entry;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.synerzip.dbconnection.StudentListener;


public class NewFrame extends Frame implements WindowListener {
	public TextField t1;
	public TextField t2;
	public TextField t3;
	public TextField t4;
	TextField t5,t6;
	Button b,b1,delete,search,first,last,next,prev;
	Label l1,l2,l3,l4,l5,l6,l7;
	 public CheckboxGroup gender ;
	 public Checkbox ck1;
	 public Checkbox ck2;
	int i1,i2,i3;
	 public Choice age;

	 public NewFrame(String title) {
		 this.setBounds(200, 200, 700, 600);
		    setVisible(true);
		    setTitle(title);
		    setLayout(null);
		     b = new Button("Save");
		     delete=new Button("Delete");
		     search=new Button("Search");
		     first=new Button("First");
		     last=new Button("Last");
		     next=new Button("Nextt");
		     prev=new Button("Prev");
		
		   b.addActionListener(new StudentListener(this));
		    add(b);
		    delete.addActionListener(new StudentListener(this));
		    add(delete);
		    search.addActionListener(new StudentListener(this));
		    add(search);
		    first.addActionListener(new StudentListener(this));
		    add(first);
		    last.addActionListener(new StudentListener(this));
		    add(last);
		    next.addActionListener(new StudentListener(this));
		    add(next);
		    prev.addActionListener(new StudentListener(this));
		    add(prev);
		    
		    l1= new Label("Roll no:",Label.LEFT);
		    add(l1);
		    
		    l2= new Label("Name:",Label.LEFT);
			add(l2);
			
		    l3= new Label("Address:",Label.LEFT);
		   add(l3);
		   
		   l4= new Label("Marks:",Label.LEFT);
		    add(l4);
		    
		    l5= new Label("Gender:",Label.LEFT);
		    add(l5);
		    
		    l6= new Label("Age:",Label.LEFT);
		    add(l6);
		    
		    
		    t1 = new TextField();
		     add(t1);

		    t2 = new TextField();
		    add(t2);
		   
		    t3= new TextField();
		    add(t3);
		    
		    t4= new TextField();
		    add(t4);
		    
		    t5= new TextField();
		    add(t5);
		    t6= new TextField();
		    add(t6);
		    gender=new CheckboxGroup();
		   ck1 =new Checkbox("Male",gender,false);
		    add(ck1);
		    ck2=new Checkbox("Female",gender,false);
		    add(ck2);
		
		     b1 = new Button("Update");
		  //  b1.setBounds(200, 150, 100, 30);
		    b1.addActionListener(new StudentListener(this));
		    add(b1);
		    age = new Choice();
		    age.add("5");
		    age.add("6");
		    age.add("7");
		    age.add("8");
		    age.add("9");
		    age.add("10");
		    age.add("11");
		    age.add("12");
		    age.add("13");
		    age.add("14");
		    
		    age.setBounds(120, 210, 100, 20);
		    add(age);
		    l1.setBounds(25,65,90,20);
		    l2.setBounds(25,90,90,20);
		    l3.setBounds(25,120,90,20);
		    l4.setBounds(25,185,90,20);
		    l6.setBounds(25,210,90,20);
		   l5.setBounds(25,250,90,20);
		    t1.setBounds(120,65,170,20);
		    t2.setBounds(120,90,170,20);
		    t3.setBounds(120,120,170,50);
		    t4.setBounds(120,180,170,20);
		 //  t5.setBounds(120,210,170,20);
		    ck1.setBounds(120,250,50,20);
		    ck2.setBounds(170,250,60,20);
		    b.setBounds(120,350,50,30);
		    b1.setBounds(180,350,50,30);
		    delete.setBounds(230,350,50,30);
		    search.setBounds(280,350,50,30);
		    next.setBounds(128,390,50,30);
		    prev.setBounds(230,390,50,30);
		    first.setBounds(180,390,50,30);
		    last.setBounds(280,390,50,30);
	 
	
		

		}
		
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		NewFrame nf =(NewFrame) e.getSource();
		nf.dispose();
		
	}

	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}


