package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	ApplicationContext context =new ClassPathXmlApplicationContext("C:\\Users\\kiran\\Desktop\\Spring programs\\spring1\\config.xml");
	
      Student  s  =(Student) context.getBean("student");
      
      System.out.println("student id: "+s.getId());
      
      System.out.println("student nmae: "+s.getName());
      
	}

}
