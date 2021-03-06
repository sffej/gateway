/**
 * Copyright 2007-2016, Kaazing Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.mina.core.session;

import java.util.Comparator;

import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.core.write.WriteRequestQueue;

/**
 * Provides data structures to a newly created session.
 * 
 * @author <a href="http://mina.apache.org">Apache MINA Project</a>
 */
public interface IoSessionDataStructureFactory {
    /**
     * Returns an {@link IoSessionAttributeMap} which is going to be associated
     * with the specified <tt>session</tt>.  Please note that the returned
     * implementation must be thread-safe.
     */
    IoSessionAttributeMap getAttributeMap(IoSession session) throws Exception;
    
    /**
     * Returns an {@link WriteRequest} which is going to be associated with
     * the specified <tt>session</tt>.  Please note that the returned
     * implementation must be thread-safe and robust enough to deal
     * with various messages types (even what you didn't expect at all),
     * especially when you are going to implement a priority queue which
     * involves {@link Comparator}.
     */
    WriteRequestQueue getWriteRequestQueue(IoSession session) throws Exception;
}
