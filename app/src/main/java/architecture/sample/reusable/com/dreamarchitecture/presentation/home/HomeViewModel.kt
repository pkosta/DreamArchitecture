package architecture.sample.reusable.com.dreamarchitecture.presentation.home

import architecture.sample.reusable.com.dreamarchitecture.domain.model.TodoItem
import architecture.sample.reusable.com.dreamarchitecture.domain.usecase.GetTodoListUseCase

/*
 * Created by 849501 on 12/28/2017.
 */
class HomeViewModel(var mGetTodoListUseCase: GetTodoListUseCase) {

    private lateinit var mTodoItemList: List<TodoItem>

}