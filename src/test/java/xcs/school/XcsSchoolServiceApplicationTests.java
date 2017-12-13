package xcs.school;

import org.cassandraunit.spring.CassandraDataSet;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
@CassandraDataSet(value = "dataset.sql", keyspace = "sample")
public class XcsSchoolServiceApplicationTests extends AbstractCassandraEmbeddedITTest {

    @Test
    public void contextLoads() {
    }

}
