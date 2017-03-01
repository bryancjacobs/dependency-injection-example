package example.repo

import example.model.Car

/**
  * Created by bjacobs on 3/1/17.
  */
class CarRepo {

  def getById(id: Int): Car ={
    Car(id)
  }

}
