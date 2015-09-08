package main.java;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(JUnitParamsRunner.class)
public class FizzBuzzSpecification {

  @Test
  @Parameters({
      "1,1",
      "2,2",
      "3, Fizz",
      "6, Fizz",
      "5, Buzz",
      "10, Buzz",
      "15, FizzBuzz",
      "30, FizzBuzz"
  })
  public void shouldConvertInputToExpectedValue(int input, String expectedOutput) {
    //GIVEN
    FizzBuzzAlgorithm algorithm = getFizzBuzzAlgorithm();

    //WHEN
    String output = algorithm.applyTo(input);

    //THEN
    assertThat(output, equalTo(expectedOutput));
  }

  private FizzBuzzAlgorithm getFizzBuzzAlgorithm() {
    return
        withInputInteger(tryTo(both(applyFizz(), applyBuzz()),
          elseTryTo(applyBuzz(),
            elseTryTo(applyFizz(),
              elseTryTo(convertToString(),
                elseFail())))));
  }

  private FizzBuzzAlgorithm withInputInteger(ChainElement chain) {
    return new FizzBuzzAlgorithm(chain);
  }

  private ChainElementWithNext elseTryTo(Translation translation, ChainElement next) {
    return new ChainElementWithNext(translation, next);
  }

  private ChainElementWithNext tryTo(Translation translation, ChainElement next) {
    return new ChainElementWithNext(translation, next);
  }


  private SumTranslation both(Translation translation1, Translation translation2) {
    return new SumTranslation(translation1, translation2);
  }

  private BuzzTranslation applyBuzz() {
    return new BuzzTranslation();
  }

  private FizzTranslation applyFizz() {
    return new FizzTranslation();
  }

  private DefaultTranslation convertToString() {
    return new DefaultTranslation();
  }

  private InvalidChainElement elseFail() {
    return new InvalidChainElement();
  }


}
