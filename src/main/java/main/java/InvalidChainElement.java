package main.java;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class InvalidChainElement implements ChainElement {
  public InvalidChainElement() {
  }

  @Override
  public String translate(int input) {
    throw new NotImplementedException();
  }
}