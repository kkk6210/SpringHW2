package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Course;

@Repository
public class CourseDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from course";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}

	public List<Course> getOffersInCourse() {
		String sqlStatement = "select * from course ";
		return jdbcTemplateObject.query(sqlStatement, new CourseMapper());
	}

	public List<Course> getOffersInVirtualCourse() {
		String sqlStatement = "select * from virtual_course ";
		return jdbcTemplateObject.query(sqlStatement, new CourseMapper());
	}

	public List<Course> getOffersInCourse(int year, String semester) {
		String sqlStatement = "select * from course where year=? and semester=?";
		return jdbcTemplateObject.query(sqlStatement, new Object[] { year, semester }, new CourseMapper());

	}

	public boolean insert(Course course) {

		int year = course.getYear();
		String name = course.getName();
		String semester = course.getSemester();
		String code = course.getCode();
		String value = course.getValue();
		int grades = course.getGrades();

		String sqlStatement = "insert into virtual_course (year,semester,code,name,value,grades) values (?,?,?,?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement,
				new Object[] { year, semester, code, name, value, grades }) == 1);

	}

	public boolean delete(int code) {

		String sqlStatement = "delete from course where code=?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[] { code }) == 1);
	}

	public int getMinYear() {
		String sqlStatement = "select min(year) from course ";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}

	public int getMaxYear() {
		String sqlStatement = "select max(year) from course ";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}

	public int sumValues() {
		String sqlStatement = "select sum(grades) from course";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}

	public int sumValues(String value) {
		String sqlStatement = "select sum(grades) from course where value=?";
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { value }, Integer.class);
	}
}
