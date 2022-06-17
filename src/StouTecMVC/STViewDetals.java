package StouTecMVC;

import javax.swing.*;

public class STViewDetals extends JFrame {
    FontStyle Font = new FontStyle();

    JLabel mAp_Id, mAp_Name, mAp_Address, mAp_Chw, mAp_Sex, mAp_Ed, mAp_Maj,
            mQual_Desc_1, mQual_Desc_2, mQual_Desc_3, mQual_Desc_4, mQual_Desc_5,
            mPos_Name_1, mPos_Name_2, mPos_Name_3;

    JButton mEdit;

    private String sAp_Id, sAp_Name, sAp_Address, sAp_Chw, sAp_Sex, sAp_Ed, sAp_Maj,
            sQual_Desc_1, sQual_Desc_2, sQual_Desc_3, sQual_Desc_4 ,sQual_Desc_5,
            sPos_Name_1, sPos_Name_2, sPos_Name_3;

    final int mWIDTH_LAB = 400;
    final int mHEIGTH_LAB = 20;
    final int mX_AP = 50;

    JPanel mShow = new JPanel();
    void showDetals() {
        this.setTitle("Detals");
        this.setSize(500,600);
        this.setResizable(false);
        mShow.setLayout(null);

        JLabel details = new JLabel("รายละเอียดของผู้สมัคร");
        details.setBounds(170,35,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(details);

        mAp_Id = new JLabel("เลขประจำตัวของผู้สมัคร  : " + sAp_Id);
        mAp_Id.setBounds(mX_AP,75,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mAp_Id);

        mAp_Name = new JLabel("ชื่อ-นามสกุล  : " + sAp_Name);
        mAp_Name.setBounds(mX_AP,95,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mAp_Name);

        mAp_Address = new JLabel("ที่อยู่  : " + sAp_Address);
        mAp_Address.setBounds(mX_AP,115,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mAp_Address);

        mAp_Chw = new JLabel("จังหวัด  : " + sAp_Chw);
        mAp_Chw.setBounds(mX_AP,135,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mAp_Chw);

        mAp_Sex = new JLabel("เพศ  :" + sAp_Sex);
        mAp_Sex.setBounds(mX_AP,155,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mAp_Sex);

        mAp_Ed = new JLabel("วุฒิการศึกษาชั้นสูงสุด  : " + sAp_Ed);
        mAp_Ed.setBounds(mX_AP,175,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mAp_Ed);

        mAp_Maj = new JLabel("วิชาเอก  : " + sAp_Maj);
        mAp_Maj.setBounds(mX_AP,195,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mAp_Maj);

        mQual_Desc_1 = new JLabel("ความรู้ความสามารถ 1  : " + sQual_Desc_1);
        mQual_Desc_1.setBounds(mX_AP,215,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mQual_Desc_1);

        mQual_Desc_2 = new JLabel("ความรู้ความสามารถ 2  : " + sQual_Desc_2);
        mQual_Desc_2.setBounds(mX_AP,235,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mQual_Desc_2);

        mQual_Desc_3 = new JLabel("ความรู้ความสามารถ 3  : " + sQual_Desc_3);
        mQual_Desc_3.setBounds(mX_AP,255,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mQual_Desc_3);

        mQual_Desc_4 = new JLabel("ความรู้ความสามารถ 4  : " + sQual_Desc_4);
        mQual_Desc_4.setBounds(mX_AP,275,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mQual_Desc_4);

        mQual_Desc_5 = new JLabel("ความรู้ความสามารถ 5  : " + sQual_Desc_5);
        mQual_Desc_5.setBounds(mX_AP,295,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mQual_Desc_5);

        mPos_Name_1 = new JLabel("ตำแหน่งที่ต้องการสมัคร 1  : " + sPos_Name_1);
        mPos_Name_1.setBounds(mX_AP,315,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mPos_Name_1);

        mPos_Name_2 = new JLabel("ตำแหน่งที่ต้องการสมัคร 2  : " + sPos_Name_2);
        mPos_Name_2.setBounds(mX_AP,335,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mPos_Name_2);

        mPos_Name_3 = new JLabel("ตำแหน่งที่ต้องการสมัคร 3  : " + sPos_Name_3);
        mPos_Name_3.setBounds(mX_AP,355,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(mPos_Name_3);

        mEdit = new JButton("แก้ไข");
        mEdit.setBounds(mX_AP,380,70,mHEIGTH_LAB);
        mShow.add(mEdit);
        mEdit.addActionListener(e -> setVisible(false));

        int count = mShow.getComponentCount();
        for (int i = 0; i < count; i++) {
            mShow.getComponent(i).setFont(Font.mFont_3);
        }
        details.setFont(Font.mFont_1);

        add(mShow);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setsAp_Id(String sAp_Id) {
        this.sAp_Id = sAp_Id;
    }

    public void setsAp_Name(String sAp_Name) {
        this.sAp_Name = sAp_Name;
    }

    public void setsAp_Address(String sAp_Address) {
        this.sAp_Address = sAp_Address;
    }

    public void setsAp_Chw(String sAp_Chw) {
        this.sAp_Chw = sAp_Chw;
    }

    public void setsAp_Sex(String sAp_Sex) {
        this.sAp_Sex = sAp_Sex;
    }

    public void setsAp_Ed(String sAp_Ed) {
        this.sAp_Ed = sAp_Ed;
    }

    public void setsAp_Maj(String sAp_Maj) {
        this.sAp_Maj = sAp_Maj;
    }

    public void setsQual_Desc_1(String sQual_Desc_1) {
        this.sQual_Desc_1 = sQual_Desc_1;
    }

    public void setsQual_Desc_2(String sQual_Desc_2) {
        this.sQual_Desc_2 = sQual_Desc_2;
    }

    public void setsQual_Desc_3(String sQual_Desc_3) {
        this.sQual_Desc_3 = sQual_Desc_3;
    }

    public void setsQual_Desc_4(String sQual_Desc_4) {
        this.sQual_Desc_4 = sQual_Desc_4;
    }

    public void setsQual_Desc_5(String sQual_Desc_5) {
        this.sQual_Desc_5 = sQual_Desc_5;
    }

    public void setsPos_Name_1(String sPos_Name_1) {
        this.sPos_Name_1 = sPos_Name_1;
    }

    public void setsPos_Name_2(String sPos_Name_2) {
        this.sPos_Name_2 = sPos_Name_2;
    }

    public void setsPos_Name_3(String sPos_Name_3) {
        this.sPos_Name_3 = sPos_Name_3;
    }
}
