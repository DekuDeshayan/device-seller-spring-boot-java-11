package com.sha.springbootdeviceseller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sha.springbootdeviceseller.model.Device;
import com.sha.springbootdeviceseller.service.DeviceService;

@RestController
@RequestMapping("/api/device")//url base para todos metodos do controller de devices
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;
	
	@PostMapping("save-device")//api/device/save-device
	public ResponseEntity<?> saveDevices(@RequestBody Device device){
		
		return new ResponseEntity<>(deviceService.saveDevice(device), HttpStatus.CREATED);
		
	}
	
	
	@DeleteMapping("delete-device/{deviceId}")//api/device/delete-device/{deviceId}
	public ResponseEntity<?> deleteDevice(@PathVariable Long deviceId){
		
		deviceService.deleteDeviceById(deviceId);// O metodo deleteDevice nao precisa de retorno por isso nao incluimos dentro deo responseEntity
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	
	@GetMapping("find-all-devices")//api/device/find-all-devices
	public ResponseEntity<?> findAllDevices(){
		
		
		return new ResponseEntity<>(deviceService.findAllDevices(), HttpStatus.OK);
		
		
	}
	
	
	

	
}
