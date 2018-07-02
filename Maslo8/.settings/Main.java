import Lab.GazolineType;

public class Main {
public static void main(String args[]){
   String path = "mydata.csv";
    SkiiTechniqueManager manager = new SkiiTechniqueManager();
    Light light = new Light("Light ", 34, 435, "red ", 22.0, 13, TechniqueEnum.LIGHT, GazolineType.A95, Wheel.WOODEN);
    SnowBlower snowBLower = new SnowBlower("Blower;", 123, 45645, 3.0, 12, 123, TechniqueEnum.SNOWBLOWER, GazolineType.A95, Wheel.METAL);
    manager.addTechnique(light);
    manager.addTechnique(snowBLower);
    CVSWriter.write(path,manager.getTechniques());

} ;
}
