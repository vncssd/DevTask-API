package co.vini.Spring.Developer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
