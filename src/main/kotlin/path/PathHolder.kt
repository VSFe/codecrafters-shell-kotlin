package path

import java.io.File

object PathHolder {
    private var path = File(".").canonicalPath

    fun getPresentLocation(): String = File(path).canonicalPath

    fun changeAbsolutePath(newAbsolutePath: String): Boolean {
        if (File(newAbsolutePath).exists()) {
            path = newAbsolutePath
            return true
        }
        return false
    }
}