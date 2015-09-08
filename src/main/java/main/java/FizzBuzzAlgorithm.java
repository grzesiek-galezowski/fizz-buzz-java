package main.java;

public class FizzBuzzAlgorithm {

  private final ChainElement chain;

  public FizzBuzzAlgorithm(ChainElement chain) {
    this.chain = chain;
  }

  public String applyTo(int input) {
    return chain.translate(input);
  }


}
