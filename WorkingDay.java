class WorkingDay {
	public static void main(String[] args) {
		workingDay(1);
	}
	public static void workingDay(int i){
		
			switch(i){
				case 1:{
							System.out.println("SUNDAY is not a working day");
							break;
						 }
				case 2:{
							System.out.println("MONDAY is a working day");
							break;
						 }
				case 3:{
							System.out.println("TUESDAY is a working day");
							break;
						 }
				case 4:{
							System.out.println("WEDNESDAY is a working day");
							break;
						 }
				case 5:{
							System.out.println("THUSDAY is a working day");
							break;
						 }
				case 6:{
							System.out.println("FRIDAY is a working day");
							break;
						 }
				case 7:{
							System.out.println("SATURDAY is a working day");
							break;
						 }
				
			    default :{
							System.out.println(" not a working day");
							break;
						 }
			}
		
	}

}