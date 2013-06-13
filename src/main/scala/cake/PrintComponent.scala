package cake

import scalatest.{PrintServiceImpl, PrintService}

trait PrintComponent {

  def printService: PrintService
}

trait PrintComponentImpl extends PrintComponent {
  val printService = new PrintServiceImpl
}
