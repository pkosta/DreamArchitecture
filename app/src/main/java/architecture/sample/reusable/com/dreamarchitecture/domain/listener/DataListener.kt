package architecture.sample.reusable.com.dreamarchitecture.domain.listener

/*
 * Created by 849501 on 12/28/2017.
 */
interface DataListener<in OutParams> {

    fun onDataLoaded(params: OutParams)

}