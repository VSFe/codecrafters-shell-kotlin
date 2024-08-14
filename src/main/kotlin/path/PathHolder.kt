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

    fun changeRelativePath(relativePath: String): Boolean {
        val canonicalPath = getCanonicalPath(relativePath)
        if (File(canonicalPath).exists()) {
            path = canonicalPath
            return true
        }
        return false
    }

    fun getCanonicalPath(relativePath: String): String {
        val newPath = if (path.endsWith("/")) "$path$relativePath" else "$path/$relativePath"
        return File(newPath).canonicalPath
    }
}