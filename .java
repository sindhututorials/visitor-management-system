public class Visitor {
    private String name;
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class BaseEntity {
    private Long id;
    private LocalDateTime createdDate;
}

public class Visitor extends BaseEntity {
    private String name;
    private String email;
}
// Method Overloading
public void sendEmail(String to, String subject, String body) {}
public void sendEmail(String to, String subject, String body, String attachmentPath) {}

// Method Overriding
@Override
public void save(Visitor visitor) {
    // custom save logic for visitor
}
        public interface VisitorService {
    void registerVisitor(Visitor visitor);
}

@Service
public class VisitorServiceImpl implements VisitorService {
    @Override
    public void registerVisitor(Visitor visitor) {
        // implementation details
    }
}
/ Interface (defines what to do)
public interface NotificationService {
    void sendNotification(String to, String message);
}

// Abstract class (provides common functionality)
public abstract class BaseService {
    public void logAction(String action) {
        System.out.println("Action performed: " + action);
    }
}
public class EmailNotificationService extends BaseService implements NotificationService {

    @Override
    public void sendNotification(String to, String message) {
        // actual implementation
        System.out.println("Email sent to " + to + ": " + message);
        logAction("Email sent");
    }
}
public abstract class BaseService {
    public void logAction(String action) {
        System.out.println("Performed: " + action);
    }
}
public class VisitorServiceImpl extends BaseService implements VisitorService {
    @Override
    public void registerVisitor(Visitor visitor) {
        logAction("Registering visitor: " + visitor.getName());
    }
}
