package toliner.nbt.tags

import toliner.nbt.TagType

private typealias Integer = kotlin.Int

sealed class NBTTag<out T>(val tagType: TagType) : Comparable<NBTTag<*>> {
    abstract val value: T
    abstract val name: String
    abstract fun clone(): NBTTag<T>

    override fun compareTo(other: NBTTag<*>): Integer {
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

        override val value: Any?
            get() = null

        override fun clone(): NBTTag<Any?> {
            return End()
        }
    }

    data class Byte(override val name: String, override val value: kotlin.Byte) : NBTTag<kotlin.Byte>(TagType.BYTE) {
        override fun clone(): NBTTag<kotlin.Byte> {
            return copy()
        }
    }

    data class Short(override val name: String, override val value: kotlin.Short) : NBTTag<kotlin.Short>(TagType.SHORT) {
        override fun clone(): NBTTag<kotlin.Short> {
            return copy()
        }
    }

    data class Int(override val name: String, override val value: Integer) : NBTTag<Integer>(TagType.INT) {
        override fun clone(): NBTTag<Integer> {
            return copy()
        }
    }

    data class Long(override val name: String, override val value: kotlin.Long) : NBTTag<kotlin.Long>(TagType.LONG) {
        override fun clone(): NBTTag<kotlin.Long> {
            return copy()
        }
    }

    data class Float(override val name: String, override val value: kotlin.Float) : NBTTag<kotlin.Float>(TagType.FLOAT) {
        override fun clone(): NBTTag<kotlin.Float> {
            return copy()
        }
    }

    data class Double(override val name: String, override val value: kotlin.Double) : NBTTag<kotlin.Double>(TagType.DOUBLE) {
        override fun clone(): NBTTag<kotlin.Double> {
            return copy()
        }
    }
}
