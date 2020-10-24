package info.akotadakura;

import static info.akotadakura.utils.SampleUtil.sampleText;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
  private static final Logger logger = LoggerFactory.getLogger(App.class);

  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    logger.info("json logging: {}", "succeed!!");
    logger.info("Ghost Prototype {}", sampleText(true));
  }
}
