[toliner/nbt](../../../index.md) / [toliner.nbt](../../index.md) / [NBTTags](../index.md) / [Compound](./index.md)

# Compound

`data class Compound : `[`NBTTags`](../index.md)`<`[`CompoundMap`](../../-compound-map/index.md)`>`

The [TagType.COMPOUND](../../-tag-type/-c-o-m-p-o-u-n-d.md) tag.
This tag stores some [NBTTags](../index.md)s as key-value map

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Compound(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`CompoundMap`](../../-compound-map/index.md)`)`<br>The [TagType.COMPOUND](../../-tag-type/-c-o-m-p-o-u-n-d.md) tag. This tag stores some [NBTTags](../index.md)s as key-value map |

### Properties

| Name | Summary |
|---|---|
| [name](name.md) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>name of the tag. It will be used for identifying tag. |
| [value](value.md) | `val value: `[`CompoundMap`](../../-compound-map/index.md)<br>data that the tag has. |

### Inherited Properties

| Name | Summary |
|---|---|
| [tagType](../tag-type.md) | `val tagType: `[`TagType`](../../-tag-type/index.md)<br>value of [TagType](../../-tag-type/index.md) for the tag. |

### Functions

| Name | Summary |
|---|---|
| [clone](clone.md) | `fun clone(): `[`NBTTags`](../index.md)`<`[`CompoundMap`](../../-compound-map/index.md)`>`<br>To use create same name and value tag. |

### Inherited Functions

| Name | Summary |
|---|---|
| [compareTo](../compare-to.md) | `open fun compareTo(other: `[`NBTTag`](../../-n-b-t-tag/index.md)`<*>): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
