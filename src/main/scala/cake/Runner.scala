package cake

import scalatest.Programmer

object Runner {

  def main(args: Array[String]) {

    val runner = new Runner with ProgrammerSerializerComponentImpl with PrintComponentImpl

    runner run "Kolac"
  }
}


class Runner {
  self : PrintComponent with ProgrammerSerializerComponent =>


  def run(name: String) {

    val p = Programmer(name, "Scala")

    printService.print(programmerSerializer.serialize(p))
  }
}