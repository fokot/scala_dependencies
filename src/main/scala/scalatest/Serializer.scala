package scalatest

trait Serializer[T] {

  def serialize(t: T): String

}
