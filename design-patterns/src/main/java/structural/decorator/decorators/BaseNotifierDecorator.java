package structural.decorator.decorators;

import structural.decorator.DatabaseService;
import structural.decorator.INotifier;

public class BaseNotifierDecorator implements INotifier {
    private final INotifier wrapped;
    protected final DatabaseService databaseService;

    public BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        this.databaseService = new DatabaseService();
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
}
