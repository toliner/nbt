package toliner.nbt.tags

import toliner.nbt.TagType

sealed class NBTTag<out T>(val tagType: TagType) : Comparable<NBTTag<*>> {
    abstract fun getValue(): T
    abstract fun clone(): NBTTag<T>
    abstract val name: String

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

    class End : NBTTag<Any?>(TagType.END) {
        override val name: String
            get() = ""

        override fun getValue(): Any? {
            return null
        }

        override fun clone(): NBTTag<Any?> {
            return End()
        }

    }

      data class Byte(override val name: String, val value: kotlin.Byte): NBTTag<kotlin.Byte>(TagType.BYTE) {
        override fun getValue(): kotlin.Byte {
            return value
        }

        override fun clone(): NBTTag<kotlin.Byte> {
            return copy()
        }

    }
}
