# Periodic-Palindrome-String-UVA
Desarrollo laboratorio propuesto matemáticas discretas.

A character string is said to have period k if it can be formed by concatenating one or more repetitions of another string of length k. Furthermore, if the character string can be read equally from left to right than from right to left, the string is said to be palindrome. For example, the string “abcbaabcbaabcbaabcba” has period 5, since it is formed by 4 repetitions of the palindrome string “abcba”. It has also period 10 (two repetitions of “abcbaabcba”) and 20 (one repetition of “abcbaabcbaabcbaabcba”).
Input
The first line of the  input file will contain a single integer  N indicating how many test cases the program will be testing. Each test case will contain a single character string of up to 500 non-blank characters. The distinct inputs will be separated by a line break.
Output
An integer denoting the smallest period of the input palindrome string for each input. Two consecutive  outputs are separated  by a line break. If the  input  string cannot  be decomposed in palindrome periodic strings, output -1.
Sample Input
4
giiitygiiitygiiitygiiity
tijittijittijit
troereorttroereor
poyiitiiyoppqyutuyop
Sample Output
-1
5
-1
-1
