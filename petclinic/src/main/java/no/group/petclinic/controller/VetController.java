package no.group.petclinic.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import no.group.petclinic.entity.Vet;
import no.group.petclinic.service.VetService;

@RestController
@RequestMapping("/api/vets")
@RequiredArgsConstructor
public class VetController {
	
	private final VetService vetService;
	
	@GetMapping
	public ResponseEntity<List<Vet>> getVets(){
		List<Vet> vets = vetService.getVets();
		return ResponseEntity.ok().body(vets);
	}

}
