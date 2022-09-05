/*** Defintions
 High Order functions (HOF)
    functions that take functions as inputs and may return functions as an output
 tail position of a call ~ the last call in a recursive call that just returns the value of the recursive call
 tailrec is used to not consume stack frames for each iteration
    eliminate tail calls
Polymorphic functions ~ operate on only any type of data
    sometimes called generic cuz it uses generics
monomorphic functions ~ operate on only one type of data

 * */

/*** notes
 functions can be values, passsed in and manipulated lke an object


 * */

fun main() {
    exercise2point1()
    println("-------------------------")
    exercise2point2()
    println("-------------------------")
}

fun exercise2point2() {
    /**
     *    mplement isSorted, which checks whether a singly linked list,
     *    List<A> is sorted according to a given comparison function.
     *    The function is preceded by two extension properties that add
     *    head and tail to any List value. The head property returns
     *    the first element of the list, while the tail returns all
     *    subsequent elements as another List<A>.
     *    For a refresher on extension properties,
     *    refer to the Extension methods and properties sidebar.
     */

    var sort = fun(a: Int, b: Int ): Boolean { return a < b }

    println(isSorted(listOf(0, 1, 2, 3, 4), sort))
    println(isSorted(listOf(1, 2), sort))
    println(isSorted(listOf(2), sort))
    println(isSorted(emptyList(), sort))
    println(!isSorted(listOf(4, 3, 2, 1), sort))
    println(!isSorted(listOf(2, 1), sort))
}

val <T> List<T>.tail: List<T>
    get() = drop(1)
val <T> List<T>.head: T
    get() = first()
fun <A> isSorted(aa: List<A>, order: (A, A) -> Boolean): Boolean {
    tailrec fun go(element: A, list: List<A>): Boolean =
        if (list.isEmpty()) true
        else if(!order(element, list.head)) false
        else go(list.head, list.tail)
    return aa.isEmpty() || go(aa.head, aa.tail)
}

fun exercise2point1() {
    /**
     *     Write a recursive function to get the nth Fibonacci number
     *     ( en.wikipedia.org/wiki/Fibonacci_number). The first two
     *     Fibonacci numbers are 0 and 1. The nth number is
     *     always the sum of the previous two—the sequence
     *     begins 0, 1, 1, 2, 3, 5, 8, 13, 21.
     *     Your definition should use a local tail-recursive function.
     */
    println("fib(0) should be 0: " + fib(0))
    println("fib(1) should be 1: " + fib(1))
    println("fib(2) should be 1: " + fib(2))
    println("fib(3) should be 2: " + fib(3))
    println("fib(4) should be 3: " + fib(4))
    println("fib(5) should be 5: " + fib(5))
    println("fib(6) should be 8: " + fib(6))
}

fun fib(i: Int): Int {
    // acc is accumulator
    tailrec fun go(cnt: Int, curr: Int, next: Int): Int =
        if (cnt <= 0 ) curr
        else go(cnt - 1, next,  curr + next)
    return go(i, 0, 1)
}