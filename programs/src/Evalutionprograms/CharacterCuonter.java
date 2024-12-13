package Evalutionprograms;

public class CharacterCuonter {
	 public static void countCharacters(String str) {
	        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;
	        str = str.toLowerCase();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (ch >= 'a' && ch <= 'z') { 
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            } else if (ch >= '0' && ch <= '9') {
	                digits++;
	            } else { 
	                specialChars++;
	            }
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	        System.out.println("Digits: " + digits);
	        System.out.println("Special characters: " + specialChars);
	    }

	    public static void main(String[] args) {
	        String str = "Hello World! 123";

	        countCharacters(str);
	    }
	}

