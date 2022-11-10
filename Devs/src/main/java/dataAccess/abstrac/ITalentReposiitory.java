package dataAccess.abstrac;

import entities.concretes.Talents;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITalentReposiitory {

    List<Talents> add();
    List<Talents> delete();
    List<Talents> update();
    List<Talents> getAll();



}
