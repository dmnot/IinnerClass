package ru.synergy.anonimusinner;

public class Main {
    public static void main(String[] args) {
        // Использование анонимных классов
        MonitoringSystem GeneralMonitoring = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Общий мониторинг стартовал");
            }
        };
        MonitoringSystem ErrorMonitoring = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Моиторинг ошибок стартоовал");

            }
        };
        MonitoringSystem SecMonitoring = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопастности стартовал ");

            }
        };
        //----------------------------------------------------
        //Использование методов
        GeneralMonitoring.startMonitoring();
        ErrorMonitoring.startMonitoring();
        SecMonitoring.startMonitoring();
    }
}
