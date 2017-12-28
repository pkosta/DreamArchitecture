package architecture.sample.reusable.com.dreamarchitecture.data

import architecture.sample.reusable.com.dreamarchitecture.domain.model.TodoItem

/*
 * Created by 849501 on 12/28/2017.
 */
interface IDataRepository {

   fun getTodoItemList(): List<TodoItem>

}