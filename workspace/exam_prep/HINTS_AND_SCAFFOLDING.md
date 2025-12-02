# HINTS_AND_SCAFFOLDING.md

## Phase 1: Hierarchy
*   **Abstract Class**: `public abstract class UniversityMember { ... }`
*   **Constructor**: Validate ID length (9 digits).

## Phase 2: Interfaces, Polymorphism & Covariant Returns
*   **Covariant Return Types**: When overriding, you can return a *subclass* (e.g., `TA` instead of `Student`).
*   **Interfaces**: Defines capabilities (`LabAccess`).

## Phase 3: Exceptions
*   **Custom Exception**: `extends Exception` (checked) or `RuntimeException` (unchecked).
*   **Throwing**: `throw new LabCapacityException("Msg");`
*   **Catching**: `try { ... } catch (Exception e) { ... }`

## Phase 4: Generics & Inner Classes
*   **Static Nested Class**: `private static class Node<T> { ... }` inside `WaitQueue`.
*   **Cloning**: Implement `Cloneable`, override `clone()`.

## Phase 5: GUI & Anonymous Classes
*   **Anonymous Inner Class**: `new ActionListener() { ... }` for one-time use.

## Phase 6: HashMaps
*   **Map**: `HashMap<String, Member>`. O(1) lookup by ID.

## Phase 8: Serialization
*   **Serializable**: Marker interface. Use `ObjectOutputStream`.

