/*
 * Copyright (c) 2018. toliner. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package toliner.nbt

import kotlin.reflect.KClass

/**
 * This class is base class of all **immutable** tag classes.
 * This class is reference impl for [NBTTag].
 * This is comparable by [name] for sorting tags.
 *
 * @property tagType value of [TagType] for the tag.
 * @property value data that the tag has.
 * @property name name of the tag. It will be used for identifying tag.
 */
sealed class NBTTags<out T>(val tagType: TagType) : NBTTag<T> {

    override fun compareTo(other: NBTTag<*>): kotlin.Int {
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
    class End : NBTTags<Nothing?>(TagType.END) {
        override val name: kotlin.String
            get() = ""

        override val value: Nothing?
            get() = null

        override fun clone(): NBTTags<Nothing?> {
            return End()
        }
    }

    /**
     * The [TagType.BYTE] tag.
     * This tag stores one-byte-signed-integer data.
     */
    data class Byte(override val name: kotlin.String, override val value: kotlin.Byte) : NBTTags<kotlin.Byte>(TagType.BYTE) {
        override fun clone(): NBTTags<kotlin.Byte> {
            return copy()
        }
    }

    /**
     * The [TagType.SHORT] tag.
     * This tag stores two-bytes-signed-integer data, which we use it as [kotlin.Short]
     */
    data class Short(override val name: kotlin.String, override val value: kotlin.Short) : NBTTags<kotlin.Short>(TagType.SHORT) {
        override fun clone(): NBTTags<kotlin.Short> {
            return copy()
        }
    }

    /**
     * The [TagType.INT] tag.
     * This tag stores four-bytes-signed-integer data, which we use it as [kotlin.Int]
     */
    data class Int(override val name: kotlin.String, override val value: kotlin.Int) : NBTTags<kotlin.Int>(TagType.INT) {
        override fun clone(): NBTTags<kotlin.Int> {
            return copy()
        }
    }

    /**
     * The [TagType.LONG] tag.
     * This tag stores eight-bytes-signed-integer data, which we use it as [kotlin.Long]
     */
    data class Long(override val name: kotlin.String, override val value: kotlin.Long) : NBTTags<kotlin.Long>(TagType.LONG) {
        override fun clone(): NBTTags<kotlin.Long> {
            return copy()
        }
    }

    /**
     * The [TagType.FLOAT] tag.
     * This tag stores single-precision-floating-point-number data, which we use it as [kotlin.Float]
     */
    data class Float(override val name: kotlin.String, override val value: kotlin.Float) : NBTTags<kotlin.Float>(TagType.FLOAT) {
        override fun clone(): NBTTags<kotlin.Float> {
            return copy()
        }
    }

    /**
     * The [TagType.DOUBLE] tag.
     * This tag stores double-precision-floating-point-number data, which we use it as [kotlin.Double]
     */
    data class Double(override val name: kotlin.String, override val value: kotlin.Double) : NBTTags<kotlin.Double>(TagType.DOUBLE) {
        override fun clone(): NBTTags<kotlin.Double> {
            return copy()
        }
    }

    /**
     * The [TagType.BYTE_ARRAY] tag.
     * This tag stores an array of Bytes, which we use it as [kotlin.ByteArray]
     */
    data class ByteArray(override val name: kotlin.String, private val list: kotlin.collections.List<kotlin.Byte>) : NBTTags<kotlin.ByteArray>(TagType.BYTE_ARRAY) {
        override val value: kotlin.ByteArray
            get() = list.toByteArray()

        override fun clone(): NBTTags<kotlin.ByteArray> {
            return copy()
        }
    }

    /**
     * The [TagType.STRING] tag.
     * This tag stores [kotlin.String] data.
     */
    data class String(override val name: kotlin.String, override val value: kotlin.String) : NBTTags<kotlin.String>(TagType.STRING) {
        override fun clone(): NBTTags<kotlin.String> {
            return copy()
        }
    }

    /**
     * The [TagType.LIST] tag.
     * This tag stores list of [NBTTags]s.
     */
    data class List<T : NBTTags<*>>(override val name: kotlin.String, val type: KClass<T>, override val value: kotlin.collections.List<T>) : NBTTags<kotlin.collections.List<T>>(TagType.LIST) {
        override fun clone(): NBTTags<kotlin.collections.List<T>> {
            return copy()
        }
    }

    /**
     * The [TagType.COMPOUND] tag.
     * This tag stores some [NBTTags]s as key-value map
     */
    data class Compound(override val name: kotlin.String, override val value: CompoundMap) : NBTTags<CompoundMap>(TagType.COMPOUND) {
        override fun clone(): NBTTags<CompoundMap> {
            return copy()
        }
    }

    /**
     * The [TagType.INT_ARRAY] tag.
     * This tag stores array of [kotlin.Int], which we use it as [kotlin.IntArray]
     */
    data class IntArray(override val name: kotlin.String, private val list: kotlin.collections.List<kotlin.Int>) : NBTTags<kotlin.IntArray>(TagType.INT_ARRAY) {
        override val value: kotlin.IntArray
            get() = list.toIntArray()

        override fun clone(): NBTTags<kotlin.IntArray> {
            return copy()
        }
    }

    /**
     * The [TagType.SHORT_ARRAY] tag.
     * **WARNING** : This is optional tag. This tag is not defined original NBT format.
     * This tag stores array of [kotlin.Short], which we use it as [kotlin.ShortArray]
     */
    data class ShortArray(override val name: kotlin.String, private val list: kotlin.collections.List<kotlin.Short>) : NBTTags<kotlin.ShortArray>(TagType.SHORT_ARRAY) {
        override val value: kotlin.ShortArray
            get() = list.toShortArray()

        override fun clone(): NBTTags<kotlin.ShortArray> {
            return copy()
        }
    }
}
