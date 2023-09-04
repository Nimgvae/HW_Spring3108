package spring_HW.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Создание контекста Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Получение первого студента из контекста
        Student student1 = (Student) context.getBean("student");

        // Создание второго студента
        Student student2 = new Student();
        student2.setName("Alice");
        student2.setAge(22);

        // Вывод характеристик второго студента
        System.out.println("Имя второго студента: " + student2.getName());
        System.out.println("Возраст второго студента: " + student2.getAge());
    }
}
