import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida{

    @Override
    public List<String> obterIngredientes() {
        List<String> list = new ArrayList<>();
        list.add("cafe");
        return list;
    }

    @Override
    public double obterPreco() {
        double preco = 5.35;
        return preco;
    }
}
