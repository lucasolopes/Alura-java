import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("adada");
		palavras.add("dijd a jifgsf das");
		palavras.add("gdfghdh");

		Collections.sort(palavras);
		System.out.println(palavras);

		palavras.forEach(System.out::println);

		palavras.sort((String s1, String s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		});
		
		
		
		palavras.sort(Comparator.comparing(String::length)); 

	}
}

class Comparador implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return 0;
	}

}
