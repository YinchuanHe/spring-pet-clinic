package com.springproject.springpetclinic.bootstrap;

import com.springproject.springpetclinic.model.Owner;
import com.springproject.springpetclinic.model.Vet;
import com.springproject.springpetclinic.services.OwnerService;
import com.springproject.springpetclinic.services.VetService;
import com.springproject.springpetclinic.services.map.OwnerServiceMap;
import com.springproject.springpetclinic.services.map.VetServiceMap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }
    

    @Override
    public void run(String... args) throws Exception{
        Owner owner0 = new Owner();
        owner0.setId(1L);
        owner0.setFirstName("Wen");
        owner0.setLastName("Li");
        ownerService.save(owner0);

        Owner owner1 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Yinchuan");
        owner1.setLastName("He");
        ownerService.save(owner1);
        
        System.out.println("Loading owners...");

        Vet vet0 = new Vet();
        vet0.setId(1L);
        vet0.setFirstName("Doctor");
        vet0.setLastName("Cat");
        vetService.save(vet0);

        Vet vet1 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Doctor");
        vet1.setLastName("Dog");
        vetService.save(vet1);
        
        System.out.println("Loading vets...");
        
    } 

}