public class TemperatureAlarm extends Alarm {

    public TemperatureAlarm(String machineName, double currentValue, double safeLimit) {
        super(machineName, currentValue, safeLimit);
    }

    @Override
    public boolean checkCondition() {
        return getCurrentValue() > getSafeLimit();
    }

    @Override
    public void displayAlarm() {
        System.out.println("\nHIGH TEMPERATURE ALARM");
        System.out.println("Machine: " + getMachineName());
        System.out.println("Temperature: " + getCurrentValue());
        System.out.println("Safe Limit: " + getSafeLimit());
    }

}