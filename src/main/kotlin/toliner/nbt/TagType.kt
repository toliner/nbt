package toliner.nbt

import toliner.nbt.tags.NBTTag
import kotlin.reflect.KClass

enum class TagType(val tagClass: KClass<out NBTTag<*>>, val tagName: String, val id: Int) {
    END(NBTTag.End::class, "TAG_END", 0),
    BYTE(NBTTag::class, "TAG_BYTE", 1)
}
