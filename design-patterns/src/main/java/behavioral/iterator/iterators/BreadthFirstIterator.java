package behavioral.iterator.iterators;

import behavioral.iterator.Iterator;
import behavioral.iterator.Vertex;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstIterator<T> implements Iterator<T> {
    private final Vertex<T> startVertex;
    private final Queue<Vertex<T>> queue = new LinkedList<>();

    public BreadthFirstIterator(final Vertex<T> startVertex) {
        this.startVertex = startVertex;
        queue.add(startVertex);
    }

    @Override
    public boolean hasNext() {
        if (queue.isEmpty()) {
            return false;
        }

        while (!queue.isEmpty() && queue.peek() != null && queue.peek().isVisited()) {
            queue.poll();
        }
        return !queue.isEmpty();
    }

    @Override
    public Vertex<T> getNext() {
        if (queue.isEmpty()) {
            return null;
        }

        Vertex<T> current = queue.poll();
        if (!current.isVisited()) {
            current.setVisited(true);
            current.getNeighbors().forEach(neighbor -> {if (!neighbor.isVisited()) queue.add(neighbor);});
            return current;
        }
        return getNext();
    }

    @Override
    public void reset() {
        queue.clear();
        queue.add(startVertex);
    }
}
