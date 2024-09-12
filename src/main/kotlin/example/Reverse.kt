package example

//https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75

fun reverseWords(s: String): String = s.split(" ")
    .filter(String::isNotBlank)
    .reversed()
    .joinToString(" ")
    .trim()
