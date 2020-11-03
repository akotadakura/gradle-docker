package info.akotadakura.utils;

import static info.akotadakura.utils.SampleUtil.sampleText;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.is;
//
//import org.junit.Test;

import org.junit.jupiter.api.Test;

public class SampleUtilTest {

  @Test
  void returnThinkingMachineName() {
    String songName = sampleText(true);
//    assertThat(songName, is("1- Measurement Of Thoughts"));
    assertEquals("1- Measurement Of Thoughts", songName);
  }
//
  @Test
  public void returnZeus() {
    String songName = sampleText(false);
//    assertThat(songName, is("2- Deus Ex Machina"));
    assertEquals("2- Deus Ex Machina", songName);
  }
}
