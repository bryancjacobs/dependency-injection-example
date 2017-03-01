package example.service

import example.model.Car
import example.repo.CarRepo

/**
  * Created by bjacobs on 3/1/17.
  */
class CarService(carRepo: CarRepo) {

  def getById(id: Int): Car = {

    // not dependency injection and the reason it exists
    // val carRepo = new CarRepo

    carRepo.getById(id)
  }

}
