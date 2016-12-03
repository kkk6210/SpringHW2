package kr.ac.hansung.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Course;
import kr.ac.hansung.service.CoursesService;

@Controller
public class CoursesController {

	private CoursesService coursesService;

	@RequestMapping("/courses")
	public String showOffers(Model model) {

		List<Course> courses = coursesService.getCurrentInCourse();
		model.addAttribute("courses", courses);

		return "courses";
	}

	@RequestMapping("/createcourse")
	public String createOffer(Model model) {

		return "createcourse";
	}

	@Autowired
	public void setOffersService(CoursesService offersService) {
		this.coursesService = offersService;
	}

	@RequestMapping("/docreate")
	public String doCreate(Model model, Course course) {

		coursesService.insert(course);
		return "home";
	}

	@RequestMapping("/semester_grades")
	public String semesterGrades(Model model) {

		int minYear = coursesService.getMinYear();
		int maxYear = coursesService.getMaxYear();
		List<Integer> years = new ArrayList<Integer>();
		List<Integer> grades = new ArrayList<Integer>();

		for (int z = minYear; z <= maxYear; z++) {
			years.add(z);
		}

		int number = -1;
		for (int i = minYear; i <= maxYear; i++) {
			for (int j = 1; j <= 2; j++) {
				int totalGrades = 0;
				List<Course> temp = coursesService.getCurrentInCourse(i, Integer.toString(j));
				number++;
				for (Course temps : temp)
					totalGrades += temps.getGrades();
				grades.add(totalGrades);

			}
		}

		model.addAttribute("grades", grades);
		model.addAttribute("number", number);
		model.addAttribute("years", years);
		return "semestergrades";
	}

	@RequestMapping("/courselist")
	public String courseList(Model model, int year, String semester) {
		List<Course> courses = coursesService.getCurrentInCourse(year, semester);
		model.addAttribute("courses", courses);
		return "courses";
	}

	@RequestMapping("/value_grades")
	public String valueGrades(Model model) {

		int allSumValue = coursesService.getSumVlues();
		model.addAttribute("allSumValue", allSumValue);

		int num = coursesService.getSumVlues("�쟾吏�");
		model.addAttribute("Gunji", num);
		num = coursesService.getSumVlues("援먰븘");
		model.addAttribute("GyoPill", num);
		num = coursesService.getSumVlues("�쟾湲�");
		model.addAttribute("Gungi", num);
		num = coursesService.getSumVlues("�쟾�꽑");
		model.addAttribute("Gunsun", num);
		num = coursesService.getSumVlues("�씪�꽑");
		model.addAttribute("Ilsun", num);

		num = coursesService.getSumVlues("�빑援륛");
		int num2 = coursesService.getSumVlues("�빑援륚");
		model.addAttribute("Hack", num + num2);

		return "valuegrades";
	}

	@RequestMapping("/lookupcourse")
	public String lookupCourse(Model model) {
		List<Course> courses = coursesService.getCurrentInVirtualCourse();
		model.addAttribute("courses", courses);
		return "courses";
	}

}
