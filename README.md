# String Algorithms Practice

## Goal

Show that you can traverse a string forward and backward, count occurrences (including overlaps), and build a new string from an existing one. All four required tasks use only `length`, `substring`, `equals`, and `+`.

## AI Tier

**Disclose and retype.** You may use AI for planning or debugging help, but you must:

1. Fill in the **AI Use Statement** at the top of `StringPractice.java`.
2. **Retype** any AI-generated code yourself (do not paste it in).
3. Write a plain-English **PLAN** comment before coding each required method.

## Tasks

| # | Method | What it does | Pattern |
|---|--------|--------------|---------|
| 1 | `printChars(String s)` | Prints each character on its own line | Traverse forward |
| 2 | `printReverse(String s)` | Prints each character from last to first | Traverse backward |
| 3 | `int countOccurrences(String text, String target)` | Counts matches, including overlaps | Count with a sliding window |
| 4 | `String insertWord(String sentence, String word)` | Puts the word after every word of the sentence | Rebuild a new string |
| Stretch A | `boolean isPalindrome(String s)` | Same forward and backward | Reverse plus equals |
| Stretch B | `String removeAll(String text, String letter)` | Removes every copy of a letter | Rebuild skipping matches |

**Example for Task 4:** `insertWord("how is your morning going", "like")` returns  
`"how like is like your like morning like going like"`

Assume single spaces between words and no space at the start or end of the sentence.

## How to Run

Work in `src/main/java/com/csplusplus/StringPractice.java`. Do **not** edit `StringPracticeTester.java`.

### Codespaces / VS Code (recommended)

1. Open the Testing sidebar (beaker icon), or click the green play button next to a test in `StringPracticeTester.java`.
2. Or from the terminal:

```bash
mvn test
```

You should see each of the 15 checks pass or fail, with expected and actual values when a test fails.

You can also run `StringPractice` alone and call your methods from `main` while you are building them.

### BlueJ

1. Open `src/main/java/com/csplusplus/StringPractice.java`.
2. Complete your methods there.
3. Prefer Codespaces/`mvn test` for the full self-check, since the tester uses JUnit.

## Rules

- You may use **only**: `length`, `substring`, `equals`, and string concatenation (`+`).
- Do **not** use: `split`, `replace`, `charAt`, `StringBuilder`, or `toCharArray`.
- Write a plain-English **PLAN** comment before coding each required method.
- Retype any AI-generated code yourself. Fill in the AI Use Statement at the top of the file.
- Commit after each task with a short message (Professional Practice).

## Reflection (no AI)

Answer in your own words below (or in a short comment at the bottom of `StringPractice.java`).

1. Why does `countOccurrences` stop at `text.length() - target.length()`?

   Your answer:

2. Why can’t `insertWord` change the original sentence? Use the words **immutable** and **reassign**.

   Your answer:

3. Which task was hardest, and what did you do when you got stuck?

   Your answer:

## Done Checklist

- [ ] All four required tasks pass in `StringPracticeTester`
- [ ] PLAN comments written for each required method
- [ ] AI Use Statement filled in
- [ ] Reflection questions answered
- [ ] Committed after each task and pushed

## Credit

Repository template adapted from [CS-Plus-Plus](https://github.com/cs-plus-plus).
