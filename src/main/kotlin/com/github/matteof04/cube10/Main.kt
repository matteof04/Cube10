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

fun main(){
    println("""
        ComicManager  Copyright (C) 2022  Matteo Franceschini

        This program comes with ABSOLUTELY NO WARRANTY.
        This is free software, and you are welcome to redistribute it
        under certain conditions; type `-l' or '--license' for details.

    """.trimIndent())
    var cube: Cube? = null
    var retry = -1
    while (cube == null){
        retry++
        cube = CubeSolver.tryToSolveCube()
    }
    println(cube.toString())
    println("Failed attempts: $retry")
}