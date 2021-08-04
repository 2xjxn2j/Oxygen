package org.oxygen;

// import com.github.dockerjava.core.DefaultDockerClientConfig;
// import com.github.dockerjava.core.DockerClientConfig;
// import com.github.dockerjava.httpclient5.ApacheDockerHttpClient;
// import com.github.dockerjava.transport.DockerHttpClient;
// import org.apache.commons.io.IOUtils;
// import org.hamcrest.Matchers;
// import org.json.JSONArray;

// import java.nio.charset.Charset;

// import static org.hamcrest.MatcherAssert.assertThat;

public class App {

    public static void main() {
        System.out.println("Nigger");
//         DockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder().build();

//         DockerHttpClient client = new ApacheDockerHttpClient.Builder()
//                 .dockerHost(config.getDockerHost())
//                 .sslConfig(config.getSSLConfig())
//                 .build();

//         DockerHttpClient.Request request = DockerHttpClient.Request.builder()
//                 .method(DockerHttpClient.Request.Method.GET)
//                 .path("/containers/json")
//                 .build();

//         try (DockerHttpClient.Response response = client.execute( request )) {
//             assertThat(response.getStatusCode(), Matchers.equalTo(200));
//             String a = IOUtils.toString( response.getBody(), Charset.defaultCharset() );
//             JSONArray jsonArray = new JSONArray(a);

//             int i;

//             for(i = 0; i < jsonArray.length(); i++) {
//                 System.out.println( "Id: " + jsonArray.getJSONObject( i ).get( "Id" ) );
//                 System.out.println("Names: " + jsonArray.getJSONObject( i ).get( "Names" ));
//             }

//             if(i == 0) {
//                 System.out.println("No docker containers found");
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }

    }

}
