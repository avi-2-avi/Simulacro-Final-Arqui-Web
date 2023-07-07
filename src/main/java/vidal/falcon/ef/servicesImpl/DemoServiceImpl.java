package vidal.falcon.ef.servicesImpl;

import vidal.falcon.ef.repositories.DemoRepository;
import vidal.falcon.ef.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoRepository demoRepository;

}
