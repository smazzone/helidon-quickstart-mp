package io.helidon.examples.quickstart.mp;

import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@Liveness 
@ApplicationScoped 
public class GreetLivenessCheck implements HealthCheck {
  private GreetingProvider provider;

  @Override
  public HealthCheckResponse call() {
    return HealthCheckResponse.named("LivenessCheck")  
        .up()
        .withData("time", System.currentTimeMillis())
        .build();
  }
}