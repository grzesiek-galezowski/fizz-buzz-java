package main.java;

public class FizzTranslation implements Translation {
  public FizzTranslation() {
  }

  public String applyTo(int input) {
    return "Fizz";
  }

  public boolean isApplicableTo(int input) {
    return input % 3 == 0;
  }
}