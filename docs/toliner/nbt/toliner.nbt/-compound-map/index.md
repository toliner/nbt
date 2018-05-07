[toliner/nbt](../../index.md) / [toliner.nbt](../index.md) / [CompoundMap](./index.md)

# CompoundMap

`class CompoundMap : `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`NBTTag`](../-n-b-t-tag/index.md)`<*>>, `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`NBTTag`](../-n-b-t-tag/index.md)`<*>>`

This is an internal class for [TagType.COMPOUND](../-tag-type/-c-o-m-p-o-u-n-d.md).
This is an Map&lt;String, NBTTag&lt;*&gt;.

### Parameters

`initial` - Iterator of initial NBTTags.

`isSorted` - Set true to sort NBTTags.

`isReversed` - Set true to reverse-sort NBTTags. if true, this works as isSorted is true

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CompoundMap(initial: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`NBTTag`](../-n-b-t-tag/index.md)`<*>>? = null, isSorted: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, isReversed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false)`<br>This is an internal class for [TagType.COMPOUND](../-tag-type/-c-o-m-p-o-u-n-d.md). This is an Map&lt;String, NBTTag&lt;*&gt;. |

### Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | `val entries: `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<`[`MutableEntry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/-mutable-entry/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`NBTTag`](../-n-b-t-tag/index.md)`<*>>>` |
| [keys](keys.md) | `val keys: `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [size](size.md) | `val size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [values](values.md) | `val values: `[`MutableCollection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)`<`[`NBTTag`](../-n-b-t-tag/index.md)`<*>>` |

### Functions

| Name | Summary |
|---|---|
| [clear](clear.md) | `fun clear(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [containsKey](contains-key.md) | `fun containsKey(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [containsValue](contains-value.md) | `fun containsValue(value: `[`NBTTag`](../-n-b-t-tag/index.md)`<*>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [equals](equals.md) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [get](get.md) | `fun get(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`NBTTag`](../-n-b-t-tag/index.md)`<*>?` |
| [hashCode](hash-code.md) | `fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [isEmpty](is-empty.md) | `fun isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [iterator](iterator.md) | `fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`NBTTag`](../-n-b-t-tag/index.md)`<*>>` |
| [put](put.md) | `fun put(value: `[`NBTTag`](../-n-b-t-tag/index.md)`<*>): `[`NBTTag`](../-n-b-t-tag/index.md)`<*>?`<br>add a NBTTag to map. Key is name of the NBTTag.`fun put(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`NBTTag`](../-n-b-t-tag/index.md)`<*>): `[`NBTTag`](../-n-b-t-tag/index.md)`<*>?` |
| [putAll](put-all.md) | `fun putAll(from: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<out `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`NBTTag`](../-n-b-t-tag/index.md)`<*>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [remove](remove.md) | `fun remove(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`NBTTag`](../-n-b-t-tag/index.md)`<*>?` |
