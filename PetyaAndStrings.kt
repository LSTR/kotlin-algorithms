package com.lstr.codeforces

import kotlin.math.abs

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
    val s1 = readLn().toLowerCase()
    val s2 = readLn().toLowerCase()
    val dif = s1.compareTo(s2)
    val r = if(s1 != s2) dif/ abs(dif) else 0
    print(r)
}

fun main(){
    val t = 1  // # of test cases
    for (i in 1..t) {
        solve()
    }
}