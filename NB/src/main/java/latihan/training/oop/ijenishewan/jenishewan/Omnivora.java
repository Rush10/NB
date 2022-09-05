package latihan.training.oop.ijenishewan.jenishewan;

import latihan.training.oop.ijenishewan.IHerbivora;
import latihan.training.oop.ijenishewan.IKarnivora;

public class Omnivora implements IHerbivora, IKarnivora{

	@Override
	public void jenisGigiKarnivoraFunc(String jg) {
		System.out.println(jg);
	}

	@Override
	public void jenisKukuKarnivoraFunc() {
		System.out.println("Tajam");
	}

	@Override
	public void jenisGigiHerbivoraFunc(String jg) {
		System.out.println(jg);
	}

	@Override
	public void jenisKukuHerbivoraFunc() {
		System.out.println("Tidak Tajam");
	}

}
