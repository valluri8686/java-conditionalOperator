class MonthName {
	public static void main(String[] args) {
		monthName("april");
	}
	public static void monthName(String i){
		
			switch(i){
				case "january":{
							System.out.print(1);
							break;
						 }
				case "february":{
							System.out.print(2);
							break;
						 }
				case "march":{
							System.out.print(3);
							break;
						 }
				case "april":{
							System.out.print(4);
						    break;
						 }
				case "may":{
							System.out.print(5);
							break;
						 }
				case "june":{
							System.out.print(6);
							break;
						 }
				case "july":{
							System.out.print(7);
							break;
							
						 }
				case "august":{
							System.out.print(8);
							break;
							
						 }
				case "september":{
							System.out.print(9);
							break;
							
						 }
				case "october":{
							System.out.print(10);
							break;
							
						 }
				case "november":{
							System.out.print(11);
							break;
							
						 }
				case "december":{
							System.out.print(12);
							break;
							
						 }
				
			    default :{
							System.out.println(" not a month");
							break;
						 }
			}
		
	}

}