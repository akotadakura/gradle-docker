package info.akotadakura.utils;

public class SampleUtil {

  public static String sampleText(boolean bool) {
    StringBuilder builder = new StringBuilder();
    if (bool) {
      builder.append("1- ").append("Measurement ").append("Of ").append("Thoughts");
    } else {
      builder.append("2- ").append("Deus ").append("Ex ").append("Machina");
    }
    return builder.toString();
  }
}
