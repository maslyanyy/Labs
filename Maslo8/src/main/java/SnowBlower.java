import Lab.GazolineType;

public class SnowBlower extends Technique {
    private double power;
    private double speed;
    private double weight;
    public TechniqueEnum type;
    public GazolineType gazolineType;
    public Wheel wheel;

    public SnowBlower() {

    }

    public String toString() {
        return super.toString() + "; Power " + this.power + "; Speed " + this.speed + "; Weight " + this.weight;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders();
    }

    @Override
    public String toCSV() {
        return super.toCSV();
    }

    public SnowBlower(String name, int amount, int run, double power, double speed, double weight, TechniqueEnum type, GazolineType gazolineType, Wheel wheel, final Integer id) {
        super(name, amount, run, type, wheel, gazolineType, id);
        this.power = power;
        this.speed = speed;
        this.weight = weight;

    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
