package org.sbm.police.service;

import java.util.List;

import org.sbm.police.domain.Policelerim;
import org.sbm.police.form.PolicelerimAddInput;
import org.sbm.police.form.PolicelerimUpdateInput;

public interface PoliceManager {

	List<Policelerim> findAll();

	boolean policeDelete(int id);
	
    boolean policeadd(PolicelerimAddInput policelerim);

	boolean policeupdate(Integer id, PolicelerimUpdateInput policelerim);

	List<Policelerim> findByPolicePrimAndPoliceDurum(int prim, int durum);

	



	
}
