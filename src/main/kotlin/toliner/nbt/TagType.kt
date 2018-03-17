package toliner.nbt

import toliner.nbt.tags.NBTTag
import kotlin.reflect.KClass

enum class TagType(val tagClass: KClass<out NBTTag<*>>, val tagName: String, val id: Int) {
    END(NBTTag.End::class, "TAG_END", 0),
    BYTE(NBTTag.Byte::class, "TAG_BYTE", 1),
    SHORT(NBTTag.Short::class, "TAG_Short", 2),
    INT(NBTTag.Int::class, "TAG_Int", 3),
    LONG(NBTTag.Long::class, "TAG_Long", 4),
    FLOAT(NBTTag.Float::class, "TAG_Float", 5),
    DOUBLE(NBTTag.Double::class, "TAG_Double", 6),
    BYTE_ARRAY(NBTTag.ByteArray::class, "TAG_Byte_Array", 7),
    STRING(NBTTag.String::class, "TAG_String", 8),
    LIST(NBTTag.List::class, "TAG_List", 9),
    COMPOUND(NBTTag.Compound::class, "TAG_Compound", 10),
    INT_ARRAY(NBTTag.IntArray::class, "TAG_Int_Array", 11)
}
