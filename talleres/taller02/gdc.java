public class gdc {
public static int gcd(int p,int q){ // p > q
    if (q == 0)
        return p;
    else
        return gcd(q, p % q);
}
}