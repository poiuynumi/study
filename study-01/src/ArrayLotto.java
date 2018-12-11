import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;

public class ArrayLotto {

	public static void main(String[] args) {
		
		List<Integer> arraylotto = new ArrayList<>();
		for (int i=0;arraylotto.size()<6;i++) {
			arraylotto.add((int)(Math.random()*45)+1);
			}Collections.sort(arraylotto);
						
		System.out.println(arraylotto);
	}

}
