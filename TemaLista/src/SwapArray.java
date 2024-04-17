import java.util.ArrayList;
import java.util.Collections;

public class SwapArray {
	
	
	
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList <String>();
		list.add("Hello");
		list.add("World");
		
		
		if(list.size()> 1) {
			Collections.swap(list,1,0);
			System.out.println(list);
		}
		else if(list.size()==1) {
			System.out.println(list);
		} else if(list.size() < 1) {
			System.out.println(list);
		}
		
		
		

	}

}
