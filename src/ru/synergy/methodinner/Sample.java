package ru.synergy.methodinner;

import java.util.ArrayList;
import java.util.List;

public class Sample { // Создание класса
    public void createNewPerson(String name){//
        String nameFIO = name;

        class GenericName{ // Вложенный класс
            List<String> names = new ArrayList<String>(); // Создание массива

            public GenericName(){ // Конструктор с методом добавления полученной строки в массив
                for(String str : nameFIO.split(" ")){ // Разделение строки по пробелам
                    names.add(str); // Добавление строки в массив

                }
            }
            public String getFirstName(){
                return names.get(0);
            } // Взятие второго элемента массива
            public String getLastName(){
                return names.get(names.size() - 1);
            }//->
            //-> вззятие последнего элемента массива
        }
        GenericName gname = new GenericName(); // Объект вложенного класса
        System.out.println("Person: " + gname.getFirstName().charAt(0) + "." + gname.getLastName());
        //Вывод
    }
}
