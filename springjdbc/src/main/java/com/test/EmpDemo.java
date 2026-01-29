package com.test;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class EmpDemo {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
	EmployeeDao empdao=	ctx.getBean("edao",EmployeeDao.class);
	
	Employee emp=new Employee();
	
	emp.setE_name("rohit");
	emp.setE_cmp("bcci");
	emp.setE_city("mumbai");
	empdao.createEmployee(emp);
	
	System.out.println("emp data updated");
	//System.out.println(empdao);
		
	}
 
}