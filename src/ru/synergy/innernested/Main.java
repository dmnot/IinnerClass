package ru.synergy.innernested;

public class Main {
    public static void main(String[] args) {

        Parcel parcel = new Parcel(); // Объект класса
        Parcel.Destination destination = parcel.new Destination(); // Обращение к вложенному класса
        destination.doSomthing(); // Вызов метода вложенного класса
    }
}
