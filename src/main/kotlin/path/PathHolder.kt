package path

import java.io.File

object PathHolder {
    private var relativePath = "."

    fun getPresentLocation(): String = File(relativePath).canonicalPath
}