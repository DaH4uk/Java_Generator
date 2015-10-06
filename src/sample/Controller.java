package sample;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;


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
    public CheckBox chkPortNoReaction;
    public CheckBox chkPortMode;
    public CheckBox chkRouterFaulty;
    public CheckBox chkRouterReplacement;
    public CheckBox chkDisconnectsOnGN;
    public CheckBox chkRouterFaultys;
    public CheckBox chkZamena;
    public ComboBox timeSz;
    public ComboBox comboPortMode;
    public ComboBox comboReason;
    public ComboBox comboSpeedIperfCity;
    public DatePicker dateCZ;
    public Label textKT;
    public TextField contactPhone;
    public CheckBox clientConflict;
    public CheckBox fromPPd;
    public CheckBox szWithoutGraffic;
    public CheckBox chkNeighborsMore3Disc;
    public CheckBox chkAccumErros;
    public CheckBox chkPortFlopCheck;
    public CheckBox chkSrotmControl;
    public CheckBox chkStp;
    public CheckBox onHold;
    public CheckBox garantService;
    public CheckBox chkErrorsOnPortSpeedUp;
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
    public Button copyBtn;
    public CheckBox chkBreaks;
    public CheckBox chkBreaks1Pair;
    public CheckBox chkBreaks2Pair;
    public CheckBox chkPortRestarted;
    public TextField txtfieldBreaks1Pair;
    public TextField txtfieldBreaks2Pair;
    public TextField txtDisconnectsOnGN;
    public TextField txtErrorsOnPortSpeed;
    public Label txtBreaks1Pair;
    public Label txtBreaks2Pair;
    public Label txtMacBelongs;
    public Label txtMacVisiable;
    public Label txtMacOfNeighbors;
    public RadioButton radioOperStatUp;
    public RadioButton radioOperStatDown;
    public RadioButton radioMacVisiableYes;
    public RadioButton radioMacVisiableNo;
    public RadioButton radioMacBelongsYes;
    public RadioButton radioMacBelongsNo;
    public RadioButton radioCommutIsControlledYes;
    public RadioButton radioCommutIsControlledNo;
    public RadioButton radioMacOfNeighborsYes;
    public RadioButton radioMacOfNeighborsNo;

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
        copyBtn.setVisible(false);
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
            copyBtn.setVisible(true);
            textReqest.setWrapText(true);
        } catch (Exception e)
        {

        }
    }

    //Logic for INTERNET
    //-----------------------------------------------------------------------------------------------
    //Tab ERRORS:

    public RadioButton radioNetCableNotConnected;
    public RadioButton radioRemotePCNotAnswer;
    public CheckBox chkMagistralPortNo;
    public CheckBox chkNoSessionsOfNeighbors;
    public CheckBox chkProblemPort;


    public void operStatClicled() {
        if (radioOperStatUp.isSelected()) {
            radioMacVisiableYes.setDisable(false);
            radioMacVisiableNo.setDisable(false);
            txtMacVisiable.setDisable(false);
        } else {
            radioMacVisiableYes.setDisable(true);
            radioMacVisiableNo.setDisable(true);
            txtMacVisiable.setDisable(true);
            txtMacBelongs.setDisable(true);
            radioMacBelongsNo.setDisable(true);
            radioMacBelongsYes.setDisable(true);
            radioMacBelongsNo.setSelected(true);
            chkNoSessionsOfNeighbors.setVisible(false);
            chkNoSessionsOfNeighbors.setSelected(false);
            chkMagistralPortNo.setVisible(false);
            chkMagistralPortNo.setSelected(false);
        }

        if (radioCommutIsControlledNo.isSelected() && radioOperStatUp.isSelected()) {
            radioMacOfNeighborsNo.setDisable(false);
            radioMacOfNeighborsYes.setDisable(false);
            txtMacOfNeighbors.setDisable(false);

        } else {
            radioMacOfNeighborsNo.setDisable(true);
            radioMacOfNeighborsYes.setDisable(true);
            txtMacOfNeighbors.setDisable(true);

        }

    }

    public void macAddrVisibleClicked() {
        if (radioOperStatUp.isSelected() && radioMacVisiableYes.isSelected()) {
            txtMacBelongs.setDisable(false);
            radioMacBelongsNo.setDisable(false);
            radioMacBelongsYes.setDisable(false);
        } else {
            txtMacBelongs.setDisable(true);
            radioMacBelongsNo.setDisable(true);
            radioMacBelongsYes.setDisable(true);
            chkNoSessionsOfNeighbors.setVisible(false);
            chkNoSessionsOfNeighbors.setSelected(false);
            chkMagistralPortNo.setVisible(false);
            chkMagistralPortNo.setSelected(false);
        }
    }

    public void breaksClicked() {
        if (chkBreaks.isSelected() == true) {
            chkBreaks1Pair.setDisable(false);
            chkBreaks2Pair.setDisable(false);
            txtfieldBreaks1Pair.setDisable(false);
            txtfieldBreaks2Pair.setDisable(false);
            txtBreaks1Pair.setDisable(false);
            txtBreaks2Pair.setDisable(false);
        } else {
            chkBreaks1Pair.setDisable(true);
            chkBreaks2Pair.setDisable(true);
            txtfieldBreaks1Pair.setDisable(true);
            txtfieldBreaks2Pair.setDisable(true);
            txtBreaks1Pair.setDisable(true);
            txtBreaks2Pair.setDisable(true);
            chkBreaks1Pair.setSelected(false);
            chkBreaks2Pair.setSelected(false);
            txtfieldBreaks1Pair.setText("");
            txtfieldBreaks2Pair.setText("");
        }
    }

    public void CommutIsControlledClicked() {
        if (radioCommutIsControlledNo.isSelected() && radioOperStatUp.isSelected()) {
            chkPortRestarted.setDisable(true);
            chkPortRestarted.setSelected(false);
            radioMacOfNeighborsNo.setDisable(false);
            radioMacOfNeighborsYes.setDisable(false);
            txtMacOfNeighbors.setDisable(false);

        } else {
            chkPortRestarted.setDisable(false);
            chkPortRestarted.setSelected(false);
            radioMacOfNeighborsNo.setDisable(true);
            radioMacOfNeighborsYes.setDisable(true);
            txtMacOfNeighbors.setDisable(true);

        }
        if (radioCommutIsControlledNo.isSelected()) {
            chkPortRestarted.setDisable(true);
        } else {
            chkPortRestarted.setDisable(false);
        }
    }

    public void MacBelongsClientClicked() {
        if (radioMacBelongsYes.isSelected()) {
            chkNoSessionsOfNeighbors.setVisible(true);
        } else {
            chkNoSessionsOfNeighbors.setVisible(false);
            chkNoSessionsOfNeighbors.setSelected(false);
            chkMagistralPortNo.setVisible(false);
            chkMagistralPortNo.setSelected(false);
        }
    }

    public void NoSessionsOfNeighborsClicked() {
        if (chkNoSessionsOfNeighbors.isSelected()) {
            chkMagistralPortNo.setVisible(true);
        } else {
            chkMagistralPortNo.setVisible(false);
            chkMagistralPortNo.setSelected(false);
        }
    }

    //-----------------------------------------------------------------------------------------------
    //Tab Speed:
    public CheckBox chkExternalPing;
    public CheckBox chkDNSPing;
    public CheckBox chkSwitchPing;
    public CheckBox chkSpeedST;
    public CheckBox chkSpeedIperf;
    public CheckBox chkDiffWifi;
    public CheckBox chkRouterFaultyses;
    public CheckBox chkZamenas;
    public ComboBox comboDiffWifi;
    public TextField txtfieldExternalPingSize;
    public TextField txtfieldExternalPingSend;
    public TextField txtfieldExternalPingReceived;
    public TextField txtfieldExternalPingAddr;
    public TextField txtfieldDNSSize;
    public TextField txtfieldDNSSend;
    public TextField txtfieldDNSRecived;
    public TextField txtfieldSwitchSize;
    public TextField txtfieldSwitchSend;
    public TextField txtfieldSwitchRecived;
    public TextField txtfieldSwitchIP;
    public TextField txtfieldSwitchPort;
    public TextField txtfieldSpeedSTDownload;
    public TextField txtfieldSpeedSTUpload;
    public TextField txtfieldSpeedSTMustBe;
    public TextField txtfieldSpeedIperfSpeed;

    public void RouterFaultClicked() {
        if (chkRouterFaultyses.isSelected()) {
            chkDiffWifi.setDisable(false);
            chkZamenas.setDisable(false);
            comboDiffWifi.setDisable(false);
        } else {
            chkDiffWifi.setDisable(true);
            chkZamenas.setDisable(true);
            comboDiffWifi.setDisable(true);
            chkDiffWifi.setSelected(false);
            chkZamenas.setSelected(false);
        }
    }


    public void ExternalPingClicked() {
        if (chkExternalPing.isSelected()) {
            txtfieldExternalPingSize.setDisable(false);
            txtfieldExternalPingSend.setDisable(false);
            txtfieldExternalPingReceived.setDisable(false);
            txtfieldExternalPingAddr.setDisable(false);
        } else {
            txtfieldExternalPingSize.setDisable(true);
            txtfieldExternalPingSend.setDisable(true);
            txtfieldExternalPingReceived.setDisable(true);
            txtfieldExternalPingAddr.setDisable(true);
        }
    }

    public void DNSPingClicked() {
        if (chkDNSPing.isSelected()) {
            txtfieldDNSSize.setDisable(false);
            txtfieldDNSSend.setDisable(false);
            txtfieldDNSRecived.setDisable(false);
        } else {
            txtfieldDNSSize.setDisable(true);
            txtfieldDNSSend.setDisable(true);
            txtfieldDNSRecived.setDisable(true);
        }
    }

    public void SwitchPingClicked() {
        if (chkSwitchPing.isSelected()) {
            txtfieldSwitchSize.setDisable(false);
            txtfieldSwitchSend.setDisable(false);
            txtfieldSwitchRecived.setDisable(false);
            txtfieldSwitchIP.setDisable(false);
            txtfieldSwitchPort.setDisable(false);
        } else {
            txtfieldSwitchSize.setDisable(true);
            txtfieldSwitchSend.setDisable(true);
            txtfieldSwitchRecived.setDisable(true);
            txtfieldSwitchIP.setDisable(true);
            txtfieldSwitchPort.setDisable(true);
        }
    }

    public void SpeedSTClicked() {
        if (chkSpeedST.isSelected()) {
            txtfieldSpeedSTDownload.setDisable(false);
            txtfieldSpeedSTUpload.setDisable(false);
            txtfieldSpeedSTMustBe.setDisable(false);
        } else {
            txtfieldSpeedSTDownload.setDisable(true);
            txtfieldSpeedSTUpload.setDisable(true);
            txtfieldSpeedSTMustBe.setDisable(true);
        }
    }

    public void SpeedIperfClicked() {
        if (chkSpeedIperf.isSelected()) {
            txtfieldSpeedIperfSpeed.setDisable(false);
            comboSpeedIperfCity.setDisable(false);
        } else {
            txtfieldSpeedIperfSpeed.setDisable(true);
            comboSpeedIperfCity.setDisable(true);
        }
    }


    //-----------------------------------------------------------------------------------------------


    //Logic for DOM.RU TV
    //-----------------------------------------------------------------------------------------------
    //Tab CKTV:
    public RadioButton radioCKTVDecoder;
    public RadioButton radioCamModule;
    public CheckBox chkDecoderRestarted;
    public CheckBox chkDecoderRebootet;
    public CheckBox chkCamInsered;
    public CheckBox chkCamChannelsResearched;

    public CheckBox chkSpillageImage;
    public CheckBox chkFadingImage;
    public CheckBox chkBroadcastingInterruption;
    public CheckBox chkNoBrodcastOnAllChannels;
    public CheckBox chkNoBrodcastOnCoddedChannels;
    public CheckBox chkNoBrodcastOnSomeChannels;
    public CheckBox chkDontOpenPortal;
    public CheckBox chkNoSound;

    public void WhatHappeningClicked() {
        if (chkSpillageImage.isSelected() || chkFadingImage.isSelected() || chkBroadcastingInterruption.isSelected()
                || chkNoBrodcastOnCoddedChannels.isSelected() || chkNoBrodcastOnSomeChannels.isSelected() || chkNoSound.isSelected()) {
            chkNoBrodcastOnAllChannels.setSelected(false);
        }
    }

    public void NoBrodcastOnAllChannelsClicked() {
        if (chkNoBrodcastOnAllChannels.isSelected()) {
            chkSpillageImage.setSelected(false);
            chkFadingImage.setSelected(false);
            chkBroadcastingInterruption.setSelected(false);
            chkNoBrodcastOnCoddedChannels.setSelected(false);
            chkNoBrodcastOnSomeChannels.setSelected(false);
            chkNoSound.setSelected(false);
        }

    }

    public void CktvDecoderOrCamClicked()
    {
        if (radioCKTVDecoder.isSelected())
        {
            chkDecoderRestarted.setDisable(false);
            chkDecoderRebootet.setDisable(false);
            chkCamInsered.setDisable(true);
            chkCamChannelsResearched.setDisable(true);
        } else {
            chkDecoderRestarted.setDisable(true);
            chkDecoderRebootet.setDisable(true);
            chkCamInsered.setDisable(false);
            chkCamChannelsResearched.setDisable(false);
        }
    }

    public void CktvCtvChekClicked() {
        if (ctvShowChk.isSelected() == true) {
            ctvShowBtnYes.setDisable(false);
            ctvShowBtnNo.setDisable(false);
        } else {
            ctvShowBtnYes.setDisable(true);
            ctvShowBtnNo.setDisable(true);
        }
    }

    //-----------------------------------------------------------------------------------------------

    //Tab KTV:
    public CheckBox ktvQalityOfSignal;
    public CheckBox ktvInterferencel;
    public CheckBox ktvNoSound;
    public CheckBox ktvBlackAndWhiteImage;
    public CheckBox ktvNoSignal;
    public RadioButton ktvNoSignalAll;
    public RadioButton ktvNoSignalOnSome;


    public void KtvQalityOfSignalClicked() {
        if (ktvQalityOfSignal.isSelected()) {
            ktvInterferencel.setDisable(false);
            ktvNoSound.setDisable(false);
            ktvBlackAndWhiteImage.setDisable(false);
        } else {
            ktvInterferencel.setDisable(true);
            ktvNoSound.setDisable(true);
            ktvBlackAndWhiteImage.setDisable(true);
        }
    }

    public void KtvNoSignalClicked() {
        if (ktvNoSignal.isSelected()) {
            ktvNoSignalAll.setDisable(false);
            ktvNoSignalOnSome.setDisable(false);
        } else {
            ktvNoSignalAll.setDisable(true);
            ktvNoSignalOnSome.setDisable(true);
        }
    }
    //-----------------------------------------------------------------------------------------------

    //Logic for Phone
    //-----------------------------------------------------------------------------------------------
    //Tab NoSession:
    public RadioButton radioPhoneOperStatDown;
    public RadioButton radioPhoneOperStatUp;
    public RadioButton radioPhoneMacVisiableNo;
    public RadioButton radioPhoneMacVisiableYes;

    public void PhoneNoSessionOperStatClicked() {
        if (radioPhoneOperStatDown.isSelected()) {
            radioPhoneMacVisiableNo.setDisable(true);
            radioPhoneMacVisiableYes.setDisable(true);
        } else {
            radioPhoneMacVisiableNo.setDisable(false);
            radioPhoneMacVisiableYes.setDisable(false);
        }
    }

    //-----------------------------------------------------------------------------------------------

    //-----------------------------------------------------------------------------------------------
    //Tab NoSession:
    public CheckBox chkNoIncConnection;
    public CheckBox chkNoOutConnection;
    public CheckBox chkSipRegistration;
    public CheckBox chkCallFromOffice;
    public CheckBox chkWithSpecificNumber;
    public CheckBox chkOtherTA;
    public RadioButton radioNumberMatch;
    public RadioButton radioNumberNoMatch;
    public RadioButton radioBeepInHandsetYes;
    public RadioButton radioBeepInHandsetNo;
    public RadioButton radioSipRegistrationYes;
    public RadioButton radioSipRegistrationNo;
    public RadioButton radioCallFromOfficeNo;
    public RadioButton radioCallFromOfficeYes;
    public RadioButton radioOtherTAYes;
    public RadioButton radioOtherTANo;
    public TextField txtfieldWithSpecificNumber;

    public void NoIncConnectionClicked() {
        if (chkNoIncConnection.isSelected() && !chkNoOutConnection.isSelected()) {
            radioNumberMatch.setDisable(false);
            radioNumberNoMatch.setDisable(false);
            radioBeepInHandsetYes.setDisable(true);
            radioBeepInHandsetNo.setDisable(true);
        } else if (chkNoIncConnection.isSelected() && chkNoOutConnection.isSelected()) {
            radioNumberMatch.setDisable(true);
            radioNumberNoMatch.setDisable(true);
            radioBeepInHandsetYes.setDisable(false);
            radioBeepInHandsetNo.setDisable(false);
        } else {
            radioNumberMatch.setDisable(true);
            radioNumberNoMatch.setDisable(true);
            radioBeepInHandsetYes.setDisable(true);
            radioBeepInHandsetNo.setDisable(true);
        }
    }

    public void SipRegistrationClicked() {
        if (chkSipRegistration.isSelected()) {
            radioSipRegistrationYes.setDisable(false);
            radioSipRegistrationNo.setDisable(false);
        } else {
            radioSipRegistrationYes.setDisable(true);
            radioSipRegistrationNo.setDisable(true);
        }
    }

    public void CallFromOfficeClicked() {
        if (chkCallFromOffice.isSelected()) {
            radioCallFromOfficeYes.setDisable(false);
            radioCallFromOfficeNo.setDisable(false);
        } else {
            radioCallFromOfficeYes.setDisable(true);
            radioCallFromOfficeNo.setDisable(true);
        }
    }

    public void WithSpecificNumberClicked() {
        if (chkWithSpecificNumber.isSelected()) {
            txtfieldWithSpecificNumber.setDisable(false);
        } else {
            txtfieldWithSpecificNumber.setDisable(true);

        }
    }

    public void OtherTAClicked() {
        if (chkOtherTA.isSelected()) {
            radioOtherTAYes.setDisable(false);
            radioOtherTANo.setDisable(false);
        } else {
            radioOtherTAYes.setDisable(true);
            radioOtherTANo.setDisable(true);
        }
    }

    //-----------------------------------------------------------------------------------------------

    //-----------------------------------------------------------------------------------------------
    //Tab ConnectionQality:
    public CheckBox chkLossToSwitch;
    public CheckBox chkErrorsForPort;
    public CheckBox chkLossToGateway;
    public CheckBox chkSignalAmplification;
    public TextField txtfieldLossToSwitch;
    public TextField txtfieldErrorsForPort;
    public TextField txtfieldLossToGateway;
    public RadioButton radioSignalAmplificationUp;
    public RadioButton radioSignalAmplificationDown;

    public void LossToSwitchClicked() {
        if (chkLossToSwitch.isSelected()) {
            txtfieldLossToSwitch.setDisable(false);
        } else {
            txtfieldLossToSwitch.setDisable(true);
        }
    }

    public void ErrorsForPortClicked() {
        if (chkErrorsForPort.isSelected()) {
            txtfieldErrorsForPort.setDisable(false);
        } else {
            txtfieldErrorsForPort.setDisable(true);
        }
    }

    public void LossToGatewayClicked() {
        if (chkLossToGateway.isSelected()) {
            txtfieldLossToGateway.setDisable(false);
        } else {
            txtfieldLossToGateway.setDisable(true);
        }
    }

    public void SignalAmplificationClicked() {
        if (chkSignalAmplification.isSelected()) {
            radioSignalAmplificationUp.setDisable(false);
            radioSignalAmplificationDown.setDisable(false);
        } else {
            radioSignalAmplificationUp.setDisable(true);
            radioSignalAmplificationDown.setDisable(true);
        }
    }

    //-----------------------------------------------------------------------------------------------
    //Tab IVR,AON...:
    public CheckBox chkAon;
    public CheckBox chkIVR;
    public RadioButton radioAonNotWork;
    public RadioButton radioAonIncorrectWork;
    public RadioButton radioThrough7;
    public RadioButton radioThrough7and8;
    public RadioButton radioDialingLandlineNumber;
    public Label lableSimplesOfNumber;
    public Label lableDetectedNumber;
    public Label labelFormatOfNumber;
    public Label labelNumberSimpleses;
    public TextField txtfieldSimplesOfNumber;
    public TextField txtfieldDetectedNumber;
    public TextField txtfieldNumberSimpleses;

    public void AonClicked() {
        if (chkAon.isSelected()) {
            radioAonNotWork.setDisable(false);
            radioAonIncorrectWork.setDisable(false);
            lableSimplesOfNumber.setDisable(false);
            lableDetectedNumber.setDisable(false);
            txtfieldSimplesOfNumber.setDisable(false);
            txtfieldDetectedNumber.setDisable(false);
        } else {
            radioAonNotWork.setDisable(true);
            radioAonIncorrectWork.setDisable(true);
            lableSimplesOfNumber.setDisable(true);
            lableDetectedNumber.setDisable(true);
            txtfieldSimplesOfNumber.setDisable(true);
            txtfieldDetectedNumber.setDisable(true);
        }
    }

    public void IVRClicked() {
        if (chkIVR.isSelected()) {
            labelFormatOfNumber.setDisable(false);
            labelNumberSimpleses.setDisable(false);
            radioThrough7.setDisable(false);
            radioThrough7and8.setDisable(false);
            radioDialingLandlineNumber.setDisable(false);
            txtfieldNumberSimpleses.setDisable(false);
        } else {
            labelFormatOfNumber.setDisable(true);
            labelNumberSimpleses.setDisable(true);
            radioThrough7.setDisable(true);
            radioThrough7and8.setDisable(true);
            radioDialingLandlineNumber.setDisable(true);
            txtfieldNumberSimpleses.setDisable(true);
        }
    }
    //-----------------------------------------------------------------------------------------------

    //-----------------------------------------------------------------------------------------------
    //Create Button:

    public void CreateButton() {
        String reqest = "";

        if (tabInternet.isSelected() || tabTV.isSelected() || tabPhone.isSelected()) {
            try {
            if (szWithoutGraffic.isSelected()) {
                reqest = reqest + "ВЫСОКИЙ ПРИОРИТЕТ! ";
                if (udobnoeVremya.isSelected()) {
                    reqest = reqest + "Клиенту удобно принять техника " + dateCZ.getValue().getDayOfMonth() + "." + dateCZ.getValue().getMonthValue()
                            + "." + dateCZ.getValue().getYear() + " " + timeSz.getValue() + ". ";
                } else {
                    reqest = reqest + "Требуется СЗ вне графика на " + dateCZ.getValue().getDayOfMonth() + "." + dateCZ.getValue().getMonthValue()
                            + "." + dateCZ.getValue().getYear() + " " + timeSz.getValue() + ". ";
                }
            }
            } catch (Exception e) {
                Alert alert4 = new Alert(Alert.AlertType.INFORMATION);
                alert4.setTitle("Ошибка");
                alert4.setHeaderText(null);
                alert4.setContentText("Пожалуйста выберите дату!");
                alert4.showAndWait();
            }
            if (fromPPd.isSelected()) {
                reqest = reqest + "От ППД. ";
            }
            if (onHold.isSelected()) {
                reqest = reqest + "Удержание. ";
            }
            if (garantService.isSelected()) {
                reqest = reqest + "Гарантийное обслуживание. ";
            }
        }


        if (tabInternet.isSelected()) {
            //logic for create requests on the internet tab:
            if (chkProblemPort.isSelected()) {
                reqest = reqest + "Клиент попал в отчет по проблемным портам. ";
            }
            if (tabErrors651.isSelected()) {
                //logic for create requests on the internet and errors tab:
                if (chkRouterFaulty.isSelected()) {
                    reqest = reqest + "Подозрение на неисправность роутера. ";
                } else {
                    if (radioNetCableNotConnected.isSelected()) {
                        reqest = reqest + "Сетевой кабель не подключен. ";
                    } else {
                        reqest = reqest + "Удалённый компьютер не отвечает. ";
                    }
                }

                if (radioCommutIsControlledYes.isSelected()) {
                    reqest = reqest + "Подключен к упр. коммутатору. ";
                } else {
                    reqest = reqest + "Подключен к неупр. коммутатору. ";
                }
                if (radioOperStatDown.isSelected()) {
                    reqest = reqest + "По EQM Oper status DOWN. Mac-адрес не виден. ";
                } else {
                    reqest = reqest + "По EQM Oper status UP. ";
                    if (radioMacVisiableNo.isSelected()) {
                        reqest = reqest + "Mac-адрес не виден. ";
                    } else {
                        if (radioMacBelongsNo.isSelected()) {
                            reqest = reqest + "За портом Mac-адрес не клиента. ";
                        }
                        if (radioCommutIsControlledNo.isSelected() && radioMacOfNeighborsNo.isSelected()) {
                            reqest = reqest + "Mac-адреса других клиентов не видны. ";
                        }
                        if (radioCommutIsControlledNo.isSelected() && radioMacOfNeighborsYes.isSelected()) {
                            reqest = reqest + "Mac-адреса других клиентов видны. ";
                        }
                    }
                }

                if (radioOperStatDown.isSelected() && chkBreaks.isSelected()) {
                    reqest = reqest + "Зафиксирован обрыв ";
                    if (chkBreaks1Pair.isSelected()) {
                        reqest = reqest + "1 пары на " + txtfieldBreaks1Pair.getText() + " метре. ";
                    }
                    if (chkBreaks2Pair.isSelected()) {
                        reqest = reqest + "2 пары на " + txtfieldBreaks1Pair.getText() + " метре. ";
                    }
                }
                if (chkPortNoReaction.isSelected()) {
                    reqest = reqest + "Порт не реагирует на отключение кабеля. ";
                }
                if (chkPortRestarted.isSelected()) {
                    reqest = reqest + "Порт перезапускали. ";
                }
                if (chkPortMode.isSelected()) {
                    reqest = reqest + "Порт работает в режиме " + comboPortMode.getValue() +
                            " В параметрах драйвера Lan указывали 100 Mb/Full-Duplex, ситуация не изменилась. ";
                }
                if (chkRouterFaulty.isSelected() && chkRouterReplacement.isSelected()) {
                    reqest = reqest + "Напрямую всё в норме. Роутер перезагружали, сбрасывали, перенастраивали. Требуется проверить роутер на работоспособность и при необходимости заменить. ";
                } else if (chkRouterFaulty.isSelected()) {
                    reqest = reqest + "Напрямую всё в норме. Роутер перезагружали, сбрасывали, перенастраивали. Требуется проверить роутер на работоспособность. ";
                }

                //---------------------------------------------------------------------------------------------------------------------------------------------
            } else if (tabBreaks.isSelected()) {


                //LOGIC for BREAKS
                //----------------------------------------------------------------------------------------------------------------------------------------------
                if (chkDisconnectsOnGN.isSelected()) {
                    if (txtDisconnectsOnGN.getText().equals("")) {
                        if (chkRouterFaultys.isSelected()) {
                            reqest = reqest + "Подозрение на неисправность роутера. Через роутер: ";
                        }
                    } else {
                        if (chkRouterFaultys.isSelected()) {
                            reqest = reqest + "Подозрение на неисправность комбо устр-ва. Через комбо: ";
                        }
                        reqest = reqest + "ГН: " + txtDisconnectsOnGN.getText() + ". ";
                    }
                } else {
                    if (chkRouterFaultys.isSelected()) {
                        reqest = reqest + "Подозрение на неисправность роутера. Через роутер: ";
                    }
                }
                reqest = reqest + "Частые разрывы соединения по причине " + comboReason.getValue() + ". ";
                if ((comboReason.getValue().equals("Lost-Carrier ") || comboReason.getValue().equals("Lost-Carrier") || comboReason.getValue().equals("Lost-Service")
                        || comboReason.getValue().equals("Port-Error") || comboReason.getValue().equals("NAS-Error") || comboReason.getValue().equals("NAS-Reboot")
                        || comboReason.getValue().equals("NAS-Request")) && !chkNeighborsMore3Disc.isSelected() && !chkAccumErros.isSelected()
                        && !chkPortFlopCheck.isSelected() && !chkSrotmControl.isSelected() && !chkStp.isSelected()) {
                    reqest = reqest + "Ошибок за портом, падений порта нет. В логах Storm Control и STP пусто. ";
                }
                if (chkNeighborsMore3Disc.isSelected()) {
                    reqest = reqest + "У соседей аналогичные разрывы в это же время. ";
                }
                if (chkAccumErros.isSelected()) {
                    reqest = reqest + "Копятся ошибки за портом. ";
                }
                if (chkPortFlopCheck.isSelected()) {
                    reqest = reqest + "Порт периодически падает. ";
                }
                if (chkSrotmControl.isSelected()) {
                    reqest = reqest + "В логах Storm Control фиксируется сетевой шторм. ";
                }
                if (chkStp.isSelected()) {
                    reqest = reqest + "В логах STP фигурируют записи new root selected. ";
                }
                if (chkDisconnectsOnGN.isSelected() && !txtDisconnectsOnGN.getText().equals("")) {
                    if (chkRouterFaultys.isSelected() && chkZamena.isSelected()) {
                        reqest = reqest + "Напрямую всё в норме. Комбо перезагружали, сбрасывали, перенастраивали. Требуется проверить комбо на работоспособность и при необходимости заменить. ";
                    } else if (chkRouterFaultys.isSelected()) {
                        reqest = reqest + "Напрямую всё в норме. Комбо перезагружали, сбрасывали, перенастраивали. Требуется проверить комбо на работоспособность. ";
                    }
                } else {
                    if (chkRouterFaultys.isSelected() && chkZamena.isSelected()) {
                        reqest = reqest + "Напрямую всё в норме. Роутер перезагружали, сбрасывали, перенастраивали. Требуется проверить роутер на работоспособность и при необходимости заменить. ";
                    } else if (chkRouterFaultys.isSelected()) {
                        reqest = reqest + "Напрямую всё в норме. Роутер перезагружали, сбрасывали, перенастраивали. Требуется проверить роутер на работоспособность. ";
                    }
                }

                //---------------------------------------------------------------------------------------------------------------------------------------------
            } else if (tabSpeed.isSelected()) {
                //LOGIC for Internet speed:
                //----------------------------------------------------------------------------------------------------------------------------------------------
                if (chkRouterFaultyses.isSelected()) {
                    reqest = reqest + "Подозрение на неисправность роутера. ";
                    if (chkDiffWifi.isSelected()) {
                        reqest = reqest + "Через роутер по wi-fi: " + comboDiffWifi.getValue() + ". ";
                    } else {
                        reqest = reqest + "Через роутер по патч-корду: ";
                    }
                }

                reqest = reqest + "Низкая скорость. ";

                if (chkSpeedST.isSelected()) {
                    reqest = reqest + "По ST: Download: " + txtfieldSpeedSTDownload.getText() + " Мбит/с, Upload: " + txtfieldSpeedSTUpload.getText() +
                            " Мбит/с. (Должно быть " + txtfieldSpeedSTMustBe.getText() + " Мбит/с). ";
                }
                if (chkSpeedIperf.isSelected()) {
                    reqest = reqest + "По Iperf: " + txtfieldSpeedIperfSpeed.getText() + " Мбит/c до г.: " + comboSpeedIperfCity.getValue() + ". ";
                }
                try {
                    if (chkExternalPing.isSelected()) {
                        reqest = reqest + "При пинге до " + txtfieldExternalPingAddr.getText() + " " + txtfieldExternalPingSend.getText()
                                + " пакетами по " + txtfieldExternalPingSize.getText() + " байт: " + (int) (100 - 100 * (Double.parseDouble(txtfieldExternalPingReceived.getText()) / Double.parseDouble(txtfieldExternalPingSend.getText())))
                                + "% потерь. ";
                    }
                } catch (Exception e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Ошибка");
                    alert.setHeaderText(null);
                    alert.setContentText("Введите корректное число полученных/отправленных пакетов до " + txtfieldExternalPingAddr.getText() + "!");

                    alert.showAndWait();
                }


                try {
                    if (chkDNSPing.isSelected()) {
                        reqest = reqest + "При пинге до ST " + txtfieldDNSSend.getText()
                                + " пакетами по " + txtfieldDNSSize.getText() + " байт: " + (int) (100 - 100 * (Double.parseDouble(txtfieldDNSRecived.getText()) / Double.parseDouble(txtfieldDNSSend.getText())))
                                + "% потерь. ";
                    }
                } catch (Exception e) {
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Ошибка");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Введите корректное число полученных/отправленных пакетов до ST!");
                    alert2.showAndWait();
                }

                try {
                    if (chkSwitchPing.isSelected()) {
                        reqest = reqest + " При пинге до коммутатора (Ip: " + txtfieldSwitchIP.getText() + ") " + txtfieldSwitchSend.getText() +
                                " пакетами по " + txtfieldSwitchSize.getText() + " байт: " + (int) (100 - 100 * (Double.parseDouble(txtfieldSwitchRecived.getText()) / Double.parseDouble(txtfieldSwitchSend.getText()))) + "% потерь.  Клиент подключен к порту: " + txtfieldSwitchPort.getText() + ". ";
                    }
                } catch (Exception e) {
                    Alert alert3 = new Alert(Alert.AlertType.INFORMATION);
                    alert3.setTitle("Ошибка");
                    alert3.setHeaderText(null);
                    alert3.setContentText("Введите корректное число полученных/отправленных пакетов до коммутатора!");
                    alert3.showAndWait();
                }

                if (txtErrorsOnPortSpeed.getText().equals("0")) {
                    reqest = reqest + "Ошибок за портом нет. ";
                } else {
                    reqest = reqest + "Ошибок за портом: " + txtErrorsOnPortSpeed.getText() + ". ";
                    if (chkErrorsOnPortSpeedUp.isSelected()) {
                        reqest = reqest + "Число ошибок растет. ";
                    }
                }

                if (chkRouterFaultyses.isSelected()) {
                    reqest = reqest + "Напрямую скорость согласно ТП. ";
                    if (chkDiffWifi.isSelected()) {
                        reqest = reqest + "Канал меняли. ";
                    }
                    if (!chkZamenas.isSelected()) {
                        reqest = reqest + " Роутер перезагружали, сбрасывали, перенастраивали. Требуется проверить роутер на работоспособность. ";
                    } else {
                        reqest = reqest + " Роутер перезагружали, сбрасывали, перенастраивали. Требуется проверить роутер на работоспособность и при необходимости заменить. ";
                    }
                }

            }
            //----------------------------------------------------------------------------------------------------------------------------------------------

        } else if (tabTV.isSelected()) {
            //logic for create requests on the Дом.руТВ tab:
            if (tabCktv.isSelected()) {
                reqest = reqest + "ЦКТВ. ";
                if (chkSpillageImage.isSelected()) {
                    if (chkSpillageImage.isSelected() && chkFadingImage.isSelected()) {
                        reqest = reqest + "Наблюдается рассыпание, замирание изображения. ";
                    } else {
                        reqest = reqest + "Наблюдается рассыпание изображения. ";
                    }
                }
                if (chkFadingImage.isSelected() && !(chkSpillageImage.isSelected() && chkFadingImage.isSelected())) {
                    reqest = reqest + "Наблюдается замирание изображения. ";
                }
                if (chkBroadcastingInterruption.isSelected()) {
                    reqest = reqest + "Прерывается вещание на нескольких каналах. ";
                }
                if (chkNoBrodcastOnAllChannels.isSelected()) {
                    reqest = reqest + "Нет вещания на всех каналах. ";
                }
                if (chkNoBrodcastOnCoddedChannels.isSelected()) {
                    reqest = reqest + "Нет вещания на закодированных каналах. ";
                }
                if (chkNoBrodcastOnSomeChannels.isSelected()) {
                    TextInputDialog dialog = new TextInputDialog(" частотах");
                    dialog.setTitle("Пожалуйста уточните");
                    dialog.setHeaderText("На каких именно каналах нет вещания?");
                    dialog.setContentText("Нет вещания на:");

// Traditional way to get the response value.
                    Optional<String> result = dialog.showAndWait();
                    String ch = "";
                    if (result.isPresent()) {
                        ch = result.get();
                    }

//                    // Create the custom dialog.
//                    Dialog<Pair<String, String>> dialog2 = new Dialog<>();
//                    dialog.setTitle("Login Dialog");
//                    dialog.setHeaderText("Look, a Custom Login Dialog");
//
//// Set the button types.
//                    ButtonType loginButtonType = new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);
//                    dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);
//
//// Create the username and password labels and fields.
//                    GridPane grid = new GridPane();
//                    grid.setHgap(10);
//                    grid.setVgap(10);
//                    grid.setPadding(new Insets(20, 150, 10, 10));
//
//                    TextField username = new TextField();
//                    username.setPromptText("Username");
//                    PasswordField password = new PasswordField();
//                    password.setPromptText("Password");
//
//                    grid.add(new Label("Username:"), 0, 0);
//                    grid.add(username, 1, 0);
//                    grid.add(new Label("Password:"), 0, 1);
//                    grid.add(password, 1, 1);
//
//// Enable/Disable login button depending on whether a username was entered.
//                    Node loginButton = dialog.getDialogPane().lookupButton(loginButtonType);
//                    loginButton.setDisable(true);
//
//// Do some validation (using the Java 8 lambda syntax).
//                    username.textProperty().addListener((observable, oldValue, newValue) -> {
//                        loginButton.setDisable(newValue.trim().isEmpty());
//                    });
//
//                    dialog.getDialogPane().setContent(grid);
//
//// Request focus on the username field by default.
//                    Platform.runLater(() -> username.requestFocus());
//
//// Convert the result to a username-password-pair when the login button is clicked.
//                    dialog.setResultConverter(dialogButton -> {
//                        if (dialogButton == loginButtonType) {
//                            return new Pair<>(username.getText(), password.getText());
//                        }
//                        return null;
//                    });
//
//                    Optional<Pair<String, String>> result = dialog.showAndWait();
//
//                    result.ifPresent(usernamePassword -> {
//                        System.out.println("Username=" + usernamePassword.getKey() + ", Password=" + usernamePassword.getValue());
//                    });

// The Java 8 way to get the response value (with lambda expression).

                    reqest = reqest + "Нет вещания на " + ch + " каналах. ";
                }
            }

        } else if (tabPhone.isSelected()) {
            textReqest.setText("Телефония");
        }
        if (tabInternet.isSelected() || tabTV.isSelected() || tabPhone.isSelected()) {
            if (clientConflict.isSelected()) {
                reqest = reqest + "Клиент конфликтный. ";
            }

            if (soSlovClienta.isSelected() && podklychenieCabelya.isSelected()) {
                reqest = reqest + "Со слов клиента, кабель подключен плотно и повреждений не имеет. ";
            } else if (podklychenieCabelya.isSelected()) {
                reqest = reqest + "Подключение кабеля проверено, повреждений нет. ";
            }

        }
        textReqest.setWrapText(true);
        textReqest.setText(reqest);
    }

}
