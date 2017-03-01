package example.service

import example.model.Car
import example.repo.CarRepo
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by bjacobs on 3/1/17.
  */
class CarServiceUT extends FlatSpec with Matchers {

  "getById" should "return a Car by the given id" in {

    val carService = new CarService(new CarRepo)

    carService.getById(1).id should be(1)
  }

  it should "return a Car with the id 999 that the mock returns" in {

    val carService = new CarService(new CarRepoMock)


    carService.getById(1).id should be(999)
  }

}

class CarRepoMock extends CarRepo {

  override def getById(id: Int): Car = {
    Car(999)
  }

}
