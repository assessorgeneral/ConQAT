/*-------------------------------------------------------------------------+
|                                                                          |
| Copyright 2005-2011 The ConQAT Project                                   |
|                                                                          |
| Licensed under the Apache License, Version 2.0 (the "License");          |
| you may not use this file except in compliance with the License.         |
| You may obtain a copy of the License at                                  |
|                                                                          |
|    http://www.apache.org/licenses/LICENSE-2.0                            |
|                                                                          |
| Unless required by applicable law or agreed to in writing, software      |
| distributed under the License is distributed on an "AS IS" BASIS,        |
| WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
| See the License for the specific language governing permissions and      |
| limitations under the License.                                           |
+-------------------------------------------------------------------------*/
package org.conqat.engine.core.driver.specification.processors;

import org.conqat.engine.core.core.AConQATParameter;
import org.conqat.engine.core.core.AConQATProcessor;

/**
 * Processor for testing purposes.
 * 
 * @author $Author: hummelb $
 * @version $Rev: 49408 $
 * @ConQAT.Rating GREEN Hash: DBEB5B604C9D04C177275A12CC29AFBD
 */
@AConQATProcessor(description = "desc")
public class ProcessorWithEmptyParameterInterval extends TestProcessorBase {

	/** test method */
	@AConQATParameter(description = "mult_desc", name = "mult", minOccurrences = 7, maxOccurrences = 6)
	public void mult() {
		// nothing to do here
	}

}