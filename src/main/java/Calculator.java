
public class Calculator {
	
	public int Add(String numbers){
	
		// Check if has multiple arguments 
		// Check if the string has "," character
		if(numbers.contains(",")){
			// Divide the string in array
			String parts[] = numbers.split(",");
			// Result variable
			int result = 0;
			// Check if left part of "," character has an empty value
			if (!parts[0].equals("")) {
				result += Integer.parseInt(parts[0]);
			}
			// Check if right part of "," character has an empty value
			if (!parts[1].equals("")) {
				result += Integer.parseInt(parts[1]);
			}
			return result;
		} else {
			// Check if the string is empty
			if(numbers.equals("")){
				return 0;
			} else {
				return Integer.parseInt(numbers);
			}
		}
		
	}
	
}
