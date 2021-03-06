package piratehat.appstore.presenter;

import java.util.Map;

import piratehat.appstore.contract.IRankContract;
import piratehat.appstore.module.RankModel;

/**
 * Created by PirateHat on 2018/11/23.
 */

public class RankPresenter implements IRankContract.IPresenter {

    private IRankContract.IView mIView;
    private IRankContract.IModel mIModel;

    public RankPresenter(IRankContract.IView IView) {
        mIView = IView;
        mIModel = new RankModel();
    }

    @Override
    public void showError(String msg) {
        mIView.showError(msg);
    }

    @Override
    public void setRankMap(Map map) {
        mIView.setRankMap(map);
    }

    @Override
    public void getRankMap() {
        mIModel.getRankMap(this);
    }
}
