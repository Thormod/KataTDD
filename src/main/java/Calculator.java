

public class Calculator {
	
	public int Add(String numbers){
		// Result variable
		int result = 0;
		// Check if has multiple arguments 
		// Check if the string has "," character
		if(numbers.contains(",")){
			
			// Check how many arguments has
			int argumentNumber = getArgumentsNumber(numbers);	
			// Divide the string in array
		    String parts[] = numbers.split(",");
		    
		    // Add the non-empty characters
			for (int i = 0; i <= argumentNumber; i++) {
				if (!parts[i].equals("")) {
					result += Integer.parseInt(parts[i]);
				}
			}
			
			return result;
		} else {
			// Check if the string is empty
			if(numbers.equals("")){
				return result;
			} else {
				return Integer.parseInt(numbers);
			}
		}		
	}
	
	// Method to check how many arguments were sent
	private int getArgumentsNumber(String numbers){
		// Char counter
		int charCount = 0;
		// Character to check
		char toCheck = ',';
		// Temporal variable
		char temp;
		// Check every character in the string
		for (int i = 0; i < numbers.length(); i++) {
			temp = numbers.charAt(i);
			// If the current character is equals to the character to check increase the counter
			if (temp == toCheck) {
				charCount++;
			}
		}
		return charCount;
	}
	
	
}
