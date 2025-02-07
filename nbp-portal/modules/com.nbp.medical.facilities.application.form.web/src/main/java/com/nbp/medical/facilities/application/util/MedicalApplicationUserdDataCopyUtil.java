package com.nbp.medical.facilities.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.medical.facilities.application.form.service.model.*;
import com.nbp.medical.facilities.application.form.service.service.*;
import com.nbp.medical.facilities.application.form.web.portlet.MedicalFacilitiesHomeDetailResourceCommand;
import com.nbp.medical.facilities.application.form.web.portlet.MedicalFacilitiesQualifiedNurseResourceCommand;
import com.nbp.medical.facilities.application.form.web.portlet.MedicalFacilitiesSignatureResourceCommand;

import java.text.SimpleDateFormat;
import java.util.List;

public class MedicalApplicationUserdDataCopyUtil {
    public synchronized static void copyUserdData(long expierdApplicationId, long userdApplicationId, ThemeDisplay themeDisplay){
    	Log _log =LogFactoryUtil.getLog(MedicalApplicationUserdDataCopyUtil.class.getName());
        List<MedicalFacilitiesAppliInfo> medicalFacilitiesAppliInfo = null;
        MedicalFacilitiesAppliInfo expiredMedicalFacilitiesAppliInfo = null;
        try {
        	medicalFacilitiesAppliInfo= MedicalFacilitiesAppliInfoLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(expierdApplicationId);
        }catch (Exception e){}
        if(medicalFacilitiesAppliInfo!=null){
            for (MedicalFacilitiesAppliInfo facilitiesAppliInfo:medicalFacilitiesAppliInfo){
                expiredMedicalFacilitiesAppliInfo = MedicalFacilitiesAppliInfoLocalServiceUtil.createMedicalFacilitiesAppliInfo(CounterLocalServiceUtil.increment());
                expiredMedicalFacilitiesAppliInfo.setApplicantName(facilitiesAppliInfo.getApplicantName());
                expiredMedicalFacilitiesAppliInfo.setAppliTelephoneNumber(facilitiesAppliInfo.getAppliTelephoneNumber());
                expiredMedicalFacilitiesAppliInfo.setAppliAddress(facilitiesAppliInfo.getAppliAddress());
                expiredMedicalFacilitiesAppliInfo.setAppliEmailAddress(facilitiesAppliInfo.getAppliEmailAddress());
                expiredMedicalFacilitiesAppliInfo.setAppliNationality(facilitiesAppliInfo.getAppliNationality());
                expiredMedicalFacilitiesAppliInfo.setCounter(facilitiesAppliInfo.getCounter());
                expiredMedicalFacilitiesAppliInfo.setMedicalFacilitiesAppId(userdApplicationId);
                MedicalFacilitiesAppliInfoLocalServiceUtil.updateMedicalFacilitiesAppliInfo(expiredMedicalFacilitiesAppliInfo);
            }
            _log.info("[Copying Data Entity MedicalFacilitiesAppliInfo:Success] ");
            List<MedicalFacilitiesComDetail> medicalFacilitiesComDetail= null;
            MedicalFacilitiesComDetail newMedicalFacilitiesComDetail= null;
            try {
                medicalFacilitiesComDetail= MedicalFacilitiesComDetailLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(expierdApplicationId);
            }catch (Exception e ) {}
            if(medicalFacilitiesComDetail!=null){
            	for (MedicalFacilitiesComDetail medicalFacilitiesComDetail2 : medicalFacilitiesComDetail) {
            		 newMedicalFacilitiesComDetail=MedicalFacilitiesComDetailLocalServiceUtil.createMedicalFacilitiesComDetail(CounterLocalServiceUtil.increment());
                     newMedicalFacilitiesComDetail.setFullName(medicalFacilitiesComDetail2.getFullName());
                     newMedicalFacilitiesComDetail.setPrivateAddress(medicalFacilitiesComDetail2.getPrivateAddress());
                     newMedicalFacilitiesComDetail.setRegisteredOffice(medicalFacilitiesComDetail2.getRegisteredOffice());
                     newMedicalFacilitiesComDetail.setMedicalFacilitiesAppId(userdApplicationId);
                     MedicalFacilitiesComDetailLocalServiceUtil.updateMedicalFacilitiesComDetail(medicalFacilitiesComDetail2);
				}
            	_log.info("[Copying Data Entity MedicalFacilitiesComDetail:Success] ");
            }
        }
        List<MedicalFacilitiesHomeInfo> medicalFacilitiesHomeInfo=null;
        MedicalFacilitiesHomeInfo newMedicalFacilitiesHomeInfo=null;
        //if(Validator.isNotNull(medicalFacilitiesHomeInfoId)) {
        try {
            medicalFacilitiesHomeInfo= MedicalFacilitiesHomeInfoLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(expierdApplicationId);
        } catch (Exception e) {
        }
        //}
            for(MedicalFacilitiesHomeInfo facilitiesHomeInfo:medicalFacilitiesHomeInfo){
                newMedicalFacilitiesHomeInfo = MedicalFacilitiesHomeInfoLocalServiceUtil.createMedicalFacilitiesHomeInfo(CounterLocalServiceUtil.increment());
                newMedicalFacilitiesHomeInfo.setNameOfOwner(facilitiesHomeInfo.getNameOfOwner());
                newMedicalFacilitiesHomeInfo.setHomeAddress(facilitiesHomeInfo.getHomeAddress());
                newMedicalFacilitiesHomeInfo.setHomeTelephoneNumber(facilitiesHomeInfo.getHomeTelephoneNumber());
                newMedicalFacilitiesHomeInfo.setHomeEmailAddress(facilitiesHomeInfo.getHomeEmailAddress());
                newMedicalFacilitiesHomeInfo.setDescription(facilitiesHomeInfo.getDescription());
                newMedicalFacilitiesHomeInfo.setOtherBusinessDetails(facilitiesHomeInfo.getOtherBusinessDetails());
                newMedicalFacilitiesHomeInfo.setMaternityPatients(facilitiesHomeInfo.getMaternityPatients());
                newMedicalFacilitiesHomeInfo.setOtherPatients(facilitiesHomeInfo.getOtherPatients());
                newMedicalFacilitiesHomeInfo.setMedicalFacilitiesAppId(userdApplicationId);
                newMedicalFacilitiesHomeInfo.setCounter(facilitiesHomeInfo.getCounter());
                MedicalFacilitiesHomeInfoLocalServiceUtil.updateMedicalFacilitiesHomeInfo(newMedicalFacilitiesHomeInfo);
            }
            _log.info("[Copying Data Entity MedicalFacilitiesHomeInfo:Success] ");
        List<MedicalFacilitiesMaterHome> maternityHomeInfo = null;
        MedicalFacilitiesMaterHome newMaternityHomeInfo = null;
        //if(Validator.isNotNull(medicalFacilitiesHomeInfoId)) {
        try {
            maternityHomeInfo=MedicalFacilitiesMaterHomeLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(expierdApplicationId);
        } catch (Exception e) {
        }
        if(maternityHomeInfo!=null){
            for(MedicalFacilitiesMaterHome maternityHomeval:maternityHomeInfo){
            	newMaternityHomeInfo=MedicalFacilitiesMaterHomeLocalServiceUtil.createMedicalFacilitiesMaterHome(CounterLocalServiceUtil.increment());
            	newMaternityHomeInfo.setNurseName(maternityHomeval.getNurseName());
            	newMaternityHomeInfo.setNurseQualification(maternityHomeval.getNurseQualification());
            	newMaternityHomeInfo.setOtherPerson(maternityHomeval.getOtherPerson());
            	newMaternityHomeInfo.setMedicalFacilitiesAppId(userdApplicationId);
            	newMaternityHomeInfo.setCounter(maternityHomeval.getCounter());
                MedicalFacilitiesMaterHomeLocalServiceUtil.updateMedicalFacilitiesMaterHome(newMaternityHomeInfo);
            }
        }
        _log.info("[Copying Data Entity MedicalFacilitiesMaterHome:Success] ");
        List<MedicalFacilitiesNurseDetail> medicalFacilitiesNurseDetail =null;
        MedicalFacilitiesNurseDetail newMedicalFacilitiesNurseDetail =null;
        try {
            medicalFacilitiesNurseDetail= MedicalFacilitiesNurseDetailLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(expierdApplicationId);
        }catch (Exception e)    {}
        
        for (MedicalFacilitiesNurseDetail mediicalFacilitiesNurseDetailVal:medicalFacilitiesNurseDetail) {
        	newMedicalFacilitiesNurseDetail=MedicalFacilitiesNurseDetailLocalServiceUtil.createMedicalFacilitiesNurseDetail(CounterLocalServiceUtil.increment());
        	newMedicalFacilitiesNurseDetail.setQNurseName(mediicalFacilitiesNurseDetailVal.getQNurseName()); //
        	newMedicalFacilitiesNurseDetail.setQNurseQualification(mediicalFacilitiesNurseDetailVal.getQNurseQualification());
        	newMedicalFacilitiesNurseDetail.setRatioOfQNurses(mediicalFacilitiesNurseDetailVal.getRatioOfQNurses());
        	newMedicalFacilitiesNurseDetail.setCounter(mediicalFacilitiesNurseDetailVal.getCounter());
        	newMedicalFacilitiesNurseDetail.setMedicalFacilitiesAppId(userdApplicationId);
            MedicalFacilitiesNurseDetailLocalServiceUtil.updateMedicalFacilitiesNurseDetail(newMedicalFacilitiesNurseDetail);
        }
        _log.info("[Copying Data Entity MedicalFacilitiesNurseDetail:Success] ");
        MedicalNurseStaffPremises medStaffPremises=null;
        MedicalNurseStaffPremises newMedStaffPremises=null;
        try {
            medStaffPremises=MedicalNurseStaffPremisesLocalServiceUtil.getMedicalFacilities_ByAppId(expierdApplicationId);
        } catch (Exception e) {
        }
        _log.info("[Med Staff Nurse Permises Detail]------------"+medStaffPremises);
        if(medStaffPremises!=null) {
        newMedStaffPremises=MedicalNurseStaffPremisesLocalServiceUtil.createMedicalNurseStaffPremises(CounterLocalServiceUtil.increment());
        newMedStaffPremises.setNursingStaffCategory(medStaffPremises.getNursingStaffCategory());
        newMedStaffPremises.setMedicalFacilitiesAppId(userdApplicationId);
        MedicalNurseStaffPremisesLocalServiceUtil.updateMedicalNurseStaffPremises(newMedStaffPremises);
        }
        _log.info("[Copying Data Entity MedicalNurseStaffPremises:Success] ");
          List<MedicalFacilitiesNurseStaff> medicalFacilitiesNurseStaff = null;
          MedicalFacilitiesNurseStaff newMedicalFacilitiesNurseStaff = null;
        try {
        	medicalFacilitiesNurseStaff=  MedicalFacilitiesNurseStaffLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(expierdApplicationId);
        }catch (Exception e){}
        for(MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff1:medicalFacilitiesNurseStaff){
            newMedicalFacilitiesNurseStaff=MedicalFacilitiesNurseStaffLocalServiceUtil.createMedicalFacilitiesNurseStaff(CounterLocalServiceUtil.increment());
            newMedicalFacilitiesNurseStaff.setNStaffName(medicalFacilitiesNurseStaff1.getNStaffName());
            newMedicalFacilitiesNurseStaff.setNStaffQualification(medicalFacilitiesNurseStaff1.getNStaffQualification());
            newMedicalFacilitiesNurseStaff.setNStaffState(medicalFacilitiesNurseStaff1.getNStaffState());
            newMedicalFacilitiesNurseStaff.setCounter(medicalFacilitiesNurseStaff1.getCounter());
            newMedicalFacilitiesNurseStaff.setMedicalFacilitiesAppId(userdApplicationId);
            MedicalFacilitiesNurseStaffLocalServiceUtil.updateMedicalFacilitiesNurseStaff(newMedicalFacilitiesNurseStaff);
        }
        _log.info("[Copying Data Entity MedicalFacilitiesNurseStaff:Success] ");
        List<MedicalFacilitiesHomeTwo> medicalFacilitiesHomeTwo =null;
        MedicalFacilitiesHomeTwo renewMedicalFacilitiesHomeTwo =null;
        try {
            medicalFacilitiesHomeTwo=MedicalFacilitiesHomeTwoLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(expierdApplicationId);
        } catch (Exception e) {
        }
        for(MedicalFacilitiesHomeTwo medicalVal:medicalFacilitiesHomeTwo){
            renewMedicalFacilitiesHomeTwo=MedicalFacilitiesHomeTwoLocalServiceUtil.createMedicalFacilitiesHomeTwo(CounterLocalServiceUtil.increment());

            renewMedicalFacilitiesHomeTwo.setMaternityPatients(medicalVal.getMaternityPatients()); //
            renewMedicalFacilitiesHomeTwo.setOtherPatients(medicalVal.getOtherPatients()); //
            renewMedicalFacilitiesHomeTwo.setCounter(medicalVal.getCounter());
            renewMedicalFacilitiesHomeTwo.setMedicalFacilitiesAppId(userdApplicationId);
            MedicalFacilitiesHomeTwoLocalServiceUtil.updateMedicalFacilitiesHomeTwo(renewMedicalFacilitiesHomeTwo);
        }
        _log.info("[Copying Data Entity MedicalFacilitiesHomeTwo:Success] ");
        MedicalFacilitiesQNurse medicalFacilitiesQNurse=null;
        MedicalFacilitiesQNurse newMedicalFacilitiesQNurse=null;
        try {
            medicalFacilitiesQNurse=MedicalFacilitiesQNurseLocalServiceUtil.getMedicalFacilitiesQNurse(expierdApplicationId);
        } catch (Exception e) {
        }
        if(medicalFacilitiesQNurse!=null) {
        newMedicalFacilitiesQNurse=   MedicalFacilitiesQNurseLocalServiceUtil.createMedicalFacilitiesQNurse(CounterLocalServiceUtil.increment());
        newMedicalFacilitiesQNurse.setName(medicalFacilitiesQNurse.getName());
        newMedicalFacilitiesQNurse.setQualification(medicalFacilitiesQNurse.getQualification());
        newMedicalFacilitiesQNurse.setCheckQualifiedNurse(medicalFacilitiesQNurse.getCheckQualifiedNurse());
        newMedicalFacilitiesQNurse.setQNurseName(medicalFacilitiesQNurse.getQNurseName());
        newMedicalFacilitiesQNurse.setQNurseQualification(medicalFacilitiesQNurse.getQNurseQualification());
        newMedicalFacilitiesQNurse.setRatioOfQNurses(medicalFacilitiesQNurse.getRatioOfQNurses());
        newMedicalFacilitiesQNurse.setNursingStaffCategory(medicalFacilitiesQNurse.getNursingStaffCategory());
        newMedicalFacilitiesQNurse.setMedicalFacilitiesAppId(userdApplicationId);
        MedicalFacilitiesQNurseLocalServiceUtil.updateMedicalFacilitiesQNurse(newMedicalFacilitiesQNurse);
        }
        _log.info("[Copying Data Entity MedicalFacilitiesQNurse:Success] ");
        MedicalFacilitiesSignInfo medicalFacilitiesSignInfo=null;
        MedicalFacilitiesSignInfo newMmedicalFacilitiesSignInfo=null;
        try {
            medicalFacilitiesSignInfo=MedicalFacilitiesSignInfoLocalServiceUtil.getMedicalFacilitiesSignInfo(expierdApplicationId);
        } catch (Exception e) {
        }
		if(medicalFacilitiesSignInfo!=null) {
		        newMmedicalFacilitiesSignInfo = MedicalFacilitiesSignInfoLocalServiceUtil
		                    .createMedicalFacilitiesSignInfo(CounterLocalServiceUtil.increment(MedicalFacilitiesSignatureResourceCommand.class.getName()));
		
		        newMmedicalFacilitiesSignInfo.setNumber(medicalFacilitiesSignInfo.getNumber());
		        newMmedicalFacilitiesSignInfo.setParticulars(medicalFacilitiesSignInfo.getParticulars());
		        newMmedicalFacilitiesSignInfo.setChargedFees(medicalFacilitiesSignInfo.getChargedFees());
		        newMmedicalFacilitiesSignInfo.setAddressOfOtherNHome(medicalFacilitiesSignInfo.getAddressOfOtherNHome());
		        newMmedicalFacilitiesSignInfo.setEnteredDate(medicalFacilitiesSignInfo.getEnteredDate());
		        medicalFacilitiesSignInfo.setMedicalFacilitiesAppId(userdApplicationId);
		        MedicalFacilitiesSignInfoLocalServiceUtil.updateMedicalFacilitiesSignInfo(medicalFacilitiesSignInfo);
		}
        _log.info("[Copying Data Entity newMmedicalFacilitiesSignInfo:Success] ");
        MedicalFaciltiesPayment medicalPayment = null;
        MedicalFaciltiesPayment newMedicalPayment = null;
        try {
            medicalPayment = MedicalFaciltiesPaymentLocalServiceUtil.getMedicalAppById(expierdApplicationId);
        } catch (Exception e) {
        }
        if(medicalPayment!=null) {
        newMedicalPayment = MedicalFaciltiesPaymentLocalServiceUtil.createMedicalFaciltiesPayment(CounterLocalServiceUtil.increment());
        newMedicalPayment.setPaymentMethod(medicalPayment.getPaymentMethod());
        newMedicalPayment.setPaymentFee(medicalPayment.getPaymentFee());
        newMedicalPayment.setAmountPaid(medicalPayment.getAmountPaid());
        newMedicalPayment.setAmountCurrency(medicalPayment.getAmountCurrency());
        newMedicalPayment.setMedicalFacilitiesAppId(userdApplicationId);
        MedicalFaciltiesPaymentLocalServiceUtil.updateMedicalFaciltiesPayment(medicalPayment);
        }
        _log.info("[Copying Data Entity MedicalFaciltiesPayment:Success] ");


        }



}
