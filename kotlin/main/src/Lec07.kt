import java.io.File
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    val filePrinter = FilePrinter()
    filePrinter.readFile()

    val currentFile = File(".")
    filePrinter.readFile(currentFile.absolutePath + "/a.txt")
}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}