package behavioral.command;

public class AlarmCommand implements Command{
	private Alarm theAlarm;
	public AlarmCommand(Alarm theAlarm) {
		super();
		this.theAlarm = theAlarm;
	}

	@Override
	public void execute (boolean sw) {
		if(sw) {
			theAlarm.start();
		}else {
			theAlarm.end();
		}
	}
	


}
