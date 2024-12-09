package structural.flyweight;

/**
 * Flyweight class: stores the intrinsic state of the object
 * this state is invariant, context-independent, sharable and never altered at runtime
 */
public record BookType(String type, String distributor, String otherData) {
}
