/*
 *  Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.balana.cond.cluster.xacml3;

import org.wso2.balana.cond.Function;
import org.wso2.balana.cond.xacml3.XACML3HigherOrderFunction;
import org.wso2.balana.cond.cluster.FunctionCluster;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Clusters all the functions supported by <code>XACML3HigherOrderFunction</code>.
 */
public class XACML3HigherOrderFunctionCluster implements FunctionCluster {

    @Override
    public Set<Function> getSupportedFunctions() {

        Set<Function> set = new HashSet<>();
        Iterator it = XACML3HigherOrderFunction.getSupportedIdentifiers().iterator();
        while (it.hasNext()) {
            set.add(new XACML3HigherOrderFunction((String) (it.next())));
        }
        return set;
    }
}
