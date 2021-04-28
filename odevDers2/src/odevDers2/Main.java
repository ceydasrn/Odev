package odevDers2;

public class Main {

	public static void main(String[] args) {
		
		Courses course1 = new Courses(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","Engin Demiroð"); 
		
		Courses course2 = new Courses(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","Engin Demiroð");
		
		Courses course3 = new Courses(3,"Programlamaya Giriþ için Temel Kurs","Engin Demiroð");
		
		Courses[] courses = {course1, course2, course3};
		
		for (Courses course : courses) {
			System.out.println("Kursun adý: " + course.name + "\nEðitmen: " + course.instructor);
			System.out.println("----------------------------------------------------------------");
		}
		System.out.println("Toplam kurs sayý: " + courses.length + "\n");
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addToCart(course1);
		courseManager.addToCart(course2);
		courseManager.addToCart(course3);

	}

}
