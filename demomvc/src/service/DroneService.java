package service;

import entity.Drone;
import repository.DroneRepository;
import repository.IDroneRepository;

import java.util.List;

public class DroneService implements IDroneService{
    private IDroneRepository droneRepository = new DroneRepository();
    @Override
    public List<Drone> findAll() {
        return droneRepository.findAll();
    }

    @Override
    public List<Drone> search(String soHieu, String nguoiDieuPhoi) {
        return List.of();
    }

    @Override
    public void add(Drone drone) {
         droneRepository.add(drone);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
