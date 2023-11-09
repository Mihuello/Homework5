package Residents;

import java.util.*;


public class House {
    static Map<String,Integer> residents() {
        Map<String, Integer> residents = new HashMap<>();
        residents.put("Иванов Илья Александрович", 20);
        residents.put("Емельянов Александр Иванович", 18);
        residents.put("Сазонов Дмитрий Елисеевич", 15);
        residents.put("Алешкина Екатерина Алексеевна", 22);
        residents.put("Алешкин Егор Алексеевич", 9);
        residents.put("Алешкина Анастасия Алексеевна", 16);
        return residents;
    }

    static List<String> PeopleOverTheAgeOfeighteen (Map<String,Integer> residents) {
        List<String> adultresident = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: residents.entrySet()){
            if(entry.getValue()>= 18){
                adultresident.add(entry.getKey());
            }
        }
        return adultresident;
    }

    static void printResidents(List<String> resident) {
        for(int i = 0; i<resident.size(); i++) {
            System.out.println(i + 1 + " " + resident.get(i));
        }
    }

        public static void main (String[]args){
            Map<String,Integer> residents = residents();
            List<String> PeopleOverTheAgeOfeighteen = PeopleOverTheAgeOfeighteen(residents);
            Collections.sort(PeopleOverTheAgeOfeighteen);
            printResidents(PeopleOverTheAgeOfeighteen);
        }
    }

