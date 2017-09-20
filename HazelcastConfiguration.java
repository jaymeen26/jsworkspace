package com.js.websys.springboot;

/**
 * Created by E066932 on 9/6/2017.
 */

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfiguration {

    @Bean
    public Config hazelCastConfig(){
       Config cfg = new Config()
                .setInstanceName("hazelcast-instance")
                .addMapConfig(
                        new MapConfig()
                                .setName("instruments")
                                .setMaxSizeConfig(new MaxSizeConfig(200, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
                                .setEvictionPolicy(EvictionPolicy.LRU)
                                .setTimeToLiveSeconds(20));


      /*  NetworkConfig networkConfig = cfg.getNetworkConfig();

        JoinConfig join = networkConfig.getJoin();
        join.getMulticastConfig().setEnabled( false );

        join.getTcpIpConfig().addMember("10.157.136.221").setEnabled( true );
        networkConfig.setPortAutoIncrement(true);
        networkConfig.getInterfaces().setEnabled( true ).addInterface("10.157.136.221");
        *//*HazelcastInstance hz1 = Hazelcast.newHazelcastInstance(cfg);
        HazelcastInstance hz2 = Hazelcast.newHazelcastInstance(cfg);*/
        return cfg;
    }

}