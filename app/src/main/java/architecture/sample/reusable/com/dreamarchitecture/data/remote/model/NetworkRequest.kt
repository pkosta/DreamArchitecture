package architecture.sample.reusable.com.dreamarchitecture.data.remote.model

import org.json.JSONObject

/*
 * Created by 849501 on 12/28/2017.
 */
sealed class NetworkRequest {

    data class GetNetworkRequest(val endPointUrl: String,
                                 val params: HashMap<String, String>): NetworkRequest()

    data class PostNetworkRequest(val endPointUrl: String,
                                  val params: HashMap<String, String>,
                                  val jsonRequestBody: JSONObject): NetworkRequest()

}