package es.moki.ratelimitj.inmemory;

import es.moki.ratelimitj.core.api.RateLimiter;


public class InmemorySlidingWindowRateLimiter implements RateLimiter {

    @Override
    public boolean overLimit(String key) {
        return false;
    }

    @Override
    public boolean overLimit(String key, int weight) {
        return false;
    }

    @Override
    public boolean resetLimit(String key) {
        return false;
    }
}
