package provaf;
import java.util.Comparator;
import provaf.Despesa;
public class ComparadorDespesa implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Despesa a = (Despesa) o1;
		Despesa b = (Despesa) o2;
		if (a.getValorFinal() == b.getValorFinal()) {
			return 0;
		}
		else if (a.getValorFinal() > b.getValorFinal()) {
			return 1;
		}
		return -1;
	}

}
