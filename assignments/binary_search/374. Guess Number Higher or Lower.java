/**
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */
// guess method is already there in program so we can use that method
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int rand = guess(mid);
            if (rand == 0) {
                return mid;
            } else if (rand == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}