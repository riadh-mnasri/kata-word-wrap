package codingdojo

object wordWrapper {

    implicit class StringCustomImprovements(val input: String) {
        def wrap(columnIndex: Int): String = {
            return input.split(" ").foldLeft(Array("")) {

                (acc, element) => {
                    val newSentence = (acc.last + " " + element).trim
                    if (acc.last.length > 0 && newSentence.length > columnIndex) {
                        acc :+ element
                    }
                    else {
                        acc.update(0, newSentence)
                        acc
                    }
                }
            }.mkString("\n")
        }
    }

}
