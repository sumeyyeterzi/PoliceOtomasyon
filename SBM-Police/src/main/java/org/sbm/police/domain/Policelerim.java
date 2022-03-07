package org.sbm.police.domain;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Policelerim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	String policeTipi;
	int policePrim;
	int policeDurum;
	Date olusturmaTarihi;
	Date guncellemeTarihi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPoliceTipi() {
		return policeTipi;
	}

	public void setPoliceTipi(String policeTipi) {
		this.policeTipi = policeTipi;
	}

	public int getPolicePrim() {
		return policePrim;
	}

	public void setPolicePrim(int policePrim) {
		this.policePrim = policePrim;
	}

	public int getPoliceDurum() {
		return policeDurum;
	}

	public void setPoliceDurum(int policeDurum) {
		this.policeDurum = policeDurum;
	}

	public Date getOlusturmaTarihi() {
		return olusturmaTarihi;
	}

	public void setOlusturmaTarihi(Date olusturmaTarihi) {
		this.olusturmaTarihi = olusturmaTarihi;
	}

	public Date getGuncellemeTarihi() {
		return guncellemeTarihi;
	}

	public void setGuncellemeTarihi(Date guncellemeTarihi) {
		this.guncellemeTarihi = guncellemeTarihi;
	}
	@Override
	public String toString() {
		return "Policelerim [PoliceTipi=" + policeTipi + ", Police Prim=" + policePrim + ", PoliceDurum=" + policeDurum + " ,Olusturma Tarihi=" + olusturmaTarihi + ", Güncelleme tarihi=" + guncellemeTarihi + "]";
	}
	
}
