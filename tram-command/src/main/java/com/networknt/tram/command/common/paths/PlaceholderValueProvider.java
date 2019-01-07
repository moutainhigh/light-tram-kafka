package com.networknt.tram.command.common.paths;

import java.util.Map;
import java.util.Optional;

public interface PlaceholderValueProvider {
  Optional<String> get(String name);
  Map<String, String> getParams();
}
