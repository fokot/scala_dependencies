package cake

import scalatest.{ProgrammerSerializer, Programmer, Serializer}


trait ProgrammerSerializerComponent {

  def programmerSerializer: Serializer[Programmer]
}

trait ProgrammerSerializerComponentImpl extends ProgrammerSerializerComponent {
  val programmerSerializer = new ProgrammerSerializer
}
