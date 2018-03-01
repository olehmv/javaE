package epam.course.java.workflow;

public enum Status {
    Close,Open,Inhold
    public String toString() {
        switch (this) {
            case Open:
                return "Open";
            case Close:
                return "Close";
            case Inhold:
                return "Inhold";
            default:
                return "Open";
        }

    }
}
