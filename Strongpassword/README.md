# HackerRank
....
Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

Its length is at least .</br>
It contains at least one digit.</br>
It contains at least one lowercase English character.</br>
It contains at least one uppercase English character.</br>
It contains at least one special character. The special characters are: !@#$%^&*()-+</br>
She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?
....
### Note: Here's the set of types of characters in a form you can paste in your solution:</br>

numbers = "0123456789"</br>
lower_case = "abcdefghijklmnopqrstuvwxyz"</br>
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"</br>
special_characters = "!@#$%^&*()-+"</br>
### Input Format

The first line contains an integer  denoting the length of the string.</br>

The second line contains a string consisting of  characters, the password typed by Louise. Each character is either a lowercase/uppercase English alphabet, a digit, or a special character.

## Constraints

### Output Format

Print a single line containing a single integer denoting the answer to the problem.</br>

> Sample Input 0

3
Ab1
> Sample Output 0

3
### Explanation 0

She can make the password strong by adding  characters, for example, $hk, turning the password into Ab1$hk which is strong.

 characters aren't enough since the length must be at least .

> Sample Input 1

11
#HackerRank
> Sample Output 1

1
### Explanation 1

The password isn't strong, but she can make it strong by adding a single digit
