package com.sha.springbootdeviceseller.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sha.springbootdeviceseller.model.Device;
import com.sha.springbootdeviceseller.repository.DeviceRepository;

@Service
public class DeviceServiceImplementation implements DeviceService {
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	
	@Override
	public Device saveDevice (Device device) {
		
		device.setCreateTime(LocalDateTime.now());
		
		return deviceRepository.save(device);
		
	}
	
	
	@Override
	public void deleteDeviceById (Long id) {
		 deviceRepository.deleteById(id);
	}
	
	
	@Override
	public List<Device> findAllDevices(){
		return deviceRepository.findAll();		
	}
 	

	
	
	
}
