class Main {
  public static void convert(int number){
    int digit;// The digit we need to read
    char digitChar;// need to convert that digit to char in order to seperate digits
    String digitWord="";//The word we will print
    String s = Integer.toString(number);//Convert number to string so we can seperate and iterate through each digit.
    for(int i=0;i<s.length();i++){// iterate through each digit in the number to get their phonetic value
      digitChar=s.charAt(i);
      digit = Character.getNumericValue(digitChar);// get the int value back from each individual digit
      switch(digit){//switch statement to map digits to their words.
       case 0:digitWord="Zero";
       break; 
       case 1:digitWord="One";
       break;
       case 2:digitWord="Two";
       break;
       case 3:digitWord="Three";
       break;
       case 4:digitWord ="Four";
       break;
       case 5:digitWord="Five";
       break;
       case 6:digitWord="Six";
       break;
       case 7:digitWord="Seven";
       break;
       case 8:digitWord="Eight";
       break;
       case 9:digitWord ="Nine"; 
     }
     System.out.print(digitWord);
    }
  }
  public static void main(String[] args) {
    
    int number;
    for(int i=0;i<args.length;i++){// read any amount of integers from command line
      number =Integer.parseInt(args[i]);
      convert(number);// convert each number to words and print
      if(i!=args.length-1)System.out.print(", ");
    }
    
    
  }
}
