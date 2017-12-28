package architecture.sample.reusable.com.dreamarchitecture.domain.usecase

import android.os.AsyncTask
import architecture.sample.reusable.com.dreamarchitecture.data.DataRepository
import architecture.sample.reusable.com.dreamarchitecture.data.local.LocalDataSource
import architecture.sample.reusable.com.dreamarchitecture.data.remote.RemoteDataSource
import architecture.sample.reusable.com.dreamarchitecture.domain.listener.DataListener
import architecture.sample.reusable.com.dreamarchitecture.domain.model.TodoItem

/*
 * Created by 849501 on 12/28/2017.
 */
class GetTodoListUseCase(private var dataListener: DataListener<List<TodoItem>>)
    : AsyncTask<String, Void, List<TodoItem>>() {

    var repository: DataRepository = DataRepository(LocalDataSource(),
            RemoteDataSource()) // TODO

    override fun onPreExecute() {
        super.onPreExecute()
    }

    override fun doInBackground(vararg params: String?): List<TodoItem> {
        return repository.getTodoItemList()
    }

    override fun onPostExecute(result: List<TodoItem>?) {
        super.onPostExecute(result)
        if (result != null) {
            dataListener.onDataLoaded(result)
        }
    }

}