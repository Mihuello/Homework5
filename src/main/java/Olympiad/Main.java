package Olympiad;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Илья", "Пушкин", "Сергеевич", new ArrayList<>() {{
            add(35);
            add(85);
        }});
        Student student2 = new Student("Сергей", "Иванов", "Алексеевич", new ArrayList<>() {{
            add(56);
            add(97);
        }});
        Student student3 = new Student("Иван", "Сидоров", "Иванович", new ArrayList<>() {{
            add(78);
            add(97);
        }});
        Student student4 = new Student("Никита", "Емельянов", "Ильич", new ArrayList<>() {{
            add(85);
            add(73);
        }});
        Student student5 = new Student("Екатерина", "Сурнина", "Сергеевна", new ArrayList<>() {{
            add(46);
            add(93);
        }});
        Student student6 = new Student("Елена", "Елисеева", "Михайловна", new ArrayList<>() {{
            add(87);
            add(98);
        }});
        Student student7 = new Student("Марина", "Гильманова", "Фаридовна", new ArrayList<>() {{
            add(100);
            add(87);
        }});
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        Student.prizeWinnersAreStudents(students);
    }
}

