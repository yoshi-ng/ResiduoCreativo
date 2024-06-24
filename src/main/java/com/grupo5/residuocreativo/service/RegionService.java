package com.grupo5.residuocreativo.service;

import com.grupo5.residuocreativo.models.Region;
import com.grupo5.residuocreativo.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public List<Region> findAllRegiones() {
        return regionRepository.findAll();
    }

    public Region getRegionById(Long id) {
        var regionId = regionRepository.findById(id);
        return regionId.get();
    }

    @Transactional
    public Region saveRegion(Region region) {
        Region regionGuardar = regionRepository.save(region);
        return regionGuardar;
    }

    @Transactional
    public Region updateRegion(Region region) {
        Region regionActualizar = regionRepository.save(region);
        return regionActualizar;
    }

    @Transactional
    public void deleteRegion(Long id) {
        regionRepository.deleteById(id);
    }
}
