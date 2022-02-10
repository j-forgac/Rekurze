fun solve(num: String, acc: Int = 0): Int{
	if(num.length == 1) return num[0].digitToInt()
	return num[0].digitToInt() + solve(num.drop(1),acc)
}

fun main(){
	println(solve("1954"))
}