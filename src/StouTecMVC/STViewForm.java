package StouTecMVC;

import javax.swing.*;

public class STViewForm extends JFrame {
    FontStyle Font = new FontStyle();
    final int mWIDTH_LAB = 600;
    final int mWIDTH_TEXTF = 250;
    final int mHEIGTH_LAB_TEXTF = 20;

    JPanel mPanel = new JPanel();
    JLabel[] mLbMessage = new JLabel[5];
    JLabel[] mLbData = new JLabel[16];
    JTextField mTfAp_Id;
    JTextField mTfAp_Name;
    JTextField mTfAp_Address;
    JTextField mTfAp_Chw;
    JTextField mTfAp_Ed;
    JTextField mTfAp_Maj;

    String[] mQUAL_1 = { "เลือกความรู้ความสามารถ 1",
            "Wep_ASP", "C++", "Database Administrator,DB2", "Database Administrator,ORACLE", "Graphic Disign",
            "JAVA", "Management", "Network", "Secretarial work45 words/min", "Secretarial work65 words/min",
            "System Analyst, Level 1", "System Analyst, Level 2", "Visual Basic"};
    String[] mQUAL_2 = { "เลือกความรู้ความสามารถ 2",
            "Wep_ASP", "C++", "Database Administrator,DB2", "Database Administrator,ORACLE", "Graphic Disign",
            "JAVA", "Management", "Network", "Secretarial work45 words/min", "Secretarial work65 words/min",
            "System Analyst, Level 1", "System Analyst, Level 2", "Visual Basic"};
    String[] mQUAL_3 = { "เลือกความรู้ความสามารถ 3",
            "Wep_ASP", "C++", "Database Administrator,DB2", "Database Administrator,ORACLE", "Graphic Disign",
            "JAVA", "Management", "Network", "Secretarial work45 words/min", "Secretarial work65 words/min",
            "System Analyst, Level 1", "System Analyst, Level 2", "Visual Basic"};
    String[] mQUAL_4 = { "เลือกความรู้ความสามารถ 4",
            "Wep_ASP", "C++", "Database Administrator,DB2", "Database Administrator,ORACLE", "Graphic Disign",
            "JAVA", "Management", "Network", "Secretarial work45 words/min", "Secretarial work65 words/min",
            "System Analyst, Level 1", "System Analyst, Level 2", "Visual Basic"};
    String[] mQUAL_5 = { "เลือกความรู้ความสามารถ 5",
            "Wep_ASP", "C++", "Database Administrator,DB2", "Database Administrator,ORACLE", "Graphic Disign",
            "JAVA", "Management", "Network", "Secretarial work45 words/min", "Secretarial work65 words/min",
            "System Analyst, Level 1", "System Analyst, Level 2", "Visual Basic"};
    String[] mPOS_1 = { "เลือกตำแหน่งที่ต้องการสมัคร 1",
            "Tecnical Programmer", "Wep Developer", "General Manager", "ICT Specialist", "E-Business Analyst",
            "ICT Documenter", "Database Administrator", "PC Administrator", "Network Specialist", "ICT Manager"};
    String[] mPOS_2 = { "เลือกตำแหน่งที่ต้องการสมัคร 2",
            "Tecnical Programmer", "Wep Developer", "General Manager", "ICT Specialist", "E-Business Analyst",
            "ICT Documenter", "Database Administrator", "PC Administrator", "Network Specialist", "ICT Manager"};
    String[] mPOS_3 = { "เลือกตำแหน่งที่ต้องการสมัคร 3",
            "Tecnical Programmer", "Wep Developer", "General Manager", "ICT Specialist", "E-Business Analyst",
            "ICT Documenter", "Database Administrator", "PC Administrator", "Network Specialist", "ICT Manager"};

    JComboBox<String> mCbAp_Qual_1;
    JComboBox<String> mCbAp_Qual_2;
    JComboBox<String> mCbAp_Qual_3;
    JComboBox<String> mCbAp_Qual_4;
    JComboBox<String> mCbAp_Qual_5;
    JComboBox<String> mCbAp_Pos_1;
    JComboBox<String> mCbAp_Pos_2;
    JComboBox<String> mCbAp_Pos_3;
    String mSEX;
    JRadioButton mSEX_M = new JRadioButton("ชาย");
    JRadioButton mSEX_F = new JRadioButton("หญิง");
    ButtonGroup mGSEX = new ButtonGroup();
    JButton mOK = new JButton("ตกลง");

