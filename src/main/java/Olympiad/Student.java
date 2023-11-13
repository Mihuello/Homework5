package Olympiad;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surName;
    private String patronymic;
    private List<Integer> score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public List<Integer> getScore() {
        return score;
    }

    public void setScore(List<Integer> score) {
        this.score = score;
    }

    public Student(String name, String surName, String patronymic, int score1, int score2) {
        this.score = new ArrayList<>();
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.score.add(score1);
        this.score.add(score2);
    }
    static void prizeWinnersAreStudents(List<Student> winners) {
        boolean b = false;
        while (!b) {
            b = true;
            for (int i = 0; i < winners.size() - 1; i++) {
                if(studentScores(winners.get(i).getScore()) < studentScores(winners.get(i+1).getScore())) {
                    b = false;
                    Student ramp = winners.get(i);
                    winners.set(i, winners.get(i + 1));
                    winners.set(i + 1, ramp);

                }
            }
        }
        listOfWinners(winners);
    }
    private static int studentScores(List<Integer> point) {
        return (point.get(0) + point.get(1)) / point.size();
    }
    private static void listOfWinners(List<Student> point) {
        String result = null;
        for(int i = 0; i < point.size(); i++) {
            System.out.println(i + 1 + " Место ");
            System.out.println(point.get(i).getSurName());
            System.out.println(point.get(i).getName() + " " + point.get(i).getPatronymic());
            System.out.println("Среднее кол-во баллов: " + studentScores(point.get(i).getScore()));
        }
    }


    public static void main(String[] args) {
        Student student1 = new Student("Илья", "Пушкин", "Сергеевич", 56, 53);
        Student student2 = new Student("Сергей","Иванов", "Алексеевич", 45, 50);
        Student student3 = new Student("Иван", "Сидоров", "Иванович", 73,86);
        Student student4 = new Student("Никита", "Емельянов", "Ильич", 64, 80);
        Student student5 = new Student("Екатерина", "Сурнина", "Сергеевна", 75, 81);
        Student student6 = new Student("Елена", "Елисеева", "Михайловна", 90, 95);
        Student student7 = new Student("Марина", "Гильманова", "Фаридовна",73, 94);
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

