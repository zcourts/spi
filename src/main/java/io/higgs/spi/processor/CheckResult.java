/*

Copyright 2008 TOPdesk, the Netherlands

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

package io.higgs.spi.processor;

public final class CheckResult {
	public static final CheckResult OK = new CheckResult(null);
	
	private final boolean error;
	private final String message;
	
	public static CheckResult valueOf(String message) {
		if (message == null) {
			throw new NullPointerException("message");
		}
		return new CheckResult(message);
	}
	
	private CheckResult(String message) {
		error = (message != null);
		this.message = message;
	}

	public boolean isError() {
		return error;
	}

	public String getMessage() {
		return message;
	}
}