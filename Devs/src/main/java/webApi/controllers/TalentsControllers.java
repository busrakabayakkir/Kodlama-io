package webApi.controllers;

import business.abstrac.ITalentService;
import entities.concretes.Talents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/talents")
public class TalentsControllers {
    private ITalentService talentService;


    @Autowired
    public TalentsControllers(ITalentService talentService) {
        this.talentService = talentService;
    }

    @GetMapping("/getAll")
    public List<Talents> getAll()
    { return talentService.getAll();
    }

    @GetMapping("/delete")
    public List<Talents> delete()
    { return talentService.delete();
    }

    @GetMapping("/add")
    public List<Talents> add()
    { return talentService.add();
    }


    @GetMapping("/update")
    public List<Talents> update()
    { return talentService.update();
    }

    }

