package corejava;




import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestComparable {
	public static void main(String args[]) {
		List<Student> sList=new ArrayList<>();
		sList.add(new Student(23, "Sanjay", 25000, 3));
		sList.add(new Student(25, "Praveen", 75000, 4));
		sList.add(new Student(17, "Amruthaa", 10000, 1));
		sList.add(new Student(30, "Sirisha", 35000,2));
		
		System.out.println("Before sorting : ");
		sList.forEach(student -> System.out.println(student.toString()));
		
		java.util.Collections.sort(sList);
		
		System.out.println("After sorting : ");
		sList.forEach(student -> System.out.println(student.toString()));
		
		
		Comparator<Student> rankComparator=(Student s1, Student s2) -> {
				if(s1.getRank()>s2.getRank())
					return 1;
				else if(s1.getRank()<s2.getRank()) {
					return -1;
				}
				else {
					return 0;	
				}
			};
			
		Collections.sort(sList, rankComparator);
				
		System.out.println("After sorting by rank: ");
		sList.forEach(student -> System.out.println(student.toString()));
		
		
	}
	
	static class Student implements Comparable<Student>{
		int age;
		String name;
		float salary;
		int rank;
		
		
		
		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}

		public Student(int age, String name, float salary, int rank) {
			super();
			this.age = age;
			this.name = name;
			this.salary = salary;
			this.rank=rank;
		}
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		
		@Override
		public int compareTo(Student o) {
			if(this.age>o.getAge()) {
				return 1;
			}
			else if(this.age<o.getAge()) {
				return -1;
			}
			else {
				return 0;
			}
		}
		
		@Override
		public String toString() {
			return "Student [age=" + age + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
		
		
	}

}
