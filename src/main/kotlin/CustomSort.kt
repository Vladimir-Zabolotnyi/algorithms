class CustomSort {

    var complexity = 0

    fun bubbleSort(array: Array<Int>) {
        complexity = 0
        for (j in 0 until array.size - 1) {
            for (i in 0 until (array.size - j - 1)) {
                complexity++
                if (array[i] > array[i + 1]) {
                    val temp = array[i]
                    array[i] = array[i + 1]
                    array[i + 1] = temp
                }
            }
        }
    }

    fun quickSort(array: Array<Int>, start: Int, end: Int) {
        if (start < end) {
            val pivotIndex = separation(array, start, end)
            quickSort(array, start, pivotIndex - 1).also { complexity++ }
            quickSort(array, pivotIndex + 1, end).also { complexity++ }
        }
    }

    fun mergeSort(array: Array<Int>, start: Int, end: Int) {
        complexity = 0
        if (start < end) {
            val mid = (start + end) / 2
            mergeSort(array, start, mid).also { complexity++ }
            mergeSort(array, mid + 1, end).also { complexity++ }
            merge(array, start, mid, end)
        }
    }

    fun insertionSort(array: Array<Int>) {
        complexity = 0
        for (i in 1 until array.size) {
            val key = array[i]
            var j = i - 1
            while (j >= 0 && array[j] > key) {
                complexity++
                array[j + 1] = array[j]
                j--
            }
            complexity++
            array[j + 1] = key
        }
    }

    fun selectionSort(array: Array<Int>) {
        for (i in array.indices) {
            var min = i
            for (j in i + 1 until array.size) {
                complexity++
                if (array[j] < array[min]) {
                    min = j
                }
            }
            complexity++
            val temp = array[i]
            array[i] = array[min]
            array[min] = temp
        }
    }

    fun bucketSort(arrayToSort: Array<Float>) {
        complexity = 0
        val arrayOfBucket: ArrayList<ArrayList<Float>> = arrayListOf()
        for (i in 0 until 10) {
            arrayOfBucket.add(arrayListOf())
        }
        arrayToSort.forEach {
            val bucketIndex = (it.minus(arrayToSort.minOrNull()!!) / arrayToSort.size).toInt()
            arrayOfBucket[bucketIndex].add(it)
        }

        var i = 0
        arrayOfBucket.forEach { it.sort();complexity++ }
        arrayOfBucket.forEach { bucket ->
            bucket.forEach {
                complexity++
                arrayToSort[i++] = it
            }
        }
    }

    fun shellSort(array: Array<Int>) {
        val n: Int = array.size
        var gap = n / 2
        while (gap > 0) {
            var i = gap
            while (i < n) {
                val temp = array[i]
                var j = i
                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap]
                    j -= gap
                }
                array[j] = temp
                i += 1

            }
            gap /= 2
        }
    }

    private fun separation(array: Array<Int>, start: Int, end: Int): Int {
        val pivotValue = array[end]
        var i = start - 1
        for (j in start until end) {
            if (array[j] <= pivotValue) {
                i++
                complexity++
                val temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
        complexity++
        val temp = array[i + 1]
        array[i + 1] = array[end]
        array[end] = temp
        return i + 1
    }

    private fun merge(array: Array<Int>, start: Int, mid: Int, end: Int) {

        val leftArray = array.copyOfRange(start, mid + 1)
        val rightArray = array.copyOfRange(mid + 1, end + 1)

        var i = 0
        var j = 0
        var k: Int = start
        while (i < leftArray.size && j < rightArray.size) {
            complexity++
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i]
                i++

            } else {
                array[k] = rightArray[j]
                j++
            }
            k++
        }
        while (i < leftArray.size) {
            array[k] = leftArray[i]
            i++
            k++
        }
        while (j < rightArray.size) {
            array[k] = rightArray[j]
            j++
            k++
        }
    }
}
