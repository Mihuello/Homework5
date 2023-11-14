package Residents;

import java.util.*;


public class House {
    static Map<String,Integer> residents() {
        Map<String,Integer> residents = new HashMap<>();
        residents.put("Иванов Илья Александрович", 20);
        residents.put("Емельянов Александр Иванович", 18);
        residents.put("Сазонов Дмитрий Елисеевич", 15);
        residents.put("Алешкина Екатерина Алексеевна", 22);
        residents.put("Алешкин Егор Алексеевич", 9);
        residents.put("Алешкина Анастасия Алексеевна", 16);
        residents.put("Иван Иван Иванович", 70);
        residents.put("Сидоров Александр Сергеевич", 49);
        residents.put("Якимов Алексей Александрович", 33);
        residents.put("Якимова Наталья Анатольевна", 53);
        return residents;
    }

    static List<String> PeopleOverTheAgeOfEighteen(Map<String,Integer> residents) {
        List<String> adultResident = new ArrayList<>();
        for (Map.Entry<String,Integer> entry : residents.entrySet()) {
            if (entry.getValue() >= 18) {
                adultResident.add(entry.getKey());
            }
        }
        return adultResident;
    }

    static void printResidents(List<String> resident) {
        for (int i = 0; i < resident.size(); i++) {
            System.out.println(i + 1 + " " + resident.get(i));
        }
    }

    public static void main(String[] args) {
        Map<String,Integer> residents = residents();
        List<String> PeopleOverTheAgeOfEighteen = PeopleOverTheAgeOfEighteen(residents);
        Collections.sort(PeopleOverTheAgeOfEighteen);
        printResidents(PeopleOverTheAgeOfEighteen);
    }
}

