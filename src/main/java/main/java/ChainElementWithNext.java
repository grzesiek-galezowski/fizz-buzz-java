package main.java;

public class ChainElementWithNext implements ChainElement {
  private final Translation translation;
  private final ChainElement nextChainElement;

  public ChainElementWithNext(Translation translation, ChainElement nextChainElement) {
    this.translation = translation;
    this.nextChainElement = nextChainElement;
  }

  public String translate(int input) {
    if (translation.isApplicableTo(input)) {
      return translation.applyTo(input);
    } else {
      return nextChainElement.translate(input);
    }
  }
}