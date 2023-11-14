package Olympiad;

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

    public Student(String name, String surName, String patronymic, List<Integer> score) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.score = score;
    }

    static void prizeWinnersAreStudents(List<Student> winners) {
        boolean b = false;
        while (!b) {
            b = true;
            for (int i = 0; i < winners.size() - 1; i++) {
                if (studentScores(winners.get(i).getScore()) < studentScores(winners.get(i + 1).getScore())) {
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
        int samp = 0;
        for (Integer s : point) {
            samp += s;
        }
        return samp / point.size();
    }

    private static void listOfWinners(List<Student> point) {
        for (int i = 0; i < point.size(); i++) {
            System.out.println(i + 1 + " Место ");
            System.out.println(point.get(i).getSurName());
            System.out.println(point.get(i).getName() + " " + point.get(i).getPatronymic());
            System.out.println("Среднее кол-во баллов: " + studentScores(point.get(i).getScore()));
        }
    }
}



