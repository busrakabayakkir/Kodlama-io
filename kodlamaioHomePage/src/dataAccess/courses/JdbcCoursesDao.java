package dataAccess.courses;

import entities.Courses;

public class JdbcCoursesDao implements ICourseDao{
	public void add(Courses course) {
		System.out.println("Jdbc ile veri tabanına eklendi");
	}

}
