package kr.ac.hansung.model;

public class Course {

	private int year;
	private String name;
	private String semester;
	private String code;
	private String value;
	private int grades;

	public Course() {
	}

	public Course(int year, String name, String semester, String code, String value, int grades) {
		super();
		this.year = year;
		this.name = name;
		this.semester = semester;
		this.code = code;
		this.value = value;
		this.grades = grades;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getGrades() {
		return grades;
	}

	public void setGrades(int grades) {
		this.grades = grades;
	}

}
