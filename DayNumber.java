class DayNumber {
	public static void main(String[] args) {
		dayNumber("sunday");
	}
	public static void dayNumber(String i){
		
			switch(i){
				case "sunday":{
							System.out.println(1);
							break;
						 }
				case "monday":{
							System.out.println(2);
							break;
						 }
				case "tuesday":{
							System.out.println(3);
							break;
						 }
				case "wednesday":{
							System.out.println(4);
							break;
						 }
				case "thusday":{
							System.out.println(5);
							break;
						 }
				case "friday":{
							System.out.println(6);
							break;
						 }
				case "saturday":{
							System.out.println(7);
							break;
						 }
				
			    default :{
							System.out.println("INVALID INPUT");
							break;
						 }
			}
		
	}

}
