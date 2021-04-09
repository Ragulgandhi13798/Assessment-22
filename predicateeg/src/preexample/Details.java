package preexample;

import java.util.ArrayList;
import java.util.function.Predicate;

 class Student
{
          
            String name;
            int id;
            int age;
             

public Student (String name, int id, int age) {
				super();
				this.name = name;
				this.id = id;
				this.age = age;
			}

}
public class Details {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		
		 al.add(new Student("ram",11,24));
		 al.add(new Student("som",12,12));
		 al.add(new Student("raja",13,44));
		
			Predicate<Student> p1 = s->s.age>18;
		
		
		for(Student r : al)
		{
		
			if(p1.test(r))
			System.out.println("allow watch movie" + " " +r.age);
			else {
				System.out.println("not allow watch movie" + " " +r.age);
			
		}
		

	}

	}
}

