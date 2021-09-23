package iteratorPattern;

public class Chalk {

	public static void makeChalks(String color) {
		System.out.println("Welcome to Chalk Factory.\nWe are making your color chalks with color:"+color);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Your "+color+" chalks are ready.Please collect from delivery Section");
			 
	}
	public static void makeBoard(String color) {
		System.out.println("Welcome to Chalk Factory.\nWe are making your color board with color:"+color);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Your "+color+" board is ready.Please collect from delivery Section");
			
	}
	public static void makeSideWalkBoard(String content) {
	System.out.println("Welcome to Chalk Factory.\nWe are making your sidewalk board with given content.\nContent:"+content);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Your sidewalk board is ready.Please collect from delivery Section");
			
	}
}
