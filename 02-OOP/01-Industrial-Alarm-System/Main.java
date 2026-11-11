public class Main {

    public static void main(String[] args) {

        TemperatureAlarm temperature = new TemperatureAlarm(
            "Boiler Machine", 120, 100
        );

        PressureAlarm pressure = new PressureAlarm(
            "Hydraulic Machine", 80, 50
        );

        IndustrialAlarm industrialAlarm = new IndustrialAlarm();

        AlarmManager manager = new AlarmManager(industrialAlarm);

        manager.monitorAlarm(temperature);
        manager.monitorAlarm(pressure);

        manager.snoozeAlarm(temperature);

        temperature.acknowledge();

    }

}