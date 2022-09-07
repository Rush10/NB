package latihan.oop.ijenishewan.jenishewan;

import latihan.oop.ijenishewan.IHerbivora;

public class Herbivora implements IHerbivora{
	
	@Override
	public void jenisGigiHerbivoraFunc(String jg) {
		System.out.println(jg);
	}

	@Override
	public void jenisKukuHerbivoraFunc() {
		System.out.println("Tidak Tajam");
	}
	
}
