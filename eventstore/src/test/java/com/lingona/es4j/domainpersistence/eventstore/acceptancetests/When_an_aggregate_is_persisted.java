package com.lingona.es4j.domainpersistence.eventstore.acceptancetests;

//import com.lingona.es4j.domain.persistence.TestAggregate;
import com.lingona.es4j.domainpersistence.api.IRepository;
import java.util.UUID;
import org.hamcrest.core.Is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/*
public class When_an_aggregate_is_persisted { implements  InTheEventStore {

    @Before
    public void setUp() {
        
        // Given
        aggregate = new TestAggregate(id, "Some name");
        
        // When
        repository.save(aggregate, UUID.randomUUID(), null);
    }
    
    @Test
    public void should_be_returned_when_calling_get_by_id () {

        // Then
        assertThat(repository.getById<TestAggregate>(TestAggregate.class, id, 0).getId(), Is.is(aggregate.getId()));
    }

    static final UUID id = UUID.randomUUID();

    static TestAggregate aggregate;

    static IRepository repository = null;

}
*/


/*
[Subject("Persistence")]
public class when_an_aggregate_is_persisted: in_the_event_store
{
    static readonly Guid id = Guid.NewGuid();
    static TestAggregate aggregate;

    Establish context = () =>
        aggregate = new TestAggregate(id, "Some name");

    Because of = () =>
        repository.Save(aggregate, Guid.NewGuid(), null);

    It should_be_returned_when_calling_get_by_id = () =>
        repository.GetById<TestAggregate>(id, 0).Id.ShouldEqual(aggregate.Id);
}
 */