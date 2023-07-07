package vidal.falcon.ef.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vidal.falcon.ef.dtos.VfDTODirectorSummary;
import vidal.falcon.ef.entities.VfDirector;
import vidal.falcon.ef.services.VfDirectorService;

import java.util.List;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
@RequestMapping("/api")
@SecurityRequirement(name = "bearerAuth") // This is for Swagger UI documentation
public class VfDirectorController {
    @Autowired
    VfDirectorService vfDirectorService;

    @PostMapping("/directors")
    public ResponseEntity<VfDirector> createDirector(@RequestBody VfDirector vfDirector) {
        VfDirector savedDirector = vfDirectorService.save(vfDirector);
        return new ResponseEntity<VfDirector>(savedDirector, HttpStatus.CREATED);
    }

    @GetMapping("/directors/summary")
    public ResponseEntity<List<VfDTODirectorSummary>> getDirectorsSummary() {
        List<VfDTODirectorSummary> dtoDirectorSummaries = vfDirectorService.getDirectorsSummary();
        return new ResponseEntity<List<VfDTODirectorSummary>>(dtoDirectorSummaries, HttpStatus.OK);
    }

}
