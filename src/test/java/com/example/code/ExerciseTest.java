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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Tests the behavior of {@link Exercise#moveZerosToArrayStart_inPlaceArrayAlgorithm(int[])}.
 *
 * @author PineForest (see https://github.com/PineForest) 09/27/2021
 */
class ExerciseTest {
  final static Map<int[], int[]> TEST_DATA = Map.of(
      new int[] {0, 0, 0, 5, 9, 4, 1, 6, 1, 8}, new int[] {5, 0, 9, 4, 0, 1, 6, 1, 0, 8},
      new int[] {0, 0, 0, 9, 4, 1, 6, 1, 8, 2}, new int[] {0, 9, 4, 0, 1, 6, 1, 0, 8, 2},
      new int[] {0, 0, 0, 9, 4, 1, 6, 1, 8, 2}, new int[] {9, 4, 0, 1, 6, 1, 0, 8, 2, 0},
      new int[] {0, 0, 0, 9, 4, 1, 6, 1, 8, 2}, new int[] {9, 4, 0, 1, 6, 1, 0, 8, 2, 0},
      new int[] {9, 4, 1, 6, 1, 8, 2}, new int[] {9, 4, 1, 6, 1, 8, 2},
      new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0});

  /*
    Note: Modifies TEST_DATA Map value arrays.
   */
  @Test
  void moveZerosToArrayStart_inPlaceArrayAlgorithm() {
    Exercise exercise = new Exercise();
    for (Entry<int[], int[]> testData : TEST_DATA.entrySet()) {
      int[] expected = testData.getKey();
      int[] actual = testData.getValue();
      exercise.moveZerosToArrayStart_inPlaceArrayAlgorithm(actual);
      Assertions.assertArrayEquals(expected, actual);
      System.out.println("Success: " + Arrays.toString(actual));
    }
  }
}