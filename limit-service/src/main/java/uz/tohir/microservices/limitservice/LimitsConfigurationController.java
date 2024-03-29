package uz.tohir.microservices.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.tohir.microservices.limitservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsConfigurations(){
        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
