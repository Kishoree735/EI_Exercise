package behavioral.chain_of_responsibility;

public class Ticket {
    private String issue;
    private Priority priority;

    public Ticket(String issue, Priority priority) {
        this.issue = issue;
        this.priority = priority;
    }

    public String getIssue() { return issue; }
    public Priority getPriority() { return priority; }
}
