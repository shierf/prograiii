package com.goowia.apprest.services;

public interface PersonaServiceInterface {
    public PersonaService save(PersonaModel pModel);
    public PersonaModel update(PersonaModel pModel, Integer idPer);
    public Integer delete(Integer idPer);
    public List<PersonaModel> getAllPersons();
    public PersonaModel getPersonByIdPer(Integer idPer);
}
