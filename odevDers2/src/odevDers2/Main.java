package odevDers2;

public class Main {

	public static void main(String[] args) {
		
		Courses course1 = new Courses(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demiro�"); 
		
		Courses course2 = new Courses(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Engin Demiro�");
		
		Courses course3 = new Courses(3,"Programlamaya Giri� i�in Temel Kurs","Engin Demiro�");
		
		Courses[] courses = {course1, course2, course3};
		
		for (Courses course : courses) {
			System.out.println("Kursun ad�: " + course.name + "\nE�itmen: " + course.instructor);
			System.out.println("----------------------------------------------------------------");
		}
		System.out.println("Toplam kurs say�: " + courses.length + "\n");
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addToCart(course1);
		courseManager.addToCart(course2);
		courseManager.addToCart(course3);

	}

}
