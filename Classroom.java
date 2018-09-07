import java.util.ArrayList;

/**
 * class simulating a classroom with various functions
 * @author Konstantin
 *
 */
public class Classroom
{
    private ArrayList<Student> theStudentList;
    
	/**
	 * no argument constructor
	 */
	public Classroom()
	{
		theStudentList = new ArrayList<Student>();
	}
	
	/**
	 * add method to add grades to the student list
	 * @param student the student in question
	 */
	public void add(Student student)
	{
		theStudentList.add(student);
		
	}
	
	/**
	 * gets the average of the student grades and compares it to the target
	 * @param target given target to compare with
	 * @return returns the greater average
	 */
	public String hasAverageGreaterThan(double target)
	{
		String result = "";
		boolean found = false;
		for( int i = 0; i < theStudentList.size() && !found; i++)
		{
			if(theStudentList.get(i).getAverage()>target)
			{
				result = theStudentList.get(i).getName();
				found = true;
			}
		}
		return result;
		
	}
	
	/**
	 * method accesses names of students and adds them to a list
	 * @return returns the list of names of students
	 */
	public ArrayList<String> getStudents()
	{
		ArrayList<String> nameList = new ArrayList<String>();
		
		for (Student student : theStudentList)
		{
			nameList.add(student.getName());
		}
		
		return nameList;
	}
	
	/**
	 * method compares students to each other and finds the best student
	 * @return returns the best student
	 */
	public Student bestStudent()
	{
		Student best = null;
		if(theStudentList.size() > 0)
		{	
			best = theStudentList.get(0);
			
			for(int i = 1; i < theStudentList.size(); i++ ) 
			{
				if(theStudentList.get(i).getAverage()>best.getAverage())
				{
					best = theStudentList.get(i);
				}
				
			}
		
		}	
		return best;
	}
	
	/**
	 * method translates theStudentList into a printable list format
	 * @return returns the printable list.
	 */
	public String toString()
	{
		String studentString = "[";
		boolean firstTime = true;
		for (Student student: theStudentList)
		{
		   if(firstTime)
		   {
		      studentString = studentString + student.toString() ;
		      firstTime = false;
		   }
		   
		   else
			studentString = studentString + ", " + student.toString();
			
		}
		
		studentString = studentString + "]";
		
		return studentString;
	}
	
	
}