/*
 * Copyright (c) 2019 Zavarov
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

package vartas.fa.transformations;

import vartas.fa.DeterministicFiniteDefaultAutomaton;

/**
 * This interfaces adds the ability to compute minimal DFAs with infinite alphabets.
 */
public interface MinimizeDefault extends Minimize, ReverseDefault {
    /**
     * Applies the Brzozowski's algorithm.
     * @return a minimal DFA accepting the same language.
     */
    @Override
    default DeterministicFiniteDefaultAutomaton minimize(){
        return reverse().powerSet().reverse().powerSet();
    }
}
