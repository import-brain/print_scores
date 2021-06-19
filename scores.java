class scores {
  public static void main(String[] args) {
    evaluate(93);
    System.out.println(printed_value);
    evaluate(85);
    System.out.println(printed_value);
    evaluate(77);
    System.out.println(printed_value);
    evaluate(61);
    System.out.println(printed_value);
    evaluate(49);
    System.out.println(printed_value);
  }
  static char printed_value = 'x';
  static int score = 0;
  public static char evaluate(int score) {
  // define score value ranges
  if (score >= 90) {
    return printed_value = 'A';
  }
  else if (score >= 80) {
    return printed_value = 'B';
  }
  else if (score >= 70) {
    return printed_value = 'C';
  }
  else if (score >= 60) {
    return printed_value = 'D';
  }
  else if (score <= 59) {
    return printed_value = 'F';
  }
  else {
  return printed_value = 'x';
  }
}
}
