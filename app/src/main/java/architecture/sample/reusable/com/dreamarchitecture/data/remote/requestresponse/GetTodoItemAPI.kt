package architecture.sample.reusable.com.dreamarchitecture.data.remote.requestresponse

import architecture.sample.reusable.com.dreamarchitecture.data.remote.NetworkContract
import architecture.sample.reusable.com.dreamarchitecture.data.remote.RequestResponseCreator
import architecture.sample.reusable.com.dreamarchitecture.data.remote.model.NetworkRequest
import architecture.sample.reusable.com.dreamarchitecture.data.remote.parser.GetTodoItemsParser
import architecture.sample.reusable.com.dreamarchitecture.domain.model.TodoItem
import org.json.JSONObject

/*
 * Created by 849501 on 12/28/2017.
 */

class GetTodoItemAPI(private val personId: String): RequestResponseCreator<List<TodoItem>> {

    override fun createRequest(): NetworkRequest {

        val params: HashMap<String, String> = HashMap();
        params.put(NetworkContract.GetTodoItemAPI.Params.PERSON_ID, personId)

        return NetworkRequest.GetNetworkRequest(NetworkContract.GetTodoItemAPI.ENDPOINT_URL,
                params)
    }

    override fun parseResponse(jsonObject: JSONObject): List<TodoItem> {
        return GetTodoItemsParser().parseResponse(jsonObject)
    }
}