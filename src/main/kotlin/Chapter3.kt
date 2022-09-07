/*** Defintions
 * Sealed class
    https://kotlinlang.org/docs/sealed-classes.html
    kind of like an enum but for classes.
    Sealed classes are used for representing restricted class hierarchies, when a value can have one of the types from a limited set, but cannot have any other type.
    can't be instantiated by itself
 Data Class
    has equal, copy, to String by default
    can be deconstructed
    must have a primary constructor that takes in one input at min
Companion object
 objects within the class
 methods within the companion objects can be called statically
vararg
    meaning it accepts zero or more arguments of type A
    aka can pass in an arbitrary amount of parameters
    arrays can be passed as variadic parameters
        just need o prefix with the spread operator (*)

 * */

/*** notes
 foldRight example:
    foldRight(Cons(1, Cons(2, Cons(3, Nil))),
        0, { x, y -> x + y })
    1 + foldRight(Cons(2, Cons(3, Nil)), 0,
        { x, y -> x + y })
    1 + (2 + foldRight(Cons(3, Nil), 0,
        { x, y -> x + y }))
    1 + (2 + (3 + (foldRight(Nil as List<Int>, 0,
        { x, y -> x + y }))))
    1 + (2 + (3 + (0)))
    6

 * */

fun main() {
    exercise3point5()
    println("-------------------------")
}


fun exercise3point1() {
//    Implement the function tail for removing the first element of a List.
//    Note that the function takes constant time.
//    What are different choices you could make in your
//    implementation if the List is Nil? We’ll return to this
//    question in the next chapter.
//    tail
    TODO("Not yet implemented")
}

fun exercise3point2() {
//    Using the same idea, implement the function setHead for
//    replacing the first element of a List with a different value.
    // setHead
}

fun exercise3point3() {
//    Generalize tail to the function drop, which
//    removes the first n elements from a list.
//    Note that this function takes time proportional
//    only to the number of elements being dropped—
//    we don’t need to make a copy of the entire List.
//    fun <A> drop(l: List<A>, n: Int): List<A> = TODO()
}

fun exercise3point4() {
//    Implement dropWhile, which removes elements from the
//    List prefix as long as they match a predicate.
//    fun <A> dropWhile(l: List<A>, f: (A) -> Boolean): List<A> = TODO()
}

fun exercise3point5() {
//    Not everything works out so nicely as when we append two lists to each other.
//    Implement a function, init, that returns a List consisting of all but the
//    last element of a List. So, given List(1, 2, 3, 4), init will return
//    List(1, 2, 3). Why can’t this function be implemented in constant time
//    like tail?
//    fun <A> init(l: List<A>): List<A> = TODO()
//    println("init: " + init(listOf(1, 2, 3, 4))) // should only print (1, 2, 3)
}

fun exercise3point8() {
//    Compute the length of a list using foldRight.
//fun <A> length(xs: List<A>): Int = TODO()
}


fun exercise3point9() {
//    Our implementation of foldRight is not tail-recursive and will result
//    in a StackOverflowError for large lists (we say it’s not stack-safe).
//    Convince yourself that this is the case, and then write another
//    general list-recursion function, foldLeft, that is tail-recursive,
//    using the techniques we discussed in the previous chapter.
//    Here is its signature:
//    tailrec fun <A, B> foldLeft(xs: List<A>, z: B, f: (B, A) -> B): B = TODO()
}



fun exercise3point10() {
//    Write sum, product, and a function to compute the length of a
//    list using foldLeft.

//    fun sumL(xs: List<Int>): Int = TODO()
//    fun productL(xs: List<Double>): Double = TODO()
//    fun <A> lengthL(xs: List<A>): Int = TODO()
}


fun exercise3point11() {
//    Write a function that returns the reverse of a list
//            (given List(1,2,3) it returns List(3,2,1)).
//    See if you can write it using a fold.

//    reverseList
}

fun exercise3point12() {
//    Can you write foldLeft in terms of foldRight?
//    How about the other way around?
//    Implementing foldRight via foldLeft is useful because it lets us
//            implement foldRight tail-recursively, which means it
//    works even for large lists without overflowing the stack.

//    foldRightUsingL()

}

fun exercise3point13() {
//    Implement append in terms of either foldLeft or foldRight.
//    append()
}

fun exercise3point14() {
//    Write a function that concatenates a list of lists into a single list.
//    Its runtime should be linear in the total length of all lists.
//    Try to use functions we have already defined.
//fun <A> concat(xxs: List<List<A>>): List<A> =
}

fun exercise3point15() {
//    Write a function that transforms a list of integers by adding 1 to
//fun increment(xs: List<Int>): List<Int> =
}

fun exercise3point17() {
//    Write a function map that generalizes modifying each element in
//    a list while maintaining the structure of the list.
//    Here is its signature: 12
//    fun <A, B> map(xs: List<A>, f: (A) -> B): List<B> = TODO()
}

fun exercise3point18() {
//    Write a function filter that removes elements from a list unless they
//    satisfy a given predicate. Use it to remove all odd numbers from a
//    List<Int>.
//    fun <A> filter(xs: List<A>, f: (A) -> Boolean): List<A> = TODO()
}

fun exercise3point19() {
//    Write a function flatMap that works like map except that the function given
//    will return a list instead of a single result, and that list should be
//    inserted into the final resulting list. Here is its signature:
//fun <A, B> flatMap(xa: List<A>, f: (A) -> List<B>): List<B> = TODO()
}

fun exercise3point20() {
//    Use flatMap to implement filter.
//    fun <A> filterUsingFlatMap(xs: List<A>, f: (A) -> Boolean): List<A> =
}

