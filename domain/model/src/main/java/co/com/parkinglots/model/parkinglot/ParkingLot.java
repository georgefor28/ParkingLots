package co.com.parkinglots.model.parkinglot;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ParkingLot {

    private int id;
    private String nombre;
    private float hourPrice;
    private int locationX;
    private int locationY;
    private int availableSpots;

    @Override
    public String toString() {
        return "ParkingLot{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", hourPrice=" + hourPrice +
                ", locationX=" + locationX +
                ", locationY=" + locationY +
                ", availableSpots=" + availableSpots +
                '}';
    }
}
