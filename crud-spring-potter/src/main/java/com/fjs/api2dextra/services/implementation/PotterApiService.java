package com.fjs.api2dextra.services.implementation;

import java.util.ArrayList;
import java.util.List;

import com.fjs.api2dextra.dto.HousesPotterApiRs;
import com.fjs.api2dextra.dto.TeacherDTO;
import com.fjs.api2dextra.model.House;
import com.fjs.api2dextra.repository.IPotterApiRepository;
import com.fjs.api2dextra.services.definition.IPotterApiService;
import com.fjs.api2dextra.services.exceptions.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PotterApiService implements IPotterApiService{

    @Autowired
    private IPotterApiRepository repository;

    /**
     * Dependecy Inversion
     * 
     * @param repository qualquer interface que implemente IPotterApiRepository
     */
    public PotterApiService(IPotterApiRepository repository) {
        this.repository = repository;
    }

    /**
     * Recupera as casas via PotterApi
     * 
     * @return Lista de casas
     */
    @Override
    public List<House> getHousesFromPotterApi() {
        List<House> list = new ArrayList<House>();
        list = repository.getHousesFromPotterApi();
        if (list.size() == 0)
            throw new EntityNotFoundException("Não foi possível obter os valores das casas via potterApi");
            
        return list;
    }

    /**
     * Recupera as casas via PotterApi
     * 
     * @return Lista de casas
     */
    @Override
    public HousesPotterApiRs getHousesFromPotterApiRs() {
        return repository.getHousesFromPotterApiRs();
    }

    /** recupera um professor filtrando pelo id da casa */
    @Override
    public TeacherDTO getHeadOfHouse(String houseId) {
        return repository.getHeadOfHouse(houseId);
    }

}
