package co.vini.Spring.Developer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

@Component
public class DevMapper {

    public DevModel map(DevDTO devDTO){

        DevModel devModel = new DevModel();

        devModel.setId(devDTO.getId());
        devModel.setName(devDTO.getName());
        devModel.setEmail(devDTO.getEmail());
        devModel.setRole(devDTO.getRole());
        devModel.setPfpUrl(devDTO.getPfpUrl());
        devModel.setRank(devDTO.getRank());
        devModel.setTasks(devDTO.getTasks());

        return devModel;
    }

    public DevDTO map(DevModel devModel){

        DevDTO devDTO = new DevDTO();

        devDTO.setId(devModel.getId());
        devDTO.setName(devModel.getName());
        devDTO.setEmail(devModel.getEmail());
        devDTO.setRole(devModel.getRole());
        devDTO.setPfpUrl(devModel.getPfpUrl());
        devDTO.setRank(devModel.getRank());
        devDTO.setTasks(devModel.getTasks());

        return devDTO;

    }
}
