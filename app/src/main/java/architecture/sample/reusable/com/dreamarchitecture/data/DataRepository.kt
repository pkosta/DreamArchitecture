package architecture.sample.reusable.com.dreamarchitecture.data

import architecture.sample.reusable.com.dreamarchitecture.data.local.ILocalDataSource
import architecture.sample.reusable.com.dreamarchitecture.data.remote.IRemoteDataSource
import architecture.sample.reusable.com.dreamarchitecture.data.remote.requestresponse.GetTodoItemAPI
import architecture.sample.reusable.com.dreamarchitecture.domain.model.TodoItem

/*
 * Created by 849501 on 12/28/2017.
 */
class DataRepository(private var localDataSource: ILocalDataSource,
                     private var remoteDataSource: IRemoteDataSource) : IDataRepository {

    override fun getTodoItemList(): List<TodoItem> {
        return remoteDataSource.getRequest(GetTodoItemAPI("ABC"))
    }

}