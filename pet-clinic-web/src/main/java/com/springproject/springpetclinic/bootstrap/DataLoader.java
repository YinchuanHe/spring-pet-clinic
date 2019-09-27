package com.springproject.springpetclinic.bootstrap;

import com.springproject.springpetclinic.model.Owner;
import com.springproject.springpetclinic.model.PetType;
import com.springproject.springpetclinic.model.Vet;
import com.springproject.springpetclinic.services.OwnerService;
import com.springproject.springpetclinic.services.PetTypeService;
import com.springproject.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception{

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

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