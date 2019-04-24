package ii_collections

import util.TODO

fun todoTask24(collection: Collection<String>): Nothing = TODO(
    """
        Task 24.
        The function should do the same as '_24_JavaCode.doSomethingStrangeWithCollection'.
        Replace all invocations of 'todoTask24()' with the appropriate code.
    """,
    references = { c: Collection<String> -> _24_JavaCode().doSomethingStrangeWithCollection(c) }


)

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    //map agrupado por el tamaño de los strings
    val groupsByLength = collection.groupBy {it.length }

    //devolvemos el grupo con más elementos
    return groupsByLength.values.maxBy { it.size}
}

