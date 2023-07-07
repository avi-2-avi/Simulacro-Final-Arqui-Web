package vidal.falcon.ef.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vidal.falcon.ef.dtos.VfDTODirectorSummary;
import vidal.falcon.ef.entities.VfDirector;
import vidal.falcon.ef.repositories.VfDirectorRepository;
import vidal.falcon.ef.services.VfDirectorService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class VfDirectorServiceImpl implements VfDirectorService {
    @Autowired
    VfDirectorRepository vfDirectorRepository;

    @Override
    public VfDirector save(VfDirector vfDirector) {
        VfDirector newVfDirector = new VfDirector(vfDirector.getVfFirstName(), vfDirector.getVfLastName(), vfDirector.getVfDateAffiliation(), vfDirector.getVfDateBirth());
        VfDirector savedVfDirector = vfDirectorRepository.save(newVfDirector);
        return savedVfDirector;
    }

    @Override
    public List<VfDTODirectorSummary> getDirectorsSummary() {
        List<VfDirector> vfDirectorList = vfDirectorRepository.findAll();
        List<VfDTODirectorSummary> vfDirectorSummaryList = new ArrayList<>();

        for(VfDirector d: vfDirectorList) {
            String vfFullName = d.getVfFirstName()+" "+d.getVfLastName();
            Integer vfCountShorts = (int)d.getVfFilms().stream().filter(p->p.getVfType().equals("Corto")).count();
            Integer vfCountMovies = (int)d.getVfFilms().stream().filter(p->p.getVfType().equals("Pelicula")).count();
            Double vfTotalSales = d.getVfFilms().stream().map(p->p.getVfSales()).reduce(0.0,Double::sum);

            VfDTODirectorSummary vfDTODirectorSummary = new VfDTODirectorSummary(vfFullName, vfCountShorts, vfCountMovies, d.getVfDateAffiliation(), vfTotalSales);
            vfDirectorSummaryList.add(vfDTODirectorSummary);
        }

        // Sort by fullName
        vfDirectorSummaryList = vfDirectorSummaryList.stream().sorted(Comparator.comparing(VfDTODirectorSummary::getVfFullName)).toList();

        return vfDirectorSummaryList;
    }
}
