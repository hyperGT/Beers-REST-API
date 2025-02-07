package gabriel.learnspring.spring6restmvc.services;

import gabriel.learnspring.spring6restmvc.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {

    List<Beer> listBeers();
    Beer getBeerById(UUID id);
}
