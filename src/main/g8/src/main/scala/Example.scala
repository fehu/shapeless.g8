import shapeless._

object Example extends App {

  val hlist = 1 :: "one" :: true :: HNil

  println("My first HList: " + hlist)

}
