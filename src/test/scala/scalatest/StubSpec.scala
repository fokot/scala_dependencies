package scalatest

import org.specs2.mutable._
import com.google.inject.Guice
import com.google.inject.util.Modules
import guice.{Runner, ProductionModule2}


class StubSpec extends Specification {

    "The 'Hello world' string" should {
      "contain 11 characters" in {
        "Hello world" must have size(11)
      }
      "start with 'Hello'" in {
        "Hello world" must startWith("Hello")
      }
      "end with 'world'" in {
        "Hello world" must endWith("world")
      }


      "test" in {

        val m = Modules `override` new ProductionModule2 `with` new TestModule
        val injector = Guice.createInjector(m)

        injector.getInstance(classOf[Runner]).run("Jozko")

        true must beTrue

      }
    }
  }