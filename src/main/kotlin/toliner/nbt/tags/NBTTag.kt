package toliner.nbt.tags

import toliner.nbt.CompoundMap
import toliner.nbt.TagType
import kotlin.reflect.KClass

private typealias Integer = kotlin.Int

sealed class NBTTag<out T>(val tagType: TagType) : Comparable<NBTTag<*>> {
    abstract val value: T
    abstract val name: kotlin.String
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
        override val name: kotlin.String
            get() = ""

        override val value: Any?
            get() = null

        override fun clone(): NBTTag<Any?> {
            return End()
        }
    }

    data class Byte(override val name: kotlin.String, override val value: kotlin.Byte) : NBTTag<kotlin.Byte>(TagType.BYTE) {
        override fun clone(): NBTTag<kotlin.Byte> {
            return copy()
        }
    }

    data class Short(override val name: kotlin.String, override val value: kotlin.Short) : NBTTag<kotlin.Short>(TagType.SHORT) {
        override fun clone(): NBTTag<kotlin.Short> {
            return copy()
        }
    }

    data class Int(override val name: kotlin.String, override val value: Integer) : NBTTag<Integer>(TagType.INT) {
        override fun clone(): NBTTag<Integer> {
            return copy()
        }
    }

    data class Long(override val name: kotlin.String, override val value: kotlin.Long) : NBTTag<kotlin.Long>(TagType.LONG) {
        override fun clone(): NBTTag<kotlin.Long> {
            return copy()
        }
    }

    data class Float(override val name: kotlin.String, override val value: kotlin.Float) : NBTTag<kotlin.Float>(TagType.FLOAT) {
        override fun clone(): NBTTag<kotlin.Float> {
            return copy()
        }
    }

    data class Double(override val name: kotlin.String, override val value: kotlin.Double) : NBTTag<kotlin.Double>(TagType.DOUBLE) {
        override fun clone(): NBTTag<kotlin.Double> {
            return copy()
        }
    }

    data class ByteArray(override val name: kotlin.String, private val list: kotlin.collections.List<kotlin.Byte>) : NBTTag<kotlin.ByteArray>(TagType.BYTE_ARRAY) {
        override val value: kotlin.ByteArray
            get() = list.toByteArray()

        override fun clone(): NBTTag<kotlin.ByteArray> {
            return copy()
        }
    }

    data class String(override val name: kotlin.String, override val value: kotlin.String) : NBTTag<kotlin.String>(TagType.STRING) {
        override fun clone(): NBTTag<kotlin.String> {
            return copy()
        }
    }

    data class List<T : NBTTag<*>>(override val name: kotlin.String, val type: KClass<T>, override val value: kotlin.collections.List<T>) : NBTTag<kotlin.collections.List<T>>(TagType.LIST) {
        override fun clone(): NBTTag<kotlin.collections.List<T>> {
            return copy()
        }
    }

    data class Compound(override val name: kotlin.String, override val value: CompoundMap): NBTTag<CompoundMap>(TagType.COMPOUND) {
        override fun clone(): NBTTag<CompoundMap> {
            return copy()
        }
    }

    data class IntArray(override val name: kotlin.String, private val list: kotlin.collections.List<kotlin.Int>) : NBTTag<kotlin.IntArray>(TagType.INT_ARRAY) {
        override val value: kotlin.IntArray
            get() = list.toIntArray()

        override fun clone(): NBTTag<kotlin.IntArray> {
            return copy()
        }
    }

    data class ShortArray(override val name: kotlin.String, private val list: kotlin.collections.List<kotlin.Short>) : NBTTag<kotlin.ShortArray>(TagType.SHORT_ARRAY) {
        override val value: kotlin.ShortArray
            get() = list.toShortArray()

        override fun clone(): NBTTag<kotlin.ShortArray> {
            return copy()
        }
    }
}
