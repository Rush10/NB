package latihan.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatArrayList {

	public static void main(String[] args) {
		//ArrayList<Data> dt = new ArrayList<Data>();
		List<Data> dt = new ArrayList<Data>(); //List merupakan interface dari ArrayList 
		
		Data data = new Data(); //aktif karena ada contructor kosong
//		Data data = new Data("",0,""); //jika tdk ada contructor kasong
		data.setNama("Novri");
		data.setUmur(23);
		data.setAlamat("Jl.Jalan1");
		dt.add(data);
		
		dt.add(new Data("Jeje",25,"Jl.Jalan2"));
		dt.add(new Data("Juju",20,"Jl.Jalan3"));
		dt.add(new Data("Suju",22,"Jl.Jalan4"));
		
		data = new Data();//harus dilakukan new, jika tidak maka akan menimpa alamat di variabel data sebelumnya
		data.setNama("Nono");
		data.setUmur(30);
		data.setAlamat("Jl.Jalan5");
		dt.add(data);               
		
//		Collections.sort(dt); //akan error karena collections.sort tidak bisa untuk tipe data objek atau kelas kecuali wrapper class/String
				
		for (int i = 0; i < dt.size(); i++) {
			System.out.println(dt.get(i).getNama() + ", " + dt.get(i).getUmur() + ", " + dt.get(i).getAlamat());
		}
		
//		for (Data d : dt) {//foreach
//			System.out.println(d.getNama() + ", " + d.getUmur() + ", " + d.getAlamat());
//		}
		
		System.out.println("=========================");
		
		List<Integer> s = new ArrayList<Integer>(); 
		
		s.add(3);
		s.add(9);
		s.add(8);
		s.add(2);
		s.add(1);
		s.add(7);
		s.add(6);
		s.add(5);
		s.add(0);
		s.add(10);
		
		for (Integer dta : s) {//foreach
			System.out.println(dta);
		}
		
		System.out.println("=========================");
		
		Collections.sort(s); //utk sorting
		
		for (Integer dta : s) {//foreach
			System.out.println(dta);
		}
		
	}

}
