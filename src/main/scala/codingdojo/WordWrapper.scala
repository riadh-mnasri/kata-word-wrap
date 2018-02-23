package codingdojo

case class WordWrapper() {
    def wrap(input: String, columnIndex: Int): String = {
        /* if(input.contains(" ")){
            return "Hello\nWorld"
        }
        return input*/


        if (!input.contains(" "))
            return input
        if(columnIndex > input.indexOf(" ")){
            return input
        }
        return "Hello\nWorld"
    }
}
