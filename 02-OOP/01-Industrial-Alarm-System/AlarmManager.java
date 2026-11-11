public class AlarmManager {

    private AlarmListener listener;

    public AlarmManager(AlarmListener listener) {
        this.listener = listener;
    }

    public void monitorAlarm(Alarm alarm) {

        System.out.println("\nChecking machine: " + alarm.getMachineName());

        if(alarm.checkCondition()) {
            alarm.activate();
            listener.onAlarmTriggered(alarm);
        }
        else {
            System.out.println("Machine status: Normal");
        }

    }

    public void snoozeAlarm(Alarm alarm) {

        if(alarm.isActive()) {
            System.out.println("Alarm snoozed for " + alarm.getMachineName());
        }
        else {
            System.out.println("No active alarm to snooze");
        }

    }

}