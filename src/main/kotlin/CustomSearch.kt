class CustomSearch {
    var complexity = 0

    fun binaryCustomSearch(
        array: Array<Int>,
        element: Int,
        fromIndex: Int = 0,
        toIndex: Int = array.size - 1,
    ): Pair<Int, Int> {
        if (toIndex >= fromIndex) {
            val mid = (toIndex - fromIndex) / 2 + fromIndex
            complexity++
            return when {
                element > array[mid] -> binaryCustomSearch(array, element, (mid + 1), toIndex)
                element < array[mid] -> binaryCustomSearch(array, element, fromIndex, mid - 1).also { complexity++ }
                else -> Pair(mid, complexity)
            }
        }
        return Pair(-1, -1)
    }

    fun linearSearch(array: Array<Int>, element: Int): Pair<Int, Int> {
        array.forEachIndexed { index, i ->
            run {
                complexity++
                if (i == element) return Pair(index, complexity)
            }
        }
        return Pair(-1, complexity)
    }
}
