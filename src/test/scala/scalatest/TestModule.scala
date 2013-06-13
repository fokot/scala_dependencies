package scalatest

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule

class TestModule extends AbstractModule with ScalaModule {

  def configure() {

    bind[PrintService].to[TestPrintServiceImpl]
  }
}
