import Lab.GazolineType;

public class SkiLift extends Technique {
    private double liftingWeight;
    private double distanceToCover;
    public TechniqueEnum type = TechniqueEnum.SKILIFT;
    public Wheel wheel = Wheel.METAL;

    public double getLiftingWeight() {

        return liftingWeight;
    }

    public SkiLift() {
    }

    @Override
    public String getHeaders() {
        return super.getHeaders();
    }

    @Override
    public String toCSV() {
        return super.toCSV();
    }

    public String toString() {
        return super.toString() + "; Lift weight " + this.liftingWeight + "; Distanceto cover " + this.distanceToCover;
    }

    public SkiLift(String name, int amount, int run, double liftingWeight,
                   double distanceToCover, TechniqueEnum type, GazolineType gazolineType, Wheel wheel, final Integer id) {
        super(name, amount, run, type, wheel, gazolineType, id);
        this.liftingWeight = liftingWeight;
        this.distanceToCover = distanceToCover;


    }

    public void setLiftingWeight(double liftingWeight) {
        this.liftingWeight = liftingWeight;
    }

    public double getDistanceToCover() {
        return distanceToCover;
    }

    public void setDistanceToCover(double distanceToCover) {
        this.distanceToCover = distanceToCover;
    }


}
