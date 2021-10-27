import kotlin.math.log
import kotlin.math.pow
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlgorithmsTest {

    @Test
    fun `should return linear searched element index`() {

        // given
        val array: Array<Int> = arrayOf(1, 23, 45, 32, 4, 12, 69)
        val elementToFind = 12

        // when
        val customSearch = CustomSearch()
        val indexAndComplexity = customSearch.linearSearch(array, elementToFind)

        // then
        assertThat(indexAndComplexity.first).isEqualTo(5)
        assertThat(indexAndComplexity.second).isLessThanOrEqualTo(array.size)
    }

    @Test
    fun `should not return not found element index`() {

        // given
        val array: Array<Int> = arrayOf(1, 23, 45, 32, 4, 12, 69)
        val elementToFind = 17

        // when
        val customSearch = CustomSearch()
        val indexAndComplexity = customSearch.linearSearch(array, elementToFind)

        // then
        assertThat(indexAndComplexity.first).isEqualTo(-1)
        assertThat(indexAndComplexity.second).isEqualTo(array.size)
    }

    @Test
    fun `should return merge sorted array`() {

        // given
        val arrayToSort: Array<Int> = arrayOf(17, 5, 43, 48, 9, 18, 128, 7, 25)
        val expectedSortedArray = arrayOf(5, 7, 9, 17, 18, 25, 43, 48, 128)

        // when
        val customSort = CustomSort()
        customSort.mergeSort(arrayToSort, 0, arrayToSort.size - 1)

        // then
        assertThat(arrayToSort).isEqualTo(expectedSortedArray)
        assertThat(customSort.complexity).isLessThanOrEqualTo(
            log(
                arrayToSort.size.toDouble(),
                2.0
            ).times(arrayToSort.size).toInt()
        )
    }

    @Test
    fun `should return bubble sorted array`() {

        // given
        val arrayToSort: Array<Int> = arrayOf(17, 5, 43, 48, 9, 18, 128, 7, 25)
        val expectedSortedArray = arrayOf(5, 7, 9, 17, 18, 25, 43, 48, 128)

        // when
        val customSort = CustomSort()
        customSort.bubbleSort(arrayToSort)

        // then
        assertThat(arrayToSort).isEqualTo(expectedSortedArray)
        assertThat(customSort.complexity).isLessThanOrEqualTo(arrayToSort.size.toDouble().pow(2.0).toInt())
    }

    @Test
    fun `should return binary searched element index`() {

        // given
        val sortedArray = arrayOf(5, 7, 9, 17, 18, 25, 43, 48, 128)

        // when
        val customSort = CustomSearch()
        val indexOfElement = customSort.binaryCustomSearch(sortedArray, 9)

        // then
        assertThat(indexOfElement.first).isEqualTo(2)
        assertThat(indexOfElement.second).isLessThanOrEqualTo(log(
            sortedArray.size.toDouble(),
            2.0
        ).toInt())
    }

    @Test
    fun `should not return not found binary searched element index`() {

        // given
        val sortedArray = arrayOf(5, 7, 9, 17, 18, 25, 43, 48, 128)

        // when
        val customSort = CustomSearch()
        val indexOfElement = customSort.binaryCustomSearch(sortedArray, -1)

        // then
        assertThat(indexOfElement.first).isEqualTo(-1)
        assertThat(indexOfElement.second).isLessThanOrEqualTo(-1)
    }

    @Test
    fun `should return quick sorted array`() {

        // given
        val arrayToSort: Array<Int> = arrayOf(17, 5, 43, 48, 9, 18, 128, 7, 25)
        val expectedSortedArray = arrayOf(5, 7, 9, 17, 18, 25, 43, 48, 128)

        // when
        val customSort = CustomSort()
        customSort.quickSort(arrayToSort, 0, arrayToSort.size - 1)

        // then
        assertThat(arrayToSort).isEqualTo(expectedSortedArray)
        assertThat(customSort.complexity).isLessThanOrEqualTo(arrayToSort.size.toDouble().pow(2.0).toInt())
    }

    @Test
    fun `should return insertion sorted array`() {

        // given
        val arrayToSort: Array<Int> = arrayOf(17, 5, 43, 48, 9, 18, 128, 7, 25)
        val expectedSortedArray = arrayOf(5, 7, 9, 17, 18, 25, 43, 48, 128)

        // when
        val customSort = CustomSort()
        customSort.insertionSort(arrayToSort)

        // then
        assertThat(arrayToSort).isEqualTo(expectedSortedArray)
        assertThat(customSort.complexity).isLessThanOrEqualTo(arrayToSort.size.toDouble().pow(2.0).toInt())
    }

    @Test
    fun `should return selection sorted array`() {

        // given
        val arrayToSort: Array<Int> = arrayOf(17, 5, 43, 48, 9, 18, 128, 7, 25)
        val expectedSortedArray = arrayOf(5, 7, 9, 17, 18, 25, 43, 48, 128)

        // when
        val customSort = CustomSort()
        customSort.selectionSort(arrayToSort)

        // then
        assertThat(arrayToSort).isEqualTo(expectedSortedArray)
        assertThat(customSort.complexity).isLessThanOrEqualTo(arrayToSort.size.toDouble().pow(2.0).toInt())
    }

    @Test
    fun `should return bucket sorted array`() {

        // given
        val arrayToSort: Array<Float> = arrayOf(0.17F, 0.5F, 0.43F, 0.48F, 0.9F, 0.18F, 0.128F, 0.7F, 0.25F)
        val expectedSortedArray = arrayOf(0.128F, 0.17F, 0.18F, 0.25F, 0.43F, 0.48F, 0.5F, 0.7F, 0.9F)

        // when
        val customSort = CustomSort()
        customSort.bucketSort(arrayToSort)

        // then
        assertThat(arrayToSort).isEqualTo(expectedSortedArray)
        assertThat(customSort.complexity).isLessThanOrEqualTo(arrayToSort.size.toDouble().pow(2.0).toInt())
    }

    @Test
    fun `should return shell sorted array`() {

        // given
        val arrayToSort: Array<Int> = arrayOf(17, 5, 43, 48, 9, 18, 128, 7, 25)
        val expectedSortedArray = arrayOf(5, 7, 9, 17, 18, 25, 43, 48, 128)

        // when
        val customSort = CustomSort()
        customSort.shellSort(arrayToSort)

        // then
        assertThat(arrayToSort).isEqualTo(expectedSortedArray)
        assertThat(customSort.complexity).isLessThanOrEqualTo(arrayToSort.size.toDouble().pow(2.0).toInt())
    }

}
