package m2.e2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//todo add method to delete office item
public class Worker {

    private List<OfficeSupply> officeSupplies = new ArrayList<>();

    public BigDecimal sumAllOfficeSupplies() {
        BigDecimal sum = BigDecimal.ZERO;
        for (OfficeSupply os :
                officeSupplies) {
            sum = sum.add(os.getPrice());
        }
        return sum;
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.addOfficeSupply(new Eraser("AS11", "White", "Stabilo", new BigDecimal(27.50), "Rubber, Plastic"));
        worker.addOfficeSupply(new Eraser("AS11", "White", "Stabilo", new BigDecimal(7.37), "Rubber, Plastic"));
        System.out.println(worker.sumAllOfficeSupplies());
    }

    private void addOfficeSupply(OfficeSupply officeSupply) {
        officeSupplies.add(officeSupply);
    }
}
