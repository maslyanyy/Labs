import Lab.GazolineType;

public class Technique {
    private String name;
    private int run;
    private int amount;
    public TechniqueEnum type;
    public Wheel wheel;
    public GazolineType gazolineType;
    private Integer id;

    public String toString() {
        return "Name " + this.getName() + "; Amount " + this.amount + "; Wheel " + wheel + "; Type " + this.type + "; Gazoline " + gazolineType;
    }

    public String toCSV() {
        return "Name " + this.getName() + "; Amount " + this.amount + "; Wheel " + wheel + "; Type " + this.type + "; Gazoline " + gazolineType;
    }

    public String getHeaders() {
        return "Name," + "Run," + "Amount," + "Type," + "Wheel," + "GazolineType";
    }

    public String toCVS() {
        return getName() + "," + getRun() + "," + getAmount() + "," + getType() + "," + getWheel() + "," + getGazolineType();
    }

    public Technique() {

    }

    public Technique(final String name, final int amount, final int run, final TechniqueEnum type, final Wheel wheel, final GazolineType gazoline, final Integer id) {
        this.name = name;
        this.amount = amount;
        this.run = run;
        this.type = type;
        this.wheel = wheel;
        this.gazolineType = gazoline;
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public Integer getId() {
        return id;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getName() {
        return name;
    }

    public TechniqueEnum getType() {
        return type;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public GazolineType getGazolineType() {
        return gazolineType;
    }

    public void setName(String name) {
        this.name = name;
    }
}
