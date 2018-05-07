[toliner/nbt](../../index.md) / [toliner.nbt](../index.md) / [MutableNBTTags](./index.md)

# MutableNBTTags

`sealed class MutableNBTTags<T> : `[`MutableNBTTag`](../-mutable-n-b-t-tag/index.md)`<`[`T`](index.md#T)`>`

This class is base class of all **mutable** tag classes.
This class is reference impl for [MutableNBTTag](../-mutable-n-b-t-tag/index.md).
This is comparable by [name](#) for sorting tags.

### Types

| Name | Summary |
|---|---|
| [Byte](-byte/index.md) | `data class Byte : `[`MutableNBTTags`](./index.md)`<`[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`>`<br>The [TagType.BYTE](../-tag-type/-b-y-t-e.md) tag. This tag stores one-byte-signed-integer data. |
| [ByteArray](-byte-array/index.md) | `data class ByteArray : `[`MutableNBTTags`](./index.md)`<`[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>`<br>The [TagType.BYTE_ARRAY](../-tag-type/-b-y-t-e_-a-r-r-a-y.md) tag. This tag stores an array of Bytes, which we use it as [kotlin.ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [Compound](-compound/index.md) | `data class Compound : `[`MutableNBTTags`](./index.md)`<`[`CompoundMap`](../-compound-map/index.md)`>`<br>The [TagType.COMPOUND](../-tag-type/-c-o-m-p-o-u-n-d.md) tag. This tag stores some [NBTTags](../-n-b-t-tags/index.md)s as key-value map |
| [Double](-double/index.md) | `data class Double : `[`MutableNBTTags`](./index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>The [TagType.DOUBLE](../-tag-type/-d-o-u-b-l-e.md) tag. This tag stores double-precision-floating-point-number data, which we use it as [kotlin.Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [End](-end/index.md) | `class End : `[`MutableNBTTags`](./index.md)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`?>`<br>The [TagType.END](../-tag-type/-e-n-d.md) tag. This tag indicates end of [TagType.COMPOUND](../-tag-type/-c-o-m-p-o-u-n-d.md). |
| [Float](-float/index.md) | `data class Float : `[`MutableNBTTags`](./index.md)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>`<br>The [TagType.FLOAT](../-tag-type/-f-l-o-a-t.md) tag. This tag stores single-precision-floating-point-number data, which we use it as [kotlin.Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [Int](-int/index.md) | `data class Int : `[`MutableNBTTags`](./index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>The [TagType.INT](../-tag-type/-i-n-t.md) tag. This tag stores four-bytes-signed-integer data, which we use it as [kotlin.Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [IntArray](-int-array/index.md) | `data class IntArray : `[`MutableNBTTags`](./index.md)`<`[`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)`>`<br>The [TagType.INT_ARRAY](../-tag-type/-i-n-t_-a-r-r-a-y.md) tag. This tag stores array of [kotlin.Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), which we use it as [kotlin.IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html) |
| [List](-list/index.md) | `data class List<T : `[`NBTTag`](../-n-b-t-tag/index.md)`<*>> : `[`MutableNBTTags`](./index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](-list/index.md#T)`>>`<br>The [TagType.LIST](../-tag-type/-l-i-s-t.md) tag. This tag stores list of [NBTTags](../-n-b-t-tags/index.md)s. |
| [Long](-long/index.md) | `data class Long : `[`MutableNBTTags`](./index.md)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>`<br>The [TagType.LONG](../-tag-type/-l-o-n-g.md) tag. This tag stores eight-bytes-signed-integer data, which we use it as [kotlin.Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [Short](-short/index.md) | `data class Short : `[`MutableNBTTags`](./index.md)`<`[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`>`<br>The [TagType.SHORT](../-tag-type/-s-h-o-r-t.md) tag. This tag stores two-bytes-signed-integer data, which we use it as [kotlin.Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) |
| [ShortArray](-short-array/index.md) | `data class ShortArray : `[`MutableNBTTags`](./index.md)`<`[`ShortArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short-array/index.html)`>`<br>The [TagType.SHORT_ARRAY](../-tag-type/-s-h-o-r-t_-a-r-r-a-y.md) tag. **WARNING** : This is optional tag. This tag is not defined original NBT format. This tag stores array of [kotlin.Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html), which we use it as [kotlin.ShortArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short-array/index.html) |
| [String](-string/index.md) | `data class String : `[`MutableNBTTags`](./index.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<br>The [TagType.STRING](../-tag-type/-s-t-r-i-n-g.md) tag. This tag stores [kotlin.String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) data. |

### Properties

| Name | Summary |
|---|---|
| [tagType](tag-type.md) | `val tagType: `[`TagType`](../-tag-type/index.md)<br>value of [TagType](../-tag-type/index.md) for the tag. |

### Inherited Properties

| Name | Summary |
|---|---|
| [value](../-mutable-n-b-t-tag/value.md) | `abstract var value: `[`T`](../-mutable-n-b-t-tag/index.md#T)<br>data that the tag has. |

### Functions

| Name | Summary |
|---|---|
| [compareTo](compare-to.md) | `open fun compareTo(other: `[`NBTTag`](../-n-b-t-tag/index.md)`<*>): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [Byte](-byte/index.md) | `data class Byte : `[`MutableNBTTags`](./index.md)`<`[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`>`<br>The [TagType.BYTE](../-tag-type/-b-y-t-e.md) tag. This tag stores one-byte-signed-integer data. |
| [ByteArray](-byte-array/index.md) | `data class ByteArray : `[`MutableNBTTags`](./index.md)`<`[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>`<br>The [TagType.BYTE_ARRAY](../-tag-type/-b-y-t-e_-a-r-r-a-y.md) tag. This tag stores an array of Bytes, which we use it as [kotlin.ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [Compound](-compound/index.md) | `data class Compound : `[`MutableNBTTags`](./index.md)`<`[`CompoundMap`](../-compound-map/index.md)`>`<br>The [TagType.COMPOUND](../-tag-type/-c-o-m-p-o-u-n-d.md) tag. This tag stores some [NBTTags](../-n-b-t-tags/index.md)s as key-value map |
| [Double](-double/index.md) | `data class Double : `[`MutableNBTTags`](./index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>The [TagType.DOUBLE](../-tag-type/-d-o-u-b-l-e.md) tag. This tag stores double-precision-floating-point-number data, which we use it as [kotlin.Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [End](-end/index.md) | `class End : `[`MutableNBTTags`](./index.md)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`?>`<br>The [TagType.END](../-tag-type/-e-n-d.md) tag. This tag indicates end of [TagType.COMPOUND](../-tag-type/-c-o-m-p-o-u-n-d.md). |
| [Float](-float/index.md) | `data class Float : `[`MutableNBTTags`](./index.md)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>`<br>The [TagType.FLOAT](../-tag-type/-f-l-o-a-t.md) tag. This tag stores single-precision-floating-point-number data, which we use it as [kotlin.Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [Int](-int/index.md) | `data class Int : `[`MutableNBTTags`](./index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>The [TagType.INT](../-tag-type/-i-n-t.md) tag. This tag stores four-bytes-signed-integer data, which we use it as [kotlin.Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [IntArray](-int-array/index.md) | `data class IntArray : `[`MutableNBTTags`](./index.md)`<`[`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)`>`<br>The [TagType.INT_ARRAY](../-tag-type/-i-n-t_-a-r-r-a-y.md) tag. This tag stores array of [kotlin.Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), which we use it as [kotlin.IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html) |
| [List](-list/index.md) | `data class List<T : `[`NBTTag`](../-n-b-t-tag/index.md)`<*>> : `[`MutableNBTTags`](./index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](-list/index.md#T)`>>`<br>The [TagType.LIST](../-tag-type/-l-i-s-t.md) tag. This tag stores list of [NBTTags](../-n-b-t-tags/index.md)s. |
| [Long](-long/index.md) | `data class Long : `[`MutableNBTTags`](./index.md)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>`<br>The [TagType.LONG](../-tag-type/-l-o-n-g.md) tag. This tag stores eight-bytes-signed-integer data, which we use it as [kotlin.Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [Short](-short/index.md) | `data class Short : `[`MutableNBTTags`](./index.md)`<`[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`>`<br>The [TagType.SHORT](../-tag-type/-s-h-o-r-t.md) tag. This tag stores two-bytes-signed-integer data, which we use it as [kotlin.Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) |
| [ShortArray](-short-array/index.md) | `data class ShortArray : `[`MutableNBTTags`](./index.md)`<`[`ShortArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short-array/index.html)`>`<br>The [TagType.SHORT_ARRAY](../-tag-type/-s-h-o-r-t_-a-r-r-a-y.md) tag. **WARNING** : This is optional tag. This tag is not defined original NBT format. This tag stores array of [kotlin.Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html), which we use it as [kotlin.ShortArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short-array/index.html) |
| [String](-string/index.md) | `data class String : `[`MutableNBTTags`](./index.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<br>The [TagType.STRING](../-tag-type/-s-t-r-i-n-g.md) tag. This tag stores [kotlin.String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) data. |
