package com.salesforce.ant

import org.specs2._

class DeployTaskForCITest extends Specification {
  def is = "DeployTaskForCI" ^
    "can create " ! e1 ^
    "getRunTests is empty" ! e2 ^
    end

  val sampleInstance = new DeployTaskForCI

  def e1 = sampleInstance must not be null

  def e2 = sampleInstance.getRunTests must have size (0)

}