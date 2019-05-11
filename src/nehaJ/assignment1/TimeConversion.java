package nehaJ.assignment1;

//program to convert seconds to hour, minute and seconds
public class TimeConversion {
	public static void main(String[] args) {
		long seconds = 4789;
		TimeConversion calc = new TimeConversion();
		System.out.println("\nSeconds " + seconds + " converted to hour, minute and seconds as below" + "\nHour: "
				+ calc.hour(seconds) + "\nMinute: " + calc.minute(seconds) + "\nSeconds: " + calc.second(seconds));

	}

	// Convert into hour
	int hour(long h) {

		return (int) (h / 3600);
	}

	// Convert into minute
	long minute(long m) {
		return ((m % 3600) / 60);
	}

	// Convert into seconds
	long second(long s) {
		return ((s % 60) % 60);
	}
}
