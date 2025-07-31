package stask1;

public class Castingwrapper {
	 public static void main(String[] args) {
	        Double doubleValue = 12.34;
	        int intValue = doubleValue.intValue(); // casting double to int
	        float floatValue = doubleValue.floatValue(); // casting double to float

	        System.out.println("Double: " + doubleValue);
	        System.out.println("Converted to int: " + intValue);
	        System.out.println("Converted to float: " + floatValue);
	    }

}
