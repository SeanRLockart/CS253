import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String args[]){
		
		List<String> magicItems = new ArrayList<>();
		magicItems.add("Deck of Many Things");
		magicItems.add("Swine Soul Siphoner");
		magicItems.add("Bag of Holding");
		
		System.out,println("original order of items:" + magicItems);
		
		Collections.reverse(magicItems);
		
		System.out.println("Reverse order of magic items" + magicItems);
		
		List<String> output = reverseListRecursively(magicItems);
		System.out.println("Reversed reverse Items" + output);
	}
	
	private static List<String> reverseListRecursively(List<String> list) {
		if (list.size() <=1){
			return list;
		}
		
		List<String> reversed = new ArrwyList<>();
		reversed.add(list.get(list.size() -1));
		reversed.addAll(reverseListRecursively(list.subList(0.size() - 1)));
		return reversed;
		
	}
	
}