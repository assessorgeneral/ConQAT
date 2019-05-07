/*--------------------------------------------------------------------------+
   $Id: BundleContext.java 32097 2010-12-22 21:47:10Z hummelb $
 |                                                                          |
 | Copyright 2005-2007 Technische Universitaet Muenchen                     |
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
 +--------------------------------------------------------------------------*/
package bundleContextLoader06;

import org.conqat.engine.core.bundle.BundleContextBase;
import org.conqat.engine.core.bundle.BundleInfo;
import org.conqat.engine.core.bundle.BundleResourceManager;

public class BundleContext extends BundleContextBase {

	protected BundleContext(BundleInfo bundleInfo) {
		super(bundleInfo);
	}

}
