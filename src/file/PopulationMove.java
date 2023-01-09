package file;

public class PopulationMove {
    private String fromSido;
    private String toSido;

    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    //생성자 오버로딩
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = String.valueOf(fromSido);
        this.toSido = String.valueOf(toSido);
    }

    //getter and setter
    public String getFromSido() {
        return fromSido;
    }

    public String getToSido() {
        return toSido;
    }

    public void setFromSido(String fromSido) {
        this.fromSido = fromSido;
    }

    public void setToSido(String toSido) {
        this.toSido = toSido;
    }
}
