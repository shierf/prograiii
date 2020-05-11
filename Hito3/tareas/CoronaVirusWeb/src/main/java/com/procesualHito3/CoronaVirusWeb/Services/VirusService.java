package com.procesualHito3.CoronaVirusWeb.Services;

import com.procesualHito3.CoronaVirusWeb.Model.VirusModel;
import com.procesualHito3.CoronaVirusWeb.Repo.VirusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VirusService implements VirusInterfaceService{
    @Autowired
    private VirusRepo virusRepo;
    @Override
    public VirusModel save(VirusModel virusModel){
        return virusRepo.save(virusModel);
    }
    @Override
    public VirusModel update(VirusModel virusModel,Integer idcoronavirus){
        Optional<VirusModel> virus = virusRepo.findById(idcoronavirus);
        VirusModel virusUpdate = null;
        if(virus.isPresent()){
        virusUpdate = virus.get();
        virusUpdate.setNombresDepa(virusModel.getNombresDepa());
        virusUpdate.setCasosContag(virusModel.getCasosContag());
        virusUpdate.setCasosRecuperados(virusModel.getCasosRecuperados());
        virusUpdate.setCasosSospechosos(virusModel.getCasosSospechosos());
        }
        return virusUpdate;
    }
    @Override
    public Integer delete(Integer idcoronavirus){
        virusRepo.deleteById(idcoronavirus);
        return 1;
    }
    @Override
    public List<VirusModel>getAllDepar(){
        List<VirusModel> coronavirus = new ArrayList<VirusModel>();
        virusRepo.findAll().forEach(coronavirus::add);
        return coronavirus;
    }
    @Override
    public VirusModel getDeparByIdPer(Integer idcoronavirus){
        Optional<VirusModel> coronavirus = virusRepo.findById(idcoronavirus);
        VirusModel virusModel = null;
        if(coronavirus.isPresent()){
            virusModel = coronavirus.get();
        }
        return virusModel;
    }
}

