package behavioral.iterator.iterators;

import behavioral.iterator.Iterator;
import behavioral.iterator.Vertex;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DepthFirstIterator<T> implements Iterator<T> {
    private final Vertex<T> startVertex;
    private Stack<Vertex<T>> stack = new Stack<>();

    public DepthFirstIterator(Vertex<T> startVertex) {
        this.startVertex = startVertex;
        stack.push(startVertex);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }

        while (!stack.isEmpty() && stack.peek() != null && stack.peek().isVisited()) {
            stack.pop();
        }
        return !stack.isEmpty();
    }

    @Override
    public Vertex<T> getNext() {
        if (!hasNext()) {
            return null;
        }

        Vertex<T> currentVertex = stack.pop();
        if (!currentVertex.isVisited()) {
            currentVertex.setVisited(true);
            List<Vertex<T>> neighbors = currentVertex.getNeighbors();
            // neighbors should be reversed to maintain the FILO nature of stack in each level
            Collections.reverse(neighbors);
            neighbors.forEach(v -> { if (!v.isVisited()) stack.push(v); });
            return currentVertex;
        }
        return getNext();
    }

    @Override
    public void reset() {
        stack.clear();
        stack.push(startVertex);
    }
}
