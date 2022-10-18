package business;

import entities.Courses;


public class CourseManager extends Courses{
	
	public void add(Courses course) throws Exception {
	
	if (course.getCourseName() == getCourseName()) {
		throw new Exception("Kurs adı Tekrar edemez");
		}
	if (course.getPrice()<0) {
		throw new Exception("Kurs ücreti 0'dan küçük olamaz");
	}
	}
	}
