package java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalDemo {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("Sanjay", "sanjay@gmail.com"));
		employees.add(new Employee("Praveen","praveen@gmail.com"));
		employees.add(new Employee("Sirisha",null));
		
		Optional<String> stringNotNull;
		
		//1st way
		System.out.println("Old way : ");
		//Modifying oringinal array using Stream
		Stream<Employee> s=employees.stream();
		s.forEach(employee -> {
			Optional<String> mail=Optional.ofNullable(employee.getEmail());
			if(mail.isPresent()) {
				employee.setEmail(mail.get().toUpperCase());
			}
		});
		
		System.out.println(employees.get(0).getEmail());
		
		
		System.out.println("-----------\n New way : ");
		List<String> anotherList= employees.stream()
				.filter(employee -> (Optional.ofNullable(employee.getEmail())).isPresent())
				.map(employee -> (employee.getEmail()).toUpperCase())
				.collect(Collectors.toList());
		
		anotherList.forEach(email -> System.out.println(email));
		
		System.out.println("-----------\n New way, if null comes this will convert to default email_id : ");
		anotherList=employees.stream()
				.map(employee -> ((Optional.ofNullable(employee.getEmail())).orElse("default@gmail.com")).toUpperCase())
				.collect(Collectors.toList());
		anotherList.forEach(email -> System.out.println(email));
		
		//2nd way
		Optional<String> nameOptional=Optional.empty();
		System.out.println(nameOptional);
		
		//3rd way
		String name=null;
		System.out.println(Optional.of(name));
	}

}
