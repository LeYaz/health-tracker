package com.example.springboot.services;

import com.example.springboot.beans.Monitoring;

import java.util.Date;
import java.util.List;

public interface IServiceMonitoring {
    public List<Monitoring> getMonitoringByProfilId(final long id);
    public Monitoring getMonitoringById(final long id);
    public List<Monitoring> getMonitoringByDate(Date dateStart, Date dateEnd);
    public void addMonitoring(final Monitoring monitoring);
    public void updateMonitoring(final Monitoring monitoring);
    public void deleteMonitoring(final long id);
}
