package com.example.springboot.services;

import com.example.springboot.beans.Monitoring;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service()
public class ServiceMonitoring implements IServiceMonitoring{
    @Override
    public List<Monitoring> getMonitoringByProfilId(long id) {
        return null;
    }

    @Override
    public Monitoring getMonitoringById(long id) {
        return null;
    }

    @Override
    public List<Monitoring> getMonitoringByDate(Date dateStart, Date dateEnd) {
        return null;
    }

    @Override
    public void addMonitoring(Monitoring monitoring) {

    }

    @Override
    public void updateMonitoring(Monitoring monitoring) {

    }

    @Override
    public void deleteMonitoring(long id) {

    }
}
