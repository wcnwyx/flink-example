package com.wcn.flink.example.risk;

import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class RiskTest {
    public static void main(String[] args) throws Exception {
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        final DataStreamSource<TransFlow> streamSource = env.fromElements(
                new TransFlow("o1", "m1", "c123", 1),
                new TransFlow("o1", "m2", "c123", 1),
                new TransFlow("o1", "m3", "c123", 1),
                new TransFlow("o2", "m1", "c123", 1),
                new TransFlow("o2", "m2", "c123", 1),
                new TransFlow("o2", "m3", "c123", 1)
                );
        //按照orgId汇总
        streamSource.keyBy(TransFlow::getOrgId).sum("amt").print("org: ");
        //按照merchantId汇总
        streamSource.keyBy(TransFlow::getMerchantId).sum("amt").print("merc: ");
        //按照cardNo汇总
        streamSource.keyBy(TransFlow::getCardNo).sum("amt").print("card: ");

        env.execute();
    }
}
