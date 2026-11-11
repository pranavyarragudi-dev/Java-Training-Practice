public abstract class Alarm {

    private String machineName;
    private double currentValue;
    private double safeLimit;
    private boolean active;

    public Alarm(String machineName, double currentValue, double safeLimit) {
        this.machineName = machineName;
        this.currentValue = currentValue;
        this.safeLimit = safeLimit;
        this.active = false;
    }

    public String getMachineName() {
        return machineName;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getSafeLimit() {
        return safeLimit;
    }

    public boolean isActive() {
        return active;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public void activate() {
        active = true;
    }

    public void acknowledge() {
        active = false;
        System.out.println("Alarm acknowledged for " + machineName);
    }

    public abstract boolean checkCondition();

    public abstract void displayAlarm();

}