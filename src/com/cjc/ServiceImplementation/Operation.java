package com.cjc.ServiceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cjc.ServiceInterface.ServiceInt;
import com.cjc.model.Batch;
import com.cjc.model.Course;
import com.cjc.model.Faculty;
import com.cjc.model.Student;

public class Operation implements ServiceInt {

	List<Course> cList = new ArrayList<Course>();
	List<Faculty> fList = new ArrayList<Faculty>();
	List<Batch> bList = new ArrayList<Batch>();
	List<Student> sList = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in) ;
	@Override
	public void addCourse() {
		int total = sc.nextInt();
		for(int i=0;i<total;i++) {
			Course c = new Course();
			System.out.println("Enter Course ID : ");
			c.setCId(sc.nextInt());
			System.out.println("Enter Course Name : ");
			c.setCName(sc.next());
			cList.add(c);
		}
		System.out.println("CLIST : "+cList);
	}

	@Override
	public void showCourse() {
		System.out.println("CLIST : "+cList);
		System.out.println("CId : \t CName");
		
		for(Course c:cList) {
			System.out.println(c.getCId()+"\t"+c.getCName());
		}
	}

	@Override
	public void addFaculty() {

		System.out.println("Enter how many faculty you want to add : ");
		int total = sc.nextInt();
		for(int i=0;i<total;i++) {
			Faculty f = new Faculty();
			
			System.out.println("Enter faculty ID : ");
			f.setFId(sc.nextInt());
			System.out.println("Enter faculty Name : ");
			f.setFName(sc.next());
			showCourse();
			System.out.println("ENter course ID for given faculty");
			int newCId =sc.nextInt();
			for(Course c:cList) {
				if(c.getCId()==newCId) {
					f.setCourse(c);
				}
			}
			fList.add(f);
		}
	
		
	}

	@Override
	public void showFaculty() {
		System.out.println("FID \t FName \t CName");
		for(Faculty f:fList) {
			System.out.println(f.getFId()+"\t"+f.getFName()+"\t"+f.getCourse().getCName());
		}
		
	}

	@Override
	public void addBatch() {

		System.out.println("Enter how many batch you want to add : ");
		int total = sc.nextInt();
		for(int i=0;i<total;i++) {
			Batch b = new Batch();
			System.out.println("Enter batch ID : ");
			b.setBId(sc.nextInt());
			System.out.println("Enter batch Name : ");
			b.setBName(sc.next());
			showFaculty();
			System.out.println("ENter faculty ID for given faculty");
			int newFId =sc.nextInt();
			for(Faculty f:fList) {
				if(f.getFId()==newFId) {
					b.setFaculty(f);
				}
			}
			bList.add(b);
		}
	
		
	}

	@Override
	public void showBatch() {

		System.out.println("BID \t BName \t FName");
		for(Batch b:bList) {
			System.out.println(b.getBId()+"\t"+b.getBName()+"\t"+b.getFaculty().getFName());
		}
		
	
		
	}

	@Override
	public void addStudent() {

		System.out.println("Enter how many student you want to add : ");
		int total = sc.nextInt();
		for(int i=0;i<total;i++) {
			Student s = new Student();
			System.out.println("Enter student ID : ");
			s.setSId(sc.nextInt());
			System.out.println("Enter student Name : ");
			s.setSName(sc.next());
			showBatch(); 
			System.out.println("Enter batch ID for given faculty");
			int newBId =sc.nextInt();
			for(Batch b:bList) {
				if(b.getBId()==newBId) {
					s.setBatch(b);
				}
			}
			sList.add(s);
		}
	
		
	}

	@Override
	public void showStudent() {

		System.out.println("SID \t SName \t BName");
		for(Student s:sList) {
			System.out.println(s.getSId()+"\t"+s.getSName()+"\t"+s.getBatch().getBName());
		}
		
	}

}
