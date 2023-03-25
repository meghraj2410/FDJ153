package test.com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import student.com.Student;

public class Test 
{
	public static void main(String[] args) 
	{
		Resource r = new ClassPathResource("Bean.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Student s = (Student) bf.getBean("st");
		s.m1();
		
	}

}
