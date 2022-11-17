package Student;

import java.util.Scanner;

import Model.Student;
import Repository.StudentRepository;

public class Application {
	public static void main(String []args)
	{
		System.out.println("welcome the the application");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println(
					"\n-----------------------"
					+"\n select the choice from the followin " 
					+ "\n 1. Insert data "
					+ "\n 2. Display data "
					+ "\n 3. update data"
					+ "\n 4.Delete Record ");
			
			
			int option = Integer.parseInt(sc.nextLine());
		if(option == 1)
		{
			
			System.out.println("please enter password");
			String password = sc.nextLine();
			
			System.out.println("Enter username");
			String username = sc.nextLine();
			
			
			System.out.println("enter email ");
			String email = sc.nextLine();
			
			Student student = new Student(password,username,email);
			
			boolean rows = StudentRepository.insert(student);
			if(rows)
			{
				System.out.println("record inserted successfulu");
			}
			System.out.println(student);
			
			}
		}
	}

}
