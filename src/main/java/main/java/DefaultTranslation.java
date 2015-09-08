package main.java;

public class DefaultTranslation implements Translation {
  public DefaultTranslation() {
  }

  public String applyTo(int input) {
    return String.valueOf(input);
  }

  public boolean isApplicableTo(int input) {
    return true;
  }
}