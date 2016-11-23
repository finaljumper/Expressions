public class ReturnState {
    private int status;
    private String parts[];

    public ReturnState(int status) {
        this.status = status;
    }

    public ReturnState(int status, String[] parts) {
        this.status = status;
        this.parts = parts;
    }

    public int getStatus() {
        return status;
    }

    public String[] getParts() {
        return parts;
    }

}
