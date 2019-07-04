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

package vartas.fa.builder;

import org.junit.Before;
import org.junit.Test;

public class NondeterministicFiniteAutomatonBuilderTest extends FiniteAutomatonBuilderTest<NondeterministicFiniteAutomatonBuilder>{
    @Before
    @Override
    public void setUp(){
        builder = new NondeterministicFiniteAutomatonBuilder();

        super.setUp();

        builder.addTransition(start, 'a', end);
        builder.addEpsilonTransition(start, end);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testDuplicateTransitions(){
        builder.addTransition(start, 'a', end);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testDuplicateEpsilonTransitions(){
        builder.addEpsilonTransition(start, end);
    }

    @Test(expected=IllegalStateException.class)
    public void testBuildWithoutInitialState(){
        builder.initialState = null;
        builder.build();
    }
}
