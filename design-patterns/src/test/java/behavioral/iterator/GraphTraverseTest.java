package behavioral.iterator;

import behavioral.iterator.iterators.BreadthFirstIterator;
import behavioral.iterator.iterators.DepthFirstIterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class GraphTraverseTest {

    @Test
    public void testDepthFirstIterator() {
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        v0.setNeighbors(Arrays.asList(v1, v5, v6));
        v1.setNeighbors(Arrays.asList(v3, v4, v5));
        v4.setNeighbors(Arrays.asList(v2, v6));
        v6.setNeighbors(List.of(v0));

        DepthFirstIterator<Integer> dfs = new DepthFirstIterator<>(v0);

        Queue<Integer> expected = new ArrayDeque<>(Arrays.asList(0,1,3,4,2,6,5));
        while (dfs.hasNext()) {
            Vertex<Integer> current = dfs.getNext();
            Assertions.assertEquals(expected.poll(), current.getData());
        }
    }

    @Test
    public void testBreadthFirstIterator() {
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        v0.setNeighbors(Arrays.asList(v1, v5, v6));
        v1.setNeighbors(Arrays.asList(v3, v4, v5));
        v4.setNeighbors(Arrays.asList(v2, v6));
        v6.setNeighbors(List.of(v0));

        BreadthFirstIterator<Integer> bfs = new BreadthFirstIterator<>(v0);

        Queue<Integer> expected = new ArrayDeque<>(Arrays.asList(0,1,5,6,3,4,2));
        while (bfs.hasNext()) {
            Vertex<Integer> current = bfs.getNext();
            Assertions.assertEquals(expected.poll(), current.getData());
        }
    }
}
