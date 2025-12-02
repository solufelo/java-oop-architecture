# Development Plan

## Current Focus: The University Lab Simulator (Exam Prep)

- [x] **Phase 1: Core Hierarchy**
  - Created `UniversityMember` (Abstract), `Student`, `Professor`.
  - Validated IDs and enforced encapsulation.

- [x] **Phase 1.5: Verification**
  - Created `ExamRunner` to test polymorphism.

- [x] **Phase 2: Interfaces**
  - Created `LabAccess` interface.
  - Implemented `TeachingAssistant` (extends Student, implements LabAccess with overrides).

- [x] **Phase 3: Lab System & Exceptions**
  - Created `LabCapacityException`.
  - Implemented `LabSession` with `ArrayList` and exception logic.

- [ ] **Phase 4: Generics & Custom Data Structures** (CURRENT)
  - Create `WaitQueue<T>` class.
  - **Guru Task:** Use a `private static class Node<T>` (Nested Class).
  - **Guru Task:** Implement `Cloneable` interface on `UniversityMember`.

- [ ] **Phase 5: The GUI**
  - Build a Swing interface.
  - **Guru Task:** Use `Anonymous Inner Classes` for Event Listeners.

- [ ] **Phase 6: The Library System** (Maps & Data Structures)
  - Implement `Book` and `LibrarySystem`.
  - Use `HashMap` for O(1) member lookups and tracking loans.

- [ ] **Phase 7: Academic Records "Backend"** (Static Logic)
  - `AcademicRegistrar` class.
  - Graduation validation (connects Library, Student, and Finance).

- [ ] **Phase 8: Persistence (File I/O)**
  - **Guru Task:** Implement `Serializable` interface.
  - Save/Load entire system state.

- [ ] **Phase 9: Algorithms (Recursion & Sorting)**
  - Implement recursive file search (`FileNode`).
  - Implement custom Comparators for sorting students by GPA/Name.

