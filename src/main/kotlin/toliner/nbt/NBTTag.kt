/*
 * Copyright (c) 2018. toliner. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package toliner.nbt

import kotlin.reflect.KClass

private typealias Integer = kotlin.Int

/**
 * This class is base class of all tag classes.
 * All subclasses are nested under this class because all tag types are pre-defined.
 * This is comparable by [name] for sorting tags.
 *
 * @property tagType value of [TagType] for the tag.
 * @property value data that the tag has.
 * @property name name of the tag. It will be used for identifying tag.
 */
sealed class NBTTag<out T>(val tagType: TagType) : Comparable<NBTTag<*>> {
    abstract val value: T
    abstract val name: kotlin.String

    /**
     * To use create same name and value tag.
     */
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

    /**
     * The [TagType.END] tag.
     * This tag indicates end of [TagType.COMPOUND].
     */
    class End : NBTTag<Any?>(TagType.END) {
        override val name: kotlin.String
            get() = ""

        override val value: Any?
            get() = null

        override fun clone(): NBTTag<Any?> {
            return End()
        }
    }

    /**
     * The [TagType.BYTE] tag.
     * This tag stores one-byte-signed-integer data.
     */
    data class Byte(override val name: kotlin.String, override val value: kotlin.Byte) : NBTTag<kotlin.Byte>(TagType.BYTE) {
        override fun clone(): NBTTag<kotlin.Byte> {
            return copy()
        }
    }

    /**
     * The [TagType.SHORT] tag.
     * This tag stores two-bytes-signed-integer data, which we use it as [kotlin.Short]
     */
    data class Short(override val name: kotlin.String, override val value: kotlin.Short) : NBTTag<kotlin.Short>(TagType.SHORT) {
        override fun clone(): NBTTag<kotlin.Short> {
            return copy()
        }
    }

    /**
     * The [TagType.INT] tag.
     * This tag stores four-bytes-signed-integer data, which we use it as [kotlin.Int]
     */
    data class Int(override val name: kotlin.String, override val value: Integer) : NBTTag<Integer>(TagType.INT) {
        override fun clone(): NBTTag<Integer> {
            return copy()
        }
    }

    /**
     * The [TagType.LONG] tag.
     * This tag stores eight-bytes-signed-integer data, which we use it as [kotlin.Long]
     */
    data class Long(override val name: kotlin.String, override val value: kotlin.Long) : NBTTag<kotlin.Long>(TagType.LONG) {
        override fun clone(): NBTTag<kotlin.Long> {
            return copy()
        }
    }

    /**
     * The [TagType.FLOAT] tag.
     * This tag stores single-precision-floating-point-number data, which we use it as [kotlin.Float]
     */
    data class Float(override val name: kotlin.String, override val value: kotlin.Float) : NBTTag<kotlin.Float>(TagType.FLOAT) {
        override fun clone(): NBTTag<kotlin.Float> {
            return copy()
        }
    }

    /**
     * The [TagType.DOUBLE] tag.
     * This tag stores double-precision-floating-point-number data, which we use it as [kotlin.Double]
     */
    data class Double(override val name: kotlin.String, override val value: kotlin.Double) : NBTTag<kotlin.Double>(TagType.DOUBLE) {
        override fun clone(): NBTTag<kotlin.Double> {
            return copy()
        }
    }

    /**
     * The [TagType.BYTE_ARRAY] tag.
     * This tag stores an array of Bytes, which we use it as [kotlin.ByteArray]
     */
    data class ByteArray(override val name: kotlin.String, private val list: kotlin.collections.List<kotlin.Byte>) : NBTTag<kotlin.ByteArray>(TagType.BYTE_ARRAY) {
        override val value: kotlin.ByteArray
            get() = list.toByteArray()

        override fun clone(): NBTTag<kotlin.ByteArray> {
            return copy()
        }
    }

    /**
     * The [TagType.STRING] tag.
     * This tag stores [kotlin.String] data.
     */
    data class String(override val name: kotlin.String, override val value: kotlin.String) : NBTTag<kotlin.String>(TagType.STRING) {
        override fun clone(): NBTTag<kotlin.String> {
            return copy()
        }
    }

    /**
     * The [TagType.LIST] tag.
     * This tag stores list of [NBTTag]s.
     */
    data class List<T : NBTTag<*>>(override val name: kotlin.String, val type: KClass<T>, override val value: kotlin.collections.List<T>) : NBTTag<kotlin.collections.List<T>>(TagType.LIST) {
        override fun clone(): NBTTag<kotlin.collections.List<T>> {
            return copy()
        }
    }

    /**
     * The [TagType.COMPOUND] tag.
     * This tag stores some [NBTTag]s as key-value map
     */
    data class Compound(override val name: kotlin.String, override val value: CompoundMap) : NBTTag<CompoundMap>(TagType.COMPOUND) {
        override fun clone(): NBTTag<CompoundMap> {
            return copy()
        }
    }

    /**
     * The [TagType.INT_ARRAY] tag.
     * This tag stores array of [kotlin.Int], which we use it as [kotlin.IntArray]
     */
    data class IntArray(override val name: kotlin.String, private val list: kotlin.collections.List<kotlin.Int>) : NBTTag<kotlin.IntArray>(TagType.INT_ARRAY) {
        override val value: kotlin.IntArray
            get() = list.toIntArray()

        override fun clone(): NBTTag<kotlin.IntArray> {
            return copy()
        }
    }

    /**
     * The [TagType.SHORT_ARRAY] tag.
     * **WARNING** : This is optional tag. This tag is not defined original NBT format.
     * This tag stores array of [kotlin.Short], which we use it as [kotlin.ShortArray]
     */
    data class ShortArray(override val name: kotlin.String, private val list: kotlin.collections.List<kotlin.Short>) : NBTTag<kotlin.ShortArray>(TagType.SHORT_ARRAY) {
        override val value: kotlin.ShortArray
            get() = list.toShortArray()

        override fun clone(): NBTTag<kotlin.ShortArray> {
            return copy()
        }
    }
}
