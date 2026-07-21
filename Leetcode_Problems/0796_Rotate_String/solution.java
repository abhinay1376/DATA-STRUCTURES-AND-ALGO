/*
Problem Revision Notes

Problem:    Rotate String
Platform:   LeetCode
Difficulty: Easy
Date:       2026-07-21

──────────────────────────────────────────────────

Intuition
we add the same string twice

──────────────────────────────────────────────────

Lines / Logic To Be Careful With
while returning false

──────────────────────────────────────────────────

Edge Cases Handled
base condition should be handled first

──────────────────────────────────────────────────

Mistakes I Made
nopeeeeeeeeeeeeeeeeeee

──────────────────────────────────────────────────

Future Reminder
just add 2 strings ...

──────────────────────────────────────────────────

Time Complexity
O(n)

Space Complexity
O(2n)

══════════════════════════════════════════════════
*/

def rotateString(self, s: str, goal: str) -> bool:
        return len(s) == len(goal) and s in goal + goal