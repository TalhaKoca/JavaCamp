package opp�ntro;

public class CourseService {
	
	public void addToCart() {
		System.out.println("Kurs ba�ar�yla sepete eklendi.");
	}
	
	public void removeCart(Course course) {
		System.out.println(course.name +" ba�ar�yla sepetten kald�r�ld�.");
	}
	
}
