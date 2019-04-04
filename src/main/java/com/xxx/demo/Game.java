package com.xxx.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {
	private Teacher teacher;
	private List<Student> students;
	
	public void beReady(int studentCount) throws Exception{
        if(studentCount < 1) {
            throw new Exception("The studentCount arg must be >=1: " + studentCount);
        }
        if(studentCount > 999) {
            throw new Exception("The studentCount arg must be <999: " + studentCount);
        }
        
        this.teacher = new Teacher();
        this.teacher.prepare();
        this.students = new ArrayList<Student>();
		for(int i= 1;i<=studentCount;i++){
			Student stu = new Student();
			this.students.add(stu);
		}
	}

	public void run() {
		
		 for (Iterator itr = students.iterator(); itr.hasNext();) {
			 Student stu = (Student)itr.next();
			 String result = stu.playGame(teacher);
		     System.out.println(result);
		 }
	}
	
	public void runHard() {
		
		 for (Iterator itr = students.iterator(); itr.hasNext();) {
			 Student stu = (Student)itr.next();
			 String result = stu.playGameHard(teacher);
		     System.out.println(result);
		 }
	}
	

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	

}
