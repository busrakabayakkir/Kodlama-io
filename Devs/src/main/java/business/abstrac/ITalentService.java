package business.abstrac;

import entities.concretes.Talents;

import java.util.List;

public interface ITalentService {

    List<Talents> getAll();
    List<Talents> delete();
    List<Talents> update();
    List<Talents> add();


}
