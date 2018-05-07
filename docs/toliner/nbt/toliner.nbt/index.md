[toliner/nbt](../index.md) / [toliner.nbt](./index.md)

## Package toliner.nbt

### Types

| Name | Summary |
|---|---|
| [CompoundMap](-compound-map/index.md) | `class CompoundMap : `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`NBTTag`](-n-b-t-tag/index.md)`<*>>, `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`NBTTag`](-n-b-t-tag/index.md)`<*>>`<br>This is an internal class for [TagType.COMPOUND](-tag-type/-c-o-m-p-o-u-n-d.md). This is an Map&lt;String, NBTTag&lt;*&gt;. |
| [MutableNBTTag](-mutable-n-b-t-tag/index.md) | `interface MutableNBTTag<T> : `[`NBTTag`](-n-b-t-tag/index.md)`<`[`T`](-mutable-n-b-t-tag/index.md#T)`>` |
| [MutableNBTTags](-mutable-n-b-t-tags/index.md) | `sealed class MutableNBTTags<T> : `[`MutableNBTTag`](-mutable-n-b-t-tag/index.md)`<`[`T`](-mutable-n-b-t-tags/index.md#T)`>`<br>This class is base class of all **mutable** tag classes. This class is reference impl for [MutableNBTTag](-mutable-n-b-t-tag/index.md). This is comparable by [name](#) for sorting tags. |
| [NBTTag](-n-b-t-tag/index.md) | `interface NBTTag<out T> : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`NBTTag`](-n-b-t-tag/index.md)`<*>>`<br>This interface is base interface of all **immutable** tag classes. This is comparable by [name](-n-b-t-tag/name.md) for sorting tags. |
| [NBTTags](-n-b-t-tags/index.md) | `sealed class NBTTags<out T> : `[`NBTTag`](-n-b-t-tag/index.md)`<`[`T`](-n-b-t-tags/index.md#T)`>`<br>This class is base class of all **immutable** tag classes. This class is reference impl for [NBTTag](-n-b-t-tag/index.md). This is comparable by [name](-n-b-t-tag/name.md) for sorting tags. |
| [TagType](-tag-type/index.md) | `enum class TagType`<br>The enum of all tag types. |
