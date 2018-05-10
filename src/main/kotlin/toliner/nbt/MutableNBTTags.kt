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
sealed class MutableNBTTags<T>(override val tagType: TagType) : MutableNBTTag<T> {
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
    data class List<T : NBTTag<*>>(override val name: kotlin.String, val type: KClass<T>, override var value: kotlin.collections.MutableList<T>) : MutableNBTTags<kotlin.collections.MutableList<T>>(TagType.LIST), MutableList<T> {
        override val size: kotlin.Int
            get() = value.size

        override fun contains(element: T): Boolean {
            return value.contains(element)
        }

        override fun containsAll(elements: Collection<T>): Boolean {
            return value.containsAll(elements)
        }

        override fun get(index: kotlin.Int): T {
            return value[index]
        }

        override fun indexOf(element: T): kotlin.Int {
            return value.indexOf(element)
        }

        override fun isEmpty(): Boolean {
            return value.isEmpty()
        }

        override fun iterator(): MutableIterator<T> {
            return value.iterator()
        }

        override fun lastIndexOf(element: T): kotlin.Int {
            return value.lastIndexOf(element)
        }

        override fun add(element: T): Boolean {
            return value.add(element)
        }

        override fun add(index: kotlin.Int, element: T) {
            return value.add(index, element)
        }

        override fun addAll(index: kotlin.Int, elements: Collection<T>): Boolean {
            return value.addAll(index, elements)
        }

        override fun addAll(elements: Collection<T>): Boolean {
            return value.addAll(elements)
        }

        override fun clear() {
            value.clear()
        }

        override fun listIterator(): MutableListIterator<T> {
            return value.listIterator()
        }

        override fun listIterator(index: kotlin.Int): MutableListIterator<T> {
            return value.listIterator(index)
        }

        override fun remove(element: T): Boolean {
            return value.remove(element)
        }

        override fun removeAll(elements: Collection<T>): Boolean {
            return value.removeAll(elements)
        }

        override fun removeAt(index: kotlin.Int): T {
            return value.removeAt(index)
        }

        override fun retainAll(elements: Collection<T>): Boolean {
            return value.retainAll(elements)
        }

        override fun set(index: kotlin.Int, element: T): T {
            return value.set(index, element)
        }

        override fun subList(fromIndex: kotlin.Int, toIndex: kotlin.Int): MutableList<T> {
            return value.subList(fromIndex, toIndex)
        }

        override fun clone(): MutableNBTTags<kotlin.collections.MutableList<T>> {
            return copy()
        }
    }

    /**
     * The [TagType.COMPOUND] tag.
     * This tag stores some [NBTTags]s as key-value map
     */
    data class Compound(override val name: kotlin.String, override var value: CompoundMap) : MutableNBTTags<CompoundMap>(TagType.COMPOUND), MutableMap<kotlin.String, NBTTag<*>> {
        override val size: kotlin.Int
            get() = value.size

        override fun containsKey(key: kotlin.String): Boolean {
            return value.containsKey(key)
        }

        override fun containsValue(value: NBTTag<*>): Boolean {
            return this.value.containsValue(value)
        }

        override fun get(key: kotlin.String): NBTTag<*>? {
            return value[key]
        }

        override fun isEmpty(): Boolean {
            return value.isEmpty()
        }

        override val entries: MutableSet<MutableMap.MutableEntry<kotlin.String, NBTTag<*>>>
            get() = value.entries
        override val keys: MutableSet<kotlin.String>
            get() = value.keys
        override val values: MutableCollection<NBTTag<*>>
            get() = value.values

        override fun clear() {
            value.clear()
        }

        override fun put(key: kotlin.String, value: NBTTag<*>): NBTTag<*>? {
            return this.value.put(key, value)
        }

        override fun putAll(from: Map<out kotlin.String, NBTTag<*>>) {
            value.putAll(from)
        }

        override fun remove(key: kotlin.String): NBTTag<*>? {
            return value.remove(key)
        }

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