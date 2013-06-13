package guice

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule
import scalatest._
import scalatest.Programmer
import scalatest.Car

class ProductionModule2 extends AbstractModule with ScalaModule {


   def configure() {

     bind[Runner]
     bind[PrintService].toInstance(new PrintServiceImpl)

     bind[Serializer[Programmer]].to[ProgrammerSerializer]
     bind[Serializer[Car]].to[CarSerializer]
   }
 }
