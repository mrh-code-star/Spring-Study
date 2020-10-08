import com.mrh.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person people = context.getBean("person",Person.class);

        people.getDog().shout();
        people.getCat().shout();

    }
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

        Person people = context.getBean("person",Person.class);

        people.getDog().shout();
        people.getCat().shout();

    }
}
