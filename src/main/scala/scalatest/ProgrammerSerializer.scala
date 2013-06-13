package scalatest


class ProgrammerSerializer extends Serializer[Programmer] {

  def serialize(p: Programmer) = "name: " + p.name + ", language: " + p.lang
}
