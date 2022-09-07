package latihan.oop.ijenishewan.jenishewan;

import latihan.oop.ijenishewan.IKarnivora;

public class Karnivora implements IKarnivora{

	@Override
	public void jenisGigiKarnivoraFunc(String jg) {
		System.out.println(jg);
	}

	@Override
	public void jenisKukuKarnivoraFunc() {
		System.out.println("Tajam");
	}

}
