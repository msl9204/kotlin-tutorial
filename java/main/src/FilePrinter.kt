import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {
    // kotlin에서는 Checked Exception이 없다. => 모두 Unchecked Exception
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}