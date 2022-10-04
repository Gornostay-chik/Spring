package ermin.vermin.Relocation;

import ermin.vermin.Relocation.Climate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRelocation {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Climate testClimate = new Climate();
        //создаем климат для разных городов
        Climate moscowClimate = context.getBean("beanClimateMoscow", Climate.class);
        Climate piterClimate = context.getBean("beanClimatePiter", Climate.class);

        //сравнение по указателям
        boolean comparison = moscowClimate == piterClimate;
        System.out.println("These objects is the same player:" + comparison);

        System.out.println("MOSCOW climate INFO:" + moscowClimate);
        System.out.println("PITER climate INFO:" + piterClimate);

    }
}
