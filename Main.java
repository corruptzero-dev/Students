package com.company;

public class Main {

    public static void main(String[] args) {
	    /*
	    TODO
		    Задание на эту пару. Написать любым способом прогу, которая будет:
		    1. Выдавать случайного студента вашей группы
		    2. Ждать оценку от 1 до 5 в консоль
		    3. После выдавать следующего студента
		    Также должен быть вывод всех студентов при вводе в консоль "print"
	     */
        Students students = new Students();
        students.fill();
        students.putMark();
    }
}
