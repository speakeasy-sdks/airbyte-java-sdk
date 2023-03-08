<!-- Start SDK Example Usage -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.operations.CreateConnectionRequest;
import com.airbyte.api.models.operations.CreateConnectionResponse;
import com.airbyte.api.models.shared.ConnectionCreate;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte.Builder builder = Airbyte.builder();

            builder.setSecurity(
                new Security() {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }}
            );

            Airbyte sdk = builder.build();

            CreateConnectionRequest req = new CreateConnectionRequest() {{
                request = new ConnectionCreate() {{
                    destinationId = "unde";
                    name = "deserunt";
                    sourceId = "porro";
                }};
            }};

            CreateConnectionResponse res = sdk.connections.createConnection(req);

            if (res.connectionId.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->