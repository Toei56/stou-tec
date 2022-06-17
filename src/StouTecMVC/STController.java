package StouTecMVC;

public class STController {
    private STModel mModel;
    private STViewForm mViewForm;
    private STViewDetals mViewDetals;

    public void setModel(STModel Model) {
        this.mModel = Model;
    }

    public void setViewForm(STViewForm ViewForm) {
        this.mViewForm = ViewForm;
        mViewForm.mSEX_M.addActionListener(e -> decideSex());
        mViewForm.mSEX_F.addActionListener(e -> decideSex());
        mViewForm.mOK.addActionListener(e -> setData());
    }

    public void setViewDetals(STViewDetals ViewDetals) {
        this.mViewDetals = ViewDetals;
    }

    public void decideSex() {
        if (mViewForm.mSEX_M.isSelected()) {
            mViewForm.mSEX = mViewForm.mSEX_M.getText();
        }
        if (mViewForm.mSEX_F.isSelected()) {
            mViewForm.mSEX = mViewForm.mSEX_F.getText();
        }
    }

    public void setData() {
        mModel.setmAp_Id(mViewForm.getAp_Id());
        mModel.setmAp_Name(mViewForm.getAp_Name());
        mModel.setmAp_Address(mViewForm.getAp_Address());
        mModel.setmAp_Chw(mViewForm.getAp_Chw());
        mModel.setmAp_Sex(mViewForm.getAp_Sex());
        mModel.setmAp_Ed(mViewForm.getAp_Ed());
        mModel.setmAp_Maj(mViewForm.getAp_Maj());
        mModel.setmQual_Desc_1(mViewForm.getQual_Desc_1());
        mModel.setmQual_Desc_2(mViewForm.getQual_Desc_2());
        mModel.setmQual_Desc_3(mViewForm.getQual_Desc_3());
        mModel.setmQual_Desc_4(mViewForm.getQual_Desc_4());
        mModel.setmQual_Desc_5(mViewForm.getQual_Desc_5());
        mModel.setmPos_Name_1(mViewForm.getPos_Name_1());
        mModel.setmPos_Name_2(mViewForm.getPos_Name_2());
        mModel.setmPos_Name_3(mViewForm.getPos_Name_3());

        mViewDetals.setsAp_Id(mModel.getmAp_Id());
        mViewDetals.setsAp_Name(mModel.getmAp_Name());
        mViewDetals.setsAp_Address(mModel.getmAp_Address());
        mViewDetals.setsAp_Chw(mModel.getmAp_Chw());
        mViewDetals.setsAp_Sex(mModel.getmAp_Sex());
        mViewDetals.setsAp_Ed(mModel.getmAp_Ed());
        mViewDetals.setsAp_Maj(mModel.getmAp_Maj());
        mViewDetals.setsQual_Desc_1(mModel.getmQual_Desc_1());
        mViewDetals.setsQual_Desc_2(mModel.getmQual_Desc_2());
        mViewDetals.setsQual_Desc_3(mModel.getmQual_Desc_3());
        mViewDetals.setsQual_Desc_4(mModel.getmQual_Desc_4());
        mViewDetals.setsQual_Desc_5(mModel.getmQual_Desc_5());
        mViewDetals.setsPos_Name_1(mModel.getmPos_Name_1());
        mViewDetals.setsPos_Name_2(mModel.getmPos_Name_2());
        mViewDetals.setsPos_Name_3(mModel.getmPos_Name_3());
        mViewDetals.showDetals();
        mViewDetals = new STViewDetals();
    }
}
