/*
 * Copyright (C) 2022 Matteo Franceschini <matteof5730@gmail.com>
 *
 * This file is part of Cube10.
 * Cube10 is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * Cube10 is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Cube10.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.github.matteof04.cube10

data class CubePosition(
    val x: UInt,
    val y: UInt
){
    companion object {
        fun fromInt(x : Int, y: Int) : CubePosition {
            return CubePosition(x.toUInt(), y.toUInt())
        }
    }
}