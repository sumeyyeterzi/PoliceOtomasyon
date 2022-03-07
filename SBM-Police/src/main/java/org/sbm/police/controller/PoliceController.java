package org.sbm.police.controller;

import java.util.List;

import javax.validation.Valid;

import org.sbm.police.domain.Policelerim;
import org.sbm.police.form.PolicelerimAddInput;
import org.sbm.police.form.PolicelerimUpdateInput;
import org.sbm.police.service.PoliceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/police")
public class PoliceController {

	@Autowired
	PoliceManager policemanager;

	@GetMapping("/list")
	public List<Policelerim> policeList() {
		return policemanager.findAll();
	}

	@PostMapping("/add")
	public boolean policeAdd(@Valid @RequestBody PolicelerimAddInput policelerim) {
		return policemanager.policeadd(policelerim);
	}

	@PutMapping("/update/{id}")
	public boolean policeUpdate(@PathVariable("id") Integer id,
			@Valid @RequestBody PolicelerimUpdateInput policelerim) {
		return policemanager.policeupdate(id, policelerim);

	}

	@DeleteMapping("/delete/{id}")
	public boolean PoliceDelete(@PathVariable int id) {
		return policemanager.policeDelete(id);
	}

	@GetMapping("/list2")
	public List<Policelerim> policeList(@RequestParam int prim, @RequestParam int durum) {
		return policemanager.findByPolicePrimAndPoliceDurum(prim, durum);
	}

}
