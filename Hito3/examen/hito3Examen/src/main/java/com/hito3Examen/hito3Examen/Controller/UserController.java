package com.hito3Examen.hito3Examen.Controller;

import com.hito3Examen.hito3Examen.Model.VirusModel;
import com.hito3Examen.hito3Examen.Services.VirusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api/v1/")

public class UserController {
private VirusModel virusModel;
    @Autowired
    private VirusService virusService;

    @GetMapping("/coronaVirusPaciente")

    public ResponseEntity<List<VirusModel>> getAllDepart() {
        try {
            List<VirusModel> depar = virusService.getAllDepar();

            if (depar.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(depar, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/coronaVirusPaciente")

    public ResponseEntity save(@RequestBody VirusModel VIRUS) {

        try {
            return new ResponseEntity<>(virusService.save(VIRUS), HttpStatus.EXPECTATION_FAILED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }

    }
    @GetMapping("/coronaVirusPaciente/{idCoronavirus}")
    public ResponseEntity<VirusModel> getDeparByIdPer(@PathVariable("idCoronavirus") Integer idCoronavirus) {
        try {
            VirusModel DepModel = virusService.getDeparByIdPer(idCoronavirus);

            if ( DepModel!= null) {
                return new ResponseEntity<>(DepModel, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/coronaVirusPaciente/{idCoronavirus}")
    public ResponseEntity<VirusModel> update(@PathVariable("idCoronavirus") Integer idDep, @RequestBody VirusModel DepModel) {
        try {
            VirusModel DUpdate = virusService.update(DepModel, idDep);
            if (DUpdate != null) {
                return new ResponseEntity<>(DUpdate, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/coronaVirusPaciente")
    public ResponseEntity<String> delete() {
        try {
            virusService.delete();
            return new ResponseEntity<>("person successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
