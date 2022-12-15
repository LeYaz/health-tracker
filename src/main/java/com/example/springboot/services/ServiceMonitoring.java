package com.example.springboot.services;

import com.example.springboot.beans.Monitoring;
import com.example.springboot.repository.MonitoringRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service()
public class ServiceMonitoring implements IServiceMonitoring{

    private MonitoringRepository repository;

    public ServiceMonitoring(MonitoringRepository repository){
        this.repository =repository;
    }
    public List<Monitoring> getMonitoringByProfilId(long id) {
        //TODO
        return null;
    }


    public Monitoring getMonitoringById(long id) {
        Optional<Monitoring> monitoring = this.repository.findById(id);
        return monitoring.get();
    }


    public List<Monitoring> getMonitoringByDate(Date dateStart, Date dateEnd) {
        //TODO

        return null;
    }

    public void addMonitoring(Monitoring monitoring) {
        this.repository.saveAndFlush(monitoring);
    }

    public void updateMonitoring(Monitoring monitoring) {
        this.repository.saveAndFlush(monitoring);
    }

    public void deleteMonitoring(long id) {
        this.repository.deleteById(id);
    }
}
