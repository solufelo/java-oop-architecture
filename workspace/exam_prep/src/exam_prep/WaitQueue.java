package exam_prep;

// Phase 4: Generics & Nested Classes
public class WaitQueue<T> {

    // TODO: 1. Create a private static nested class named 'Node'
    // Hints:
    // - private static class Node<T> { ... }
    // - Fields: T data, Node<T> next
    // - Constructor: takes T data

    // TODO: 2. Define Queue fields
    // - private Node<T> front;
    // - private Node<T> rear;

    public void enqueue(T element) {
        // TODO: 3. Implement enqueue (Add to rear)
        // - Create new Node
        // - If queue is empty, front = rear = newNode
        // - Else, rear.next = newNode, rear = newNode
    }

    public T dequeue() {
        // TODO: 4. Implement dequeue (Remove from front)
        // - If empty, return null
        // - Store front.data
        // - Move front to front.next
        // - If front becomes null, set rear to null too
        // - Return stored data
        return null;
    }

    public boolean isEmpty() {
        // TODO: 5. Return true if queue is empty
        return true;
    }
}

