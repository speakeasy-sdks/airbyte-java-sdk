package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFaunaCollectionDeletionsEnabled
 * <b>This only applies to incremental syncs.</b> <br>
 * Enabling deletion mode informs your destination of deleted documents.<br>
 * Disabled - Leave this feature disabled, and ignore deleted documents.<br>
 * Enabled - Enables this feature. When a document is deleted, the connector exports a record with a "deleted at" column containing the time that the document was deleted.
**/
public class SourceFaunaCollectionDeletionsEnabled {
    @JsonProperty("column")
    public String column;
    public SourceFaunaCollectionDeletionsEnabled withColumn(String column) {
        this.column = column;
        return this;
    }
    
    @JsonProperty("deletion_mode")
    public SourceFaunaCollectionDeletionsEnabledDeletionModeEnum deletionMode;
    public SourceFaunaCollectionDeletionsEnabled withDeletionMode(SourceFaunaCollectionDeletionsEnabledDeletionModeEnum deletionMode) {
        this.deletionMode = deletionMode;
        return this;
    }
    
}
