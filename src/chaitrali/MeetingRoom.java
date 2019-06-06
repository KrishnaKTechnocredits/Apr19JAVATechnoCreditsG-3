package chaitrali;

public class MeetingRoom {
	String name;
	double hrs;
	
	public void bookMeetingRoom(){
		this.name = "Nalanda";
		this.hrs = 1;
		displayInfo();
	}
	
	public void bookMeetingRoom(String name, double hrs){
		this.name = name;
		this.hrs = hrs;
		displayInfo();
	}
	
	public void displayInfo(){
		System.out.println(name + " is booked for " + hrs + " hr.");
	}

	public static void main(String[] args) {
		
		MeetingRoom m1 = new MeetingRoom();
		m1.bookMeetingRoom();
		m1.bookMeetingRoom("Takshashila",2);

	}

}
