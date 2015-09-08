package main.java;

public class BuzzTranslation implements Translation {
  public BuzzTranslation() {
  }

  @Override
  public String applyTo(int input) {
    return "Buzz";
  }

  @Override
  public boolean isApplicableTo(int input) {
    return input % 5 == 0;
  }
}