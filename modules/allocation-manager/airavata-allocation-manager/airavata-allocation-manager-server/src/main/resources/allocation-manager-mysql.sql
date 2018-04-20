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

CREATE database IF NOT EXISTS resource;
use resource;
CREATE TABLE IF NOT EXISTS USER_ALLOCATION_DETAILS (
    PROJECT_ID INT PRIMARY KEY AUTO_INCREMENT,
    REQUESTED_DATE BIGINT NOT NULL,
    TITLE VARCHAR(10000) NOT NULL,
    PROJECT_DESCRIPTION VARCHAR(10000) NOT NULL,
    KEYWORDS VARCHAR(10000),
    DOCUMENTS BLOB,
    USERNAME VARCHAR (255) NOT NULL,
    TYPICAL_SU_PER_JOB BIGINT,
    MAX_MEMORY_PER_CPU BIGINT,
    DISK_USAGE_RANGE_PER_JOB BIGINT,
    NUMBER_OF_CPU_PER_JOB BIGINT,
    COMMENTS VARCHAR(10000),
    ALLOCATION_STATUS VARCHAR (255) NOT NULL
);

create TABLE IF NOT EXISTS USER_SPECIFIC_RESOURCE_DETAILS(
	ID INT PRIMARY KEY AUTO_INCREMENT,
	PROJECT_ID INT,
	SPECIFIC_RESOURCE VARCHAR (255),
	APPLICATIONS_TO_BE_USED VARCHAR(10000),
	REQUESTED_SERVICE_UNITS BIGINT default 1,
	RESOURCE_TYPE VARCHAR (255),
	SUB_STATUS VARCHAR (255),
	REJECTION_REASON VARCHAR(10000),
	ALLOCATED_SERVICE_UNITS BIGINT default 1,
	USED_SERVICE_UNITS BIGINT default 1,
	START_DATE BIGINT,
	END_DATE BIGINT
);

CREATE TABLE IF NOT EXISTS REVIEWER_ALLOCATION_DETAILS (
	ID INT PRIMARY KEY AUTO_INCREMENT,
    REVIEW_DATE BIGINT,
    DOCUMENTS BLOB,
    USERNAME VARCHAR (255),
    PROJECT_ID INT,
    TYPICAL_SU_PER_JOB BIGINT,
    MAX_MEMORY_PER_CPU BIGINT,
    DISK_USAGE_RANGE_PER_JOB BIGINT,
    NUMBER_OF_CPU_PER_JOB BIGINT
);

create TABLE IF NOT EXISTS REVIEWER_SPECIFIC_RESOURCE_DETAILS(
ID INT PRIMARY KEY AUTO_INCREMENT,
PROJECT_ID INT,
SPECIFIC_RESOURCE VARCHAR (255),
APPLICATIONS_TO_BE_USED VARCHAR(10000),
REVIEWED_SERVICE_UNITS BIGINT default 1,
RESOURCE_TYPE VARCHAR (255),
COMMENTS VARCHAR(10000),
USERNAME VARCHAR (255)
);

CREATE TABLE IF NOT EXISTS PROJECT_REVIEWER (
	ID INT PRIMARY KEY AUTO_INCREMENT,
    PROJECT_ID INT,
    REVIEWER_USERNAME VARCHAR (255)
);