package testSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.bean.Person;
public class test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");//��ȡbean.xml�е�����
        Person p = ctx.getBean("person",Person.class);//����bean�����ö���
        p.info();
    }
}
 