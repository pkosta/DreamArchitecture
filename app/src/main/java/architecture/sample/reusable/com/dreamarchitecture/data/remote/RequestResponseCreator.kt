package architecture.sample.reusable.com.dreamarchitecture.data.remote


import architecture.sample.reusable.com.dreamarchitecture.data.remote.model.NetworkRequest
import org.json.JSONObject

/*
 * Created by 849501 on 12/28/2017.
 */
interface RequestResponseCreator<out OutParams> {

    fun createRequest(): NetworkRequest
    fun parseResponse(jsonObject: JSONObject): OutParams

}