fun exercise3point21() {

//    Write a function that accepts two lists and constructs a new list by
//    adding corresponding elements. For example, List(1,2,3) and List(4,5,6)
//    become List(5,7,9).
//fun add(xa: List<Int>, xb: List<Int>): List<Int> =
}

fun exercise3point23() {
//    As an example, implement hasSubsequence for checking whether a List
//    contains another List as a subsequence. For instance, List(1,2,3,4)
//    would have List(1,2), List(2,3), and List(4) as subsequences,
//    among others. You may have some difficulty finding a concise purely
//            functional implementation that is also efficient. That’s okay.
//    Implement the function however comes most naturally. We’ll return to
//    this implementation in chapter 5 and hopefully improve on it.
//tailrec fun <A> startsWith(l1: List<A>, l2: List<A>): Boolean =
}

tailrec fun <A> startsWith(l1: List<A>, l2: List<A>): Boolean =
    when(l1) {
        is Nil -> l2 == Nil
        is Cons -> when (l2) {
            is Nil -> true
            is Cons ->
                if(l1.head == l2.head)
                    startsWith(l1.tail, l2.tail)
                else
                    false
        }
    }

fun add(xa: List<Int>, xb: List<Int>): List<Int> =
    when (xa) {
        is Nil -> Nil
        is Cons -> when (xb) {
            is Nil -> Nil
            is Cons ->
                Cons(xa.head + xb.head, add(xa.tail, xb.tail))
        }
    }

fun <A> filterUsingFlatMap(xs: List<A>, f: (A) -> Boolean): List<A> =
    flatMap(
        xs,
        { a ->
            if(f(a)) List.of(a)
            else empty()
        }
    )

fun <A, B> flatMap(xa: List<A>, f: (A) -> List<B>): List<B> =
    foldRight(
        xa,
        empty(),
        { a, b  -> append(f(a), b ) }
    )

fun <A> filter(xs: List<A>, f: (A) -> Boolean): List<A> =
    foldLeft(
        xs,
        empty(),
        {a, b ->
            if(f(b)) Cons(b, a)
            else a
        }
    )

fun <A, B> map(xs: List<A>, f: (A) -> B): List<B> =
    foldRight(xs, empty(), {a, b -> Cons( f(a), b)})

fun increment(xs: List<Int>): List<Int> =
    foldRight(xs, empty(), {a, b -> Cons(a + 1, b)})

fun <A> concat(xxs: List<List<A>>): List<A> =
    foldRight(
        xxs,
        empty(), // aka Nil
        { a, b ->
            foldRight(a, b, {c, d -> Cons(c, d)})
        }
    )

fun <A> append(a1: List<A>, a2: List<A>): List<A> =
    foldRight(a1, a2, { a, b -> Cons(a, b)} )


tailrec fun <A, B> foldLeftUsingR(xs: List<A>, z: B, f: (B, A) -> B): B =
    foldRight(
        xs,
        { b: B -> b },
        { a, g ->
            { b ->
                g(f(b, a))
            }
        })(z)
fun <A, B> foldRightUsingL(xs: List<A>, z: B, f: (A, B) -> B): B = TODO()


fun <A> reverseList(xs: List<A>) : List<A> =
    foldLeft(xs, empty(), {acc, value -> Cons(value, acc)})

fun sumL(xs: List<Int>): Int = foldLeft(xs, 0, {a, b -> a + b})
fun productL(xs: List<Double>): Double = foldLeft(xs, 1.0, {a, b -> a * b})
fun <A> lengthL(xs: List<A>): Int = foldLeft(xs, 0, {acc, _ -> acc + 1})

tailrec fun <A, B> foldLeft(xs: List<A>, z: B, f: (B, A) -> B): B =
    when (xs) {
        is Nil -> z
        is Cons -> foldLeft(xs.tail, f(z, xs.head), f)
    }

fun <A> length(xs: List<A>): Int = foldRight(xs, 0, { _, acc -> acc + 1})

fun <A, B> foldRight(xs: List<A>, z: B, f: (A, B) -> B): B =
    when (xs) {
        is Nil -> z
        is Cons -> f(xs.head, foldRight(xs.tail, z, f))
    }

fun <A> init(l: List<A>): List<A> =
    when(l) {
        is Nil ->  throw IllegalStateException("Nil has no more values")
        is Cons ->
            if(l.tail is Nil) {
                 Nil
            } else {
                Cons(l.head, init(l.tail))
            }
    }

fun <A> dropWhile(l: List<A>, f: (A) -> Boolean): List<A> =
    when(l) {
        is Nil -> l
        is Cons ->
            if(f(l.head)) {
                dropWhile(l.tail, f)
            } else {
                l
            }
    }

fun <A> drop(l: List<A>, n: Int): List<A> =
    if(n == 0) l
    else when (l) {
        is Cons -> drop(l.tail, n - 1)
        is Nil -> throw IllegalStateException("Nil has no more values")
    }

fun <A> setHead(xs: List<A>, x: A): List<A> =
    when(xs) {
        is Nil -> throw IllegalStateException("Nil has no head")
        is Cons -> Cons(x, xs.tail)
    }

fun <A> tail(xs: List<A>): List<A> =
    when(xs) {
        is Nil -> throw IllegalStateException("Nil has no tail")
        is Cons -> xs.tail
    }

sealed class List<out A> {
    // helper functions
    companion object {
        fun <A> of(vararg aa: A): List<A> {
            val tail = aa.sliceArray(1 until aa.size)
            return if (aa.isEmpty()) Nil else Cons(aa[0], of(*tail))
        }

    }
}
object Nil : List<Nothing>()
data class Cons<out A>(
    val head: A,
    val tail: List<A>
) : List<A>()

fun <A> empty(): List<A> = Nil