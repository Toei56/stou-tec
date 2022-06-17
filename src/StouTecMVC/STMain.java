package StouTecMVC;

public class STMain {
    public static void main(String[] args) {
        STModel mModel = new STModel();
        STViewForm mViewForm = new STViewForm();
        STController mController = new STController();
        STViewDetals mViewDetals = new STViewDetals();
        mController.setModel(mModel);
        mController.setViewForm(mViewForm);
        mController.setViewDetals(mViewDetals);
    }
}
