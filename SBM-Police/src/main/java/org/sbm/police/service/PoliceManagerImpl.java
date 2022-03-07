package org.sbm.police.service;

import java.util.Date;
import java.util.List;

import org.sbm.police.domain.Policelerim;
import org.sbm.police.form.PolicelerimAddInput;
import org.sbm.police.form.PolicelerimUpdateInput;
import org.sbm.police.repository.PoliceRepository;
import org.springframework.stereotype.Service;

@Service
public class PoliceManagerImpl implements PoliceManager {

	private final PoliceRepository policerepository;

	public PoliceManagerImpl(PoliceRepository policerepository) {
		this.policerepository = policerepository;
	}

	@Override
	public List<Policelerim> findAll() {
		return policerepository.findAll();
	}

	@Override
	public boolean policeDelete(int id) {
		try {
			policerepository.deleteById(id);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean policeadd(PolicelerimAddInput policelerim) {
		try {
			Policelerim police = new Policelerim();
			police.setPoliceTipi(policelerim.getPoliceTipi());
			police.setPolicePrim(policelerim.getPolicePrim());
			police.setPoliceDurum(policelerim.getPoliceDurum());
			police.setOlusturmaTarihi(new Date());
			policerepository.save(police);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean policeupdate(Integer id, PolicelerimUpdateInput policelerim) {
		try {
			Policelerim police = policerepository.findById(id).get();
			police.setPoliceTipi(policelerim.getPoliceTipi());
			police.setPolicePrim(policelerim.getPolicePrim());
			police.setPoliceDurum(policelerim.getPoliceDurum());
			police.setGuncellemeTarihi(new Date());
			policerepository.save(police);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public List<Policelerim> findByPolicePrimAndPoliceDurum(int prim, int durum) {

		return policerepository.findByPolicePrimAndPoliceDurum(prim, durum);
	}

}
