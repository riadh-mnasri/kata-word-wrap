package codingdojo

import org.scalatest.{FlatSpec, Matchers}
import codingdojo.wordWrapper._

class WrapperSpec extends FlatSpec with Matchers {

    it should "return the string when it does not contain space" in {
        assert("anyStringWithoutSpace".wrap(1) == "anyStringWithoutSpace")
    }

    it should "return all words splitted on different lines" in {
        assert("hello world".wrap(7) == "hello\nworld")
    }

    it should "return two worls on the first line" in {
        assert("hello world".wrap(20) == "hello world")
    }

}
