package guice

import com.google.inject.{TypeLiteral, AbstractModule}
import scalatest._
import scalatest.Programmer
import scalatest.Car

class ProductionModule extends AbstractModule {


  def configure() {

    bind(classOf[Runner])
    bind(classOf[PrintService]).to(classOf[PrintServiceImpl])

    bind(new TypeLiteral[Serializer[Programmer]](){}).to(classOf[ProgrammerSerializer])
    bind(new TypeLiteral[Serializer[Car]](){}).to(classOf[CarSerializer])
  }
}
