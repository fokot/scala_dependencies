package guice

import com.google.inject.Guice
import java.util.Properties
import javax.inject.Inject
import scalatest.{Programmer, Serializer, PrintService}

object Runner {

  def main(args: Array[String]) {

    val injector = Guice createInjector new ProductionModule()

    val runner = injector getInstance classOf[Runner]
    runner run "Miso"

    val injector2 = Guice createInjector new ProductionModule2()
    val runner2 = injector2 getInstance classOf[Runner]
    runner2 run "Fero"
  }
}


class Runner @Inject() (
  printService: PrintService,
  programmerSerializer: Serializer[Programmer]
  ) {

  def run(name: String) {

    val p = Programmer(name, "Scala")

    printService.print(programmerSerializer.serialize(p))
  }
}