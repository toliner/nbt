/*
 * Copyright (c) 2018. toliner. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package toliner.nbt

/**
 * This interface is base interface of all **mutable** tag classes.
 * This is comparable by [name] for sorting tags.
 *
 * @property value data that the tag has.
 * @property name name of the tag. It will be used for identifying tag.
 */
interface MutableNBTTag<T> : NBTTag<T> {
    override var value: T
}