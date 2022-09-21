package com.API1.services;

import com.API1.models.spacecrafts.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

public interface SpacecraftsService {
  /**
   * Read a spacecraft
   *
   * @param spacecraftId The unique identifier of the spacecraft
   */
  public Response GetSpacecraftId(GetSpacecraftIdParams params);

}    