package ru.synergy.innernested;

public class Parcel {
    public String recepient;
    private  int mass;
    //Write soething code;

    class Destination{
        public  String street;
        private int homeNum;
        private int roomNum;
        public void  doSomthing(){
            System.out.println(mass);
        }
    }
}
