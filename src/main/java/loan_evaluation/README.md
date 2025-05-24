# QUESTION

Loan application rules:

- **Age** must be **at least 18**.
- **Monthly income** must be **2000 and above**.
- **Credit score** must be **at least 600**.
- If there is a **previous debt**, the application will be **rejected**.

# NOTES

- Use an **immutable data model** (final fields).
- Represent **monetary data** with `BigDecimal`.
- Return a **clear business result** using a `LoanDecision` enum.
- Design should be **open to extension** (e.g., include rules in `LoanEvaluator` as a list using the **Strategy Pattern**).
- Define `MIN_*` values as **constants**.
