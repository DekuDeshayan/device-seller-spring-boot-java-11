package com.sha.springbootdeviceseller.service;

import java.util.List;

import com.sha.springbootdeviceseller.model.Device;

public interface DeviceService {

	Device saveDevice(Device device);

	void deleteDeviceById(Long id);

	List<Device> findAllDevices();

}
