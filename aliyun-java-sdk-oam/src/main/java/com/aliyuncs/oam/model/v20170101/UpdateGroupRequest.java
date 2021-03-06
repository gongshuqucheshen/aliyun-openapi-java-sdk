/*
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

package com.aliyuncs.oam.model.v20170101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateGroupRequest extends RpcAcsRequest<UpdateGroupResponse> {
	   

	private String newGroupName;

	private String newDescription;

	private String groupName;
	public UpdateGroupRequest() {
		super("Oam", "2017-01-01", "UpdateGroup");
		setMethod(MethodType.POST);
	}

	public String getNewGroupName() {
		return this.newGroupName;
	}

	public void setNewGroupName(String newGroupName) {
		this.newGroupName = newGroupName;
		if(newGroupName != null){
			putQueryParameter("NewGroupName", newGroupName);
		}
	}

	public String getNewDescription() {
		return this.newDescription;
	}

	public void setNewDescription(String newDescription) {
		this.newDescription = newDescription;
		if(newDescription != null){
			putQueryParameter("NewDescription", newDescription);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	@Override
	public Class<UpdateGroupResponse> getResponseClass() {
		return UpdateGroupResponse.class;
	}

}
