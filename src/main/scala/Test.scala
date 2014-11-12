import com.google.common.io.BaseEncoding

import Test._

class Test {

  def encode(s: String): String = {
    myEncoding.encode(s.getBytes())
  }
}

object Test {
  val myEncoding: BaseEncoding = BaseEncoding.base64Url().omitPadding()

}