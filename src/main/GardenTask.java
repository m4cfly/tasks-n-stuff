package main;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GardenTask <T extends Task>{
    private String gardenLocation;

    public GardenTask() {
        this.gardenLocation = gardenLocation;
    }

    public String getGardenLocation() {
        return gardenLocation;
    }

    public void setGardenLocation(String gardenLocation) {
        this.gardenLocation = gardenLocation;
    }
}
