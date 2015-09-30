/**
 * Created by david_williams on 9/21/15.
 */
case class Name(input: String) {
  def isvalid: Boolean = {
    input.matches("[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]+")
  }
}
