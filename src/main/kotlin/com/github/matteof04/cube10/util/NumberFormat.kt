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

package tk.emef.cube10

fun Int.to3DigitString() : String{
    return if((0..9).contains(this)){
        "00$this"
    }else if ((10..99).contains(this)){
        "0$this"
    }else{
        toString()
    }
}

fun UInt.toDigitString() : String{
    return if((0u..9u).contains(this)){
        "0$this"
    }else{
        toString()
    }
}