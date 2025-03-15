package chapiter07;

/*public abstract class Fish {
}*/

public abstract sealed class Fish permits Trout, Bass {
}