    STViewForm() {
        setTitle("STOU-TEC");
        setSize(800,680);
        setResizable(true);

        JLabel mLbStou = new JLabel("บริษัท STOU-TEC จำกัด");
        mLbStou.setFont(Font.mFont_1);

        mLbMessage[0] = new JLabel("แบบฟอร์มใบสมัครพนักงาน");
        mLbMessage[1] = new JLabel("ใบสมัครงานด้าน ICT นี้ ให้ผู้สมัครกรอกรายละเอียดต่อไปนี้เพื่อที่");
        mLbMessage[2] = new JLabel("บริษัท STOU-TEC จำกัด ทำการคัดเลือกตามความเหมาะสม");
        mLbMessage[3] = new JLabel("ความรู้ความสามารถหรือคุณสมบัติเฉพาะตำแหน่ง (QUAL_DESC) (ตอบได้ไม่เกิน 5 รายการ)");
        mLbMessage[4] = new JLabel("ตำแหน่งที่ต้องการสมัคร (POS_NAME) : (ตอบได้ไม่เกิน 3 ตำแหน่ง)");
        for (JLabel jLabel : mLbMessage) {
            jLabel.setFont(Font.mFont_2);
        }

        mLbData[0] = new JLabel("เลขประจำตัวของผู้สมัคร (AP_ID) : ");
        mLbData[1] = new JLabel("ชื่อ-นามสกุล (AP_NAME) : ");
        mLbData[2] = new JLabel("ที่อยู่ (AP_ADDRESS) : ");
        mLbData[3] = new JLabel("จังหวัด (AP_CHW) : ");
        mLbData[4] = new JLabel("เพศ (AP_SEX) : ");
        mLbData[5] = new JLabel("วุฒิการศึกษาชั้นสูงสุด (AP_ED) : ");
        mLbData[6] = new JLabel("(เช่น B.S, B.A, M.S, M.BA, M.A)");
        mLbData[7] = new JLabel("วิชาเอก (AP_MAJ) : ");
        mLbData[8] = new JLabel("ความรู้ความสามารถ 1");
        mLbData[9] = new JLabel("ความรู้ความสามารถ 2");
        mLbData[10] = new JLabel("ความรู้ความสามารถ 3");
        mLbData[11] = new JLabel("ความรู้ความสามารถ 4");
        mLbData[12] = new JLabel("ความรู้ความสามารถ 5");
        mLbData[13] = new JLabel("ตำแหน่งที่ต้องการสมัคร 1");
        mLbData[14] = new JLabel("ตำแหน่งที่ต้องการสมัคร 2");
        mLbData[15] = new JLabel("ตำแหน่งที่ต้องการสมัคร 3");
        for (JLabel mLbDatum : mLbData) {
            mLbDatum.setFont(Font.mFont_3);
        }

        mTfAp_Id = new JTextField();
        mTfAp_Name = new JTextField();
        mTfAp_Address = new JTextField();
        mTfAp_Chw = new JTextField();
        mTfAp_Ed = new JTextField();
        mTfAp_Maj = new JTextField();

        mCbAp_Qual_1 = new JComboBox<>(mQUAL_1);
        mCbAp_Qual_2 = new JComboBox<>(mQUAL_2);
        mCbAp_Qual_3 = new JComboBox<>(mQUAL_3);
        mCbAp_Qual_4 = new JComboBox<>(mQUAL_4);
        mCbAp_Qual_5 = new JComboBox<>(mQUAL_5);
        mCbAp_Qual_1.setFont(Font.mFont_3);
        mCbAp_Qual_2.setFont(Font.mFont_3);
        mCbAp_Qual_3.setFont(Font.mFont_3);
        mCbAp_Qual_4.setFont(Font.mFont_3);
        mCbAp_Qual_5.setFont(Font.mFont_3);

        mCbAp_Pos_1 = new JComboBox<>(mPOS_1);
        mCbAp_Pos_2 = new JComboBox<>(mPOS_2);
        mCbAp_Pos_3 = new JComboBox<>(mPOS_3);
        mCbAp_Pos_1.setFont(Font.mFont_3);
        mCbAp_Pos_2.setFont(Font.mFont_3);
        mCbAp_Pos_3.setFont(Font.mFont_3);

        mSEX_M.setFont(Font.mFont_3);
        mSEX_F.setFont(Font.mFont_3);
        mGSEX.add(mSEX_M);
        mGSEX.add(mSEX_F);

        mPanel.setLayout(null);
        mPanel.add(mLbStou);
        mLbStou.setBounds(300,5,200,30);

        mPanel.add(mLbMessage[0]);
        mLbMessage[0].setBounds(306,35,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbMessage[1]);
        mLbMessage[1].setBounds(200,60,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbMessage[2]);
        mLbMessage[2].setBounds(210,80,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[0]);
        mLbData[0].setBounds(50,107,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mTfAp_Id);
        mTfAp_Id.setBounds(260,107,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[1]);
        mLbData[1].setBounds(50,135,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mTfAp_Name);
        mTfAp_Name.setBounds(260,135,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[2]);
        mLbData[2].setBounds(50,163,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mTfAp_Address);
        mTfAp_Address.setBounds(260,163,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[3]);
        mLbData[3].setBounds(50,191,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mTfAp_Chw);
        mTfAp_Chw.setBounds(260,191,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[4]);
        mLbData[4].setBounds(50,219,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mSEX_M);
        mSEX_M.setBounds(255,219,50,mHEIGTH_LAB_TEXTF);
        mPanel.add(mSEX_F);
        mSEX_F.setBounds(310,219,60,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[5]);
        mLbData[5].setBounds(50,247,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mTfAp_Ed);
        mTfAp_Ed.setBounds(260,247,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[6]);
        mLbData[6].setBounds(50,275,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[7]);
        mLbData[7].setBounds(50,303,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mTfAp_Maj);
        mTfAp_Maj.setBounds(260,303,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbMessage[3]);
        mLbMessage[3].setBounds(50,331,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[8]);
        mLbData[8].setBounds(50,359,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mCbAp_Qual_1);
        mCbAp_Qual_1.setBounds(260,359,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[9]);
        mLbData[9].setBounds(50,387,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mCbAp_Qual_2);
        mCbAp_Qual_2.setBounds(260,387,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[10]);
        mLbData[10].setBounds(50,415,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mCbAp_Qual_3);
        mCbAp_Qual_3.setBounds(260,415,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[11]);
        mLbData[11].setBounds(50,443,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mCbAp_Qual_4);
        mCbAp_Qual_4.setBounds(260,443,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[12]);
        mLbData[12].setBounds(50,471,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mCbAp_Qual_5);
        mCbAp_Qual_5.setBounds(260,471,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbMessage[4]);
        mLbMessage[4].setBounds(50,499,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[13]);
        mLbData[13].setBounds(50,527,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mCbAp_Pos_1);
        mCbAp_Pos_1.setBounds(260,527,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[14]);
        mLbData[14].setBounds(50,555,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mCbAp_Pos_2);
        mCbAp_Pos_2.setBounds(260,555,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mLbData[15]);
        mLbData[15].setBounds(50,583,mWIDTH_LAB,mHEIGTH_LAB_TEXTF);
        mPanel.add(mCbAp_Pos_3);
        mCbAp_Pos_3.setBounds(260,583,mWIDTH_TEXTF,mHEIGTH_LAB_TEXTF);

        mPanel.add(mOK);
        mOK.setFont(Font.mFont_3);
        mOK.setBounds(340,611,70,20);

        add(mPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getAp_Id() {
        return mTfAp_Id.getText();
    }

    public String getAp_Name() {
        return mTfAp_Name.getText();
    }

    public String getAp_Address() {
        return mTfAp_Address.getText();
    }

    public String getAp_Chw() {
        return mTfAp_Chw.getText();
    }

    public String getAp_Ed() {
        return mTfAp_Ed.getText();
    }

    public String getAp_Maj() {
        return mTfAp_Maj.getText();
    }

    public String getQual_Desc_1() {
        return (String) mCbAp_Qual_1.getSelectedItem();
    }

    public String getQual_Desc_2() {
        return (String) mCbAp_Qual_2.getSelectedItem();
    }

    public String getQual_Desc_3() {
        return (String) mCbAp_Qual_3.getSelectedItem();
    }

    public String getQual_Desc_4() {
        return (String) mCbAp_Qual_4.getSelectedItem();
    }

    public String getQual_Desc_5() {
        return (String) mCbAp_Qual_5.getSelectedItem();
    }

    public String getPos_Name_1() {
        return (String) mCbAp_Pos_1.getSelectedItem();
    }

    public String getPos_Name_2() {
        return (String) mCbAp_Pos_2.getSelectedItem();
    }

    public String getPos_Name_3() {
        return (String) mCbAp_Pos_3.getSelectedItem();
    }

    public String getAp_Sex() {
        return mSEX;
    }
}
