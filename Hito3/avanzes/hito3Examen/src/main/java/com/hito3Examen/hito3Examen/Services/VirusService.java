package com.hito3Examen.hito3Examen.Services;

import com.hito3Examen.hito3Examen.Model.VirusModel;
import com.hito3Examen.hito3Examen.Repo.VirusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class VirusService implements VirusInterfaceService {
    @Autowired
    private VirusRepo virusRepo;
    @Override
    public VirusModel save(VirusModel virusModel){
        if(virusModel.getEdadPaciente()<10)
        {
        virusModel.setCategoria("nino");
        }
        else if (virusModel.getEdadPaciente()<20 && virusModel.getEdadPaciente()>10 )
        {
            virusModel.setCategoria("adolecente");
        }
        else if (virusModel.getEdadPaciente()>70)
        {
            return null;
        }
        virusModel.setFullname(virusModel.getNombrePaciente()+virusModel.getApellidosPaciente());
        return virusRepo.save(virusModel);
    }
    @Override
    public VirusModel update(VirusModel virusModel,Integer idDep){
        Optional<VirusModel> virus = virusRepo.findById(idDep);
        VirusModel virusUpdate = null;
        if(virus.isPresent()){
            virusUpdate = virus.get();
            virusUpdate.setNombrePaciente(virusModel.getNombrePaciente());
            virusUpdate.setNombresDepa(virusModel.getNombresDepa());
            virusUpdate.setCasosContag(virusModel.getCasosContag());
            virusUpdate.setCasosRecuperados(virusModel.getCasosRecuperados());
            virusUpdate.setCasosSospechosos(virusModel.getCasosSospechosos());
            virusUpdate.setEdadPaciente(virusModel.getEdadPaciente());
            virusUpdate.setApellidosPaciente(virusModel.getApellidosPaciente());
            if(virusModel.getEdadPaciente()<10)
            {
                virusUpdate.setCategoria("nino");
            }
            else if (virusModel.getEdadPaciente()<20 && virusModel.getEdadPaciente()>10 )
            {
                virusUpdate.setCategoria("adolecente");
            }
            else{
                virusUpdate.setCategoria("adulto");
            }
            virusUpdate.setFullname(virusModel.getNombrePaciente()+virusModel.getApellidosPaciente());


        }
        return virusUpdate;
    }
    @Override
    public Integer delete(){
        virusRepo.deleteAll();
        return 1;
    }
    @Override
    public List<VirusModel> getAllDepar(){
        List<VirusModel> depart = new ArrayList<VirusModel>();
        virusRepo.findAll().forEach(depart::add);
        return depart;
    }
    @Override
    public VirusModel getDeparByIdPer(Integer idDEP){
        Optional<VirusModel> depar = virusRepo.findById(idDEP);
        VirusModel virusModel = null;
        if(depar.isPresent()){
            virusModel = depar.get();
        }
        return virusModel;
    }

}
