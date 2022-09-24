import java.util.Arrays;
import java.util.stream.Collectors;

public class StringArrToString {
	
public static void main(String[] args) {
	
	//Type 1:
	String[] arr= {"t", "r", "y"}; //t;r;y
	String join=String.join(";", arr);
	System.out.println(join);
	
	//Type 2:
	String join1=Arrays.asList("t","r","y","i","n","g").stream().collect(Collectors.joining("|"));
	System.out.println(join1);
	
	//Type 3:Converting Integer Arrays to Integer
	String join2=Arrays.asList(1,2,3,4,5,6,7,8,9).stream().map(e -> String.valueOf(e))
			.collect(Collectors.joining(""));
	System.out.println(join2);
	
}
}
