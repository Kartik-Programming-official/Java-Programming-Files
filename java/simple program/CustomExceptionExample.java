class CUSTOMEXCEPTION extends Exception{
	public CUSTOMEXCEPTION(String message){
		super(message);
	}
}
public class Example{
	public void ValidateAge(int age) throws CUSTOMEXCEPTION{
        if(age<18){
			throws new CUSTOMEXCEPTION("\n Age Must be 18 or Older.");
		}
		System.out.println("\n Age is valid");
	}
}
public class CustomExceptionExample{
	public static void main(String[]args){
		Example EX= new Example();
		try{
			EX.ValidateAge(15);
			EX.ValidateAge(20);
		}catch(CustomException e){
			System.out.println("\n Exception Caught:- " +e.message());
		}
	}
}

// Step 1: Define a custom exception class (checked exception)
/*class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

// Step 2: Define a class that uses the custom exception
class Example {
    // Method that may throw the custom exception
    public void performOperation(int value) throws CustomCheckedException {
        if (value < 0) {
            throw new CustomCheckedException("Negative value not allowed");
        } else {
            System.out.println("Value is valid: " + value);
        }
    }
}

// Step 3: Demonstrate usage of the custom exception
public class CustomExceptionExample {
    public static void main(String[] args) {
        Example example = new Example();
        
        try {
            example.performOperation(10); // Valid operation
            example.performOperation(-5); // This will throw CustomCheckedException
        } catch (CustomCheckedException e) {
            // Handle the exception
            System.out.println("CustomCheckedException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}*/