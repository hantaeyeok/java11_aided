package behavioral.command;
//Command Pattern : 요청을 캡슐화하여 여러 기능을 실행할 수 있는 패턴
public class CommandPattern {

	public static void main(String[] args) {
		Command com1 = new AlarmCommand(new Alarm());	//Alarm 과 Lamp의 기능을 합쳐 전달
		Button bth1 = new Button(com1);
		bth1.pressed(true);
		bth1.pressed(false);
		
		com1 = new LampCommand(new Lamp());
		bth1.pressed(true);
		bth1.pressed(false);
		

	}

}
