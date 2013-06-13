package scalatest

import java.text.DateFormat
import java.util.{Locale, Date}
import javax.inject.Singleton

@Singleton
class PrintServiceImpl extends PrintService {

  def print(message: String) = {

    val date = DateFormat.getDateInstance(DateFormat.SHORT, Locale.GERMAN) format now

    println(s"$date : $message")
  }

  def now = new Date
}
