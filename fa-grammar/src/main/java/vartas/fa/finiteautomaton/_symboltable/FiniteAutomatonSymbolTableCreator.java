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

package vartas.fa.finiteautomaton._symboltable;

import de.monticore.symboltable.ArtifactScope;
import de.monticore.symboltable.ResolvingConfiguration;
import de.monticore.symboltable.Scope;
import vartas.fa.finiteautomaton._ast.ASTFiniteAutomaton;

import java.util.ArrayList;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class FiniteAutomatonSymbolTableCreator extends FiniteAutomatonSymbolTableCreatorTOP{

    public FiniteAutomatonSymbolTableCreator(ResolvingConfiguration resolverConfig, Scope enclosingScope) {
        super(resolverConfig, enclosingScope);
    }

    @Override
    public ArtifactScope createFromAST(ASTFiniteAutomaton rootNode) {
        requireNonNull(rootNode);

        final ArtifactScope artifactScope = new ArtifactScope(Optional.empty(), "", new ArrayList<>());
        putOnStack(artifactScope);

        rootNode.accept(this);

        return artifactScope;
    }
}
