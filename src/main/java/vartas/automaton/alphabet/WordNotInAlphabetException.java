/*
 * Copyright (C) 2017 Zavarov
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package vartas.automaton.alphabet;

/**
 * This exception is thrown when a word is accessed, that isn't in the alphabet.
 * @author Zavarov
 */
public class WordNotInAlphabetException extends RuntimeException{
    private static final long serialVersionUID = 0L;
    /**
     * @param word the word that has been used. 
     */
    public WordNotInAlphabetException(String word){
        super(String.format("The word %s is not in the alphabet.",word));
    }
}