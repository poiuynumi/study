import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		
		Set<Integer> lotto = new TreeSet<>();
		for (int i=0;lotto.size()<6;i++) {
			lotto.add((int)(Math.random()*45)+1);
				}
		System.out.print(lotto.toString());

	}

}
