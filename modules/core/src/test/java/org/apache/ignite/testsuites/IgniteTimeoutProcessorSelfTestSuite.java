/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.testsuites;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import org.apache.ignite.internal.processors.timeout.GridTimeoutProcessor;
import org.apache.ignite.internal.processors.timeout.GridTimeoutProcessorSelfTest;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;

/**
 * Suite for {@link GridTimeoutProcessor} tests.
 */
@RunWith(AllTests.class)
public class IgniteTimeoutProcessorSelfTestSuite {
    /**
     * @return Job metrics test suite.
     */
    public static TestSuite suite() {
        TestSuite suite = new TestSuite("Ignite Timeout Processor Test Suite");

        suite.addTest(new JUnit4TestAdapter(GridTimeoutProcessorSelfTest.class));

        return suite;
    }
}
