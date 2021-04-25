import kotlin.math.max

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles
private fun readIntsArr() = ArrayList(readInts()) // ArrayList of ints

private val MX = 200005
private val MOD = 1000000007
private val SZ = 1 shl 18
private val INF = (1e18).toLong()

private fun add(a: Int, b: Int) = (a + b) % MOD // from tourist :o
private fun sub(a: Int, b: Int) = (a - b + MOD) % MOD
private fun mul(a: Int, b: Int) = ((a.toLong() * b) % MOD).toInt()
private fun mapValues(a: List<Int>) : MutableMap<Int, Int> {
    val nMap = mutableMapOf<Int, Int>()
    return a.associateWithTo(nMap){ if(nMap[it] == null) 1 else nMap[it]!!+1}
}

private fun solve(){
    val n = readInt()
    var sequence = readInts()
    val nMap = mapValues(sequence)
    var f = IntArray(n)
    f[0] = 0
    f[1] = nMap[1] ?: 0
    for (i in 2 until n){
        f[i] = max(f[i-1], f[i-2] + if(nMap[i] == null) 0 else nMap[i]!!*i)
    }
    print("${f[n-1]}")
}

fun main(){
    val t = 1  // # of test cases
    for (i in 1..t) {
        solve()
    }
}