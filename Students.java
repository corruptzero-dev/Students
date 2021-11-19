package task;

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


    public void fill() {
        Arrays.stream(names).forEach((Objects.requireNonNull(elem -> studentsMarks.put(elem, 0))));
    }

    public void putMark() {
        String mark = "";
        Set<Map.Entry<String, Integer>> set = studentsMarks.entrySet();
        while (studentsMarks.containsValue(0)) {
            try {
                for (Map.Entry<String, Integer> ent : set) {
                    if (ent.getValue() == 0) {
                        System.out.printf("Введите оценку для студента %s: ", ent.getKey());
                        mark = scanner.next();
                        if (mark.equals("print")) {
                            break;
                        }
                        if ((0 < Integer.parseInt(mark) && Integer.parseInt(mark) <= 5)) {
                            studentsMarks.put(ent.getKey(), Integer.parseInt(mark));
                        } else {
                            System.out.println("Неверный ввод!");
                            scanner.nextLine();
                        }
                    }
                }
                if (mark.equals("print")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Неверный ввод!");
                scanner.nextLine();
            }
        }
        System.out.println("___Результаты___");
        studentsMarks.forEach((key, value) -> System.out.println(value == 0 ? key + ": нет оценки" : key + ": " + value));
    }
}
