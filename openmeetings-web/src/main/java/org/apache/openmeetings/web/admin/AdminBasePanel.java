/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License") +  you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openmeetings.web.admin;

import org.apache.openmeetings.web.common.BasePanel;
import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;

@AuthorizeInstantiation("Admin")
public abstract class AdminBasePanel extends BasePanel {
	private static final long serialVersionUID = 1L;

	public AdminBasePanel(String id) {
		super(id);
	}

	protected StringBuilder getRowClass(Long id, Long selectedId) {
		StringBuilder sb = new StringBuilder(ROW_CLASS);
		if (id != null && id.equals(selectedId)) {
			sb.append(" table-active");
		}
		return sb;
	}
}
