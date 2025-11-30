package co.vini.Spring.Developer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DevService {

    private DevRepository devRepository;

    public DevService(DevRepository devRepository) {
        this.devRepository = devRepository;
    }

    //list all devs
    public List<DevModel> listDevs(){
        return devRepository.findAll();
    }

    //list by id
    public DevModel listDevsById(Long id){
        Optional<DevModel> devModelOptional = devRepository.findById(id);
        return devModelOptional.orElse(null);
    }

    public DevModel createDev(DevModel devModel){
        return devRepository.save(devModel);
    }

}
