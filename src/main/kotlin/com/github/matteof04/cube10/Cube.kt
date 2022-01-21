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

import tk.emef.cube10.to3DigitString

class Cube {
    private val cube = Array(10) {Array(10) {0} }
    fun setValue(pos: CubePosition, value:Int){
        cube[pos.x.toInt()][pos.y.toInt()] = value
    }
    fun isEmpty(pos: CubePosition) : Boolean{
        return cube[pos.x.toInt()][pos.y.toInt()] == 0
    }
    fun isSolved() : Boolean{
        for (i in cube){
            for (j in i){
                if(j == 0){
                    return false
                }
            }
        }
        return true
    }
    override fun toString() : String{
        var string = ""
        for (i in cube){
            for (j in i){
                string += " ${j.to3DigitString()} "
            }
            string += "\n"
        }
        return string
    }
}