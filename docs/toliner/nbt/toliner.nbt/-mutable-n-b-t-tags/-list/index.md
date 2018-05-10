[toliner/nbt](../../../index.md) / [toliner.nbt](../../index.md) / [MutableNBTTags](../index.md) / [List](./index.md)

# List

`data class List<T : `[`NBTTag`](../../-n-b-t-tag/index.md)`<*>> : `[`MutableNBTTags`](../index.md)`<`[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`T`](index.md#T)`>>, `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`T`](index.md#T)`>`

The [TagType.LIST](../../-tag-type/-l-i-s-t.md) tag.
This tag stores list of [NBTTags](../../-n-b-t-tags/index.md)s.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `List(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, type: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<`[`T`](index.md#T)`>, value: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`T`](index.md#T)`>)`<br>The [TagType.LIST](../../-tag-type/-l-i-s-t.md) tag. This tag stores list of [NBTTags](../../-n-b-t-tags/index.md)s. |

### Properties

| Name | Summary |
|---|---|
| [name](name.md) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>name of the tag. It will be used for identifying tag. |
| [size](size.md) | `val size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [type](type.md) | `val type: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<`[`T`](index.md#T)`>` |
| [value](value.md) | `var value: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`T`](index.md#T)`>`<br>data that the tag has. |

### Inherited Properties

| Name | Summary |
|---|---|
| [tagType](../tag-type.md) | `val tagType: `[`TagType`](../../-tag-type/index.md)<br>value of [TagType](../../-tag-type/index.md) for the tag. |

### Functions

| Name | Summary |
|---|---|
| [add](add.md) | `fun add(element: `[`T`](index.md#T)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>`fun add(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, element: `[`T`](index.md#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [addAll](add-all.md) | `fun addAll(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, elements: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>`fun addAll(elements: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [clear](clear.md) | `fun clear(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [clone](clone.md) | `fun clone(): `[`MutableNBTTags`](../index.md)`<`[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`T`](index.md#T)`>>`<br>To use create same name and value tag. |
| [contains](contains.md) | `fun contains(element: `[`T`](index.md#T)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [containsAll](contains-all.md) | `fun containsAll(elements: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [get](get.md) | `fun get(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`T`](index.md#T) |
| [indexOf](index-of.md) | `fun indexOf(element: `[`T`](index.md#T)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [isEmpty](is-empty.md) | `fun isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [iterator](iterator.md) | `fun iterator(): `[`MutableIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)`<`[`T`](index.md#T)`>` |
| [lastIndexOf](last-index-of.md) | `fun lastIndexOf(element: `[`T`](index.md#T)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [listIterator](list-iterator.md) | `fun listIterator(): `[`MutableListIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list-iterator/index.html)`<`[`T`](index.md#T)`>`<br>`fun listIterator(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`MutableListIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list-iterator/index.html)`<`[`T`](index.md#T)`>` |
| [remove](remove.md) | `fun remove(element: `[`T`](index.md#T)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeAll](remove-all.md) | `fun removeAll(elements: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeAt](remove-at.md) | `fun removeAt(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`T`](index.md#T) |
| [retainAll](retain-all.md) | `fun retainAll(elements: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [set](set.md) | `fun set(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, element: `[`T`](index.md#T)`): `[`T`](index.md#T) |
| [subList](sub-list.md) | `fun subList(fromIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, toIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`T`](index.md#T)`>` |

### Inherited Functions

| Name | Summary |
|---|---|
| [compareTo](../compare-to.md) | `open fun compareTo(other: `[`NBTTag`](../../-n-b-t-tag/index.md)`<*>): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
