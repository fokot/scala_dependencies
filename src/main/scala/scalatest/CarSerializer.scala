package scalatest


class CarSerializer extends Serializer[Car] {

  def serialize(c: Car) = "brand: " + c.brand + ", model: " + c.model + ", year: " + c.year
}
