package com.hito3Examen.hito3Examen.Services;

import com.hito3Examen.hito3Examen.Model.VirusModel;

import java.util.List;

public interface VirusInterfaceService {
    public VirusModel save(VirusModel virusModel);
    public VirusModel update(VirusModel virusModel, Integer idDepar);
    public Integer delete();
    public List<VirusModel> getAllDepar();
    public VirusModel getDeparByIdPer(Integer idDep);
}
