

public class Calculator {
	
	public int Add(String numbers){
		// Result variable initialization
		int result = 0;
		
		// Check if has multiple arguments 
		// Check if the string has "," character
		if(numbers.contains(",")){	
			// Check how many arguments has
			int argumentNumber = getArgumentsNumber(numbers, ',');	
			
			// Divide the string in array
		    String parts[] = numbers.split(",");
		    
		    // Add the non-empty characters
			for (int i = 0; i <= argumentNumber; i++) {
				if(parts[i].contains("\n")){
					int subArgumentNumber = getArgumentsNumber(parts[i], '\n');	
					String subParts[] = parts[i].split("\n");
					for (int j = 0; j <= subArgumentNumber; j++) {
						result += sum(subParts[j]);
					}
				} else {
					result += sum(parts[i]);	
				}
			}
			return result;
		} else {
			
			if(numbers.contains("\n")){
				// Check how many arguments has
				int argumentNumber = getArgumentsNumber(numbers, '\n');	
				// Divide the string in array
			    String parts[] = numbers.split("\n");
			    for (int i = 0; i <= argumentNumber; i++) {
			    	result += sum(parts[i]);
			    }
			}
			
			// Check if the string is empty
			if(numbers.equals("")){
				return result;
			} else {
				return Integer.parseInt(numbers);
			}
		}		
	}
	
	// Method to check how many arguments were sent
	private int getArgumentsNumber(String numbers, char toCheck){
		// Char counter
		int charCount = 0;
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
	
	private int sum(String number){
		int result = 0;
		if (!number.equals("")) {
			result += Integer.parseInt(number);
		}
		return result;
	}
	
}
