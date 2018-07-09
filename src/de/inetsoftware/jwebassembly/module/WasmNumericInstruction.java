/*
   Copyright 2018 Volker Berlin (i-net software)

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/
package de.inetsoftware.jwebassembly.module;

import java.io.IOException;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * WasmInstruction for numeric operation.
 * 
 * @author Volker Berlin
 *
 */
class WasmNumericInstruction implements WasmInstruction {

    private final NumericOperator numOp;

    private final ValueType       valueType;

    /**
     * Create an instance of numeric operation.
     * 
     * @param numOp
     *            the numeric operation
     * @param valueType
     *            the type of the parameters
     * 
     */
    WasmNumericInstruction( @Nullable NumericOperator numOp, @Nullable ValueType valueType ) {
        this.numOp = numOp;
        this.valueType = valueType;
    }

    /**
     * {@inheritDoc}
     */
    public void writeTo( @Nonnull ModuleWriter writer ) throws IOException {
        writer.writeNumericOperator( numOp, valueType );
    }
}