package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.CourseDAO;
import kr.ac.hansung.model.Course;

@Service
public class CoursesService {

	private CourseDAO coursedao;

	@Autowired
	public void setOfferDao(CourseDAO coursedao) {
		this.coursedao = coursedao;
	}

	public void insert(Course course) {
		coursedao.insert(course);
	}

	public List<Course> getCurrentInCourse() {
		return coursedao.getOffersInCourse();
	}

	public List<Course> getCurrentInVirtualCourse() {
		return coursedao.getOffersInVirtualCourse();
	}

	public List<Course> getCurrentInCourse(int year, String semester) {
		return coursedao.getOffersInCourse(year, semester);
	}

	public int getMinYear() {
		return coursedao.getMinYear();
	}

	public int getMaxYear() {
		return coursedao.getMaxYear();
	}

	public int getSumVlues(String value) {
		return coursedao.sumValues(value);
	}

	public int getSumVlues() {
		return coursedao.sumValues();
	}
}
