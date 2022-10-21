package ru.synergy.innernested;
// Создание основного класса
public class Parcel {
    public String recepient;
    private  int mass;
    //Write soething code;
    // Вложенный класс
    class Destination{
        public  String street;
        private int homeNum;
        private int roomNum;
        public void  doSomthing(){ // Метод вложенного класса
            System.out.println(mass);
        }
    }
    //---------------------------------
}
//---------------------------------
