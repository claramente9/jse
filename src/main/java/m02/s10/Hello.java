package m02.s10;

public class Hello {
public static void main (String[] args) {
	int i = 0;
	while (i < args.length) {
	// String s = "The argument" + i "is" + args[i]
		String s = "The argument";
		s = s + i;
		s = s + "is";
		s = s + args[i];
		System.out.println(s);
		i += 1;
		System.out.println("ciao!");
				
				
				
		
	}
			
}
}
