package codingdojo

import org.scalatest.{FlatSpec, Matchers}

class WrapperSpec extends FlatSpec with Matchers {

   "word wrap" should "return input string when it does not contain space" in {
        val inputString: String = "anyStringWithoutSpace"
        val wrapper = new WordWrapper()
        assert(wrapper.wrap(inputString, 1) == inputString)
    }

    "word wrap" should "return input string when it has just one space" in {
        val wrapper = new WordWrapper()
        assert(wrapper.wrap("Hello World", 10) == "Hello\nWorld")
    }

    "word wrap" should "return input string when it has just one space " +
        "and columnSize is greater than the index of the first space" in {
        val wrapper = new WordWrapper()
        assert(wrapper.wrap("Hello World", 30) == "Hello World")
    }

    "word wrap" should "return input string when it has two spaces" in {
        val wrapper = new WordWrapper()
        assert(wrapper.wrap("Hello World all !", 12) == "Hello World\nall !")
    }




}
