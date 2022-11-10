package dataAccess.concretes;

import dataAccess.abstrac.ITalentReposiitory;
import entities.concretes.Talents;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository
public class InMemoryTalentRepository implements ITalentReposiitory {

    List<Talents> talentsList ;

    public InMemoryTalentRepository(){
        talentsList= new ArrayList<>();
        talentsList.add(new Talents(1,"Ali","C#"));
        talentsList.add(new Talents(2,"Ahmet","Java"));
        talentsList.add(new Talents(3,"Ayşe","Pyton"));
        talentsList.add(new Talents(4,"Fatma","Java"));

    }

    @Override
    public List<Talents> add() {
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
    public List<Talents> getAll() {
        return null;
    }
}
