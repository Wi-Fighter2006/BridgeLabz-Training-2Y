package Lambda Expression;
@FunctionalInterface
interface Home{
	void Switch();
}
public class SmartHome {
public static void main(String[] args) {
	Home Motion = () -> System.out.println("Lights On/Off By Motion.");
	Home Time = () -> System.out.println("Warm Lights On By Time.");
	Home Voice = () -> System.out.println("Lights On/Off By Voice Commands.");
	 Motion.Switch();
     Time.Switch();
     Voice.Switch();
   }
}
