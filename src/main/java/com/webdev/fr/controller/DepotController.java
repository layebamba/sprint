package com.webdev.fr.controller;

import com.webdev.fr.model.Depot;
import com.webdev.fr.repository.DepotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/depot")
public class DepotController {
    @Autowired
    private DepotRepository depotRepository;
    @GetMapping(value = "/liste")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Depot> liste()
    {return depotRepository.findAll();}


}
