package business.concretes;


import business.abstrac.ITalentService;
import entities.concretes.Talents;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalentManager implements ITalentService {
    @Override
    public List<Talents> getAll() {
        return null;
    }

    @Override
    public List<Talents> delete() {
        return null;
    }

    @Override
    public List<Talents> update() {
        return null;
    }

    @Override
    public List<Talents> add() {
        return null;
    }
}
