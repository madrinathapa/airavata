/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
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
 *
 */

package org.apache.airavata.persistance.registry.jpa.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "JOB_DETAIL")
@IdClass(JobDetails_PK.class)
public class JobDetail {
    @Id
    @Column(name = "JOB_ID")
    private String jobId;
    @Id
    @Column(name = "TASK_ID")
    private String taskId;
    @Column(name = "JOB_DESCRIPTION")
    private String jobDescription;
    @Column(name = "CREATION_TIME")
    private Timestamp creationTime;
    @Column(name = "COMPUTE_RESOURCE_CONSUMED")
    private String computeResourceConsumed;


    @ManyToOne(cascade= CascadeType.MERGE)
    @JoinColumn(name = "TASK_ID")
    private TaskDetail task;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    public TaskDetail getTask() {
        return task;
    }

    public void setTask(TaskDetail task) {
        this.task = task;
    }

    public String getComputeResourceConsumed() {
        return computeResourceConsumed;
    }

    public void setComputeResourceConsumed(String computeResourceConsumed) {
        this.computeResourceConsumed = computeResourceConsumed;
    }
}
