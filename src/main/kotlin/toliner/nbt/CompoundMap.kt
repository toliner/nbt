/*
 * Copyright (c) 2018. toliner. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package toliner.nbt

import toliner.nbt.tags.NBTTag
import java.util.*
import kotlin.collections.LinkedHashMap

class CompoundMap(initial: Iterator<NBTTag<*>>? = null, isSorted: Boolean = false, isReversed: Boolean = false) : MutableMap<String, NBTTag<*>>, Iterable<NBTTag<*>> {

    init {
        initial?.forEach {
            map[it.name] = it
        }
    }

    private val map: MutableMap<String, NBTTag<*>> = if (isSorted || isReversed) TreeMap(if (isReversed) Collections.reverseOrder<String>() else null) else LinkedHashMap()

    fun put(value: NBTTag<*>): NBTTag<*>? {
        return map.put(value.name, value)
    }

    override fun iterator(): Iterator<NBTTag<*>> {
        return map.toMap().values.iterator()
    }

    override val entries: MutableSet<MutableMap.MutableEntry<String, NBTTag<*>>>
        get() = map.entries
    override val keys: MutableSet<String>
        get() = map.keys
    override val size: Int
        get() = map.size
    override val values: MutableCollection<NBTTag<*>>
        get() = map.values

    override fun containsKey(key: String): Boolean {
        return map.containsKey(key)
    }

    override fun containsValue(value: NBTTag<*>): Boolean {
        return map.containsValue(value)
    }

    override fun get(key: String): NBTTag<*>? {
        return map[key]
    }

    override fun isEmpty(): Boolean {
        return map.isEmpty()
    }

    override fun clear() {
        map.clear()
    }

    override fun put(key: String, value: NBTTag<*>): NBTTag<*>? {
        return map.put(key, value)
    }

    override fun putAll(from: Map<out String, NBTTag<*>>) {
        map.putAll(from)
    }

    override fun remove(key: String): NBTTag<*>? {
        return map.remove(key)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is CompoundMap) return false
        return other.map == map
    }

    override fun hashCode(): Int {
        return map.hashCode()
    }
}