import kotlin.math.max
import kotlin.math.min

private fun readLn(input: Array<String>?) = input?.getOrNull(0) ?: readLine()!! // get input from local test or readLine from Codeforces compiler
private fun readInt(input: Array<String>?) = readLn(input).toInt() // single int
private fun readLong(input: Array<String>?) = readLn(input).toLong() // single long
private fun readDouble(input: Array<String>?) = readLn(input).toDouble() // single double
private fun readStrings(input: Array<String>?) = readLn(input).split(" ") // list of strings
private fun readInts(input: Array<String>?) = readStrings(input).map { it.toInt() } // list of ints
private fun readLongs(input: Array<String>?) = readStrings(input).map { it.toLong() } // list of longs
private fun readDoubles(input: Array<String>?) = readStrings(input).map { it.toDouble() } // list of doubles
private fun readIntsArr(input: Array<String>?) = ArrayList(readInts(input)) // ArrayList of ints

private val MX = 200005
private val MOD = 1000000007
private val SZ = 1 shl 18
private val INF = (1e18).toLong()

private fun add(a: Int, b: Int) = (a + b) % MOD // from tourist :o
private fun sub(a: Int, b: Int) = (a - b + MOD) % MOD
private fun mul(a: Int, b: Int) = ((a.toLong() * b) % MOD).toInt()

fun main(args: Array<String>){
    val input = readInts(args)
    val k = input[0]
    val n = input[1]
    val w = input[2]
    val r = (k*(w*(w+1))/2).toInt()
    println(max(0, r - n))
}