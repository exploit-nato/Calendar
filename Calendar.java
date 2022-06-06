import java.util.Scanner;
////
public class Calendar {
	////////////////////////////////////////////////////////////////////
	static Scanner sc = new Scanner(System.in);
	static int choice, day_selected, days_in_month, year;
	////////////////////////////////////////////////////////////////////
	public static void main(String[] args) { UserDayInput(); }
	////////////////////////////////////////////////////////////////////
	public static void UserDayInput(){
		boolean complete = false;
		System.out.println("+-----------------------------------------------------+");
		System.out.println("|   0. Sunday | 1. Monday | 2. Tuesday | 3. Wednseday |");
		System.out.println("|   4. Thursday | 5. Friday | 6. Saturday             |");
		System.out.println("+-----------------------------------------------------+");
		System.out.println("_________________________________________________________");
		System.out.print("Please Enter The Number Of The Day The Year Starts On: "); choice = sc.nextInt();
		System.out.print("<->->->->->->->->->->->->->->->->->->->->->->->->->->-<->\n");
		System.out.print("Please Enter The Year: "); year = sc.nextInt();
		System.out.print("<->->->->->->->->->->->->->->->->->->->->->->->->->->-<->\n");
		while(!complete){
			switch(choice){
			case 0: day_selected = 0; complete = true; MonthDays(); break;
			case 1: day_selected = 1; complete = true; MonthDays(); break;
			case 2: day_selected = 2; complete = true; MonthDays(); break;
			case 3: day_selected = 3; complete = true; MonthDays(); break;
			case 4: day_selected = 4; complete = true; MonthDays(); break;
			case 5: day_selected = 5; complete = true; MonthDays(); break;
			case 6: day_selected = 6; complete = true; MonthDays(); break;
			default: System.out.println("\nChoice invalid, please retry.\n"); UserDayInput();
		}
	}
}
	////////////////////////////////////////////////////////////////////
	public static void PrintCalendar(int days_in_month){
		System.out.println(" ____________________ \n");
		System.out.println(" Su Mo Tu We Th Fr Sa");
		for(int x = 0; x < day_selected; x++){		// spacing : )
			System.out.print("   "); }
		for(int day = 1; day <= days_in_month; day++){
			if(day < 10){								// spacing : )
				System.out.print("  " + day); }
			else
				System.out.print(" " + day);
			if((day + day_selected) % 7 == 0 )	// If there is no remainder, then we know we need a new line because it has reached the 7th day : )
				System.out.println();
		} System.out.println("\n ____________________ "); day_selected = (day_selected + days_in_month) % 7;
	}
	////////////////////////////////////////////////////////////////////
	public static void MonthDays(){
		for(int month = 1; month <= 12; month++){
			switch(month){
			case 1: System.out.println("\n January "); PrintCalendar(days_in_month = 31); break;
			case 2: System.out.println("\n February ");
					if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
						PrintCalendar(days_in_month = 29); }
					else
						PrintCalendar(days_in_month = 28); break;   // if the year is exactly divisible by 4 / 400(modulus = 0), then it's a leap year. If it's exactly divisible by 100 it's not.
			case 3: System.out.println("\n March "); PrintCalendar(days_in_month = 31); break;
			case 4: System.out.println("\n April "); PrintCalendar(days_in_month = 30); break;
			case 5: System.out.println("\n May "); PrintCalendar(days_in_month = 31); break;
			case 6: System.out.println("\n June "); PrintCalendar(days_in_month = 30); break;
			case 7: System.out.println("\n July "); PrintCalendar(days_in_month = 31); break;
			case 8: System.out.println("\n August "); PrintCalendar(days_in_month = 31); break;
			case 9: System.out.println("\n September "); PrintCalendar(days_in_month = 30); break;
			case 10: System.out.println("\n October "); PrintCalendar(days_in_month = 31); break;
			case 11: System.out.println("\n November "); PrintCalendar(days_in_month = 30); break;
			case 12: System.out.println("\n December "); PrintCalendar(days_in_month = 31); break;
			}
		}
	}
}
