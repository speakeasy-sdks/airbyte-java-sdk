package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFaunaCollectionDeletionsDisabled
 * <b>This only applies to incremental syncs.</b> <br>
 * Enabling deletion mode informs your destination of deleted documents.<br>
 * Disabled - Leave this feature disabled, and ignore deleted documents.<br>
 * Enabled - Enables this feature. When a document is deleted, the connector exports a record with a "deleted at" column containing the time that the document was deleted.
**/
public class SourceFaunaCollectionDeletionsDisabled {
    @JsonProperty("deletion_mode")
    public SourceFaunaCollectionDeletionsDisabledDeletionModeEnum deletionMode;
    public SourceFaunaCollectionDeletionsDisabled withDeletionMode(SourceFaunaCollectionDeletionsDisabledDeletionModeEnum deletionMode) {
        this.deletionMode = deletionMode;
        return this;
    }
    
}
