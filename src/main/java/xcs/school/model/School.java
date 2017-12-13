package xcs.school.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("schools")
@Setter
@Getter
public class School {

    @PrimaryKey("id")
    private UUID id;
    private String name;

}
