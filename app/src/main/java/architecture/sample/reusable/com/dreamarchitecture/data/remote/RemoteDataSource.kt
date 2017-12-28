package architecture.sample.reusable.com.dreamarchitecture.data.remote

import org.json.JSONObject

/*
 * Created by 849501 on 12/28/2017.
 */
class RemoteDataSource: IRemoteDataSource {

    override fun <OutParams> getRequest(creator: RequestResponseCreator<OutParams>): OutParams {
        return creator.parseResponse(JSONObject())
    }
}