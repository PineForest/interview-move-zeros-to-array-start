/*
 * Copyright © 2021  David Williams
 *
 * This file is part of the interview-move-zeros-to-array-start.
 *
 * interview-move-zeros-to-array-start is free software: you can redistribute it and/or modify it under the terms of the
 * Lesser GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * interview-move-zeros-to-array-start is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the Lesser GNU General Public
 * License for more details.
 *
 * You should have received a copy of the Lesser GNU General Public License along with interview-move-zeros-to-array-start.
 * If not, see <a href="http://www.gnu.org/licenses/">www.gnu.org/licenses/</a>.
 */
package com.example.code;

/**
 * Interview question: Given an array of integers, move all zeros to the beginning of the array
 * without changing the order of the remaining integers.
 *
 * @author PineForest (see https://github.com/PineForest) 09/27/2021
 */
public class Exercise {

  public void moveZerosToArrayStart_inPlaceArrayAlgorithm(int[] integers) {
    int fillToIndex = -1;
    for (int fillFromIndex = integers.length - 1; fillFromIndex >= 0; --fillFromIndex) {
      if (fillToIndex == -1) {
        if (integers[fillFromIndex] == 0) {
          fillToIndex = fillFromIndex;
        }
      } else {
        if (integers[fillFromIndex] != 0) {
          integers[fillToIndex--] = integers[fillFromIndex];
        }
      }
    }
    for (; fillToIndex >= 0; --fillToIndex) {
      integers[fillToIndex] = 0;
    }
  }
}
