/**
 Autores:Tomás Duque y Juan Felipe Ortiz**/
import java.util.Objects;

public class Par<F, S> {
    public final F first;
    public final S second;

    public Par(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Par)) {
            return false;
        }
        Par<?, ?> p = (Par<?, ?>) o;
        return Objects.equals(p.first, first) && Objects.equals(p.second, second);
    }

    @Override
    public int hashCode() {
        int hashFirst = (first == null) ? 0 : first.hashCode();
        int hashSecond = (second == null) ? 0 : second.hashCode();
        return hashFirst ^ hashSecond;
    }
    @Override
    public String toString() {
        return "Par{" + String.valueOf(first) + " " + String.valueOf(second) + "}";
    }

    public static <A, B> Par<A, B> makePair(A a, B b) {
        return new Par<A, B>(a, b);
    }
}