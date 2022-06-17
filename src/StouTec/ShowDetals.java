package StouTec;

import javax.swing.*;

public class ShowDetals extends JFrame {
    final int mWIDTH_LAB = 250;
    final int mHEIGTH_LAB = 20;
    final int mX_AP = 50;

    JPanel mShow = new JPanel();

    ShowDetals(StouTec stou) {
        setTitle("Detals");
        setSize(500,600);
        setResizable(false);
        mShow.setLayout(null);

        JLabel details = new JLabel("รายละเอียดของผู้สมัคร");
        details.setBounds(170,35,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(details);

        JLabel ap_id = new JLabel("เลขประจำตัวของผู้สมัคร  : ");
        JLabel result_ap_id = new JLabel(stou.mTfData[0].getText());
        ap_id.setBounds(mX_AP,75,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_id.setBounds(208,75,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_id);
        mShow.add(result_ap_id);

        JLabel ap_name = new JLabel("ชื่อ-นามสกุล  : ");
        JLabel result_ap_name = new JLabel(stou.mTfData[1].getText());
        ap_name.setBounds(mX_AP,95,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_name.setBounds(137,95,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_name);
        mShow.add(result_ap_name);

        JLabel ap_address = new JLabel("ที่อยู่  : ");
        JLabel result_ap_address = new JLabel(stou.mTfData[2].getText());
        ap_address.setBounds(mX_AP,115,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_address.setBounds(90,115,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_address);
        mShow.add(result_ap_address);

        JLabel ap_chw = new JLabel("จังหวัด  : ");
        JLabel result_ap_chw = new JLabel(stou.mTfData[3].getText());
        ap_chw.setBounds(mX_AP,135,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_chw.setBounds(103,135,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_chw);
        mShow.add(result_ap_chw);

        JLabel ap_sex = new JLabel("เพศ  :");
        JLabel result_ap_sex = new JLabel(stou.mSEX);
        ap_sex.setBounds(mX_AP,155,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_sex.setBounds(90,155,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_sex);
        mShow.add(result_ap_sex);

        JLabel ap_ed = new JLabel("วุฒิการศึกษาชั้นสูงสุด  : ");
        JLabel result_ap_ed = new JLabel(stou.mTfData[4].getText());
        ap_ed.setBounds(mX_AP,175,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_ed.setBounds(191,175,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_ed);
        mShow.add(result_ap_ed);

        JLabel ap_maj = new JLabel("วิชาเอก  : ");
        JLabel result_ap_maj = new JLabel(stou.mTfData[5].getText());
        ap_maj.setBounds(mX_AP,195,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_maj.setBounds(110,195,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_maj);
        mShow.add(result_ap_maj);

        JLabel ap_qual_1 = new JLabel("ความรู้ความสามารถ 1  : ");
        JLabel result_ap_qual_1 = new JLabel((String) stou.mCbQUAL[0].getSelectedItem());
        ap_qual_1.setBounds(mX_AP,215,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_qual_1.setBounds(190,215,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_qual_1);
        mShow.add(result_ap_qual_1);

        JLabel ap_qual_2 = new JLabel("ความรู้ความสามารถ 2  : ");
        JLabel result_ap_qual_2 = new JLabel((String) stou.mCbQUAL[1].getSelectedItem());
        ap_qual_2.setBounds(mX_AP,235,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_qual_2.setBounds(190,235,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_qual_2);
        mShow.add(result_ap_qual_2);

        JLabel ap_qual_3 = new JLabel("ความรู้ความสามารถ 3  : ");
        JLabel result_ap_qual_3 = new JLabel((String) stou.mCbQUAL[2].getSelectedItem());
        ap_qual_3.setBounds(mX_AP,255,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_qual_3.setBounds(190,255,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_qual_3);
        mShow.add(result_ap_qual_3);

        JLabel ap_qual_4 = new JLabel("ความรู้ความสามารถ 4  : ");
        JLabel result_ap_qual_4 = new JLabel((String) stou.mCbQUAL[3].getSelectedItem());
        ap_qual_4.setBounds(mX_AP,275,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_qual_4.setBounds(190,275,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_qual_4);
        mShow.add(result_ap_qual_4);

        JLabel ap_qual_5 = new JLabel("ความรู้ความสามารถ 5  : ");
        JLabel result_ap_qual_5 = new JLabel((String) stou.mCbQUAL[4].getSelectedItem());
        ap_qual_5.setBounds(mX_AP,295,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_qual_5.setBounds(190,295,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_qual_5);
        mShow.add(result_ap_qual_5);

        JLabel ap_pos_1 = new JLabel("ตำแหน่งที่ต้องการสมัคร 1  : ");
        JLabel result_ap_pos_1 = new JLabel((String) stou.mCbPOS[0].getSelectedItem());
        ap_pos_1.setBounds(mX_AP,315,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_pos_1.setBounds(210,315,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_pos_1);
        mShow.add(result_ap_pos_1);

        JLabel ap_pos_2 = new JLabel("ตำแหน่งที่ต้องการสมัคร 2  : ");
        JLabel result_ap_pos_2 = new JLabel((String) stou.mCbPOS[1].getSelectedItem());
        ap_pos_2.setBounds(mX_AP,335,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_pos_2.setBounds(210,335,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_pos_2);
        mShow.add(result_ap_pos_2);

        JLabel ap_pos_3 = new JLabel("ตำแหน่งที่ต้องการสมัคร 3  : ");
        JLabel result_ap_pos_3 = new JLabel((String) stou.mCbPOS[2].getSelectedItem());
        ap_pos_3.setBounds(mX_AP,355,mWIDTH_LAB,mHEIGTH_LAB);
        result_ap_pos_3.setBounds(210,355,mWIDTH_LAB,mHEIGTH_LAB);
        mShow.add(ap_pos_3);
        mShow.add(result_ap_pos_3);

        JButton edit = new JButton("แก้ไข");
        edit.setBounds(mX_AP,380,70,mHEIGTH_LAB);
        mShow.add(edit);
        edit.addActionListener(e -> setVisible(false));

        int count = mShow.getComponentCount();
        for (int i = 0; i < count; i++) {
            mShow.getComponent(i).setFont(stou.mFont_3);
        }
        details.setFont(stou.mFont_1);

        add(mShow);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
