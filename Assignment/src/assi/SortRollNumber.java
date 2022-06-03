package assi;

import java.util.Comparator;

class SortRollNumber implements Comparator<Practice>{

	@Override
	public int compare(Practice o1, Practice o2) {
		String s1= o1.name;
		String s2= o2.name;
		return s2.compareTo(s1);
	}
	
}
