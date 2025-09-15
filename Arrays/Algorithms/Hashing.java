
/*
 * Hashing is a technique use in data structure that efficiently stores and
 * retrieves data
 * in a way that allows for quick access.
 * 
 * -> Hashing involves mapping data to a specific index in a hash table(an array
 * of items)
 * using a hash function. It enables fast retrieval of information based on its
 * key.
 * 
 * -> The great thing about hashing is, we can achieve all three
 * operations(search, insert and delete)
 * in O(1) time on average.
 * 
 * -> Hashing is mainly used to implement a set of distinct items (only keys)
 * and dictionaries(key value pairs).
 * 
 * List = [11,12,13,14,15]
 * H(x) = [x % 10]
 * 11 % 10 --- 1
 * 12 % 10 --- 2
 * 13 % 10 --- 3
 * 14 % 10 --- 4
 * 15 % 10 --- 5
 * 
 */