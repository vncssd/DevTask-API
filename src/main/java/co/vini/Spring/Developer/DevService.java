package co.vini.Spring.Developer;

import org.hibernate.query.sqm.mutation.internal.temptable.UpdateExecutionDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DevService {

    private final DevRepository devRepository;
    private final DevMapper devMapper;

    public DevService(DevRepository devRepository, DevMapper devMapper) {
        this.devRepository = devRepository;
        this.devMapper = devMapper;
    }

    //list all devs
    public List<DevDTO> listDevs(){
        List<DevModel> devs = devRepository.findAll();
        return devs.stream()
                .map(devMapper::map)
                .collect(Collectors.toList());
    }

    //list by id
    public DevDTO listDevsById(Long id){
        Optional<DevModel> devModelOptional = devRepository.findById(id);
        return devModelOptional.map(devMapper::map).orElse(null);
    }

    public DevDTO createDev(DevDTO devDTO){
        DevModel dev = devMapper.map(devDTO);
        return devMapper.map(devRepository.save(dev));
    }

    public void deleteDev(Long id){
        devRepository.deleteById(id);
    }

    public DevDTO updateDev(Long id, DevDTO devDTO){
        Optional<DevModel> devModelOptional = devRepository.findById(id);
        if (devModelOptional.isPresent()){
            DevModel updatedDev = devMapper.map(devDTO);
            updatedDev.setId(id);
            DevModel savedDev = devRepository.save(updatedDev);
            return devMapper.map(savedDev);
        }
        return null;
    }

}