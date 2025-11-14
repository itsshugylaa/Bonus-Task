#  Rabin–Karp String Search Algorithm

This repository contains a clean and efficient implementation of the Rabin–Karp algorithm for string pattern matching. The algorithm uses a polynomial rolling hash to quickly locate occurrences of a pattern within a given text.

---

## **Overview**

The Rabin–Karp algorithm performs pattern matching by comparing hash values:

* A hash of the pattern is computed.
* A rolling hash is used to compute hash values of text substrings.
* When the hashes match, a direct string comparison confirms the result.

This significantly reduces unnecessary comparisons and improves performance on large texts.

---

## **Algorithm Description**

1. Compute the hash of the pattern.
2. Compute the hash of the first substring of the text with the same length.
3. Slide the window over the text:

    * Compare the rolling hash with the pattern’s hash.
    * If hashes match → verify with a direct comparison.
4. Continue until the end of the text.

---

## **Time Complexity**

* **Best case:** O(n) — when no hash collisions occur, the algorithm will run in linear time.
* **Worst case:** O(n * m) — if there are many hash collisions, where n is the length of the text and m is the length of the pattern.
* **Space complexity:** O(1) — constant additional memory.

---

## **Features**

* Efficient pattern matching using hashing.
* Fast filtering through rolling hashes.
* Tested on short, medium, and long texts.
* Suitable for large datasets and multi-pattern searching.
* Highly adaptable for other string processing tasks.

---

## **Usage**

The program includes built-in test cases:

* **Short text:** `"abc"` — pattern: `"a"`
* **Medium text:** `"Lorem ipsum dolor sit amet..."` — pattern: `"ipsum"`
* **Long text:** `"ABABDABACDABABCABAB"` — pattern: `"ABABCABAB"`

You can easily modify the `text` and `pattern` variables in the main method to try other inputs.

---

## **Example Output**

**Given:**

```java
String text = "ABABDABACDABABCABAB";
String pattern = "ABABCABAB";
```

**Output:**

```
Pattern found at index: 10
```

---

## **Testing Table**

Below is a structured table showing test cases and expected outputs:

| Test Case   | Text                                                      | Pattern     | Expected Output            |
| ----------- | --------------------------------------------------------- | ----------- | -------------------------- |
| Short Text  | "abc"                                                     | "a"         | Pattern found at index: 0  |
| Medium Text | "Lorem ipsum dolor sit amet, consectetur adipiscing elit" | "ipsum"     | Pattern found at index: 6  |
| Long Text   | "ABABDABACDABABCABAB"                                     | "ABABCABAB" | Pattern found at index: 10 |

---

## **Conclusion**

This implementation demonstrates how hash-based pattern matching can significantly improve performance when searching within large texts. The algorithm is flexible, lightweight, and can be easily adapted for multi-pattern matching or large-scale processing.

The Rabin-Karp algorithm offers a scalable solution for string searching in datasets with varying sizes. It can be optimized further for specialized use cases or larger datasets.
