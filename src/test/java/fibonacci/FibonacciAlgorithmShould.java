package fibonacci;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciAlgorithmShould {

    @Test
    void get_nth_term_by_iterative_fn() {
        assertThat(iterativeFibonacci(1)).isEqualTo(1);
        assertThat(iterativeFibonacci(2)).isEqualTo(1);
        assertThat(iterativeFibonacci(3)).isEqualTo(2);
        assertThat(iterativeFibonacci(4)).isEqualTo(3);
        assertThat(iterativeFibonacci(5)).isEqualTo(5);
        assertThat(iterativeFibonacci(6)).isEqualTo(8);
        assertThat(iterativeFibonacci(11)).isEqualTo(89);
        assertThat(iterativeFibonacci(12)).isEqualTo(144);
        assertThat(iterativeFibonacci(14)).isEqualTo(377);
        assertThat(iterativeFibonacci(38)).isEqualTo(39088169);
    }

    @Test
    void get_nth_term_by_recursive_fn() {
        assertThat(fibonacci(1)).isEqualTo(1);
        assertThat(fibonacci(2)).isEqualTo(1);
        assertThat(fibonacci(3)).isEqualTo(2);
        assertThat(fibonacci(4)).isEqualTo(3);
        assertThat(fibonacci(5)).isEqualTo(5);
        assertThat(fibonacci(6)).isEqualTo(8);
        assertThat(fibonacci(7)).isEqualTo(13);
        assertThat(fibonacci(11)).isEqualTo(89);
        assertThat(fibonacci(12)).isEqualTo(144);
        assertThat(fibonacci(14)).isEqualTo(377);
        assertThat(fibonacci(38)).isEqualTo(39088169);
    }

    private int fibonacci(int index) {
        if (index == 2 || index == 1)
            return 1;
        return fibonacci(index - 1) + fibonacci(index - 2);
    }

    private int iterativeFibonacci(int index) {
        int f1 = 1, f2 = 1, fn = 1;
        for (int pointer = 3; pointer <= index; pointer++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}
