/**
 * This file is part of LibLaserCut.
 * Copyright (C) 2011 - 2014 Thomas Oster <mail@thomas-oster.de>
 *
 * LibLaserCut is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * LibLaserCut is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with LibLaserCut. If not, see <http://www.gnu.org/licenses/>.
 *
 **/
package com.t_oster.liblasercut.drivers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * This class implements a driver for SmoothieBoard.
 * 
 * @author Thomas Oster <mail@thomas-oster.de>
 */
public class SmoothieBoard extends GenericGcodeDriver {

  public SmoothieBoard()
  {
    //set some smoothie-specific defaults
    setIdentificationLine("Smoothie");
    setWaitForOKafterEachLine(true);
  }

  @Override
  public String[] getPropertyKeys()
  {
    List<String> result = new LinkedList<String>();
    result.addAll(Arrays.asList(super.getPropertyKeys()));
    result.remove(GenericGcodeDriver.SETTING_IDENTIFICATION_STRING);
    result.remove(GenericGcodeDriver.SETTING_WAIT_FOR_OK);
    return result.toArray(new String[0]);
  }

  @Override
  public String getModelName()
  {
    return "Smoothie Board";
  }

  @Override
  public SmoothieBoard clone()
  {
    SmoothieBoard clone = new SmoothieBoard();
    clone.copyProperties(this);
    return clone;
  }

}