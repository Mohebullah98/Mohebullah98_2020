class Main {
  public static void convert(int number){
    int digit;
    char digitChar;
    String s = Integer.toString(number);
    for(int i=0;i<s.length;i++){
      digitChar=s.charAt(i);
      digit = Character.getNumericValue(digitChar);
    }
  }
  public static void main(String[] args) {
    int firstNumber = Integer.parseInt(args[0]);
    int secondNumber = Integer.parseInt(args[1]);
    int thirdNumber = Integer.parseInt(args[2]);

    
  }
}