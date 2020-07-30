package org.oxygen;

import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.httpclient5.ApacheDockerHttpClient;
import com.github.dockerjava.transport.DockerHttpClient;
import org.apache.commons.io.IOUtils;
import org.hamcrest.Matchers;
import org.json.JSONObject;

import java.nio.charset.Charset;

import static org.hamcrest.MatcherAssert.assertThat;

public class App {

    public static void main(String[] args) {
        DockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder().build();

        DockerHttpClient client = new ApacheDockerHttpClient.Builder()
                .dockerHost(config.getDockerHost())
                .sslConfig(config.getSSLConfig())
                .build();

        DockerHttpClient.Request request = DockerHttpClient.Request.builder()
                .method(DockerHttpClient.Request.Method.GET)
                .path("/containers/json")
                .build();

        try (DockerHttpClient.Response response = client.execute( request )) {
            assertThat(response.getStatusCode(), Matchers.equalTo(200));
            String a = IOUtils.toString( response.getBody(), Charset.defaultCharset() );
            JSONObject jsonObject = new JSONObject(a);
            System.out.println( "Id = " + jsonObject.get( "Id" ) );
            System.out.println("Names = " + jsonObject.get( "Names" ));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
