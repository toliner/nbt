package toliner.nbt

import toliner.nbt.tags.NBTTag
import kotlin.reflect.KClass

enum class TagType(val tagClass: KClass<out NBTTag<*>>, val tagName: String, val id: Int) {
    END(NBTTag.End::class, "TAG_END", 0),
    BYTE(NBTTag.Byte::class, "TAG_BYTE", 1),
    SHORT(NBTTag.Short::class, "TAG_Short", 2),
    INT(NBTTag.Int::class, "TAG_Int", 3),
    LONG(NBTTag.Long::class, "TAG_LONG", 4),
    FLOAT(NBTTag.Float::class, "TAG_FLOAT", 5),
    DOUBLE(NBTTag.Double::class, "TAG_DOUBLE", 6)
}
