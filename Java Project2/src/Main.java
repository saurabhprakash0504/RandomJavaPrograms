import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<>();
		for(int i = 1; i < 10; i++){
			List<Integer> row = new ArrayList<>();
			for(int j = 1; j <= 10; j++){
				row.add(i * j);
			}
			matrix.add(row);
		}
		for(int i = 0; i < matrix.size(); i++){
			System.out.println(matrix.get(i));
		}
	}
}
