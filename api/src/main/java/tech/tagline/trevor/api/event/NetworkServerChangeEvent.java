package tech.tagline.trevor.api.event;

import java.util.UUID;

public interface NetworkServerChangeEvent extends NetworkEvent {

  UUID getUUID();

  String getServer();

  String getPreviousServer();
}
