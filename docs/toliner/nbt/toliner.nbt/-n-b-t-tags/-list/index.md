[toliner/nbt](../../../index.md) / [toliner.nbt](../../index.md) / [NBTTags](../index.md) / [List](./index.md)

# List

`data class List<T : `[`NBTTag`](../../-n-b-t-tag/index.md)`<*>> : `[`NBTTags`](../index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>>, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>`

The [TagType.LIST](../../-tag-type/-l-i-s-t.md) tag.
This tag stores list of [NBTTags](../index.md)s.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `List(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, type: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<`[`T`](index.md#T)`>, value: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>)`<br>The [TagType.LIST](../../-tag-type/-l-i-s-t.md) tag. This tag stores list of [NBTTags](../index.md)s. |

### Properties

| Name | Summary |
|---|---|
| [name](name.md) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>name of the tag. It will be used for identifying tag. |
| [size](size.md) | `val size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [type](type.md) | `val type: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<`[`T`](index.md#T)`>` |
| [value](value.md) | `val value: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>`<br>data that the tag has. |

### Inherited Properties

| Name | Summary |
|---|---|
| [tagType](../tag-type.md) | `val tagType: `[`TagType`](../../-tag-type/index.md)<br>value of [TagType](../../-tag-type/index.md) for the tag. |

### Functions

| Name | Summary |
|---|---|
| [clone](clone.md) | `fun clone(): `[`NBTTags`](../index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>>`<br>To use create same name and value tag. |
| [contains](contains.md) | `fun contains(element: `[`T`](index.md#T)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [containsAll](contains-all.md) | `fun containsAll(elements: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [get](get.md) | `fun get(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`T`](index.md#T) |
| [indexOf](index-of.md) | `fun indexOf(element: `[`T`](index.md#T)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [isEmpty](is-empty.md) | `fun isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [iterator](iterator.md) | `fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>` |
| [lastIndexOf](last-index-of.md) | `fun lastIndexOf(element: `[`T`](index.md#T)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [listIterator](list-iterator.md) | `fun listIterator(): `[`ListIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html)`<`[`T`](index.md#T)`>`<br>`fun listIterator(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ListIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html)`<`[`T`](index.md#T)`>` |
| [subList](sub-list.md) | `fun subList(fromIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, toIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>` |

### Inherited Functions

| Name | Summary |
|---|---|
| [compareTo](../compare-to.md) | `open fun compareTo(other: `[`NBTTag`](../../-n-b-t-tag/index.md)`<*>): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
