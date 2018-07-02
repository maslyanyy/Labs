import Lab.GazolineType;

public class Light extends Technique {
    private int brightnes;
    private double weight;
    private String color;
    private int run;
    public TechniqueEnum type = TechniqueEnum.LIGHT;
    public GazolineType gazolineType = GazolineType.A92;

    public String toString() {
        return super.toString() + "; Weight " + this.weight + "; Brightness " + this.brightnes + "; Color " + this.color;
    }

    public Light() {

    }

    @Override
    public String getHeaders() {
        return super.getHeaders();
    }

    @Override
    public String toCSV() {
        return super.toCSV();
    }

    public Light(String name, int amount, int run, String color, double weight,
                 int brighnes, TechniqueEnum type, GazolineType gazolinetype, Wheel wheel, final Integer id) {
        super(name, amount, run, type, wheel, gazolinetype, id);
        this.color = color;
        this.weight = weight;
        this.brightnes = brighnes;

    }

    public int getBrightnes() {
        return brightnes;
    }

    public void setBrightnes(int brightnes) {
        this.brightnes = brightnes;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRun() {
        return run;
    }


    public void setRun(int run) {
        this.run = run;
    }
}
