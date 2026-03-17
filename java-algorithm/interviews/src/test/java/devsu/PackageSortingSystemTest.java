package devsu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PackageSortingSystemTest {

    @Test
    void testHeaviestOnBelt1() {
        // weight0=85, weight1=100, weight2=90 -> should return 1
        assertEquals(1, PackageSortingSystem.solve(85, 100, 90));
    }

    @Test
    void testHeaviestOnBelt0() {
        assertEquals(0, PackageSortingSystem.solve(150, 20, 30));
    }

    @Test
    void testHeaviestOnBelt2() {
        assertEquals(2, PackageSortingSystem.solve(10, 20, 200));
    }

    @Test
    void testEquality() {
        // If 0 and 1 are equal and highest, 0 or 1 are acceptable.
        // Our logic returns 0.
        int result = PackageSortingSystem.solve(100, 100, 50);
        assert(result == 0 || result == 1);
    }

    @Test
    void testEmptyBelts() {
        // Only belt 2 has a package
        assertEquals(2, PackageSortingSystem.solve(0, 0, 50));
    }

}
