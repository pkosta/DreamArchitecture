package architecture.sample.reusable.com.dreamarchitecture.data.remote

/*
 * Created by 849501 on 12/28/2017.
 */
interface IRemoteDataSource {
    fun <OutParams> getRequest(creator: RequestResponseCreator<OutParams>): OutParams
}