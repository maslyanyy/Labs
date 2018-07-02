import Lab.GazolineType;

import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;

public class SkiiTechniqueManager {
    private List<Technique> techniques = new LinkedList<>();

    public void addTechnique(Technique technique) {
        techniques.add(technique);
    }

    public List<Technique> getTechniques() {

        return techniques;
    }

    public List<Technique> findByType(TechniqueEnum type) {
        List<Technique> foundTech = new LinkedList<>();
        for (Technique technique : techniques) {
            if (technique.type == type) {
                foundTech.add(technique);

            }

        }

        return foundTech;

    }

    public List<Technique> findByRun(final double run) {

        List<Technique> foundTech = new LinkedList<>();
        for (Technique technique : techniques) {
            if (technique.getRun() == run) {
                foundTech.add(technique);
            }
        }

        return foundTech;
    }

    public List<Technique> findByWheel(Wheel wheel) {
        List<Technique> foundTech = new LinkedList<>();
        for (Technique technique : techniques) {
            if (technique.wheel == wheel) {
                foundTech.add(technique);

            }

        }

        return foundTech;

    }

    public List<Technique> findByGastype(GazolineType gazolinetype) {
        List<Technique> foundTech = new LinkedList<>();
        for (Technique technique : techniques) {
            if (technique.gazolineType == gazolinetype) {
                foundTech.add(technique);
            }
        }
        return foundTech;

    }

    public List<Technique> sortByRun() {
        techniques.sort(Comparator.comparing(Technique::getRun));
        return techniques;

    }

    ;
}
