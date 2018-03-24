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
 * The enum of all tag types.
 *
 * @property tagName name of the tag type.
 * @property id id of the tag type. It will used for identify tag type in binary.
 */
enum class TagType(val tagName: String, val id: Int) {
    END("TAG_END", 0),
    BYTE("TAG_BYTE", 1),
    SHORT("TAG_Short", 2),
    INT("TAG_Int", 3),
    LONG("TAG_Long", 4),
    FLOAT("TAG_Float", 5),
    DOUBLE("TAG_Double", 6),
    BYTE_ARRAY("TAG_Byte_Array", 7),
    STRING("TAG_String", 8),
    LIST("TAG_List", 9),
    COMPOUND("TAG_Compound", 10),
    INT_ARRAY("TAG_Int_Array", 11),
    SHORT_ARRAY("TAG_Short_Array", 100)
}
