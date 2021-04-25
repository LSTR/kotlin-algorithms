package com.lstr.codeforces

import kotlin.math.ceil
import kotlin.math.min

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


private fun solve(){
    val n = readInt()
    val group = readInts()
    val arr = hashMapOf(1 to 0, 2 to 0, 3 to 0, 4 to 0)
    for (i in 0 until group.size){
        arr[group[i]] = arr[group[i]]!! + 1
    }
    val t3 = min(arr[3]!!, arr[1]!!)
    val r3 = (arr[3]!! - t3)
    val r1 = arr[1]!! - t3
    val t33 = t3 + r3
    val t2 = arr[2]!!/2
    val r2 = arr[2]!!%2
    val res = r2*2 + r1
    val t4 = arr[4]!!
    val sum = t4 + t33 + t2 + ceil(res/4.0).toInt()
    print(sum)
}

fun main(){
    val t = 1  // # of test cases
    for (i in 1..t) {
        solve()
    }
}