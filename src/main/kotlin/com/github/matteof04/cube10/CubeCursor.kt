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

enum class Move {UP, DOWN, RIGHT, LEFT, UP_RIGHT, UP_LEFT, DOWN_RIGHT, DOWN_LEFT}

class CubeCursor (private val cube: Cube){
    private var x = (0..9).random()
    private var y = (0..9).random()
    fun move(movement : Move){
        when(movement){
            Move.UP -> y += 3
            Move.DOWN -> y -= 3
            Move.RIGHT -> x += 3
            Move.LEFT -> x -= 3
            Move.UP_RIGHT -> {
                y += 2
                x += 2
            }
            Move.UP_LEFT -> {
                y += 2
                x -= 2
            }
            Move.DOWN_RIGHT -> {
                y -= 2
                x += 2
            }
            Move.DOWN_LEFT -> {
                y -= 2
                x -= 2
            }
        }
    }
    fun getCurrentPosition() = CubePosition(x.toUInt(), y.toUInt())
    fun getPossibleMoves() : List<Move>{
        val moves = ArrayList<Move>()
        if(x+3 <= 9){
            if(cube.isEmpty(CubePosition.fromInt(x + 3, y))){
                moves.add(Move.RIGHT)
            }
        }
        if(x-3 >= 0){
            if(cube.isEmpty(CubePosition.fromInt(x - 3, y))) {
                moves.add(Move.LEFT)
            }
        }
        if(y+3 <= 9){
            if(cube.isEmpty(CubePosition.fromInt(x, y + 3))) {
                moves.add(Move.UP)
            }
        }
        if(y-3 >= 0){
            if(cube.isEmpty(CubePosition.fromInt(x, y - 3))) {
                moves.add(Move.DOWN)
            }
        }
        if(x+2 <= 9 && y+2 <= 9){
            if(cube.isEmpty(CubePosition.fromInt(x + 2, y + 2))) {
                moves.add(Move.UP_RIGHT)
            }
        }
        if(x-2 >= 0 && y+2 <= 9){
            if(cube.isEmpty(CubePosition.fromInt(x - 2, y + 2))) {
                moves.add(Move.UP_LEFT)
            }
        }
        if(x+2 <= 9 && y-2 >= 0){
            if(cube.isEmpty(CubePosition.fromInt(x + 2, y - 2))) {
                moves.add(Move.DOWN_RIGHT)
            }
        }
        if(x-2 >= 0 && y-2 >= 0){
            if(cube.isEmpty(CubePosition.fromInt(x - 2, y - 2))) {
                moves.add(Move.DOWN_LEFT)
            }
        }
        return moves
    }
}