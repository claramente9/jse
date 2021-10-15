package m02.s10.ex;

public class Exercise1 {
	public static void main(String[] args) {
		// TODO: print all values in [0 .. 9]
		// (1) for loop
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}
	}

// (2) while loop
	int i1 = 0;
	{
		while (i1 < 10) {
			System.out.println(i1);
			i1++;
		}
	}

// (3) do-while loop
	int i2 = 0;
	{
		do {
			System.out.println(i2++);
		} while (i2 <= 9);
	}
}