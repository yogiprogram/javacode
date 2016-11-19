package innerclass;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Tournament {

	public static void main(String[] args) {
		LinkedHashMap<String , String > stringHashMap = new LinkedHashMap<>();
        stringHashMap.put("yo","1");
        stringHashMap.put("oy","2");
        stringHashMap.put("yo","12");
		stringHashMap.put("1","3");
	}

}
