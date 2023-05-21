object Main {
    @JvmStatic
    fun main(args: Array<String>) {
    }

    private fun bubbleSort(array: IntArray) {
        for (i in 0 until array.size - 1) {
            for (j in 0 until array.size - i - 1) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1].also { array[j + 1] = array[j] }
                }
            }
        }
    }
}