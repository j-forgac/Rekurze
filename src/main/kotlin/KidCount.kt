tailrec fun kidCount(n: Int, acc: Int = 0): Int {
	if(n == 0) return acc
	return kidCount(n-1,acc+n)
}

tailrec fun kidMultiplication(n: Int, times: Int, acc: Int = 0): Int {
	if(times == 0) return acc
	return kidMultiplication(n,times-1,acc+n)
}

tailrec fun kidPower(n: Int, power: Int, acc: Int = 1): Int {
	if(power == 0) return acc
	return kidPower(n,power-1,acc*n)
}

tailrec fun cipherSum(n: String, acc: Int = 0): Int {
	if(n.isEmpty()) return acc
	return cipherSum(n.drop(1),acc+n.take(1).toInt())
}

tailrec fun isPalindrome(n: String): Boolean {
	if(n.isEmpty() || n.length == 1) return true
	else if(n.first() != n.last()) return false
	return isPalindrome(n.dropLast(1).drop(1))
}



fun main(){
	println(kidCount(5))
	println(kidMultiplication(10,9))
	println(kidPower(3,4))
	println(cipherSum("3998"))
	println(isPalindrome("3993"))
}