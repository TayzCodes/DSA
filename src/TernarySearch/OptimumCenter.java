package TernarySearch;

/**
 * Problem Statement
 * A delivery firm want to establish a new service centre in a different city. The corporation knows the positions of all the clients
 * in this city on a 2D- Map and want to develop the new centre in such a way that the total of the euclidean distances to all customers
 * is as small as possible.
 * Return the least sum of the euclidean distances to all customers given an array positions where positions[i] = (xi, yi)
 * is the position of the ith client on the map.
 * In other words, the position of the service centre (xcentre, ycentre) must be chosen so that the following formula is minimised:
 * Formula
 * Answers within 10^-5 of the actual value will be accepted.
 * Input
 * The first line contains n (the number of customers)
 * Next n lines contains coordinates of customers (xi,yi).
 *
 * Constraints
 * 1 <= n <= 50
 * 0 <= xi, yi <= 100
 * Output
 * Output the minimum sum of the euclidean distances to all customers.
 * Example
 * Input
 * 4
 * 0 1
 * 1 0
 * 1 2
 * 2 1
 *
 * Output
 * 4.00000
 *
 * Explanation :
 * As shown, you can see that choosing (xcentre, ycentre) = [1, 1] will make the distance to each
 * customer = 1, the sum of all distances is 4 which is the minimum possible we can achieve.
 */
public class OptimumCenter {
}
