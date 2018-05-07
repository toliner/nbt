[toliner/nbt](../../index.md) / [toliner.nbt](../index.md) / [NBTTag](./index.md)

# NBTTag

`interface NBTTag<out T> : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`NBTTag`](./index.md)`<*>>`

This interface is base interface of all **immutable** tag classes.
This is comparable by [name](name.md) for sorting tags.

### Properties

| Name | Summary |
|---|---|
| [name](name.md) | `abstract val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>name of the tag. It will be used for identifying tag. |
| [value](value.md) | `abstract val value: `[`T`](index.md#T)<br>data that the tag has. |

### Functions

| Name | Summary |
|---|---|
| [clone](clone.md) | `abstract fun clone(): `[`NBTTag`](./index.md)`<`[`T`](index.md#T)`>`<br>To use create same name and value tag. |

### Inheritors

| Name | Summary |
|---|---|
| [MutableNBTTag](../-mutable-n-b-t-tag/index.md) | `interface MutableNBTTag<T> : `[`NBTTag`](./index.md)`<`[`T`](../-mutable-n-b-t-tag/index.md#T)`>`<br>This interface is base interface of all **mutable** tag classes. This is comparable by [name](name.md) for sorting tags. |
| [NBTTags](../-n-b-t-tags/index.md) | `sealed class NBTTags<out T> : `[`NBTTag`](./index.md)`<`[`T`](../-n-b-t-tags/index.md#T)`>`<br>This class is base class of all **immutable** tag classes. This class is reference impl for [NBTTag](./index.md). This is comparable by [name](name.md) for sorting tags. |
