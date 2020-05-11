package com.procesualHito3.CoronaVirusWeb.Services;

import com.procesualHito3.CoronaVirusWeb.Model.VirusModel;

import java.util.List;

public interface VirusInterfaceService {
    public VirusModel save(VirusModel virusModel);
    public VirusModel update(VirusModel virusModel, Integer idDepar);
    public Integer delete(Integer idPer);
    public List<VirusModel> getAllDepar();
    public VirusModel getDeparByIdPer(Integer idDep);
}
