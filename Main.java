class Main {
  public static void convert(int number){
    int digit;
    char digitChar;
    String digitWord="";
    String s = Integer.toString(number);
    for(int i=0;i<s.length();i++){
      digitChar=s.charAt(i);
      digit = Character.getNumericValue(digitChar);
      switch(digit){
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
    int firstNumber = Integer.parseInt(args[0]);
    int secondNumber = Integer.parseInt(args[1]);
    int thirdNumber = Integer.parseInt(args[2]);
    convert(firstNumber);
    System.out.print(",");
    convert(secondNumber);
    System.out.print(",");
    convert(thirdNumber);
    
  }
}
