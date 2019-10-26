package games.gameOfFifteen

/*
 * This function should return the parity of the permutation.
 * true - the permutation is even
 * false - the permutation is odd
 * https://en.wikipedia.org/wiki/Parity_of_a_permutation

 * If the game of fifteen is started with the wrong parity, you can't get the correct result
 *   (numbers sorted in the right order, empty cell at last).
 * Thus the initial permutation should be correct.
 */
fun isEven(permutation: List<Int>): Boolean {
    var inverted = 0
    val indices = permutation.indices
    for (i in indices) {
        for (j in indices) {
            if (i < j && permutation[i] > permutation[j]) {
                inverted++
            }
        }
    }
    return inverted % 2 == 0
}