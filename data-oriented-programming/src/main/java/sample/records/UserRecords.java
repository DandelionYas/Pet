package sample.records;

public class UserRecords {
    public sealed interface Person permits User, Admin {}

    public record User (int id, String name, String email) implements Person { }
    public record Admin (int id, String name, String email, String permissions) implements Person {}
}
