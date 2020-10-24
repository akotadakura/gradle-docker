package info.akotadakura.utils;

import static info.akotadakura.utils.SampleUtil.sampleText;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class SampleUtilTest {

  @Test
  public void returnThinkingMachineName() {
    String songName = sampleText(true);
    assertThat(songName, is("1- Measurement Of Thoughts"));
  }

  @Test
  public void returnZeus() {
    String songName = sampleText(false);
    assertThat(songName, is("2- Deus Ex Machina"));
  }
}
