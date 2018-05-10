[toliner/nbt](../../../index.md) / [toliner.nbt](../../index.md) / [NBTTags](../index.md) / [Compound](./index.md)

# Compound

`data class Compound : `[`NBTTags`](../index.md)`<`[`CompoundMap`](../../-compound-map/index.md)`>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`NBTTag`](../../-n-b-t-tag/index.md)`<*>>`

The [TagType.COMPOUND](../../-tag-type/-c-o-m-p-o-u-n-d.md) tag.
This tag stores some [NBTTags](../index.md)s as key-value map

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Compound(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`CompoundMap`](../../-compound-map/index.md)`)`<br>The [TagType.COMPOUND](../../-tag-type/-c-o-m-p-o-u-n-d.md) tag. This tag stores some [NBTTags](../index.md)s as key-value map |

### Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | `val entries: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`NBTTag`](../../-n-b-t-tag/index.md)`<*>>>` |
| [keys](keys.md) | `val keys: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [name](name.md) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>name of the tag. It will be used for identifying tag. |
| [size](size.md) | `val size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [value](value.md) | `val value: `[`CompoundMap`](../../-compound-map/index.md)<br>data that the tag has. |
| [values](values.md) | `val values: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`NBTTag`](../../-n-b-t-tag/index.md)`<*>>` |

### Inherited Properties

| Name | Summary |
|---|---|
| [tagType](../tag-type.md) | `val tagType: `[`TagType`](../../-tag-type/index.md)<br>value of [TagType](../../-tag-type/index.md) for the tag. |

### Functions

| Name | Summary |
|---|---|
| [clone](clone.md) | `fun clone(): `[`NBTTags`](../index.md)`<`[`CompoundMap`](../../-compound-map/index.md)`>`<br>To use create same name and value tag. |
| [containsKey](contains-key.md) | `fun containsKey(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [containsValue](contains-value.md) | `fun containsValue(value: `[`NBTTag`](../../-n-b-t-tag/index.md)`<*>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [get](get.md) | `fun get(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`NBTTag`](../../-n-b-t-tag/index.md)`<*>?` |
| [isEmpty](is-empty.md) | `fun isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inherited Functions

| Name | Summary |
|---|---|
| [compareTo](../compare-to.md) | `open fun compareTo(other: `[`NBTTag`](../../-n-b-t-tag/index.md)`<*>): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
