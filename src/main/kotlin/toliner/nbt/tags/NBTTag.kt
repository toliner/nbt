package toliner.nbt.tags

import toliner.nbt.TagType

/**
 * @param name The tag name.
 */
sealed class NBTTag<out T>(val tagType: TagType, val name: String = ""): Comparable<NBTTag<*>> {
    abstract fun getValue(): T
    abstract fun cloneMap(): Map<String, T>
    abstract fun clone(): NBTTag<T>

    override fun compareTo(other: NBTTag<*>): Int {
        return if (this == other) {
            0
        } else {
            if (other.name == name) {
                throw IllegalStateException("Cannot compare two Tags with the same name but different values for sorting")
            } else {
                name.compareTo(other.name)
            }
        }
    }
}