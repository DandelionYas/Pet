package chain_of_responsibility;


public abstract class Handler {
    private Handler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return this.next;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (next != null) {
            return true;
        }

        return next.handle(username, password);
    }
}
