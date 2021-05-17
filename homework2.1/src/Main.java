public class Main {

	
	public static void main(String[] args) {
		Course CSharp = new Course(1, "C#", 0, "Sıfırdan ileri seviyeye C# kursu");
		Course Java = new Course(2, "Java", 0, "Sıfırdan ileri seviyeye Java kursu");
		Course[] courses = {CSharp, Java};
		
		System.out.println("Kurslar listelendi:");
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
	}		
}

