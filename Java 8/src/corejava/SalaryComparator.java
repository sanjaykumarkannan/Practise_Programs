package corejava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import corejava.TestComparable.Student;

public class SalaryComparator implements Comparator<Student>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> sList=new ArrayList<>();
		sList.add(new Student(23, "Sanjay", 25000));
		sList.add(new Student(25, "Praveen", 75000));
		sList.add(new Student(17, "Amruthaa", 10000));
		sList.add(new Student(30, "Sirisha", 35000));
		
		System.out.println("Before sorting : ");
		sList.forEach(student -> System.out.println(student.toString()));
		
		java.util.Collections.sort(sList,new SalaryComparator());
		
		System.out.println("After sorting : ");
		sList.forEach(student -> System.out.println(student.toString()));
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary())
		{
			return 1;
		}
		else if (o1.getSalary()<o2.getSalary()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
