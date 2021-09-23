package iteratorPattern;


public class DevIt implements Container {
	   public static int buy[]=IteratorPatternDemo.getLst();
	   

	   @Override
	   public Iterator getIterator() {
	      return new DevIterator();
	   }

	   private class DevIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < buy.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return buy[index++];
	         }
	         return null;
	      }		
	   }
	}