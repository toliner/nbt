/*
 * Copyright (c) 2018. toliner. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package toliner.nbt

/**
 * This interface is base interface of all **immutable** tag classes.
 * This is comparable by [name] for sorting tags.
 *
 * @property value data that the tag has.
 * @property name name of the tag. It will be used for identifying tag.
 */
interface NBTTag<out T>: Comparable<NBTTag<*>> {
    val value: T
    val name: kotlin.String
    val tagType: TagType

    /**
     * To use create same name and value tag.
     */
    fun clone(): NBTTag<T>
}