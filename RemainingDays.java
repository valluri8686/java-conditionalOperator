class RemainingDays {
	public static void main(String[] args) {
		remainingDays(1);
	}
	public static void remainingDays(int i){
		
			switch(i){
				case 1:{
							System.out.print("S, ");
							
						 }
				case 2:{
							System.out.print("M, ");
							
						 }
				case 3:{
							System.out.print("T, ");
							
						 }
				case 4:{
							System.out.print("W, ");
						
						 }
				case 5:{
							System.out.print("T, ");
							
						 }
				case 6:{
							System.out.print("F, ");
							
						 }
				case 7:{
							System.out.print("S");
							break;
							
						 }
				
			    default :{
							System.out.println(" not a working day");
							break;
						 }
			}
		
	}

}