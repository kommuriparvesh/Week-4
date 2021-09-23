package iteratorPattern;

import java.util.Scanner;

public class IteratorPatternDemo {
	public static int buy[]=new int[5];
	   public static void main(String[] args) {
	      DevIt it = new DevIt();
	      Scanner sc=new Scanner(System.in);
	 		System.out.println("Welcome to Chalk Enterprises");
	 		for(int i=0;i<5;i++) {
	 		System.out.println("Select your service:\n"
 					+ "1.Make Chalk\n"
 					+ "2.Make Board\n"
 					+ "3.Make Side Walk Board\n");

	 		System.out.println("Enter what to buy.");
	 		buy[i]=sc.nextInt();
	 		}
	 		int temp=0;
	      for(Iterator iter = it.getIterator(); iter.hasNext();){
	         int fun = (int)iter.next();
	        temp++;
	        System.out.println("Iterator time:"+temp);
	 			switch(fun) {
	 			case 1:{
	 				System.out.println("Enter Chalk color");
	 				Chalk.makeChalks(sc.next());
	 				break;
	 			}
	 			case 2:{
	 				System.out.println("Enter Board color");
	 				Chalk.makeBoard(sc.next());
	 				break;
	 			}
	 			case 3:{
	 				sc.nextLine();
	 				System.out.println("Enter SideWalk Board content");
	 				
	 				String con=sc.nextLine();
	 								
	 				Chalk.makeSideWalkBoard(con);
	 				break;
	 			}
	 			
	 				
	 			
	 			}
	 			
	 			
	 		}
	         
	      } 
	   public static int[] getLst() {
		   return buy;
	   }
	   }
	