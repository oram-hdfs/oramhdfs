/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.yarn.api.records;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.yarn.api.ApplicationMasterProtocol;
import org.apache.hadoop.yarn.util.Records;

/**
 * {@code UpdateContainerRequest} represents the request made by an
 * application to the {@code ResourceManager} to update an attribute of a
 * {@code Container} such as its Resource allocation or (@code ExecutionType}
 * <p>
 * It includes:
 * <ul>
 *   <li>version for the container.</li>
 *   <li>{@link ContainerId} for the container.</li>
 *   <li>
 *     {@link Resource} capability of the container after the update request
 *     is completed.
 *   </li>
 * </ul>
 *
 * @see ApplicationMasterProtocol#allocate(org.apache.hadoop.yarn.api.protocolrecords.AllocateRequest)
 */
@InterfaceAudience.Public
@InterfaceStability.Unstable
public abstract class UpdateContainerRequest {

  @InterfaceAudience.Public
  @InterfaceStability.Unstable
  public static UpdateContainerRequest newInstance(int version,
      ContainerId containerId, ContainerUpdateType updateType,
      Resource targetCapability) {
    UpdateContainerRequest request =
        Records.newRecord(UpdateContainerRequest.class);
    request.setContainerVersion(version);
    request.setContainerId(containerId);
    request.setContainerUpdateType(updateType);
    request.setCapability(targetCapability);
    return request;
  }

  /**
   * Get the <code>ContainerId</code> of the container.
   * @return <code>ContainerId</code> of the container
   */
  @InterfaceAudience.Public
  @InterfaceStability.Unstable
  public abstract int getContainerVersion();

  /**
   * Set the current version of the container.
   * @param containerVersion of the container
   */
  @InterfaceAudience.Public
  @InterfaceStability.Unstable
  public abstract void setContainerVersion(int containerVersion);

  /**
   * Get the <code>ContainerUpdateType</code> of the container.
   * @return <code>ContainerUpdateType</code> of the container.
   */
  @InterfaceAudience.Public
  @InterfaceStability.Unstable
  public abstract ContainerUpdateType getContainerUpdateType();

  /**
   * Set the <code>ContainerUpdateType</code> of the container.
   * @param updateType of the Container
   */
  @InterfaceAudience.Public
  @InterfaceStability.Unstable
  public abstract void setContainerUpdateType(ContainerUpdateType updateType);

  /**
   * Get the <code>ContainerId</code> of the container.
   * @return <code>ContainerId</code> of the container
   */
  @InterfaceAudience.Public
  @InterfaceStability.Unstable
  public abstract ContainerId getContainerId();

  /**
   * Set the <code>ContainerId</code> of the container.
   * @param containerId <code>ContainerId</code> of the container
   */
  @InterfaceAudience.Public
  @InterfaceStability.Unstable
  public abstract void setContainerId(ContainerId containerId);

  /**
   * Get the <code>Resource</code> capability of the container.
   * @return <code>Resource</code> capability of the container
   */
  @InterfaceAudience.Public
  @InterfaceStability.Unstable
  public abstract Resource getCapability();

  /**
   * Set the <code>Resource</code> capability of the container.
   * @param capability <code>Resource</code> capability of the container
   */
  @InterfaceAudience.Public
  @InterfaceStability.Unstable
  public abstract void setCapability(Resource capability);

  @Override
  public int hashCode() {
    final int prime = 2153;
    int result = 2459;
    ContainerId cId = getContainerId();
    Resource capability = getCapability();
    result =
        prime * result + ((capability == null) ? 0 : capability.hashCode());
    result = prime * result + ((cId == null) ? 0 : cId.hashCode());
    result = prime * result + getContainerVersion();
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    UpdateContainerRequest other = (UpdateContainerRequest) obj;
    Resource capability = getCapability();
    if (capability == null) {
      if (other.getCapability() != null) {
        return false;
      }
    } else if (!capability.equals(other.getCapability())) {
      return false;
    }
    ContainerId cId = getContainerId();
    if (cId == null) {
      if (other.getContainerId() != null) {
        return false;
      }
    } else if (!cId.equals(other.getContainerId())) {
      return false;
    }
    if (getContainerVersion() != other.getContainerVersion()) {
      return false;
    }
    return true;
  }
}
