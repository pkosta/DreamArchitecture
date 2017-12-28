package architecture.sample.reusable.com.dreamarchitecture.data.remote.parser

import architecture.sample.reusable.com.dreamarchitecture.data.remote.ParserProtocol
import architecture.sample.reusable.com.dreamarchitecture.domain.model.TodoItem
import org.json.JSONObject

/*
 * Created by 849501 on 12/28/2017.
 */
class GetTodoItemsParser: ParserProtocol<List<TodoItem>> {

    override fun parseResponse(jsonObject: JSONObject): List<TodoItem> {
        return ArrayList()
    }

}