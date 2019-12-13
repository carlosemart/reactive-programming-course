import java.time.Duration;

import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

public class Task {

	public static Publisher<String> retryOnError(Mono<String> publisher) {
		return publisher.retryBackoff(10, Duration.ofMillis(100), Duration.ofMillis(500));
	}
}