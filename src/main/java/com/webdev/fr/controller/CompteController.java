package com.webdev.fr.controller;

import com.webdev.fr.model.Compte;
import com.webdev.fr.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/compte")
public class CompteController {
@Autowired
    private CompteRepository compteRepository;
@GetMapping(value = "/liste")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Compte> liste()
{return compteRepository.findAll();}


}
