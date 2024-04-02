class SeasonName {
	public static void main(String[] args) {
		seasonName("april");
	}
	public static void seasonName(String i){
		
			switch(i){
				case "january":{
							System.out.print("WINTER");
							break;
						 }
				case "february":{
							System.out.print("WINTER");
							break;
						 }
				case "march":{
							System.out.print("SUMMER");
							break;
						 }
				case "april":{
							System.out.print("SUMMER");
						    break;
						 }
				case "may":{
							System.out.print("SUMMER");
							break;
						 }
				case "june":{
							System.out.print("RAINY");
							break;
						 }
				case "july":{
							System.out.print("RAINY");
							break;
							
						 }
				case "august":{
							System.out.print("RAINY");
							break;
							
						 }
				case "september":{
							System.out.print("SPRING");
							break;
							
						 }
				case "october":{
							System.out.print("SPRING");
							break;
							
						 }
				case "november":{
							System.out.print("SPRING");
							break;
							
						 }
				case "december":{
							System.out.print("WINTER");
							break;
							
						 }
				
			    default :{
							System.out.println(" not a month");
							break;
						 }
			}
		
	}

}