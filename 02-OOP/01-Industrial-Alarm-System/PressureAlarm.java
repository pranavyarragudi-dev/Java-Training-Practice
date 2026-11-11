public class PressureAlarm extends Alarm {

    public PressureAlarm(String machineName, double currentValue, double safeLimit) {
        super(machineName, currentValue, safeLimit);
    }

    @Override
    public boolean checkCondition() {
        return getCurrentValue() > getSafeLimit();
    }

    @Override
    public void displayAlarm() {
        System.out.println("\nHIGH PRESSURE ALARM");
        System.out.println("Machine: " + getMachineName());
        System.out.println("Pressure: " + getCurrentValue());
        System.out.println("Safe Limit: " + getSafeLimit());
    }

}