/*******************************************************************************
 * Copyright 2015-16 AutoCognite Testing Research Pvt Ltd
 * 
 * Website: www.AutoCognite.com
 * Email: support [at] autocognite.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.autocognite.ex.testauto01.basic;

import static com.arjunapro.testauto.assertions.Assertions.assertEquals;
import static com.arjunapro.testauto.assertions.Assertions.error;

import com.arjunapro.testauto.annotations.TestClass;
import com.arjunapro.testauto.annotations.TestMethod;

@TestClass
public class SimpleTest{

	public void testMethodPass() throws Exception{	
		assertEquals("Sample Purpose", 1,1);
	}

	@TestMethod
	public void anyNameTest() throws Exception{	
		assertEquals("Sample Purpose", 1,1);
	}

	public void testMethodFail( ) throws Exception{
		assertEquals("Sample Purpose", 1,2);
	}

	public void testMethodError() throws Exception{
		error("Dummy Error");
	}
}
