package info.akotadakura;

import static info.akotadakura.utils.SampleUtil.sampleText;

import info.akotadakura.models.SampleModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    log.info("json logging: {}", "succeed!!");
    log.info("Ghost Prototype {}", sampleText(true));
    SampleModel model = new SampleModel("Per Nilsson", "guitar");
    System.out.println(model.toString());
  }
}
