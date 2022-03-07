package org.sbm.police.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.sbm.police.validator.anno.PoliceDurumKontrol;
import org.sbm.police.validator.anno.PoliceKontrol;
import org.sbm.police.validator.anno.PolicePrimKontrol;

public class PolicelerimAddInput {
	@PoliceKontrol
	@NotBlank(message = "Boþ geçilimez")
	@Pattern(regexp = "[A-Za-z]+", message = "Sadece Metin giriniz")
	String policeTipi;
	@PolicePrimKontrol
	@NotNull(message = "Yazýn")
	int policePrim;
	@PoliceDurumKontrol
	int policeDurum;

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

	@Override
	public String toString() {
		return "PolicelerimAddInput [policeTipi=" + policeTipi + ", policePrim=" + policePrim + ", policeDurum="
				+ policeDurum + "]";
	}

}
