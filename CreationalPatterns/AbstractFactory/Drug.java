public abstract class Drug {
    protected String name;
    protected String type;

    public Drug(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract String getInfo();
}