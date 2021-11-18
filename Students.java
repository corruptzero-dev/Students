package com.company;

import java.util.*;

public class Students {
    HashMap<String, Integer> studentsMarks = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    String[] names = {"Никитин Никита",
            "Рунич Петр",
            "Ермакова Ася",
            "Кулаев Денис",
            "Стельмах Владислав",
            "Трофимец Игорь",
            "Флоренский Владимир",
            "Хрипунов Антон",
            "Чепуренко Никита",
            "Шеврин Александр",
            "Эркинов Мохир"
    };


    public void fill(){
        Collections.shuffle(Collections.singletonList(names));
        Arrays.stream(names).forEach((Objects.requireNonNull(elem -> studentsMarks.put(elem, -1))));

    }
    public void putMark(){
        Set<Map.Entry<String, Integer>> set = studentsMarks.entrySet();
        while (studentsMarks.containsValue(-1)){
            for (Map.Entry<String, Integer> ent : set) {
                if(ent.getValue()==-1){
                    int mark = -1;
                    boolean isPrint = false;
                        try{
                            while(!(0<mark && mark<=5) && !isPrint) {
                                System.out.printf("Введите оценку для студента %s: ", ent.getKey());
                                mark = scanner.nextInt();
                                studentsMarks.put(ent.getKey(), mark);
                            }
                        } catch (Exception e){
                            if (scanner.next().equals("print")){
                                isPrint = true;
                            }
                            System.out.println("Неверный ввод!");
                            scanner.nextLine();
                        }
                }
            }
        }
        System.out.println("___Результаты___");
        studentsMarks.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
