import java.util.*;
import static java.lang.System.*;
public class studentGrades {

	// Creates the average of 5 grades for 3 students
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		double classAverage = 0;
		for(int y = 0;y<3;y++) {
		System.out.print("Enter Student's Name: ");
		String Name = kb.nextLine();
		double Average = 0;
		for(int x = 0;x<5;x++) {
			System.out.print("Enter a Grade: ");
			Average += kb.nextDouble();
			kb.nextLine();
		}
			Average /= 5;	
			out.println("Student's Name: "+Name);
			out.println("Average: "+Average);
			out.print("Grade: ");
			if(Average>=90)
				out.println("A");
			else if(Average>=80)
				out.println("B");
			else if(Average>=70)
				out.println("C");
			else 
				out.println("F");
			classAverage+=Average;
			System.out.println();
		}
		out.println();
		out.println("Class average: "+classAverage/3);
	}

}
