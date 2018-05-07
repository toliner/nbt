[toliner/nbt](../../../index.md) / [toliner.nbt](../../index.md) / [MutableNBTTags](../index.md) / [Double](./index.md)

# Double

`data class Double : `[`MutableNBTTags`](../index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`

The [TagType.DOUBLE](../../-tag-type/-d-o-u-b-l-e.md) tag.
This tag stores double-precision-floating-point-number data, which we use it as [kotlin.Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Double(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`)`<br>The [TagType.DOUBLE](../../-tag-type/-d-o-u-b-l-e.md) tag. This tag stores double-precision-floating-point-number data, which we use it as [kotlin.Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |

### Properties

| Name | Summary |
|---|---|
| [name](name.md) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>name of the tag. It will be used for identifying tag. |
| [value](value.md) | `var value: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>data that the tag has. |

### Inherited Properties

| Name | Summary |
|---|---|
| [tagType](../tag-type.md) | `val tagType: `[`TagType`](../../-tag-type/index.md)<br>value of [TagType](../../-tag-type/index.md) for the tag. |

### Functions

| Name | Summary |
|---|---|
| [clone](clone.md) | `fun clone(): `[`MutableNBTTags`](../index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>To use create same name and value tag. |

### Inherited Functions

| Name | Summary |
|---|---|
| [compareTo](../compare-to.md) | `open fun compareTo(other: `[`NBTTag`](../../-n-b-t-tag/index.md)`<*>): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
