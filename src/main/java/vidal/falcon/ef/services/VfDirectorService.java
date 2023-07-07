package vidal.falcon.ef.services;

import vidal.falcon.ef.dtos.VfDTODirectorSummary;
import vidal.falcon.ef.entities.VfDirector;

import java.util.List;

public interface VfDirectorService {
    public VfDirector save(VfDirector vfDirector);
    public List<VfDTODirectorSummary> getDirectorsSummary();
}
