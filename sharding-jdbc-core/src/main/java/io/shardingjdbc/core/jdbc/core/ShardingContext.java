/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingjdbc.core.jdbc.core;

import io.shardingjdbc.core.constant.DatabaseType;
import io.shardingjdbc.core.executor.ExecutorEngine;
import io.shardingjdbc.core.metadata.ShardingMetaData;
import io.shardingjdbc.core.rule.ShardingRule;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.sql.DataSource;
import java.util.Map;

/**
 * Sharding runtime context.
 * 
 * @author gaohongtao
 * @author panjuan
 */
@RequiredArgsConstructor
@Getter
public final class ShardingContext {
    
    private final Map<String, DataSource> dataSourceMap;
    
    private final ShardingRule shardingRule;
    
    private final DatabaseType databaseType;
    
    private final ExecutorEngine executorEngine;
    
    private final ShardingMetaData shardingMetaData;
    
    private final boolean showSQL;
}
