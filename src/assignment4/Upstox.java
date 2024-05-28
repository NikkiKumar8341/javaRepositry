package assignment4;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Upstox {

    public static void main(String[] args) throws Exception {
        String clientId = "466e3010-e262-416d-9a7c-995ae5cbde3b";
        String redirectUri = "https://www.google.com";
        String authorizationUrl = "https://api.upstox.com/login/dialog/oauth?client_id=" + clientId + "&redirect_uri=" + redirectUri + "&response_type=code";

        // Redirect the user to the Upstox authorization URL
        System.out.println("Redirect the user to: " + authorizationUrl);
    }

    private static String extractAuthorizationCode(String redirectUri) {
        // Parse the redirect URI to extract the authorization code
        URL url = null;
        String authorizationCode = null;
        try {
            url = new URL(redirectUri);
            String query = url.getQuery();
            String[] params = query.split("&");
            for (String param : params) {
                String[] keyValue = param.split("=");
                if (keyValue[0].equals("code")) {
                    authorizationCode = keyValue[1];
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return authorizationCode;
    }
}
