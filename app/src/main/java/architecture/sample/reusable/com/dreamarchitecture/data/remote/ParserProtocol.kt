package architecture.sample.reusable.com.dreamarchitecture.data.remote


import architecture.sample.reusable.com.dreamarchitecture.data.remote.model.NetworkRequest
import org.json.JSONObject

/*
 * Created by 849501 on 12/28/2017.
 */
interface ParserProtocol<out OutParams> {

    fun parseResponse(jsonObject: JSONObject): OutParams

}