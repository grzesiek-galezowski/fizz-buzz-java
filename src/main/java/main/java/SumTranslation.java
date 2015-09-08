package main.java;

public class SumTranslation implements Translation {

  private final Translation translation1;
  private final Translation translation2;

  public SumTranslation(Translation translation1, Translation translation2) {
    this.translation1 = translation1;
    this.translation2 = translation2;
  }

  public String applyTo(int input) {
    return translation1.applyTo(input)
        + translation2.applyTo(input);
  }

  public boolean isApplicableTo(int input) {
    return translation1.isApplicableTo(input)
        && translation2.isApplicableTo(input);
  }
}