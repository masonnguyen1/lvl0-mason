import org.jointheleague.graphical.robot.Robot;

public class grafitti {
	public static void main(String[] args) {
		Robot steve = new Robot();
		steve.penDown();
		steve.move(400);
		steve.turn(130);
		steve.move(270);
		steve.turn(-89);
		steve.move(260);
	}

}
