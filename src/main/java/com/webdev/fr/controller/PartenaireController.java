package com.webdev.fr.controller;

import com.webdev.fr.model.Partenaire;
import com.webdev.fr.repository.PartenaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping(value ="/partenaire")
//@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//@ResponseBody
public class PartenaireController {

    @Autowired
    private PartenaireRepository partenaireRepository;
    @GetMapping(value = "/liste")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Partenaire> liste()
    {return partenaireRepository.findAll();}
    @PostMapping(value = "/add")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Partenaire add(Partenaire p)
    {return partenaireRepository.save(p);}
}
