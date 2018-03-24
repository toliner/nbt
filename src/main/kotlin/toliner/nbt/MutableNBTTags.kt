/*
 * Copyright (c) 2018. toliner. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package toliner.nbt

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


}