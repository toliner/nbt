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
 * This class is base class of all **mutable** tag classes.
 * This class is reference impl for [MutableNBTTag].
 * This is comparable by [name] for sorting tags.
 *
 * @property tagType value of [TagType] for the tag.
 * @property value data that the tag has.
 * @property name name of the tag. It will be used for identifying tag.
 */
sealed class MutableNBTTags<T>(val tagType: TagType) : MutableNBTTag<T> {
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
    class End : MutableNBTTags<Nothing?>(TagType.END) {
        override val name = ""
        override var value: Nothing? = null
        override fun clone(): MutableNBTTags<Nothing?> {
            return End()
        }
    }

    /**
     * The [TagType.BYTE] tag.
     * This tag stores one-byte-signed-integer data.
     */
    data class Byte(override val name: kotlin.String, override var value: kotlin.Byte) : MutableNBTTags<kotlin.Byte>(TagType.BYTE) {
        override fun clone(): MutableNBTTags<kotlin.Byte> {
            return copy()
        }
    }

    /**
     * The [TagType.SHORT] tag.
     * This tag stores two-bytes-signed-integer data, which we use it as [kotlin.Short]
     */
    data class Short(override val name: kotlin.String, override var value: kotlin.Short) : MutableNBTTags<kotlin.Short>(TagType.SHORT) {
        override fun clone(): MutableNBTTags<kotlin.Short> {
            return copy()
        }
    }

    /**
     * The [TagType.INT] tag.
     * This tag stores four-bytes-signed-integer data, which we use it as [kotlin.Int]
     */
    data class Int(override val name: kotlin.String, override var value: kotlin.Int) : MutableNBTTags<kotlin.Int>(TagType.INT) {
        override fun clone(): MutableNBTTags<kotlin.Int> {
            return copy()
        }
    }

    /**
     * The [TagType.LONG] tag.
     * This tag stores eight-bytes-signed-integer data, which we use it as [kotlin.Long]
     */
    data class Long(override val name: kotlin.String, override var value: kotlin.Long) : MutableNBTTags<kotlin.Long>(TagType.LONG) {
        override fun clone(): MutableNBTTags<kotlin.Long> {
            return copy()
        }
    }

    /**
     * The [TagType.FLOAT] tag.
     * This tag stores single-precision-floating-point-number data, which we use it as [kotlin.Float]
     */
    data class Float(override val name: kotlin.String, override var value: kotlin.Float) : MutableNBTTags<kotlin.Float>(TagType.FLOAT) {
        override fun clone(): MutableNBTTags<kotlin.Float> {
            return copy()
        }
    }

    /**
     * The [TagType.DOUBLE] tag.
     * This tag stores double-precision-floating-point-number data, which we use it as [kotlin.Double]
     */
    data class Double(override val name: kotlin.String, override var value: kotlin.Double) : MutableNBTTags<kotlin.Double>(TagType.DOUBLE) {
        override fun clone(): MutableNBTTags<kotlin.Double> {
            return copy()
        }
    }

    /**
     * The [TagType.BYTE_ARRAY] tag.
     * This tag stores an array of Bytes, which we use it as [kotlin.ByteArray]
     */
    data class ByteArray(override val name: kotlin.String, private var list: kotlin.collections.List<kotlin.Byte>) : MutableNBTTags<kotlin.ByteArray>(TagType.BYTE_ARRAY) {
        override var value: kotlin.ByteArray
            get() = list.toByteArray()
            set(value) {
                list = value.asList()
            }

        override fun clone(): MutableNBTTags<kotlin.ByteArray> {
            return copy()
        }
    }

    /**
     * The [TagType.STRING] tag.
     * This tag stores [kotlin.String] data.
     */
    data class String(override val name: kotlin.String, override var value: kotlin.String) : MutableNBTTags<kotlin.String>(TagType.STRING) {
        override fun clone(): MutableNBTTags<kotlin.String> {
            return copy()
        }
    }

    /**
     * The [TagType.LIST] tag.
     * This tag stores list of [NBTTags]s.
     */
    data class List<T : NBTTag<*>>(override val name: kotlin.String, val type: KClass<T>, override var value: kotlin.collections.List<T>) : MutableNBTTags<kotlin.collections.List<T>>(TagType.LIST) {
        override fun clone(): MutableNBTTags<kotlin.collections.List<T>> {
            return copy()
        }
    }

    /**
     * The [TagType.COMPOUND] tag.
     * This tag stores some [NBTTags]s as key-value map
     */
    data class Compound(override val name: kotlin.String, override var value: CompoundMap) : MutableNBTTags<CompoundMap>(TagType.COMPOUND) {
        override fun clone(): MutableNBTTags<CompoundMap> {
            return copy()
        }
    }

    /**
     * The [TagType.INT_ARRAY] tag.
     * This tag stores array of [kotlin.Int], which we use it as [kotlin.IntArray]
     */
    data class IntArray(override val name: kotlin.String, private var list: kotlin.collections.List<kotlin.Int>) : MutableNBTTags<kotlin.IntArray>(TagType.INT_ARRAY) {
        override var value: kotlin.IntArray
            get() = list.toIntArray()
            set(value) {
                list = value.asList()
            }

        override fun clone(): MutableNBTTags<kotlin.IntArray> {
            return copy()
        }
    }

    /**
     * The [TagType.SHORT_ARRAY] tag.
     * **WARNING** : This is optional tag. This tag is not defined original NBT format.
     * This tag stores array of [kotlin.Short], which we use it as [kotlin.ShortArray]
     */
    data class ShortArray(override val name: kotlin.String, private var list: kotlin.collections.List<kotlin.Short>) : MutableNBTTags<kotlin.ShortArray>(TagType.SHORT_ARRAY) {
        override var value: kotlin.ShortArray
            get() = list.toShortArray()
            set(value) {
                list = value.asList()
            }

        override fun clone(): MutableNBTTags<kotlin.ShortArray> {
            return copy()
        }
    }
}