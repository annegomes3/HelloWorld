package Week2;

public class LoopAnalysisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int var1 = 4;
        int var2 = 2;
       // System.out.println("var1: " + var1 + " var2: " + var2);// expected output is var1 = 3 and var2 =2
        while ((var2 != 0) && ((var1 / var2) >= 0))
        {
            var1 = var1 + 1;
            var2 = var2 - 1;
        
        // System.out.println("var1: " + var1 + " var2: " + var2); // expected output is var1 = 4 and var2 = 1
        }

        System.out.println("var1: " + var1 + " var2: " + var2);

    }
}
