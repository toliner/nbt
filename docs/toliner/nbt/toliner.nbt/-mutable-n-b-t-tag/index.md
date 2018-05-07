[toliner/nbt](../../index.md) / [toliner.nbt](../index.md) / [MutableNBTTag](./index.md)

# MutableNBTTag

`interface MutableNBTTag<T> : `[`NBTTag`](../-n-b-t-tag/index.md)`<`[`T`](index.md#T)`>`

This interface is base interface of all **mutable** tag classes.
This is comparable by [name](../-n-b-t-tag/name.md) for sorting tags.

### Properties

| Name | Summary |
|---|---|
| [value](value.md) | `abstract var value: `[`T`](index.md#T)<br>data that the tag has. |

### Inherited Properties

| Name | Summary |
|---|---|
| [name](../-n-b-t-tag/name.md) | `abstract val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>name of the tag. It will be used for identifying tag. |

### Inherited Functions

| Name | Summary |
|---|---|
| [clone](../-n-b-t-tag/clone.md) | `abstract fun clone(): `[`NBTTag`](../-n-b-t-tag/index.md)`<`[`T`](../-n-b-t-tag/index.md#T)`>`<br>To use create same name and value tag. |

### Inheritors

| Name | Summary |
|---|---|
| [MutableNBTTags](../-mutable-n-b-t-tags/index.md) | `sealed class MutableNBTTags<T> : `[`MutableNBTTag`](./index.md)`<`[`T`](../-mutable-n-b-t-tags/index.md#T)`>`<br>This class is base class of all **mutable** tag classes. This class is reference impl for [MutableNBTTag](./index.md). This is comparable by [name](#) for sorting tags. |
