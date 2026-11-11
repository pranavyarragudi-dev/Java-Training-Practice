public class IndustrialAlarm implements AlarmListener {

    @Override
    public void onAlarmTriggered(Alarm alarm) {
        alarm.displayAlarm();
        System.out.println("WARNING: Immediate attention required!");
    }

}