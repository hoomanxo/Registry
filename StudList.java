import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
import java.applet.Applet;
class StudList {
public StudList ( Vector studentVec ) {
this.studentVec = studentVec;
}
//public StudList (File courses) {
//}	
public StudList ( Applet applet ) throws Exception 
{ 
studentVec = new Vector(); 
Student s; 
for(int i = 1; 
(s = Student.read("student" + i, applet)) != null; i++) 
{ studentVec.addElement(s); 
//s.print(); // optional, to see the data in the console 
} 
} 

//public StudList makeSubList (MarkList mList) {
//return new StudList(studentVec);
 
//MarkList mList = new MarkList;
//}
public Student getStud( int index ) {
return (Student)studentVec.elementAt(index);
}
public int size() {
return studentVec.size();
}
//instance variables
private Vector
studentVec;
//File studentsfile = new File ("students");
//File marksfile = new File ("marks");
//File coursesfile = new File("courses");
}
	//void evaluate() {
		//Enumeration enum = studentColl.elements();
		//while (enum.hasMoreElements()) {
			//Student student = (Student)enum.nextElement();
			//System.out.print(student.getName());
			//System.out.print(" is performing ");
			//if (student.getAverage() >= classAverage)
				//System.out.println("above average");
			//else
				//System.out.println("below average");
		//}
	//}

	//Vector studentColl;
	//int classAverage;
//}

