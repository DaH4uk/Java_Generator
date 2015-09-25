package sample;

import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.time.LocalDate;



public class Controller
{

    public static Stage STAGE;

    public CheckBox ctvShowChk;
    public RadioButton ctvShowBtnYes;
    public RadioButton ctvShowBtnNo;
    public DatePicker testDatePicker;
    public CheckBox soSlovClienta;
    public CheckBox podklychenieCabelya;
    public CheckBox udobnoeVremya;
    public ComboBox timeSz;
    public DatePicker dateCZ;
    public Label textKT;
    public TextField contactPhone;
    public CheckBox clientConflict;
    public CheckBox fromPPd;
    public CheckBox szWithoutGraffic;
    public CheckBox onHold;
    public CheckBox garantService;
    public javafx.scene.control.Button createReqest;
    public TextArea textReqest;
    public Tab tabInternet;
    public Tab tabTV;
    public Tab tabPhone;
    public Tab tabErrors651;
    public Tab tabBreaks;
    public Tab tabSpeed;
    public Tab tabCktv;
    public Tab tabKTV;
    public Tab noSession;
    public Tab tabIncOut;
    public Tab tabQalityOfComm;
    public Tab tabIVR;



    public void initializeTestexe()
    {
        testDatePicker.setValue(LocalDate.now());
        soSlovClienta.setVisible(false);
        podklychenieCabelya.setVisible(false);
        udobnoeVremya.setVisible(false);
        timeSz.setVisible(false);
        dateCZ.setVisible(false);
        textKT.setVisible(false);
        contactPhone.setVisible(false);
        clientConflict.setVisible(false);
        fromPPd.setVisible(false);
        szWithoutGraffic.setVisible(false);
        onHold.setVisible(false);
        garantService.setVisible(false);
        createReqest.setVisible(false);
        textReqest.setVisible(false);
    }

    public void initializeDiagnostic ()
    {
        try {
            soSlovClienta.setVisible(true);
            podklychenieCabelya.setVisible(true);
            udobnoeVremya.setVisible(true);
            timeSz.setVisible(true);
            dateCZ.setVisible(true);
            textKT.setVisible(true);
            contactPhone.setVisible(true);
            clientConflict.setVisible(true);
            fromPPd.setVisible(true);
            szWithoutGraffic.setVisible(true);
            onHold.setVisible(true);
            garantService.setVisible(true);
            createReqest.setVisible(true);
            textReqest.setVisible(true);
        } catch (Exception e)
        {

        }
    }


    public void setCtvShowChek()
    {
        if (ctvShowChk.isSelected() == true)
        {
            ctvShowBtnYes.setDisable(false);
            ctvShowBtnNo.setDisable(false);
        } else {
            ctvShowBtnYes.setDisable(true);
            ctvShowBtnNo.setDisable(true);
        }

    }


}
