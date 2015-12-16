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

CREATE TABLE DATA_RESOURCE
(
        RESOURCE_ID VARCHAR (255),
        RESOURCE_NAME VARCHAR (255),
        RESOURCE_DESCRIPTION VARCHAR (1024),
        RESOURCE_SIZE INTEGER ,
        CREATION_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        LAST_MODIFIED_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        PRIMARY KEY (RESOURCE_ID)
);

CREATE TABLE DATA_REPLICA_LOCATION
(
        RESOURCE_ID VARCHAR (255),
        REPLICA_NAME VARCHAR (255),
        REPLICA_DESCRIPTION VARCHAR (1024),
        DATA_LOCATIONS VARCHAR (4096),
        CREATION_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        LAST_MODIFIED_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        FOREIGN KEY (RESOURCE_ID) REFERENCES DATA_RESOURCE(RESOURCE_ID) ON DELETE CASCADE
);


CREATE TABLE CONFIGURATION
(
        CONFIG_KEY VARCHAR(255),
        CONFIG_VAL VARCHAR(255),
        PRIMARY KEY(CONFIG_KEY, CONFIG_VAL)
);

INSERT INTO CONFIGURATION (CONFIG_KEY, CONFIG_VAL) VALUES('data_catalog_version', '0.16');