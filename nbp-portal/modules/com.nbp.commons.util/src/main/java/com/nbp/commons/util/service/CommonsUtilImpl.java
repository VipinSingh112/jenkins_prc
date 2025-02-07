package com.nbp.commons.util.service;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.model.JournalArticleDisplay;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.NoSuchResourcePermissionException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.ResourceAction;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.ResourcePermission;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.ResourceActionLocalServiceUtil;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.nbp.acquire.application.form.service.model.AcquireApplication;
import com.nbp.acquire.application.form.service.model.AcquireApplicationDetails;
import com.nbp.acquire.application.form.service.model.AcquireDocumentList;
import com.nbp.acquire.application.form.service.model.AcquireLandApplicantDetails;
import com.nbp.acquire.application.form.service.model.AcquireLandEmployment;
import com.nbp.acquire.application.form.service.model.AcquireLandPropertyDetails;
import com.nbp.acquire.application.form.service.model.AcquirePaymentPlan;
import com.nbp.acquire.application.form.service.model.AcquirePropertyDetails;
import com.nbp.acquire.application.form.service.service.AcquireApplicationDetailsLocalServiceUtil;
import com.nbp.acquire.application.form.service.service.AcquireApplicationLocalServiceUtil;
import com.nbp.acquire.application.form.service.service.AcquireDocumentListLocalServiceUtil;
import com.nbp.acquire.application.form.service.service.AcquireLandApplicantDetailsLocalServiceUtil;
import com.nbp.acquire.application.form.service.service.AcquireLandEmploymentLocalServiceUtil;
import com.nbp.acquire.application.form.service.service.AcquireLandPropertyDetailsLocalServiceUtil;
import com.nbp.acquire.application.form.service.service.AcquirePaymentPlanLocalServiceUtil;
import com.nbp.acquire.application.form.service.service.AcquirePropertyDetailsLocalServiceUtil;
import com.nbp.agriculture.pdf.util.AgricultureApplicationPdf;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAddress;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAuthorizedAgent;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyInfo;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualAddress;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualInfo;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationPayment;
import com.nbp.cannabis.application.form.services.model.CannabisApplications;
import com.nbp.cannabis.application.form.services.model.CannabisConsentByPropertyOwner;
import com.nbp.cannabis.application.form.services.model.CannabisConsentBySoleOwner;
import com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnership;
import com.nbp.cannabis.application.form.services.model.CannabisOccupationaLicense;
import com.nbp.cannabis.application.form.services.model.CannabisSupplementalInformation;
import com.nbp.cannabis.application.form.services.model.CannabisSupportingDocumentsMaster;
import com.nbp.cannabis.application.form.services.model.GeneralDelarations;
import com.nbp.cannabis.application.form.services.model.StatementOfFinancialHistory;
import com.nbp.cannabis.application.form.services.service.CannabisApplicationCompanyAddressLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.CannabisApplicationCompanyAuthorizedAgentLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.CannabisApplicationCompanyInfoLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.CannabisApplicationIndividualAddressLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.CannabisApplicationIndividualInfoLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.CannabisApplicationPaymentLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.CannabisApplicationsLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.CannabisConsentByPropertyOwnerLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.CannabisConsentBySoleOwnerLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.CannabisDeclarationOfOwnershipLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.CannabisOccupationaLicenseLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.CannabisSupplementalInformationLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.CannabisSupportingDocumentsMasterLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.GeneralDelarationsLocalServiceUtil;
import com.nbp.cannabis.application.form.services.service.StatementOfFinancialHistoryLocalServiceUtil;
import com.nbp.commons.documents.util.DocumentMetaData;
import com.nbp.commons.download.pdf.util.ApplicationFormPDFGenerator;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.commons.util.constants.CommonsUtilWorkFlowConstants;
import com.nbp.creative.application.form.service.model.CreativeApplication;
import com.nbp.creative.application.form.service.model.CreativeCompanyApplicantInformation;
import com.nbp.creative.application.form.service.model.CreativeCompanyDetails;
import com.nbp.creative.application.form.service.model.CreativeCompanyDetailsAddress;
import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformation;
import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformationAddress;
import com.nbp.creative.application.form.service.model.CreativeCompanyEconomicEffect;
import com.nbp.creative.application.form.service.model.CreativeCompanyGeneralInformation;
import com.nbp.creative.application.form.service.model.CreativeContactInfoAddBox;
import com.nbp.creative.application.form.service.model.CreativeDirectorListinAddBox;
import com.nbp.creative.application.form.service.model.CreativeIndividualDetails;
import com.nbp.creative.application.form.service.model.CreativeIndividualDetailsAddress;
import com.nbp.creative.application.form.service.model.CreativeIndividualEconomicEffect;
import com.nbp.creative.application.form.service.model.CreativeIndividualGeneralInformation;
import com.nbp.creative.application.form.service.model.CreativeSocialMediaAddBox;
import com.nbp.creative.application.form.service.service.CreativeApplicationLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeCompanyApplicantInformationLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeCompanyDetailsAddressLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeCompanyDetailsLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeCompanyDirectorInformationAddressLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeCompanyDirectorInformationLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeCompanyEconomicEffectLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeCompanyGeneralInformationLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeContactInfoAddBoxLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeDirectorListinAddBoxLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeIndividualDetailsAddressLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeIndividualDetailsLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeIndividualEconomicEffectLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeIndividualGeneralInformationLocalServiceUtil;
import com.nbp.creative.application.form.service.service.CreativeSocialMediaAddBoxLocalServiceUtil;
import com.nbp.explosive.pdf.util.ExplosiveApplicationPdf;
import com.nbp.explosive.pdf.util.ExplosivePyrotechnicApplicationPdf;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;
import com.nbp.explosives.competency.application.form.service.service.ExplosivesApplicationLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;
import com.nbp.factories.registration.application.form.services.service.FactoriesApplicationRegistrationLocalServiceUtil;
import com.nbp.factories.registration.util.service.FactoriesNonPrescribedFoodsPdf;
import com.nbp.factories.registration.util.service.FactoriesPrescribedFoodsPdf;
import com.nbp.farm.application.form.service.model.FarmerApplication;
import com.nbp.farm.application.form.service.model.FarmerCrop;
import com.nbp.farm.application.form.service.model.FarmerCropPractice;
import com.nbp.farm.application.form.service.model.FarmerLivestock;
import com.nbp.farm.application.form.service.model.FarmerProfile;
import com.nbp.farm.application.form.service.model.FarmerProperty;
import com.nbp.farm.application.form.service.model.FarmerStakeholderAddress;
import com.nbp.farm.application.form.service.model.FarmerStakeholderInfo;
import com.nbp.farm.application.form.service.model.FarmerlivestockPractice;
import com.nbp.farm.application.form.service.service.FarmerApplicationLocalServiceUtil;
import com.nbp.farm.application.form.service.service.FarmerCropLocalServiceUtil;
import com.nbp.farm.application.form.service.service.FarmerCropPracticeLocalServiceUtil;
import com.nbp.farm.application.form.service.service.FarmerLivestockLocalServiceUtil;
import com.nbp.farm.application.form.service.service.FarmerProfileLocalServiceUtil;
import com.nbp.farm.application.form.service.service.FarmerPropertyLocalServiceUtil;
import com.nbp.farm.application.form.service.service.FarmerStakeholderAddressLocalServiceUtil;
import com.nbp.farm.application.form.service.service.FarmerStakeholderInfoLocalServiceUtil;
import com.nbp.farm.application.form.service.service.FarmerlivestockPracticeLocalServiceUtil;
import com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList;
import com.nbp.film.application.form.service.model.FilmApplication;
import com.nbp.film.application.form.service.model.FilmApplicationPayment;
import com.nbp.film.application.form.service.model.FilmCompanyDetails;
import com.nbp.film.application.form.service.model.FilmEquipmentList;
import com.nbp.film.application.form.service.model.FilmOtherDetails;
import com.nbp.film.application.form.service.model.FilmProductionDetails;
import com.nbp.film.application.form.service.service.FilmAdditionalEquipmentListLocalServiceUtil;
import com.nbp.film.application.form.service.service.FilmApplicationLocalServiceUtil;
import com.nbp.film.application.form.service.service.FilmApplicationPaymentLocalServiceUtil;
import com.nbp.film.application.form.service.service.FilmCompanyDetailsLocalServiceUtil;
import com.nbp.film.application.form.service.service.FilmEquipmentListLocalServiceUtil;
import com.nbp.film.application.form.service.service.FilmOtherDetailsLocalServiceUtil;
import com.nbp.film.application.form.service.service.FilmProductionDetailsLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil;
import com.nbp.fire.brigade.pdf.util.FireBirgadeApplicationPdf;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicantAddress;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicantInfo;
import com.nbp.healthcare.application.form.service.model.HealthCareApplication;
import com.nbp.healthcare.application.form.service.model.HealthCareBusinessAddress;
import com.nbp.healthcare.application.form.service.model.HealthCareBussinessInfo;
import com.nbp.healthcare.application.form.service.model.HealthCareDescriptionOfService;
import com.nbp.healthcare.application.form.service.model.HealthCareEquipmentInfo;
import com.nbp.healthcare.application.form.service.service.HealthCareApplicantAddressLocalServiceUtil;
import com.nbp.healthcare.application.form.service.service.HealthCareApplicantInfoLocalServiceUtil;
import com.nbp.healthcare.application.form.service.service.HealthCareApplicationLocalServiceUtil;
import com.nbp.healthcare.application.form.service.service.HealthCareBusinessAddressLocalServiceUtil;
import com.nbp.healthcare.application.form.service.service.HealthCareBussinessInfoLocalServiceUtil;
import com.nbp.healthcare.application.form.service.service.HealthCareDescriptionOfServiceLocalServiceUtil;
import com.nbp.healthcare.application.form.service.service.HealthCareEquipmentInfoLocalServiceUtil;
import com.nbp.hsra.application.service.model.HsraApplication;
import com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil;
import com.nbp.hsra.pdf.util.HsraBrokerPdf;
import com.nbp.hsra.pdf.util.HsraQualifiedExpertsPdf;
import com.nbp.hsra.pdf.util.HsraRadiationPdf;
import com.nbp.hsra.pdf.util.HsraServiceProviderPdf;
import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil;
import com.nbp.jadsc.pdf.util.JadscFirstApplicantCompanypdf;
import com.nbp.jadsc.pdf.util.JadscSecondApplicantBehalfOfCompanyPdf;
import com.nbp.jadsc.pdf.util.JadscThirdTransationPublicVersionPdf;
import com.nbp.janaac.application.form.service.model.JanaacApplication;
import com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil;
import com.nbp.janaac.pdf.util.AccreditationInspectionBodiesPdf;
import com.nbp.janaac.pdf.util.CalibrationLabPdf;
import com.nbp.janaac.pdf.util.CertificationBodies17021Pdf;
import com.nbp.janaac.pdf.util.CertificationBodies17024Pdf;
import com.nbp.janaac.pdf.util.CertificationBodies17065Pdf;
import com.nbp.janaac.pdf.util.FDAApprovalsFirstSubCatPdf;
import com.nbp.janaac.pdf.util.MedicalLabPdf;
import com.nbp.janaac.pdf.util.TestingLab17025Pdf;
/*import com.nbp.hsra.pdf.util.HsraBrokerPdf;*/
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.manufacturing.application.form.service.model.ManuAdditionalCompanyInfo;
import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo;
import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfoAddress;
import com.nbp.manufacturing.application.form.service.model.ManuEquipment;
import com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd;
import com.nbp.manufacturing.application.form.service.model.ManuExportData;
import com.nbp.manufacturing.application.form.service.model.ManuInternationalCertificate;
import com.nbp.manufacturing.application.form.service.model.ManufacturingApplication;
import com.nbp.manufacturing.application.form.service.model.PackagingProcess;
import com.nbp.manufacturing.application.form.service.model.ProductionProcess;
import com.nbp.manufacturing.application.form.service.model.ProductiveInputsForm;
import com.nbp.manufacturing.application.form.service.model.ProductiveInputsFormAdd;
import com.nbp.manufacturing.application.form.service.service.ManuAdditionalCompanyInfoLocalServiceUtil;
import com.nbp.manufacturing.application.form.service.service.ManuCompanyInfoAddressLocalServiceUtil;
import com.nbp.manufacturing.application.form.service.service.ManuCompanyInfoLocalServiceUtil;
import com.nbp.manufacturing.application.form.service.service.ManuEquipmentAddLocalServiceUtil;
import com.nbp.manufacturing.application.form.service.service.ManuEquipmentLocalServiceUtil;
import com.nbp.manufacturing.application.form.service.service.ManuExportDataLocalServiceUtil;
import com.nbp.manufacturing.application.form.service.service.ManuInternationalCertificateLocalServiceUtil;
import com.nbp.manufacturing.application.form.service.service.ManufacturingApplicationLocalServiceUtil;
import com.nbp.manufacturing.application.form.service.service.PackagingProcessLocalServiceUtil;
import com.nbp.manufacturing.application.form.service.service.ProductionProcessLocalServiceUtil;
import com.nbp.manufacturing.application.form.service.service.ProductiveInputsFormAddLocalServiceUtil;
import com.nbp.manufacturing.application.form.service.service.ProductiveInputsFormLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppLocalServiceUtil;
import com.nbp.medical.facilities.pdf.util.ComMaternityHospitalAmbulatoryFacilitiesPdf;
import com.nbp.medical.facilities.pdf.util.ComMixedHospitalAmbulatoryFacilitiesPdf;
import com.nbp.medical.facilities.pdf.util.ComNonMaternityHospitalAmbulatoryFacilitiesPdf;
import com.nbp.medical.facilities.pdf.util.IndiHospitalAmbulatoryFacilitiesPdf;
import com.nbp.medical.facilities.pdf.util.LongTermIndiResidentialCareFacilitiesPdf;
import com.nbp.medical.facilities.pdf.util.LongTermsIndiMixedCategoryPdf;
import com.nbp.medical.facilities.pdf.util.LongTermsIndiNonMaternityHomePdf;
import com.nbp.miic.application.form.services.model.MiicApplication;
import com.nbp.miic.application.form.services.service.MiicApplicationLocalServiceUtil;
import com.nbp.miic.pdf.MiicSafeguardMechPdf;
import com.nbp.miic.pdf.MiicSusCETPdf;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;
import com.nbp.mining.pdf.util.MiningLeaseNewTemporaryPermissionPdf;
import com.nbp.mining.pdf.util.MiningLeaseRenewPdf;
import com.nbp.mining.pdf.util.MiningProspectingLicencePdf;
import com.nbp.mining.pdf.util.MiningProspectingLicenceRenewalPdf;
import com.nbp.mining.pdf.util.MiningProspectingLicenceSurrenderPdf;
import com.nbp.mining.pdf.util.MiningProspectingLicenceTransferPdf;
import com.nbp.mining.pdf.util.MiningProspectingRightsPdf;
import com.nbp.ncbj.application.form.service.model.NcbjApplication;
import com.nbp.ncbj.application.form.service.service.NcbjApplicationLocalServiceUtil;
import com.nbp.ncbj.pdf.util.NcbjIso9000MultiSitesPdf;
import com.nbp.ncbj.pdf.util.NcbjIsoFirstCertifiicationPdf;
import com.nbp.ncbj.pdf.util.NcbjIsoFirstRecertifiicationPdf;
import com.nbp.ncbj.pdf.util.NcbjIsoSecondCertifiicationMultipleSitesPdf;
import com.nbp.ncbj.pdf.util.NcbjIsoSecondCertifiicationSinglePdf;
import com.nbp.ncra.application.form.service.model.NcraApplication;
import com.nbp.ncra.application.form.service.service.NcraApplicationLocalServiceUtil;
import com.nbp.ncra.pdf.util.NcraApplicationPdf;
import com.nbp.ncra.pdf.util.NcraImportedPetrolPdf;
import com.nbp.ogt.application.form.services.model.OgtApplication;
import com.nbp.ogt.application.form.services.service.OgtApplicationLocalServiceUtil;
import com.nbp.ogt.pdf.util.OgtBankruptcyClaimByCreditorPdf;
import com.nbp.ogt.pdf.util.OgtBankruptcyClaimBySpousePdf;
import com.nbp.ogt.pdf.util.OgtBankruptcyClaimToPropertyPdf;
import com.nbp.ogt.pdf.util.OgtProposalOrReceivershipPdf;
import com.nbp.osi.application.form.services.model.CounsellingExperience;
import com.nbp.osi.application.form.services.model.DetailOfApplicant;
import com.nbp.osi.application.form.services.model.EducationalQualification;
import com.nbp.osi.application.form.services.model.OfficialUse;
import com.nbp.osi.application.form.services.model.OsiApplication;
import com.nbp.osi.application.form.services.model.ProfessionalAffiliation;
import com.nbp.osi.application.form.services.service.CounsellingExperienceLocalServiceUtil;
import com.nbp.osi.application.form.services.service.DetailOfApplicantLocalServiceUtil;
import com.nbp.osi.application.form.services.service.EducationalQualificationLocalServiceUtil;
import com.nbp.osi.application.form.services.service.OfficialUseLocalServiceUtil;
import com.nbp.osi.application.form.services.service.OsiApplicationLocalServiceUtil;
import com.nbp.osi.application.form.services.service.ProfessionalAffiliationLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.model.AssessmentIndividualPersonalDetails;
import com.nbp.osi.insolvency.application.form.services.model.AssetsNotUsedAsSecurity;
import com.nbp.osi.insolvency.application.form.services.model.AssetsUsedAsSecurity;
import com.nbp.osi.insolvency.application.form.services.model.CompanyDetails;
import com.nbp.osi.insolvency.application.form.services.model.CompanyFinancialPosition;
import com.nbp.osi.insolvency.application.form.services.model.CompanySecretary;
import com.nbp.osi.insolvency.application.form.services.model.CompanySecuredCreditor;
import com.nbp.osi.insolvency.application.form.services.model.CompanyUnsecuredCreditor;
import com.nbp.osi.insolvency.application.form.services.model.DirectorsForm;
import com.nbp.osi.insolvency.application.form.services.model.FinancialPosition;
import com.nbp.osi.insolvency.application.form.services.model.GrandTotal;
import com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses;
import com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome;
import com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity;
import com.nbp.osi.insolvency.application.form.services.model.OsiAssessmentSignature;
import com.nbp.osi.insolvency.application.form.services.model.OsiComSecurityTotal;
import com.nbp.osi.insolvency.application.form.services.model.OsiComTotalLiability;
import com.nbp.osi.insolvency.application.form.services.model.OsiIndiTotalDetailOfAssets;
import com.nbp.osi.insolvency.application.form.services.model.OsiTotalMonthlyExpense;
import com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor;
import com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor;
import com.nbp.osi.insolvency.application.form.services.model.ShareholdersHoldings;
import com.nbp.osi.insolvency.application.form.services.model.SubjectData;
import com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditor;
import com.nbp.osi.insolvency.application.form.services.model.UsedSecurity;
import com.nbp.osi.insolvency.application.form.services.model.VerificationCompanyInfo;
import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInfo;
import com.nbp.osi.insolvency.application.form.services.service.AssessmentIndividualPersonalDetailsLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.AssetsNotUsedAsSecurityLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.AssetsUsedAsSecurityLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.CompanyDetailsLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.CompanyFinancialPositionLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.CompanySecretaryLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.CompanySecuredCreditorLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.CompanyUnsecuredCreditorLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.DirectorsFormLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.FinancialPositionLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.GrandTotalLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.MonthlyExpensesLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.MonthlyIncomeLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.NotUsedSecurityLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.OsiAssessmentSignatureLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.OsiComSecurityTotalLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.OsiComTotalLiabilityLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.OsiIndiTotalDetailOfAssetsLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.OsiInsolvencyApplicationLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.OsiTotalMonthlyExpenseLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.PreferredCreditorLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.SecuredCreditorLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.ShareholdersHoldingsLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.SubjectDataLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.UnsecuredCreditorLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.UsedSecurityLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.VerificationCompanyInfoLocalServiceUtil;
import com.nbp.osi.insolvency.application.form.services.service.VerificationRequestorsInfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil;
import com.nbp.osi.services.pdf.util.CertificateAssignmentPdf;
import com.nbp.osi.services.pdf.util.TrusteeLicenceCompany;
import com.nbp.osi.services.pdf.util.TrusteeLicenceIndividual;
import com.nbp.pharmaceutical.application.form.service.model.PharmaApplication;
import com.nbp.pharmaceutical.application.form.service.model.PharmaApplicationPayment;
import com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentList;
import com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo;
import com.nbp.pharmaceutical.application.form.service.model.PharmaManufacturerInfo;
import com.nbp.pharmaceutical.application.form.service.model.PharmaMedicalDeviceInfo;
import com.nbp.pharmaceutical.application.form.service.service.PharmaApplicationLocalServiceUtil;
import com.nbp.pharmaceutical.application.form.service.service.PharmaApplicationPaymentLocalServiceUtil;
import com.nbp.pharmaceutical.application.form.service.service.PharmaDocumentListLocalServiceUtil;
import com.nbp.pharmaceutical.application.form.service.service.PharmaDrugInfoLocalServiceUtil;
import com.nbp.pharmaceutical.application.form.service.service.PharmaManufacturerInfoLocalServiceUtil;
import com.nbp.pharmaceutical.application.form.service.service.PharmaMedicalDeviceInfoLocalServiceUtil;
import com.nbp.quarry.pdf.util.QuarryApplicationPdf;
import com.nbp.quarry.pdf.util.QuarryTransferDownloadPdf;
import com.nbp.quary.application.form.service.model.QuarryApplication;
import com.nbp.quary.application.form.service.service.QuarryApplicationLocalServiceUtil;
import com.nbp.sez.pdf.util.SezOccupantPDf;
import com.nbp.sez.pdf.util.SezPdfForDeveloper;
import com.nbp.sez.pdf.util.SezPdfForWorkFromHome;
import com.nbp.sez.pdf.util.SezZoneUserPdf;
import com.nbp.sez.status.application.form.service.model.SezStatusApplication;
import com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil;
import com.nbp.tourism.application.form.services.model.TourismAnnualEntertainBox;
import com.nbp.tourism.application.form.services.model.TourismApplication;
import com.nbp.tourism.application.form.services.model.TourismApplicationPayment;
import com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment;
import com.nbp.tourism.application.form.services.model.TourismBonaAccoGenralInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationForm;
import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationFormAddress;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionEmployeeInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormFirst;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormFirstAddress;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormSecond;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionSignInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundSignInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransBox;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportatioCarRental;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportation;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportationAddress;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportEmployeeInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportSignInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormFirst;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormFirstAddress;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormSecond;
import com.nbp.tourism.application.form.services.model.TourismGroundTransBox;
import com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment;
import com.nbp.tourism.application.form.services.model.TourismNewAccoGeneralForm;
import com.nbp.tourism.application.form.services.model.TourismNewAccoSignInfo;
import com.nbp.tourism.application.form.services.model.TourismNewAccommodationAddress;
import com.nbp.tourism.application.form.services.model.TourismNewAccommodationForm;
import com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionEmployeeInfo;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirst;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirstAddress;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormSecond;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionSignInfo;
import com.nbp.tourism.application.form.services.model.TourismNewGroundSignature;
import com.nbp.tourism.application.form.services.model.TourismNewGroundTransportation;
import com.nbp.tourism.application.form.services.model.TourismNewNumberOFEmployment;
import com.nbp.tourism.application.form.services.model.TourismSummaryAddBox;
import com.nbp.tourism.application.form.services.service.TourismAnnualEntertainBoxLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismApplicationLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismApplicationPaymentLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaAccoAssesmentLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaAccoGenralInfoLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaAccoSignInfoLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaAccommodationFormAddressLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaAccommodationFormLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaAttractionEmployeeInfoLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaAttractionFormFirstAddressLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaAttractionFormFirstLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaAttractionFormSecondLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaAttractionSignInfoLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaGroundSignInfoLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaGroundTransBoxLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaGroundTransportatioCarRentalLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaGroundTransportationAddressLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaGroundTransportationLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaWaterSportEmployeeInfoLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaWaterSportSignInfoLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaWaterSportsFormFirstAddressLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaWaterSportsFormFirstLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismBonaWaterSportsFormSecondLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismGroundTransBoxLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewAccoAssesmentLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewAccoGeneralFormLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewAccoSignInfoLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewAccommodationAddressLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewAccommodationFormLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewAnnualEarningsLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewAttractionEmployeeInfoLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewAttractionFormFirstAddressLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewAttractionFormFirstLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewAttractionFormSecondLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewAttractionSignInfoLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewGroundSignatureLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewGroundTransportationLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismNewNumberOFEmploymentLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.TourismSummaryAddBoxLocalServiceUtil;
import com.nbp.tpdco.pdf.util.JtbAccomodationHomeStayPdf;
import com.nbp.tpdco.pdf.util.JtbAccomodationHotelPdf;
import com.nbp.tpdco.pdf.util.JtbAccomodationResortCottagePdf;
import com.nbp.tpdco.pdf.util.JtbAttractionsPdf;
import com.nbp.tpdco.pdf.util.JtbBikeRental;
import com.nbp.tpdco.pdf.util.JtbContractCarriage;
import com.nbp.tpdco.pdf.util.JtbOtherCarRental;
import com.nbp.tpdco.pdf.util.JtbOtherCraft;
import com.nbp.tpdco.pdf.util.JtbOtherDomesticTour;
import com.nbp.tpdco.pdf.util.JtbOtherPlaceOfInterest;
import com.nbp.tpdco.pdf.util.JtbOtherTravelHault;
import com.nbp.tpdco.pdf.util.JtbOtherWaterSportsEmployeesPdf;
import com.nbp.tpdco.pdf.util.JtbOtherWaterSportsOperatorPdf;
import com.nbp.tpdco.pdf.util.JtbTravelAgency;
import com.nbp.wra.application.form.service.model.WRAApplication;
import com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil;
import com.nbp.wra.pdf.util.LicenceAbstarctAndUserWaterPdf;
import com.nbp.wra.pdf.util.PermitToDrillWellPdf;
import com.nbp.wra.pdf.util.RenewalLicenceAbstractPdf;
import com.nbp.wra.pdf.util.WellDrillersLicenceApplicationPdf;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.mail.internet.InternetAddress;
import javax.portlet.PortletRequest;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(service = CommonsUtil.class)
public class CommonsUtilImpl implements CommonsUtil {
	private static Log LOGGER = LogFactoryUtil.getLog(CommonsUtilImpl.class.getName());

	@Override
	public String getCollaborationDashboardUrl(long groupId, String dashboardFriendlyUrl, PortletRequest request,
			String portletName, long applicationId) {
		// TODO Auto-generated method stub
		LiferayPortletURL dashboardRenderURL = null;
		try {
			Layout applicationFormLayout = LayoutLocalServiceUtil.getFriendlyURLLayout(groupId, true,
					dashboardFriendlyUrl);
			dashboardRenderURL = PortletURLFactoryUtil.create(request, portletName, applicationFormLayout.getPlid(),
					PortletRequest.RENDER_PHASE);
			dashboardRenderURL.setParameter("mvcPath", "/view.jsp");
			// dashboardRenderURL.setParameter("cannabisApplicationId",String.valueOf(applicationId));
			return dashboardRenderURL.toString();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public File getPreviewFileDownloadPdf(ResourceRequest resourceRequest, ResourceResponse resourceResponse,
			String fileName, String ftlPath) {
		// TODO Auto-generated method stub
		return ApplicationFormPDFGenerator.generatePdf(resourceRequest, resourceResponse, fileName, ftlPath);
	}

	@Override
	public void sendMailToUsers(String subject, String fromAddress, String addresslist, String body) {
		try {
			InternetAddress from = new InternetAddress(fromAddress);
			InternetAddress[] to = InternetAddress.parse(addresslist);
			LOGGER.debug("InternetAddress------" + to);
			MailMessage mailMessage = new MailMessage(from, subject, body, true);
			mailMessage.setTo(to);
			MailServiceUtil.sendEmail(mailMessage);
			LOGGER.info("Mail sent");
		} catch (Exception e) {
			LOGGER.error("Could not send mail ----- " + e);
		}
	}

	@Override
	public String getTemplateFromJournalArticle(long groupId, String urlTitle) {
		JournalArticle journalArticle = null;
		String contentBody = StringPool.BLANK;
		try {
			journalArticle = JournalArticleLocalServiceUtil.getArticleByUrlTitle(groupId, urlTitle);
			JournalArticleDisplay articleDisplay = JournalArticleLocalServiceUtil.getArticleDisplay(groupId,
					journalArticle.getArticleId(), null, "en_US", null);
			if (Validator.isNotNull(articleDisplay)) {
				contentBody = articleDisplay.getContent();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return contentBody;
	}

	public boolean checkUserRoles(ThemeDisplay themeDisplay, String RoleName) {
		List<Role> roles = RoleLocalServiceUtil.getUserRoles(themeDisplay.getUserId());
		boolean isUserCLAAdmin = false;
		for (Role role : roles) {
			if (role.getName().equals(RoleName)) {
				isUserCLAAdmin = true;
				break;
			}
		}
		return isUserCLAAdmin;
	}

	@Override
	public String replacePharmaPdfVar(long pharmaApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithDoc) throws PortalException {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		PharmaApplication pharmaApplication = PharmaApplicationLocalServiceUtil
				.getPharmaApplication(pharmaApplicationId);
		DLFolder supportingDocumentsParentFolder = null;
		DLFolder supportingDocumentsFolder = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Pharmaceutical Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(pharmaApplication.getPharmaApplicationId()));
		} catch (Exception e) {
		}
		if (pharmaApplication.getTypeOfPharmaProduct().equals("New Pharmaceutical Drug")) {
			PharmaDrugInfo drugInfo = null;
			PharmaManufacturerInfo pharmaManufacturerInfo = null;
			PharmaApplicationPayment pharmaceuticalPaymentInDrug = null;
			try {
				drugInfo = PharmaDrugInfoLocalServiceUtil.findBygetPharmaByAppId(pharmaApplicationId);
			}catch (Exception e) {
			}try {
				pharmaManufacturerInfo = PharmaManufacturerInfoLocalServiceUtil
						.findBygetPharmaByAppId(pharmaApplicationId);
			} catch (Exception e) {
			}
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "pharmaceutical_drug_form");
//			for sending PDF in the lanch case 
			if (checkPdfDownloadWithDoc.equals("false")) {
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"pharmaceutical_drug_form-1");
			}
			try {
				pdfTemplate = StringUtil.replace(pdfTemplate,
						new String[] { "[$ROPP_BrandTradeNameOfDrug$]",
								"[$ROPP_GenericNameOrNonProprietaryDesignationOfDrug$]", "[$ROPP_DosageForm$]",
								"[$ROPP_RouteOfAdministration$]", "[$ROPP_DispensingConditionInCountryOfOrigin$]",
								"[$ROPP_NameOfManufacturer$]", "[$ROPP_NameAndAddressOfManufacturer$]",
								"[$ROPP_NameOfLicenceHolder$]", "[$ROPP_NameAndAddressOfLicenceHolder$]",
								"[$ROPP_NameOfMarketingAuthorizationHolder$]",
								"[$ROPP_NameAndAddressOfMarketingAuthorizationHolder$]", "[$NameOfREGULATORYoFFICER$]",
								"[$ROPP_NameAndContactInformationOfRegulatoryOfficer$]", "[$NameOfAPPLICANT$]",
								"[$ROPP_ApplicantAddress$]", "[$ROPP_NameOfLocalRepresentative$]",
								"[$ROPP_NameAddressAndContactInformationOfLocalRepresentative$]",
								"[$ROPP_LocalRepresentativeTelephone$]", "[$ROPP_NameOfLocalDistributor$]",
								"[$ROPP_NameAddressAndContactInformationOfLocalDistributor$]",
								"[$ROPP_ContactInformationOfLocalDistributor$]", "[$Date$]" },

						new String[] { Validator.isNotNull(drugInfo) ? drugInfo.getPharmaDrugBrandName() : "",
								Validator.isNotNull(drugInfo) ? drugInfo.getPharmaDrugDeisgnation() : "",
								Validator.isNotNull(drugInfo) ? drugInfo.getPharmaDosageForm() : "",
								Validator.isNotNull(drugInfo) ? drugInfo.getPharmaAdministrationRoute() : "",
								Validator.isNotNull(drugInfo) ? drugInfo.getPharmaOriginDispensing() : "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaDrugManufacturerName()
										: "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaDrugManufacturerAdd()
										: "",
								Validator.isNotNull(drugInfo) ? drugInfo.getPharmaLicenseHolderName() : "",
								Validator.isNotNull(drugInfo) ? drugInfo.getPharmaLicenseHolderAddress() : "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaMarketAuthName()
										: "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaMarketAuthAddress()
										: "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaReguOfficerName()
										: "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaLocalReprContact()
										: "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaDrugApplicName()
										: "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaDrugApplicAddress()
										: "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaLocalReprName()
										: "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaLocalReprAdd()
										: "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaLocalReprContact()
										: "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaLocalDistName()
										: "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaLocalDistAddress()
										: "",
								Validator.isNotNull(pharmaManufacturerInfo)
										? pharmaManufacturerInfo.getPharmaLocalDistContact()
										: "",
								Validator.isNotNull(pharmaApplication)
										? dateFormat.format(pharmaApplication.getCreateDate())
										: "" });
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (!checkPdfDownloadWithDoc.equals("false")) {
				String title = "";
				String fileName = "";
				String twoCopies = "";
				String detailsOftests = "";
				String controlOfActive = "";
				String descriptionOfTheManu = "";
				String summaryOfClinical = "";
				String certificateOfAnalysis = "";
				String finishedProduct = "";
				String threeCopies = "";
				String certificateOfPharma = "";
				String goodManufacturing = "";
				String copyOfLicence = "";
				String companyProfile = "";
				String copiesOfAgreements = "";
				String representativeAuthorization = "";
				String statementShowing = "";
				String stabilityStudy = "";
				String copyOfProduct = "";
				if (Validator.isNotNull(supportingDocumentsFolder)) {
					List<PharmaDocumentList> pharmaSupportingDocList = PharmaDocumentListLocalServiceUtil
							.getPharmaDocListByAppId("New Pharmaceutical Drug");
					for (PharmaDocumentList pharmaSupportingDoc : pharmaSupportingDocList) {
						try {
							FileEntry fileEntry = null;
							fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
									supportingDocumentsFolder.getFolderId(), pharmaSupportingDoc.getPharmaDocList());
							fileName = fileEntry.getFileName();
							title = fileEntry.getTitle();
						} catch (Exception a) {
						}
						if (title.equals("Two copies of a summarized Product Characteristics (SmPC)")) {
							twoCopies = fileName;
						} else if (title.equals("Details of the tests conducted")) {
							detailsOftests = fileName;
						} else if (title.equals("Control of active ingredient(s) and final product")) {
							controlOfActive = fileName;
						} else if (title.equals("Description of the Manufacturing Process of Final Product")) {
							descriptionOfTheManu = fileName;
						} else if (title.equals("Summary of Clinical/Non- Clinical Studies")) {
							summaryOfClinical = fileName;
						} else if (title.equals("Certificate of Analysis")) {
							certificateOfAnalysis = fileName;
						} else if (title.equals("Finished product specification and method of analysis (2 copies)")) {
							finishedProduct = fileName;
						} else if (title.equals("Three (3) copies of a draft of every label")) {
							threeCopies = fileName;
						} else if (title.equals("A Certificate of a Pharmaceutical Product")) {
							certificateOfPharma = fileName;
						} else if (title.equals("Good Manufacturing Practices Certificate")) {
							goodManufacturing = fileName;
						} else if (title.equals("Copy of License to Manufacture")) {
							copyOfLicence = fileName;
						} else if (title.equals("Company profile document for new manufacturers")) {
							companyProfile = fileName;
						} else if (title.equals(
								"Copies of agreements/ contracts between parties involved in the manufacturing and marketing of a product.")) {
							copiesOfAgreements = fileName;
						} else if (title
								.equals("Representatives Authorization: Document granted by the drug holder.")) {
							representativeAuthorization = fileName;
						} else if (title.equals(
								"A statement showing the countries in which the product has been approved and or refused")) {
							statementShowing = fileName;
						} else if (title.equals("Stability study protocol and results for ICH Stability Zone IV")) {
							stabilityStudy = fileName;
						} else if (title.equals("Copy of Product License issued by the drug regulatory authority")) {
							copyOfProduct = fileName;
						}
					}
				}
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//					for the document 
						"[$summarizedProductCharacteristics$]", "[$TestsConducted$]", "[$ActiveIngredient$]",
						"[$ManufacturingProcessOfFinalProduct$]", "[$ClinicalAndNonClinical$]",
						"[$CertificateOfAnalysis$]", "[$ProductSpecification$]", "[$DraftOfEveryLabel$]",
						"[$CertificateOfPharmaceuticalProduct$]", "[$GoodManufacturingPracticesCertificate$]",
						"[$LicenseToManufacture$]", "[$DocumentForNewManufacturers$]",
						"[$ManufacturingAndMarketingOfProduct$]", "[$RepresentativesAuthorization$]",
						"[$ProductApprovedOrRefused$]", "[$ StabilityStudyProtocol$]",
						"[$ CopyOfProductLicenseIssued$]" },
						new String[] { twoCopies, detailsOftests, controlOfActive, descriptionOfTheManu,
								summaryOfClinical, certificateOfAnalysis, finishedProduct, threeCopies,
								certificateOfPharma, goodManufacturing, copyOfLicence, companyProfile,
								copiesOfAgreements, representativeAuthorization, statementShowing, stabilityStudy,
								copyOfProduct });

				try {
					pharmaceuticalPaymentInDrug = PharmaApplicationPaymentLocalServiceUtil
							.getPharmaApplicationPaymentbyPharmaApplicationId(pharmaApplicationId);
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$PaymentMethod$]" },
							new String[] { Validator.isNotNull(pharmaceuticalPaymentInDrug)
									? pharmaceuticalPaymentInDrug.getPaymentMethod()
									: "" });
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		else if (pharmaApplication.getTypeOfPharmaProduct().equals("Medical Device")) {
			PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo = null;
			PharmaApplicationPayment pharmaceuticalPaymentInMedicalDevice = null;
			try {
				pharmaMedicalDeviceInfo = PharmaMedicalDeviceInfoLocalServiceUtil
						.findBygetPharmaByAppId(pharmaApplicationId);
			} catch (Exception e) {
			}
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
					"pharmaceutical_medical_device_form-1");
//			this check for sending PDF in the lanch case
			if (checkPdfDownloadWithDoc.equals("false")) {
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"pharmaceutical_medical_device_form");
			}
			try {
				pdfTemplate = StringUtil.replace(pdfTemplate,
						new String[] { "[$ROPP_NameOfDevice$]", "[$ROPP_NonProprietaryDesignationOfDevice$]",
								" [$ROPP_NameOfManufacturer$]", "[$ROPP_NameAndAddressOfManufacturer$]",
								"[$NAMEofAPPLICANT$]", "[$ROPP_ApplicantAddress$]",
								"[$ROPP_NameOfLocalRepresentative$]",
								"[$ROPP_NameAddressAndContactInformationOfLocalRepresentative$]",
								"[$Date$]" },

						new String[] {
								Validator.isNotNull(pharmaMedicalDeviceInfo)
										? pharmaMedicalDeviceInfo.getPharmaDeviceName()
										: "",
								Validator.isNotNull(pharmaMedicalDeviceInfo)
										? pharmaMedicalDeviceInfo.getPharmaDeviceDeisgnation()
										: "",
								Validator.isNotNull(pharmaMedicalDeviceInfo)
										? pharmaMedicalDeviceInfo.getPharmaManufacturerName()
										: "",
								Validator.isNotNull(pharmaMedicalDeviceInfo)
										? pharmaMedicalDeviceInfo.getPharmaManufacturerAddress()
										: "",
								Validator.isNotNull(pharmaMedicalDeviceInfo)
										? pharmaMedicalDeviceInfo.getPharmaMedicalApplicantName()
										: "",
								Validator.isNotNull(pharmaMedicalDeviceInfo)
										? pharmaMedicalDeviceInfo.getPharmaMedicalApplicantAddress()
										: "",
								Validator.isNotNull(pharmaMedicalDeviceInfo)
										? pharmaMedicalDeviceInfo.getPharmaRepresentativeName()
										: "",
								Validator.isNotNull(pharmaMedicalDeviceInfo)
										? pharmaMedicalDeviceInfo.getPharmaRepresentativeAddress()
										: "",
								Validator.isNotNull(pharmaApplication)
										? dateFormat.format(pharmaApplication.getCreateDate())
										: ""

						});
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (!checkPdfDownloadWithDoc.equals("false")) {
				String title = "";
				String fileName = "";
				String twoCopies = "";
				String detailsOftests = "";
				String summaryOfEffect = "";
				String certificateOfAnalysis = "";
				String threeCopies = "";
				String threeSamples = "";
				String manufacturingProcesses = "";
				String thePremarket = "";
				String packageInsert = "";
				String informationBrochure = "";
				String statementShowing = "";

				if (Validator.isNotNull(supportingDocumentsFolder)) {
					List<PharmaDocumentList> pharmaSupportingDocList = PharmaDocumentListLocalServiceUtil
							.getPharmaDocListByAppId("Medical Device");
					for (PharmaDocumentList pharmaSupportingDoc : pharmaSupportingDocList) {
						FileEntry fileEntry = null;
						try {
							fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
									supportingDocumentsFolder.getFolderId(), pharmaSupportingDoc.getPharmaDocList());
							fileName = fileEntry.getFileName();
							title = fileEntry.getTitle();
						} catch (Exception e) {
						}
						if (title.equals("Three copies of a summarized statement")) {
							twoCopies = fileName;
						} else if (title.equals("Details of the tests conducted")) {
							detailsOftests = fileName;
						} else if (title.equals("Summary of Effectiveness and Safety")) {
							summaryOfEffect = fileName;
						} else if (title.equals("A Certificate of Analysis")) {
							certificateOfAnalysis = fileName;
						} else if (title.equals("Three (3) copies of a draft of every label")) {
							threeCopies = fileName;
						} else if (title.equals("Three (3) samples of the device in the finished form")) {
							threeSamples = fileName;
						} else if (title
								.equals("Manufacturing processes and the quality assurance programme designed")) {
							manufacturingProcesses = fileName;
						} else if (title.equals("The Premarket Approval")) {
							thePremarket = fileName;
						} else if (title.equals("Package insert for physicians")) {
							packageInsert = fileName;
						} else if (title.equals("Information brochure for patients")) {
							informationBrochure = fileName;
						} else if (title.equals(
								"A statement showing the countries in which the product has been approved and or refused")) {
							statementShowing = fileName;
						}
					}
				}
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//				for the document 
						"[$SummarizedStatement$]", "[$TestsConducted$]", "[$EffectivenessAndSafety$]",
						"[$CertificateOfAnalysis$]", "[$DraftOfEveryLabel$]", "[$FinishedForm$]",
						"[$QualityAssuranceProgrammeDesigned$]", "[$ThePremarketApproval$]",
						"[$PackageInsertForPhysicians$]", "[$InformationBrochureForPatients$]",
						"[$ApprovedAndRefused$]" },
						new String[] { twoCopies, detailsOftests, summaryOfEffect, certificateOfAnalysis, threeCopies,
								threeSamples, manufacturingProcesses, thePremarket, packageInsert, informationBrochure,
								statementShowing });
				
				try {
					pharmaceuticalPaymentInMedicalDevice = PharmaApplicationPaymentLocalServiceUtil
							.getPharmaApplicationPaymentbyPharmaApplicationId(pharmaApplicationId);
				} catch (Exception e) {
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$PaymentMethod$]" },
							new String[] { Validator.isNotNull(pharmaceuticalPaymentInMedicalDevice)
									? pharmaceuticalPaymentInMedicalDevice.getPaymentMethod()
									: "" });
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return pdfTemplate;
	}

	@Override
	public String replaceAgriculturePdfVar(long agricultureApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		String pdfTemplate = AgricultureApplicationPdf.AgricutureApplicationPdf(agricultureApplicationId, themeDisplay, checkPdfSendingInLaunchCaseWithoutDoc);
				return pdfTemplate;
	}
	
	

//public String replaceFireBirgadeApplicationPdfVar(long fireBrigadeApplicationId, ThemeDisplay themeDisplay,
//String checkPdfDownloadWithoutDocument) throws PortalException {
//FireBrigadeApplication fbApplication = null;
//try {
//fbApplication = FireBrigadeApplicationLocalServiceUtil.getFireBrigadeApplication(fireBrigadeApplicationId);
//} catch (Exception e) {
//}
//String pdfTemplate = FireBirgadeApplicationPdf.fireBrigadeAppPdf(fireBrigadeApplicationId, themeDisplay,
//    checkPdfDownloadWithoutDocument);
//
//return pdfTemplate;
//}

	@Override
	public String replaceFarmerPdfVar(long farmerApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

		FarmerApplication farmerApplication = null;
		FarmerStakeholderInfo stakeHolder = null;
		FarmerStakeholderAddress stakeholderResidentialAddressInfo = null;
		FarmerStakeholderAddress stakeholderBusinessAddressInfoAddress = null;
		List<FarmerProperty> farmerProperty = null;
		List<FarmerProfile> farmerProfile = null;
		List<FarmerCrop> farmerCrop = null;
		List<FarmerCropPractice> farmerCropPractice = null;
		List<FarmerLivestock> farmerLiveStock = null;
		List<FarmerlivestockPractice> farmerLiveStockPractice = null;

		try {
			farmerApplication = FarmerApplicationLocalServiceUtil.getFarmerApplication(farmerApplicationId);
		}catch (Exception e) {
		}try {
			stakeHolder = FarmerStakeholderInfoLocalServiceUtil.fetchBygetFA_FSH_by_AppId(farmerApplicationId);
		}catch (Exception e) {
		}try {
			stakeholderResidentialAddressInfo = FarmerStakeholderAddressLocalServiceUtil.getFA_FSI_AT(
					CommonsUtilWorkFlowConstants.RESIDENTIAL_ADDRESS, stakeHolder.getFarmerStakeholderInfoId());
		}catch (Exception e) {
		}try {
			stakeholderBusinessAddressInfoAddress = FarmerStakeholderAddressLocalServiceUtil.getFA_FSI_AT(
					CommonsUtilWorkFlowConstants.BUSINESS_ADDRESS, stakeHolder.getFarmerStakeholderInfoId());
		}catch (Exception e) {
		}try {
			farmerProperty = FarmerPropertyLocalServiceUtil.getFA_FPR_FAI(farmerApplicationId);
		}catch (Exception e) {
		}try {
			farmerProfile = FarmerProfileLocalServiceUtil.getFA_FP_FAI(farmerApplicationId);
		}catch (Exception e) {
		}try {
			farmerCrop = FarmerCropLocalServiceUtil.getFA_FCP_FAI(farmerApplicationId);
		}catch (Exception e) {
		}try {
			farmerCropPractice = FarmerCropPracticeLocalServiceUtil.getFA_FFCP_FAI(farmerApplicationId);
		}catch (Exception e) {
		}try {
			farmerLiveStock = FarmerLivestockLocalServiceUtil.getFA_FLS_FAI(farmerApplicationId);
		}catch (Exception e) {
		}try {
			farmerLiveStockPractice = FarmerlivestockPracticeLocalServiceUtil.getFA_FLSP_FAI(farmerApplicationId);
		} catch (Exception e) {
		}
		pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "farm");
		if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "farm_form");
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//			for the stakeholder form				
					"[$PIRP_CompanyNameIfAny$]", "[$PIRP_FirstName$]", "[$PIRP_MiddleName$]", "[$PIRP_LastName$]",
					"[$PIRP_Alias$]", "[$PIRP_ResidentialAddressStreet$]", "[$PIRP_ResidentialAddressDistrict$]",
					"[$PIRP_ResidentialAddressPostOffice$]", "[$PIRP_ResidentialAddressParish$]",
					"[$PIRP_ResidentialAddressTelephone$]", "[$PIRP_BusinessAddressStreet$]",
					"[$PIRP_BusinessAddressDistrict$]", "[$PostOffice$]", "[$PIRP_BusinessAddressParish$]",
					"[$PIRP_BusinessAddressTelephone$]", "[$PIRP_IDType$]", "[$PIRP_ID$]", "[$PIRP_Gender$]",
					"[$PIRP_DateofBirth$]", "[$PIRP_TRN$]", "[$PIRP_CellPhone$]", "[$PIRP_Fax$]", "[$PIRP_Email$]"

//				     for the profile form

					, "[$PIRP_Respondent$]", "[$PIRP_Manager$]", "[$PIRP_Liveonfarm$]", "[$PIRP_Livelihood$]",
					"[$PIRP_EducationLevel$]", "[$PIRP_MainOccupation$]", "[$PIRP_AgriInstitution$]",
					"[$PIRP_Qualification$]", "[$PIRP_AgriTrainingYN$]", "[$PIRP_TrainingMethod$]",
					"[$PIRP_MainAgriActivity$]", "[$PIRP_NearestPoliceStation$]", "[$PIRP_JASBranchFarmersGroup$]",
					"[$PIRP_HoldingStartYear$]", "[$PIRP_FarmerType$]", "[$PIRP_ProfRemarks$]",
					"[$MainInformationSources$]",

//					for the property
					"[$Extension1$]", "[$District1$]", "[$Tenure1$]", "[$Status1$]", "[$StArea1$]", "[$StUnits1$]",
					"[$UsArea1$]", "[$UsUnits1$]", "[$Volume1$]", "[$Folio1$]", "[$Road1$]", "[$PrRemarks$]",
					"[$Extension2$]", "[$District2$]", "[$Tenure2$]", "[$Status2$]", "[$StArea2$]", "[$StUnits2$]",
					"[$UsArea2$]", "[$UsUnits2$]", "[$Volume2$]", "[$Folio2$]", "[$Road2$]", "[$PrRemarks2$]",
					"[$Extension3$]", "[$District3$]", "[$Tenure3$]", "[$Status3$]", "[$StArea3$]", "[$StUnits3$]",
					"[$UsArea3$]", "[$UsUnits3$]", "[$Volume3$]", "[$Folio3$]", "[$Road3$]", "[$PrRemarks3$]",
					"[$Extension4$]", "[$District4$]", "[$Tenure4$]", "[$Status4$]", "[$StArea4$]", "[$StUnits4$]",
					"[$UsArea4$]", "[$UsUnits4$]", "[$Volume4$]", "[$Folio4$]", "[$Road4$]", "[$PrRemarks4$]",
					"[$Extension5$]", "[$District5$]", "[$Tenure5$]", "[$Status5$]", "[$StArea5$]", "[$StUnits5$]",
					"[$UsArea5$]", "[$UsUnits5$]", "[$Volume5$]", "[$Folio5$]", "[$Road5$]", "[$PrRemarks5$]",
//			for the crop

					"[$Variety1$]", "[$Area1$]", "[$Unit1$]", "[$CrCount1$]", "[$Planting1$]", "[$Major1$]",
					"[$MSold1$]", "[$Minor1$]", "[$MiSold$]", "[$CrRemarks1$]", "[$Variety2$]", "[$Area2$]",
					"[$Unit2$]", "[$CrCount2$]", "[$Planting2$]", "[$Major2$]", "[$MSold2$]", "[$Minor2$]",
					"[$MiSold2$]", "[$CrRemarks2$]", "[$Variety3$]", "[$Area3$]", "[$Unit3$]", "[$CrCount3$]",
					"[$Planting3$]", "[$Major3$]", "[$MSold3$]", "[$Minor3$]", "[$MiSold3$]", "[$CrRemarks3$]",
					"[$Variety4$]", "[$Area4$]", "[$Unit4$]", "[$CrCount4$]", "[$Planting4$]", "[$Major4$]",
					"[$MSold4$]", "[$Minor4$]", "[$MiSold4$]", "[$CrRemarks4$]", "[$Variety5$]", "[$Area5$]",
					"[$Unit5$]", "[$CrCount5$]", "[$Planting5$]", "[$Major5$]", "[$MSold5$]", "[$Minor5$]",
					"[$MiSold5$]", "[$CrRemarks5$]",

//			for the crop practice
					"[$Land1$]", "[$Manage1$]", "[$Nutrient1$]", "[$Irrigation1$]", "[$harvest1$]", "[$CRemarks1$]",
					"[$Land2$]", "[$Manage2$]", "[$Nutrient2$]", "[$Irrigation2$]", "[$harvest2$]", "[$CRemarks2$]",
					"[$Land3$]", "[$Manage3$]", "[$Nutrient3$]", "[$Irrigation3$]", "[$harvest3$]", "[$CRemarks3$]",
					"[$Land4$]", "[$Manage4$]", "[$Nutrient4$]", "[$Irrigation4$]", "[$harvest4$]", "[$CRemarks4$]",
					"[$Land5$]", "[$Manage5$]", "[$Nutrient5$]", "[$Irrigation5$]", "[$harvest5$]", "[$CRemarks5$]",

//		for the livestock

					"[$Livestock1$]", "[$Stage of Life1$]", "[$Count1$]", "[$Colonies1$]", "[$Capacity1$]",
					"[$MajorInLive1$]", "[$MaSold1$]", "[$MinorInLive1$]", "[$MiSold1$]", "[$LiRemarks1$]",
					"[$Livestock2$]", "[$Stage of Life2$]", "[$Count2$]", "[$Colonies2$]", "[$Capacity2$]",
					"[$MajorInLive2$]", "[$MaSold2$]", "[$MinorInLive2$]", "[$MiSold2$]", "[$LiRemarks2$]",
					"[$Livestock3$]", "[$Stage of Life3$]", "[$Count3$]", "[$Colonies3$]", "[$Capacity3$]",
					"[$MajorInLive3$]", "[$MaSold3$]", "[$MinorInLive3$]", "[$MiSold3$]", "[$LiRemarks3$]",
					"[$Livestock4$]", "[$Stage of Life4$]", "[$Count4$]", "[$Colonies4$]", "[$Capacity4$]",
					"[$MajorInLive4$]", "[$MaSold4$]", "[$MinorInLive4$]", "[$MiSold4$]", "[$LiRemarks4$]",
					"[$Livestock5$]", "[$Stage of Life5$]", "[$Count5$]", "[$Colonies5$]", "[$Capacity5$]",
					"[$MajorInLive5$]", "[$MaSold5$]", "[$MinorInLive5$]", "[$MiSold5$]", "[$LiRemarks5$]",

//       for the livestock practice

					"[$Husbandry1$]", "[$Care1$]", "[$NutrientInLivePractice1$]", "[$LiWater1$]", "[$Post1$]",
					"[$Remark1$]", "[$Husbandry2$]", "[$Care2$]", "[$NutrientInLivePractice2$]", "[$LiWater2$]",
					"[$Post2$]", "[$Remark2$]", "[$Husbandry3$]", "[$Care3$]", "[$NutrientInLivePractice3$]",
					"[$LiWater3$]", "[$Post3$]", "[$Remark3$]", "[$Husbandry4$]", "[$Care4$]",
					"[$NutrientInLivePractice4$]", "[$LiWater4$]", "[$Post4$]", "[$Remark4$]", "[$Husbandry5$]",
					"[$Care5$]", "[$NutrientInLivePractice5$]", "[$LiWater5$]", "[$Post5$]", "[$Remark5$]",
					"[$Date$]" },

					new String[] {
//						for the stakeholder form	

							Validator.isNotNull(stakeHolder) ? stakeHolder.getCompanyName() : "",
							Validator.isNotNull(stakeHolder) ? stakeHolder.getFirstName() : "",
							Validator.isNotNull(stakeHolder) ? stakeHolder.getMiddleName() : "",
							Validator.isNotNull(stakeHolder) ? stakeHolder.getLastName() : "",
							Validator.isNotNull(stakeHolder) ? stakeHolder.getAlias() : "",
							Validator.isNotNull(stakeholderResidentialAddressInfo)
									? stakeholderResidentialAddressInfo.getStreetName()
									: "",
							Validator.isNotNull(stakeholderResidentialAddressInfo)
									? stakeholderResidentialAddressInfo.getDistrict()
									: "",
							Validator.isNotNull(stakeholderResidentialAddressInfo)
									? stakeholderResidentialAddressInfo.getPostoffice()
									: "",
							Validator.isNotNull(stakeholderResidentialAddressInfo)
									? stakeholderResidentialAddressInfo.getParish()
									: "",
							Validator.isNotNull(stakeholderResidentialAddressInfo)
									? stakeholderResidentialAddressInfo.getTelephoneNumber()
									: "",
							Validator.isNotNull(stakeholderBusinessAddressInfoAddress)
									? stakeholderBusinessAddressInfoAddress.getStreetName()
									: "",
							Validator.isNotNull(stakeholderBusinessAddressInfoAddress)
									? stakeholderBusinessAddressInfoAddress.getDistrict()
									: "",
							Validator.isNotNull(stakeholderBusinessAddressInfoAddress)
									? stakeholderBusinessAddressInfoAddress.getPostoffice()
									: "",
							Validator.isNotNull(stakeholderBusinessAddressInfoAddress)
									? stakeholderBusinessAddressInfoAddress.getParish()
									: "",
							Validator.isNotNull(stakeholderBusinessAddressInfoAddress)
									? stakeholderBusinessAddressInfoAddress.getTelephoneNumber()
									: "",
							Validator.isNotNull(stakeHolder) ? stakeHolder.getIdentificationType() : "",
							Validator.isNotNull(stakeHolder) ? stakeHolder.getIdentificationNumber() : "",
							Validator.isNotNull(stakeHolder) ? stakeHolder.getGender() : "",
							stakeHolder != null && stakeHolder.getDateOfBirth() != null
									? new SimpleDateFormat("yyyy-MM-dd").format(stakeHolder.getDateOfBirth())
									: StringPool.BLANK,
							Validator.isNotNull(stakeHolder) ? stakeHolder.getTaxpayerRegistrationNumber() : "",
							Validator.isNotNull(stakeHolder) ? stakeHolder.getCellPhone() : "",
							Validator.isNotNull(stakeHolder) ? stakeHolder.getFax() : "",
							Validator.isNotNull(stakeHolder) ? stakeHolder.getEmailAddress() : "",

//				for the profile form
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getRespondent().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getManager().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getLiveOnFarm().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getLivelihood().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getEducationLevel().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getMainOccupation().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getAgriiInstitution().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getQualification().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getAgriTraining().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getTrainingMethod().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getMainAgriActivity().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getNeareshPoliceStation().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getJasBranchGroup().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getHoldingStartYear().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getFarmerType().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getRemarks().toString()
									: "",
							Validator.isNotNull(farmerProfile) && farmerProfile.size() > 0
									? farmerProfile.get(0).getMainInformationSources().toString()
									: "",

//              for the property
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 0
									? farmerProperty.get(0).getProperty01Extension()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 0
									? farmerProperty.get(0).getProperty01District()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 0
									? farmerProperty.get(0).getProperty01Tenure()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 0
									? farmerProperty.get(0).getProperty01Status()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 0
									? farmerProperty.get(0).getProperty01Size()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 0
									? farmerProperty.get(0).getPropertyId02()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 0
									? farmerProperty.get(0).getProperty01Usage()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 0
									? farmerProperty.get(0).getPropertyId03()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 0
									? farmerProperty.get(0).getProperty01Volume()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 0
									? farmerProperty.get(0).getProperty01Folio()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 0
									? farmerProperty.get(0).getProperty01DistanceFromRoad()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 0
									? farmerProperty.get(0).getRemarks()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 1
									? farmerProperty.get(1).getProperty01Extension()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 1
									? farmerProperty.get(1).getProperty01District()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 1
									? farmerProperty.get(1).getProperty01Tenure()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 1
									? farmerProperty.get(1).getProperty01Status()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 1
									? farmerProperty.get(1).getProperty01Size()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 1
									? farmerProperty.get(1).getPropertyId02()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 1
									? farmerProperty.get(1).getProperty01Usage()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 1
									? farmerProperty.get(1).getPropertyId03()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 1
									? farmerProperty.get(1).getProperty01Volume()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 1
									? farmerProperty.get(1).getProperty01Folio()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 1
									? farmerProperty.get(1).getProperty01DistanceFromRoad()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 1
									? farmerProperty.get(1).getRemarks()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 2
									? farmerProperty.get(2).getProperty01Extension()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 2
									? farmerProperty.get(2).getProperty01District()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 2
									? farmerProperty.get(2).getProperty01Tenure()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 2
									? farmerProperty.get(2).getProperty01Status()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 2
									? farmerProperty.get(2).getProperty01Size()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 2
									? farmerProperty.get(2).getPropertyId02()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 2
									? farmerProperty.get(2).getProperty01Usage()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 2
									? farmerProperty.get(2).getPropertyId03()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 2
									? farmerProperty.get(2).getProperty01Volume()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 2
									? farmerProperty.get(2).getProperty01Folio()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 2
									? farmerProperty.get(2).getProperty01DistanceFromRoad()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 2
									? farmerProperty.get(2).getRemarks()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 3
									? farmerProperty.get(3).getProperty01Extension()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 3
									? farmerProperty.get(3).getProperty01District()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 3
									? farmerProperty.get(3).getProperty01Tenure()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 3
									? farmerProperty.get(3).getProperty01Status()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 3
									? farmerProperty.get(3).getProperty01Size()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 3
									? farmerProperty.get(3).getPropertyId02()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 3
									? farmerProperty.get(3).getProperty01Usage()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 3
									? farmerProperty.get(3).getPropertyId03()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 3
									? farmerProperty.get(3).getProperty01Volume()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 3
									? farmerProperty.get(3).getProperty01Folio()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 3
									? farmerProperty.get(3).getProperty01DistanceFromRoad()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 3
									? farmerProperty.get(3).getRemarks()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 4
									? farmerProperty.get(4).getProperty01Extension()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 4
									? farmerProperty.get(4).getProperty01District()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 4
									? farmerProperty.get(4).getProperty01Tenure()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 4
									? farmerProperty.get(4).getProperty01Status()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 4
									? farmerProperty.get(4).getProperty01Size()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 4
									? farmerProperty.get(4).getPropertyId02()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 4
									? farmerProperty.get(4).getProperty01Usage()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 4
									? farmerProperty.get(4).getPropertyId03()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 4
									? farmerProperty.get(4).getProperty01Volume()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 4
									? farmerProperty.get(4).getProperty01Folio()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 4
									? farmerProperty.get(4).getProperty01DistanceFromRoad()
									: "",
							Validator.isNotNull(farmerProperty) && farmerProperty.size() > 4
									? farmerProperty.get(4).getRemarks()
									: "",

//				for the crop
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 0
									? farmerCrop.get(0).getCropAndVariety()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 0 ? farmerCrop.get(0).getArea() : "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 0 ? farmerCrop.get(0).getUnit() : "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 0
									? farmerCrop.get(0).getCropContent()
									: "",
							farmerCrop.size() >= 0 && Validator.isNotNull(farmerCrop.get(0).getPlantingDate())
									? dateFormat.format(farmerCrop.get(0).getPlantingDate())
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 0
									? farmerCrop.get(0).getMajorMarket()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 0
									? farmerCrop.get(0).getMajorMarketPercentSold()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 0
									? farmerCrop.get(0).getMinorMarket()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 0
									? farmerCrop.get(0).getMinorMarketPercentSold()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 0 ? farmerCrop.get(0).getRemarks()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 1
									? farmerCrop.get(1).getCropAndVariety()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 1 ? farmerCrop.get(1).getArea() : "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 1 ? farmerCrop.get(1).getUnit() : "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 1
									? farmerCrop.get(1).getCropContent()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 1
									&& Validator.isNotNull(farmerCrop.get(1).getPlantingDate())
											? dateFormat.format(farmerCrop.get(1).getPlantingDate())
											: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 1
									? farmerCrop.get(1).getMajorMarket()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 1
									? farmerCrop.get(1).getMajorMarketPercentSold()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 1
									? farmerCrop.get(1).getMinorMarket()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 1
									? farmerCrop.get(1).getMinorMarketPercentSold()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 1 ? farmerCrop.get(1).getRemarks()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 2
									? farmerCrop.get(2).getCropAndVariety()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 2 ? farmerCrop.get(2).getArea() : "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 2 ? farmerCrop.get(2).getUnit() : "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 2
									? farmerCrop.get(2).getCropContent()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 2
									&& Validator.isNotNull(farmerCrop.get(2).getPlantingDate())
											? dateFormat.format(farmerCrop.get(2).getPlantingDate())
											: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 2
									? farmerCrop.get(2).getMajorMarket()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 2
									? farmerCrop.get(2).getMajorMarketPercentSold()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 2
									? farmerCrop.get(2).getMinorMarket()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 2
									? farmerCrop.get(2).getMinorMarketPercentSold()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 2 ? farmerCrop.get(2).getRemarks()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 3
									? farmerCrop.get(3).getCropAndVariety()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 3 ? farmerCrop.get(3).getArea() : "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 3 ? farmerCrop.get(3).getUnit() : "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 3
									? farmerCrop.get(3).getCropContent()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 3
									&& Validator.isNotNull(farmerCrop.get(3).getPlantingDate())
											? dateFormat.format(farmerCrop.get(3).getPlantingDate())
											: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 3
									? farmerCrop.get(3).getMajorMarket()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 3
									? farmerCrop.get(3).getMajorMarketPercentSold()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 3
									? farmerCrop.get(3).getMinorMarket()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 3
									? farmerCrop.get(3).getMinorMarketPercentSold()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 3 ? farmerCrop.get(3).getRemarks()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 4
									? farmerCrop.get(4).getCropAndVariety()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 4 ? farmerCrop.get(4).getArea() : "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 4 ? farmerCrop.get(4).getUnit() : "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 4
									? farmerCrop.get(4).getCropContent()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 4
									&& Validator.isNotNull(farmerCrop.get(4).getPlantingDate())
											? dateFormat.format(farmerCrop.get(4).getPlantingDate())
											: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 4
									? farmerCrop.get(4).getMajorMarket()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 4
									? farmerCrop.get(4).getMajorMarketPercentSold()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 4
									? farmerCrop.get(4).getMinorMarket()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 4
									? farmerCrop.get(4).getMinorMarketPercentSold()
									: "",
							Validator.isNotNull(farmerCrop) && farmerCrop.size() > 4 ? farmerCrop.get(4).getRemarks()
									: "",
//			for the crop practice 
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 0
									? farmerCropPractice.get(0).getCrop1landPrepration()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 0
									? farmerCropPractice.get(0).getCrop1CropCare()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 0
									? farmerCropPractice.get(0).getCrop02()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 0
									? farmerCropPractice.get(0).getCrop1water()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 0
									? farmerCropPractice.get(0).getCrop1postHarvest()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 0
									? farmerCropPractice.get(0).getCrop03()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 1
									? farmerCropPractice.get(1).getCrop1landPrepration()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 1
									? farmerCropPractice.get(1).getCrop1CropCare()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 1
									? farmerCropPractice.get(1).getCrop02()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 1
									? farmerCropPractice.get(1).getCrop1water()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 1
									? farmerCropPractice.get(1).getCrop1postHarvest()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 1
									? farmerCropPractice.get(1).getCrop03()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 2
									? farmerCropPractice.get(2).getCrop1landPrepration()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 2
									? farmerCropPractice.get(2).getCrop1CropCare()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 2
									? farmerCropPractice.get(2).getCrop02()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 2
									? farmerCropPractice.get(2).getCrop1water()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 2
									? farmerCropPractice.get(2).getCrop1postHarvest()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 2
									? farmerCropPractice.get(2).getCrop03()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 3
									? farmerCropPractice.get(3).getCrop1landPrepration()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 3
									? farmerCropPractice.get(3).getCrop1CropCare()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 3
									? farmerCropPractice.get(3).getCrop02()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 3
									? farmerCropPractice.get(3).getCrop1water()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 3
									? farmerCropPractice.get(3).getCrop1postHarvest()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 3
									? farmerCropPractice.get(3).getCrop03()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 4
									? farmerCropPractice.get(4).getCrop1landPrepration()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 4
									? farmerCropPractice.get(4).getCrop1CropCare()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 4
									? farmerCropPractice.get(4).getCrop02()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 4
									? farmerCropPractice.get(4).getCrop1water()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 4
									? farmerCropPractice.get(4).getCrop1postHarvest()
									: "",
							Validator.isNotNull(farmerCropPractice) && farmerCropPractice.size() > 4
									? farmerCropPractice.get(4).getCrop03()
									: "",

//	       for the livestock
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 0
									? farmerLiveStock.get(0).getLivestockBreed()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 0
									? farmerLiveStock.get(0).getStageOflife()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 0
									? farmerLiveStock.get(0).getCount()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 0
									? farmerLiveStock.get(0).getColonies()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 0
									? farmerLiveStock.get(0).getCapacity()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 0
									? farmerLiveStock.get(0).getMajorMarket()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 0
									? farmerLiveStock.get(0).getMajorMarketSold()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 0
									? farmerLiveStock.get(0).getMinorMarket()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 0
									? farmerLiveStock.get(0).getMinorMarketSold()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 0
									? farmerLiveStock.get(0).getRemarks()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 1
									? farmerLiveStock.get(1).getLivestockBreed()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 1
									? farmerLiveStock.get(1).getStageOflife()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 1
									? farmerLiveStock.get(1).getCount()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 1
									? farmerLiveStock.get(1).getColonies()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 1
									? farmerLiveStock.get(1).getCapacity()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 1
									? farmerLiveStock.get(1).getMajorMarket()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 1
									? farmerLiveStock.get(1).getMajorMarketSold()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 1
									? farmerLiveStock.get(1).getMinorMarket()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 1
									? farmerLiveStock.get(1).getMinorMarketSold()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 1
									? farmerLiveStock.get(1).getRemarks()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 2
									? farmerLiveStock.get(2).getLivestockBreed()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 2
									? farmerLiveStock.get(2).getStageOflife()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 2
									? farmerLiveStock.get(2).getCount()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 2
									? farmerLiveStock.get(2).getColonies()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 2
									? farmerLiveStock.get(2).getCapacity()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 2
									? farmerLiveStock.get(2).getMajorMarket()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 2
									? farmerLiveStock.get(2).getMajorMarketSold()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 2
									? farmerLiveStock.get(2).getMinorMarket()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 2
									? farmerLiveStock.get(2).getMinorMarketSold()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 2
									? farmerLiveStock.get(2).getRemarks()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 3
									? farmerLiveStock.get(3).getLivestockBreed()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 3
									? farmerLiveStock.get(3).getStageOflife()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 3
									? farmerLiveStock.get(3).getCount()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 3
									? farmerLiveStock.get(3).getColonies()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 3
									? farmerLiveStock.get(3).getCapacity()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 3
									? farmerLiveStock.get(3).getMajorMarket()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 3
									? farmerLiveStock.get(3).getMajorMarketSold()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 3
									? farmerLiveStock.get(3).getMinorMarket()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 3
									? farmerLiveStock.get(3).getMinorMarketSold()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 3
									? farmerLiveStock.get(3).getRemarks()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 4
									? farmerLiveStock.get(4).getLivestockBreed()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 4
									? farmerLiveStock.get(4).getStageOflife()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 4
									? farmerLiveStock.get(4).getCount()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 4
									? farmerLiveStock.get(4).getColonies()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 4
									? farmerLiveStock.get(4).getCapacity()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 4
									? farmerLiveStock.get(4).getMajorMarket()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 4
									? farmerLiveStock.get(4).getMajorMarketSold()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 4
									? farmerLiveStock.get(4).getMinorMarket()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 4
									? farmerLiveStock.get(4).getMinorMarketSold()
									: "",
							Validator.isNotNull(farmerLiveStock) && farmerLiveStock.size() > 4
									? farmerLiveStock.get(4).getRemarks()
									: "",

//		    for the LiveStockPractice
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 0
									? farmerLiveStockPractice.get(0).getHusbandry()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 0
									? farmerLiveStockPractice.get(0).getLiveStockCare()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 0
									? farmerLiveStockPractice.get(0).getNutrient()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 0
									? farmerLiveStockPractice.get(0).getWater()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 0
									? farmerLiveStockPractice.get(0).getPostHarvest()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 0
									? farmerLiveStockPractice.get(0).getRemarks()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 1
									? farmerLiveStockPractice.get(1).getHusbandry()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 1
									? farmerLiveStockPractice.get(1).getLiveStockCare()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 1
									? farmerLiveStockPractice.get(1).getNutrient()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 1
									? farmerLiveStockPractice.get(1).getWater()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 1
									? farmerLiveStockPractice.get(1).getPostHarvest()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 1
									? farmerLiveStockPractice.get(1).getRemarks()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 2
									? farmerLiveStockPractice.get(2).getHusbandry()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 2
									? farmerLiveStockPractice.get(2).getLiveStockCare()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 2
									? farmerLiveStockPractice.get(2).getNutrient()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 2
									? farmerLiveStockPractice.get(2).getWater()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 2
									? farmerLiveStockPractice.get(2).getPostHarvest()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 2
									? farmerLiveStockPractice.get(2).getRemarks()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 3
									? farmerLiveStockPractice.get(3).getHusbandry()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 3
									? farmerLiveStockPractice.get(3).getLiveStockCare()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 3
									? farmerLiveStockPractice.get(3).getNutrient()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 3
									? farmerLiveStockPractice.get(3).getWater()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 3
									? farmerLiveStockPractice.get(3).getPostHarvest()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 3
									? farmerLiveStockPractice.get(3).getRemarks()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 4
									? farmerLiveStockPractice.get(4).getHusbandry()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 4
									? farmerLiveStockPractice.get(4).getLiveStockCare()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 4
									? farmerLiveStockPractice.get(4).getNutrient()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 4
									? farmerLiveStockPractice.get(4).getWater()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 4
									? farmerLiveStockPractice.get(4).getPostHarvest()
									: "",
							Validator.isNotNull(farmerLiveStockPractice) && farmerLiveStockPractice.size() > 4
									? farmerLiveStockPractice.get(4).getRemarks()
									: "",
							Validator.isNotNull(farmerApplication)
									? dateFormat.format(farmerApplication.getCreateDate())
									: "" });
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Farmer Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(farmerApplication.getFarmerApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		try {
			String previewUrl = replaceSignature(farmerApplication.getFarmerApplicationId(),
					"Farmer Supported Documents", themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId(), themeDisplay);
			{
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$Signature$]" },
						new String[] { previewUrl });
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			String fileName = null;
			String title = null;
			String taxReceipt = null;
			String proofOfOwnership = null;
			String farmFinancial = null;
			String certifiedPassportPic = null;
			String certifiedCopy = null;

			for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Tax Receipt with - Taxpayer Registration Number")) {
					taxReceipt = fileName;
				} else if (title.equals(
						"Proof of Ownership/Access-land title or documents granting authority to access or use of the property for farming")) {
					proofOfOwnership = fileName;
				} else if (title.equals("Farm Financial Information")) {
					farmFinancial = fileName;
				} else if (title.equals("Certified Passport Pic")) {
					certifiedPassportPic = fileName;
				} else if (title.equals("Certified Copy of Gov.ID ( Document that attract an expiry date)")) {
					certifiedCopy = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//		for the document 

					"[$TaxReceipt$]", "[$ProofOfOwnership$]", "[$FarmFinancialInformation$]",
					"[$CertifiedPassportPic$]", "[$CertifiedCopyOfGovID$]" },
					new String[] { taxReceipt, proofOfOwnership, farmFinancial, certifiedPassportPic, certifiedCopy

					});
		}
		return pdfTemplate;
	}

	@Override
	public String replaceCannabisPdfVar(long cannabisApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		CannabisApplications cannabisApplications = CannabisApplicationsLocalServiceUtil
				.getCannabisApplications(cannabisApplicationId);
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		DLFolder supportingDocumentsParentFolder = null;
		DLFolder supportingDocumentsFolder = null;
		try {
			List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Cannabis Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(cannabisApplications.getCannabisApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		String pdfTemplate = StringPool.BLANK;
		String previewUrlforAutorizationBackground = null;
		String previewUrlforSupplymentInfoSignature = null;
		try {
			previewUrlforAutorizationBackground = replaceSignatureforCannabis(
					cannabisApplications.getCannabisApplicationId(), "Cannabis Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
			e.printStackTrace();

		}
		try {
			previewUrlforSupplymentInfoSignature = replaceSignatureforSupplimentInfo(
					cannabisApplications.getCannabisApplicationId(), "Cannabis Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (cannabisApplications.getTypeOfEntity().equals("Individual")
				|| cannabisApplications.getTypeOfEntity().equals("Sole Trader")) {
			if (cannabisApplications.getLicenseCategory().equals("Cultivator Licence")) {
				CannabisApplicationIndividualInfo applicationIndividualInfo = null;
				CannabisApplicationIndividualAddress applicationIndividualRegiAddressInfo = null;
				CannabisApplicationIndividualAddress applicationIndividualMailAddressInfo = null;
				List<GeneralDelarations> generalDelarations = null;
				List<StatementOfFinancialHistory> financialHistories = null;
				List<CannabisSupplementalInformation> cannabisSupplementalInformations = null;
				CannabisConsentByPropertyOwner cannabisConsentByPropertyOwners = null;
				List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners = null;
				CannabisApplicationPayment cannabisPayment = null;
				try {
					applicationIndividualInfo = CannabisApplicationIndividualInfoLocalServiceUtil
							.getCA_CI_by_AppId(cannabisApplicationId);
					applicationIndividualRegiAddressInfo = CannabisApplicationIndividualAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.REGISTERED_ADDRESS,
									applicationIndividualInfo.getIndividualInformationId());
					applicationIndividualMailAddressInfo = CannabisApplicationIndividualAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.MAILING_ADDRESS,
									applicationIndividualInfo.getIndividualInformationId());
					generalDelarations = GeneralDelarationsLocalServiceUtil.getCA_GD_CAI(cannabisApplicationId);
					financialHistories = StatementOfFinancialHistoryLocalServiceUtil
							.getSOFH_by_CAI(cannabisApplicationId);
					cannabisSupplementalInformations = CannabisSupplementalInformationLocalServiceUtil
							.getCA_SI_CAI(cannabisApplicationId);
					cannabisConsentByPropertyOwners = CannabisConsentByPropertyOwnerLocalServiceUtil
							.getCA_CPO_CAI(cannabisApplicationId);
					cannabisConsentBySoleOwners = CannabisConsentBySoleOwnerLocalServiceUtil
							.getCA_CSO_BY_CAI(cannabisApplicationId);
					cannabisPayment = CannabisApplicationPaymentLocalServiceUtil
							.getCannabisApplicationPaymentByCannabisAppId(cannabisApplicationId);
				} catch (Exception e) {
				}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"cannbis_application_individual_cultivator_form");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"cannabis_application_individual_cultivator_form");
				}

				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$AFCL_LicenseCategory$]",
							"[$ThisIsYourFirstTimeApplying$]", "[$AFCL_ApplicantFIRSTNAME$]",
							"[$AFCL_ApplicantMIDDLENAME$]", "[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantOTHERNAMES$]",
							"[$AFCL_ApplicantMAIDENNAME$]", "[$AFCL_ApplicantMOTHERSMAIDENNAME$]",
							"[$AFCL_ApplicantGENDER$]", "[$AFCL_ApplicantMARITALSTATUS$]",
							"[$AFCL_ApplicantPLACEOFBIRTHTownCountry$]", "[$AFCL_ApplicantDATEOFBIRTH$]",
							"[$AFCL_ApplicantNATIONALITY$]", "[$AFCL_ApplicantLENGTHOFTIMELIVINGINJAMAICAINYEARS$]",
							"[$AFCL_ApplicantTRN$]", "[$AFCL_ApplicantID$]", "[$AFCL_ApplicantCURRENTOCCUPATION$]",
							"[$AFCL_PhoneNumberHome$]", "[$AFCL_PhonenumberWork$]", "[$AFCL_ApplicantMobilenumber$]",
							"[$AFCL_EmailAddress$]", "[$AFCL_ApplicantStreetApt$]", "[$AFCL_ApplicantTownCity$]",
							"[$AFCL_ApplicantParish$]", "[$AFCL_ApplicantMailStreetApt$]",
							"[$AFCL_ApplicantMailTownCity$]", "[$AFCL_ApplicantMailParish$]",
							"[$AFCL_ApplicantDOCUMENTTYPE$]"
//	                     for the general declaration
							, "[$AgeOfEighteen$]", "[$PropertyOwner$]",
							"[$IsRegisteredOrUnregisteredIfTitleOwnerOrNot$]", "[$OnlyTitleOwnerIfRegistered$]",
							"[$IfNotOnlyOwner$]", "[$OwnerNameIfRegistered$]", "[$DeclarentNameIfUnRegistered$]",
							"[$LicensedMotorVehicle$]", "[$AppliedForAGanja$]", "[$StateJurisdiction$]",
							"[$TypeOfLicense$]", "[$LicenseStatus$]", "[$ApplierForGamingOrRacingLicence$]",
							"[$StateJurisdiction$]", "[$TypeOfLicense$]", "[$LicenseStatus$]",
							"[$ConvictedOfAnyCrime$]", "[$TypeOfCrime$]", "[$LocationOfYourProperty$]",
							"[$BeneficialOfTheCompany$]", "[$NameParentCompany$]",
//	          for the financial Histories           
							"[$AnyGovernmentalAgency$]", "[$PetitionFiledAgainstIt$]", "[$AnyBusinessTrustInstrument$]",
							"[$FinancialOrTradeRegulation$]", "[$ComplainantOrRespondentOrInOtherFashion$]",
							"[$AuditedOrUnauditedinThePastTwoYears$]", "[$Signature1$]"
//	         for the cultivator         
							, "[$AFCL_Acreageoftheproperty$]", "[$AFCL_Whatistheanticipatedcropyieldkgacreperharvest$]",
							"[$AFCL_Howlongiseachcropexpectedtotaketoharvest$]",
							"[$AFCL_Whattypeofganjawillyoubegrowing$]", "[$AFCL_Howwillthecropbegrown$]",
							"[$AFCL_ForWhatTypeofUseAreYouCultivatingv2$]",
							"[$AFCL_Doyouhaveabuyerorhaveyoustarteddiscussionswithanenti$]", "[$Pleaseagreement$]",

							// for the Consent Property Owners
							"[$TypeOfProperty$]", "[$DescriptionOfProperty$]",
							"[$DescriptionOfIntendedUseOfPropertyToCannabis$]",
//	for the sole Owner
							"[$OwnerName1$]", "[$OwnerDate1$]", "[$OwnerPhone1$]", "[$OwnerAddress1$]", "[OwnerName2$]",
							"[$OwnerDate2$]", "[$OwnerPhone2$]", "[$OwnerAddress2$]", "[$OwnerName3$]",
							"[$OwnerDate3$]", "[$OwnerPhone3$]", "[$OwnerAddress3$]", "[$OwnerName4$]",
							"[$OwnerDate4$]", "[$OwnerPhone4$]", "[$OwnerAddress4$]", "[$OwnerName5$]",
							"[$OwnerDate5$]", "[$OwnerPhone5$]", "[$OwnerAddress5$]", "[$PaymentMethod$]", "[$Date$]",
							"[$Signature2$]", "[$AFCL_ApplicantSURNAME$]", " [$AFCL_ApplicantSURNAME$]" },
							new String[] {
									Validator.isNotNull(cannabisApplications)
											? cannabisApplications.getLicenseCategory()
											: "",
									Validator.isNotNull(cannabisApplications) ? cannabisApplications.getRequestType()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getLastName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getFirstName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getMiddleName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getOtherName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getMaidenName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getMotherMaidenName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getGender()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getMaritalStatus()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getPlaceOfBirth()
											: "",
									applicationIndividualInfo != null && applicationIndividualInfo.getDob() != null
											? new SimpleDateFormat("yyyy-MM-dd")
													.format(applicationIndividualInfo.getDob())
											: StringPool.BLANK,
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getNationality()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getDurationInJamaika()
											: "",
									Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getTrn()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getPassporNo()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getCurrentOccupation()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getContactHome()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getContactWork()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getContactMobile()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getEmail()
											: "",
									Validator.isNotNull(applicationIndividualRegiAddressInfo)
											? applicationIndividualRegiAddressInfo.getStreetName()
											: "",
									Validator.isNotNull(applicationIndividualRegiAddressInfo)
											? applicationIndividualRegiAddressInfo.getTown()
											: "",
									Validator.isNotNull(applicationIndividualRegiAddressInfo)
											? applicationIndividualRegiAddressInfo.getParish()
											: "",
									Validator.isNotNull(applicationIndividualMailAddressInfo)
											? applicationIndividualMailAddressInfo.getStreetName()
											: "",
									Validator.isNotNull(applicationIndividualMailAddressInfo)
											? applicationIndividualMailAddressInfo.getTown()
											: "",
									Validator.isNotNull(applicationIndividualMailAddressInfo)
											? applicationIndividualMailAddressInfo.getParish()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getIdentityNumber()
											: "",
//											for the general declaration
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 0
											? generalDelarations.get(0).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 1
											? generalDelarations.get(1).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 16
											? generalDelarations.get(16).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 17
											? generalDelarations.get(17).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 18
											? generalDelarations.get(18).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 19
											? generalDelarations.get(19).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 3
											? generalDelarations.get(3).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 20
											? generalDelarations.get(20).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 21
											? generalDelarations.get(21).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 4
											? generalDelarations.get(4).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 5
											? generalDelarations.get(5).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 6
											? generalDelarations.get(6).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 7
											? generalDelarations.get(7).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 8
											? generalDelarations.get(8).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 9
											? generalDelarations.get(9).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 10
											? generalDelarations.get(10).getAnswer()
											: "",

									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 11
											? generalDelarations.get(11).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 12
											? generalDelarations.get(12).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 13
											? generalDelarations.get(13).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 14
											? generalDelarations.get(14).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 15
											? generalDelarations.get(15).getAnswer()
											: "",
//for the financial Histories
									Validator.isNotNull(financialHistories) && financialHistories.size() > 0
											? financialHistories.get(0).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 1
											? financialHistories.get(1).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 2
											? financialHistories.get(2).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 3
											? financialHistories.get(3).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 4
											? financialHistories.get(4).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 5
											? financialHistories.get(5).getAnswer()
											: "",
									previewUrlforAutorizationBackground,
//for the cultivator 
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 0
													? cannabisSupplementalInformations.get(0).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 1
													? cannabisSupplementalInformations.get(1).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 2
													? cannabisSupplementalInformations.get(2).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 3
													? cannabisSupplementalInformations.get(3).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 4
													? cannabisSupplementalInformations.get(4).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 5
													? cannabisSupplementalInformations.get(5).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 6
													? cannabisSupplementalInformations.get(6).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 7
													? cannabisSupplementalInformations.get(7).getAnswer()
													: "",
//for the Consent Property Owners
									Validator.isNotNull(cannabisConsentByPropertyOwners)
											? cannabisConsentByPropertyOwners.getTypeOfProperty()
											: "",
									Validator.isNotNull(cannabisConsentByPropertyOwners)
											? cannabisConsentByPropertyOwners.getDescriptionOfProperty()
											: "",
									Validator.isNotNull(cannabisConsentByPropertyOwners)
											? cannabisConsentByPropertyOwners.getDescriptionOfIntendedUse()
											: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerName()
													: "",
									cannabisConsentBySoleOwners.size() >= 0
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(0).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(0).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(1).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(2).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(3).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(3).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(4).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(4).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerAddress()
													: "",
									Validator.isNotNull(cannabisPayment) ? cannabisPayment.getPaymentMethod() : "",
									Validator.isNotNull(cannabisApplications)
											? dateFormat.format(cannabisApplications.getCreateDate())
											: "",
									previewUrlforSupplymentInfoSignature,
									Validator.isNotNull(cannabisApplications) ? cannabisApplications.getUserName() : "",
									Validator.isNotNull(cannabisApplications) ? cannabisApplications.getUserName()
											: "", });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("true")) {
					String title = "";
					String certificationDriver = "";
					String certificateCopyOfPassport = "";
					String certificateCopyOfNational = "";
					String certificateCopyOfTRC = "";
					String originalPolice = "";
					String signedOriginalPolice = "";
					String TwoCertificate = "";
					String taxCompliance = "";
					String passpoertBio = "";
					String completeDueDiligence = "";
					try {
						List<CannabisSupportingDocumentsMaster> cannabisSupportingDocumentsMasters = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocApplicant("Applicant", cannabisApplications.getTypeOfEntity(),
										cannabisApplications.getLicenseCategory());
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : cannabisSupportingDocumentsMasters) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals("Certified copy of Driver�s Licence")) {
								certificationDriver = fileName;
							} else if (title.equals("Certified copy of Passport Bio-page")) {
								certificateCopyOfPassport = fileName;
							} else if (title.equals("Certified copy of National Identification Card")) {
								certificateCopyOfNational = fileName;
							} else if (title.equals(
									"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
								certificateCopyOfTRC = fileName;
							} else if (title.equals(
									"Original Police Certificate addressed to the Cannabis Licensing Authority")) {
								originalPolice = fileName;
							} else if (title.equals(
									"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant")) {
								signedOriginalPolice = fileName;
							} else if (title.equals("Two (2) certified passport sized photographs")) {
								TwoCertificate = fileName;
							} else if (title.equals("Tax Compliance Notification Letter")) {
								taxCompliance = fileName;
							} else if (title.equals("Passport Bio-page, if not already uploaded")) {
								passpoertBio = fileName;
							} else if (title.equals("Completed Due Diligence Requirement Form")) {
								completeDueDiligence = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate,
								new String[] { "[$JaimicaDriverLIcense$]", "[$JaimicanPassport$]",
										"[$JaimicanNationalIdentificationCard$]",
										"[$CertifiedCopyOfTaxpayerRegistrationNumber$]",
										"[$OriginalPoliceCertificateAddressed$]",
										"[$SignedOriginalPoliceCertificateAddressed$]",
										"[$CertifiedPassportSizedPhotographs$]", "[$TaxComplianceNotificaiton$]",
										"[$PassportBioPage$]", "[$CompletedDueDiligenceRequirementForm$]" },
								new String[] { certificationDriver, certificateCopyOfPassport,
										certificateCopyOfNational, certificateCopyOfTRC, originalPolice,
										signedOriginalPolice, TwoCertificate, taxCompliance, passpoertBio,
										completeDueDiligence });
					} catch (Exception e) {
					}

					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certifiedCopyOfCertifiedOfTitle = "";
						String certifiedCopyOfTwo = "";
						String proofOfPaymentOfProperty = "";
						String surveyDiagram = "";

						List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Property", "Individual", "Cultivator Licence",
										"Registered Land Applicant Owns Property");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
								e.printStackTrace();
							}
							if (title.equals(
									"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
								certifiedCopyOfCertifiedOfTitle = fileName;
							} else if (title
									.equals("Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
								certifiedCopyOfTwo = fileName;
							} else if (title.equals(
									"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
								proofOfPaymentOfProperty = fileName;
							} else if (title.equals(
									"Survey Diagram showing entrance exits receival loading and storage areas")) {
								surveyDiagram = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//										for the document 
								"[$CertifiedCopyOfCertificateOfTitle$]", "[$UnregisteredLand$]",
								"[$ProofOfPaymentOfTaxesPaid$]", "[$SurveyDiagramShowingEntranceExitsReceivalLoading$]"

						}, new String[] {
//										for the document 
								certifiedCopyOfCertifiedOfTitle, certifiedCopyOfTwo, proofOfPaymentOfProperty,
								surveyDiagram });
					}
				}
			} else if (cannabisApplications.getLicenseCategory().equals("Processing Licence")) {
				CannabisApplicationIndividualInfo applicationIndividualInfo = null;
				CannabisApplicationIndividualAddress applicationIndividualRegiAddressInfo = null;
				CannabisApplicationIndividualAddress applicationIndividualMailAddressInfo = null;
				List<GeneralDelarations> generalDelarations = null;
				List<StatementOfFinancialHistory> financialHistories = null;
				List<CannabisSupplementalInformation> cannabisSupplementalInformations1 = null;
				CannabisConsentByPropertyOwner cannabisConsentByPropertyOwners = null;
				List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners = null;
				CannabisApplicationPayment cannabisPayment = null;
				try {
					applicationIndividualInfo = CannabisApplicationIndividualInfoLocalServiceUtil
							.getCA_CI_by_AppId(cannabisApplicationId);
					applicationIndividualRegiAddressInfo = CannabisApplicationIndividualAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.REGISTERED_ADDRESS,
									applicationIndividualInfo.getIndividualInformationId());
					applicationIndividualMailAddressInfo = CannabisApplicationIndividualAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.MAILING_ADDRESS,
									applicationIndividualInfo.getIndividualInformationId());
					generalDelarations = GeneralDelarationsLocalServiceUtil.getCA_GD_CAI(cannabisApplicationId);
					financialHistories = StatementOfFinancialHistoryLocalServiceUtil
							.getSOFH_by_CAI(cannabisApplicationId);
					cannabisSupplementalInformations1 = CannabisSupplementalInformationLocalServiceUtil
							.getCA_SI_CAI(cannabisApplicationId);
					cannabisConsentByPropertyOwners = CannabisConsentByPropertyOwnerLocalServiceUtil
							.getCA_CPO_CAI(cannabisApplicationId);
					cannabisConsentBySoleOwners = CannabisConsentBySoleOwnerLocalServiceUtil
							.getCA_CSO_BY_CAI(cannabisApplicationId);
					cannabisPayment = CannabisApplicationPaymentLocalServiceUtil
							.getCannabisApplicationPaymentByCannabisAppId(cannabisApplicationId);
				} catch (Exception e) {
				}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"cannbis_application_individual_processing_form-1");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"cannabis_application_individual_processing_form");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$AFCL_LicenseCategory$]",
							"[$ThisIsYourFirstTimeApplying$]", "[$AFCL_ApplicantSURNAME$]",
							"[$AFCL_ApplicantFIRSTNAME$]", "[$AFCL_ApplicantMIDDLENAME$]",
							"[$AFCL_ApplicantOTHERNAMES$]", "[$AFCL_ApplicantMAIDENNAME$]",
							"[$AFCL_ApplicantMOTHERSMAIDENNAME$]", "[$AFCL_ApplicantGENDER$]",
							"[$AFCL_ApplicantMARITALSTATUS$]", "[$AFCL_ApplicantDATEOFBIRTH$]",
							"[$AFCL_ApplicantPLACEOFBIRTHTownCountry$]", "[$AFCL_ApplicantNATIONALITY$]",
							"[$AFCL_ApplicantLENGTHOFTIMELIVINGINJAMAICAINYEARS$]", "[$AFCL_ApplicantTRN$]",
							"[$AFCL_ApplicantCURRENTOCCUPATION$]", "[$AFCL_PhoneNumberHome$]",
							"[$AFCL_PhonenumberWork$]", "[$AFCL_ApplicantMobilenumber$]", "[$AFCL_EmailAddress$]",
							"[$AFCL_ApplicantDOCUMENTTYPE$]", "[$AFCL_ApplicantID$]", "[$AFCL_ApplicantStreetApt$]",
							"[$AFCL_ApplicantTownCity$]", "[$AFCL_ApplicantParish$]", "[$AFCL_ApplicantMailStreetApt$]",
							"[$AFCL_ApplicantMailTownCity$]", "[$AFCL_ApplicantMailParish$]",
//for the general declaration					
							"[$AgeOfEighteen$]", "[$PropertyOwner$]", "[$IsRegisteredOrUnregisteredIfTitleOwnerOrNot$]",
							"[$OnlyTitleOwnerIfRegistered$]", "[$IfNotOnlyOwner$]", "[$OwnerNameIfRegistered$]",
							"[$DeclarentNameIfUnRegistered$]", "[$LicensedMotorVehicle$]", "[$AppliedForAGanja$]",
							"[$StateJurisdiction$]", "[$TypeOfLicense$]", "[$LicenseStatus$]",
							"[$ApplierForGamingOrRacingLicence$]", "[$StateJurisdiction$]", "[$TypeOfLicense$]",
							"[$LicenseStatus$]", "[$ConvictedOfAnyCrime$]", "[$TypeOfCrime$]",
							"[$LocationOfYourProperty$]", "[$BeneficialOfTheCompany$]", "[$NameParentCompany$]",
//for thr finnacial history					
							"[$JudgmentsOrTaxLiabilities$]", "[$SuchPetitionFiledAgainstIt$]",
							"[$BusinessTrustInstrument$]", "[$ViolationOfAnyFinancialOrTrade$]", "[$OtherCountry$]",
							"[$StatementsEitherAuditedOrUnaudited$]", "[$Signature1$]",
//for the processor 
							"[$TheSizeOfIndoorProperty$]", "[$TheSizeOfOutdoorProperty$]",
							"[$AFCL_Whatganjaproductsareyouintendingtomanufacture$]",
							"[$AFCL_Haveyoustarteddiscussionswithanentityiestosellyourpr$]", "[$TheNameOfPerson$]",
							"[$AFCL_Doyouproposetousearegisteredtrademark_V2$]",
							"[$AFCL_Doyouintendtosellothernoncannabisitemsonthesamepremi$]",
							// for the Consent Property Owners
							"[$TypeOfProperty$]", "[$DescriptionOfProperty$]",
							"[$DescriptionOfIntendedUseOfPropertyToCannabis$]",
//	for the sole Owner
							"[$OwnerName1$]", "[$OwnerDate1$]", "[$OwnerPhone1$]", "[$OwnerAddress1$]", "[OwnerName2$]",
							"[$OwnerDate2$]", "[$OwnerPhone2$]", "[$OwnerAddress2$]", "[$OwnerName3$]",
							"[$OwnerDate3$]", "[$OwnerPhone3$]", "[$OwnerAddress3$]", "[$OwnerName4$]",
							"[$OwnerDate4$]", "[$OwnerPhone4$]", "[$OwnerAddress4$]", "[$OwnerName5$]",
							"[$OwnerDate5$]", "[$OwnerPhone5$]", "[$OwnerAddress5$]",

//							for the payment and other one 
							"[$PaymentMethod$]", "[$Signature2$]", "[$Date$]", "[$AFCL_ApplicantSURNAME$]",
							"[$AFCL_ApplicantFIRSTNAME$]", "[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantFIRSTNAME$]" },

							new String[] {
									Validator.isNotNull(cannabisApplications)
											? cannabisApplications.getLicenseCategory()
											: "",
									Validator.isNotNull(cannabisApplications) ? cannabisApplications.getRequestType()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getLastName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getFirstName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getMiddleName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getOtherName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getMaidenName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getMotherMaidenName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getGender()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getMaritalStatus()
											: "",
									applicationIndividualInfo != null && applicationIndividualInfo.getDob() != null
											? new SimpleDateFormat("yyyy-MM-dd")
													.format(applicationIndividualInfo.getDob())
											: StringPool.BLANK,
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getPlaceOfBirth()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getNationality()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getDurationInJamaika()
											: "",
									Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getTrn()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getCurrentOccupation()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getContactHome()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getContactWork()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getContactMobile()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getEmail()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getIdentityNumber()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getPassporNo()
											: "",
									Validator.isNotNull(applicationIndividualRegiAddressInfo)
											? applicationIndividualRegiAddressInfo.getStreetName()
											: "",
									Validator.isNotNull(applicationIndividualRegiAddressInfo)
											? applicationIndividualRegiAddressInfo.getTown()
											: "",
									Validator.isNotNull(applicationIndividualRegiAddressInfo)
											? applicationIndividualRegiAddressInfo.getParish()
											: "",
									Validator.isNotNull(applicationIndividualMailAddressInfo)
											? applicationIndividualMailAddressInfo.getStreetName()
											: "",
									Validator.isNotNull(applicationIndividualMailAddressInfo)
											? applicationIndividualMailAddressInfo.getTown()
											: "",
									Validator.isNotNull(applicationIndividualMailAddressInfo)
											? applicationIndividualMailAddressInfo.getParish()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 0
											? generalDelarations.get(0).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 1
											? generalDelarations.get(1).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 16
											? generalDelarations.get(16).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 17
											? generalDelarations.get(17).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 18
											? generalDelarations.get(18).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 19
											? generalDelarations.get(19).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 3
											? generalDelarations.get(3).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 20
											? generalDelarations.get(20).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 21
											? generalDelarations.get(21).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 4
											? generalDelarations.get(4).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 5
											? generalDelarations.get(5).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 6
											? generalDelarations.get(6).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 7
											? generalDelarations.get(7).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 8
											? generalDelarations.get(8).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 9
											? generalDelarations.get(9).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 10
											? generalDelarations.get(10).getAnswer()
											: "",

									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 11
											? generalDelarations.get(11).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 12
											? generalDelarations.get(12).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 13
											? generalDelarations.get(13).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 14
											? generalDelarations.get(14).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 15
											? generalDelarations.get(15).getAnswer()
											: "",
									// for the financial Histories
									Validator.isNotNull(financialHistories) && financialHistories.size() > 0
											? financialHistories.get(0).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 1
											? financialHistories.get(1).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 2
											? financialHistories.get(2).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 3
											? financialHistories.get(3).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 4
											? financialHistories.get(4).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 5
											? financialHistories.get(5).getAnswer()
											: "",
									previewUrlforAutorizationBackground,
									Validator.isNotNull(cannabisSupplementalInformations1)
											&& cannabisSupplementalInformations1.size() > 0
													? cannabisSupplementalInformations1.get(0).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations1)
											&& cannabisSupplementalInformations1.size() > 1
													? cannabisSupplementalInformations1.get(1).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations1)
											&& cannabisSupplementalInformations1.size() > 2
													? cannabisSupplementalInformations1.get(2).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations1)
											&& cannabisSupplementalInformations1.size() > 3
													? cannabisSupplementalInformations1.get(3).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations1)
											&& cannabisSupplementalInformations1.size() > 4
													? cannabisSupplementalInformations1.get(4).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations1)
											&& cannabisSupplementalInformations1.size() > 5
													? cannabisSupplementalInformations1.get(5).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations1)
											&& cannabisSupplementalInformations1.size() > 6
													? cannabisSupplementalInformations1.get(6).getAnswer()
													: "",

									Validator.isNotNull(cannabisConsentByPropertyOwners)
											? cannabisConsentByPropertyOwners.getTypeOfProperty()
											: "",
									Validator.isNotNull(cannabisConsentByPropertyOwners)
											? cannabisConsentByPropertyOwners.getDescriptionOfProperty()
											: "",
									Validator.isNotNull(cannabisConsentByPropertyOwners)
											? cannabisConsentByPropertyOwners.getDescriptionOfIntendedUse()
											: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerName()
													: "",
									cannabisConsentBySoleOwners.size() >= 0
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(0).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(0).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(1).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(2).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(3).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(3).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(4).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(4).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerAddress()
													: "",
									Validator.isNotNull(cannabisPayment) ? cannabisPayment.getPaymentMethod() : "",
									previewUrlforSupplymentInfoSignature,
									Validator.isNotNull(cannabisApplications)
											? dateFormat.format(cannabisApplications.getCreateDate())
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getLastName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getFirstName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getLastName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getFirstName()
											: "", });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("true")) {
					String title = "";
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certificationDriver = "";
						String certificateCopyOfPassport = "";
						String certificateCopyOfNational = "";
						String certificateCopyOfTRC = "";
						String signedOriginalPolice = "";
						String twoCertifiedPassport = "";
						String taxCompliance = "";
						String certificateOfRegistration = "";
						String businesssRegistrationForm = "";
						String passportBioPage = "";
						String completeDueDiligence = "";
						List<CannabisSupportingDocumentsMaster> cannabisSupportingDocumentsMasters = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Applicant", "Sole Trader",
										cannabisApplications.getLicenseCategory(), StringPool.BLANK);
						for (CannabisSupportingDocumentsMaster cannabisSupporting : cannabisSupportingDocumentsMasters) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(), cannabisSupporting.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
								e.printStackTrace();
							}
							if (title.equals("Certified copy of Driver�s Licence")) {
								certificationDriver = fileName;
							} else if (title.equals("Certified copy of Passport Bio-page")) {
								certificateCopyOfPassport = fileName;
							} else if (title.equals("Certified copy of National Identification Card")) {
								certificateCopyOfNational = fileName;
							} else if (title.equals(
									"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
								certificateCopyOfTRC = fileName;
							} else if (title.equals(
									"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant")) {
								signedOriginalPolice = fileName;
							} else if (title.equals("Two 2 certified passport sized photographs")) {
								twoCertifiedPassport = fileName;
							} else if (title.equals("Tax Compliance Notification Letter")) {
								taxCompliance = fileName;
							} else if (title.equals("Certificate of Registration")) {
								certificateOfRegistration = fileName;
							} else if (title.equals("Business Registration Form")) {
								businesssRegistrationForm = fileName;
							} else if (title.equals("Passport Bio-page, if not already uploaded")) {
								passportBioPage = fileName;
							} else if (title.equals("Completed Due Diligence Requirement Form")) {
								completeDueDiligence = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//										for the document 
								"[$JaimicaDriverLIcense$]", "[$JaimicanPassport$]",
								"[$JaimicanNationalIdentificationCard$]",
								"[$CertifiedCopyOfTaxpayerRegistrationNumber$]", "[$PoliceCertificateAddressed$]",
								"[$DirectorPassportSizedPhotographs$]", "[$TaxComplianceNotificationLetter$]",
								"[$CertifactionOfRegistration$]", "[$BusinessRegistrationForm$]", "[$PassportBioPage$]",
								"[$CompletedDueDiligenceRequirementForm$]"

						}, new String[] {
//										for the document 
								certificationDriver, certificateCopyOfPassport, certificateCopyOfNational,
								certificateCopyOfTRC, signedOriginalPolice, twoCertifiedPassport, taxCompliance,
								certificateOfRegistration, businesssRegistrationForm, passportBioPage,
								completeDueDiligence });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String fileName = "";
						List<CannabisSupportingDocumentsMaster> cannabisSupportingDocumentsMasters = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Property", "Sole Trader",
										cannabisApplications.getLicenseCategory(),
										"Registered Land Applicant Owns Property");
						if (checkPdfSendingInLaunchCaseWithoutDoc.equals("true")) {
							String certifiedCOpy = "";
							String cretifictecopyOfTwo = "";
							String proofOfPayment = "";
							String surveyDiagram = "";
							for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : cannabisSupportingDocumentsMasters) {
								try {
									FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(
											themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),
											cannabisSupportingDocumentsMaster.getDocumentName());
									fileName = fileEntry.getFileName();
									title = fileEntry.getTitle();
								} catch (Exception e) {
								}
								if (title.equals(
										"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
									certifiedCOpy = fileName;
								} else if (title.equals(
										"Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
									cretifictecopyOfTwo = fileName;
								} else if (title.equals(
										"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
									proofOfPayment = fileName;
								} else if (title.equals(
										"Survey Diagram showing entrance exits receival loading and storage areas")) {
									surveyDiagram = fileName;
								}
							}
							pdfTemplate = StringUtil.replace(pdfTemplate,
									new String[] { "[$CertifiedCopyOfCertificateOfTitle$]", "[$UnregisteredLand$]",
											"[$ProofOfPaymentOfTaxesPaid$]",
											"[$SurveyDiagramShowingEntranceExitsReceivalLoading$]" },
									new String[] { certifiedCOpy, cretifictecopyOfTwo, proofOfPayment, surveyDiagram });
						}
					}
				}
			} else if (cannabisApplications.getLicenseCategory().equals("Transport Licence")) {
				CannabisApplicationIndividualInfo applicationIndividualInfo = null;
				CannabisApplicationIndividualAddress applicationIndividualRegiAddressInfo = null;
				CannabisApplicationIndividualAddress applicationIndividualMailAddressInfo = null;
				List<GeneralDelarations> generalDelarations = null;
				List<StatementOfFinancialHistory> financialHistories = null;
				List<CannabisSupplementalInformation> cannabisSupplementalInformations2 = null;
				CannabisConsentByPropertyOwner cannabisConsentByPropertyOwners = null;
				List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners = null;
				CannabisApplicationPayment cannabisPayment = null;
				try {
					applicationIndividualInfo = CannabisApplicationIndividualInfoLocalServiceUtil
							.getCA_CI_by_AppId(cannabisApplicationId);
					applicationIndividualRegiAddressInfo = CannabisApplicationIndividualAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.REGISTERED_ADDRESS,
									applicationIndividualInfo.getIndividualInformationId());
					applicationIndividualMailAddressInfo = CannabisApplicationIndividualAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.MAILING_ADDRESS,
									applicationIndividualInfo.getIndividualInformationId());
					generalDelarations = GeneralDelarationsLocalServiceUtil.getCA_GD_CAI(cannabisApplicationId);
					financialHistories = StatementOfFinancialHistoryLocalServiceUtil
							.getSOFH_by_CAI(cannabisApplicationId);
					cannabisSupplementalInformations2 = CannabisSupplementalInformationLocalServiceUtil
							.getCA_SI_CAI(cannabisApplicationId);
					cannabisConsentByPropertyOwners = CannabisConsentByPropertyOwnerLocalServiceUtil
							.getCA_CPO_CAI(cannabisApplicationId);
					cannabisConsentBySoleOwners = CannabisConsentBySoleOwnerLocalServiceUtil
							.getCA_CSO_BY_CAI(cannabisApplicationId);
					cannabisPayment = CannabisApplicationPaymentLocalServiceUtil
							.getCannabisApplicationPaymentByCannabisAppId(cannabisApplicationId);
				} catch (Exception e) {
				}
				try {
					cannabisPayment = CannabisApplicationPaymentLocalServiceUtil
							.getCannabisApplicationPaymentByCannabisAppId(cannabisApplicationId);
				} catch (Exception e) {
					e.printStackTrace();
				}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"cannabis_application_individual_transport_form-2");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"cannabis_application_individual_transport_form-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$AFCL_LicenseCategory$]",
							"[$ThisIsYourFirstTimeApplying$]", "[$AFCL_ApplicantSURNAME$]",
							"[$AFCL_ApplicantFIRSTNAME$]", "[$AFCL_ApplicantMIDDLENAME$]",
							"[$AFCL_ApplicantOTHERNAMES$]", "[$AFCL_ApplicantMAIDENNAME$]",
							"[$AFCL_ApplicantMOTHERSMAIDENNAME$]", "[$AFCL_ApplicantGENDER$]",
							"[$AFCL_ApplicantMARITALSTATUS$]", "[$AFCL_ApplicantDATEOFBIRTH$]",
							"[$AFCL_ApplicantPLACEOFBIRTHTownCountry$]", "[$AFCL_ApplicantNATIONALITY$]",
							"[$AFCL_ApplicantLENGTHOFTIMELIVINGINJAMAICAINYEARS$]", "[$AFCL_ApplicantTRN$]",
							"[$AFCL_ApplicantDOCUMENTTYPE$]", "[$AFCL_ApplicantID$]",
							"[$AFCL_ApplicantCURRENTOCCUPATION$]", "[$AFCL_PhoneNumberHome$]",
							"[$AFCL_PhonenumberWork$]", "[$AFCL_ApplicantMobilenumber$]", "[$AFCL_EmailAddress$]",
							"[$AFCL_ApplicantStreetApt$]", "[$AFCL_ApplicantTownCity$]", "[$AFCL_ApplicantParish$]",
							"[$AFCL_ApplicantMailStreetApt$]", "[$AFCL_ApplicantMailTownCity$]",
							"[$AFCL_ApplicantMailParish$]"
//				                     for the general declaration
							, "[$AgeOfEighteen$]", "[$PropertyOwner$]",
							"[$IsRegisteredOrUnregisteredIfTitleOwnerOrNot$]", "[$OnlyTitleOwnerIfRegistered$]",
							"[$IfNotOnlyOwner$]", "[$OwnerNameIfRegistered$]", "[$DeclarentNameIfUnRegistered$]",
							"[$LicensedMotorVehicle$]", "[$AppliedForAGanja$]", "[$StateJurisdiction$]",
							"[$TypeOfLicense$]", "[$LicenseStatus$]", "[$ApplierForGamingOrRacingLicence$]",
							"[$StateJurisdiction$]", "[$TypeOfLicense$]", "[$LicenseStatus$]",
							"[$ConvictedOfAnyCrime$]", "[$TypeOfCrime$]", "[$LocationOfYourProperty$]",
							"[$BeneficialOfTheCompany$]", "[$NameParentCompany$]"

//					          for the financial Histories  
							, "[$JudgmentsOrTaxLiabilities$]", "[$PetitionFiledAgainst$]",
							"[$BusinessTrustInstrument$]", "[$CompanyOrAnyRelatedEntity$]",
							"[$EitherAsPlaintiffOrDefendant$]", "[$StatementsEitherAuditedOrUnaudited$]",
							"[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantFIRSTNAME$]", "[$Signature1$]",
							"[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantFIRSTNAME$]",

//			for the transportation
							"[$AFCL_HowmanyvehiclesdoyouwishtobelicensedAttachlistwith$]",
							"[$WhereWillTheVehicleBeRoutinelyParkred$]", "[$ForWhatTypeOfUseAreYouTransporting$]",
							"[$AFCL_Whattypeofproductdoyouintendtotransport$]",
							"[$AFCL_Haveyoustarteddiscussionswithanentitytotransporttheirc$]", "[$TheNameOfPerson$]",
							"[$AFCL_Doyouintendtotransportothernoncannabisitemsinthesame$]"
//for the Consent Property Owners
							, "[$TypeOfProperty$]", "[$DescriptionOfProperty$]",
							"[$DescriptionOfIntendedUseOfPropertyToCannabis$]",

//							for the sole owner
							"[$OwnerName1$]", "[$OwnerDate1$]", "[$OwnerPhone1$]", "[$OwnerAddress1$]", "[OwnerName2$]",
							"[$OwnerDate2$]", "[$OwnerPhone2$]", "[$OwnerAddress2$]", "[$OwnerName3$]",
							"[$OwnerDate3$]", "[$OwnerPhone3$]", "[$OwnerAddress3$]", "[$OwnerName4$]",
							"[$OwnerDate4$]", "[$OwnerPhone4$]", "[$OwnerAddress4$]", "[$OwnerName5$]",
							"[$OwnerDate5$]", "[$OwnerPhone5$]", "[$OwnerAddress5$]", "[$PaymentMethod$]",
							"[$Signature2$]", "[$Date$]"

					}, new String[] {

							Validator.isNotNull(cannabisApplications) ? cannabisApplications.getLicenseCategory() : "",
							Validator.isNotNull(cannabisApplications) ? cannabisApplications.getRequestType() : "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getLastName()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getFirstName()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getMiddleName()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getOtherName()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getMaidenName()
									: "",
							Validator.isNotNull(applicationIndividualInfo)
									? applicationIndividualInfo.getMotherMaidenName()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getGender() : "",
							Validator.isNotNull(applicationIndividualInfo)
									? applicationIndividualInfo.getMaritalStatus()
									: "",
							applicationIndividualInfo != null && applicationIndividualInfo.getDob() != null
									? new SimpleDateFormat("yyyy-MM-dd").format(applicationIndividualInfo.getDob())
									: StringPool.BLANK,
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getPlaceOfBirth()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getNationality()
									: "",
							Validator.isNotNull(applicationIndividualInfo)
									? applicationIndividualInfo.getDurationInJamaika()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getTrn() : "",
							Validator.isNotNull(applicationIndividualInfo)
									? applicationIndividualInfo.getIdentityNumber()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getPassporNo()
									: "",
							Validator.isNotNull(applicationIndividualInfo)
									? applicationIndividualInfo.getCurrentOccupation()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getContactHome()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getContactWork()
									: "",
							Validator.isNotNull(applicationIndividualInfo)
									? applicationIndividualInfo.getContactMobile()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getEmail() : "",
							Validator.isNotNull(applicationIndividualRegiAddressInfo)
									? applicationIndividualRegiAddressInfo.getStreetName()
									: "",
							Validator.isNotNull(applicationIndividualRegiAddressInfo)
									? applicationIndividualRegiAddressInfo.getTown()
									: "",
							Validator.isNotNull(applicationIndividualRegiAddressInfo)
									? applicationIndividualRegiAddressInfo.getParish()
									: "",
							Validator.isNotNull(applicationIndividualRegiAddressInfo)
									? applicationIndividualMailAddressInfo.getStreetName()
									: "",
							Validator.isNotNull(applicationIndividualRegiAddressInfo)
									? applicationIndividualMailAddressInfo.getTown()
									: "",
							Validator.isNotNull(applicationIndividualRegiAddressInfo)
									? applicationIndividualMailAddressInfo.getParish()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 0
									? generalDelarations.get(0).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 1
									? generalDelarations.get(1).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 16
									? generalDelarations.get(16).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 17
									? generalDelarations.get(17).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 18
									? generalDelarations.get(18).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 19
									? generalDelarations.get(19).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 3
									? generalDelarations.get(3).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 20
									? generalDelarations.get(20).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 21
									? generalDelarations.get(21).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 4
									? generalDelarations.get(4).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 5
									? generalDelarations.get(5).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 6
									? generalDelarations.get(6).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 7
									? generalDelarations.get(7).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 8
									? generalDelarations.get(8).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 9
									? generalDelarations.get(9).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 10
									? generalDelarations.get(10).getAnswer()
									: "",

							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 11
									? generalDelarations.get(11).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 12
									? generalDelarations.get(12).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 13
									? generalDelarations.get(13).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 14
									? generalDelarations.get(14).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 15
									? generalDelarations.get(15).getAnswer()
									: "",
							// for the financial Histories
							Validator.isNotNull(financialHistories) && financialHistories.size() > 0
									? financialHistories.get(0).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 1
									? financialHistories.get(1).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 2
									? financialHistories.get(2).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 3
									? financialHistories.get(3).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 4
									? financialHistories.get(4).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 5
									? financialHistories.get(5).getAnswer()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getFirstName()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getLastName()
									: "",
							previewUrlforAutorizationBackground,
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getFirstName()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getLastName()
									: "",
//	for the transportation
							Validator.isNotNull(cannabisSupplementalInformations2)
									&& cannabisSupplementalInformations2.size() > 0
											? cannabisSupplementalInformations2.get(0).getAnswer()
											: "",
							Validator.isNotNull(cannabisSupplementalInformations2)
									&& cannabisSupplementalInformations2.size() > 1
											? cannabisSupplementalInformations2.get(1).getAnswer()
											: "",
							Validator.isNotNull(cannabisSupplementalInformations2)
									&& cannabisSupplementalInformations2.size() > 2
											? cannabisSupplementalInformations2.get(2).getAnswer()
											: "",
							Validator.isNotNull(cannabisSupplementalInformations2)
									&& cannabisSupplementalInformations2.size() > 3
											? cannabisSupplementalInformations2.get(3).getAnswer()
											: "",
							Validator.isNotNull(cannabisSupplementalInformations2)
									&& cannabisSupplementalInformations2.size() > 4
											? cannabisSupplementalInformations2.get(4).getAnswer()
											: "",
							Validator.isNotNull(cannabisSupplementalInformations2)
									&& cannabisSupplementalInformations2.size() > 5
											? cannabisSupplementalInformations2.get(5).getAnswer()
											: "",
							Validator.isNotNull(cannabisSupplementalInformations2)
									&& cannabisSupplementalInformations2.size() > 6
											? cannabisSupplementalInformations2.get(6).getAnswer()
											: "",
//for the Consent Property Owners
							Validator.isNotNull(cannabisConsentByPropertyOwners)
									? cannabisConsentByPropertyOwners.getTypeOfProperty()
									: "",
							Validator.isNotNull(cannabisConsentByPropertyOwners)
									? cannabisConsentByPropertyOwners.getDescriptionOfProperty()
									: "",
							Validator.isNotNull(cannabisConsentByPropertyOwners)
									? cannabisConsentByPropertyOwners.getDescriptionOfIntendedUse()
									: "",

							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 0
									? cannabisConsentBySoleOwners.get(0).getOwnerName()
									: "",
							cannabisConsentBySoleOwners.size() >= 0
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(0).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(0).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 0
									? cannabisConsentBySoleOwners.get(0).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 0
									? cannabisConsentBySoleOwners.get(0).getOwnerAddress()
									: "",

							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 1
									? cannabisConsentBySoleOwners.get(1).getOwnerName()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 1
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(1).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 1
									? cannabisConsentBySoleOwners.get(1).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 1
									? cannabisConsentBySoleOwners.get(1).getOwnerAddress()
									: "",

							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 2
									? cannabisConsentBySoleOwners.get(2).getOwnerName()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 2
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(2).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 2
									? cannabisConsentBySoleOwners.get(2).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 2
									? cannabisConsentBySoleOwners.get(2).getOwnerAddress()
									: "",

							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 3
									? cannabisConsentBySoleOwners.get(3).getOwnerName()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 3
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(3).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(3).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 3
									? cannabisConsentBySoleOwners.get(3).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 3
									? cannabisConsentBySoleOwners.get(3).getOwnerAddress()
									: "",

							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 4
									? cannabisConsentBySoleOwners.get(4).getOwnerName()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 4
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(4).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(4).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 4
									? cannabisConsentBySoleOwners.get(4).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 4
									? cannabisConsentBySoleOwners.get(4).getOwnerAddress()
									: "",
							Validator.isNotNull(cannabisPayment) ? cannabisPayment.getPaymentMethod() : "",
							previewUrlforSupplymentInfoSignature,
							Validator.isNotNull(cannabisApplications)
									? dateFormat.format(cannabisApplications.getCreateDate())
									: "" });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("true")) {
					String title = "";
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certificationDriver = "";
						String certificateCopyOfPassport = "";
						String certificateCopyOfNational = "";
						String certificateCopyOfTRC = "";
						String signedOriginalPolice = "";
						String twoCertifiedPassport = "";
						String taxCompliance = "";
						String certificateOfRegistration = "";
						String businesssRegistrationForm = "";
						String passportBioPage = "";
						String completeDueDiligence = "";
						List<CannabisSupportingDocumentsMaster> cannabisSupportingDocumentsMasters = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocApplicant("Applicant", "Sole Trader", "Transport Licence");
						for (CannabisSupportingDocumentsMaster cannabisSupporting : cannabisSupportingDocumentsMasters) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(), cannabisSupporting.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
								e.printStackTrace();
							}
							if (title.equals("Certified copy of Driver�s Licence")) {
								certificationDriver = fileName;
							} else if (title.equals("Certified copy of Passport Bio-page")) {
								certificateCopyOfPassport = fileName;
							} else if (title.equals("Certified copy of National Identification Card")) {
								certificateCopyOfNational = fileName;
							} else if (title.equals(
									"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
								certificateCopyOfTRC = fileName;
							} else if (title.equals(
									"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant")) {
								signedOriginalPolice = fileName;
							} else if (title.equals("Two 2 certified passport sized photographs")) {
								twoCertifiedPassport = fileName;
							} else if (title.equals("Tax Compliance Notification Letter")) {
								taxCompliance = fileName;
							} else if (title.equals("Certificate of Registration")) {
								certificateOfRegistration = fileName;
							} else if (title.equals("Business Registration Form")) {
								businesssRegistrationForm = fileName;
							} else if (title.equals("Passport Bio-page, if not already uploaded")) {
								passportBioPage = fileName;
							} else if (title.equals("Completed Due Diligence Requirement Form")) {
								completeDueDiligence = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//										for the document 
								"[$JaimicaDriverLIcense$]", "[$JaimicanPassport$]",
								"[$JaimicanNationalIdentificationCard$]",
								"[$CertifiedCopyOfTaxpayerRegistrationNumber$]", "[$PoliceCertificateAddressed$]",
								"[$PassportSizedPhotographs$]", "[$TaxComplianceNotificationLetter$]",
								"[$CertifactionOfRegistration$]", "[$BusinessRegistrationForm$]", "[$PassportBioPage$]",
								"[$CompletedDueDiligenceRequirementForm$]" }, new String[] {
//										for the document 
										certificationDriver, certificateCopyOfPassport, certificateCopyOfNational,
										certificateCopyOfTRC, signedOriginalPolice, twoCertifiedPassport, taxCompliance,
										certificateOfRegistration, businesssRegistrationForm, passportBioPage,
										completeDueDiligence });
					}
				}
			} else if (cannabisApplications.getLicenseCategory().equals("Retail Licence")) {
				CannabisApplicationIndividualInfo applicationIndividualInfo = null;
				CannabisApplicationIndividualAddress applicationIndividualRegiAddressInfo = null;
				CannabisApplicationIndividualAddress applicationIndividualMailAddressInfo = null;
				List<CannabisSupplementalInformation> cannabisSupplementalInformations = null;
				List<StatementOfFinancialHistory> financialHistories = null;
				List<GeneralDelarations> generalDelarations = null;
				CannabisConsentByPropertyOwner cannabisConsentByPropertyOwners = null;
				List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners = null;
				CannabisApplicationPayment cannabisPayment = null;
				try {
					applicationIndividualInfo = CannabisApplicationIndividualInfoLocalServiceUtil
							.getCA_CI_by_AppId(cannabisApplicationId);
					applicationIndividualRegiAddressInfo = CannabisApplicationIndividualAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.REGISTERED_ADDRESS,
									applicationIndividualInfo.getIndividualInformationId());
					applicationIndividualMailAddressInfo = CannabisApplicationIndividualAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.MAILING_ADDRESS,
									applicationIndividualInfo.getIndividualInformationId());
					cannabisSupplementalInformations = CannabisSupplementalInformationLocalServiceUtil
							.getCA_SI_CAI(cannabisApplicationId);
					financialHistories = StatementOfFinancialHistoryLocalServiceUtil
							.getSOFH_by_CAI(cannabisApplicationId);
					generalDelarations = GeneralDelarationsLocalServiceUtil.getCA_GD_CAI(cannabisApplicationId);
					cannabisConsentByPropertyOwners = CannabisConsentByPropertyOwnerLocalServiceUtil
							.getCA_CPO_CAI(cannabisApplicationId);
					cannabisConsentBySoleOwners = CannabisConsentBySoleOwnerLocalServiceUtil
							.getCA_CSO_BY_CAI(cannabisApplicationId);
					cannabisPayment = CannabisApplicationPaymentLocalServiceUtil
							.getCannabisApplicationPaymentByCannabisAppId(cannabisApplicationId);
				} catch (Exception e) {
				}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"cannabis_application_individual_retail_form-2");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"cannabis_application_individual_retail_form-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$AFCL_LicenseCategory$]",
							"[$ThisIsYourFirstTimeApplying$]", "[$AFCL_ApplicantSURNAME$]",
							"[$AFCL_ApplicantFIRSTNAME$]", "[$AFCL_ApplicantMIDDLENAME$]",
							"[$AFCL_ApplicantOTHERNAMES$]", "[$AFCL_ApplicantMAIDENNAME$]",
							"[$AFCL_ApplicantMOTHERSMAIDENNAME$]", "[$AFCL_ApplicantGENDER$]",
							"[$AFCL_ApplicantMARITALSTATUS$]", "[$AFCL_ApplicantPLACEOFBIRTHTownCountry$]",
							"[$AFCL_ApplicantDATEOFBIRTH$]", "[$AFCL_ApplicantNATIONALITY$]",
							"[$AFCL_ApplicantLENGTHOFTIMELIVINGINJAMAICAINYEARS$]", "[$AFCL_ApplicantTRN$]",
							"[$AFCL_ApplicantID$]", "[$AFCL_ApplicantCURRENTOCCUPATION$]", "[$AFCL_PhoneNumberHome$]",
							"[$AFCL_PhonenumberWork$]", "[$AFCL_ApplicantMobilenumber$]", "[$AFCL_EmailAddress$]",
							"[$AFCL_ApplicantStreetApt$]", "[$AFCL_ApplicantTownCity$]", "[$AFCL_ApplicantParish$]",
							"[$AFCL_ApplicantMailStreetApt$]", "[$AFCL_ApplicantMailTownCity$]",
							"[$AFCL_ApplicantMailParish$]", "[$AFCL_ApplicantDOCUMENTTYPE$]"
							// for the general declaration
							, "[$EmployeesUnderTheAgeOfEighteen$]", "[$PropertyOwner$]",
							"[$IsRegisteredOrUnregisteredIfTitleOwnerOrNot$]", "[$OnlyTitleOwnerIfRegistered$]",
							"[$IfNotOnlyOwner$]", "[$OwnerNameIfRegistered$]", "[$DeclarentNameIfUnRegistered$]",
							"[$LicensedMotorVehicle$]", "[$HandleGanjaOrGanjaProducts$]", "[$StateJurisdiction$]",
							"[$TypeOfLicense$]", "[$LicenseStatus$]", "[$AppliedForGamingOrRacingLicence$]",
							"[$StateJurisdiction$]", "[$TypeOfLicense$]", "[$LicenseStatus$]",
							"[$DirectorsEverBeenConvictedAnyCrime$]", "[$TypeOfCrime$]", "[$LocationOfYourProperty$]",
							"[$BeneficialOwnerOfTheCompany$]", "[$CompaniesAndAnyRelatedEntities$]"
//							for statement of finacial histor
							, "[$JudgmentsOrTaxLiabilities$]", "[$SuchPetitionFiledAgainstIt$]",
							"[$BusinessTrustInstrument$]", "[$ViolationOfAnyFinancialOrTrade$]", "[$OtherCountry$]",
							"[$StatementsEitherAuditedOrUnaudited$]", "[$Signature1$]"
//for thr retailor
							, "[$AFCL_RetailWhatganjaitemsdoyouintendtosell$]",
							"[$AFCL_RetailHaveyoustarteddiscussionswithanentityiestopurch$]",
							"[$AFCL_RetailDoyouintendtosellothernoncannabisitemsonthesam$]"
//for the contenst by property
							, "[$TypeOfProperty$]", "[$DescriptionOfProperty$]",
							"[$DescriptionOfIntendedUseOfPropertyToCannabis$]",

//							for the sole Owner 
							"[$OwnerName1$]", "[$OwnerDate1$]", "[$OwnerPhone1$]", "[$OwnerAddress1$]", "[OwnerName2$]",
							"[$OwnerDate2$]", "[$OwnerPhone2$]", "[$OwnerAddress2$]", "[$OwnerName3$]",
							"[$OwnerDate3$]", "[$OwnerPhone3$]", "[$OwnerAddress3$]", "[$OwnerName4$]",
							"[$OwnerDate4$]", "[$OwnerPhone4$]", "[$OwnerAddress4$]", "[$OwnerName5$]",
							"[$OwnerDate5$]", "[$OwnerPhone5$]", "[$OwnerAddress5$]", "[$PaymentMethod$]",
							"[$Signature2$]", "[$Date$]" },
							new String[] {
									Validator.isNotNull(cannabisApplications)
											? cannabisApplications.getLicenseCategory()
											: "",
									Validator.isNotNull(cannabisApplications) ? cannabisApplications.getRequestType()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getLastName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getFirstName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getMiddleName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getOtherName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getMaidenName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getMotherMaidenName()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getGender()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getMaritalStatus()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getPlaceOfBirth()
											: "",
									applicationIndividualInfo != null && applicationIndividualInfo.getDob() != null
											? new SimpleDateFormat("yyyy-MM-dd")
													.format(applicationIndividualInfo.getDob())
											: StringPool.BLANK,
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getNationality()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getDurationInJamaika()
											: "",
									Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getTrn()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getPassporNo()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getCurrentOccupation()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getContactHome()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getContactWork()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getContactMobile()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getEmail()
											: "",
									Validator.isNotNull(applicationIndividualRegiAddressInfo)
											? applicationIndividualRegiAddressInfo.getStreetName()
											: "",
									Validator.isNotNull(applicationIndividualRegiAddressInfo)
											? applicationIndividualRegiAddressInfo.getTown()
											: "",
									Validator.isNotNull(applicationIndividualRegiAddressInfo)
											? applicationIndividualRegiAddressInfo.getParish()
											: "",
									Validator.isNotNull(applicationIndividualMailAddressInfo)
											? applicationIndividualMailAddressInfo.getStreetName()
											: "",
									Validator.isNotNull(applicationIndividualMailAddressInfo)
											? applicationIndividualMailAddressInfo.getTown()
											: "",
									Validator.isNotNull(applicationIndividualMailAddressInfo)
											? applicationIndividualMailAddressInfo.getParish()
											: "",
									Validator.isNotNull(applicationIndividualInfo)
											? applicationIndividualInfo.getIdentityNumber()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 0
											? generalDelarations.get(0).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 1
											? generalDelarations.get(1).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 16
											? generalDelarations.get(16).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 17
											? generalDelarations.get(17).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 18
											? generalDelarations.get(18).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 19
											? generalDelarations.get(19).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 3
											? generalDelarations.get(3).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 20
											? generalDelarations.get(20).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 21
											? generalDelarations.get(21).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 4
											? generalDelarations.get(4).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 5
											? generalDelarations.get(5).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 6
											? generalDelarations.get(6).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 7
											? generalDelarations.get(7).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 8
											? generalDelarations.get(8).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 9
											? generalDelarations.get(9).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 10
											? generalDelarations.get(10).getAnswer()
											: "",

									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 11
											? generalDelarations.get(11).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 12
											? generalDelarations.get(12).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 13
											? generalDelarations.get(13).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 14
											? generalDelarations.get(14).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 15
											? generalDelarations.get(15).getAnswer()
											: "",
									// for the financial Histories
									Validator.isNotNull(financialHistories) && financialHistories.size() > 0
											? financialHistories.get(0).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 1
											? financialHistories.get(1).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 2
											? financialHistories.get(2).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 3
											? financialHistories.get(3).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 4
											? financialHistories.get(4).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 5
											? financialHistories.get(5).getAnswer()
											: "",
									previewUrlforAutorizationBackground,
//		for the retailor
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 0
													? cannabisSupplementalInformations.get(0).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 1
													? cannabisSupplementalInformations.get(1).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 2
													? cannabisSupplementalInformations.get(2).getAnswer()
													: "",

//for the Consent Property Owners
									Validator.isNotNull(cannabisConsentByPropertyOwners)
											? cannabisConsentByPropertyOwners.getTypeOfProperty()
											: "",
									Validator.isNotNull(cannabisConsentByPropertyOwners)
											? cannabisConsentByPropertyOwners.getDescriptionOfProperty()
											: "",
									Validator.isNotNull(cannabisConsentByPropertyOwners)
											? cannabisConsentByPropertyOwners.getDescriptionOfIntendedUse()
											: "",
//											for the sole sole Owner
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerName()
													: "",
									cannabisConsentBySoleOwners.size() >= 0
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(0).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(0).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerAddress()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(1).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(2).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(3).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(3).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(4).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(4).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerAddress()
													: "",
									Validator.isNotNull(cannabisPayment) ? cannabisPayment.getPaymentMethod() : "",
									previewUrlforSupplymentInfoSignature,
									Validator.isNotNull(cannabisApplications)
											? dateFormat.format(cannabisApplications.getCreateDate())
											: "" });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("true")) {
					String title = "";
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String fileName = "";
						List<CannabisSupportingDocumentsMaster> cannabisSupportingDocumentsMasters = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocApplicant("Applicant", "Sole Trader", "Retail Licence");
						if (checkPdfSendingInLaunchCaseWithoutDoc.equals("true")) {
							String certifiedCopy = "";
							String certificateCopyOfPassport = "";
							String certificateCopyOfNational = "";
							String certificateCopyOfTRC = "";
							String signedOriginalPolice = "";
							String twoCertifiedPassport = "";
							String TaxCompliance = "";
							String certificateOfRegis = "";
							String businessRegistration = "";
							String passportBioPage = "";
							String completeDueDiligence = "";
							for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : cannabisSupportingDocumentsMasters) {
								try {
									FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(
											themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),
											cannabisSupportingDocumentsMaster.getDocumentName());
									fileName = fileEntry.getFileName();
									title = fileEntry.getTitle();
								} catch (Exception e) {
								}
								if (title.equals("Certified copy of Driver�s Licence")) {
									certifiedCopy = fileName;
								} else if (title.equals("Certified copy of Passport Bio-page")) {
									certificateCopyOfPassport = fileName;
								} else if (title.equals("Certified copy of National Identification Card")) {
									certificateCopyOfNational = fileName;
								} else if (title.equals(
										"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
									certificateCopyOfTRC = fileName;
								} else if (title.equals(
										"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant")) {
									signedOriginalPolice = fileName;
								} else if (title.equals("Two 2 certified passport sized photographs")) {
									twoCertifiedPassport = fileName;
								} else if (title.equals("Tax Compliance Notification Letter")) {
									TaxCompliance = fileName;
								} else if (title.equals("Certificate of Registration")) {
									certificateOfRegis = fileName;
								} else if (title.equals("Business Registration Form")) {
									businessRegistration = fileName;
								} else if (title.equals("Passport Bio-page, if not already uploaded")) {
									passportBioPage = fileName;
								} else if (title.equals("Completed Due Diligence Requirement Form")) {
									completeDueDiligence = fileName;
								}
							}
							pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$JaimicaDriverLIcense$]",
									"[$JaimicanPassport$]", "[$JaimicanNationalIdentificationCard$]",
									"[$CertifiedCopyOfTaxpayerRegistrationNumber$]", "[$PoliceCertificateAddressed$]",
									"[$PassportSizedPhotographs$]", "[$TaxComplianceNotificationLetter$]",
									"[$CertifactionOfRegistration$]", "[$BusinessRegistrationForm$]",
									"[$PassportBioPage$]", "[$CompletedDueDiligenceRequirementForm$]" },
									new String[] { certifiedCopy, certificateCopyOfPassport, certificateCopyOfNational,
											certificateCopyOfTRC, signedOriginalPolice, twoCertifiedPassport,
											TaxCompliance, certificateOfRegis, businessRegistration, passportBioPage,
											completeDueDiligence });
						}
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String fileName = "";
						List<CannabisSupportingDocumentsMaster> cannabisSupportingDocumentsMasters = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Property", "Sole Trader", "Retail Licence",
										"Registered Land Applicant Owns Property");
						if (checkPdfSendingInLaunchCaseWithoutDoc.equals("true")) {
							String certifiedCopyOfCertificateOfTitle = "";
							String certificateCopyOfTwoStatutory = "";
							String proofOfPaymentTaxes = "";
							String surveyDiagram = "";
							for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : cannabisSupportingDocumentsMasters) {
								try {
									FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(
											themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),
											cannabisSupportingDocumentsMaster.getDocumentName());
									fileName = fileEntry.getFileName();
									title = fileEntry.getTitle();
								} catch (Exception e) {
								}
								if (title.equals(
										"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
									certifiedCopyOfCertificateOfTitle = fileName;
								} else if (title.equals(
										"Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
									certificateCopyOfTwoStatutory = fileName;
								} else if (title.equals(
										"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
									proofOfPaymentTaxes = fileName;
								} else if (title.equals(
										"Survey Diagram showing entrance exits receival loading and storage areas")) {
									surveyDiagram = fileName;
								}
							}
							pdfTemplate = StringUtil.replace(pdfTemplate,
									new String[] { "[$CertifiedCopyOfCertificateOfTitle$]", "[$UnregisteredLand$]",
											"[$ProofOfPaymentOfTaxesPaid$]",
											"[$SurveyDiagramShowingEntranceExitsReceivalLoading$]" },
									new String[] { certifiedCopyOfCertificateOfTitle, certificateCopyOfTwoStatutory,
											proofOfPaymentTaxes, surveyDiagram });
						}
					}
				}

			} else if (cannabisApplications.getLicenseCategory().equals("Research and Development Licence")) {
				CannabisApplicationIndividualInfo applicationIndividualInfo = null;
				CannabisApplicationIndividualAddress applicationIndividualRegiAddressInfo = null;
				CannabisApplicationIndividualAddress applicationIndividualMailAddressInfo = null;
				List<CannabisSupplementalInformation> cannabisSupplementalInformations = null;
				List<StatementOfFinancialHistory> financialHistories = null;
				List<GeneralDelarations> generalDelarations = null;
				CannabisConsentByPropertyOwner cannabisConsentByPropertyOwners = null;
				List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners = null;
				CannabisApplicationPayment cannabisPayment = null;
				try {
					applicationIndividualInfo = CannabisApplicationIndividualInfoLocalServiceUtil
							.getCA_CI_by_AppId(cannabisApplicationId);

					applicationIndividualRegiAddressInfo = CannabisApplicationIndividualAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.REGISTERED_ADDRESS,
									applicationIndividualInfo.getIndividualInformationId());
					applicationIndividualMailAddressInfo = CannabisApplicationIndividualAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.MAILING_ADDRESS,
									applicationIndividualInfo.getIndividualInformationId());
					cannabisSupplementalInformations = CannabisSupplementalInformationLocalServiceUtil
							.getCA_SI_CAI(cannabisApplicationId);
					financialHistories = StatementOfFinancialHistoryLocalServiceUtil
							.getSOFH_by_CAI(cannabisApplicationId);
					generalDelarations = GeneralDelarationsLocalServiceUtil.getCA_GD_CAI(cannabisApplicationId);
					cannabisConsentByPropertyOwners = CannabisConsentByPropertyOwnerLocalServiceUtil
							.getCA_CPO_CAI(cannabisApplicationId);
					cannabisConsentBySoleOwners = CannabisConsentBySoleOwnerLocalServiceUtil
							.getCA_CSO_BY_CAI(cannabisApplicationId);
					cannabisPayment = CannabisApplicationPaymentLocalServiceUtil
							.getCannabisApplicationPaymentByCannabisAppId(cannabisApplicationId);
				} catch (Exception e) {
				}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"cannabis_application_individual_research_form");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"cannabis_application_individual_research_form-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$AFCL_LicenseCategory$]",
							"[$ThisIsYourFirstTimeApplying$]", "[$AFCL_ApplicantFIRSTNAME$]",
							"[$AFCL_ApplicantMIDDLENAME$]", "[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantOTHERNAMES$]",
							"[$AFCL_ApplicantMAIDENNAME$]", "[$AFCL_ApplicantMOTHERSMAIDENNAME$]",
							"[$AFCL_ApplicantGENDER$]", "[$AFCL_ApplicantMARITALSTATUS$]",
							"[$AFCL_ApplicantDATEOFBIRTH$]", "[$AFCL_ApplicantPLACEOFBIRTHTownCountry$]",
							"[$AFCL_ApplicantNATIONALITY$]", "[$AFCL_ApplicantLENGTHOFTIMELIVINGINJAMAICAINYEARS$]",
							"[$AFCL_ApplicantTRN$]", "[$AFCL_ApplicantDOCUMENTTYPE$]", "[$AFCL_ApplicantID$]",
							"[$AFCL_ApplicantCURRENTOCCUPATION$]", "[$AFCL_ApplicantStreetApt$]",
							"[$AFCL_ApplicantTownCity$]", "[$AFCL_ApplicantParish$]", "[$AFCL_ApplicantMailStreetApt$]",
							"[$AFCL_ApplicantMailTownCity$]", "[$AFCL_ApplicantMailParish$]",
							"[$AFCL_PhoneNumberHome$]", "[$AFCL_PhonenumberWork$]", "[$AFCL_ApplicantMobilenumber$]",
							"[$AFCL_EmailAddress$]"
//			                     for the general declaration
							, "[$UnderTheAgeOfEighteen$]", "[$PropertyOwner$]",
							"[$IsRegisteredOrUnregisteredIfTitleOwnerOrNot$]", "[$OnlyTitleOwnerIfRegistered$]",
							"[$IfNotOnlyOwner$]", "[$OwnerNameIfRegistered$]", "[$DeclarentNameIfUnRegistered$]",
							"[$LicensedMotorVehicle$]", "[$LicenceToHandleGanja$]", "[$StateJurisdiction$]",
							"[$TypeOfLicense$]", "[$LicenseStatus$]", "[$AppliedForGamingOrRacingLicence$]",
							"[$StateJurisdiction$]", "[$TypeOfLicense$]", "[$LicenseStatus$]",
							"[$ConvictedOfAnyCrime$]", "[$TypeOfCrime$]", "[$LocationOfYourProperty$]",
							"[$BeneficialOwnerOfTheCompany$]", "[$RelatedEntitiesIfApplicable$]",
//			          for the financial Histories           
							"[$JudgmentsOrTaxLiabilities$]", "[$PetitionFiledAgainst$]", "[$BusinessTrustInstrument$]",
							"[$FinancialOrTradeRegulation$]", "[$ComplainantOrRespondentOrInAny$]",
							"[$StatementsEitherAuditedOrUnaudited$]", "[$Signature1$]"
//					for the RESEARCH AND DEVELOPMENT
							, "[$WhatIsTheSquareFootageOfIndoorTheProperty$]",
							"[$WhatIsTheSquareFootageOfOutdoorTheProperty$]",
							"[$AFCL_Whatactivitiesdoyouplanonundertaking_V2$]",
							"[$AFCL_Doyouintendtoresearchotheritemsonthesamepremises$]"
// for the Consent Property Owners
							, "[$TypeOfProperty$]", "[$DescriptionOfProperty$]",
							"[$DescriptionOfIntendedUseOfPropertyToCannabis$]",

//							for the sole owner 
							"[$OwnerName1$]", "[$OwnerDate1$]", "[$OwnerPhone1$]", "[$OwnerAddress1$]", "[OwnerName2$]",
							"[$OwnerDate2$]", "[$OwnerPhone2$]", "[$OwnerAddress2$]", "[$OwnerName3$]",
							"[$OwnerDate3$]", "[$OwnerPhone3$]", "[$OwnerAddress3$]", "[$OwnerName4$]",
							"[$OwnerDate4$]", "[$OwnerPhone4$]", "[$OwnerAddress4$]", "[$OwnerName5$]",
							"[$OwnerDate5$]", "[$OwnerPhone5$]", "[$OwnerAddress5$]", "[$PaymentMethod$]",
							"[$Signature2$]", "[$Date$]"

					}, new String[] {
							Validator.isNotNull(cannabisApplications) ? cannabisApplications.getLicenseCategory() : "",
							Validator.isNotNull(cannabisApplications) ? cannabisApplications.getRequestType() : "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getFirstName()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getMiddleName()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getLastName()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getOtherName()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getMaidenName()
									: "",
							Validator.isNotNull(applicationIndividualInfo)
									? applicationIndividualInfo.getMotherMaidenName()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getGender() : "",
							Validator.isNotNull(applicationIndividualInfo)
									? applicationIndividualInfo.getMaritalStatus()
									: "",
							applicationIndividualInfo != null && applicationIndividualInfo.getDob() != null
									? new SimpleDateFormat("yyyy-MM-dd").format(applicationIndividualInfo.getDob())
									: StringPool.BLANK,
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getPlaceOfBirth()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getNationality()
									: "",
							Validator.isNotNull(applicationIndividualInfo)
									? applicationIndividualInfo.getDurationInJamaika()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getTrn() : "",

							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getPassporNo()
									: "",
							Validator.isNotNull(applicationIndividualInfo)
									? applicationIndividualInfo.getCurrentOccupation()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getContactHome()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getContactWork()
									: "",
							Validator.isNotNull(applicationIndividualInfo)
									? applicationIndividualInfo.getContactMobile()
									: "",
							Validator.isNotNull(applicationIndividualInfo) ? applicationIndividualInfo.getEmail() : "",
							Validator.isNotNull(applicationIndividualRegiAddressInfo)
									? applicationIndividualRegiAddressInfo.getStreetName()
									: "",
							Validator.isNotNull(applicationIndividualRegiAddressInfo)
									? applicationIndividualRegiAddressInfo.getTown()
									: "",
							Validator.isNotNull(applicationIndividualRegiAddressInfo)
									? applicationIndividualRegiAddressInfo.getParish()
									: "",
							Validator.isNotNull(applicationIndividualMailAddressInfo)
									? applicationIndividualMailAddressInfo.getStreetName()
									: "",
							Validator.isNotNull(applicationIndividualMailAddressInfo)
									? applicationIndividualMailAddressInfo.getTown()
									: "",
							Validator.isNotNull(applicationIndividualMailAddressInfo)
									? applicationIndividualMailAddressInfo.getParish()
									: "",
							Validator.isNotNull(applicationIndividualInfo)
									? applicationIndividualInfo.getIdentityNumber()
									: "",
//									for the generalDelarations
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 0
									? generalDelarations.get(0).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 1
									? generalDelarations.get(1).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 16
									? generalDelarations.get(16).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 17
									? generalDelarations.get(17).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 18
									? generalDelarations.get(18).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 19
									? generalDelarations.get(19).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 3
									? generalDelarations.get(3).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 20
									? generalDelarations.get(20).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 21
									? generalDelarations.get(21).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 4
									? generalDelarations.get(4).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 5
									? generalDelarations.get(5).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 6
									? generalDelarations.get(6).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 7
									? generalDelarations.get(7).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 8
									? generalDelarations.get(8).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 9
									? generalDelarations.get(9).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 10
									? generalDelarations.get(10).getAnswer()
									: "",

							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 11
									? generalDelarations.get(11).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 12
									? generalDelarations.get(12).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 13
									? generalDelarations.get(13).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 14
									? generalDelarations.get(14).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 15
									? generalDelarations.get(15).getAnswer()
									: "",
							// for the financial Histories
							Validator.isNotNull(financialHistories) && financialHistories.size() > 0
									? financialHistories.get(0).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 1
									? financialHistories.get(1).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 2
									? financialHistories.get(2).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 3
									? financialHistories.get(3).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 4
									? financialHistories.get(4).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 5
									? financialHistories.get(5).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 6
									? financialHistories.get(6).getAnswer()
									: "",
							previewUrlforAutorizationBackground,
// for thr research and development 
							Validator.isNotNull(cannabisSupplementalInformations)
									&& cannabisSupplementalInformations.size() > 0
											? cannabisSupplementalInformations.get(0).getAnswer()
											: "",
							Validator.isNotNull(cannabisSupplementalInformations)
									&& cannabisSupplementalInformations.size() > 1
											? cannabisSupplementalInformations.get(1).getAnswer()
											: "",
							Validator.isNotNull(cannabisSupplementalInformations)
									&& cannabisSupplementalInformations.size() > 2
											? cannabisSupplementalInformations.get(2).getAnswer()
											: "",
//for the Consent Property Owners
							Validator.isNotNull(cannabisConsentByPropertyOwners)
									? cannabisConsentByPropertyOwners.getTypeOfProperty()
									: "",
							Validator.isNotNull(cannabisConsentByPropertyOwners)
									? cannabisConsentByPropertyOwners.getDescriptionOfProperty()
									: "",
							Validator.isNotNull(cannabisConsentByPropertyOwners)
									? cannabisConsentByPropertyOwners.getDescriptionOfIntendedUse()
									: "",
//									for the sole sole Owner
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 0
									? cannabisConsentBySoleOwners.get(0).getOwnerName()
									: "",
							cannabisConsentBySoleOwners.size() >= 0
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(0).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(0).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 0
									? cannabisConsentBySoleOwners.get(0).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 0
									? cannabisConsentBySoleOwners.get(0).getOwnerAddress()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 1
									? cannabisConsentBySoleOwners.get(1).getOwnerName()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 1
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(1).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 1
									? cannabisConsentBySoleOwners.get(1).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 1
									? cannabisConsentBySoleOwners.get(1).getOwnerAddress()
									: "",

							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 2
									? cannabisConsentBySoleOwners.get(2).getOwnerName()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 2
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(2).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 2
									? cannabisConsentBySoleOwners.get(2).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 2
									? cannabisConsentBySoleOwners.get(2).getOwnerAddress()
									: "",

							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 3
									? cannabisConsentBySoleOwners.get(3).getOwnerName()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 3
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(3).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(3).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 3
									? cannabisConsentBySoleOwners.get(3).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 3
									? cannabisConsentBySoleOwners.get(3).getOwnerAddress()
									: "",

							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 4
									? cannabisConsentBySoleOwners.get(4).getOwnerName()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 4
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(4).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(4).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 4
									? cannabisConsentBySoleOwners.get(4).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 4
									? cannabisConsentBySoleOwners.get(4).getOwnerAddress()
									: "",
//							for the payment 
							Validator.isNotNull(cannabisPayment) ? cannabisPayment.getPaymentMethod() : "",
							previewUrlforSupplymentInfoSignature,
							Validator.isNotNull(cannabisApplications)
									? dateFormat.format(cannabisApplications.getCreateDate())
									: "" });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("true")) {
					String title = "";
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String fileName = "";
						List<CannabisSupportingDocumentsMaster> cannabisSupportingDocumentsMasters = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocApplicant("Applicant", "Sole Trader",
										"Research and Development Licence");
						if (checkPdfSendingInLaunchCaseWithoutDoc.equals("true")) {
							String certifiedCopy = "";
							String cretificteCopyOfPassport = "";
							String certifiedCopyOfNational = "";
							String twoCertified = "";
							String signedOriginalPolice = "";
							String taxComplianceNotification = "";
							String certificateOfRegis = "";
							String businessRegistration = "";
							String passportOfBioPage = "";
							String completedDueDiligence = "";
							for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : cannabisSupportingDocumentsMasters) {
								try {
									FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(
											themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),
											cannabisSupportingDocumentsMaster.getDocumentName());
									fileName = fileEntry.getFileName();
									title = fileEntry.getTitle();
								} catch (Exception e) {
								}
								if (title.equals("Certified copy of Driver�s Licence")) {
									certifiedCopy = fileName;
								} else if (title.equals("Certified copy of Passport Bio-page")) {
									cretificteCopyOfPassport = fileName;
								} else if (title.equals("Certified copy of National Identification Card")) {
									certifiedCopyOfNational = fileName;
								} else if (title.equals("Two 2 certified passport sized photographs")) {
									twoCertified = fileName;
								} else if (title.equals(
										"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant")) {
									signedOriginalPolice = fileName;
								} else if (title.equals("Tax Compliance Notification Letter")) {
									taxComplianceNotification = fileName;
								} else if (title.equals("Certificate of Registration")) {
									certificateOfRegis = fileName;
								} else if (title.equals("Business Registration Form")) {
									businessRegistration = fileName;
								} else if (title.equals("Passport Bio-page, if not already uploaded")) {
									passportOfBioPage = fileName;
								} else if (title.equals("Completed Due Diligence Requirement Form")) {
									completedDueDiligence = fileName;
								}
							}
							pdfTemplate = StringUtil.replace(pdfTemplate,
									new String[] { "[$JaimicaDriverLIcense$]", "[$JaimicanPassport$]",
											"[$JaimicanNationalIdentificationCard$]", "[$PassportSizedPhotographs$]",
											"[$PoliceCertificateAddressed$]", "[$TaxComplianceNotificationLetter$]",
											"[$CertifactionOfRegistration$]", "[$BusinessRegistrationForm$]",
											"[$PassportBioPage$]", "[$CompletedDueDiligenceRequirementForm$]" },
									new String[] { certifiedCopy, cretificteCopyOfPassport, certifiedCopyOfNational,
											twoCertified, signedOriginalPolice, taxComplianceNotification,
											certificateOfRegis, businessRegistration, passportOfBioPage,
											completedDueDiligence });
						}
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String fileName = "";
						List<CannabisSupportingDocumentsMaster> cannabisSupportingDocumentsMasters = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Property", "Sole Trader", "Research and Development Licence",
										"Registered Land Applicant Owns Property");
						if (checkPdfSendingInLaunchCaseWithoutDoc.equals("true")) {
							String certifiedCopyOfCertificateOfTitle = "";
							String certificateCopyOfTwoStatutory = "";
							String proofOfPaymentTaxes = "";
							String surveyDiagram = "";
							for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : cannabisSupportingDocumentsMasters) {
								try {
									FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(
											themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),
											cannabisSupportingDocumentsMaster.getDocumentName());
									fileName = fileEntry.getFileName();
									title = fileEntry.getTitle();
								} catch (Exception e) {
								}
								if (title.equals(
										"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
									certifiedCopyOfCertificateOfTitle = fileName;
								} else if (title.equals(
										"Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
									certificateCopyOfTwoStatutory = fileName;
								} else if (title.equals(
										"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
									proofOfPaymentTaxes = fileName;
								} else if (title.equals(
										"Survey Diagram showing entrance exits receival loading and storage areas")) {
									surveyDiagram = fileName;
								}
							}
							pdfTemplate = StringUtil.replace(pdfTemplate,
									new String[] { "[$CertifiedCopyOfCertificateOfTitle$]", "[$UnregisteredLand$]",
											"[$ProofOfPaymentOfTaxesPaid$]",
											"[$SurveyDiagramShowingEntranceExitsReceivalLoading$]" },
									new String[] { certifiedCopyOfCertificateOfTitle, certificateCopyOfTwoStatutory,
											proofOfPaymentTaxes, surveyDiagram });
						}
					}
				}
			}
		}
		return pdfTemplate;
	}

	@Override
	public String replaceAcquirePdfVar(long acquireApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		// TODO Auto-generated method stub
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		AcquireApplication acquireApplication = AcquireApplicationLocalServiceUtil
				.getAcquireApplication(acquireApplicationId);
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Acquire Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(acquireApplication.getAcquireApplicationId()));
		} catch (Exception e) {
		}
		if (acquireApplication.getDivestmentOptions().equals("Unsolicited Proposals")
				|| acquireApplication.getDivestmentOptions().equals("Special Cases")) {

			AcquireApplicationDetails acquireApplicationDetails = null;
			AcquirePropertyDetails acquirePropertyDetails = null;
			AcquirePaymentPlan acquirePaymentPlan = null;
			try {
				acquireApplicationDetails = AcquireApplicationDetailsLocalServiceUtil
						.getAcquireApplicationDetailsById(acquireApplicationId);
			}catch (Exception e) {
			}try {
				acquirePropertyDetails = AcquirePropertyDetailsLocalServiceUtil
						.getAcquirePropertyDetailsById(acquireApplicationId);
			}catch (Exception e) {
			}try {
				acquirePaymentPlan = AcquirePaymentPlanLocalServiceUtil.getAcquirePaymentPlanById(acquireApplicationId);
			} catch (Exception e) {
			}
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "acquire-crown-land-1");
			if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "acquire-land-form1-");
			}
			try {
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//							for the first form of proposal
						"[$DOCL_ApplicantName$]", "[$DOCL_NameofOrganisationCompany$]", "[$DOCL_PostalAddress$]",
						"[$DOCL_TelephoneNumber$]", "[$DOCL_ApplicantEmailAddress$]"

//						for the second form of proposal
						, "[$TypeOfTenure$]", "[$IdentifiedASpecificProPerty$]", "[$DOCL_LocationPropertyAddress$]",
						"[$DOCL_DesiredLocationParish$]", "[$DOCL_Volume$]", "[$DOCL_Folio$]",
						"[$DOCL_ValuationNumber$]", "[$AttachedASketchPlanOrMapOfProperty$]", "[$CurrentUse$]",
						"[$ExistingBuilding$]", "[$PleaseSpecify$]", "[$ExistingInfrastructure$]", "[$ProposedUse$]",
						"[$PleaseSpecify$]", "[$ProposedInfrastructure$]", "[$Hectare$]", "[$Acres$]", "[$Roods$]",
						"[$Perches$]", "[$North$]", "[$South$]", "[$East$]", "[$West$]", "[$DateRequired$]",
						"[$CommentsOrInformation$]"

//		for the third form of proposal			
						, "[$HowWillYouPayforThisProperty$]", "[$PleaseSpecifyOther$]", "[$Date$]" },

						new String[] {
//							for the first form of proposal
								Validator.isNotNull(acquireApplicationDetails)
										? acquireApplicationDetails.getApplicantName()
										: "",
								Validator.isNotNull(acquireApplicationDetails)
										? acquireApplicationDetails.getApplicantOrganisation()
										: "",
								Validator.isNotNull(acquireApplicationDetails)
										? acquireApplicationDetails.getApplicantPostalAddr()
										: "",
								Validator.isNotNull(acquireApplicationDetails)
										? acquireApplicationDetails.getApplicantTeleNum()
										: "",
								Validator.isNotNull(acquireApplicationDetails)
										? acquireApplicationDetails.getApplicantEmail()
										: "",

//					for the first form of proposal
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyTenureType()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyIdentified()
										: "",
								Validator.isNotNull(acquirePropertyDetails) ? acquirePropertyDetails.getPropertyAddr()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyDesiredLoc()
										: "",
								Validator.isNotNull(acquirePropertyDetails) ? acquirePropertyDetails.getPropertyVolume()
										: "",
								Validator.isNotNull(acquirePropertyDetails) ? acquirePropertyDetails.getPropertyFolio()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyValuationNum()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertySketchAttached()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyCurrentUse()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyExistingBuilding()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyExistingBuildingOther()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyExistingInfrastructure()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyProposedUse()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyProposedUseOther()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyProposedInfrastructure()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyLandAreaHectare()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyLandAreaAcres()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyLandAreaRoods()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyLandAreaPerches()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyAdjoiningNorth()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyAdjoiningSouth()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyAdjoiningEast()
										: "",
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyAdjoiningWest()
										: "",
								acquirePropertyDetails != null && acquirePropertyDetails.getPropertyDate() != null
										? new SimpleDateFormat("yyyy-MM-dd")
												.format(acquirePropertyDetails.getPropertyDate())
										: StringPool.BLANK,
								Validator.isNotNull(acquirePropertyDetails)
										? acquirePropertyDetails.getPropertyAdditionalInfo()
										: "",

//							for the third form of proposal			
								Validator.isNotNull(acquirePaymentPlan) ? acquirePaymentPlan.getPaymentMethod() : "",
								Validator.isNotNull(acquirePaymentPlan) ? acquirePaymentPlan.getPaymentMethodOther()
										: "",
								Validator.isNotNull(acquireApplication)
										? dateFormat.format(acquireApplication.getCreateDate())
										: "" });
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
				String title = "";
				String fileName = "";
				String companyTcc = "";
				String sitePlan = "";
				String businessPlan = "";
				try {
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						List<AcquireDocumentList> acquireSupportingDocList = AcquireDocumentListLocalServiceUtil
								.getAcquireDocumentByDocType("AcquireDocument");
						for (AcquireDocumentList acquireDocumentList : acquireSupportingDocList) {
							FileEntry fileEntry = null;
							try {
								fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(), acquireDocumentList.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals(
									"Company TCC and TRN assignment document from Tax Administration Jamaica")) {
								companyTcc = fileName;
							} else if (title.equals("Site Plan")) {
								sitePlan = fileName;
							} else if (title.equals("Business Plan")) {
								businessPlan = fileName;
							}
						}
						pdfTemplate = StringUtil
								.replace(pdfTemplate,
										new String[] { "[$CompanyTCCAndTRNAssignmentDocument$]", "[$SitePlan$]",
												"[$BusinessPlan$]" },
										new String[] { companyTcc, sitePlan, businessPlan });
					}
				} catch (Exception e) {
				}
			}
		} else if (acquireApplication.getDivestmentOptions().equals("Land Settlement Schemes")) {
			AcquireLandApplicantDetails acquireLandApplicantDetails = null;
			AcquireLandEmployment acquireLandEmployment = null;
			AcquireLandPropertyDetails acquireLandPropertyDetails = null;
			try {
				acquireLandApplicantDetails = AcquireLandApplicantDetailsLocalServiceUtil
						.getAcquireLandApplicantById(acquireApplicationId);
			}catch (Exception e) {
			}try {
				acquireLandEmployment = AcquireLandEmploymentLocalServiceUtil
						.getAcquireLandEmploymentById(acquireApplicationId);
			}catch (Exception e) {
			}try {
				acquireLandPropertyDetails = AcquireLandPropertyDetailsLocalServiceUtil
						.getAcquireLandPropertyDetailsById(acquireApplicationId);
			} catch (Exception e) {
			}
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "acquire_land_settlement_form");
			if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "acquire_land-form2-");
			}
			try {
				pdfTemplate = StringUtil.replace(pdfTemplate,
						new String[] { "[$DOCL_ApplicantName$]", "[$Gender$]", "[$DateOfBirth$]",
								"[$TaxpayerRegistrationNumber$]", "[$HomeAddress$]", "[$MailingAddress$]",
								"[$PhoneNumber$]", "[$E-mail$]",

//							for the second for in land
								"[$EmploymentStatus$]", "[$AreYouaGovernmentOfJamaicaEmployee$]",
								"[$NameOfOrganisation/Company$]", "[$Occupation/JobTitle$]",
								"[$AddressOfOrganisation$]", "[$TelephoneNumberOfOrganisation$]",
								"[$GrossIncome/SalaryFrequency$]", "[$GrossIncome/Salary$]", "[$Source of Income$]",
								"[$FrequencyOfOtherSourceofIncome$]", "[$AmountOfOtherSourceOfIncome$]",
								"[$SupportFinancially$]"

//							for the third form in land
								, "[$HaveYouIdentifiedaSpecificProperty$]",
								"[$Location/AddressOfPropertyBeingAppliedFor$]", "[$DesiredLocation/Parish$]",
								"[$AreYouInOccupationOfTheProperty$]", "[$PeriodofOccupation$]", "[$TypeofTenure$]",
								"[$ProposedUse$]", "[$PleaseSpecifyProposedUse$]", "[$TypeofTenure$]",
								"[$HaveYouAppliedForThisPropertyBefore$]", "[$DateofApplication$]",
								"[$ExistingBuilding(s)$]", "[$PleaseSpecifyOtherBuilding$]",
								"[$LeaseAnyOtherProperty?$]", "[$AcquiredFromovernmentOfJamaica$]", "[$State Details$]",
								"[$HowWillYouPayforThisProperty$]", "[$pleaseSpecifyOther$]",
								"[$CommentsOrAdditionalInformation$]", "[$Date$]"

						},

						new String[] {
								Validator.isNotNull(acquireLandApplicantDetails)
										? acquireLandApplicantDetails.getLandApplicantName()
										: "",
								Validator.isNotNull(acquireLandApplicantDetails)
										? acquireLandApplicantDetails.getLandApplicantGender()
										: "",
								acquireLandApplicantDetails != null
										&& acquireLandApplicantDetails.getLandApplicantDob() != null
												? new SimpleDateFormat("yyyy-MM-dd")
														.format(acquireLandApplicantDetails.getLandApplicantDob())
												: StringPool.BLANK,
								Validator.isNotNull(acquireLandApplicantDetails)
										? acquireLandApplicantDetails.getLandApplicantTrnNum()
										: "",
								Validator.isNotNull(acquireLandApplicantDetails)
										? acquireLandApplicantDetails.getLandApplicantHomeAddr()
										: "",
								Validator.isNotNull(acquireLandApplicantDetails)
										? acquireLandApplicantDetails.getLandApplicantMailingAddr()
										: "",
								Validator.isNotNull(acquireLandApplicantDetails)
										? acquireLandApplicantDetails.getLandApplicantPhoneNum()
										: "",
								Validator.isNotNull(acquireLandApplicantDetails)
										? acquireLandApplicantDetails.getLandApplicantEmail()
										: "",

//						for the seconf form in land
								Validator.isNotNull(acquireLandEmployment)
										? acquireLandEmployment.getLandEmploymentStatus()
										: "",
								Validator.isNotNull(acquireLandEmployment)
										? acquireLandEmployment.getLandEmpJamaicaGovEmplyee()
										: "",
								Validator.isNotNull(acquireLandEmployment)
										? acquireLandEmployment.getLandEmpCompanyName()
										: "",
								Validator.isNotNull(acquireLandEmployment)
										? acquireLandEmployment.getLandEmploymentJobTitle()
										: "",
								Validator.isNotNull(acquireLandEmployment)
										? acquireLandEmployment.getLandEmpCompanyAddr()
										: "",
								Validator.isNotNull(acquireLandEmployment) ? acquireLandEmployment.getLandEmpTeleNum()
										: "",
								Validator.isNotNull(acquireLandEmployment)
										? acquireLandEmployment.getLandEmpGrossSalaryType()
										: "",
								Validator.isNotNull(acquireLandEmployment)
										? acquireLandEmployment.getLandEmpGrossSalary()
										: "",
								Validator.isNotNull(acquireLandEmployment)
										? acquireLandEmployment.getLandEmpOtherIncomeSource()
										: "",
								Validator.isNotNull(acquireLandEmployment)
										? acquireLandEmployment.getLandEmpOtherSalaryType()
										: "",
								Validator.isNotNull(acquireLandEmployment)
										? acquireLandEmployment.getLandEmpOtherIncomeAmount()
										: "",
								Validator.isNotNull(acquireLandEmployment)
										? acquireLandEmployment.getLandEmpFinancialSupportPerson()
										: "",

//							for the third one in land 
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropIdentified()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropAddr()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropDesiredLoc()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropOccupation()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropOccupationPeriod()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropTenureType()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropProposedUse()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropProposedUseOther()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropPropTenureType()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropApplied()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails.getLandPropApplicationDate())
										? dateFormat.format(acquireLandPropertyDetails.getLandPropApplicationDate())
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropExistingBuilding()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropExistingBuildingOther()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropOwn()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropGovAcquired()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropStateDetails()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropPaymentMethod()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropPaymentMethodOther()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? acquireLandPropertyDetails.getLandPropComments()
										: "",
								Validator.isNotNull(acquireLandPropertyDetails)
										? dateFormat.format(acquireLandPropertyDetails.getCreateDate())
										: ""

						});
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
				String title = "";
				String fileName = "";
				String companyTcc = "";
				String sitePlan = "";
				String businessPlan = "";
				try {
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						List<AcquireDocumentList> acquireSupportingDocList = AcquireDocumentListLocalServiceUtil
								.getAcquireDocumentByDocType("AcquireDocument");
						for (AcquireDocumentList acquireDocumentList : acquireSupportingDocList) {
							FileEntry fileEntry = null;
							try {
								fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(), acquireDocumentList.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals(
									"Company TCC and TRN assignment document from Tax Administration Jamaica")) {
								companyTcc = fileName;
							} else if (title.equals("Site Plan")) {
								sitePlan = fileName;
							} else if (title.equals("Business Plan")) {
								businessPlan = fileName;
							}
						}
						pdfTemplate = StringUtil
								.replace(pdfTemplate,
										new String[] { "[$CompanyTCCAndTRNAssignmentDocument$]", "[$SitePlan$]",
												"[$BusinessPlan$]" },
										new String[] { companyTcc, sitePlan, businessPlan });
					}
				} catch (Exception e) {
				}
			}
		}
		return pdfTemplate;
	}

	@Override
	public String replaceHealthCarePdfVar(long healthCareApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		String pdfTemplate = StringPool.BLANK;
		HealthCareApplication healthCareApplication = null;
		HealthCareApplicantInfo applicantInfo = null;
		HealthCareApplicantAddress applicantAddress = null;
		HealthCareBussinessInfo bussinessInfo = null;
		HealthCareBusinessAddress businessAddress = null;
		HealthCareDescriptionOfService careDescriptionOfService = null;
		List<HealthCareEquipmentInfo> healthCareEquipmentInfo = null;
		String previewUrlforHealthcare = null;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		try {
			healthCareApplication = HealthCareApplicationLocalServiceUtil
					.getHealthCareApplication(healthCareApplicationId);
		}catch (Exception e) {
		}try {
			applicantInfo = HealthCareApplicantInfoLocalServiceUtil.getHealthCareById(healthCareApplicationId);
		}catch (Exception e) {
		}try {
			applicantAddress = HealthCareApplicantAddressLocalServiceUtil.getHealthCareById(healthCareApplicationId);
		}catch (Exception e) {
		}try {
			bussinessInfo = HealthCareBussinessInfoLocalServiceUtil.getHealthCareById(healthCareApplicationId);
		}catch (Exception e) {
		}try {
			businessAddress = HealthCareBusinessAddressLocalServiceUtil.getHealthCareById(healthCareApplicationId);
		}catch (Exception e) {
		}try {
			careDescriptionOfService = HealthCareDescriptionOfServiceLocalServiceUtil
					.getHealthCareById(healthCareApplicationId);
		}catch (Exception e) {
		}try {
			healthCareEquipmentInfo = HealthCareEquipmentInfoLocalServiceUtil.getHC_EB_HAI(healthCareApplicationId);
		} catch (Exception e) {
		}
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "HealthCare Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(healthCareApplication.getHealthCareApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "healthcare_form");
		if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "healthcare_form-1");
		}
		try {
			previewUrlforHealthcare = replaceSignature(healthCareApplication.getHealthCareApplicationId(),
					"HealthCare Supported Documents", themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$PIRH1_ApplicantName$]",
					"[$PIRH1_ApplicantMailingAddress$]", "[$PIRH1_ApplicantTelephoneNumber$]",
					"[$PIRH1_ApplicantEmailAddress$]", "[$PIRH1_BusinessName$]", "[$PIRH1_BusinessMailingAddress$]",
					"[$PIRP_BusinessAddressParish$]", "[$PIRH1_BusinessTelephoneNumber$]",
					"[$PIRH1_BusinessEmailAddress$]", "[$PIRH1_BusinessCompany$]", "[$PIRH1_BusinessTRN$]",
					"[$PIRH1_ServicesOffered$]", "[$PIRH1_EquipmentManufacturer1$]", "[$PIRH1_EquipmentMake1$]",
					"[$PIRH1_EquipmentModal1$]", "[$PIRH1_EquipmentYear1$]", "[$PIRH1_EquipmentSerialNumber1$]",
					"[$PIRH1_EquipmentQuantity1$]", "[$PIRH1_EquipmentDescription1$]", "[$PIRH1_EquipmentHSHeading1$]",
					"[$PIRH1_EquipmentHSSubHeading1$]", "[$PIRH1_EquipmentManufacturer2$]", "[$PIRH1_EquipmentMake2$]",
					"[$PIRH1_EquipmentModal2$]", "[$PIRH1_EquipmentYear2$]", "[$PIRH1_EquipmentSerialNumber2$]",
					"[$PIRH1_EquipmentQuantity2$]", "[$PIRH1_EquipmentDescription2$]", "[$PIRH1_EquipmentHSHeading2$]",
					"[$PIRH1_EquipmentHSSubHeading2$]", "[$PIRH1_EquipmentManufacturer3$]", "[$PIRH1_EquipmentMake3$]",
					"[$PIRH1_EquipmentModal3$]", "[$PIRH1_EquipmentYear3$]", "[$PIRH1_EquipmentSerialNumber3$]",
					"[$PIRH1_EquipmentQuantity3$]", "[$PIRH1_EquipmentDescription3$]", "[$PIRH1_EquipmentHSHeading3$]",
					"[$PIRH1_EquipmentHSSubHeading3$]", "[$PIRH1_EquipmentManufacturer4$]", "[$PIRH1_EquipmentMake4$]",
					"[$PIRH1_EquipmentModal4$]", "[$PIRH1_EquipmentYear4$]", "[$PIRH1_EquipmentSerialNumber4$]",
					"[$PIRH1_EquipmentQuantity4$]", "[$PIRH1_EquipmentDescription4$]", "[$PIRH1_EquipmentHSHeading4$]",
					"[$PIRH1_EquipmentHSSubHeading4$]", "[$PIRH1_EquipmentManufacturer5$]", "[$PIRH1_EquipmentMake5$]",
					"[$PIRH1_EquipmentModal5$]", "[$PIRH1_EquipmentYear5$]", "[$PIRH1_EquipmentSerialNumber5$]",
					"[$PIRH1_EquipmentQuantity5$]", "[$PIRH1_EquipmentDescription5$]", "[$PIRH1_EquipmentHSHeading5$]",
					"[$PIRH1_EquipmentHSSubHeading5$]", "[$Date$]", "[$Signature$]" },

					new String[] { Validator.isNotNull(applicantInfo) ? applicantInfo.getName() : "",
							Validator.isNotNull(applicantAddress) ? applicantAddress.getApplicantMailingAddress() : "",
							Validator.isNotNull(applicantInfo) ? applicantInfo.getTelephoneNumber() : "",
							Validator.isNotNull(applicantInfo) ? applicantInfo.getEmailAddress() : "",
							Validator.isNotNull(bussinessInfo) ? bussinessInfo.getName() : "",
							Validator.isNotNull(businessAddress) ? businessAddress.getBussinessAddress() : "",
							Validator.isNotNull(bussinessInfo) ? bussinessInfo.getParish() : "",
							Validator.isNotNull(bussinessInfo) ? bussinessInfo.getTelephoneNumber() : "",
							Validator.isNotNull(bussinessInfo) ? bussinessInfo.getEmail() : "",
							Validator.isNotNull(bussinessInfo) ? bussinessInfo.getCompanyNumber() : "",
							Validator.isNotNull(bussinessInfo) ? bussinessInfo.getTrnNumber() : "",
							Validator.isNotNull(careDescriptionOfService)
									? careDescriptionOfService.getDescriptionOfService()
									: "",
							healthCareEquipmentInfo.size() > 0 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(0).getEquipmentManu()
									: "",
							healthCareEquipmentInfo.size() > 0 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(0).getEquipmentModel()
									: "",
							healthCareEquipmentInfo.size() > 0 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(0).getEquipmentMake()
									: "",
							healthCareEquipmentInfo.size() > 0 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(0).getYearOfEquipment()
									: "",
							healthCareEquipmentInfo.size() > 0 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(0).getSerialNumber()
									: "",
							healthCareEquipmentInfo.size() > 0 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(0).getQuantity()
									: "",
							healthCareEquipmentInfo.size() > 0 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(0).getDescription()
									: "",
							healthCareEquipmentInfo.size() > 0 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(0).getHsHeading()
									: "",
							healthCareEquipmentInfo.size() > 0 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(0).getHsSubHeading()
									: "",
							healthCareEquipmentInfo.size() > 1 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(1).getEquipmentManu()
									: "",
							healthCareEquipmentInfo.size() > 1 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(1).getEquipmentModel()
									: "",
							healthCareEquipmentInfo.size() > 1 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(1).getEquipmentMake()
									: "",
							healthCareEquipmentInfo.size() > 1 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(1).getYearOfEquipment()
									: "",
							healthCareEquipmentInfo.size() > 1 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(1).getSerialNumber()
									: "",
							healthCareEquipmentInfo.size() > 1 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(1).getQuantity()
									: "",
							healthCareEquipmentInfo.size() > 1 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(1).getDescription()
									: "",
							healthCareEquipmentInfo.size() > 1 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(1).getHsHeading()
									: "",
							healthCareEquipmentInfo.size() > 1 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(1).getHsSubHeading()
									: "",
							healthCareEquipmentInfo.size() > 2 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(2).getEquipmentManu()
									: "",
							healthCareEquipmentInfo.size() > 2 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(2).getEquipmentModel()
									: "",
							healthCareEquipmentInfo.size() > 2 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(2).getEquipmentMake()
									: "",
							healthCareEquipmentInfo.size() > 2 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(2).getYearOfEquipment()
									: "",
							healthCareEquipmentInfo.size() > 2 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(2).getSerialNumber()
									: "",
							healthCareEquipmentInfo.size() > 2 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(2).getQuantity()
									: "",
							healthCareEquipmentInfo.size() > 2 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(2).getDescription()
									: "",
							healthCareEquipmentInfo.size() > 2 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(2).getHsHeading()
									: "",
							healthCareEquipmentInfo.size() > 2 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(2).getHsSubHeading()
									: "",
							healthCareEquipmentInfo.size() > 3 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(3).getEquipmentManu()
									: "",
							healthCareEquipmentInfo.size() > 3 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(3).getEquipmentModel()
									: "",
							healthCareEquipmentInfo.size() > 3 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(3).getEquipmentMake()
									: "",
							healthCareEquipmentInfo.size() > 3 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(3).getYearOfEquipment()
									: "",
							healthCareEquipmentInfo.size() > 3 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(3).getSerialNumber()
									: "",
							healthCareEquipmentInfo.size() > 3 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(3).getQuantity()
									: "",
							healthCareEquipmentInfo.size() > 3 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(3).getDescription()
									: "",
							healthCareEquipmentInfo.size() > 3 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(3).getHsHeading()
									: "",
							healthCareEquipmentInfo.size() > 3 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(3).getHsSubHeading()
									: "",

							healthCareEquipmentInfo.size() > 4 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(4).getEquipmentManu()
									: "",
							healthCareEquipmentInfo.size() > 4 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(4).getEquipmentModel()
									: "",
							healthCareEquipmentInfo.size() > 4 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(4).getEquipmentMake()
									: "",
							healthCareEquipmentInfo.size() > 4 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(4).getYearOfEquipment()
									: "",
							healthCareEquipmentInfo.size() > 4 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(4).getSerialNumber()
									: "",
							healthCareEquipmentInfo.size() > 4 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(4).getQuantity()
									: "",
							healthCareEquipmentInfo.size() > 4 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(4).getDescription()
									: "",
							healthCareEquipmentInfo.size() > 4 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(4).getHsHeading()
									: "",
							healthCareEquipmentInfo.size() > 4 && Validator.isNotNull(healthCareEquipmentInfo)
									? healthCareEquipmentInfo.get(4).getHsSubHeading()
									: "",
							Validator.isNotNull(healthCareApplication)
									? dateFormat.format(healthCareApplication.getCreateDate())
									: "",
							previewUrlforHealthcare });
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			String fileName = null;
			String title = null;
			String requestLetter = null;
			String proForma = null;
			String brochureSpecification = null;
			String AnyOther = null;

			for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Request Letter")) {
					requestLetter = fileName;
				} else if (title.equals("Pro-forma invoice from supplier")) {
					proForma = fileName;
				} else if (title.equals("Brochure/specification providing description of equipment/device")) {
					brochureSpecification = fileName;
				} else if (title.equals("Any other supportive documentation as required")) {
					AnyOther = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//		for the document 
					"[$RequestLetter$]", "[$ProFormaInvoiceFromSupplier$]", "[$Brochure$]",
					"[$SupportiveDocumentationAsRequired$]" },
					new String[] { requestLetter, proForma, brochureSpecification, AnyOther });
		}
		return pdfTemplate;
	}

	@Override
	public String replaceFilmPdfVar(long filmApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		FilmCompanyDetails companyDetails = null;
		FilmProductionDetails productionDetails = null;
		FilmOtherDetails otherDetails = null;
		FilmApplication filmApplication = null;
		List<FilmAdditionalEquipmentList> filmAdditional = null;
		List<FilmEquipmentList> filmEquipmentList = null;
		FilmApplicationPayment filmApplicationPayment = null;
		try {
			filmApplication = FilmApplicationLocalServiceUtil.getFilmApplication(filmApplicationId);
			companyDetails = FilmCompanyDetailsLocalServiceUtil.getFilmById(filmApplicationId);
			productionDetails = FilmProductionDetailsLocalServiceUtil.getFilmById(filmApplicationId);
			otherDetails = FilmOtherDetailsLocalServiceUtil.getFilmById(filmApplicationId);
			filmAdditional = FilmAdditionalEquipmentListLocalServiceUtil.getFilmAddEquipByAppId(filmApplicationId);
			filmEquipmentList = FilmEquipmentListLocalServiceUtil.getFilmByAppId(filmApplicationId);
			filmApplicationPayment = FilmApplicationPaymentLocalServiceUtil.getFilm_Pay_FAI(filmApplicationId);
		} catch (Exception e) {
		}
		pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "film_project_form");
		if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "film_project_form-1");
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate,
					new String[] { "[$ROFCP_CompanyName$]", "[$ROFCP_Address$]","[$ROFCP_CountryOrigin$]", "[$ROFCP_Telephone$]",
							"[$ROFCP_Mobile$]", "[$ROFCP_ContactPerson$]", "[$E-Mail$]", "[$ROFCP_ProductionTitle$]",
//							for the Production detail
							"[$Working_Title$]", "[$Production_Format$]", "[$ROFCP_ForeignPersonnel$]",
							"[$ROFCP_JamaicanPersonnel$]", "[$CompanyName$]", "[$FixerName$]", "[$FixerMobile$]",
							"[$FixerEmail$]", "[$ROFCP_PreProductionDates$]", "[$JamaicaEndDate$]",
							"[$ProductionStartDate$]", "[$ProductionEndDate$]", "[$ROFCP_ProposedProductionLocations$]",
							"[$TotalProductionBudget$]", "[$ExpenditureinJamaica$]", "[$InternationalCrew$]",
							"[$JamaicanCrew$]", "[$ExternalPermitsRequired$]",

//for the equipemt and importation 
							"[$MethodOfImportation$]", "[$TravellingWithEquipment$]", "[$ROFCP_PortofEntry$]",
							"[$ArrivalDateInJamaica$]", "[$DepartureDateFromJamaica$]", "[$ROFCP_FlightDetails$]",
							"[$ShippingCompany$]", "[$VesselNo$]", "[$ROFCP_CustomsBroker$]", "[$ROFCP_BrokerEmail$]",
							"[$ROFCP_BrokerMobile$]", "[$ROFCP_TypeofEquipmentRequiredinJamaica$]",
							"[$ROFCP_RentalArrangedThrough$]",

//	for the Addition Equipment Importion 	
							"[$Arrival Date1$]", "[$Airline/Shipper1$]", "[$Flight/Vessel1$]", "[$Name of Passenger1$]",
							"[$Port of Entry1$]", "[$Customs Broker1$]", "[$Arrival Date2$]", "[$Airline/Shipper2$]",
							"[$Flight/Vessel2$]", "[$Name of Passenger2$]", "[$Port of Entry2$]", "[$Customs Broker2$]",
							"[$Arrival Date3$]", "[$Airline/Shipper3$]", "[$Flight/Vessel3$]", "[$Name of Passenger3$]",
							"[$Port of Entry3$]", "[$Customs Broker3$]", "[$Arrival Date4$]", "[$Airline/Shipper4$]",
							"[$Flight/Vessel4$]", "[$Name of Passenger4$]", "[$Port of Entry4$]", "[$Customs Broker4$]",
							"[$Arrival Date5$]", "[$Airline/Shipper5$]", "[$Flight/Vessel5$]", "[$Name of Passenger5$]",
							"[$Port of Entry5$]", "[$Customs Broker5$]",

//				for the last one 
//							"[$Item1$]", "[$Serial Number1$]", "[$Weight1$]", "[$Quantity1$]", "[$Unit Price1$]",
//							"[$Description1$]", "[$Total1$]", "[$Item2$]", "[$Serial Number2$]", "[$Weight2$]",
//							"[$Quantity2$]", "[$Unit Price2$]", "[$Description2$]", "[$Total2$]", "[$Item3$]",
//							"[$Serial Number3$]", "[$Weight3$]", "[$Quantity3$]", "[$Unit Price3$]", "[$Description3$]",
//							"[$Total3$]", "[$Item4$]", "[$Serial Number4$]", "[$Weight4$]", "[$Quantity4$]",
//							"[$Unit Price4$]", "[$Description4$]", "[$Total4$]", "[$Item5$]", "[$Serial Number5$]",
//							"[$Weight5$]", "[$Quantity5$]", "[$Unit Price5$]", "[$Description5$]", "[$Total5$]",
							"[$PaymentMethod$]", "[$Date$]" },

					new String[] {
							Validator.isNotNull(companyDetails) && Validator.isNotNull(companyDetails.getCompanyName())
									? companyDetails.getCompanyName()
									: "",
							Validator.isNotNull(companyDetails) && Validator.isNotNull(companyDetails.getAddress())
									? companyDetails.getAddress()
									: "",
									Validator.isNotNull(companyDetails) && Validator.isNotNull(companyDetails.getCountryOrigin())
									? companyDetails.getCountryOrigin()
									: "",
							Validator.isNotNull(companyDetails)
									&& Validator.isNotNull(companyDetails.getTelephoneNumber())
											? companyDetails.getTelephoneNumber()
											: "",
							Validator.isNotNull(companyDetails) && Validator.isNotNull(companyDetails.getMobile())
									? companyDetails.getMobile()
									: "",
							Validator.isNotNull(companyDetails)
									&& Validator.isNotNull(companyDetails.getContactPerson())
											? companyDetails.getContactPerson()
											: "",
							Validator.isNotNull(companyDetails) && Validator.isNotNull(companyDetails.getEmail())
									? companyDetails.getEmail()
									: "",
							Validator.isNotNull(productionDetails) && Validator.isNotNull(companyDetails.getPosition())
									? companyDetails.getPosition()
									: "",
//for the production title 
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getProductionTitle())
											? productionDetails.getProductionTitle()
											: "",
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getProductionType())
											? productionDetails.getProductionType()
											: "",
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getForeignPersonnel())
											? productionDetails.getForeignPersonnel()
											: "",
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getJamaicanPersonnel())
											? productionDetails.getJamaicanPersonnel()
											: "",
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getCompanyName())
											? productionDetails.getCompanyName()
											: "",
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getFixerName())
											? productionDetails.getFixerName()
											: "",
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getFixerMobile())
											? productionDetails.getFixerMobile()
											: "",
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getFixerEmail())
											? productionDetails.getFixerEmail()
											: "",
							productionDetails != null && productionDetails.getPreProductionDates() != null
									? new SimpleDateFormat("yyyy-MM-dd")
											.format(productionDetails.getPreProductionDates())
									: StringPool.BLANK,
							productionDetails != null && productionDetails.getProductionDates() != null
									? new SimpleDateFormat("yyyy-MM-dd").format(productionDetails.getProductionDates())
									: StringPool.BLANK,
							productionDetails != null && productionDetails.getProductionStartDate() != null
									? new SimpleDateFormat("yyyy-MM-dd")
											.format(productionDetails.getProductionStartDate())
									: StringPool.BLANK,
							productionDetails != null && productionDetails.getProductionEndDate() != null
									? new SimpleDateFormat("yyyy-MM-dd")
											.format(productionDetails.getProductionEndDate())
									: StringPool.BLANK,
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getProposedProductionLocations())
											? productionDetails.getProposedProductionLocations()
											: "",
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getTotalProductionBudget())
											? productionDetails.getTotalProductionBudget()
											: "",
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getExpenditureInJamaica())
											? productionDetails.getExpenditureInJamaica()
											: "",
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getProductionInternationalCrew())
											? productionDetails.getProductionInternationalCrew()
											: "",
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getProductionjamaicanCrew())
											? productionDetails.getProductionjamaicanCrew()
											: "",
							Validator.isNotNull(productionDetails)
									&& Validator.isNotNull(productionDetails.getProductionExternalPermit())
											? productionDetails.getProductionExternalPermit()
											: "",

							Validator.isNotNull(otherDetails)
									&& Validator.isNotNull(otherDetails.getTemporaryImportEquipment())
											? otherDetails.getTemporaryImportEquipment()
											: "",
							Validator.isNotNull(otherDetails)
									&& Validator.isNotNull(otherDetails.getPersonnelTravellingEquipment())
											? otherDetails.getPersonnelTravellingEquipment()
											: "",
							Validator.isNotNull(otherDetails) && Validator.isNotNull(otherDetails.getPortOfEntry())
									? otherDetails.getPortOfEntry()
									: "",
							otherDetails != null && otherDetails.getArrivalDate() != null
									? new SimpleDateFormat("yyyy-MM-dd").format(otherDetails.getArrivalDate())
									: StringPool.BLANK,

							otherDetails != null && otherDetails.getDepartureDate() != null
									? new SimpleDateFormat("yyyy-MM-dd").format(otherDetails.getDepartureDate())
									: StringPool.BLANK,
							Validator.isNotNull(otherDetails) && Validator.isNotNull(otherDetails.getFlightDetails())
									? otherDetails.getFlightDetails()
									: "",
							Validator.isNotNull(otherDetails) && Validator.isNotNull(otherDetails.getShippingCompany())
									? otherDetails.getShippingCompany()
									: "",
							Validator.isNotNull(otherDetails) && Validator.isNotNull(otherDetails.getShippingVesselNo())
									? otherDetails.getShippingVesselNo()
									: "",
							Validator.isNotNull(otherDetails) && Validator.isNotNull(otherDetails.getCustomsBroker())
									? otherDetails.getCustomsBroker()
									: "",
							Validator.isNotNull(otherDetails) && Validator.isNotNull(otherDetails.getBrokerEmail())
									? otherDetails.getBrokerEmail()
									: "",
							Validator.isNotNull(otherDetails) && Validator.isNotNull(otherDetails.getBrokerMobile())
									? otherDetails.getBrokerMobile()
									: "",
							Validator.isNotNull(otherDetails)
									&& Validator.isNotNull(otherDetails.getTypeOfEquipmentJamaica())
											? otherDetails.getTypeOfEquipmentJamaica()
											: "",
							Validator.isNotNull(otherDetails)
									&& Validator.isNotNull(otherDetails.getRentalArrangedThrough())
											? otherDetails.getRentalArrangedThrough()
											: "",
//for the Addition Equipment Importion 
							filmAdditional.size() >= 0 && Validator.isNotNull(filmAdditional.get(0).getArrivalDate())
									? dateFormat.format(filmAdditional.get(0).getArrivalDate())
									: "",
							Validator.isNotNull(filmAdditional)
									&& Validator.isNotNull(filmAdditional.get(0).getAirlineShipper())
											? filmAdditional.get(0).getAirlineShipper()
											: "",
							Validator.isNotNull(filmAdditional)
									&& Validator.isNotNull(filmAdditional.get(0).getFlightVesselNum())
											? filmAdditional.get(0).getFlightVesselNum()
											: "",
							Validator.isNotNull(filmAdditional)
									&& Validator.isNotNull(filmAdditional.get(0).getPassengerName())
											? filmAdditional.get(0).getPassengerName()
											: "",
							Validator.isNotNull(filmAdditional)
									&& Validator.isNotNull(filmAdditional.get(0).getEntryPort())
											? filmAdditional.get(0).getEntryPort()
											: "",
							Validator.isNotNull(filmAdditional)
									&& Validator.isNotNull(filmAdditional.get(0).getCustomsBroker())
											? filmAdditional.get(0).getCustomsBroker()
											: "",

							Validator.isNotNull(filmAdditional) && filmAdditional.size() > 1
									&& Validator.isNotNull(filmAdditional.get(1).getArrivalDate())
											? dateFormat.format(filmAdditional.get(1).getArrivalDate())
											: "",
							filmAdditional.size() > 1 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(1).getAirlineShipper()
									: "",
							filmAdditional.size() > 1 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(1).getFlightVesselNum()
									: "",
							filmAdditional.size() > 1 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(1).getPassengerName()
									: "",
							filmAdditional.size() > 1 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(1).getEntryPort()
									: "",
							filmAdditional.size() > 1 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(1).getCustomsBroker()
									: "",
							Validator.isNotNull(filmAdditional) && filmAdditional.size() > 2
									&& Validator.isNotNull(filmAdditional.get(2).getArrivalDate())
											? dateFormat.format(filmAdditional.get(2).getArrivalDate())
											: "",
							filmAdditional.size() > 2 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(2).getAirlineShipper()
									: "",
							filmAdditional.size() > 2 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(2).getFlightVesselNum()
									: "",
							filmAdditional.size() > 2 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(2).getPassengerName()
									: "",
							filmAdditional.size() > 2 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(2).getEntryPort()
									: "",
							filmAdditional.size() > 2 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(2).getCustomsBroker()
									: "",
							Validator.isNotNull(filmAdditional) && filmAdditional.size() > 3
									&& Validator.isNotNull(filmAdditional.get(3).getArrivalDate())
											? dateFormat.format(filmAdditional.get(3).getArrivalDate())
											: "",
							filmAdditional.size() > 3 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(3).getAirlineShipper()
									: "",
							filmAdditional.size() > 3 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(3).getFlightVesselNum()
									: "",
							filmAdditional.size() > 3 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(3).getPassengerName()
									: "",
							filmAdditional.size() > 3 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(3).getEntryPort()
									: "",
							filmAdditional.size() > 3 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(3).getCustomsBroker()
									: "",
							Validator.isNotNull(filmAdditional) && filmAdditional.size() > 4
									&& Validator.isNotNull(filmAdditional.get(4).getArrivalDate())
											? dateFormat.format(filmAdditional.get(4).getArrivalDate())
											: "",
							filmAdditional.size() > 4 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(4).getAirlineShipper()
									: "",
							filmAdditional.size() > 4 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(4).getFlightVesselNum()
									: "",
							filmAdditional.size() > 4 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(4).getPassengerName()
									: "",
							filmAdditional.size() > 4 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(4).getEntryPort()
									: "",
							filmAdditional.size() > 4 && Validator.isNotNull(filmAdditional)
									? filmAdditional.get(4).getCustomsBroker()
									: "",

//		for the Equipment List
//							Validator.isNotNull(filmEquipmentList)
//									&& Validator.isNotNull(filmEquipmentList.get(0).getItem())
//											? filmEquipmentList.get(0).getItem()
//											: "",
//							Validator.isNotNull(filmEquipmentList)
//									&& Validator.isNotNull(filmEquipmentList.get(0).getSerialNumber())
//											? filmEquipmentList.get(0).getSerialNumber()
//											: "",
//							Validator.isNotNull(filmEquipmentList)
//									&& Validator.isNotNull(filmEquipmentList.get(0).getWeight())
//											? filmEquipmentList.get(0).getWeight()
//											: "",
//							Validator.isNotNull(filmEquipmentList)
//									&& Validator.isNotNull(filmEquipmentList.get(0).getQuantity())
//											? filmEquipmentList.get(0).getQuantity()
//											: "",
//							Validator.isNotNull(filmEquipmentList)
//									&& Validator.isNotNull(filmEquipmentList.get(0).getUnitPrice())
//											? filmEquipmentList.get(0).getUnitPrice()
//											: "",
//							Validator.isNotNull(filmEquipmentList)
//									&& Validator.isNotNull(filmEquipmentList.get(0).getDescription())
//											? filmEquipmentList.get(0).getDescription()
//											: "",
//							Validator.isNotNull(filmEquipmentList)
//									&& Validator.isNotNull(filmEquipmentList.get(0).getTotal())
//											? filmEquipmentList.get(0).getTotal()
//											: "",
//							filmEquipmentList.size() > 1 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(1).getItem()
//									: "",
//							filmEquipmentList.size() > 1 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(1).getSerialNumber()
//									: "",
//							filmEquipmentList.size() > 1 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(1).getWeight()
//									: "",
//							filmEquipmentList.size() > 1 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(1).getQuantity()
//									: "",
//							filmEquipmentList.size() > 1 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(1).getUnitPrice()
//									: "",
//							filmEquipmentList.size() > 1 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(1).getDescription()
//									: "",
//							filmEquipmentList.size() > 1 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(1).getTotal()
//									: "",
//							filmEquipmentList.size() > 2 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(2).getItem()
//									: "",
//							filmEquipmentList.size() > 2 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(2).getSerialNumber()
//									: "",
//							filmEquipmentList.size() > 2 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(2).getWeight()
//									: "",
//							filmEquipmentList.size() > 2 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(2).getQuantity()
//									: "",
//							filmEquipmentList.size() > 2 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(2).getUnitPrice()
//									: "",
//							filmEquipmentList.size() > 2 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(2).getDescription()
//									: "",
//							filmEquipmentList.size() > 2 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(2).getTotal()
//									: "",
//							filmEquipmentList.size() > 3 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(3).getItem()
//									: "",
//							filmEquipmentList.size() > 3 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(3).getSerialNumber()
//									: "",
//							filmEquipmentList.size() > 3 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(3).getWeight()
//									: "",
//							filmEquipmentList.size() > 3 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(3).getQuantity()
//									: "",
//							filmEquipmentList.size() > 3 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(3).getUnitPrice()
//									: "",
//							filmEquipmentList.size() > 3 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(3).getDescription()
//									: "",
//							filmEquipmentList.size() > 3 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(3).getTotal()
//									: "",
//							filmEquipmentList.size() > 4 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(4).getItem()
//									: "",
//							filmEquipmentList.size() > 4 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(4).getSerialNumber()
//									: "",
//							filmEquipmentList.size() > 4 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(4).getWeight()
//									: "",
//							filmEquipmentList.size() > 4 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(4).getQuantity()
//									: "",
//							filmEquipmentList.size() > 4 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(4).getUnitPrice()
//									: "",
//							filmEquipmentList.size() > 4 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(4).getDescription()
//									: "",
//							filmEquipmentList.size() > 4 && Validator.isNotNull(filmEquipmentList)
//									? filmEquipmentList.get(4).getTotal()
//									: "",
							Validator.isNotNull(filmApplicationPayment)
									&& Validator.isNotNull(filmApplicationPayment.getPaymentMethod())
											? filmApplicationPayment.getPaymentMethod()
											: "",
							Validator.isNotNull(filmApplication.getCreateDate())
									&& Validator.isNotNull(filmApplication.getCreateDate())
											? dateFormat.format(filmApplication.getCreateDate())
											: "" });
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Film Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(filmApplication.getFilmApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			String fileName = null;
			String title = null;
			String profileYourCom = null;
			String onePage = null;
			String copyOThe = null;
			String listOfLead = null;
			String detailedList = null;
			for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Profile of your company")) {
					profileYourCom = fileName;
				} else if (title.equals("One-page summary of the project")) {
					onePage = fileName;
				} else if (title.equals("Copy of the itinerary")) {
					copyOThe = fileName;
				} else if (title.equals("List of lead production personnel")) {
					listOfLead = fileName;
				} else if (title.equals("detailed list of all equipment")) {
					detailedList = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//		for the document 
					"[$ProfileOfCompany$]", "[$OnePageSummary$]", "[$Itinerary$]", "[$ProductionPersonnel$]",
					"[$DetailedList$]" }, new String[] { profileYourCom, onePage, copyOThe, listOfLead, detailedList });
		}
		return pdfTemplate;
	}

	@Override
	public String replaceManufacturingPdfVar(long manufacturingApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		String pdfTemplate = StringPool.BLANK;
		ManufacturingApplication manufacturingApplication = null;
		ManuCompanyInfo manuCompanyInfo = null;
		List<ManuCompanyInfoAddress> manuCompanyInfoAddresses = null;
		List<ProductiveInputsFormAdd> inputsFormAdds = null;
		ProductiveInputsForm productiveInputs = null;
		ProductionProcess productionProcess = null;
		PackagingProcess packagingProcess = null;
		ManuEquipment manuEquipment = null;
		List<ManuEquipmentAdd> equipmentAdds = null;
		ManuExportData exportData = null;
		ManuInternationalCertificate interCertificate = null;
		ManuAdditionalCompanyInfo additionalCompanyInfo = null;
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			manufacturingApplication = ManufacturingApplicationLocalServiceUtil
					.getManufacturingApplication(manufacturingApplicationId);
		}catch (Exception e) {
		}try {
			manuCompanyInfo = ManuCompanyInfoLocalServiceUtil.getMA_CI_MAI(manufacturingApplicationId);
		}catch (Exception e) {
		}try {
			manuCompanyInfoAddresses = ManuCompanyInfoAddressLocalServiceUtil.getMA_CIA(manufacturingApplicationId);
		}catch (Exception e) {
		}try {
			inputsFormAdds = ProductiveInputsFormAddLocalServiceUtil.getMA_PIF(manufacturingApplicationId);
		}catch (Exception e) {
		}try {
			productiveInputs = ProductiveInputsFormLocalServiceUtil.getManuByAppId(manufacturingApplicationId);
		}catch (Exception e) {
		}try {
			productionProcess = ProductionProcessLocalServiceUtil.getManuByAppId(manufacturingApplicationId);
		}catch (Exception e) {
		}try {
			packagingProcess = PackagingProcessLocalServiceUtil.getManuByAppId(manufacturingApplicationId);
		}catch (Exception e) {
		}try {
			manuEquipment = ManuEquipmentLocalServiceUtil.getManuById(manufacturingApplicationId);
		}catch (Exception e) {
		}try {
			equipmentAdds = ManuEquipmentAddLocalServiceUtil.getMA_EAF(manufacturingApplicationId);
		}catch (Exception e) {
		}try {
			exportData = ManuExportDataLocalServiceUtil.getManuByAppId(manufacturingApplicationId);
		}catch (Exception e) {
		}try {
			interCertificate = ManuInternationalCertificateLocalServiceUtil.getManuByAppId(manufacturingApplicationId);
		}catch (Exception e) {
		}try {
			additionalCompanyInfo = ManuAdditionalCompanyInfoLocalServiceUtil.getManuById(manufacturingApplicationId);
		} catch (Exception e) {
		}
		pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "manufacturing_status");
		if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "manufacturing_status-1");
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//				for the ManuCompanyInfo
					"[$PIRM_CompanyName$]", "[$PIRM_DirectorsNames$]", "[$PIRM_BusinessAddress$]", "[$PIRM_TCCNumber$]",
					"[$PIRM_DateofIncorporation$]", "[$Factory1$]", "[$Telephone1$]", "[$Email1$]", "[$Parish1$]",
					"[$Factory2$]", "[$Telephone2$]", "[$Email2$]", "[$Parish2$]", "[$Factory3$]", "[$Telephone3$]",
					"[$Email3$]", "[$Parish3$]", "[$Factory4$]", "[$Telephone4$]", "[$Email4$]", "[$Parish4$]",
					"[$Factory5$]", "[$Telephone5$]", "[$Email5$]", "[$Parish5$]", "[$PIRM_WebsiteAddress$]"
//			for the productiveInputs	
					, "[$PIRM_CategoriesofImportedGoodsforManufacturingProcess$]", "[$PIRM_ProductsManufactured$]",
					"[$PIRM_ProductsProposedforManufacturing$]", "[$Process1$]", "[$HSCode1$]", "[$Items1$]",
					"[$imported1$]", "[$Process2$]", "[$HSCode2$]", "[$Items2$]", "[$imported2$]", "[$Process3$]",
					"[$HSCode3$]", "[$Items3$]", "[$imported3$]", "[$Process4$]", "[$HSCode4$]", "[$Items4$]",
					"[$imported4$]", "[$Process5$]", "[$HSCode5$]", "[$Items5$]", "[$imported5$]",
					"[$PIRM_RawMaterialPurchasedLocally$]"

//				for the productionProcess
					, "[$PIRM_DescriptionofProductionProcess$]"

//			for the packagingProcess
					, "[$PIRM_PackagingMaterialsImportedforUseinTheFinalProcess$]",

//			for the manuEquipment	
					"[$PIRM_EquipmenttobeImported$]", "[$Land$]", "[$Equipment$]", "[$Building$]", "[$Other$]",

					"[$EquipmentName$]", "[$ValueInJamaicanDollars$]", "[$EquipmentName1$]",
					"[$ValueInJamaicanDollars1$]", "[$EquipmentName2$]", "[$ValueInJamaicanDollars2$]",
					"[$EquipmentName3$]", "[$ValueInJamaicanDollars3$]", "[$EquipmentName4$]",
					"[$ValueInJamaicanDollars4$]", "[$PurposeOfCapitalExpenditure$]",
//			        "[$NameOfPurpose$]",
					"[$ToBeMaintained$]", "[$ToBeCreated$]", "[$Skilled$]", "[$Clerical$]", "[$Other$]", "[$Total$]"

//		 for the exportData
					, "[$PIRM_IstheCompanyinvolvedinexport$]", "[$NameOfItems$]", "[$Quantity$]", "[$Monetary$]",
					"[$PIRM_Towhatcountrysdoyouexport$]",

//				for the interCertificate
					"[$PIRM_Isthecompanyinternationallycertified$]", "[$Other$]"

//				for the Additional Company information
					, "[$NameOfCompanyRepresentative$]", "[$SignatureOfCompanyRepresentative$]", "[$DateOfSignature$]",
					"[$NameOfCustomsBroker$]", "[$CustomBrokerBusinessAddress$]", "[$TelephoneNumber$]", "[$BrokerID$]",
					"[$Date$]" },

					new String[] {
//						for the ManuCompanyInfo
							Validator.isNotNull(manuCompanyInfo) ? manuCompanyInfo.getCompanyName() : "",
							Validator.isNotNull(manuCompanyInfo) ? manuCompanyInfo.getDirectorName() : "",
							Validator.isNotNull(manuCompanyInfo) ? manuCompanyInfo.getBusinessAddress() : "",
							Validator.isNotNull(manuCompanyInfo) ? manuCompanyInfo.getTccNumber() : "",
							manuCompanyInfo != null && manuCompanyInfo.getIncorporationDate() != null
									? new SimpleDateFormat("yyyy-MM-dd").format(manuCompanyInfo.getIncorporationDate())
									: StringPool.BLANK,
							manuCompanyInfoAddresses.size() > 0 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(0).getFactoryAddress()
									: "",
							manuCompanyInfoAddresses.size() > 0 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(0).getTelephoneNumber()
									: "",
							manuCompanyInfoAddresses.size() > 0 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(0).getEmailAddress()
									: "",
							manuCompanyInfoAddresses.size() > 0 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(0).getParish()
									: "",
							manuCompanyInfoAddresses.size() > 1 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(1).getFactoryAddress()
									: "",
							manuCompanyInfoAddresses.size() > 1 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(1).getTelephoneNumber()
									: "",
							manuCompanyInfoAddresses.size() > 1 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(1).getEmailAddress()
									: "",
							manuCompanyInfoAddresses.size() > 1 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(1).getParish()
									: "",
							manuCompanyInfoAddresses.size() > 2 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(2).getFactoryAddress()
									: "",
							manuCompanyInfoAddresses.size() > 2 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(2).getTelephoneNumber()
									: "",
							manuCompanyInfoAddresses.size() > 2 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(2).getEmailAddress()
									: "",
							manuCompanyInfoAddresses.size() > 2 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(2).getParish()
									: "",
							manuCompanyInfoAddresses.size() > 3 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(3).getFactoryAddress()
									: "",
							manuCompanyInfoAddresses.size() > 3 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(3).getTelephoneNumber()
									: "",
							manuCompanyInfoAddresses.size() > 3 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(3).getEmailAddress()
									: "",
							manuCompanyInfoAddresses.size() > 3 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(3).getParish()
									: "",
							manuCompanyInfoAddresses.size() > 4 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(4).getFactoryAddress()
									: "",
							manuCompanyInfoAddresses.size() > 4 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(4).getTelephoneNumber()
									: "",
							manuCompanyInfoAddresses.size() > 4 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(4).getEmailAddress()
									: "",
							manuCompanyInfoAddresses.size() > 4 && Validator.isNotNull(manuCompanyInfoAddresses)
									? manuCompanyInfoAddresses.get(4).getParish()
									: "",
							Validator.isNotNull(manuCompanyInfo) ? manuCompanyInfo.getCompanyWebsite() : "",

//						for the productiveInputs

							Validator.isNotNull(productiveInputs) ? productiveInputs.getCategoryOfGoods() : "",
							Validator.isNotNull(productiveInputs) ? productiveInputs.getManufactureProducts() : "",
							Validator.isNotNull(productiveInputs) ? productiveInputs.getProposedProducts() : "",
							inputsFormAdds.size() > 0 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(0).getProcessType()
									: "",
							inputsFormAdds.size() > 0 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(0).getTariffCode()
									: "",
							inputsFormAdds.size() > 0 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(0).getManufactureItem()
									: "",
							inputsFormAdds.size() > 0 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(0).getImportedCaricom()
									: "",
							inputsFormAdds.size() > 1 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(1).getProcessType()
									: "",
							inputsFormAdds.size() > 1 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(1).getTariffCode()
									: "",
							inputsFormAdds.size() > 1 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(1).getManufactureItem()
									: "",
							inputsFormAdds.size() > 1 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(1).getImportedCaricom()
									: "",
							inputsFormAdds.size() > 2 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(2).getProcessType()
									: "",
							inputsFormAdds.size() > 2 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(2).getTariffCode()
									: "",
							inputsFormAdds.size() > 2 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(2).getManufactureItem()
									: "",
							inputsFormAdds.size() > 2 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(2).getImportedCaricom()
									: "",
							inputsFormAdds.size() > 3 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(3).getProcessType()
									: "",
							inputsFormAdds.size() > 3 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(3).getTariffCode()
									: "",
							inputsFormAdds.size() > 3 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(3).getManufactureItem()
									: "",
							inputsFormAdds.size() > 3 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(3).getImportedCaricom()
									: "",
							inputsFormAdds.size() > 4 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(4).getProcessType()
									: "",
							inputsFormAdds.size() > 4 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(4).getTariffCode()
									: "",
							inputsFormAdds.size() > 4 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(4).getManufactureItem()
									: "",
							inputsFormAdds.size() > 4 && Validator.isNotNull(inputsFormAdds)
									? inputsFormAdds.get(4).getImportedCaricom()
									: "",
							Validator.isNotNull(productiveInputs) ? productiveInputs.getRawMaterialPurchased() : "",

//						for the productionProcess
							Validator.isNotNull(productionProcess) ? productionProcess.getProductionProcess() : "",

//						for the packagingProcess
							Validator.isNotNull(packagingProcess) ? packagingProcess.getPackagingProcess() : "",

//						for the manuEquipment
							Validator.isNotNull(manuEquipment) ? manuEquipment.getEquipmentImported() : "",
							Validator.isNotNull(manuEquipment) ? manuEquipment.getLand() : "",
							Validator.isNotNull(manuEquipment) ? manuEquipment.getEquipment() : "",
							Validator.isNotNull(manuEquipment) ? manuEquipment.getBuilding() : "",
							Validator.isNotNull(manuEquipment) ? manuEquipment.getOther() : "",
							equipmentAdds.size() > 0 && Validator.isNotNull(equipmentAdds)
									? equipmentAdds.get(0).getEquipmentName()
									: "",
							equipmentAdds.size() > 0 && Validator.isNotNull(equipmentAdds)
									? equipmentAdds.get(0).getJamaicanDollor()
									: "",
							equipmentAdds.size() > 1 && Validator.isNotNull(equipmentAdds)
									? equipmentAdds.get(1).getEquipmentName()
									: "",
							equipmentAdds.size() > 1 && Validator.isNotNull(equipmentAdds)
									? equipmentAdds.get(1).getJamaicanDollor()
									: "",
							equipmentAdds.size() > 2 && Validator.isNotNull(equipmentAdds)
									? equipmentAdds.get(2).getEquipmentName()
									: "",
							equipmentAdds.size() > 2 && Validator.isNotNull(equipmentAdds)
									? equipmentAdds.get(2).getJamaicanDollor()
									: "",
							equipmentAdds.size() > 3 && Validator.isNotNull(equipmentAdds)
									? equipmentAdds.get(3).getEquipmentName()
									: "",
							equipmentAdds.size() > 3 && Validator.isNotNull(equipmentAdds)
									? equipmentAdds.get(3).getJamaicanDollor()
									: "",
							equipmentAdds.size() > 4 && Validator.isNotNull(equipmentAdds)
									? equipmentAdds.get(4).getEquipmentName()
									: "",
							equipmentAdds.size() > 4 && Validator.isNotNull(equipmentAdds)
									? equipmentAdds.get(4).getJamaicanDollor()
									: "",
//								manuEquipment.getNameOFPurpose(),
							Validator.isNotNull(manuEquipment) ? manuEquipment.getCapitalExpenditure() : "",
							Validator.isNotNull(manuEquipment) ? manuEquipment.getEquipmentMaintained() : "",
							Validator.isNotNull(manuEquipment) ? manuEquipment.getEquipmentCreated() : "",
							Validator.isNotNull(manuEquipment) ? manuEquipment.getSkilledEmp() : "",
							Validator.isNotNull(manuEquipment) ? manuEquipment.getClericalEmp() : "",
							Validator.isNotNull(manuEquipment) ? manuEquipment.getOtherEmp() : "",
							Validator.isNotNull(manuEquipment) ? manuEquipment.getTotalEmp() : "",

//						for the exportData
							Validator.isNotNull(exportData) ? exportData.getCompanyInvolved() : "",
							Validator.isNotNull(exportData) ? exportData.getItemsName() : "",
							Validator.isNotNull(exportData) ? exportData.getQuantity() : "",
							Validator.isNotNull(exportData) ? exportData.getMonetary() : "",
							Validator.isNotNull(exportData) ? exportData.getCountryName() : "",

//						for the interCertificate
							Validator.isNotNull(interCertificate) ? interCertificate.getCompanyCertified() : "",
							Validator.isNotNull(interCertificate) ? interCertificate.getOther() : "",

//					for the Additional Company information
							Validator.isNotNull(additionalCompanyInfo)
									? additionalCompanyInfo.getCompanyNameRepresentative()
									: "",
							Validator.isNotNull(additionalCompanyInfo)
									? additionalCompanyInfo.getCompanySignatureRepresentative()
									: "",
							additionalCompanyInfo != null && additionalCompanyInfo.getSignatureDate() != null
									? new SimpleDateFormat("yyyy-MM-dd")
											.format(additionalCompanyInfo.getSignatureDate())
									: StringPool.BLANK,
							Validator.isNotNull(additionalCompanyInfo) ? additionalCompanyInfo.getCustomBrokerName()
									: "",
							Validator.isNotNull(additionalCompanyInfo) ? additionalCompanyInfo.getCustomBrokerAddress()
									: "",
							Validator.isNotNull(additionalCompanyInfo) ? additionalCompanyInfo.getTelephoneNumber()
									: "",
							Validator.isNotNull(additionalCompanyInfo) ? additionalCompanyInfo.getBrokerId() : "",
							Validator.isNotNull(manufacturingApplication.getCreateDate())
									? dateFormat.format(manufacturingApplication.getCreateDate())
									: ""

					});
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Manufacturing Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(manufacturingApplication.getManufacturingApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		try {
			String previewUrl = replaceSignature(manufacturingApplication.getManufacturingApplicationId(),
					"Manufacturing Supported Documents", themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId(), themeDisplay);
			{
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$Signature$]" },
						new String[] { previewUrl });
				System.out.println("previewUrl in Manufacturing************" + previewUrl);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			String fileName = null;
			String title = null;
			String applicationForm = null;
			String TccTaj = null;
			String manufacturingProcess = null;
			String certificateOfIncorporation = null;
			String specialPermits = null;

			for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Application Form")) {
					applicationForm = fileName;
				} else if (title.equals("TCC + TAJ Web Page Print Out")) {
					TccTaj = fileName;
				} else if (title.equals("Manufacturing Process")) {
					manufacturingProcess = fileName;
				} else if (title.equals("Certificate of Incorporation/Registration of Business Certificate")) {
					certificateOfIncorporation = fileName;
				} else if (title.equals("Special Permits (e.g. Cannabis Licenses)")) {
					specialPermits = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//		for the document 
					"[$Application Form$]", "[$WebPagePrintOutforOwner$]", "[$ManufacturingProcess$]",
					"[$CertificateofIncorporation$]", "[$SpecialPermits$]" },
					new String[] { applicationForm, TccTaj, manufacturingProcess, certificateOfIncorporation,
							specialPermits });
		}
		return pdfTemplate;
	}

	@Override
	public String replaceCreativePdfVar(long creativeApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		String pdfTemplate = StringPool.BLANK;
		CreativeApplication creativeApplication = CreativeApplicationLocalServiceUtil
				.getCreativeApplication(creativeApplicationId);
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Creative Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(creativeApplication.getCreativeApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		if (creativeApplication.getEntertainerType().equals("Bona fide Individual Practitioner/Producer")) {
			CreativeIndividualDetails individualDetail = null;
			CreativeIndividualEconomicEffect economicEffect = null;
			CreativeIndividualDetailsAddress creativeIndividualDetailsAddress = null;
			CreativeIndividualGeneralInformation creativeIndividualGeneralInformation = null;
			try {
				individualDetail = CreativeIndividualDetailsLocalServiceUtil.getCreativeById(creativeApplicationId);
			}catch (Exception e) {
			}try {
				creativeIndividualDetailsAddress = CreativeIndividualDetailsAddressLocalServiceUtil
						.getCreativeCompanyAddressById(creativeApplicationId);
			}catch (Exception e) {
			}try {
				economicEffect = CreativeIndividualEconomicEffectLocalServiceUtil
						.getCreativeById(creativeApplicationId);
			}catch (Exception e) {
			}try {
				creativeIndividualGeneralInformation = CreativeIndividualGeneralInformationLocalServiceUtil
						.getCreativeById(creativeApplicationId);
			} catch (Exception e) {
			}
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "creative-individual-");
			if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "creative-individual-1");
			}
			try {
				pdfTemplate = StringUtil.replace(pdfTemplate,
						new String[] { "[$PIRC_SectorsofPractice$]", "[$PIRC_ApplicantFirstName$]",
								"[$PIRC_ApplicantMiddleName$]", "[$PIRC_ApplicantLastName$]", "[$PIRC_ApplicantTRN$]",
								"[$PIRC_ApplicantAddress$]", "[$StreetAddressLine$]", "[$PIRC_ApplicantCity$]",
								"[$PIRC_ApplicantCountry$]", "[$PIRC_ApplicantSex$]", "[$Cell$]",
								"[$PIRC_ApplicantEmailAddress$]", "[$AreYouAStudent$]", "[$CompanyEmail$]",
								"[$PIRC_WebsiteofEducationalInstitution$]",

//for the general information
								"[$Profile$]",

//for the economic effect 
								"[$SHJMD$]", "[$SHExchangeRate$]", "[$SHUSD$]", "[$LOJMD$]", "[$LOExchangeRate$]",
								"[$LOUSD$]", "[$OTJMD$]", "[$OTExchangeRate$]", "[$OTUSD$]",
								"[$PIRC_EstimatedLocalExpenditureonEquipmentandRawMaterialsJMD$]",
								"[$PIRC_OtherEstimatedLocalExpenditureJMD$]", "[$Year1$]", "[$USD1$]", "[$Year2$]",
								"[$USD2$]", "[$Year3$]", "[$USD3$]", "[$PIRC_TargetMarketLocal$]",
								"[$PIRC_TargetMarketForeign$]", "[$PIRC_TargetCountries$]",
								"[$DECLARETHATTHEINFORMATION$]", "[$Date$]" },

						new String[] {
								Validator.isNotNull(individualDetail) ? individualDetail.getSectorOfPractice() : "",
								Validator.isNotNull(individualDetail) ? individualDetail.getFirstName() : "",
								Validator.isNotNull(individualDetail) ? individualDetail.getMiddleName() : "",
								Validator.isNotNull(individualDetail) ? individualDetail.getLastName() : "",
								Validator.isNotNull(individualDetail) ? individualDetail.getTrn() : "",
								Validator.isNotNull(creativeIndividualDetailsAddress)
										? creativeIndividualDetailsAddress.getStreetAddress()
										: "",
								Validator.isNotNull(creativeIndividualDetailsAddress)
										? creativeIndividualDetailsAddress.getStreetAddressLineTwo()
										: "",
								Validator.isNotNull(individualDetail) ? individualDetail.getCity() : "",
								Validator.isNotNull(individualDetail) ? individualDetail.getCountry() : "",
								Validator.isNotNull(individualDetail) ? individualDetail.getSex() : "",
								Validator.isNotNull(individualDetail) ? individualDetail.getCell() : "",
								Validator.isNotNull(individualDetail) ? individualDetail.getEmail() : "",
								Validator.isNotNull(individualDetail) ? individualDetail.getAreYouStudent() : "",
								Validator.isNotNull(individualDetail) ? individualDetail.getCompanyEmail() : "",
								Validator.isNotNull(individualDetail) ? individualDetail.getCompanyWebsite() : "",

//for the general information
								Validator.isNotNull(creativeIndividualGeneralInformation)
										? creativeIndividualGeneralInformation.getProfile()
										: "",
//	for the economic effect 
								economicEffect.getShareCapitalJmd(), economicEffect.getShareCapitalExchangeRate(),
								economicEffect.getShareCapitalUsd(), economicEffect.getLocalCapitalJmd(),
								economicEffect.getLocalCapitalExchangeRate(), economicEffect.getLocalCapitalUsd(),
								economicEffect.getOtherJmd(), economicEffect.getOtherExchangeRate(),
								economicEffect.getOtherUsd(), economicEffect.getEstimatedLocalExpenditure(),
								economicEffect.getOtherEstimatedLocal(), economicEffect.getAnnualYearOne(),
								economicEffect.getAnnualOneUsd(), economicEffect.getAnnualYearTwo(),
								economicEffect.getAnnualTwoUsd(), economicEffect.getAnnualYearThree(),
								economicEffect.getAnnualThreeUsd(), economicEffect.getTargetMarketLocal(),
								economicEffect.getTargetMarketForeign(), economicEffect.getTargetMarketCountries(),
								economicEffect.getDeclareInformationProvide(),
								Validator.isNotNull(creativeApplication.getCreateDate())
										? dateFormat.format(creativeApplication.getCreateDate())
										: "" });
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("fasle")) {
				String fileName = null;
				String title = null;
				String imageOfGov = null;
				String imageOfTrn = null;
				String individualProfessional = null;
				for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
					fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
					fileName = fileEntry.getFileName();
					title = fileEntry.getTitle();
					if (title.equals("Image of Government-issued ID")) {
						imageOfGov = fileName;
					} else if (title.equals("Image of TRN card (not required if GOJ issued ID is Driver license)")) {
						imageOfTrn = fileName;
					} else if (title.equals("Individual profession bio/ profile")) {
						individualProfessional = fileName;
					}
				}
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//				for the document 
						"[$ImageOfGovernment-issuedID$]", "[$ImageOfTRNCard$]", "[$IndividualProfessionBio$]" },
						new String[] { imageOfGov, imageOfTrn, individualProfessional });
			}
		} else if (creativeApplication.getEntertainerType().equals("Bona fide Company Practitioner/Producer")) {
			CreativeCompanyDetailsAddress companyDetailsRegisteredAddress = null;
			CreativeCompanyDetailsAddress companyOperatorAddress = null;
			CreativeCompanyDetails companyDetails = null;
			List<CreativeDirectorListinAddBox> directorListinAddBoxs = null;
			List<CreativeContactInfoAddBox> contactInfoaddBoxs = null;
			List<CreativeSocialMediaAddBox> socialMediaAddBoxs = null;
			CreativeCompanyDirectorInformation companyDirectorInformation = null;
			CreativeCompanyDirectorInformationAddress companyDirectorInformationAddress = null;
			CreativeCompanyApplicantInformation companyApplicantInfo = null;
			CreativeCompanyGeneralInformation companyGeneralInformation = null;
			CreativeCompanyEconomicEffect companyEconomicEffect = null;
			try {
				companyDetailsRegisteredAddress = CreativeCompanyDetailsAddressLocalServiceUtil
						.getCreative_Com_Detail_AT(CommonsUtilWorkFlowConstants.REGISTERED_ADDRESS,
								creativeApplicationId);
			} catch (Exception e) {
			}
			try {
				companyOperatorAddress = CreativeCompanyDetailsAddressLocalServiceUtil.getCreative_Com_Detail_AT(
						CommonsUtilWorkFlowConstants.OPERATOR_ADDRESS, creativeApplicationId);
			}catch (Exception e) {
			}
			try {
				companyDetails = CreativeCompanyDetailsLocalServiceUtil.getCreativeById(creativeApplicationId);
				directorListinAddBoxs = CreativeDirectorListinAddBoxLocalServiceUtil
						.getCA_CDB_CAI(creativeApplicationId);
			}catch (Exception e) {
			}
			try {
				contactInfoaddBoxs = CreativeContactInfoAddBoxLocalServiceUtil.getCA_CCB_CAI(creativeApplicationId);
			}catch (Exception e) {
			}
			try {
				socialMediaAddBoxs = CreativeSocialMediaAddBoxLocalServiceUtil.getCA_SMB_CAI(creativeApplicationId);
			}catch (Exception e) {
			}
			try {
				companyDirectorInformation = CreativeCompanyDirectorInformationLocalServiceUtil
						.getCreativeById(creativeApplicationId);
			}catch (Exception e) {
			}
			try {
				companyDirectorInformationAddress = CreativeCompanyDirectorInformationAddressLocalServiceUtil
						.getCreativeBYId(creativeApplicationId);
			}catch (Exception e) {
			}try {
				companyApplicantInfo = CreativeCompanyApplicantInformationLocalServiceUtil
						.getCreativeById(creativeApplicationId);
			}catch (Exception e) {
			}try {
				companyGeneralInformation = CreativeCompanyGeneralInformationLocalServiceUtil
						.getCreativeById(creativeApplicationId);
			}catch (Exception e) {
			}try {
				companyEconomicEffect = CreativeCompanyEconomicEffectLocalServiceUtil
						.getCreativeById(creativeApplicationId);
		}catch (Exception e) {
		}
			if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "creative-company-1");
			}
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "creative-company-2");
			try {
				pdfTemplate = StringUtil.replace(pdfTemplate,
						new String[] { "[$PIRC_CompanyBusinessName$]", "[$PIRC_CompanyBusinessRegistration$]",
								"[$PIRC_DateofRegistration$]", "[$PIRC_CompanyTRN$]", "[$PIRC_CompanyTCC$]",
								"[$RegisStreetAddress$]", "[$StreetAddressTwo$]", "[$PIRC_ApplicantCity$]",
								"[$PIRC_ApplicantCountry$]", "[$opreratingStreetAddress$]",
								"[$OperatingStreetAddressLine2$]", "[$PIRC_Operatingcity$]",
								"[$PIRC_OperatingCountry$]", "[$Company_profile$]",

//for the director information 
								"[$FullName1$]", "[$Title1$]", "[$TRN1$]", "[$FullName2$]", "[$Title2$]", "[$TRN2$]",
								"[$FullName3$]", "[$Title3$]", "[$TRN3$]", "[$FullName4$]", "[$Title4$]", "[$TRN4$]",
								"[$FullName5$]", "[$Title5$]", "[$TRN5$]",

								"[$TelephoneN1$]", "[$Fax1$]", "[$EmailA1$]", "[$TelephoneN2$]", "[$Fax2$]",
								"[$EmailA2$]", "[$TelephoneN3$]", "[$Fax3$]", "[$EmailA3$]", "[$TelephoneN4$]",
								"[$Fax4$]", "[$EmailA4$]", "[$TelephoneN5$]", "[$Fax5$]", "[$EmailA5$]",

								"[$SocialM1$]", "[$ProfileN1$]", "[$SocialM2$]", "[$ProfileN2$]", "[$SocialM3$]",
								"[$ProfileN3$]", "[$SocialM4$]", "[$ProfileN4$]", "[$SocialM5$]", "[$ProfileN5$]",
								"[$PIRC_IsOperatordifferentfromOwner$]", "[$FirstNameOfOperator$]",
								"[$MiddleNameOfOperator$]", "[$LastNameOfOperator$]", "[$StreetAddress$]",
								"[$StreetAddressLine2$]", "[$City$]", "[$Country$]", "[$PIRC_OperatorSex$]",
								"[$PIRC_OperatorTRN$]", "[$ADDCell$]", "[$PIRC_OperatorEmailAddress$]",

// for the CreativeCompanyApplicantInformation

								"[$Prefix$]", "[$PIRC_ApplicantFirstName$]", "[$PIRC_ApplicantLastName$]",
								"[$PIRC_ApplicantSex$]", "[$PIRC_ApplicantTRN$]", "[$PIRC_ApplicantCountry$]",
								"[$PIRC_ApplicantNationality$]", "[$Cell$]", "[$PIRC_ApplicantEmailAddress$]",

//for the companyGeneralInformation
								"[$HaveYouRecievedAnyOfTheFollowingIncentives$]", "[$MPRSStartDate2$]",
								"[$MPRSEndDate$]", "[$MTTStartDate$]", "[$MTTEndDate$]",

//for the companyEconomicEffect
								"[$CountryOfOrigin$]", "[$JointVenture$]", "[$Local$]", "[$Foreign$]", "[$SHJMD$]",
								"[$SHExchangeRate$]", "[$SHUSD$]", "[$LOJMD$]", "[$LOExchangeRate$]", "[$LOUSD$]",
								"[$OTJMD$]", "[$OTExchangeRate$]", "[$OTUSD$]", "[$PerLocalMale$]",
								"[$PerLocalFemale$]", "[$PerForeignMale$]", "[$PerForeignFemale$]", "[$TemLocalMale$]",
								"[$TemLocalFemale$]", "[$TemForeignMale$]", "[$TemForeignFemale$]", "[$TOLocalMale$]",
								"[$TOLocalFemale$]", "[$TOForeignMale$]", "[$TOForeignFemale$]", "[$Date$]" },

						new String[] { companyDetails.getCompanyName(),
								companyDetails.getCompanyBusinessRegistrationNo(),
								companyDetails != null && companyDetails.getDateOfCompanyRegistration() != null
										? new SimpleDateFormat("yyyy-MM-dd")
												.format(companyDetails.getDateOfCompanyRegistration())
										: StringPool.BLANK,
								companyDetails.getCompanyTrn(), companyDetails.getCompanyTcc(),

//						for the companyDetailsAddress
								companyDetailsRegisteredAddress.getStreetAddress(),
								companyDetailsRegisteredAddress.getStreetAddressLineTwo(),
								companyDetailsRegisteredAddress.getCity(), companyDetailsRegisteredAddress.getCountry(),
								companyOperatorAddress.getStreetAddress(),
								companyOperatorAddress.getStreetAddressLineTwo(), companyOperatorAddress.getCity(),
								companyOperatorAddress.getCountry(), companyDetails.getCompanyProfile(),

//									for the companyDirectorInformation
								Validator.isNotNull(directorListinAddBoxs) ? directorListinAddBoxs.get(0).getFullName()
										: "",
								Validator.isNotNull(directorListinAddBoxs) ? directorListinAddBoxs.get(0).getTitle()
										: "",
								Validator.isNotNull(directorListinAddBoxs) ? directorListinAddBoxs.get(0).getTrn() : "",
								directorListinAddBoxs.size() > 1 && Validator.isNotNull(directorListinAddBoxs)
										? directorListinAddBoxs.get(1).getFullName()
										: "",
								directorListinAddBoxs.size() > 1 && Validator.isNotNull(directorListinAddBoxs)
										? directorListinAddBoxs.get(1).getTitle()
										: "",
								directorListinAddBoxs.size() > 1 && Validator.isNotNull(directorListinAddBoxs)
										? directorListinAddBoxs.get(1).getTrn()
										: "",
								directorListinAddBoxs.size() > 2 && Validator.isNotNull(directorListinAddBoxs)
										? directorListinAddBoxs.get(2).getFullName()
										: "",
								directorListinAddBoxs.size() > 2 && Validator.isNotNull(directorListinAddBoxs)
										? directorListinAddBoxs.get(2).getTitle()
										: "",
								directorListinAddBoxs.size() > 2 && Validator.isNotNull(directorListinAddBoxs)
										? directorListinAddBoxs.get(2).getTrn()
										: "",
								directorListinAddBoxs.size() > 3 && Validator.isNotNull(directorListinAddBoxs)
										? directorListinAddBoxs.get(3).getFullName()
										: "",
								directorListinAddBoxs.size() > 3 && Validator.isNotNull(directorListinAddBoxs)
										? directorListinAddBoxs.get(3).getTitle()
										: "",
								directorListinAddBoxs.size() > 3 && Validator.isNotNull(directorListinAddBoxs)
										? directorListinAddBoxs.get(3).getTrn()
										: "",
								directorListinAddBoxs.size() > 4 && Validator.isNotNull(directorListinAddBoxs)
										? directorListinAddBoxs.get(4).getFullName()
										: "",
								directorListinAddBoxs.size() > 4 && Validator.isNotNull(directorListinAddBoxs)
										? directorListinAddBoxs.get(4).getTitle()
										: "",
								directorListinAddBoxs.size() > 4 && Validator.isNotNull(directorListinAddBoxs)
										? directorListinAddBoxs.get(4).getTrn()
										: "",

								Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(0).getContactTelephone()
										: "",
								Validator.isNotNull(contactInfoaddBoxs) ? contactInfoaddBoxs.get(0).getContactFax()
										: "",
								Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(0).getContactEmailAddress()
										: "",
								contactInfoaddBoxs.size() > 1 && Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(1).getContactTelephone()
										: "",
								contactInfoaddBoxs.size() > 1 && Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(1).getContactFax()
										: "",
								contactInfoaddBoxs.size() > 1 && Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(1).getContactEmailAddress()
										: "",
								contactInfoaddBoxs.size() > 2 && Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(2).getContactTelephone()
										: "",
								contactInfoaddBoxs.size() > 2 && Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(2).getContactFax()
										: "",
								contactInfoaddBoxs.size() > 2 && Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(2).getContactEmailAddress()
										: "",
								contactInfoaddBoxs.size() > 3 && Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(3).getContactTelephone()
										: "",
								contactInfoaddBoxs.size() > 3 && Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(3).getContactFax()
										: "",
								contactInfoaddBoxs.size() > 3 && Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(3).getContactEmailAddress()
										: "",
								contactInfoaddBoxs.size() > 4 && Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(4).getContactTelephone()
										: "",
								contactInfoaddBoxs.size() > 4 && Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(4).getContactFax()
										: "",
								contactInfoaddBoxs.size() > 4 && Validator.isNotNull(contactInfoaddBoxs)
										? contactInfoaddBoxs.get(4).getContactEmailAddress()
										: "",

								Validator.isNotNull(socialMediaAddBoxs) ? socialMediaAddBoxs.get(0).getSocialMedia()
										: "",
								Validator.isNotNull(socialMediaAddBoxs) ? socialMediaAddBoxs.get(0).getProfileName()
										: "",
								socialMediaAddBoxs.size() > 1 && Validator.isNotNull(socialMediaAddBoxs)
										? socialMediaAddBoxs.get(1).getSocialMedia()
										: "",
								socialMediaAddBoxs.size() > 1 && Validator.isNotNull(socialMediaAddBoxs)
										? socialMediaAddBoxs.get(1).getProfileName()
										: "",
								socialMediaAddBoxs.size() > 2 && Validator.isNotNull(socialMediaAddBoxs)
										? socialMediaAddBoxs.get(2).getSocialMedia()
										: "",
								socialMediaAddBoxs.size() > 2 && Validator.isNotNull(socialMediaAddBoxs)
										? socialMediaAddBoxs.get(2).getProfileName()
										: "",
								socialMediaAddBoxs.size() > 3 && Validator.isNotNull(socialMediaAddBoxs)
										? socialMediaAddBoxs.get(3).getSocialMedia()
										: "",
								socialMediaAddBoxs.size() > 3 && Validator.isNotNull(socialMediaAddBoxs)
										? socialMediaAddBoxs.get(3).getProfileName()
										: "",
								socialMediaAddBoxs.size() > 4 && Validator.isNotNull(socialMediaAddBoxs)
										? socialMediaAddBoxs.get(4).getSocialMedia()
										: "",
								socialMediaAddBoxs.size() > 4 && Validator.isNotNull(socialMediaAddBoxs)
										? socialMediaAddBoxs.get(4).getProfileName()
										: "",
								companyDirectorInformation.getIsOperatorDifferentFromOwner(),
								companyDirectorInformation.getOperatorFirstName(),
								companyDirectorInformation.getOperatorMiddleName(),
								companyDirectorInformation.getOperatorLastName(),
								companyDirectorInformationAddress.getStreetAddress(),
								companyDirectorInformationAddress.getStreetAddressLineTwo(),
								companyDirectorInformation.getCity(), companyDirectorInformation.getCountry(),
								companyDirectorInformation.getSex(), companyDirectorInformation.getTrn(),
								companyDirectorInformation.getCell(), companyDirectorInformation.getEmail(),

//									for the CreativeCompanyApplicantInformation
								companyApplicantInfo.getPrefix(), companyApplicantInfo.getFirstName(),
								companyApplicantInfo.getLastName(), companyApplicantInfo.getSex(),
								companyApplicantInfo.getTrn(), companyApplicantInfo.getCountryOfResidence(),
								companyApplicantInfo.getNationality(), companyApplicantInfo.getCell(),
								companyApplicantInfo.getEmail(),

//									for the companyGeneralInformation'
								companyGeneralInformation.getHaveYouRecievedAny(),
								Validator.isNotNull(companyGeneralInformation.getMprsStartDate())
										? dateFormat.format(companyGeneralInformation.getMprsStartDate())
										: "",
								Validator.isNotNull(companyGeneralInformation.getMprsEndDate())
										? dateFormat.format(companyGeneralInformation.getMprsEndDate())
										: "",
								Validator.isNotNull(companyGeneralInformation.getMttStartDate())
										? dateFormat.format(companyGeneralInformation.getMttStartDate())
										: "",
								Validator.isNotNull(companyGeneralInformation.getMttEndDate())
										? dateFormat.format(companyGeneralInformation.getMttEndDate())
										: "",

//									for the companyEconomicEffect
								companyEconomicEffect.getAssessmentcountryOfOrigin(),
								companyEconomicEffect.getSsessmentjointVenture(),
								companyEconomicEffect.getAssessmentLocal(),
								companyEconomicEffect.getAssessmentForeign(), companyEconomicEffect.getShareJmd(),
								companyEconomicEffect.getShareExchangeRate(), companyEconomicEffect.getShareUsd(),
								companyEconomicEffect.getLocalJmd(), companyEconomicEffect.getLocalExchangeRate(),
								companyEconomicEffect.getLocalUsd(), companyEconomicEffect.getOtherJmd(),
								companyEconomicEffect.getOtherExchangeRate(), companyEconomicEffect.getOtherUsd(),
								companyEconomicEffect.getPermanentLocalMale(),
								companyEconomicEffect.getPermanentLocalFemale(),
								companyEconomicEffect.getPermanentForeignMale(),
								companyEconomicEffect.getPermanentForeignFemale(),
								companyEconomicEffect.getTemporaryLocalMale(),
								companyEconomicEffect.getTemporaryLocalFemale(),
								companyEconomicEffect.getTemporaryForeignMale(),
								companyEconomicEffect.getTemporaryForgeignFemale(),
								companyEconomicEffect.getTotalLocalMale(), companyEconomicEffect.getTotalLocalFemale(),
								companyEconomicEffect.getTotalForeignMale(),
								companyEconomicEffect.getTotalForeignFemale(),
								Validator.isNotNull(creativeApplication.getCreateDate())
										? dateFormat.format(creativeApplication.getCreateDate())
										: "" });
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
				String fileName = null;
				String title = null;
				String compantTcc = null;
				String companyRegistration = null;
				String companyBusinessPlan = null;
				String compantMostRecent = null;
				for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
					fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
					fileName = fileEntry.getFileName();
					title = fileEntry.getTitle();
					if (title.equals("Company TCC and TRN assignment document from Tax Administration Jamaica")) {
						compantTcc = fileName;
					} else if (title.equals("Company Registration Certificate")) {
						companyRegistration = fileName;
					} else if (title.equals("Company Business Plan")) {
						companyBusinessPlan = fileName;
					} else if (title.equals("Company most recent financial statement")) {
						compantMostRecent = fileName;
					}
				}
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//			for the document 
						"[$CompanyTCCAndTRNAssignment$]", "[$CompanyRegistrationCertificate$]",
						"[$CompanyBusinessPlan$]", "[$CompanyMostRecentFinancialStatement$]" },
						new String[] { compantTcc, companyRegistration, companyBusinessPlan, compantMostRecent });
			}
		}
		return pdfTemplate;
	}

	private String replaceSignatureforCannabis(long cannabisApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Authorization Background Checks Signature");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceSignatureforSupplimentInfo(long cannabisApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Supplimental Information Signature");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceSignature(long applicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl**************" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceStampforTourism(long tourismApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Place Company Stamp or Seal In New Acco");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceSignatureforTourism(long tourismApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Applicant In New Acco");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceSignatureforTourismInGround(long tourismApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Applicant In New Ground");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceStampforTourismInNewAttract(long tourismApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Place Company Stamp or Seal In New Attract");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceSignatureforTourismInNewAttract(long tourismApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Applicant In New Attract");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceStampforTourismInBonaAcco(long tourismApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Place Company Stamp or Seal In Bona Acco");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceSignatureforTourismInBonaAcco(long tourismApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Applicant In Bona Acco");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceSignatureforTourismInBonaAttract(long tourismApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Applicant In Bona Attract");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceStampforTourismInBonaAttract(long tourismApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Place Company Stamp or Seal In Bona Attract");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceSignatureforTourismInBonaGround(long tourismApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Applicant In Bona Ground");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceSignatureforTourismInBonaGroundCarRental(long tourismApplicationId, String folderName,
			long groupId, long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Applicant In Bona Ground");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceStampforTourismInBonaGroundCarRental(long tourismApplicationId, String folderName,
			long groupId, long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Applicant In Bona Ground");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceStampforTourismInBonaWaterSports(long tourismApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Place Company Stamp or Seal In Bona Water");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
			System.out.println("previewUrl******" + previewUrl);
		}
		return previewUrl;
	}

	private String replaceSigntureforTourismInBonaWaterSports(long tourismApplicationId, String folderName,
			long groupId, long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Applicant In Bona Water");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
		}
		return previewUrl;
	}

	private String replaceSigntureforOsiInsovencyInIndividual(long tourismApplicationId, String folderName,
			long groupId, long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature In Individual");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
		}
		return previewUrl;
	}

	private String replaceSigntureforOsiInsovencyInCompany(long osiInsolvencyApplicationId, String folderName,
			long groupId, long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature In Company");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
		}
		return previewUrl;
	}

	private String replaceSigntureforTourismInGroundCarRental(long tourismApplicationId, String folderName,
			long groupId, long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Applicant In Bona Car Rental");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
		}
		return previewUrl;
	}

	private String replaceStampforTourismInGroundCarRental(long tourismApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Stamp In Bona Car Rental");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
		}
		return previewUrl;
	}

	@Override
	public String filePermissionForDownload(FileEntry fileEntry) throws Exception {
		ResourcePermission resourcePermission = null;
		try {
			final Role siteMemberRole = RoleLocalServiceUtil.getRole(fileEntry.getCompanyId(), RoleConstants.USER);
			ResourceAction resourceAction = ResourceActionLocalServiceUtil
					.getResourceAction(DLFileEntry.class.getName(), ActionKeys.VIEW);
			try {
				resourcePermission = ResourcePermissionLocalServiceUtil.getResourcePermission(fileEntry.getCompanyId(),
						FileEntry.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
						String.valueOf(fileEntry.getPrimaryKey()), siteMemberRole.getRoleId());
				if (Validator.isNotNull(resourcePermission)) {

					resourcePermission.setActionIds(resourceAction.getBitwiseValue());
					ResourcePermissionLocalServiceUtil.updateResourcePermission(resourcePermission);
				}
			} catch (NoSuchResourcePermissionException e) {
				LOGGER.error(e.getMessage());
			}
			resourcePermission = ResourcePermissionLocalServiceUtil
					.createResourcePermission(CounterLocalServiceUtil.increment());
			resourcePermission.setCompanyId(fileEntry.getCompanyId());
			resourcePermission.setName(DLFileEntry.class.getName());
			resourcePermission.setScope(ResourceConstants.SCOPE_INDIVIDUAL);
			resourcePermission.setPrimKey(String.valueOf(fileEntry.getPrimaryKey()));
			resourcePermission.setRoleId(siteMemberRole.getRoleId());
			resourcePermission.setActionIds(resourceAction.getBitwiseValue());// (ActionKeys.VIEW);
			ResourcePermissionLocalServiceUtil.addResourcePermission(resourcePermission);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void updateFolderPermission(DLFolder dlFolder) throws Exception {
		ResourcePermission resourcePermission = null;
		final Role siteMemberRole = RoleLocalServiceUtil.getRole(dlFolder.getCompanyId(), RoleConstants.USER);
		ResourceAction resourceAction = ResourceActionLocalServiceUtil.getResourceAction(DLFolder.class.getName(),
				ActionKeys.VIEW);
		try {
			resourcePermission = ResourcePermissionLocalServiceUtil.getResourcePermission(dlFolder.getCompanyId(),
					DLFolder.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
					String.valueOf(dlFolder.getPrimaryKey()), siteMemberRole.getRoleId());

			if (Validator.isNotNull(resourcePermission)) {

				resourcePermission.setActionIds(resourceAction.getBitwiseValue());
				ResourcePermissionLocalServiceUtil.updateResourcePermission(resourcePermission);
			}
		} catch (NoSuchResourcePermissionException e) {

			resourcePermission = ResourcePermissionLocalServiceUtil
					.createResourcePermission(CounterLocalServiceUtil.increment());
			resourcePermission.setCompanyId(dlFolder.getCompanyId());
			resourcePermission.setName(DLFolder.class.getName());
			resourcePermission.setScope(ResourceConstants.SCOPE_INDIVIDUAL);
			resourcePermission.setPrimKey(String.valueOf(dlFolder.getPrimaryKey()));
			resourcePermission.setRoleId(siteMemberRole.getRoleId());
			resourcePermission.setActionIds(resourceAction.getBitwiseValue());// (ActionKeys.VIEW);
			ResourcePermissionLocalServiceUtil.addResourcePermission(resourcePermission);
		}

	}

	public String replaceTourismPdfVar(long tourismApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		TourismApplication application = TourismApplicationLocalServiceUtil.getTourismApplication(tourismApplicationId);
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Tourism Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(application.getTourismApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		TourismApplication tourismApplication = TourismApplicationLocalServiceUtil
				.getTourismApplication(tourismApplicationId);
		String previewUrlforStamp = null;
		String previewUrlforSignature = null;
		String previewUrlforSignatureforGround = null;
		String previewUrlforStampforNewAttract = null;
		String previewUrlforSignatureforNewAttract = null;
		String previewUrlforStampforBonaAcco = null;
		String previewUrlforSignatureforBonaAcco = null;
		String previewUrlforSignatureforBonaAttract = null;
		String previewUrlforStampforBonaAttract = null;
		String previewUrlforSignatureforBonaGround = null;
		String previewUrlforStampforWaterSports = null;
		String previewUrlforSignatureforWaterSports = null;
		String previewUrlSignatureForGroundCarRental = null;
		String previewUrlStampForGroundCarRental = null;
		try {
			previewUrlforStamp = replaceStampforTourism(tourismApplication.getTourismApplicationId(),
					"Tourism Supported Documents", themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			previewUrlforSignature = replaceSignatureforTourism(tourismApplication.getTourismApplicationId(),
					"Tourism Supported Documents", themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			previewUrlforSignatureforGround = replaceSignatureforTourismInGround(
					tourismApplication.getTourismApplicationId(), "Tourism Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			previewUrlforStampforNewAttract = replaceStampforTourismInNewAttract(
					tourismApplication.getTourismApplicationId(), "Tourism Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			previewUrlforSignatureforNewAttract = replaceSignatureforTourismInNewAttract(
					tourismApplication.getTourismApplicationId(), "Tourism Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			previewUrlforStampforBonaAcco = replaceStampforTourismInBonaAcco(
					tourismApplication.getTourismApplicationId(), "Tourism Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			previewUrlforSignatureforBonaAttract = replaceSignatureforTourismInBonaAttract(
					tourismApplication.getTourismApplicationId(), "Tourism Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			previewUrlforStampforBonaAttract = replaceStampforTourismInBonaAttract(
					tourismApplication.getTourismApplicationId(), "Tourism Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			previewUrlforSignatureforBonaGround = replaceSignatureforTourismInBonaGround(
					tourismApplication.getTourismApplicationId(), "Tourism Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}

		try {
			previewUrlforSignatureforWaterSports = replaceSigntureforTourismInBonaWaterSports(
					tourismApplication.getTourismApplicationId(), "Tourism Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}

		try {
			previewUrlforStampforWaterSports = replaceStampforTourismInBonaWaterSports(
					tourismApplication.getTourismApplicationId(), "Tourism Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			previewUrlSignatureForGroundCarRental = replaceSigntureforTourismInGroundCarRental(
					tourismApplication.getTourismApplicationId(), "Tourism Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			previewUrlStampForGroundCarRental = replaceStampforTourismInGroundCarRental(
					tourismApplication.getTourismApplicationId(), "Tourism Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		if (tourismApplication.getRequestType().equals("New/ Existing Operator- not yet Registered with the JTB")) {
			if (tourismApplication.getLicenseCategory().equals("Accommodations")) {
				TourismNewAccommodationForm tourismNewAccommodationForm = null;
				TourismNewAccoGeneralForm accoGeneralForm = null;
				TourismNewAccoAssesment accomodationAssesmentInfo = null;
				TourismNewNumberOFEmployment employment = null;
				TourismNewAnnualEarnings annualEarnings = null;
				TourismNewAccoSignInfo accoSignInfo = null;
				TourismNewAccommodationAddress newAccommodationOperatorAddress = null;
				TourismNewAccommodationAddress newAccommodationAddress = null;
				List<TourismAnnualEntertainBox> annualEntertainBoxs = null;
				try {
					tourismNewAccommodationForm = TourismNewAccommodationFormLocalServiceUtil.getTourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
				newAccommodationOperatorAddress = TourismNewAccommodationAddressLocalServiceUtil.getTN_A_At("Address of Operator", tourismNewAccommodationForm.getTourismNewAccoFormId());
                }catch (Exception e) {
				}try {
				newAccommodationAddress = TourismNewAccommodationAddressLocalServiceUtil.getTN_A_At("Address",tourismNewAccommodationForm.getTourismNewAccoFormId());
				 }catch (Exception e) {
				 }try {
				 accoGeneralForm = TourismNewAccoGeneralFormLocalServiceUtil.getTourismById(tourismApplicationId);
			}catch (Exception e) {
			}try {
				accomodationAssesmentInfo = TourismNewAccoAssesmentLocalServiceUtil.getTourismById(tourismApplicationId);
			}catch (Exception e) {
			}try {	
				employment = TourismNewNumberOFEmploymentLocalServiceUtil.getTourismById(tourismApplicationId);
			}catch (Exception e) {
			}try {
				annualEarnings = TourismNewAnnualEarningsLocalServiceUtil.getTourismById(tourismApplicationId);
			}catch (Exception e) {
			}try {
				accoSignInfo = TourismNewAccoSignInfoLocalServiceUtil.getTourismById(tourismApplicationId);
			}catch (Exception e) {
			}try {
			annualEntertainBoxs = TourismAnnualEntertainBoxLocalServiceUtil.getTAP_TAI(tourismApplicationId);
				}catch (Exception e) {
				}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"tourism_accommodations_newexisting");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"tourism_accommodations_newexisting-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//						for the first form
						"[$DateOfApplication$]", "[$PIRT_AccommodationSubCategory$]","[$PIRT_NameofPropertyBusiness$]",
							"[$PIRT_NameofOwner$]",
							"[$Location$]", 
							"[$CompanyNo$]",
							"[$PIRT_CompanyNoBusinessRegistrationNo$]",
							"[$PIRT_DateofRegistration$]",
							"[$PIRT_OwnersTRN$]", 
							"[$PIRT_OwnersTCC$]", "[$PIRT_TCCExpirationDate$]",
							"[$PIRTA_OperatorName$]", "[$PIRT_AddressofOperator$]", "[$PIRT_OperatorTRN$]",
							"[$PIRT_OperatorTCC$]", "[$PIRT_OperatorTCCExpirationDate$]", "[$TelephoneNo$]",
							"[$FaxNoOfOperator$]", "[$Email$]", "[$ContactPerson$]", "[$PositionHeld$]", "[$Address$]",
							"[$Telephone$]", "[$FaxNo$]", "[$Email2$]",  
//25
//						for the seond
							"[$NameOfEstablishment$]", "[$NumberofRooms$]", "[$DetailsAndCapacitiesOfFacilities$]",
							"[$OperatorOfHotel$]", "[$TypeOfAccommodationtoBeOffered$]",
							"[$DateOfCommencementOfConstruction$]", "[$DatehotelIsexpectedToCommenceOperations$]",
//						7
////						for the third one 
							"[$CountryOfOrigin$]", "[$JointVenture$]", "[$Local$]", "[$Foreign$]",
							"[$TotalCapitalInvestment$]", "[$ShareCapital$]", "[$Loancapital$]", "[$Other(Specify)$]",
//							8
							
							
//							
							"[$LocalMalePer$]", "[$ForeignFemalePer$]", "[$ForeignMalePer$]", "[$ForeignFeMalePer$]",
//							4
							
							
							
							"[$LocalMaleTem$]", "[$ForeignFemaleTem$]", "[$ForeignMaleTem$]", "[$ForeignFeMaleTem$]",
//							4
							
							
							"[$LocalMaleTotal$]", "[$ForeignFemaleTotal$]", "[$ForeignMaleTotal$]",
							"[$ForeignFeMaleTotal$]", "[$SalariesAndWages$]",
							"[$EstimatedExpenditureLocallyOnRawMaterials$]", "[$OtherEstimatedExpenditureLocally$]",
							
							"[$Perroom cost, inclusive of land $]", "[$Per room cost, exclusive of land J$$]",
//							9
							"[$LocalMale1$]", "[$ForeignFemale1$]", "[$ForeignMale1$]", "[$ForeignFeMale1$]",
							"[$LocalMale2$]", "[$ForeignFemale2$]", "[$ForeignMale2$]", "[$ForeignFeMale2$]",
							"[$LocalMale3$]", "[$ForeignFemale3$]", "[$ForeignMale3$]", "[$ForeignFeMale3$]",
							"[$SalariesAndWagesOfTotal$]", "[$ExpectedAnnualNetInflowOfFundsfromAbroad$]",
							"[$Year1US$]", "[$Year2US$]", "[$Year3Us$]", "[$LocalTar$]", "[$ForeignTar$]",
							"[$CountriesTar$]", "[$EstimatedPercentageAgri$]", "[$VolumeAgri$]",
							"[$EstimatedPercentageAgri$]", "[$EstimatedPercentageManu$]", "[$volumeManu$]",
							"[$ExpenditureManu$]", "[$EstimatedPercentageMeat$]", "[$VolumeMeat$]",
							"[$ExpenditureMeat$]"
//							15
							,"[$Services1$]", "[$Local1$]", "[$Foreign1$]",
							"[$Services2$]", "[$Local2$]","[$Foreign2$]",
							"[$Services3$]", "[$Local3$]", "[$Foreign3$]",
							"[$Services4$]","[$Local4$]", "[$Foreign4$]", 
							"[$Services5$]", "[$Local5$]", "[$Foreign5$]",

//                         for the forth one
							"[$NameofApplicant$]", "[$Date$]", "[$StatusofApplicantrelativetoProject$]",
							"[$Signature$]", "[$Stamp$]", "[$CreateDate$]" 
							
					
					}, new String[] {
//						for the first one 
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoDateOfApplication())?dateFormat.format(tourismNewAccommodationForm.getAccoDateOfApplication()):"",		
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoTypeOfAccommodation())?tourismNewAccommodationForm.getAccoTypeOfAccommodation(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoNameOfProperty())?tourismNewAccommodationForm.getAccoNameOfProperty(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoNameOfOwner())?tourismNewAccommodationForm.getAccoNameOfOwner(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoLocation())?tourismNewAccommodationForm.getAccoLocation(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoCompanyNumber())?tourismNewAccommodationForm.getAccoCompanyNumber(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoBusinessRegistrationNumber())?tourismNewAccommodationForm.getAccoBusinessRegistrationNumber(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoDateOfRegistration())?dateFormat.format(tourismNewAccommodationForm.getAccoDateOfRegistration()):"",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoOwnerTrnNumber())?tourismNewAccommodationForm.getAccoOwnerTrnNumber(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoTccNumber())?tourismNewAccommodationForm.getAccoTccNumber(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoExpiryDate())?dateFormat.format(tourismNewAccommodationForm.getAccoExpiryDate()):"",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoNameOfOperator())?tourismNewAccommodationForm.getAccoNameOfOperator(): "",
				Validator.isNotNull(newAccommodationOperatorAddress)&& Validator.isNotNull(newAccommodationOperatorAddress.getAccoAddress())?newAccommodationOperatorAddress.getAccoAddress(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoOperatorTrnNumber())?tourismNewAccommodationForm.getAccoOperatorTrnNumber(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoOperatorTccNumber())?tourismNewAccommodationForm.getAccoOperatorTccNumber(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoOperatorExpiryDate())?dateFormat.format(tourismNewAccommodationForm.getAccoOperatorExpiryDate()):"",
				Validator.isNotNull(newAccommodationOperatorAddress)&& Validator.isNotNull(newAccommodationOperatorAddress.getAccoTelephoneNumber())?newAccommodationOperatorAddress.getAccoTelephoneNumber(): "",
				Validator.isNotNull(newAccommodationOperatorAddress)&& Validator.isNotNull(newAccommodationOperatorAddress.getAccoFaxNumber())?newAccommodationOperatorAddress.getAccoFaxNumber(): "",
				Validator.isNotNull(newAccommodationOperatorAddress)&& Validator.isNotNull(newAccommodationOperatorAddress.getAccoEmail())?newAccommodationOperatorAddress.getAccoEmail(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoContactPerson())?tourismNewAccommodationForm.getAccoContactPerson(): "",
				Validator.isNotNull(tourismNewAccommodationForm)&& Validator.isNotNull(tourismNewAccommodationForm.getAccoPositionHeld())?tourismNewAccommodationForm.getAccoPositionHeld(): "",
				Validator.isNotNull(newAccommodationAddress)&& Validator.isNotNull(newAccommodationAddress.getAccoAddress())?newAccommodationAddress.getAccoAddress(): "",		
				Validator.isNotNull(newAccommodationAddress)&& Validator.isNotNull(newAccommodationAddress.getAccoTelephoneNumber())?newAccommodationAddress.getAccoTelephoneNumber(): "",		
				Validator.isNotNull(newAccommodationAddress)&& Validator.isNotNull(newAccommodationAddress.getAccoFaxNumber())?newAccommodationAddress.getAccoFaxNumber(): "",		
				Validator.isNotNull(newAccommodationAddress)&& Validator.isNotNull(newAccommodationAddress.getAccoEmail())?newAccommodationAddress.getAccoEmail(): "",		
//25
//						for the second one
	Validator.isNotNull(accoGeneralForm)&& Validator.isNotNull(accoGeneralForm.getEstablishmentName())?accoGeneralForm.getEstablishmentName(): "",	
	Validator.isNotNull(accoGeneralForm)&& Validator.isNotNull(accoGeneralForm.getAccomadationRoom())?accoGeneralForm.getAccomadationRoom(): "",	
	Validator.isNotNull(accoGeneralForm)&& Validator.isNotNull(accoGeneralForm.getFacilityDetail())?accoGeneralForm.getFacilityDetail(): "",	
	Validator.isNotNull(accoGeneralForm)&& Validator.isNotNull(accoGeneralForm.getHotelOperator())?accoGeneralForm.getHotelOperator(): "",	
	Validator.isNotNull(accoGeneralForm)&& Validator.isNotNull(accoGeneralForm.getOfferedAccomadation())?accoGeneralForm.getOfferedAccomadation(): "",	
	Validator.isNotNull(accoGeneralForm)&& Validator.isNotNull(accoGeneralForm.getConstructionDate())?dateFormat.format(accoGeneralForm.getConstructionDate()):"",
	Validator.isNotNull(accoGeneralForm)&& Validator.isNotNull(accoGeneralForm.getCommenceDate())?dateFormat.format(accoGeneralForm.getCommenceDate()):"",
//7
//						for the third one
    Validator.isNotNull(accomodationAssesmentInfo)&& Validator.isNotNull(accomodationAssesmentInfo.getCountryOrigin())?accomodationAssesmentInfo.getCountryOrigin(): "",
	Validator.isNotNull(accomodationAssesmentInfo)&& Validator.isNotNull(accomodationAssesmentInfo.getJointVenture())?accomodationAssesmentInfo.getJointVenture(): "",
	Validator.isNotNull(accomodationAssesmentInfo)&& Validator.isNotNull(accomodationAssesmentInfo.getLocalPer())?accomodationAssesmentInfo.getLocalPer(): "",
	Validator.isNotNull(accomodationAssesmentInfo)&& Validator.isNotNull(accomodationAssesmentInfo.getForeignPer())?accomodationAssesmentInfo.getForeignPer(): "",
	Validator.isNotNull(accomodationAssesmentInfo)&& Validator.isNotNull(accomodationAssesmentInfo.getCapitalInvest())?accomodationAssesmentInfo.getCapitalInvest(): "",
	Validator.isNotNull(accomodationAssesmentInfo)&& Validator.isNotNull(accomodationAssesmentInfo.getShareCapital())?accomodationAssesmentInfo.getShareCapital(): "",
	Validator.isNotNull(accomodationAssesmentInfo)&& Validator.isNotNull(accomodationAssesmentInfo.getLoanCapital())?accomodationAssesmentInfo.getLoanCapital(): "",
	Validator.isNotNull(accomodationAssesmentInfo)&& Validator.isNotNull(accomodationAssesmentInfo.getOther())?accomodationAssesmentInfo.getOther(): "",
//8
//								for the forth one 
	        Validator.isNotNull(employment)&& Validator.isNotNull(employment.getPermanentLocalMale())?employment.getPermanentLocalMale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getPermanentLocalFemale())?employment.getPermanentLocalFemale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getPermanentForeignMale())?employment.getPermanentForeignMale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getPermanentForeignFemale())?employment.getPermanentForeignFemale(): "",
//					4
					
					
					
					
					
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getTemporaryLocalMale())?employment.getTemporaryLocalMale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getTemporaryLocalFemale())?employment.getTemporaryLocalFemale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getTemporaryForeignMale())?employment.getTemporaryForeignMale(): "",
	        Validator.isNotNull(employment)&& Validator.isNotNull(employment.getTemporaryForeignFemale())?employment.getTemporaryForeignFemale(): "",
	        		
//	        		4
	        		
	        		
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getTotalLocalMale())?employment.getTotalLocalMale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getTotalLocalFemale())?employment.getTotalLocalFemale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getTotalForeignMale())?employment.getTotalForeignMale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getTotalForeignFemale())?employment.getTotalForeignFemale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getSalaryWages())?employment.getSalaryWages(): "",
	        Validator.isNotNull(employment)&& Validator.isNotNull(employment.getEstimatedExpenditure())?employment.getEstimatedExpenditure(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getOtherExpenditure())?employment.getOtherExpenditure(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getPerRoomInclusiveCost())?employment.getPerRoomInclusiveCost(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getPerRoomExclusiveCost())?employment.getPerRoomExclusiveCost(): "",
					
//					9
					
					
					
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getStaffPermanentLocalMale())?employment.getStaffPermanentLocalMale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getStaffPermanentLocalFemale())?employment.getStaffPermanentLocalFemale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getStaffPermanentForeignMale())?employment.getStaffPermanentForeignMale(): "",
	        Validator.isNotNull(employment)&& Validator.isNotNull(employment.getStaffPermanentForeignFemale())?employment.getStaffPermanentForeignFemale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getStaffTemporaryLocalMale())?employment.getStaffTemporaryLocalMale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getStaffTemporaryLocalFemale())?employment.getStaffTemporaryLocalFemale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getStaffTemporaryForeignMale())?employment.getStaffTemporaryForeignMale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getStaffTemporaryForeignFemale())?employment.getStaffTemporaryForeignFemale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getStaffTotalLocalMale())?employment.getStaffTotalLocalMale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getStaffTotalLocalFemale())?employment.getStaffTotalLocalFemale(): "",
	        Validator.isNotNull(employment)&& Validator.isNotNull(employment.getStaffTotalForeignMale())?employment.getStaffTotalForeignMale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getStaffTotalForeignFemale())?employment.getStaffTotalForeignFemale(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getSalariesAndWages())?employment.getSalariesAndWages(): "",
			Validator.isNotNull(employment)&& Validator.isNotNull(employment.getExpectedAnnualFunds())?employment.getExpectedAnnualFunds(): "",
					
//					14

//								for the fith one 
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getYearOne())? annualEarnings.getYearOne(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getYearTwo())? annualEarnings.getYearTwo(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getYearThree())? annualEarnings.getYearThree(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getTargetLocalPer())? annualEarnings.getTargetLocalPer(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getTargetForeignPer())? annualEarnings.getTargetForeignPer(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getTargetCountries())? annualEarnings.getTargetCountries(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getEstimatedPer())? annualEarnings.getEstimatedPer(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getVolume())? annualEarnings.getVolume(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getExpenditure())?annualEarnings.getExpenditure(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getManufactureEstimatedPer())? annualEarnings.getManufactureEstimatedPer(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getManufactureVolume())? annualEarnings.getManufactureVolume(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getManufactureExpenditure())? annualEarnings.getManufactureExpenditure(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getSeafoodPer())? annualEarnings.getSeafoodPer(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getSeafoodVolume())? annualEarnings.getSeafoodVolume(): "",
	Validator.isNotNull(annualEarnings)&& Validator.isNotNull(annualEarnings.getSeafoodExpenditure())? annualEarnings.getSeafoodExpenditure(): "",
			
//			15
													
	(annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>0)?annualEntertainBoxs.get(0).getService():"",	
	(annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>0)?annualEntertainBoxs.get(0).getLocal():"",
	(annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>0)?annualEntertainBoxs.get(0).getForeign():"",
			
    (annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>1)?annualEntertainBoxs.get(1).getService():"",	
	(annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>1)?annualEntertainBoxs.get(1).getLocal():"",
	(annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>1)?annualEntertainBoxs.get(1).getForeign():"",
			
    (annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>2)?annualEntertainBoxs.get(2).getService():"",	
	(annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>2)?annualEntertainBoxs.get(2).getLocal():"",
	(annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>2)?annualEntertainBoxs.get(2).getForeign():"",
											
    (annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>3)?annualEntertainBoxs.get(3).getService():"",	
	(annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>3)?annualEntertainBoxs.get(3).getLocal():"",
	(annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>3)?annualEntertainBoxs.get(3).getForeign():"",
			
    (annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>4)?annualEntertainBoxs.get(4).getService():"",	
	(annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>4)?annualEntertainBoxs.get(4).getLocal():"",
	(annualEntertainBoxs!=null)&&(annualEntertainBoxs.size()>4)?annualEntertainBoxs.get(4).getForeign():"",			
											
//								for the forth one
			Validator.isNotNull(accoSignInfo)&& Validator.isNotNull(accoSignInfo.getSignApplicantName())?accoSignInfo.getSignApplicantName(): "",
		Validator.isNotNull(accoSignInfo.getNewSignDate())?dateFormat.format(accoSignInfo.getNewSignDate()): "",
							accoSignInfo.getSignApplicantStatus(),
							previewUrlforSignature, previewUrlforStamp,
			Validator.isNotNull(tourismApplication)? dateFormat.format(tourismApplication.getCreateDate()): "" ,
				});
	} catch (Exception e) {
e.printStackTrace();
	}
				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					String fileName = null;
					String businessPlan = null;
					String buildingPlanApproved = null;
					String taxCompliance = null;
					String certifiedCopy = null;
					String certifiedCopySecond = null;
					String certifiedCopyBusiness = null;
					String letterOfGood = null;
					String title = null;
					String copyOfManagement = null;
					String letterOfFinancial = null;
					for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
						fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
						if (title.equals("Business Plan")) {
							businessPlan = fileName;
						} else if (title.equals("Building Plans Approved by the Parish Council")) {
							buildingPlanApproved = fileName;
						} else if (title.equals("Tax Compliance Certificate")) {
							taxCompliance = fileName;
						} else if (title.equals("Certified copy of Certificate of Incorporation")) {
							certifiedCopy = fileName;
						} else if (title.equals("Certified copy")) {
							certifiedCopySecond = fileName;
						} else if (title.equals("Certified copy Business Registration")) {
							certifiedCopyBusiness = fileName;
						} else if (title.equals("Letter of Good Standing")) {
							letterOfGood = fileName;
						} else if (title.equals("Title")) {
							title = fileName;
						} else if (title.equals("Copy of management/lease agreement")) {
							copyOfManagement = fileName;
						} else if (title.equals("Letter of Financial")) {
							letterOfFinancial = fileName;
						}
					}
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//			for the document 
							"[$BusinessPlan$]", "[$BuildingPlansApproved$]", "[$TaxCompliance$]", "[$CertifiedCopy$]",
							"[$Certified$]", "[$CertifiedCopyBusinessRegistration$]", "[$LetterOfGoodStanding$]",
							"[$Title$]", "[$CopyOfManagement/lease$]", "[$LetterOfFinancial$]" },
							new String[] { businessPlan, buildingPlanApproved, taxCompliance, certifiedCopy,
									certifiedCopySecond, certifiedCopyBusiness, letterOfGood, title, copyOfManagement,
									letterOfFinancial });
				}
			} else if (tourismApplication.getLicenseCategory().equals("Attractions")) {
				TourismNewAttractionFormFirst attractionFormFirst = null;
				TourismNewAttractionFormFirstAddress addressOfOperator = null;
				TourismNewAttractionFormFirstAddress address = null;
				TourismNewAttractionFormSecond attractionFormSecond = null;
				TourismNewAttractionEmployeeInfo attractionEmployeeInfo = null;
				TourismNewAttractionSignInfo attractionSignInfo = null;
				try {
					attractionFormFirst = TourismNewAttractionFormFirstLocalServiceUtil
							.getTourimsById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					addressOfOperator = TourismNewAttractionFormFirstAddressLocalServiceUtil.getTN_Attract_AT(
							"Address of Operator", attractionFormFirst.getTourismNewAttractFormFirstId());
				}catch (Exception e) {
				}try {
					address = TourismNewAttractionFormFirstAddressLocalServiceUtil.getTN_Attract_AT("Address",
							attractionFormFirst.getTourismNewAttractFormFirstId());
				}catch (Exception e) {
				}try {
					attractionFormSecond = TourismNewAttractionFormSecondLocalServiceUtil
							.getTourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					attractionEmployeeInfo = TourismNewAttractionEmployeeInfoLocalServiceUtil
							.getTourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					attractionSignInfo = TourismNewAttractionSignInfoLocalServiceUtil
							.getTourismById(tourismApplicationId);
				} catch (Exception e) {
				}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"tourism_attractions_newexisting");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"tourism_attractions_newexisting-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//							for the first form 
							"[$DateOfApplication$]", "[$PIRT_AttractionsSubCategory$]",
							"[$PIRT_NameofPropertyBusiness$]", "[$PIRT_NameofOwner$]", "[$Location$]", "[$CompanyNo$]",
							"[$PIRT_CompanyNoBusinessRegistrationNo$]", "[$PIRT_DateofRegistration$]",
							"[$PIRT_OwnersTRN$]", "[$PIRT_OwnersTCC$]", "[$PIRT_TCCExpirationDate$]",
							"[$PIRTA_OperatorName$]", "[$PIRT_AddressofOperator$]", "[$PIRT_OperatorTRN$]",
							"[$PIRT_OperatorTCC$]", "[$PIRT_OperatorTCCExpirationDate$]", "[$TelephoneNo$]",
							"[$FaxNoOfOperator$]", "[$EmailOfOperator$]", "[$ContactPerson$]", "[$PositionHeld$]",
							"[$Address$]", "[$Telephone$]", "[$FaxNo$]", "[$Email$]", "[$EntityType$]",
							"[$AttachCopyOfBusinessPlan$]"

//							for the second form 
							, "[$LocalTar$]", "[$ForeignTar$]", "[$CountriesTar$]", "[$CountryOfOrigin$]",
							"[$JointVenture$]", "[$Local$]", "[$Foreign$]", "[$USComponent$]", "[$JEquivalent$]",
							"[$RateOfExchange$]", "[$JComponent$]", "[$TotalCaptial$]", "[$LoanJ$]", "[$Equity$]",
							"[$StateSourceOfLoanFinancing$]", "[$Year$]", "[$Year 2$]", "[$Year 3$]",
							"[$NumberOfVisitorsExpectedAnnually$]",

//							for the third one 
							"[$PermanentActual$]", "[$TemporaryActual$]", "[$ForeignActual$]", "[$LocalActual$]",
							"[$Payroll$]", "[$ProPermanent$]", "[$ProTemporary$]", "[$ProForeign$]", "[$ProLocal$]",
							"[$ProPayroll$]",

//							for the forth one
							"[$NameOfApplicant$]", "[$Date$]", "[$StatusOfApplicantRrelativeToProject$]",
							"[$Signature$]", "[$Stamp$]", "[$CreateDate$]" },

							new String[] {
//							for the first form 
									Validator.isNotNull(attractionFormFirst.getAttractionDateOfApplication())
											? dateFormat.format(attractionFormFirst.getAttractionDateOfApplication())
											: "",
									attractionFormFirst.getTypeOfAttrcation(),
									attractionFormFirst.getAttractionNameOfProperty(),
									attractionFormFirst.getAttractionNameOfOwner(),
									attractionFormFirst.getAttractionLocation(),
									attractionFormFirst.getAttractionCompanyNumber(),
									attractionFormFirst.getAttractionBusinessRegisNo(),
									Validator.isNotNull(attractionFormFirst.getAttractionDateOfRegistration())
											? dateFormat.format(attractionFormFirst.getAttractionDateOfRegistration())
											: "",
									attractionFormFirst.getAttractionOwnerTrnNumber(),
									attractionFormFirst.getAttractionTccNumber(),
									Validator.isNotNull(attractionFormFirst.getAttractionExpiryDate())
											? dateFormat.format(attractionFormFirst.getAttractionExpiryDate())
											: "",
									attractionFormFirst.getAttractionNameOfOperator(),
									addressOfOperator.getAttractionAddress(),
									attractionFormFirst.getAttractionoperatorTrnNumber(),
									attractionFormFirst.getAttractionOperatorTccNumber(),
									Validator.isNotNull(attractionFormFirst.getAttractOperatorExpiryDate())
											? dateFormat.format(attractionFormFirst.getAttractOperatorExpiryDate())
											: "",
									addressOfOperator.getAttractionTelephoneNumber(),
									addressOfOperator.getAttractionFaxNumber(), addressOfOperator.getAttractionEmail(),
									attractionFormFirst.getAttractionContactPerson(),
									attractionFormFirst.getAttractionPositionHeld(), address.getAttractionAddress(),
									address.getAttractionTelephoneNumber(), address.getAttractionFaxNumber(),
									address.getAttractionEmail(), attractionFormFirst.getAttractionEntityId(),
									attractionFormFirst.getAttractionBriefdescription(),

//							for the secnd form
									attractionFormSecond.getTargetMarketLocal(),
									attractionFormSecond.getTargetMarketForeign(),
									attractionFormSecond.getTargetMarketCountries(),
									attractionFormSecond.getOwnerCountryOfOrigin(),
									attractionFormSecond.getOwnerJointVenture(), attractionFormSecond.getOwnerLocal(),
									attractionFormSecond.getOwnerForeign(),
									attractionFormSecond.getCapitalizationUSComponent(),
									attractionFormSecond.getCapitalizationJEquivalent(),
									attractionFormSecond.getCapitalizationRateOfExchange(),
									attractionFormSecond.getCapitalizationJComponent(),
									attractionFormSecond.getCapitalizationCapitalInvest(),
									attractionFormSecond.getSourcesLoan(), attractionFormSecond.getSourcesEquity(),
									attractionFormSecond.getSourcesStateSourceOfLoanFinanc(),
									attractionFormSecond.getAnnualProjectedOne(),
									attractionFormSecond.getAnnualProjectedTwo(),
									attractionFormSecond.getAnnualProjectedThree(),
									attractionFormSecond.getAnnualProjectedNumber(),

//							for the third one 
									attractionEmployeeInfo.getActualPermanent(),
									attractionEmployeeInfo.getActualTemporary(),
									attractionEmployeeInfo.getActualForeign(), attractionEmployeeInfo.getActualLocal(),
									attractionEmployeeInfo.getActualPayroll(),
									attractionEmployeeInfo.getProjectedPermanent(),
									attractionEmployeeInfo.getProjectedTemporary(),
									attractionEmployeeInfo.getProjectedForeign(),
									attractionEmployeeInfo.getProjectedLocal(),
									attractionEmployeeInfo.getProjectedPayroll(),
//							for the forth one 
									attractionSignInfo.getNewSignApplicantName(),
									Validator.isNotNull(attractionSignInfo.getNewSignDate())
											? dateFormat.format(attractionSignInfo.getNewSignDate())
											: "",
									attractionSignInfo.getNewSignApplicantStatus(), previewUrlforSignatureforNewAttract,
									previewUrlforStampforNewAttract,
									Validator.isNotNull(tourismApplication.getCreateDate())
											? dateFormat.format(tourismApplication.getCreateDate())
											: "" });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("fasle")) {
					String fileName = null;
					String title = null;
					String businessPlan = null;
					String buildingPlanApproved = null;
					String taxCompliance = null;
					String certificateOfIncorporation = null;
					String NepaApproval = null;
					String copyOfManagement = null;
					String letterOfFinancial = null;

					for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
						fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
						if (title.equals("Business Plan")) {
							businessPlan = fileName;
						} else if (title.equals("Building Plans Approved by the Parish Council")) {
							buildingPlanApproved = fileName;
						} else if (title.equals("Tax Compliance Certificate")) {
							taxCompliance = fileName;
						} else if (title.equals("Certificate of Incorporation")) {
							certificateOfIncorporation = fileName;
						} else if (title.equals("NEPA Approval")) {
							NepaApproval = fileName;
						} else if (title.equals("Copy of management/lease agreement")) {
							copyOfManagement = fileName;
						} else if (title.equals("Letter of Financial Commitment")) {
							letterOfFinancial = fileName;
						}
					}
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//				for the document 
							"[$BusinessPlan$]", "[$BuildingPlansApproved$]", "[$TaxCompliance$]",
							"[$CertificateofIncorporation$]", "[$NEPAApproval$]", "[$CopyOfManagementAgreement$]",
							"[$LetterofFinancialCommitment$]" },
							new String[] { businessPlan, buildingPlanApproved, taxCompliance,
									certificateOfIncorporation, NepaApproval, copyOfManagement, letterOfFinancial });
				}
			} else if (tourismApplication.getLicenseCategory().equals("Ground Transportation")) {
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"tourism_groundtransportation_newexisting_contractcarriage");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"tourism_groundtransportation_newexisting_contractcarriage-1");
				}
				TourismNewGroundTransportation groundTransportation = null;
				List<TourismGroundTransBox> groundTransBoxs = null;
				TourismNewGroundSignature groundSignature = null;
//			TourismApplicationPayment applicationPayment=null;
				try {
					groundTransportation = TourismNewGroundTransportationLocalServiceUtil
							.getTourismById(tourismApplicationId);
					groundTransBoxs = TourismGroundTransBoxLocalServiceUtil.getTourismById(tourismApplicationId);

					groundSignature = TourismNewGroundSignatureLocalServiceUtil.getTourismById(tourismApplicationId);
//				applicationPayment=TourismApplicationPaymentLocalServiceUtil.getTourismApplicationPayment(tourismApplicationId);

				} catch (Exception e) {
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate,
							new String[] { "[$TypeOfGroundTransportation$]", "[$Name$]", "[$HomeAddress$]",
									"[$BusinessAddress$]", "[$LandlineNo$]", "[$MobileNo$]", "[$FaxNo$]",
									"[$Licensedwith$]", "[$JamaicaTouristBoardLicence$]", "[$HaveYouBenefittedBefore$]",
									"[$LastBenefit$]", "[$EntityType$]", "[$Make1$]", "[$Model1$]", "[$Year1$]",
									"[$Make2$]", "[$Model2$]", "[$Year2$]", "[$Make3$]", "[$Model3$]", "[$Year3$]",
									"[$Make4$]", "[$Model4$]", "[$Year4$]", "[$Make5$]", "[$Model5$]", "[$Year5$]",
									"[$SeatingCapacity$]", "[$ExistingFleetAmount$]", "[$IndicateIfVehicleWill$]",
									"[$Date$]",
//							"[$PaymentMethod$]"
									"[$Signature$]", "[$CreateDate$]" },

							new String[] { groundTransportation.getTypeOfGroundTransportation(),
									groundTransportation.getNewGroundName(),
									groundTransportation.getNewGroundHomeAddress(),
									groundTransportation.getNewGroundBusinessAddress(),
									groundTransportation.getNewGroundLandlineNo(),
									groundTransportation.getNewGroundMobileNo(),
									groundTransportation.getNewGroundFaxNo(),
									groundTransportation.getNewGroundLicensedWith(),
Validator.isNotNull(groundTransportation.getNewGroundBoardExpiryDate())?dateFormat.format(groundTransportation.getNewGroundBoardExpiryDate()): "",
groundTransportation.getNewGroundHaveYouBenefitBefore(),
Validator.isNotNull(groundTransportation.getNewGroundHaveBenefitDate())?dateFormat.format(groundTransportation.getNewGroundHaveBenefitDate()): "",
									groundTransportation.getNewGroundEntityType(),
									
				(groundTransBoxs!=null)&&(groundTransBoxs.size() > 0)?groundTransBoxs.get(0).getVehicleMake():"",	
				(groundTransBoxs!=null)&&(groundTransBoxs.size() > 0)?groundTransBoxs.get(0).getVehiclemodel():"",	
				(groundTransBoxs!=null)&&(groundTransBoxs.size() > 0)?groundTransBoxs.get(0).getVehicleYear():"",	
						
		        (groundTransBoxs!=null)&&(groundTransBoxs.size() > 1)?groundTransBoxs.get(1).getVehicleMake():"",	
				(groundTransBoxs!=null)&&(groundTransBoxs.size() > 1)?groundTransBoxs.get(1).getVehiclemodel():"",	
				(groundTransBoxs!=null)&&(groundTransBoxs.size() > 1)?groundTransBoxs.get(1).getVehicleYear():"",	
						
	            (groundTransBoxs!=null)&&(groundTransBoxs.size() > 2)?groundTransBoxs.get(2).getVehicleMake():"",	
				(groundTransBoxs!=null)&&(groundTransBoxs.size() > 2)?groundTransBoxs.get(2).getVehiclemodel():"",	
				(groundTransBoxs!=null)&&(groundTransBoxs.size() > 2)?groundTransBoxs.get(2).getVehicleYear():"",	
						
		        (groundTransBoxs!=null)&&(groundTransBoxs.size() > 3)?groundTransBoxs.get(3).getVehicleMake():"",	
				(groundTransBoxs!=null)&&(groundTransBoxs.size() > 3)?groundTransBoxs.get(3).getVehiclemodel():"",	
				(groundTransBoxs!=null)&&(groundTransBoxs.size() > 3)?groundTransBoxs.get(3).getVehicleYear():"",	
						
                (groundTransBoxs!=null)&&(groundTransBoxs.size() > 4)?groundTransBoxs.get(4).getVehicleMake():"",	
				(groundTransBoxs!=null)&&(groundTransBoxs.size() > 4)?groundTransBoxs.get(4).getVehiclemodel():"",	
				(groundTransBoxs!=null)&&(groundTransBoxs.size() > 4)?groundTransBoxs.get(4).getVehicleYear():"",	
									groundTransportation.getNewGroundSeatingCapacity(),
									groundTransportation.getNewGroundExistingFleetAmount(),
									groundTransportation.getNewGroundIndicateVehicleWill(),
									Validator.isNotNull(groundSignature.getGroundTransportationDate())
											? dateFormat.format(groundSignature.getGroundTransportationDate())
											: "",
//							Validator.isNotNull(applicationPayment)?applicationPayment.getPaymentMethod():"",
									previewUrlforSignatureforGround,
									Validator.isNotNull(application.getCreateDate())
											? dateFormat.format(application.getCreateDate())
											: "" });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					String fileName = null;
					String title = null;
					String coverLetter = null;
					String feeVouher = null;
					String jtbLicence = null;
					String tcc = null;
					String invoice = null;
					for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
						fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
						if (title.equals("Cover Letter/Membership Letter")) {
							coverLetter = fileName;
						} else if (title.equals("Fee Voucher")) {
							feeVouher = fileName;
						} else if (title.equals("JTB Licence")) {
							jtbLicence = fileName;
						} else if (title.equals("TCC")) {
							tcc = fileName;
						} else if (title.equals("Invoice with CIF Value Chassis Number")) {
							invoice = fileName;
						}
					}
					pdfTemplate = StringUtil.replace(pdfTemplate,
							new String[] { "[$CoverLetter$]", "[$FeeVoucher$]", "[$JTBLicence$]", "[$TCC$]",
									"[$InvoicewithCIF$]" },
							new String[] { coverLetter, feeVouher, jtbLicence, tcc, invoice });
				}
			}
		}

//		this is for the second category (bona)
		if (tourismApplication.getRequestType().equals("Bona fide Tourist Operator")) {
			if (tourismApplication.getLicenseCategory().equals("Accommodations")) {
				TourismBonaAccommodationForm accommodationForm = null;
				TourismBonaAccoGenralInfo accoGenralInfo = null;
				TourismBonaAccommodationFormAddress bonaAccommodationOperatorAddress = null;
				TourismBonaAccommodationFormAddress bonaAccommodationAddress = null;
				TourismBonaAccoAssesment accoAssesment = null;
				TourismBonaAccoSignInfo accoSignInfo = null;

				try {
					accommodationForm = TourismBonaAccommodationFormLocalServiceUtil
							.getTourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					bonaAccommodationOperatorAddress = TourismBonaAccommodationFormAddressLocalServiceUtil
							.getTB_Acco_AT("Address of Operator", accommodationForm.getTourismBonaAFId());
				}catch (Exception e) {
				}try {
					bonaAccommodationAddress = TourismBonaAccommodationFormAddressLocalServiceUtil
							.getTB_Acco_AT("Address", accommodationForm.getTourismBonaAFId());
				}catch (Exception e) {
				}try {
					accoGenralInfo = TourismBonaAccoGenralInfoLocalServiceUtil.getTourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					accoAssesment = TourismBonaAccoAssesmentLocalServiceUtil.getTourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					accoSignInfo = TourismBonaAccoSignInfoLocalServiceUtil.getTourismById(tourismApplicationId);
				} catch (Exception e) {
				}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"tourism_accommodations_bonafide");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"tourism_accommodations_bonafide_form");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//								for the first one 
							"[$DateOfApplication$]", "[$TypeOfAccommodation$]", "[$PurpiseOfIncentives$]",
							"[$NameOfProperty$]", "[$NameOfOwner$]", "[$Location$]", "[$CompanyNo$]",
							"[$RegistrationNo$]", "[$DateOfRegistration$]", "[$OwnerTRN$]", "[$OwnerTccNo$]",
							"[$OwnerExpireDate$]", "[$NameOfOperator$]", "[$AddressOfOperator$]", "[$OperatorTRN$]",
							"[$TCCNo$]", "[$ExpireDate$]", "[$TelephoneNo$]", "[$Fax$]", "[$Email$]",
							"[$ContactPerson$]", "[$PositionHeld$]", "[$Address$]", "[$TelNo$]", "[$FaxNo$]",
							"[$Emailid$]",

//							for the second one 
							"[$NameOfEstablishment$]", "[$NameOfExistingEstablishment$]", "[$NumberOfRoomsSingle$]",
							"[$NumberOfRoomsDouble$]", "[$DetailsAndCapacitiesOfFacilities$]",
							"[$DetailsAndCapacitiesOfPlannedExtension$]", "[$TypeOfAccommodations$]",
							"[$DateOfCommencement$]", "[$DateHotel$]",

//							for the third one 
							"[$CountryOfOrigin$]", "[$JointVenture$]", "[$Local$]", "[$Foreign$]",
							"[$TotalCapitalInvestment$]", "[$ShareCapital$]", "[$LoanCapital$]", "[$Other$]",

//							for thr forth one

							"[$LocalMalePer$]", "[$LocalFemalePer$]", "[$ForeignMalePer$]", "[$ForeignFeMalePer$]",
							"[$LocalMaleLocal$]", "[$LocalFemaleLocal$]", "[$ForeignMaleLocal$]",
							"[$ForeignFeMaleLcoal$]", "[$LocalMaleTotal$]", "[$LocalFemaleTotal$]",
							"[$ForeignMaleTotal$]", "[$ForeignFeMaleTotal$]", "[$SalariesAndWages$]",
							"[$ForeignMaleOther$]", "[$ForeignFemaleTher$]", "[$LocalMalePermanent$]",
							"[$LocalFemalePermanent$]", "[$ForeignMalePermanent$]", "[$ForeignFeMalePermanent$]",
							"[$LocalMaleTemp$]", "[$LocalFemaleTemp$]", "[$ForeignMaleTemp$]", "[$ForeignFeMaleTemp$]",
							"[$LocalMaleTo$]", "[$LocalFemaleTo$]", "[$ForeignMaleTO$]", "[$ForeignFeMaleTot$]",
//							for the fith one
							"[$NameOfApplicant$]", "[$Date$]", "[$StatusOFApplicantRelative$]", "[$Signature$]",
							"[$Stamp$]", "[$CreateDate$]" },
							new String[] {
									Validator.isNotNull(accommodationForm.getBonaAccoDateOfApplication())
											? dateFormat.format(accommodationForm.getBonaAccoDateOfApplication())
											: "",
									accommodationForm.getBonaAccoTypeOfAccommodation(),
									accommodationForm.getBonaAccoPurposeOfIncentives(),
									accommodationForm.getBonaAccoNameOfProperty(),
									accommodationForm.getBonaAccoNameOfOwner(), accommodationForm.getBonaAccoLocation(),
									accommodationForm.getBonaAccoCompanyNumber(),
									accommodationForm.getBonaBusinessRegistrationNumber(),
									Validator.isNotNull(accommodationForm.getBonaAccoDateOfRegistration())
											? dateFormat.format(accommodationForm.getBonaAccoDateOfRegistration())
											: "",
									accommodationForm.getBonaAccoOwnerTrnNumber(),
									accommodationForm.getBonaAccoTccNumber(),
									Validator.isNotNull(accommodationForm.getBonaAccoExpiryDate())
											? dateFormat.format(accommodationForm.getBonaAccoExpiryDate())
											: "",
									accommodationForm.getBonaAccoNameOfOperator(),
									bonaAccommodationOperatorAddress.getBonaAccoAddress(),
									accommodationForm.getBonaAccoOperatorTrnNumber(),
									accommodationForm.getBonaAccoOperatorTccNumber(),
									Validator.isNotNull(accommodationForm.getBonaAccoOperatorExpiryDate())
											? dateFormat.format(accommodationForm.getBonaAccoOperatorExpiryDate())
											: "",
									bonaAccommodationOperatorAddress.getBonaAccoTelephoneNumber(),
									bonaAccommodationOperatorAddress.getBonaAccoFaxNumber(),
									bonaAccommodationOperatorAddress.getBonaAccoEmail(),
									accommodationForm.getBonaAccoContactPerson(),
									accommodationForm.getBonaAccoPositionHeld(),
									bonaAccommodationAddress.getBonaAccoAddress(),
									bonaAccommodationAddress.getBonaAccoTelephoneNumber(),
									bonaAccommodationAddress.getBonaAccoFaxNumber(),
									bonaAccommodationAddress.getBonaAccoEmail(),

//for the second one 
									accoGenralInfo.getEstablishmentName(), accoGenralInfo.getEstablishmentNewName(),
									accoGenralInfo.getGeneralFacilityRoom(), accoGenralInfo.getExistingFacilityRoom(),
									accoGenralInfo.getOfferedFacilityDetail(),
									accoGenralInfo.getPlannedFacilityDetail(),
									accoGenralInfo.getAccomodationToBeOffered(),
									Validator.isNotNull(accoGenralInfo.getConstructionDate())
											? (dateFormat.format(accoGenralInfo.getConstructionDate()))
											: "",
									Validator.isNotNull(accoGenralInfo.getExpectedCommenceDate())
											? dateFormat.format(accoGenralInfo.getExpectedCommenceDate())
											: "",

//										for the third one 
									accoAssesment.getCountryOrigin(), accoAssesment.getJointVenture(),
									accoAssesment.getLocalPer(), accoAssesment.getForeignPer(),
									accoAssesment.getCapitalInvest(), accoAssesment.getShareCapital(),
									accoAssesment.getLoanCapital(), accoAssesment.getOther(),

//										for the forth one
									accoAssesment.getPermanentLocalMale(), accoAssesment.getPermanentLocalFemale(),
									accoAssesment.getPermanentForeignMale(), accoAssesment.getPermanentForeignFemale(),
									accoAssesment.getTemporaryLocalMale(), accoAssesment.getTemporaryLocalFemale(),
									accoAssesment.getTemporaryForeignMale(), accoAssesment.getTemporaryForeignFemale(),
									accoAssesment.getTotalLocalMale(), accoAssesment.getTotalLocalFemale(),
									accoAssesment.getTotalForeignMale(), accoAssesment.getTotalForeignFemale(),
									accoAssesment.getSalaryWages(), accoAssesment.getOtherExpenditure(),
									accoAssesment.getEstimatedExpenditure(), accoAssesment.getStaffPermanentLocalMale(),
									accoAssesment.getStaffPermanentLocalFemale(),
									accoAssesment.getStaffForeignLocalMale(),
									accoAssesment.getStaffForeignLocalFemale(),
									accoAssesment.getStaffTemporaryLocalMale(),
									accoAssesment.getStaffTemporaryLocalFemale(),
									accoAssesment.getStaffTemporaryForeignMale(),
									accoAssesment.getStaffTemporaryForeignFemale(),
									accoAssesment.getStaffTotalForeignMale(),
									accoAssesment.getStaffTotalForeignFemale(), accoAssesment.getStaffTotalLocalMale(),
									accoAssesment.getStaffTotalLocalFemale(),

//										for the fith one 
									Validator.isNotNull(accoSignInfo.getNewSignApplicantName())
											? accoSignInfo.getNewSignApplicantName()
											: "",
									Validator.isNotNull(accoSignInfo.getNewSignDate())
											? dateFormat.format(accoSignInfo.getNewSignDate())
											: "",
									Validator.isNotNull(accoSignInfo.getNewSignApplicantStatus())
											? accoSignInfo.getNewSignApplicantStatus()
											: "",
									previewUrlforSignatureforBonaAcco, previewUrlforStampforBonaAcco,
									Validator.isNotNull(application.getCreateDate())
											? dateFormat.format(application.getCreateDate())
											: "", });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					String fileName = null;
					String title = null;
					String taxCompliance = null;
					String copyOf = null;
					for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
						fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
						if (title.equals("Tax Compliance Certificate")) {
							taxCompliance = fileName;
						} else if (title.equals("Copy of JTB Licence")) {
							copyOf = fileName;
						}
					}
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//					for the document 
							"[$TaxComlianceCertificate$]", "[$Copyof$]" }, new String[] { taxCompliance, copyOf });
				}
			} else if (tourismApplication.getLicenseCategory().equals("Attractions")) {
				TourismBonaAttractionFormFirst attractionFormFirst = null;
				TourismBonaAttractionFormFirstAddress tourismBonaAttractionFormFirstAddress = null;
				TourismBonaAttractionFormSecond bonaAttractionFormSecond = null;
				TourismBonaAttractionEmployeeInfo attractionEmployeeInfo = null;
				TourismBonaAttractionSignInfo attractionSignInfo = null;

				try {
					attractionFormFirst = TourismBonaAttractionFormFirstLocalServiceUtil
							.gettourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					tourismBonaAttractionFormFirstAddress = TourismBonaAttractionFormFirstAddressLocalServiceUtil
							.getTourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					bonaAttractionFormSecond = TourismBonaAttractionFormSecondLocalServiceUtil
							.getTourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					attractionEmployeeInfo = TourismBonaAttractionEmployeeInfoLocalServiceUtil
							.getTourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					attractionSignInfo = TourismBonaAttractionSignInfoLocalServiceUtil
							.getTourismById(tourismApplicationId);
				} catch (Exception e) {
				}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"tourism_bona_attraction_form");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"tourism_attractions_bonafide-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {

							"[$DateofApplication$]", "[$TypeofAttraction$]", "[$PurposeofIncentives$]",
							"[$PIRT_NameofPropertyBusiness$]", "[$PIRT_NameofOwner$]", "[$Location$]", "[$CompanyNo$]",
							"[$PIRT_CompanyNoBusinessRegistrationNo$]", "[$PIRT_DateofRegistration$]",
							"[$PIRT_OwnersTRN$]", "[$PIRT_OwnersTCC$]", "[$PIRT_TCCExpirationDate$]",
							"[$PIRTA_OperatorName$]", "[$PIRT_AddressofOperator$]", "[$PIRT_OperatorTRN$]",
							"[$PIRT_OperatorTCC$]", "[$PIRT_OperatorTCCExpirationDate$]", "[$TelephoneNo$]",
							"[$OperatorFaxNo$]", "[$OperatorEmail$]", "[$ContactPerson$]", "[$PositionHeld$]",
							"[$Address$]", "[$Telephone$]", "[$FaxNo$]", "[$Email$]", "[$EntityType$]",
							"[$Giveabriefdescription$]",

//for the second
							"[$LocalTar$]", "[$ForeignTar$]", "[$Countries$]", "[$CountryOfOrigin$]",
							"[$JointVenture$]", "[$EnterLocal$]", "[$EnterForeign$]", "[$USComponent$]",
							"[$JEquivalent$]", "[$RateOfExchange$]", "[$JComponent$]", "[$TotalCapitalInvestment$]",
							"[$LoanJ$]", "[$Equity$]", "[$StateSourceOfLoanFinancing$]", "[$Year$]", "[$Year 2$]",
							"[$Year 3$]", "[$NumberOfVisitorsExpectedAnnually$]",

//for the third one
							"[$Permanent$]", "[$Temporary$]", "[$ForeignPerTem$]", "[$LocalPerTem$]", "[$Payroll$]",
							"[$ProPermanent$]", "[$ProTemporary$]", "[$ProForeign$]", "[$ProLocal$]", "[$ProPayroll$]"

//for the forth one

//,"[$NameOfApplicant$]","[$Date$]","[$StatusOfApplicantRrelativeToProject$]"
							, "[$Signature$]", "[$Stamp$]", "[$CreateDate$]" }, new String[] {
									Validator.isNotNull(attractionFormFirst.getBonaAttractDateOfApplication())
											? dateFormat.format(attractionFormFirst.getBonaAttractDateOfApplication())
											: "",
									attractionFormFirst.getBonaTypeOfAttrcation(),
									attractionFormFirst.getBonaAttractPurposeOfIncentives(),
									attractionFormFirst.getBonaAttractionNameOfProperty(),
									attractionFormFirst.getBonaAttractionNameOfOwner(),
									attractionFormFirst.getBonaAttractionLocation(),
									attractionFormFirst.getBonaAttractionCompanyNumber(),
									attractionFormFirst.getBonaAttractionBusinessRegisNo(),
									Validator.isNotNull(attractionFormFirst.getBonaAttractionDateOfRegis())
											? dateFormat.format(attractionFormFirst.getBonaAttractionDateOfRegis())
											: "",
									attractionFormFirst.getBonaAttractionOwnerTrnNumber(),
									attractionFormFirst.getBonaAttractionTccNumber(),
									Validator.isNotNull(attractionFormFirst.getBonaAttractionExpiryDate())
											? dateFormat.format(attractionFormFirst.getBonaAttractionExpiryDate())
											: "",
									attractionFormFirst.getBonaAttractionNameOfOperator(),
									tourismBonaAttractionFormFirstAddress.getBonaAttractAddress(),
									attractionFormFirst.getBonaAttractionoperatorTrnNo(),
									attractionFormFirst.getBonattractionOperatorTccNO(),
									Validator.isNotNull(attractionFormFirst.getBonaAttractOperatorExpiryDate())
											? dateFormat.format(attractionFormFirst.getBonaAttractOperatorExpiryDate())
											: "",
									tourismBonaAttractionFormFirstAddress.getBonaAttractionTelephoneNo(),
									tourismBonaAttractionFormFirstAddress.getBonaAttractionFaxNumber(),
									tourismBonaAttractionFormFirstAddress.getBonaAttractionEmail(),
									attractionFormFirst.getBonaAttractContactPerson(),
									attractionFormFirst.getBonaAttractPositionHeld(),
									tourismBonaAttractionFormFirstAddress.getBonaAttractAddress(),
									tourismBonaAttractionFormFirstAddress.getBonaAttractionTelephoneNo(),
									tourismBonaAttractionFormFirstAddress.getBonaAttractionFaxNumber(),
									tourismBonaAttractionFormFirstAddress.getBonaAttractionEmail(),
									attractionFormFirst.getBonaAttractEntityId(),
									attractionFormFirst.getBonaAttractionBriefdescription(),

//								for thr seconf form
									bonaAttractionFormSecond.getBonaTargetMarketLocal(),
									bonaAttractionFormSecond.getBonaTargetMarketForeign(),
									bonaAttractionFormSecond.getBonaTargetMarketCountries(),
									bonaAttractionFormSecond.getBonaOwnerCountryOfOrigin(),
									bonaAttractionFormSecond.getBonaOwnerJointVenture(),
									bonaAttractionFormSecond.getBonaOwnerLocal(),
									bonaAttractionFormSecond.getBonaOwnerForeign(),
									bonaAttractionFormSecond.getBonaCapitalUSComponent(),
									bonaAttractionFormSecond.getBonaCapitalizationJEquivalent(),
									bonaAttractionFormSecond.getBonaCapitalRateOfExchange(),
									bonaAttractionFormSecond.getBonaCapitalizationJComponent(),
									bonaAttractionFormSecond.getBonaCapitalCapitalInvest(),
									bonaAttractionFormSecond.getBonaSourcesLoan(),
									bonaAttractionFormSecond.getBonaSourcesEquity(),
									bonaAttractionFormSecond.getBonaSourcesStateOfLoanFinanc(),
									bonaAttractionFormSecond.getBonaAnnualProjectedYearOne(),
									bonaAttractionFormSecond.getBonaAnnualProjectedYearTwo(),
									bonaAttractionFormSecond.getBonaAnnualProjectedYearThree(),
									bonaAttractionFormSecond.getBonaAnnualProjectedNumber(),

//								for the third one 
									attractionEmployeeInfo.getActualPermanent(),
									attractionEmployeeInfo.getActualTemporary(),
									attractionEmployeeInfo.getActualForeign(), attractionEmployeeInfo.getActualLocal(),
									attractionEmployeeInfo.getActualPayroll(),
									attractionEmployeeInfo.getProjectedPermanent(),
									attractionEmployeeInfo.getProjectedTemporary(),
									attractionEmployeeInfo.getProjectedForeign(),
									attractionEmployeeInfo.getProjectedLocal(),
									attractionEmployeeInfo.getProjectedPayroll(),

//								  for the forth one
//								  attractionSignInfo.getApplicantName(),
//								  Validator.isNotNull(attractionSignInfo.getSignDate())?dateFormat.format(attractionSignInfo.getSignDate()):"",
//								  attractionSignInfo.getApplicantStatus(),
									previewUrlforSignatureforBonaAttract, previewUrlforStampforBonaAttract,
									Validator.isNotNull(application.getCreateDate())
											? dateFormat.format(application.getCreateDate())
											: "" });

				} catch (Exception e) {
					e.printStackTrace();
				}
				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("fasle")) {
					String fileName = null;
					String title = null;
					String taxCompliance = null;
					String copyOf = null;

					for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
						fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
						if (title.equals("Tax Compliance Certificate")) {
							taxCompliance = fileName;
						} else if (title.equals("Copy of JTB Licence")) {
							copyOf = fileName;
						}
					}
					pdfTemplate = StringUtil.replace(pdfTemplate,
							new String[] { "[$TaxComplianceCertificate$]", "[$Copyof$]" },
							new String[] { taxCompliance, copyOf });
				}
			}

			else if (tourismApplication.getLicenseCategory().equals("Ground Transportation")) {
				if (tourismApplication.getLicenseSubCategory().equals("Contract Carriage")
						|| (tourismApplication.getLicenseSubCategory().equals("Domestic tour Company"))) {
					TourismBonaGroundTransportation bonaGroundTransportation = null;
					TourismBonaGroundTransportationAddress address = null;
					TourismApplicationPayment applicationPayment = null;
					List<TourismBonaGroundTransBox> bonaGroundTransBoxs = null;
					try {
						bonaGroundTransportation = TourismBonaGroundTransportationLocalServiceUtil
								.getTourismById(tourismApplicationId);
						bonaGroundTransBoxs = TourismBonaGroundTransBoxLocalServiceUtil
								.getTourismByid(tourismApplicationId);
						address = TourismBonaGroundTransportationAddressLocalServiceUtil
								.getTourismById(tourismApplicationId);
						applicationPayment = TourismApplicationPaymentLocalServiceUtil
								.getTourismApplicationPaymentbyTourismApplicationId(tourismApplicationId);
					} catch (Exception e) {
					}
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"tourism_ground-transportation");
					if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
						pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
								"tourism_groundtransportation_bonafide_all-categories");
					}
					try {
						pdfTemplate = StringUtil.replace(pdfTemplate,
								new String[] { "[$TypeOfGroundTransportation$]", "[$Name$]", "[$HomeAddress$]",
										"[$BusinessAddress$]", "[$LandlineNo$]", "[$MobileNo$]", "[$FaxNo$]",
										"[$Licensedwith$]", "[$JamaicaTouristBoardLicence$]",
										"[$HaveYouBenefittedBefore$]", "[$LastBenefit$]", "[$EntityType$]",

										"[$Make1$]", "[$Model1$]", "[$Year1$]", "[$Make2$]", "[$Model2$]", "[$Year2$]",
										"[$Make3$]", "[$Model3$]", "[$Year3$]", "[$Make4$]", "[$Model4$]", "[$Year4$]",
										"[$Make5$]", "[$Model5$]", "[$Year5$]"

										, "[$SeatingCapacity$]", "[$ExistingFleetAmount$]", "[$IndicateIfVehicleWill$]",

//           "[$Date$]",
										"[$PaymentMethod$]", "[$Signature$]", "[$CreateDate$]" },
								new String[] { bonaGroundTransportation.getTypeOfGroundTransportation(),
										bonaGroundTransportation.getBonaGroundName(), address.getBonaGroundAddress(),
										address.getBonaGroundAddress(),
										bonaGroundTransportation.getBonaGroundLandlineNo(),
										bonaGroundTransportation.getBonaGroundMobileNo(),
										bonaGroundTransportation.getBonaGroundFaxNo(),
										bonaGroundTransportation.getBonaGroundLicensedWith(),
										Validator.isNotNull(bonaGroundTransportation.getBonaGroundBoardExpiryDate())
												? dateFormat.format(
														bonaGroundTransportation.getBonaGroundBoardExpiryDate())
												: "",
										bonaGroundTransportation.getBonaGroundHaveYouBenefitBefore(),
										Validator.isNotNull(bonaGroundTransportation.getBonaGroundDateOfLastBenefit())
												? dateFormat.format(
														bonaGroundTransportation.getBonaGroundDateOfLastBenefit())
												: "",
										bonaGroundTransportation.getBonaGroundEntityType(),
										bonaGroundTransBoxs.size() > 0 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(0).getVehicleMakeBona()
												: "",
										bonaGroundTransBoxs.size() > 0 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(0).getVehiclemodelBona()
												: "",
										bonaGroundTransBoxs.size() > 0 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(0).getVehicleYearBona()
												: "",
										bonaGroundTransBoxs.size() > 1 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(1).getVehicleMakeBona()
												: "",
										bonaGroundTransBoxs.size() > 1 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(1).getVehiclemodelBona()
												: "",
										bonaGroundTransBoxs.size() > 1 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(1).getVehicleYearBona()
												: "",
										bonaGroundTransBoxs.size() > 2 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(2).getVehicleMakeBona()
												: "",
										bonaGroundTransBoxs.size() > 2 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(2).getVehiclemodelBona()
												: "",
										bonaGroundTransBoxs.size() > 2 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(2).getVehicleYearBona()
												: "",
										bonaGroundTransBoxs.size() > 3 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(3).getVehicleMakeBona()
												: "",
										bonaGroundTransBoxs.size() > 3 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(3).getVehiclemodelBona()
												: "",
										bonaGroundTransBoxs.size() > 3 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(3).getVehicleYearBona()
												: "",
										bonaGroundTransBoxs.size() > 4 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(4).getVehicleMakeBona()
												: "",
										bonaGroundTransBoxs.size() > 4 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(4).getVehiclemodelBona()
												: "",
										bonaGroundTransBoxs.size() > 4 && Validator.isNotNull(bonaGroundTransBoxs)
												? bonaGroundTransBoxs.get(4).getVehicleYearBona()
												: "",
										bonaGroundTransportation.getBonaGroundSeatingCapacity(),
										bonaGroundTransportation.getBonaGroundExistingFleetAmount(),
										bonaGroundTransportation.getBonaGroundIndicateVehicleWill(),
//								 date
										Validator.isNotNull(applicationPayment) ? applicationPayment.getPaymentMethod()
												: "",
										previewUrlforSignatureforBonaGround,
										Validator.isNotNull(bonaGroundTransportation.getCreateDate())
												? dateFormat.format(bonaGroundTransportation.getCreateDate())
												: "" });
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
						String fileName = null;
						String title = null;
						String coverLetter = null;
						String feeVouher = null;
						String jtbLicence = null;
						String tcc = null;
						String invoice = null;

						for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
							fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
							fileName = fileEntry.getFileName();
							title = fileEntry.getTitle();
							if (title.equals("Cover Letter/Membership Letter")) {
								coverLetter = fileName;
							} else if (title.equals("Fee Voucher")) {
								feeVouher = fileName;
							} else if (title.equals("JTB Licence")) {
								jtbLicence = fileName;
							} else if (title.equals("TCC")) {
								tcc = fileName;
							} else if (title.equals("Invoice with CIF Value Chassis Number")) {
								invoice = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate,
								new String[] { "[$CoverLetter$]", "[$FeeVoucher$]", "[$JTBLicence$]", "[$TCC$]",
										"[$InvoicewithCIF$]" },
								new String[] { coverLetter, feeVouher, jtbLicence, tcc, invoice });
					}
				}
				if (tourismApplication.getLicenseSubCategory().equals("Car Rental")) {
					TourismBonaGroundTransportatioCarRental bonaGroundTransportatioCarRental = null;
					TourismBonaGroundSignInfo bonaGroundSignInfo = null;
//				TourismApplicationPayment applicationPayment=null;
					List<TourismSummaryAddBox> summaryAddBoxs = null;
					try {
						bonaGroundTransportatioCarRental = TourismBonaGroundTransportatioCarRentalLocalServiceUtil
								.getTourismById(tourismApplicationId);
						System.out.println(
								"bonaGroundTransportatioCarRental+++++++++++" + bonaGroundTransportatioCarRental);
						bonaGroundSignInfo = TourismBonaGroundSignInfoLocalServiceUtil
								.getTourismById(tourismApplicationId);
						System.out.println("bonaGroundSignInfo+++++++++++" + bonaGroundSignInfo);
//			  applicationPayment=TourismApplicationPaymentLocalServiceUtil.getTourismApplicationPaymentbyTourismApplicationId(tourismApplicationId);
//			  System.out.println("applicationPayment+++++++++++"+applicationPayment);
						summaryAddBoxs = TourismSummaryAddBoxLocalServiceUtil.getTAP_TAI(tourismApplicationId);
						System.out.println("summaryAddBoxs+++++++++++" + summaryAddBoxs);
					} catch (Exception e) {
					}
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"tourism_groundtransportation_bonafide_car-rental");
					if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
						pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
								"tourism_groundtransportation_bonafide_car-rental-1");
					}
					try {
						pdfTemplate = StringUtil.replace(pdfTemplate,
								new String[] { "[$TypeOfGroundTransportation$]", "[$DateOfApplication$]",
										"[$NameOfCompany$]", "[$TradingName$]", "[$CompanyRegistrationNo$]",
										"[$TelephoneNo$]", "[$Address$]", "[$EmailAddress$]", "[$ContactPerson$]",
										"[$EntityType$]", "[$TCCNo$]", "[$ExpiryDate$]", "[$CopyAttached$]",
										"[$JTBLicense$]", "[$ExpiryDate$]", "[$CopyAttached$]", "[$TRNNo$]",
										"[$YearsinBusiness$]", "[$CopyOfCo.Reg.Attached$]", "[$ExistingFleetAmount$]",
										"[$HowmanywillBeAdditionToFleet$]", "[$TotalNumbersOfVehiclesBeing$]",
										"[$HowManyAreForReplacement$]"

										, "[$dealer$]", "[$vehicle$]", "[$year$]", "[$type$]", "[$rating$]",
										"[$dealer1$]", "[$vehicle1$]", "[$year1$]", "[$type1$]", "[$rating1$]",
										"[$dealer2$]", "[$vehicle2$]", "[$year2$]", "[$type2$]", "[$rating2$]",
										"[$dealer3$]", "[$vehicle3$]", "[$year3$]", "[$type3$]", "[$rating3$]",
										"[$dealer4$]", "[$vehicle4$]", "[$year4$]", "[$type4$]", "[$rating4$]",
										"[$Commentary$]", "[$Description$]", "[$NameofApplicant$]"
//         , "[$PaymentMethod$]"
										, "[$Signature$]", "[$Stamp$]", "[$CreateDate$]" },
								new String[] { bonaGroundTransportatioCarRental.getTypeOfGroundTransportation(),
										Validator.isNotNull(
												bonaGroundTransportatioCarRental.getBonaGroundDateOfApplication())
														? dateFormat.format(bonaGroundTransportatioCarRental
																.getBonaGroundDateOfApplication())
														: "",
										bonaGroundTransportatioCarRental.getBonaGroundNameOfCompany(),
										bonaGroundTransportatioCarRental.getBonaGroundTradingName(),
										bonaGroundTransportatioCarRental.getBonaGroundCompanyRegisNo(),
										bonaGroundTransportatioCarRental.getBonaGroundTelephonNo(),
										bonaGroundTransportatioCarRental.getBonaGroundAddress(),
										bonaGroundTransportatioCarRental.getBonaGroundEmailAddress(),
										bonaGroundTransportatioCarRental.getBonaGroundContactPerson(),
										bonaGroundTransportatioCarRental.getBonaGroundEntityType(),
										bonaGroundTransportatioCarRental.getBonaGroundTccNo(),
										Validator.isNotNull(bonaGroundTransportatioCarRental.getBonaGroundExpiryDate())
												? dateFormat.format(
														bonaGroundTransportatioCarRental.getBonaGroundExpiryDate())
												: "",
										bonaGroundTransportatioCarRental.getBonaGroundCopyAttached(),
										bonaGroundTransportatioCarRental.getBonaGroundJtbLicense(),
										Validator.isNotNull(
												bonaGroundTransportatioCarRental.getBonaGroundExpiryDateTwo())
														? dateFormat.format(bonaGroundTransportatioCarRental
																.getBonaGroundExpiryDateTwo())
														: "",
										bonaGroundTransportatioCarRental.getBonaGroundCopyAttachedTwo(),
										bonaGroundTransportatioCarRental.getBonaGroundTrnNo(),
										bonaGroundTransportatioCarRental.getBonaGroundYearInBusiness(),
										bonaGroundTransportatioCarRental.getBonaGroundCopyOfRegAttached(),
										bonaGroundTransportatioCarRental.getBonaGroundExistingFleetAmount(),
										bonaGroundTransportatioCarRental.getBonaGroundTotalVehicles(),
										bonaGroundTransportatioCarRental.getBonaGroundHowAdditionToFleet(),
										bonaGroundTransportatioCarRental.getBonaGroundReplacement(),
										summaryAddBoxs.size() > 0 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(0).getDealer()
												: "",
										summaryAddBoxs.size() > 0 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(0).getNumberOfvehicles()
												: "",
										summaryAddBoxs.size() > 0 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(0).getYear()
												: "",
										summaryAddBoxs.size() > 0 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(0).getType()
												: "",
										summaryAddBoxs.size() > 0 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(0).getCcRating()
												: "",
										summaryAddBoxs.size() > 1 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(1).getDealer()
												: "",
										summaryAddBoxs.size() > 1 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(1).getNumberOfvehicles()
												: "",
										summaryAddBoxs.size() > 1 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(1).getYear()
												: "",
										summaryAddBoxs.size() > 1 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(1).getType()
												: "",
										summaryAddBoxs.size() > 1 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(1).getCcRating()
												: "",
										summaryAddBoxs.size() > 2 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(2).getDealer()
												: "",
										summaryAddBoxs.size() > 2 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(2).getNumberOfvehicles()
												: "",
										summaryAddBoxs.size() > 2 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(2).getYear()
												: "",
										summaryAddBoxs.size() > 2 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(2).getType()
												: "",
										summaryAddBoxs.size() > 2 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(2).getCcRating()
												: "",
										summaryAddBoxs.size() > 3 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(3).getDealer()
												: "",
										summaryAddBoxs.size() > 3 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(3).getNumberOfvehicles()
												: "",
										summaryAddBoxs.size() > 3 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(3).getYear()
												: "",
										summaryAddBoxs.size() > 3 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(3).getType()
												: "",
										summaryAddBoxs.size() > 3 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(3).getCcRating()
												: "",
										summaryAddBoxs.size() > 4 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(4).getDealer()
												: "",
										summaryAddBoxs.size() > 4 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(4).getNumberOfvehicles()
												: "",
										summaryAddBoxs.size() > 4 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(4).getYear()
												: "",
										summaryAddBoxs.size() > 4 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(4).getType()
												: "",
										summaryAddBoxs.size() > 4 && Validator.isNotNull(summaryAddBoxs)
												? summaryAddBoxs.get(4).getCcRating()
												: "",
										bonaGroundTransportatioCarRental.getBonaGroundSummaryCommentary(),
										bonaGroundTransportatioCarRental.getBonaGroundDescription(),
//								for the second form
										bonaGroundSignInfo.getCarApplicantName(),
//								Validator.isNotNull(applicationPayment)?applicationPayment.getPaymentMethod():"",
										previewUrlSignatureForGroundCarRental, previewUrlStampForGroundCarRental,
										Validator.isNotNull(bonaGroundTransportatioCarRental.getCreateDate())
												? dateFormat.format(bonaGroundTransportatioCarRental.getCreateDate())
												: "" });

					} catch (Exception e) {
						e.printStackTrace();
					}
					if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
						String fileName = null;
						String coverLetter = null;
						String feeVouher = null;
						String title = null;
						String jtbLicence = null;
						String tcc = null;
						String invoice = null;

						for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
							fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
							fileName = fileEntry.getFileName();
							title = fileEntry.getTitle();
							if (title.equals("Cover Letter/Membership Letter")) {
								coverLetter = fileName;
							} else if (title.equals("Fee Voucher")) {
								feeVouher = fileName;
							} else if (title.equals("JTB Licence")) {
								jtbLicence = fileName;
							} else if (title.equals("TCC")) {
								tcc = fileName;
							} else if (title.equals("Invoice with CIF Value Chassis Number")) {
								invoice = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate,
								new String[] { "[$CoverLetter$]", "[$FeeVoucher$]", "[$JTBLicence$]", "[$TCC$]",
										"[$InvoicewithCIF$]" },
								new String[] { coverLetter, feeVouher, jtbLicence, tcc, invoice });
					}
				}
			}

			else if (tourismApplication.getLicenseCategory().equals("Water Sports")) {
				TourismBonaWaterSportsFormFirst bonaWaterSportsFormFirst = null;
				TourismBonaWaterSportsFormFirstAddress addressOfOperator = null;
				TourismBonaWaterSportsFormFirstAddress address = null;
				TourismBonaWaterSportsFormSecond bonaWaterSportsFormSecond = null;
				TourismBonaWaterSportEmployeeInfo bonaWaterSportEmployeeInfo = null;
				TourismBonaWaterSportSignInfo bonaWaterSportSignInfo = null;
				try {
					bonaWaterSportsFormFirst = TourismBonaWaterSportsFormFirstLocalServiceUtil
							.getTourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					addressOfOperator = TourismBonaWaterSportsFormFirstAddressLocalServiceUtil.getTB_Water_AT(
							"Address of Operator", bonaWaterSportsFormFirst.getTourismBonaWaterSFFirstId());
				}catch (Exception e) {
				}try {
					address = TourismBonaWaterSportsFormFirstAddressLocalServiceUtil.getTB_Water_AT("Address",
							bonaWaterSportsFormFirst.getTourismBonaWaterSFFirstId());
				}catch (Exception e) {
				}try {
					bonaWaterSportsFormSecond = TourismBonaWaterSportsFormSecondLocalServiceUtil
							.getTourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					bonaWaterSportEmployeeInfo = TourismBonaWaterSportEmployeeInfoLocalServiceUtil
							.getTourismById(tourismApplicationId);
				}catch (Exception e) {
				}try {
					bonaWaterSportSignInfo = TourismBonaWaterSportSignInfoLocalServiceUtil
							.getTourismById(tourismApplicationId);
				} catch (Exception e) {
				}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"tourism_watersports_bonafide");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"tourism_watersports_bonafide-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//								for the first form
							"[$TypeofAttraction$]", "[$PurposeofIncentives$]", "[$NameofWatersportsEntity$]",
							"[$NameofOwnerofCompany$]", "[$Location$]", "[$CompanyNo$]", "[$BusinessRegistrationNo$]",
							"[$DateOfRegistration$]", "[$Owner'sTRNNo.$]", "[$TCCNo$]", "[$Expirydate$]",
							"[$NameofOperator$]", "[$AddressOfOperator$]", "[$OperatorTRNNo$]", "[$TCC$]",
							"[$Expirydate$]", "[$TelephoneNo.$]", "[$OperatorFaxNo$]", "[$Email$]", "[$ContactPerson$]",
							"[$PositionHeld$]", "[$Address$]", "[$Telephoneno$]", "[$Faxno$]", "[$Email$]",
							"[$GiveabriefDescription$]",

//for the second form
							"[$Local$]", "[$Foreign$]", "[$Countries$]", "[$CountryOfOrigin$]", "[$JointVenture$]",
							"[$Local$]", "[$Foreign$]", "[$USComponent$]", "[$JEquivalent$]", "[$RateOfExchange$]",
							"[$JComponent$]", "[$TotalCapitalInvestment$]", "[$LoanJ$]", "[$Equity$]",
							"[$StateSourceOfLoanFinancing$]", "[$Year$]", "[$Year 2$]", "[$Year 3$]",
							"[$NumberOfVisitorsExpectedAnnually$]",

//for the third one
							"[$Permanent$]", "[$Temporary$]", "[$Foreign$]", "[$Local$]", "[$Payroll$]",
							"[$ProPermanent$]", "[$ProTemporary$]", "[$ProForeign$]", "[$ProLocal$]", "[$ProPayroll$]",

//for the forth one
							"[$NameOfApplicant$]", "[$Date$]", "[$StatusOfApplicantRrelativeToProject$]",
							"[$Signature$]", "[$Stamp$]", "[$CreateDate$]" }, new String[] {
//								for the first form
									bonaWaterSportsFormFirst.getBonaWaterTypeOfAttract(),
									bonaWaterSportsFormFirst.getBonaWaterPurposeOfIncentives(),
									bonaWaterSportsFormFirst.getBonaNameOfWatersportsEntity(),
									bonaWaterSportsFormFirst.getBonaWaterNameOfOwnerCompany(),
									bonaWaterSportsFormFirst.getBonaWaterLocation(),
									bonaWaterSportsFormFirst.getBonaWaterCompanyNo(),
									bonaWaterSportsFormFirst.getBonaWaterBusinessRegisNo(),
									Validator.isNotNull(bonaWaterSportsFormFirst.getBonaWaterDateOfRegistration())
											? dateFormat.format(
													bonaWaterSportsFormFirst.getBonaWaterDateOfRegistration())
											: "",
									bonaWaterSportsFormFirst.getBonaWaterOwnerTrnNo(),
									bonaWaterSportsFormFirst.getBonaWaterTccNo(),
									bonaWaterSportsFormFirst.getBonaWaterExpiryDate(),
									bonaWaterSportsFormFirst.getBonaWaterNameOfOperator(),
									addressOfOperator.getBonaWaterAddress(),
									bonaWaterSportsFormFirst.getBonaWaterOperatorTrnNo(),
									bonaWaterSportsFormFirst.getBonaWaterOperatorTccNo(),
									Validator.isNotNull(bonaWaterSportsFormFirst.getBonaWaterOperatorExpiryDate())
											? dateFormat.format(
													bonaWaterSportsFormFirst.getBonaWaterOperatorExpiryDate())
											: "",
									address.getBonaWaterTeleNo(), address.getBonaWaterFaxNo(),
									address.getBonaWaterEmail(), bonaWaterSportsFormFirst.getBonaWaterContactPerson(),
									bonaWaterSportsFormFirst.getBonaWaterPositionHeld(), address.getBonaWaterAddress(),
									address.getBonaWaterTeleNo(), address.getBonaWaterFaxNo(),
									address.getBonaWaterEmail(),
									bonaWaterSportsFormFirst.getBonaWaterbriefdescription(),

//								for the second form
									bonaWaterSportsFormSecond.getBonaTargetMarketLocal(),
									bonaWaterSportsFormSecond.getBonaTargetMarketForeign(),
									bonaWaterSportsFormSecond.getBonaTargetMarketCountries(),
									bonaWaterSportsFormSecond.getBonaOwnerCountryOfOrigin(),
									bonaWaterSportsFormSecond.getBonaOwnerJointVenture(),
									bonaWaterSportsFormSecond.getBonaOwnerLocal(),
									bonaWaterSportsFormSecond.getBonaOwnerForeign(),
									bonaWaterSportsFormSecond.getBonaCapitalizationUSComponent(),
									bonaWaterSportsFormSecond.getBonaCapitalizationJEquivalent(),
									bonaWaterSportsFormSecond.getBonaCapitalizationRateExchange(),
									bonaWaterSportsFormSecond.getBonaCapitalizationJComponent(),
									bonaWaterSportsFormSecond.getBonaCapitalCapitalInvest(),
									bonaWaterSportsFormSecond.getBonaSourcesLoan(),
									bonaWaterSportsFormSecond.getBonaSourcesEquity(),
									bonaWaterSportsFormSecond.getBonaSourcesStateOfFinanc(),
									bonaWaterSportsFormSecond.getBonaAnnualProjectedOne(),
									bonaWaterSportsFormSecond.getBonaAnnualProjectedTwo(),
									bonaWaterSportsFormSecond.getBonaAnnualProjectedThree(),
									bonaWaterSportsFormSecond.getBonaAnnualProjectedNumber(),

//								for the third one
									bonaWaterSportEmployeeInfo.getActualPermanent(),
									bonaWaterSportEmployeeInfo.getActualTemporary(),
									bonaWaterSportEmployeeInfo.getActualForeign(),
									bonaWaterSportEmployeeInfo.getActualLocal(),
									bonaWaterSportEmployeeInfo.getActualPayroll(),
									bonaWaterSportEmployeeInfo.getProjectedPermanent(),
									bonaWaterSportEmployeeInfo.getProjectedTemporary(),
									bonaWaterSportEmployeeInfo.getProjectedForeign(),
									bonaWaterSportEmployeeInfo.getProjectedLocal(),
									bonaWaterSportEmployeeInfo.getProjectedPayroll(),

//								for the forth one
									bonaWaterSportSignInfo.getApplicantName(),
									Validator.isNotNull(bonaWaterSportSignInfo.getSignDate())
											? dateFormat.format(bonaWaterSportSignInfo.getSignDate())
											: "",
									bonaWaterSportSignInfo.getSignApplicantStatus(),
									previewUrlforSignatureforWaterSports, previewUrlforStampforWaterSports,
									Validator.isNotNull(tourismApplication.getCreateDate())
											? dateFormat.format(tourismApplication.getCreateDate())
											: "" });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					String fileName = null;
					String title = null;
					String taxCompliance = null;
					String copyOf = null;

					for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
						fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
						if (title.equals("Tax Compliance Certificate")) {
							taxCompliance = fileName;
						} else if (title.equals("Copy of JTB Licence")) {
							copyOf = fileName;
						}
					}
					pdfTemplate = StringUtil.replace(pdfTemplate,
							new String[] { "[$TaxComlianceCertificate$]", "[$Copyof$]" },
							new String[] { taxCompliance, copyOf });
				}
			}
		}
		// TODO Auto-generated method stub
		return pdfTemplate;
	}

	@Override
	public List<DocumentMetaData> getFormsDocumentList(ThemeDisplay themeDisplay, long cannabisApplicationId,
			String folderName) {
		DLFolder supportingDocumentsParentFolder;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Cannabis Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(cannabisApplicationId));
			DLFolder supportingGenericDocumentsFolder = DLFolderLocalServiceUtil
					.getFolder(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), folderName);
			List<DLFileEntry> supportingGenDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingGenericDocumentsFolder.getFolderId());
			String title = "";
			FileEntry fileEntry = null;
			String fileUrl = "";
			String fileSize = "";
			String previewUrl = "";
			String fileName = "";
			long fileEntryId = 0;
			List<DocumentMetaData> documentMetaDatas = new ArrayList<DocumentMetaData>();
			for (DLFileEntry genricDocs : supportingGenDocFileEntries) {
				fileEntry = null;
				fileUrl = "";
				fileSize = "";
				previewUrl = "";
				fileName = "";
				title = "";
				fileEntryId = 0;
				fileEntry = DLAppLocalServiceUtil.getFileEntry(genricDocs.getFileEntryId());
				fileName = fileEntry.getFileName();
				fileEntryId = fileEntry.getFileEntryId();

				fileUrl = DLURLHelperUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				fileSize = HtmlUtil
						.escape(LanguageUtil.formatStorageSize(fileEntry.getSize(), themeDisplay.getLocale()));
				previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				title = fileEntry.getTitle();

				documentMetaDatas
						.add(new DocumentMetaData(title, fileUrl, fileSize, previewUrl, fileName, fileEntryId));
			}
			return documentMetaDatas;
		} catch (PortalException e) {
		}
		return null;

	}

	@Override
	public String replaceOsiPdfVar(long osiApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		OsiApplication application = null;
		DetailOfApplicant applicant = null;
		List<EducationalQualification> educationalQualifications = null;
		List<CounsellingExperience> counsellingExperiences = null;
		ProfessionalAffiliation affiliation = null;
		OfficialUse officialUse = null;
		try {
			application = OsiApplicationLocalServiceUtil.getOsiApplication(osiApplicationId);
		}catch (Exception e) {
		}try {
			applicant = DetailOfApplicantLocalServiceUtil.getOsiById(osiApplicationId);
		}catch (Exception e) {
		}try {
			educationalQualifications = EducationalQualificationLocalServiceUtil.getosiById(osiApplicationId);
		}catch (Exception e) {
		}try {
			counsellingExperiences = CounsellingExperienceLocalServiceUtil.getosiById(osiApplicationId);
		}catch (Exception e) {
		}try {
			affiliation = ProfessionalAffiliationLocalServiceUtil.getOsiById(osiApplicationId);
		}catch (Exception e) {
		}try {
			officialUse = OfficialUseLocalServiceUtil.getOsiById(osiApplicationId);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
					"osi-financial_counsellor_new_application-2");
		} else {
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
					"osi-financial_counsellor_new_application-1");
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate,
					new String[] { "[$FullName$]", "[$MiddleName$]", "[$LastName$]", "[$Address$]", "[$Email$]",
							"[$Telephone Number$]", "[$TRN$]", "[$ID Number$]", "[$DateofBirth$]", "[$Occupation$]",

//						for the second one
							"[$Institution1$]", "[$Qualification1$]", "[$Date1$]", "[$GradeAchieved1$]",
							"[$Institution2$]", "[$Qualification2$]", "[$Date2$]", "[$GradeAchieved2$]",
							"[$Institution3$]", "[$Qualification3$]", "[$Date3$]", "[$GradeAchieved3$]",
							"[$Institution4$]", "[$Qualification4$]", "[$Date4$]", "[$GradeAchieved4$]",
							"[$Institution5$]", "[$Qualification5$]", "[$Date5$]", "[$GradeAchieved5$]",

//						for the third one
							"[$Company1$]", "[$Position1$]", "[$Counselling1$]", "[$Length1$]", "[$Company2$]",
							"[$Position2$]", "[$Counselling2$]", "[$Length2$]", "[$Company3$]", "[$Position3$]",
							"[$Counselling3$]", "[$Length3$]", "[$Company4$]", "[$Position4$]", "[$Counselling4$]",
							"[$Length4$]", "[$Company5$]", "[$Position5$]", "[$Counselling5$]", "[$Length5$]",

//						for the PROFESSIONAL AFFILIATIONS
							"[$Date$]", "[$ProfessionalAffiliations$]"

//						for the OFFICIAL USE ONLY
							, "[$Received$]", "[$ReceivedDate$]", "[$Verified$]", "[$VerifiedDate$]",
							"[$ApplicationAccepted$]", "[$CertificateIssued$]", "[$CertificateNo$]", "[$Remarks$]",
							"[$Date$]"

					},

					new String[] {

							applicant.getApplicantName(), applicant.getApplicantMiddleName(),
							applicant.getApplicantLastName(), applicant.getApplicantAddress(),
							applicant.getApplicantEmail(), applicant.getApplicantTeleNum(), applicant.getApplicantTrn(),
							applicant.getApplicantIdNumber(),
							Validator.isNotNull(applicant.getCreateDate())
									? dateFormat.format(applicant.getCreateDate())
									: "",
							applicant.getApplicantOccupation(),

//						for the education qualification
							educationalQualifications.get(0).getInstitution(),
							educationalQualifications.get(0).getQualificationType(),
							Validator.isNotNull(educationalQualifications.get(0).getQualificationPeriod())
									? dateFormat.format(educationalQualifications.get(0).getQualificationPeriod())
									: "",
							educationalQualifications.get(0).getQualificationGrade(),
							educationalQualifications.size() > 1 && Validator.isNotNull(educationalQualifications)
									? educationalQualifications.get(1).getInstitution()
									: "",
							educationalQualifications.size() > 1 && Validator.isNotNull(educationalQualifications)
									? educationalQualifications.get(1).getQualificationType()
									: "",
							educationalQualifications.size() > 1
									&& Validator.isNotNull(educationalQualifications.get(1).getQualificationPeriod())
											? dateFormat
													.format(educationalQualifications.get(1).getQualificationPeriod())
											: "",
							educationalQualifications.size() > 1 && Validator.isNotNull(educationalQualifications)
									? educationalQualifications.get(1).getQualificationGrade()
									: "",
							educationalQualifications.size() > 2 && Validator.isNotNull(educationalQualifications)
									? educationalQualifications.get(2).getInstitution()
									: "",
							educationalQualifications.size() > 2 && Validator.isNotNull(educationalQualifications)
									? educationalQualifications.get(2).getQualificationType()
									: "",
							educationalQualifications.size() > 2
									&& Validator.isNotNull(educationalQualifications.get(2).getQualificationPeriod())
											? dateFormat
													.format(educationalQualifications.get(1).getQualificationPeriod())
											: "",
							educationalQualifications.size() > 2 && Validator.isNotNull(educationalQualifications)
									? educationalQualifications.get(2).getQualificationGrade()
									: "",
							educationalQualifications.size() > 3 && Validator.isNotNull(educationalQualifications)
									? educationalQualifications.get(3).getInstitution()
									: "",
							educationalQualifications.size() > 3 && Validator.isNotNull(educationalQualifications)
									? educationalQualifications.get(3).getQualificationType()
									: "",
							educationalQualifications.size() > 3
									&& Validator.isNotNull(educationalQualifications.get(3).getQualificationPeriod())
											? dateFormat
													.format(educationalQualifications.get(1).getQualificationPeriod())
											: "",
							educationalQualifications.size() > 3 && Validator.isNotNull(educationalQualifications)
									? educationalQualifications.get(3).getQualificationGrade()
									: "",
							educationalQualifications.size() > 4 && Validator.isNotNull(educationalQualifications)
									? educationalQualifications.get(4).getInstitution()
									: "",
							educationalQualifications.size() > 4 && Validator.isNotNull(educationalQualifications)
									? educationalQualifications.get(4).getQualificationType()
									: "",
							educationalQualifications.size() > 4
									&& Validator.isNotNull(educationalQualifications.get(4).getQualificationPeriod())
											? dateFormat
													.format(educationalQualifications.get(1).getQualificationPeriod())
											: "",
							educationalQualifications.size() > 4 && Validator.isNotNull(educationalQualifications)
									? educationalQualifications.get(4).getQualificationGrade()
									: "",

//						for the COUNSELLING EXPERIENCE

							counsellingExperiences.get(0).getCompany(), counsellingExperiences.get(0).getPosition(),
							counsellingExperiences.get(0).getCounsellingType(),
							counsellingExperiences.get(0).getServiceLength(),
							counsellingExperiences.size() > 1 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(1).getCompany()
									: "",
							counsellingExperiences.size() > 1 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(1).getPosition()
									: "",
							counsellingExperiences.size() > 1 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(1).getCounsellingType()
									: "",
							counsellingExperiences.size() > 1 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(1).getServiceLength()
									: "",
							counsellingExperiences.size() > 2 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(2).getCompany()
									: "",
							counsellingExperiences.size() > 2 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(2).getPosition()
									: "",
							counsellingExperiences.size() > 2 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(2).getCounsellingType()
									: "",
							counsellingExperiences.size() > 2 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(2).getServiceLength()
									: "",
							counsellingExperiences.size() > 3 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(3).getCompany()
									: "",
							counsellingExperiences.size() > 3 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(3).getPosition()
									: "",
							counsellingExperiences.size() > 3 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(3).getCounsellingType()
									: "",
							counsellingExperiences.size() > 3 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(3).getServiceLength()
									: "",
							counsellingExperiences.size() > 4 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(4).getCompany()
									: "",
							counsellingExperiences.size() > 4 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(4).getPosition()
									: "",
							counsellingExperiences.size() > 4 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(4).getCounsellingType()
									: "",
							counsellingExperiences.size() > 4 && Validator.isNotNull(counsellingExperiences)
									? counsellingExperiences.get(4).getServiceLength()
									: "",

//						for the professionalAffiliationId
							Validator.isNotNull(affiliation.getProfessionalAffiliationsDate())
									? dateFormat.format(affiliation.getProfessionalAffiliationsDate())
									: "",
							affiliation.getAffiliationMultivalue(),

//							for the OFFICIAL USE ONLY

							officialUse.getReceivedBy(),
							Validator.isNotNull(officialUse.getReceivedByDate())
									? dateFormat.format(officialUse.getReceivedByDate())
									: "",
							officialUse.getVerifiedBy(),
							Validator.isNotNull(officialUse.getVerifiedByDate())
									? dateFormat.format(officialUse.getVerifiedByDate())
									: "",
							officialUse.getApplicationAccepted(),
							Validator.isNotNull(officialUse.getDateCertificateIssued())
									? dateFormat.format(officialUse.getDateCertificateIssued())
									: "",
							officialUse.getCertificateNumber(), officialUse.getRemarksNotes(),
							Validator.isNotNull(application.getCreateDate())
									? dateFormat.format(application.getCreateDate())
									: "" });
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Osi Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(application.getOsiApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		try {
			String previewUrlInOsi = replaceSignature(application.getOsiApplicationId(), "Osi Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
			{
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$Signature$]" },
						new String[] { previewUrlInOsi });
				System.out.println("previewUrlInOsi************" + previewUrlInOsi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			String fileName = null;
			String title = null;
			String resume = null;
			String draftProposal = null;

			for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Resume")) {
					resume = fileName;
				} else if (title.equals("Draft Proposal")) {
					draftProposal = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//		for the document 
					"[$Resume$]", "[$DraftProposal$]" }, new String[] { resume, draftProposal });
		}
		return pdfTemplate;
	}

	@Override
	public String replaceOsiInsolvencyPdfVar(long OsiInsolvencyApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplication application = null;
		VerificationRequestorsInfo verRequestorInfo = null;
		SubjectData subjectData = null;
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		String previewUrlforSignatureInIndividual = null;
		String previewUrlforSignatureInCompany = null;
		try {
			application = OsiInsolvencyApplicationLocalServiceUtil
					.getOsiInsolvencyApplication(OsiInsolvencyApplicationId);
			verRequestorInfo = VerificationRequestorsInfoLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
			subjectData = SubjectDataLocalServiceUtil.getOsiInsolvencyById(OsiInsolvencyApplicationId);
		} catch (Exception e) {
		}
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Osi Insolvency Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(application.getOsiInsolvencyId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}

		try {
			previewUrlforSignatureInIndividual = replaceSigntureforOsiInsovencyInIndividual(
					application.getOsiInsolvencyId(), "Osi Insolvency Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			previewUrlforSignatureInCompany = replaceSigntureforOsiInsovencyInCompany(application.getOsiInsolvencyId(),
					"Osi Insolvency Supported Documents", themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		if (application.getApplicantStatus().equals("Application for an Insolvency Status Verification Report")) {
			if (application.getTypeOfApplicant().equals("Individual")) {
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "individual-2");
				} else {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "individual-2-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//								for the requestor information
							"[$Name$]", "[$LastName$]", "[$Occupation$]", "[$Address$]", "[$DateofRequest$]",
							"[$Telephone$]", "[$Email$]",
//								for the sunject data 
							"[$Title$]", "[$FirstName$]", "[$MiddleName$]", "[$Surname$]", "[$DateofBirth$]", "[$TRN$]",
							"[$TelephoneNo$]", "[$EmailId$]", "[$Date$]" }, new String[] {
//								for the requestor info
									verRequestorInfo.getVerRequestorName(), verRequestorInfo.getVerRequestorLastName(),
									verRequestorInfo.getVerRequestorOccupation(),
									verRequestorInfo.getVerRequestorAddress(),
									Validator.isNotNull(verRequestorInfo.getVerDateOfRequest())
											? dateFormat.format(verRequestorInfo.getVerDateOfRequest())
											: "",
									verRequestorInfo.getVerRequestorTelNum(), verRequestorInfo.getVerRequestorEmail(),

//								for the suject data 
									subjectData.getVerSubjectNameTitle(), subjectData.getVerSubjectFirstName(),
									subjectData.getVerSubjectMiddleName(), subjectData.getVerSubjectSurname(),
									Validator.isNotNull(subjectData.getVerSubjectDob())
											? dateFormat.format(subjectData.getVerSubjectDob())
											: "",
									subjectData.getVerSubjectTrn(), subjectData.getVerSubjectTelNum(),
									subjectData.getVerSubjectEmail(),
									Validator.isNotNull(application.getCreateDate())
											? dateFormat.format(application.getCreateDate())
											: "" });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					String fileName = null;
					String title = null;
					String resume = null;
					String draftProposal = null;
					for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
						fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
						if (title.equals("Resume")) {
							resume = fileName;
						} else if (title.equals("Draft Proposal")) {
							draftProposal = fileName;
						}
					}
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//					for the document 
							"[$Resume$]", "[$DraftProposal$]" }, new String[] { resume, draftProposal });
				}
			} else if (application.getTypeOfApplicant().equals("Company")) {
				VerificationCompanyInfo companyInfo = null;
				try {
					companyInfo = VerificationCompanyInfoLocalServiceUtil
							.getOsiInsolvencyById(OsiInsolvencyApplicationId);
				} catch (Exception e) {
				}
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "company-2");
				} else {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "company-2-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//								for the requestor information
							"[$FirstName$]", "[$LastName$]", "[$Occupation$]", "[$Address$]", "[$DateofRequest$]",
							"[$Telephone$]", "[$Email$]",
//								for the sunject data 
							"[$NameofCompany$]", "[$Registration$]", "[$Date$]" }, new String[] {
//								for the requestor info
									verRequestorInfo.getVerRequestorName(), verRequestorInfo.getVerRequestorLastName(),
									verRequestorInfo.getVerRequestorOccupation(),
									verRequestorInfo.getVerRequestorAddress(),
									Validator.isNotNull(verRequestorInfo.getVerDateOfRequest())
											? dateFormat.format(verRequestorInfo.getVerDateOfRequest())
											: "",
									verRequestorInfo.getVerRequestorTelNum(), verRequestorInfo.getVerRequestorEmail(),

//								for the suject data 
									companyInfo.getVerComName(), companyInfo.getVerComTrn(),
									Validator.isNotNull(application.getCreateDate())
											? dateFormat.format(application.getCreateDate())
											: "" });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("true")) {
					String fileName = null;
					String title = null;
					String resume = null;
					String draftProposal = null;
					for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
						fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
						if (title.equals("Resume")) {
							resume = fileName;
						} else if (title.equals("Draft Proposal")) {
							draftProposal = fileName;
						}
					}
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//					for the document 
							"[$Resume$]", "[$DraftProposal$]" }, new String[] { resume, draftProposal });
				}

			} else if (application.getTypeOfApplicant().equals("Real Estate Board")) {
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "real-estate-board-1");
				} else {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"real-estate-board-1-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//							for the requestor information
							"[$FirstName1$]", "[$LastName2$]", "[$Occupation$]", "[$Address$]", "[$DateofRequest$]",
							"[$Telephone$]", "[$Email$]",
//							for the sunject data 
							"[$Title$]", "[$FirstName$]", "[$MiddleName$]", "[$Surname$]", "[$DateofBirth$]",
							"[$PresentAddress$]", "[$PlaceofBirth$]", "[$TRN$]", "[$TelephoneNo$]", "[$EmailId$]",
							"[$Date$]" }, new String[] {
//							for the requestor info
									verRequestorInfo.getVerRequestorName(), verRequestorInfo.getVerRequestorLastName(),
									verRequestorInfo.getVerRequestorOccupation(),
									verRequestorInfo.getVerRequestorAddress(),
									Validator.isNotNull(verRequestorInfo.getVerDateOfRequest())
											? dateFormat.format(verRequestorInfo.getVerDateOfRequest())
											: "",
									verRequestorInfo.getVerRequestorTelNum(), verRequestorInfo.getVerRequestorEmail(),

//							for the suject data 
									subjectData.getVerSubjectNameTitle(), subjectData.getVerSubjectFirstName(),
									subjectData.getVerSubjectMiddleName(), subjectData.getVerSubjectSurname(),
									Validator.isNotNull(subjectData.getVerSubjectDob())
											? dateFormat.format(subjectData.getVerSubjectDob())
											: "",
									subjectData.getVerPresentAddress(), subjectData.getVerPlaceOfBirth(),
									subjectData.getVerSubjectTrn(), subjectData.getVerSubjectTelNum(),
									subjectData.getVerSubjectEmail(),
									Validator.isNotNull(application.getCreateDate())
											? dateFormat.format(application.getCreateDate())
											: "" });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					String fileName = null;
					String title = null;
					String resume = null;
					String draftProposal = null;
					for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
						fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
						if (title.equals("Resume")) {
							resume = fileName;
						} else if (title.equals("Draft Proposal")) {
							draftProposal = fileName;
						}
					}
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//				for the document 
							"[$Resume$]", "[$DraftProposal$]" }, new String[] { resume, draftProposal });
				}

			}
		} else if (application.getApplicantStatus().equals("Application for an Insolvency Assessment Report")) {
			if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "individual-3");
			} else {
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "individual-1");
			}
			if (application.getTypeOfApplicant().equals("Individual")) {
				AssessmentIndividualPersonalDetails assessmentIndividual = null;
				List<SecuredCreditor> creditor = null;
				GrandTotal grandTotal = null;
				List<PreferredCreditor> indiPrefered = null;
				List<UnsecuredCreditor> indiUnsecured = null;
				List<UsedSecurity> indiUsedSecurity = null;
				List<NotUsedSecurity> indiNotUsedSecurity = null;
				MonthlyIncome monthlyIncome = null;
				List<MonthlyExpenses> monthlyExpenses = null;
				FinancialPosition indiFinancialPos = null;
				OsiAssessmentSignature indiSignature = null;
				OsiIndiTotalDetailOfAssets totalDetailOfAsset = null;
				OsiTotalMonthlyExpense totalMonthlyExpense = null;
				try {
					assessmentIndividual = AssessmentIndividualPersonalDetailsLocalServiceUtil
							.getOsiById(OsiInsolvencyApplicationId);
				}catch (Exception e) {
				}try {
					creditor = SecuredCreditorLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
			}catch (Exception e) {
			}try {
					grandTotal = GrandTotalLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
			}catch (Exception e) {
			}try {
					indiPrefered = PreferredCreditorLocalServiceUtil.getCreditors(OsiInsolvencyApplicationId);
			}catch (Exception e) {
			}try {
					indiUnsecured = UnsecuredCreditorLocalServiceUtil.getCreditor(OsiInsolvencyApplicationId);
			}catch (Exception e) {
			}try {
					indiUsedSecurity = UsedSecurityLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
			}catch (Exception e) {
			}try {
					indiNotUsedSecurity = NotUsedSecurityLocalServiceUtil.getOsiByIdList(OsiInsolvencyApplicationId);
			}catch (Exception e) {
			}try {
					monthlyIncome = MonthlyIncomeLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
			}catch (Exception e) {
			}try {
					monthlyExpenses = MonthlyExpensesLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
			}catch (Exception e) {
			}try {
					indiFinancialPos = FinancialPositionLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
			}catch (Exception e) {
			}try {
					indiSignature = OsiAssessmentSignatureLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
			}catch (Exception e) {
			}try {
					totalDetailOfAsset = OsiIndiTotalDetailOfAssetsLocalServiceUtil
							.getOsiById(OsiInsolvencyApplicationId);
			}catch (Exception e) {
			}try {
					totalMonthlyExpense = OsiTotalMonthlyExpenseLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
				} catch (Exception e) {
				}

				String grandTotalValue = Validator.isNotNull(grandTotal) ? grandTotal.getGrandTotal() : "";
				String grandPreferredTotalMonthlyPayments = Validator.isNotNull(grandTotal)
						? grandTotal.getPreferredTotalMonthlyPayments()
						: "";
				String grandSecuredTotalMonthlyPayments = Validator.isNotNull(grandTotal)
						? grandTotal.getSecuredTotalMonthlyPayments()
						: "";
				String grandTotalUnsecuredLiabilities = Validator.isNotNull(grandTotal)
						? grandTotal.getTotalUnsecuredLiabilities()
						: "";
				String grandTotalSecuredLiabilities = Validator.isNotNull(grandTotal)
						? grandTotal.getTotalSecuredLiabilities()
						: "";
				String grandUnsecuredTotalMonthlyPayments = Validator.isNotNull(grandTotal)
						? grandTotal.getUnsecuredTotalMonthlyPayments()
						: "";
				String grandTotalPreferredLiabilities = Validator.isNotNull(grandTotal)
						? grandTotal.getTotalPreferredLiabilities()
						: "";

//				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "individual-1");
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//								for the Personal details
							"[$InitialContact$]", "[$Name$]", "[$Address$]", "[$Email$]", "[$Telephone$]", "[$TRN$]",
							"[$NIS$]", "[$Date of Birth$]", "[$Age$]", "[$Maeital$]", "[$Dependents$]", "[$Occupation$]"

//								for the Emergency Conta contact
							, "[$EName$]", "[$emailid$]", "[$TelephoneNo$]", "[$EAddress$]", "[$Employer$]"

//								for the Employe details
							, "[$DetailAddress$]", "[$EEmailid$]", "[$ETelephoneNo$]"

//								Details of Liabilities
							, "[$Creditors1$]", "[$Particulars1$]", "[$Liability1$]", "[$Payments1$]",
							"[$DateIncurred1$]", "[$Creditors2$]", "[$Particulars2$]", "[$Liability2$]",
							"[$Payments2$]", "[$DateIncurred2$]", "[$Creditors3$]", "[$Particulars3$]",
							"[$Liability3$]", "[$Payments3$]", "[$DateIncurred3$]", "[$Creditors4$]",
							"[$Particulars4$]", "[$Liability4$]", "[$Payments4$]", "[$DateIncurred4$]",
							"[$Creditors5$]", "[$Particulars5$]", "[$Liability5$]", "[$Payments5$]",
							"[$DateIncurred5$]",

							"[$TotalLiabilities$]", "[$TotalPayments$]"

							, "[$CreditorsN1$]", "[$ParticularsLiability1$]", "[$LiabilityA1$]", "[$MPayments1$]",
							"[$Incurred1$]", "[$CreditorsN2$]", "[$ParticularsLiability2$]", "[$LiabilityA2$]",
							"[$MPayments2$]", "[$Incurred2$]", "[$CreditorsN3$]", "[$ParticularsLiability3$]",
							"[$LiabilityA3$]", "[$MPayments3$]", "[$Incurred3$]", "[$CreditorsN4$]",
							"[$ParticularsLiability4$]", "[$LiabilityA4$]", "[$MPayments4$]", "[$Incurred4$]",
							"[$CreditorsN5$]", "[$ParticularsLiability5$]", "[$LiabilityA5$]", "[$MPayments5$]",
							"[$Incurred5$]", "[$TotalPreferred$]", "[$ToPayments$]",

							"[$CreditorsName1$]", "[$PartLiability1$]", "[$LiAmount1$]", "[$MonPayments1$]",
							"[$DIncurred1$]", "[$CreditorsName2$]", "[$PartLiability2$]", "[$LiAmount2$]",
							"[$MonPayments2$]", "[$DIncurred2$]", "[$CreditorsName3$]", "[$PartLiability3$]",
							"[$LiAmount3$]", "[$MonPayments3$]", "[$DIncurred3$]", "[$CreditorsName4$]",
							"[$PartLiability4$]", "[$LiAmount4$]", "[$MonPayments4$]", "[$DIncurred4$]",
							"[$CreditorsName5$]", "[$PartLiability5$]", "[$LiAmount5$]", "[$MonPayments5$]",
							"[$DIncurred5$]"

							, "[$TotalUnsecured$]", "[$MoPayments$]", "[$Grandtotal$]",

							// Details of Assets
							"[$Asset1$]", "[$Holder1$]", "[$Security1$]", "[$AsValue1$]", "[$AsLiablity1$]",
							"[$NetValue1$]", "[$Asset2$]", "[$Holder2$]", "[$Security2$]", "[$AsValue2$]",
							"[$AsLiablity2$]", "[$NetValue2$]", "[$Asset3$]", "[$Holder3$]", "[$Security3$]",
							"[$AsValue3$]", "[$AsLiablity3$]", "[$NetValue3$]", "[$Asset4$]", "[$Holder4$]",
							"[$Security4$]", "[$AsValue4$]", "[$AsLiablity4$]", "[$NetValue4$]", "[$Asset5$]",
							"[$Holder5$]", "[$Security5$]", "[$AsValue5$]", "[$AsLiablity5$]", "[$NetValue5$]",

							"[$TotalSecurity$]",

							// Details of Asset not used as Security
							"[$SecAsset1$]", "[$Location1$]", "[$Description1$]", "[$Secuvalue1$]", "[$SecAsset2$]",
							"[$Location2$]", "[$Description2$]", "[$Secuvalue2$]", "[$SecAsset3$]", "[$Location3$]",
							"[$Description3$]", "[$Secuvalue3$]", "[$SecAsset4$]", "[$Location4$]", "[$Description4$]",
							"[$Secuvalue4$]", "[$SecAsset5$]", "[$Location5$]", "[$Description5$]", "[$Secuvalue5$]",

							"[$TotalvalueSecurity$]",

							// Monthly Income
							"[$BasicSalary$]", "[$GrossSalary$]", "[$Statutory$]", "[$Deductions$]",
							"[$TotalDeduction$]", "[$NetSalary$]", "[$OtherIncome$]", "[$MonthlyExpenses$]",

							// Monthly Expenses
							"[$MoExpense1$]", "[$Light1$]", "[$Cable1$]", "[$Water1$]", "[$MonTelephone1$]",
							"[$MoExpense2$]", "[$Light2$]", "[$Cable2$]", "[$Water2$]", "[$MonTelephone2$]",
							"[$MoExpense3$]", "[$Light3$]", "[$Cable3$]", "[$Water3$]", "[$MonTelephone3$]",
							"[$MoExpense4$]", "[$Light4$]", "[$Cable4$]", "[$Water4$]", "[$MonTelephone4$]",
							"[$MoExpense5$]", "[$Light5$]", "[$Cable5$]", "[$Water5$]", "[$MonTelephone5$]",

							"[$Total$]",

							// Summary of Financial Position
							"[$TotalLiabilities$]", "[$ToUnsecured$]", "[$AmountPaid$]", "[$Deficit$]",
							"[$UsedasValue$]", "[$UsedasSecurity$]", "[$Disposable$]", "[$Surplus$]",
							"[$LeadingtoInsolvency$]", "[$Proposaltosettle$]", "[$ReportOfTrustee$]",

							// Signature
							"[$SignName$]", "[$Date$]", "[$Signature$]", "[$createDate$]" }, new String[] {
//						for the Personal details
									Validator.isNotNull(assessmentIndividual.getInitialDateContact())
											? dateFormat.format(assessmentIndividual.getInitialDateContact())
											: "",
									assessmentIndividual.getPersonalName(), assessmentIndividual.getPersonalAddress(),
									assessmentIndividual.getPersonalEmail(), assessmentIndividual.getPersonalTelNum(),
									assessmentIndividual.getPersonalTrn(), assessmentIndividual.getPersonalNis(),
									Validator.isNotNull(assessmentIndividual.getPersonalDob())
											? dateFormat.format(assessmentIndividual.getPersonalDob())
											: "",
									assessmentIndividual.getPersonalAge(),
									assessmentIndividual.getPersonalMaritalStatus(),
									assessmentIndividual.getPersonalDependents(),
									assessmentIndividual.getPersonalOccupation(),
									assessmentIndividual.getEmergencyName(), assessmentIndividual.getEmergencyEmail(),
									assessmentIndividual.getEmergencyTelNum(),
									assessmentIndividual.getEmergencyAddress(),
									assessmentIndividual.getEmergencyEmployer(),
									assessmentIndividual.getEmployerAddress(), assessmentIndividual.getEmployerEmail(),
									assessmentIndividual.getEmployerTelNum(),

//										for the Details of liabilities
									creditor.size() > 0 && Validator.isNotNull(creditor)
											? creditor.get(0).getSecuredCreditorName()
											: "",
									creditor.size() > 0 && Validator.isNotNull(creditor)
											? creditor.get(0).getSecuredCreditorAsset()
											: "",
									creditor.size() > 0 && Validator.isNotNull(creditor)
											? creditor.get(0).getSecuredCreditorLiability()
											: "",
									creditor.size() > 0 && Validator.isNotNull(creditor)
											? creditor.get(0).getSecuredCreditorPayment()
											: "",
									creditor.size() > 0 && Validator.isNotNull(creditor.get(0).getSecuredCreditorDate())
											? dateFormat.format(creditor.get(0).getSecuredCreditorDate())
											: "",
									creditor.size() > 1 && Validator.isNotNull(creditor)
											? creditor.get(1).getSecuredCreditorName()
											: "",
									creditor.size() > 1 && Validator.isNotNull(creditor)
											? creditor.get(1).getSecuredCreditorAsset()
											: "",
									creditor.size() > 1 && Validator.isNotNull(creditor)
											? creditor.get(1).getSecuredCreditorLiability()
											: "",
									creditor.size() > 1 && Validator.isNotNull(creditor)
											? creditor.get(1).getSecuredCreditorPayment()
											: "",
									creditor.size() > 1 && Validator.isNotNull(creditor.get(1).getSecuredCreditorDate())
											? dateFormat.format(creditor.get(1).getSecuredCreditorDate())
											: "",
									creditor.size() > 2 && Validator.isNotNull(creditor)
											? creditor.get(2).getSecuredCreditorName()
											: "",
									creditor.size() > 2 && Validator.isNotNull(creditor)
											? creditor.get(2).getSecuredCreditorAsset()
											: "",
									creditor.size() > 2 && Validator.isNotNull(creditor)
											? creditor.get(2).getSecuredCreditorLiability()
											: "",
									creditor.size() > 2 && Validator.isNotNull(creditor)
											? creditor.get(2).getSecuredCreditorPayment()
											: "",
									creditor.size() > 2 && Validator.isNotNull(creditor.get(2).getSecuredCreditorDate())
											? dateFormat.format(creditor.get(2).getSecuredCreditorDate())
											: "",
									creditor.size() > 3 && Validator.isNotNull(creditor)
											? creditor.get(3).getSecuredCreditorName()
											: "",
									creditor.size() > 3 && Validator.isNotNull(creditor)
											? creditor.get(3).getSecuredCreditorAsset()
											: "",
									creditor.size() > 3 && Validator.isNotNull(creditor)
											? creditor.get(3).getSecuredCreditorLiability()
											: "",
									creditor.size() > 3 && Validator.isNotNull(creditor)
											? creditor.get(3).getSecuredCreditorPayment()
											: "",
									creditor.size() > 3 && Validator.isNotNull(creditor.get(3).getSecuredCreditorDate())
											? dateFormat.format(creditor.get(3).getSecuredCreditorDate())
											: "",
									creditor.size() > 4 && Validator.isNotNull(creditor)
											? creditor.get(4).getSecuredCreditorName()
											: "",
									creditor.size() > 4 && Validator.isNotNull(creditor)
											? creditor.get(4).getSecuredCreditorAsset()
											: "",
									creditor.size() > 4 && Validator.isNotNull(creditor)
											? creditor.get(4).getSecuredCreditorLiability()
											: "",
									creditor.size() > 4 && Validator.isNotNull(creditor)
											? creditor.get(4).getSecuredCreditorPayment()
											: "",
									creditor.size() > 4 && Validator.isNotNull(creditor.get(4).getSecuredCreditorDate())
											? dateFormat.format(creditor.get(4).getSecuredCreditorDate())
											: "",
									grandTotalSecuredLiabilities, grandSecuredTotalMonthlyPayments,

									// for indi prefered cred-detail of liab
									Validator.isNotNull(indiPrefered) && indiPrefered.size() >= 0
											? indiPrefered.get(0).getPreferredCreditorName()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() >= 0
											? indiPrefered.get(0).getPreferredCreditorLiability()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() >= 0
											? indiPrefered.get(0).getPreferredCreditorAmount()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() >= 0
											? indiPrefered.get(0).getPreferredCreditorPayment()
											: "",
									indiPrefered.size() > 0
											&& Validator.isNotNull(indiPrefered.get(0).getPreferredCreditorDate())
													? dateFormat.format(indiPrefered.get(0).getPreferredCreditorDate())
													: "",

									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 1
											? indiPrefered.get(1).getPreferredCreditorName()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 1
											? indiPrefered.get(1).getPreferredCreditorLiability()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 1
											? indiPrefered.get(1).getPreferredCreditorAmount()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 1
											? indiPrefered.get(1).getPreferredCreditorPayment()
											: "",
									indiPrefered.size() > 1
											&& Validator.isNotNull(indiPrefered.get(1).getPreferredCreditorDate())
													? dateFormat.format(indiPrefered.get(1).getPreferredCreditorDate())
													: "",

									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 2
											? indiPrefered.get(2).getPreferredCreditorName()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 2
											? indiPrefered.get(2).getPreferredCreditorLiability()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 2
											? indiPrefered.get(2).getPreferredCreditorAmount()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 2
											? indiPrefered.get(2).getPreferredCreditorPayment()
											: "",
									indiPrefered.size() > 2
											&& Validator.isNotNull(indiPrefered.get(2).getPreferredCreditorDate())
													? dateFormat.format(indiPrefered.get(2).getPreferredCreditorDate())
													: "",

									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 3
											? indiPrefered.get(3).getPreferredCreditorName()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 3
											? indiPrefered.get(3).getPreferredCreditorLiability()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 3
											? indiPrefered.get(3).getPreferredCreditorAmount()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 3
											? indiPrefered.get(3).getPreferredCreditorPayment()
											: "",
									indiPrefered.size() > 3
											&& Validator.isNotNull(indiPrefered.get(3).getPreferredCreditorDate())
													? dateFormat.format(indiPrefered.get(3).getPreferredCreditorDate())
													: "",

									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 4
											? indiPrefered.get(4).getPreferredCreditorName()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 4
											? indiPrefered.get(4).getPreferredCreditorLiability()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 4
											? indiPrefered.get(4).getPreferredCreditorAmount()
											: "",
									Validator.isNotNull(indiPrefered) && indiPrefered.size() > 4
											? indiPrefered.get(4).getPreferredCreditorPayment()
											: "",
									indiPrefered.size() > 4
											&& Validator.isNotNull(indiPrefered.get(4).getPreferredCreditorDate())
													? dateFormat.format(indiPrefered.get(4).getPreferredCreditorDate())
													: "",
									grandTotalPreferredLiabilities, grandPreferredTotalMonthlyPayments,

									// for indi UnsecuredCreditor cred-detail of liab

									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() >= 0
											? indiUnsecured.get(0).getUnsecuredCreditorName()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() >= 0
											? indiUnsecured.get(0).getUnsecuredCreditorDebt()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() >= 0
											? indiUnsecured.get(0).getUnsecuredCreditorAmount()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() >= 0
											? indiUnsecured.get(0).getUnsecuredCreditorPayment()
											: "",
									indiUnsecured.size() > 0
											&& Validator.isNotNull(indiUnsecured.get(0).getUnsecuredCreditorDate())
													? dateFormat.format(indiUnsecured.get(0).getUnsecuredCreditorDate())
													: "",

									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 1
											? indiUnsecured.get(1).getUnsecuredCreditorName()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 1
											? indiUnsecured.get(1).getUnsecuredCreditorDebt()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 1
											? indiUnsecured.get(1).getUnsecuredCreditorAmount()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 1
											? indiUnsecured.get(1).getUnsecuredCreditorPayment()
											: "",
									indiUnsecured.size() > 1
											&& Validator.isNotNull(indiUnsecured.get(1).getUnsecuredCreditorDate())
													? dateFormat.format(indiUnsecured.get(1).getUnsecuredCreditorDate())
													: "",

									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 2
											? indiUnsecured.get(2).getUnsecuredCreditorName()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 2
											? indiUnsecured.get(2).getUnsecuredCreditorDebt()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 2
											? indiUnsecured.get(2).getUnsecuredCreditorAmount()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 2
											? indiUnsecured.get(2).getUnsecuredCreditorPayment()
											: "",
									indiUnsecured.size() > 2
											&& Validator.isNotNull(indiUnsecured.get(2).getUnsecuredCreditorDate())
													? dateFormat.format(indiUnsecured.get(2).getUnsecuredCreditorDate())
													: "",

									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 3
											? indiUnsecured.get(3).getUnsecuredCreditorName()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 3
											? indiUnsecured.get(3).getUnsecuredCreditorDebt()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 3
											? indiUnsecured.get(3).getUnsecuredCreditorAmount()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 3
											? indiUnsecured.get(3).getUnsecuredCreditorPayment()
											: "",
									indiUnsecured.size() > 3
											&& Validator.isNotNull(indiUnsecured.get(3).getUnsecuredCreditorDate())
													? dateFormat.format(indiUnsecured.get(3).getUnsecuredCreditorDate())
													: "",

									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 4
											? indiUnsecured.get(4).getUnsecuredCreditorName()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 4
											? indiUnsecured.get(4).getUnsecuredCreditorDebt()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 4
											? indiUnsecured.get(4).getUnsecuredCreditorAmount()
											: "",
									Validator.isNotNull(indiUnsecured) && indiUnsecured.size() > 4
											? indiUnsecured.get(4).getUnsecuredCreditorPayment()
											: "",
									indiUnsecured.size() > 4
											&& Validator.isNotNull(indiUnsecured.get(4).getUnsecuredCreditorDate())
													? dateFormat.format(indiUnsecured.get(3).getUnsecuredCreditorDate())
													: "",

									grandTotalUnsecuredLiabilities, grandUnsecuredTotalMonthlyPayments, grandTotalValue,

									// Details of Assets
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() >= 0
											? indiUsedSecurity.get(0).getAssetType()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() >= 0
											? indiUsedSecurity.get(0).getSecurityHolder()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() >= 0
											? indiUsedSecurity.get(0).getSecurityDetail()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() >= 0
											? indiUsedSecurity.get(0).getSecurityValue()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() >= 0
											? indiUsedSecurity.get(0).getSecurityLiability()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() >= 0
											? indiUsedSecurity.get(0).getSecurityNetValue()
											: "",

									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 1
											? indiUsedSecurity.get(1).getAssetType()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 1
											? indiUsedSecurity.get(1).getSecurityHolder()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 1
											? indiUsedSecurity.get(1).getSecurityDetail()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 1
											? indiUsedSecurity.get(1).getSecurityValue()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 1
											? indiUsedSecurity.get(1).getSecurityLiability()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 1
											? indiUsedSecurity.get(1).getSecurityNetValue()
											: "",

									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 2
											? indiUsedSecurity.get(2).getAssetType()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 2
											? indiUsedSecurity.get(2).getSecurityHolder()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 2
											? indiUsedSecurity.get(2).getSecurityDetail()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 2
											? indiUsedSecurity.get(2).getSecurityValue()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 2
											? indiUsedSecurity.get(2).getSecurityLiability()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 2
											? indiUsedSecurity.get(2).getSecurityNetValue()
											: "",

									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 3
											? indiUsedSecurity.get(3).getAssetType()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 3
											? indiUsedSecurity.get(3).getSecurityHolder()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 3
											? indiUsedSecurity.get(3).getSecurityDetail()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 3
											? indiUsedSecurity.get(3).getSecurityValue()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 3
											? indiUsedSecurity.get(3).getSecurityLiability()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 3
											? indiUsedSecurity.get(3).getSecurityNetValue()
											: "",

									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 4
											? indiUsedSecurity.get(4).getAssetType()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 4
											? indiUsedSecurity.get(4).getSecurityHolder()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 4
											? indiUsedSecurity.get(4).getSecurityDetail()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 4
											? indiUsedSecurity.get(4).getSecurityValue()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 4
											? indiUsedSecurity.get(4).getSecurityLiability()
											: "",
									Validator.isNotNull(indiUsedSecurity) && indiUsedSecurity.size() > 4
											? indiUsedSecurity.get(4).getSecurityNetValue()
											: "",

									Validator.isNotNull(totalDetailOfAsset)
											? totalDetailOfAsset.getTotalValueOfAssetUsedSecu()
											: "",

									// Details of Asset not used as Security
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() >= 0
											? indiNotUsedSecurity.get(0).getRealProperty()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() >= 0
											? indiNotUsedSecurity.get(0).getNotUsedLocation()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() >= 0
											? indiNotUsedSecurity.get(0).getNotUsedDescription()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() >= 0
											? indiNotUsedSecurity.get(0).getNotUsedValue()
											: "",

									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 1
											? indiNotUsedSecurity.get(1).getRealProperty()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 1
											? indiNotUsedSecurity.get(1).getNotUsedLocation()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 1
											? indiNotUsedSecurity.get(1).getNotUsedDescription()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 1
											? indiNotUsedSecurity.get(1).getNotUsedValue()
											: "",

									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 2
											? indiNotUsedSecurity.get(2).getRealProperty()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 2
											? indiNotUsedSecurity.get(2).getNotUsedLocation()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 2
											? indiNotUsedSecurity.get(2).getNotUsedDescription()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 2
											? indiNotUsedSecurity.get(2).getNotUsedValue()
											: "",

									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 3
											? indiNotUsedSecurity.get(3).getRealProperty()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 3
											? indiNotUsedSecurity.get(3).getNotUsedLocation()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 3
											? indiNotUsedSecurity.get(3).getNotUsedDescription()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 3
											? indiNotUsedSecurity.get(3).getNotUsedValue()
											: "",

									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 4
											? indiNotUsedSecurity.get(4).getRealProperty()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 4
											? indiNotUsedSecurity.get(4).getNotUsedLocation()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 4
											? indiNotUsedSecurity.get(4).getNotUsedDescription()
											: "",
									Validator.isNotNull(indiNotUsedSecurity) && indiNotUsedSecurity.size() > 4
											? indiNotUsedSecurity.get(4).getNotUsedValue()
											: "",

									totalDetailOfAsset.getTotalValueOfAssetNotUsedSecu(),

									// Monthly Income
									monthlyIncome.getBasicSalary(), monthlyIncome.getGrossSalary(),
									monthlyIncome.getStatutoryDeduction(), monthlyIncome.getLoanDeductions(),
									monthlyIncome.getTotalDeductions(), monthlyIncome.getNetSalary(),
									monthlyIncome.getOtherIncome(), monthlyIncome.getIncomeToCover(),

									// Monthly Expenses
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() >= 0
											? monthlyExpenses.get(0).getTypeOfExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() >= 0
											? monthlyExpenses.get(0).getLightExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() >= 0
											? monthlyExpenses.get(0).getCableExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() >= 0
											? monthlyExpenses.get(0).getWaterExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() >= 0
											? monthlyExpenses.get(0).getTelephoneExpense()
											: "",

									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 1
											? monthlyExpenses.get(1).getTypeOfExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 1
											? monthlyExpenses.get(1).getLightExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 1
											? monthlyExpenses.get(1).getCableExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 1
											? monthlyExpenses.get(1).getWaterExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 1
											? monthlyExpenses.get(1).getTelephoneExpense()
											: "",

									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 2
											? monthlyExpenses.get(2).getTypeOfExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 2
											? monthlyExpenses.get(2).getLightExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 2
											? monthlyExpenses.get(2).getCableExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 2
											? monthlyExpenses.get(2).getWaterExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 2
											? monthlyExpenses.get(2).getTelephoneExpense()
											: "",

									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 3
											? monthlyExpenses.get(3).getTypeOfExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 3
											? monthlyExpenses.get(3).getLightExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() >= 3
											? monthlyExpenses.get(3).getCableExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 3
											? monthlyExpenses.get(3).getWaterExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 3
											? monthlyExpenses.get(3).getTelephoneExpense()
											: "",

									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 4
											? monthlyExpenses.get(4).getTypeOfExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 4
											? monthlyExpenses.get(4).getLightExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 4
											? monthlyExpenses.get(4).getCableExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 4
											? monthlyExpenses.get(4).getWaterExpense()
											: "",
									Validator.isNotNull(monthlyExpenses) && monthlyExpenses.size() > 4
											? monthlyExpenses.get(4).getTelephoneExpense()
											: "",

									totalMonthlyExpense.getTotalExpense(),

									// Summary of Financial Position
									indiFinancialPos.getSecuredLiabilities(),
									indiFinancialPos.getUnsecuredLiabilities(), indiFinancialPos.getAmountLiabilities(),
									indiFinancialPos.getDeficitLiabilities(),
									indiFinancialPos.getAssestsUsedAsSecurity(),
									indiFinancialPos.getAssestsNotUsedAsSecurity(),
									indiFinancialPos.getAssestsDisposable(), indiFinancialPos.getAssestsSurplus(),
									indiFinancialPos.getAssestsSummary(), indiFinancialPos.getAssestsProposal(),
									indiFinancialPos.getAssestsTrusteeResponse(),

									// Signature
									indiSignature.getAssessSignName(), indiSignature.getAssessSignDate(),
									previewUrlforSignatureInIndividual,
									Validator.isNotNull(application) ? dateFormat.format(application.getCreateDate())
											: "",

					});
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					String fileName = null;
					String title = null;
					String personalData = null;
					String assets = null;
					String liabilities = null;
					String proofOfIncome = null;
					for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
						fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
						if (title.equals("Personal data")) {
							personalData = fileName;
						} else if (title.equals("Assets")) {
							assets = fileName;
						} else if (title.equals("Liabilities")) {
							liabilities = fileName;
						} else if (title.equals("Proof of income")) {
							proofOfIncome = fileName;
						}
					}
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
							/* for the document */
							"[$Personaldata$]", "[$Assets$]", "[$Liabilities$]", "[$Proofofincome$]" },
							new String[] { personalData, assets, liabilities, proofOfIncome });
				}

			} else if (application.getTypeOfApplicant().equals("Company")) {
				CompanyDetails companyDetails = null;
				List<DirectorsForm> directorsForm = null;
				List<ShareholdersHoldings> shareHoldings = null;
				List<CompanySecretary> companySecretary = null;
				List<CompanySecuredCreditor> companySecuredCreditor = null;
				List<CompanyUnsecuredCreditor> companyUnsecuredCreditor = null;
				OsiComTotalLiability totalLiability = null;
				List<AssetsUsedAsSecurity> assetsUsedAsSecurity = null;
				List<AssetsNotUsedAsSecurity> assetsNotUsedAsSecurity = null;
				CompanyFinancialPosition comFinancialPos = null;
				OsiAssessmentSignature comSignature = null;
				OsiComSecurityTotal comDetailOfAssets = null;

				try {
					companyDetails = CompanyDetailsLocalServiceUtil.getOsiInsolvencyById(OsiInsolvencyApplicationId);
				}catch (Exception e) {
				}try {
					directorsForm = DirectorsFormLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
				}catch (Exception e) {
				}try {
					shareHoldings = ShareholdersHoldingsLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
				}catch (Exception e) {
				}try {
					companySecretary = CompanySecretaryLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
				}catch (Exception e) {
				}try {
					companySecuredCreditor = CompanySecuredCreditorLocalServiceUtil
							.getOsiById(OsiInsolvencyApplicationId);
				}catch (Exception e) {
				}try {
					companyUnsecuredCreditor = CompanyUnsecuredCreditorLocalServiceUtil
							.getOsiById(OsiInsolvencyApplicationId);
				}catch (Exception e) {
				}try {
					assetsUsedAsSecurity = AssetsUsedAsSecurityLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
				}catch (Exception e) {
				}try {
					assetsNotUsedAsSecurity = AssetsNotUsedAsSecurityLocalServiceUtil
							.getOsiById(OsiInsolvencyApplicationId);
				}catch (Exception e) {
				}try {
					comFinancialPos = CompanyFinancialPositionLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
				}catch (Exception e) {
				}try {
					comSignature = OsiAssessmentSignatureLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
				}catch (Exception e) {
				}try {
					totalLiability = OsiComTotalLiabilityLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
				}catch (Exception e) {
				}try {
					comDetailOfAssets = OsiComSecurityTotalLocalServiceUtil.getOsiById(OsiInsolvencyApplicationId);
				} catch (Exception e) {
					LOGGER.error("Error*********" + e.getMessage());
					LOGGER.error("Cause*********" + e.getCause());
				}
				String comSecurityTotal = Validator.isNotNull(comDetailOfAssets)
						? comDetailOfAssets.getComSecuritTotal()
						: "";
				String comSecurityTotalValue = Validator.isNotNull(comDetailOfAssets)
						? comDetailOfAssets.getComSecuritTotalValue()
						: "";
				String comAssetTotal = Validator.isNotNull(comDetailOfAssets) ? comDetailOfAssets.getComAssetTotal()
						: "";
				String companySecured = Validator.isNotNull(comFinancialPos) ? comFinancialPos.getCompanySecured() : "";
				String totalLiabilityValue = Validator.isNotNull(totalLiability) ? totalLiability.getTotalLiability()
						: "";
				String comUnSecured = Validator.isNotNull(comFinancialPos) ? comFinancialPos.getCompanyUnsecured() : "";
				String comAmount = Validator.isNotNull(comFinancialPos) ? comFinancialPos.getCompanyAmount() : "";
				String comDeficit = Validator.isNotNull(comFinancialPos) ? comFinancialPos.getCompanyDeficit() : "";
				String comNetValue = Validator.isNotNull(comFinancialPos) ? comFinancialPos.getCompanyNetValue() : "";
				String comAssetValue = Validator.isNotNull(comFinancialPos) ? comFinancialPos.getCompanyAssetValue()
						: "";
				String comDisposableAsset = Validator.isNotNull(comFinancialPos)
						? comFinancialPos.getCompanyDisposableAsset()
						: "";
				String comCompanySurplus = Validator.isNotNull(comFinancialPos) ? comFinancialPos.getCompanySurplus()
						: "";
				String comCompanySummary = Validator.isNotNull(comFinancialPos) ? comFinancialPos.getCompanySummary()
						: "";
				String comCompanyProposal = Validator.isNotNull(comFinancialPos) ? comFinancialPos.getCompanyProposal()
						: "";
				String comCompanyTrusteeResponse = Validator.isNotNull(comFinancialPos)
						? comFinancialPos.getCompanyTrusteeResponse()
						: "";
				String signName = Validator.isNotNull(comSignature) ? comSignature.getAssessSignName() : "";
				String signNameDate = Validator.isNotNull(comSignature) ? comSignature.getAssessSignDate() : "";

				/*
				 * comFinancialPos.getCompanyDeficit(), comFinancialPos.getCompanyNetValue(),
				 * comFinancialPos.getCompanyAssetValue(),
				 * comFinancialPos.getCompanyDisposableAsset(),
				 * comFinancialPos.getCompanySurplus(), comFinancialPos.getCompanySummary(),
				 * comFinancialPos.getCompanyProposal(),
				 * comFinancialPos.getCompanyTrusteeResponse()
				 */
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "company-3");
				} else {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(), "company-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//							for the Company Details
							"[$ComDate$]", "[$CompanyName$]", "[$RegisteredAddress$]", "[$Email$]", "[$Telephone$]",
							"[$TRN$]", "[$Incorporation$]", "[$TypeofCo$]", "[$CoreBusiness$]", "[$NoofEmployess$]",
							"[$DateFiled$]", "[$AnnualTurnover$]", "[$NoofShares$]"

//							for Directors 
							, "[$ParName1$]", "[$Appointed1$]", "[$ParOccupation1$]", "[$ContactNo1$]",
							"[$ParAddress1$]", "[$ParName2$]", "[$Appointed2$]", "[$ParOccupation2$]", "[$ContactNo2$]",
							"[$ParAddress2$]", "[$ParName3$]", "[$Appointed3$]", "[$ParOccupation3$]", "[$ContactNo3$]",
							"[$ParAddress3$]", "[$ParName4$]", "[$Appointed4$]", "[$ParOccupation4$]", "[$ContactNo4$]",
							"[$ParAddress4$]", "[$ParName5$]", "[$Appointed5$]", "[$ParOccupation5$]", "[$ContactNo5$]",
							"[$ParAddress5$]"

//							for Shareholders & Holdings
							, "[$ShareName1$]", "[$Appointed1$]", "[$Occupation1$]", "[$ofShares1$]",
							"[$ShareAddress1$]", "[$ShareName2$]", "[$Appointed2$]", "[$Occupation2$]", "[$ofShares2$]",
							"[$ShareAddress2$]", "[$ShareName3$]", "[$Appointed3$]", "[$Occupation3$]", "[$ofShares3$]",
							"[$ShareAddress3$]", "[$ShareName4$]", "[$Appointed4$]", "[$Occupation4$]", "[$ofShares4$]",
							"[$ShareAddress4$]", "[$ShareName5$]", "[$Appointed5$]", "[$Occupation5$]", "[$ofShares5$]",
							"[$ShareAddress5$]"

//							Company Secretary
							, "[$ComName1$]", "[$ComAppointed1$]", "[$ComOccupation1$]", "[$ComContactNo1$]",
							"[$ComAddress1$]", "[$ComName2$]", "[$ComAppointed2$]", "[$ComOccupation2$]",
							"[$ComContactNo2$]", "[$ComAddress2$]", "[$ComName3$]", "[$ComAppointed3$]",
							"[$ComOccupation3$]", "[$ComContactNo3$]", "[$ComAddress3$]", "[$ComName4$]",
							"[$ComAppointed4$]", "[$ComOccupation4$]", "[$ComContactNo4$]", "[$ComAddress4$]",
							"[$ComName5$]", "[$ComAppointed5$]", "[$ComOccupation5$]", "[$ComContactNo5$]",
							"[$ComAddress5$]"

//							Secured Creditors
							, "[$Creditor1$]", "[$Guarantor1$]", "[$Particulars1$]", "[$Liability1$]", "[$Creditor2$]",
							"[$Guarantor2$]", "[$Particulars2$]", "[$Liability2$]", "[$Creditor3$]", "[$Guarantor3$]",
							"[$Particulars3$]", "[$Liability3$]", "[$Creditor4$]", "[$Guarantor4$]", "[$Particulars4$]",
							"[$Liability4$]", "[$Creditor5$]", "[$Guarantor5$]", "[$Particulars5$]", "[$Liability5$]"

//							Unsecured Creditors
							, "[$UnCreditor1$]", "[$Debtor1$]", "[$Purpose1$]", "[$UnLiability1$]", "[$UnCreditor2$]",
							"[$Debtor2$]", "[$Purpose2$]", "[$UnLiability2$]", "[$UnCreditor3$]", "[$Debtor3$]",
							"[$Purpose3$]", "[$UnLiability3$]", "[$UnCreditor4$]", "[$Debtor4$]", "[$Purpose4$]",
							"[$UnLiability4$]", "[$UnCreditor5$]", "[$Debtor5$]", "[$Purpose5$]", "[$UnLiability5$]"

							, "[$TotalLiability$]"

//							Asset used as Security
							, "[$Asset1$]", "[$Holder1$]", "[$Security1$]", "[$AsValue1$]", "[$AsLiablity1$]",
							"[$NetValue1$]", "[$Asset2$]", "[$Holder2$]", "[$Security2$]", "[$AsValue2$]",
							"[$AsLiablity2$]", "[$NetValue2$]", "[$Asset3$]", "[$Holder3$]", "[$Security3$]",
							"[$AsValue3$]", "[$AsLiablity3$]", "[$NetValue3$]", "[$Asset4$]", "[$Holder4$]",
							"[$Security4$]", "[$AsValue4$]", "[$AsLiablity4$]", "[$NetValue4$]", "[$Asset5$]",
							"[$Holder5$]", "[$Security5$]", "[$AsValue5$]", "[$AsLiablity5$]", "[$NetValue5$]"

							, "[$TotalUsedAsSec$]"

//							Asset not used as Security
							, "[$SecAsset1$]", "[$AsValue1$]", "[$Description1$]", "[$SecAsset2$]", "[$AsValue2$]",
							"[$Description2$]", "[$SecAsset3$]", "[$AsValue3$]", "[$Description3$]", "[$SecAsset4$]",
							"[$AsValue4$]", "[$Description4$]", "[$SecAsset5$]", "[$AsValue5$]", "[$Description5$]"

							, "[$TotalNotUsedAsSec$]", "[$TotalofAssets$]"

//							Summary of Financial Position
							, "[$TotalLiabilities$]", "[$ToUnsecured$]", "[$AmountPaid$]", "[$Deficit$]",
							"[$UsedasValue$]", "[$UsedasSecurity$]", "[$Disposable$]", "[$Surplus$]",
							"[$LeadingtoInsolvency$]", "[$Proposaltosettle$]", "[$ReportOfTrustee$]"

//							Signature
							, "[$SignName$]", "[$Date$]", "[$Signature$]", "[$createDate$]"

					}, new String[] {
							// company details
							Validator.isNotNull(companyDetails.getCompanyDate())
									? dateFormat.format(companyDetails.getCompanyDate())
									: "",
							companyDetails.getCompanyName(), companyDetails.getCompanyAddress(),
							companyDetails.getCompanyEmail(), companyDetails.getCompanyTelNum(),
							companyDetails.getCompanyTrn(),
							Validator.isNotNull(companyDetails.getCompanyDateInco())
									? dateFormat.format(companyDetails.getCompanyDateInco())
									: "",
							companyDetails.getCompanyTypeOfCo(), companyDetails.getCompanyCore(),
							companyDetails.getCompanyEmployees(),
							Validator.isNotNull(companyDetails.getCompanyLastReturn())
									? dateFormat.format(companyDetails.getCompanyLastReturn())
									: "",
							companyDetails.getCompanyTurnover(), companyDetails.getCompanyShares(),

//							for Directors 
							Validator.isNotNull(directorsForm) && directorsForm.size() > 0
									? directorsForm.get(0).getDirectorsName()
									: "",
							directorsForm.size() > 0
									&& Validator.isNotNull(directorsForm.get(0).getDirectorsDateAppointed())
											? dateFormat.format(directorsForm.get(0).getDirectorsDateAppointed())
											: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 0
									? directorsForm.get(0).getDirectorsOccupation()
									: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 0
									? directorsForm.get(0).getDirectorsContactNum()
									: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 0
									? directorsForm.get(0).getDirectorsAddress()
									: "",

							Validator.isNotNull(directorsForm) && directorsForm.size() > 1
									? directorsForm.get(1).getDirectorsName()
									: "",
							directorsForm.size() > 1
									&& Validator.isNotNull(directorsForm.get(1).getDirectorsDateAppointed())
											? dateFormat.format(directorsForm.get(1).getDirectorsDateAppointed())
											: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 1
									? directorsForm.get(1).getDirectorsOccupation()
									: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 1
									? directorsForm.get(1).getDirectorsContactNum()
									: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 1
									? directorsForm.get(1).getDirectorsAddress()
									: "",

							Validator.isNotNull(directorsForm) && directorsForm.size() > 2
									? directorsForm.get(2).getDirectorsName()
									: "",
							directorsForm.size() > 2
									&& Validator.isNotNull(directorsForm.get(2).getDirectorsDateAppointed())
											? dateFormat.format(directorsForm.get(2).getDirectorsDateAppointed())
											: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 2
									? directorsForm.get(2).getDirectorsOccupation()
									: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 2
									? directorsForm.get(2).getDirectorsContactNum()
									: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 2
									? directorsForm.get(2).getDirectorsAddress()
									: "",

							Validator.isNotNull(directorsForm) && directorsForm.size() > 3
									? directorsForm.get(3).getDirectorsName()
									: "",
							directorsForm.size() > 3
									&& Validator.isNotNull(directorsForm.get(3).getDirectorsDateAppointed())
											? dateFormat.format(directorsForm.get(3).getDirectorsDateAppointed())
											: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 3
									? directorsForm.get(3).getDirectorsOccupation()
									: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 3
									? directorsForm.get(3).getDirectorsContactNum()
									: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 3
									? directorsForm.get(3).getDirectorsAddress()
									: "",

							Validator.isNotNull(directorsForm) && directorsForm.size() > 4
									? directorsForm.get(4).getDirectorsName()
									: "",
							directorsForm.size() > 4
									&& Validator.isNotNull(directorsForm.get(4).getDirectorsDateAppointed())
											? dateFormat.format(directorsForm.get(4).getDirectorsDateAppointed())
											: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 4
									? directorsForm.get(4).getDirectorsOccupation()
									: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 4
									? directorsForm.get(4).getDirectorsContactNum()
									: "",
							Validator.isNotNull(directorsForm) && directorsForm.size() > 4
									? directorsForm.get(4).getDirectorsAddress()
									: "",

//									for Shareholders & Holdings	
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 0
									? shareHoldings.get(0).getShareholderName()
									: "",
							shareHoldings.size() > 0 && Validator.isNotNull(shareHoldings.get(0).getShareholderDate())
									? dateFormat.format(shareHoldings.get(0).getShareholderDate())
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 0
									? shareHoldings.get(0).getShareholderOccupation()
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 0
									? shareHoldings.get(0).getShareholderShares()
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 0
									? shareHoldings.get(0).getShareholderAddress()
									: "",

							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 1
									? shareHoldings.get(1).getShareholderName()
									: "",
							shareHoldings.size() > 1 && Validator.isNotNull(shareHoldings.get(1).getShareholderDate())
									? dateFormat.format(shareHoldings.get(1).getShareholderDate())
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 1
									? shareHoldings.get(1).getShareholderOccupation()
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 1
									? shareHoldings.get(1).getShareholderShares()
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 1
									? shareHoldings.get(1).getShareholderAddress()
									: "",

							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 2
									? shareHoldings.get(2).getShareholderName()
									: "",
							shareHoldings.size() > 2 && Validator.isNotNull(shareHoldings.get(2).getShareholderDate())
									? dateFormat.format(shareHoldings.get(2).getShareholderDate())
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 2
									? shareHoldings.get(2).getShareholderOccupation()
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 2
									? shareHoldings.get(2).getShareholderShares()
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 2
									? shareHoldings.get(2).getShareholderAddress()
									: "",

							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 3
									? shareHoldings.get(3).getShareholderName()
									: "",
							shareHoldings.size() > 3 && Validator.isNotNull(shareHoldings.get(3).getShareholderDate())
									? dateFormat.format(shareHoldings.get(3).getShareholderDate())
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 3
									? shareHoldings.get(3).getShareholderOccupation()
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 3
									? shareHoldings.get(3).getShareholderShares()
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 3
									? shareHoldings.get(3).getShareholderAddress()
									: "",

							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 4
									? shareHoldings.get(4).getShareholderName()
									: "",
							shareHoldings.size() > 4 && Validator.isNotNull(shareHoldings.get(4).getShareholderDate())
									? dateFormat.format(shareHoldings.get(4).getShareholderDate())
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 4
									? shareHoldings.get(4).getShareholderOccupation()
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 4
									? shareHoldings.get(4).getShareholderShares()
									: "",
							Validator.isNotNull(shareHoldings) && shareHoldings.size() > 4
									? shareHoldings.get(4).getShareholderAddress()
									: "",

//									Company Secretary
							Validator.isNotNull(companySecretary) && companySecretary.size() > 0
									? companySecretary.get(0).getSecretaryName()
									: "",
							companySecretary.size() > 0
									&& Validator.isNotNull(companySecretary.get(0).getSecretaryDate())
											? dateFormat.format(companySecretary.get(0).getSecretaryDate())
											: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 0
									? companySecretary.get(0).getSecretaryOccupation()
									: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 0
									? companySecretary.get(0).getSecretaryContactNum()
									: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 0
									? companySecretary.get(0).getSecretaryAddress()
									: "",

							Validator.isNotNull(companySecretary) && companySecretary.size() > 1
									? companySecretary.get(1).getSecretaryName()
									: "",
							companySecretary.size() > 1
									&& Validator.isNotNull(companySecretary.get(1).getSecretaryDate())
											? dateFormat.format(companySecretary.get(1).getSecretaryDate())
											: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 1
									? companySecretary.get(1).getSecretaryOccupation()
									: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 1
									? companySecretary.get(1).getSecretaryContactNum()
									: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 1
									? companySecretary.get(1).getSecretaryAddress()
									: "",

							Validator.isNotNull(companySecretary) && companySecretary.size() > 2
									? companySecretary.get(2).getSecretaryName()
									: "",
							companySecretary.size() > 2
									&& Validator.isNotNull(companySecretary.get(2).getSecretaryDate())
											? dateFormat.format(companySecretary.get(2).getSecretaryDate())
											: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 2
									? companySecretary.get(2).getSecretaryOccupation()
									: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 2
									? companySecretary.get(2).getSecretaryContactNum()
									: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 2
									? companySecretary.get(2).getSecretaryAddress()
									: "",

							Validator.isNotNull(companySecretary) && companySecretary.size() > 3
									? companySecretary.get(3).getSecretaryName()
									: "",
							companySecretary.size() > 3
									&& Validator.isNotNull(companySecretary.get(3).getSecretaryDate())
											? dateFormat.format(companySecretary.get(3).getSecretaryDate())
											: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 3
									? companySecretary.get(3).getSecretaryOccupation()
									: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 3
									? companySecretary.get(3).getSecretaryContactNum()
									: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 3
									? companySecretary.get(3).getSecretaryAddress()
									: "",

							Validator.isNotNull(companySecretary) && companySecretary.size() > 4
									? companySecretary.get(4).getSecretaryName()
									: "",
							companySecretary.size() > 4
									&& Validator.isNotNull(companySecretary.get(4).getSecretaryDate())
											? dateFormat.format(companySecretary.get(4).getSecretaryDate())
											: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 4
									? companySecretary.get(4).getSecretaryOccupation()
									: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 4
									? companySecretary.get(4).getSecretaryContactNum()
									: "",
							Validator.isNotNull(companySecretary) && companySecretary.size() > 4
									? companySecretary.get(4).getSecretaryAddress()
									: "",

//									Secured Creditors
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 0
									? companySecuredCreditor.get(0).getSecuredCreditor()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 0
									? companySecuredCreditor.get(0).getSecuredSecurity()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 0
									? companySecuredCreditor.get(0).getSecuredPurpose()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 0
									? companySecuredCreditor.get(0).getSecuredLiabilty()
									: "",

							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 1
									? companySecuredCreditor.get(1).getSecuredCreditor()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 1
									? companySecuredCreditor.get(1).getSecuredSecurity()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 1
									? companySecuredCreditor.get(1).getSecuredPurpose()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 1
									? companySecuredCreditor.get(1).getSecuredLiabilty()
									: "",

							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 2
									? companySecuredCreditor.get(2).getSecuredCreditor()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 2
									? companySecuredCreditor.get(2).getSecuredSecurity()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 2
									? companySecuredCreditor.get(2).getSecuredPurpose()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 2
									? companySecuredCreditor.get(2).getSecuredLiabilty()
									: "",

							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 3
									? companySecuredCreditor.get(3).getSecuredCreditor()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 3
									? companySecuredCreditor.get(3).getSecuredSecurity()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 3
									? companySecuredCreditor.get(3).getSecuredPurpose()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 3
									? companySecuredCreditor.get(3).getSecuredLiabilty()
									: "",

							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 4
									? companySecuredCreditor.get(4).getSecuredCreditor()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 4
									? companySecuredCreditor.get(4).getSecuredSecurity()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 4
									? companySecuredCreditor.get(4).getSecuredPurpose()
									: "",
							Validator.isNotNull(companySecuredCreditor) && companySecuredCreditor.size() > 4
									? companySecuredCreditor.get(4).getSecuredLiabilty()
									: "",

//									Unsecured Creditors	
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 0
									? companyUnsecuredCreditor.get(0).getUnsecuredCreditor()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 0
									? companyUnsecuredCreditor.get(0).getUnsecuredDebtor()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 0
									? companyUnsecuredCreditor.get(0).getUnsecuredPurpose()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 0
									? companyUnsecuredCreditor.get(0).getUnsecuredLiabilty()
									: "",

							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 1
									? companyUnsecuredCreditor.get(1).getUnsecuredCreditor()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 1
									? companyUnsecuredCreditor.get(1).getUnsecuredDebtor()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 1
									? companyUnsecuredCreditor.get(1).getUnsecuredPurpose()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 1
									? companyUnsecuredCreditor.get(1).getUnsecuredLiabilty()
									: "",

							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 2
									? companyUnsecuredCreditor.get(2).getUnsecuredCreditor()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 2
									? companyUnsecuredCreditor.get(2).getUnsecuredDebtor()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 2
									? companyUnsecuredCreditor.get(2).getUnsecuredPurpose()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 2
									? companyUnsecuredCreditor.get(2).getUnsecuredLiabilty()
									: "",

							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 3
									? companyUnsecuredCreditor.get(3).getUnsecuredCreditor()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 3
									? companyUnsecuredCreditor.get(3).getUnsecuredDebtor()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 3
									? companyUnsecuredCreditor.get(3).getUnsecuredPurpose()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 3
									? companyUnsecuredCreditor.get(3).getUnsecuredLiabilty()
									: "",

							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 4
									? companyUnsecuredCreditor.get(4).getUnsecuredCreditor()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 4
									? companyUnsecuredCreditor.get(4).getUnsecuredDebtor()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 4
									? companyUnsecuredCreditor.get(4).getUnsecuredPurpose()
									: "",
							Validator.isNotNull(companyUnsecuredCreditor) && companyUnsecuredCreditor.size() > 4
									? companyUnsecuredCreditor.get(4).getUnsecuredLiabilty()
									: "",

							totalLiabilityValue,
//									Asset used as Security
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 0
									? assetsUsedAsSecurity.get(0).getAssetSecurity()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 0
									? assetsUsedAsSecurity.get(0).getAssetSecurityHolder()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 0
									? assetsUsedAsSecurity.get(0).getAssetDetails()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 0
									? assetsUsedAsSecurity.get(0).getAssetValue()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 0
									? assetsUsedAsSecurity.get(0).getAssetLiability()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 0
									? assetsUsedAsSecurity.get(0).getAssetNetValue()
									: "",

							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 1
									? assetsUsedAsSecurity.get(1).getAssetSecurity()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 1
									? assetsUsedAsSecurity.get(1).getAssetSecurityHolder()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 1
									? assetsUsedAsSecurity.get(1).getAssetDetails()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 1
									? assetsUsedAsSecurity.get(1).getAssetValue()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 1
									? assetsUsedAsSecurity.get(1).getAssetLiability()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 1
									? assetsUsedAsSecurity.get(1).getAssetNetValue()
									: "",

							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 2
									? assetsUsedAsSecurity.get(2).getAssetSecurity()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 2
									? assetsUsedAsSecurity.get(2).getAssetSecurityHolder()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 2
									? assetsUsedAsSecurity.get(2).getAssetDetails()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 2
									? assetsUsedAsSecurity.get(2).getAssetValue()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 2
									? assetsUsedAsSecurity.get(2).getAssetLiability()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 2
									? assetsUsedAsSecurity.get(2).getAssetNetValue()
									: "",

							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 3
									? assetsUsedAsSecurity.get(3).getAssetSecurity()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 3
									? assetsUsedAsSecurity.get(3).getAssetSecurityHolder()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 3
									? assetsUsedAsSecurity.get(3).getAssetDetails()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 3
									? assetsUsedAsSecurity.get(3).getAssetValue()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 3
									? assetsUsedAsSecurity.get(3).getAssetLiability()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 3
									? assetsUsedAsSecurity.get(3).getAssetNetValue()
									: "",

							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 4
									? assetsUsedAsSecurity.get(4).getAssetSecurity()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 4
									? assetsUsedAsSecurity.get(4).getAssetSecurityHolder()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 4
									? assetsUsedAsSecurity.get(4).getAssetDetails()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 4
									? assetsUsedAsSecurity.get(4).getAssetValue()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 4
									? assetsUsedAsSecurity.get(4).getAssetLiability()
									: "",
							Validator.isNotNull(assetsUsedAsSecurity) && assetsUsedAsSecurity.size() > 4
									? assetsUsedAsSecurity.get(4).getAssetNetValue()
									: "",

							comSecurityTotal,

//									Asset not used as Security	
							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 0
									? assetsNotUsedAsSecurity.get(0).getAssetRealProp()
									: "",
							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 0
									? assetsNotUsedAsSecurity.get(0).getAssetNoValue()
									: "",
							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 0
									? assetsNotUsedAsSecurity.get(0).getAssetDescription()
									: "",

							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 1
									? assetsNotUsedAsSecurity.get(1).getAssetRealProp()
									: "",
							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 1
									? assetsNotUsedAsSecurity.get(1).getAssetNoValue()
									: "",
							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 1
									? assetsNotUsedAsSecurity.get(1).getAssetDescription()
									: "",

							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 2
									? assetsNotUsedAsSecurity.get(2).getAssetRealProp()
									: "",
							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 2
									? assetsNotUsedAsSecurity.get(2).getAssetNoValue()
									: "",
							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 2
									? assetsNotUsedAsSecurity.get(2).getAssetDescription()
									: "",

							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 3
									? assetsNotUsedAsSecurity.get(3).getAssetRealProp()
									: "",
							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 3
									? assetsNotUsedAsSecurity.get(3).getAssetNoValue()
									: "",
							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 3
									? assetsNotUsedAsSecurity.get(3).getAssetDescription()
									: "",

							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 4
									? assetsNotUsedAsSecurity.get(4).getAssetRealProp()
									: "",
							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 4
									? assetsNotUsedAsSecurity.get(4).getAssetNoValue()
									: "",
							Validator.isNotNull(assetsNotUsedAsSecurity) && assetsNotUsedAsSecurity.size() > 4
									? assetsNotUsedAsSecurity.get(4).getAssetDescription()
									: "",

							comAssetTotal, comSecurityTotalValue,

//									Summary of Financial Position
							companySecured, comUnSecured, comAmount, comDeficit, comNetValue, comAssetValue,
							comDisposableAsset, comCompanySurplus, comCompanySummary, comCompanyProposal,
							comCompanyTrusteeResponse,

//									Signature
							signName, signNameDate, previewUrlforSignatureInCompany,
							Validator.isNotNull(application) ? dateFormat.format(application.getCreateDate()) : ""

					});
				} catch (Exception e) {
					LOGGER.error("Error***********" + e.getMessage());
					LOGGER.error("Cause***********" + e.getCause());
				}

				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("fasle")) {
					String fileName = null;
					String title = null;
					String personalData = null;
					String assets = null;
					String liabilities = null;
					String proofOfIncome = null;
					for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
						fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
						if (title.equals("Personal data")) {
							personalData = fileName;
						} else if (title.equals("Assets")) {
							assets = fileName;
						} else if (title.equals("Liabilities")) {
							liabilities = fileName;
						} else if (title.equals("Proof of income")) {
							proofOfIncome = fileName;
						}
					}
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
							// for the document
							"[$ComPersonaldata$]", "[$ComAssets$]", "[$ComLiabilities$]", "[$ComProofofincome$]" },
							new String[] { personalData, assets, liabilities, proofOfIncome });
				}

			}
		}

		return pdfTemplate;
	}

	@Override
	public String replaceCannabisPdfVarForCompany(long cannabisApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		CannabisApplications cannabisApplications = CannabisApplicationsLocalServiceUtil
				.getCannabisApplications(cannabisApplicationId);
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		DLFolder supportingDocumentsParentFolder = null;
		DLFolder supportingDocumentsFolder = null;
		try {
			List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Cannabis Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(cannabisApplications.getCannabisApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		String pdfTemplate = StringPool.BLANK;
		String previewUrlforAutorizationBackground = null;
		String previewUrlforSupplymentInfoSignature = null;
		try {
			previewUrlforAutorizationBackground = replaceSignatureforCannabis(
					cannabisApplications.getCannabisApplicationId(), "Cannabis Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
			e.printStackTrace();

		}
		try {
			previewUrlforSupplymentInfoSignature = replaceSignatureforSupplimentInfo(
					cannabisApplications.getCannabisApplicationId(), "Cannabis Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (cannabisApplications.getTypeOfEntity().equals("Company")
				|| cannabisApplications.getTypeOfEntity().equals("Cooperative")) {
			if (cannabisApplications.getLicenseCategory().equals("Cultivator Licence")) {
				CannabisApplicationCompanyInfo applicationCompanyInfo = null;
				CannabisApplicationCompanyAddress cannabisApplicationRegisteredCompanyAddress = null;
				CannabisApplicationCompanyAddress cannabisApplicationMailingCompanyAddress = null;
				CannabisApplicationCompanyAuthorizedAgent cannabisApplicationCompanyAuthorizedAgent = null;
				List<GeneralDelarations> generalDelarations = null;
				List<StatementOfFinancialHistory> financialHistories = null;
				List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners = null;
				List<CannabisSupplementalInformation> cannabisSupplementalInformations = null;
				CannabisConsentByPropertyOwner cannabisConsentByPropertyOwners = null;
				CannabisApplicationPayment cannabisPayment = null;
				List<CannabisOccupationaLicense> occupationaLicenses = null;
				List<com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnership> declarationOfOwnerships = null;
				try {
					applicationCompanyInfo = CannabisApplicationCompanyInfoLocalServiceUtil
							.getCA_CI_by_AppId(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisApplicationRegisteredCompanyAddress = CannabisApplicationCompanyAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.REGISTERED_ADDRESS,
									applicationCompanyInfo.getCompanyInformationId());
				}catch (Exception e) {
				}try {
					cannabisApplicationMailingCompanyAddress = CannabisApplicationCompanyAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.MAILING_ADDRESS,
									applicationCompanyInfo.getCompanyInformationId());
				}catch (Exception e) {
				}try {
					cannabisApplicationCompanyAuthorizedAgent = CannabisApplicationCompanyAuthorizedAgentLocalServiceUtil
							.getCAA_by_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					generalDelarations = GeneralDelarationsLocalServiceUtil.getCA_GD_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					financialHistories = StatementOfFinancialHistoryLocalServiceUtil
							.getSOFH_by_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisConsentBySoleOwners = CannabisConsentBySoleOwnerLocalServiceUtil
							.getCA_CSO_BY_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisSupplementalInformations = CannabisSupplementalInformationLocalServiceUtil
							.getCA_SI_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisConsentByPropertyOwners = CannabisConsentByPropertyOwnerLocalServiceUtil
							.getCA_CPO_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					occupationaLicenses = CannabisOccupationaLicenseLocalServiceUtil
							.getCA_OL_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					declarationOfOwnerships = CannabisDeclarationOfOwnershipLocalServiceUtil
							.getCA_DO_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
						cannabisPayment = CannabisApplicationPaymentLocalServiceUtil
								.getCannabisApplicationPaymentByCannabisAppId(cannabisApplicationId);
					} catch (Exception e) {
					}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"cannabis_application_company_cultivator_form");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"cannabis_application_company_cultivator_form-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate,
							new String[] { "[$AFCL_LicenseCategory$]", "[$ThisIsYourFirstTimeApplying$]",
									"[$AFCL_NAMEOFCOMPANYBUSINESSCOOPERATIVE$]", "[$AFCL_StreetApt$]",
									"[$AFCL_TownCity$]", "[$AFCL_Parish$]", "[$AFCL_MAILINGADDRESSStreetApt$]",
									"[$AFCL_MAILINGADDRESSTownCity$]", "[$AFCL_MAILINGADDRESSParish$]", "[$AFCL_TRN$]",
									"[$AFCL_TYPEOFCOMPANYBUSINESS$]", "[$EnterOtherCompany$]",
									"[$AFCL_REGISTRATIONNUMBER$]", "[$AFCL_ContactNumbers$]", "[$AFCL_EmailAddress$]",
									"[$AFCL_AuthorizedAgentSurname$]", "[$AFCL_AuthorizedAgentFirstName$]",
									"[$AFCL_AuthorizedAgentMiddleName$]", "[$AFCL_AuthorizedAgentPosition$]",
									"[$AFCL_AuthorizedAgentGender$]", "[$AFCL_AuthorizedAgentDateofBirth$]",
									"[$AFCL_AuthorizedAgentContactNumbers$]", "[$AFCL_AuthorizedAgentEmailAdresse$]",
//for the general Delarations				
									"[$UnderTheAgeOfEighteen$]", "[$PropertyOwner$]",
									"[$IsRegisteredOrUnregisteredIfTitleOwnerOrNot$]", "[$OnlyTitleOwnerIfRegistered$]",
									"[$IfNotOnlyOwner$]", "[$OwnerNameIfRegistered$]",
									"[$DeclarentNameIfUnRegistered$]", "[$LicensedMotorVehicle$]",
									"[$LicenceToHandleGanja$]", "[$StateJurisdiction$]", "[$TypeOfLicense$]",
									"[$LicenseStatus$]", "[$AppliedForGamingOrRacingLicence$]", "$StateJurisdiction$]",
									"[$TypeOfLicense$]", "[$LicenseStatus$]", "[$ConvictedOfAnyCrime$]",
									"[$TypeOfCrime$]", "[$LocationOfYourProperty$]", "[$BeneficialOwnerOfTheCompany$]",
									"[$RelatedEntitiesIfApplicable$]",
//for the STATEMENT OF FINANCIAL HISTORY		
									"[$TaxLiabilitiesDueToAnyGovernmental$]", "[$YourParentCompanyOrAnyRelatedEntity$]",
									"[$BusinessTrustInstrument$]", "[$FinancialOrTradeRegulationEver$]",
									"[$ComplainantOrRespondentOrOtherFashion$]",
									"[$FinancialStatementsAuditedOrUnaudited$]", "[$AFCL_ApplicantSURNAME$]",
									"[$AFCL_ApplicantFIRSTNAME$]", "[$Signature1$]", "[$AFCL_ApplicantSURNAME$]",
									"[$AFCL_ApplicantFIRSTNAME$]",
//for the cultivator 
									"[$AFCL_Acreageoftheproperty$]",
									"[$AFCL_Whatistheanticipatedcropyieldkgacreperharvest$]",
									"[$AFCL_Howlongiseachcropexpectedtotaketoharvest$]",
									"[$AFCL_Whattypeofganjawillyoubegrowing$]", "[$AFCL_Howwillthecropbegrown$]",
									"[$PleaseSpecify$]", "[$AFCL_ForWhatTypeofUseAreYouCultivatingv2$]",
									"[$AFCL_Doyouhaveabuyerorhaveyoustarteddiscussionswithanenti$]",
									"[$PleaseIndicateNameOfPersonOrCompany$]"

//for the Consent Property Owners
									, "[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantFIRSTNAME$]", "[$TypeOfProperty$]",
									"[$DescriptionOfProperty$]", "[$DescriptionOfIntendedUseOfPropertyToCannabis$]",
									" [$ApplicantSURNAME$]", " [$ApplicantFIRSTNAME$]", "[$ApplicantSURNAME$]",
									"[$ApplicantFIRSTNAME$]",

//									for the sole owner 
									"[$OwnerName1$]", "[$OwnerDate1$]", "[$OwnerPhone1$]", "[$OwnerAddress1$]",
									"[OwnerName2$]", "[$OwnerDate2$]", "[$OwnerPhone2$]", "[$OwnerAddress2$]",
									"[$OwnerName3$]", "[$OwnerDate3$]", "[$OwnerPhone3$]", "[$OwnerAddress3$]",
									"[$OwnerName4$]", "[$OwnerDate4$]", "[$OwnerPhone4$]", "[$OwnerAddress4$]",
									"[$OwnerName5$]", "[$OwnerDate5$]", "[$OwnerPhone5$]", "[$OwnerAddress5$]",
//								for the ocuupational licence 
									"[$First1$]", "[$Middle1$]", "[$Surname1$]", "[$Position1$]", "[$Managment1$]",
									"[$Director1$]", "[$TRN1$]", "[$Birth1$]", "[$IDNumber1$]", "[$TypeID1$]",
									"[$First2$]", "[$Middle2$]", "[$Surname2$]", "[$Position2$]", "[$Managment2$]",
									"[$Director2$]", "[$TRN2$]", "[$Birth2$]", "[$IDNumber2$]", "[$TypeID2$]",
									"[$First3$]", "[$Middle3$]", "[$Surname3$]", "[$Position3$]", "[$Managment3$]",
									"[$Director3$]", "[$TRN3$]", "[$Birth3$]", "[$IDNumber3$]", "[$TypeID3$]",
									"[$First4$]", "[$Middle4$]", "[$Surname4$]", "[$Position4$]", "[$Managment4$]",
									"[$Director4$]", "[$TRN4$]", "[$Birth4$]", "[$IDNumber4$]", "[$TypeID4$]",
									"[$First5$]", "[$Middle5$]", "[$Surname5$]", "[$Position5$]", "[$Managment5$]",
									"[$Director5$]", "[$TRN5$]", "[$Birth5$]", "[$IDNumber5$]", "[$TypeID5$]",
//	for the declaration of ownerShip
									"[$DeFirst1$]", "[$DeMiddle1$]", "[$DeSurname1$]", "[$DePosition1$]",
									"[De$Ownership1$]", "[$DeCitizenship1$]", "[$DeTRN1$]", "[$DateofBirth1$]",
									"[$DeID1$]", "[$DeType1$]", "[$DeFirst2$]", "[$DeMiddle2$]", "[$DeSurname2$]",
									"[$DePosition2$]", "[$DeOwnership2$]", "[$DeCitizenship2$]", "[$DeTRN2$]",
									"[$DateofBirth2$]", "[$DeID2$]", "[$DeType2$]", "[$DeFirst3$]", "[$DeMiddle3$]",
									"[$DeSurname3$]", "[$DePosition3$]", "[$DeOwnership3$]", "[$DeCitizenship3$]",
									"[$DeTRN3$]", "[$DateofBirth3$]", "[$DeID3$]", "[$DeType3$]", "[$DeFirst4$]",
									"[$DeMiddle4$]", "[$DeSurname4$]", "[$DePosition4$]", "[$DeOwnership4$]",
									"[$DeCitizenship4$]", "[$DeTRN4$]", "[$DateofBirth4$]", "[$DeID4$]", "[$DeType4$]",
									"[$DeFirst5$]", "[$DeMiddle5$]", "[$DeSurname5$]", "[$DePosition5$]",
									"[$DeOwnership5$]", "[$DeCitizenship5$]", "[$DeTRN5$]", "[$DateofBirth5$]",
									"[$DeID5$]", "[$DeType5$]", "[$PaymentMethod$]", "[$Signature2$]", "[$Date$]", },

							new String[] { cannabisApplications.getLicenseCategory(),
									cannabisApplications.getRequestType(), applicationCompanyInfo.getCompanyName(),
									cannabisApplicationRegisteredCompanyAddress.getStreetName(),
									cannabisApplicationRegisteredCompanyAddress.getTown(),
									cannabisApplicationRegisteredCompanyAddress.getParish(),
									cannabisApplicationMailingCompanyAddress.getStreetName(),
									cannabisApplicationMailingCompanyAddress.getTown(),
									cannabisApplicationMailingCompanyAddress.getParish(),
									applicationCompanyInfo.getTrn(), applicationCompanyInfo.getTypeOfCompany(),
									applicationCompanyInfo.getOtherCompanyType(),
									applicationCompanyInfo.getRegistrationNumber(),
									applicationCompanyInfo.getContactPhoneNumber(),
									applicationCompanyInfo.getEmailAddress(),
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									cannabisApplicationCompanyAuthorizedAgent.getMiddleName(),
									cannabisApplicationCompanyAuthorizedAgent.getPosition(),
									cannabisApplicationCompanyAuthorizedAgent.getGender(),
									cannabisApplicationCompanyAuthorizedAgent != null
											&& cannabisApplicationCompanyAuthorizedAgent.getDateOfBirth() != null
													? new SimpleDateFormat("yyyy-MM-dd").format(
															cannabisApplicationCompanyAuthorizedAgent.getDateOfBirth())
													: StringPool.BLANK,
									cannabisApplicationCompanyAuthorizedAgent.getContactPhoneNumber(),
									cannabisApplicationCompanyAuthorizedAgent.getEmailAddress(),

//									for the general declaration
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 0
											? generalDelarations.get(0).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 1
											? generalDelarations.get(1).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 16
											? generalDelarations.get(16).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 17
											? generalDelarations.get(17).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 18
											? generalDelarations.get(18).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 19
											? generalDelarations.get(19).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 3
											? generalDelarations.get(3).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 20
											? generalDelarations.get(20).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 21
											? generalDelarations.get(21).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 4
											? generalDelarations.get(4).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 5
											? generalDelarations.get(5).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 6
											? generalDelarations.get(6).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 7
											? generalDelarations.get(7).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 8
											? generalDelarations.get(8).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 9
											? generalDelarations.get(9).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 10
											? generalDelarations.get(10).getAnswer()
											: "",

									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 11
											? generalDelarations.get(11).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 12
											? generalDelarations.get(12).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 13
											? generalDelarations.get(13).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 14
											? generalDelarations.get(14).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 15
											? generalDelarations.get(15).getAnswer()
											: "",
									// for the financial Histories
									Validator.isNotNull(financialHistories) && financialHistories.size() > 0
											? financialHistories.get(0).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 1
											? financialHistories.get(1).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 2
											? financialHistories.get(2).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 3
											? financialHistories.get(3).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 4
											? financialHistories.get(4).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 5
											? financialHistories.get(5).getAnswer()
											: "",
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									previewUrlforAutorizationBackground,
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
//for thr cultivator 
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 0
													? cannabisSupplementalInformations.get(0).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 1
													? cannabisSupplementalInformations.get(1).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 2
													? cannabisSupplementalInformations.get(2).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 3
													? cannabisSupplementalInformations.get(3).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 4
													? cannabisSupplementalInformations.get(4).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 5
													? cannabisSupplementalInformations.get(5).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 6
													? cannabisSupplementalInformations.get(6).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 7
													? cannabisSupplementalInformations.get(7).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 8
													? cannabisSupplementalInformations.get(8).getAnswer()
													: "",

//for the Consent Property Owners
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									cannabisConsentByPropertyOwners.getTypeOfProperty(),
									cannabisConsentByPropertyOwners.getDescriptionOfProperty(),
									cannabisConsentByPropertyOwners.getDescriptionOfIntendedUse(),
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),

//									sole owner 
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerName()
													: "",
									cannabisConsentBySoleOwners.size() >= 0
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(0).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(0).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(1).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(2).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(3).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(3).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(4).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(4).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerAddress()
													: "",

									// for the occupationaLicenses
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getTrn()
											: "",
									occupationaLicenses.size() >= 0
											&& Validator.isNotNull(occupationaLicenses.get(0).getDob())
													? dateFormat.format(occupationaLicenses.get(0).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											&& Validator.isNotNull(occupationaLicenses.get(1).getDob())
													? dateFormat.format(occupationaLicenses.get(1).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											&& Validator.isNotNull(occupationaLicenses.get(2).getDob())
													? dateFormat.format(occupationaLicenses.get(2).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											&& Validator.isNotNull(occupationaLicenses.get(3).getDob())
													? dateFormat.format(occupationaLicenses.get(3).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											&& Validator.isNotNull(occupationaLicenses.get(4).getDob())
													? dateFormat.format(occupationaLicenses.get(4).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getTypeOfId()
											: "",
//							for the declaration of ownership
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getTrn().toString()
											: "",
									declarationOfOwnerships.size() > 1
											&& Validator.isNotNull(declarationOfOwnerships.get(0).getDob())
													? dateFormat.format(declarationOfOwnerships.get(0).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											&& Validator.isNotNull(declarationOfOwnerships.get(1).getDob())
													? dateFormat.format(declarationOfOwnerships.get(1).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											&& Validator.isNotNull(declarationOfOwnerships.get(2).getDob())
													? dateFormat.format(declarationOfOwnerships.get(2).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											&& Validator.isNotNull(declarationOfOwnerships.get(3).getDob())
													? dateFormat.format(declarationOfOwnerships.get(3).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											&& Validator.isNotNull(declarationOfOwnerships.get(4).getDob())
													? dateFormat.format(declarationOfOwnerships.get(4).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getTypeOfId()
											: "",
									Validator.isNotNull(cannabisPayment) ? cannabisPayment.getPaymentMethod() : "",
									previewUrlforSupplymentInfoSignature,
									Validator.isNotNull(cannabisApplications)
											? dateFormat.format(cannabisApplications.getCreateDate())
											: "", });
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					String title = "";
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certifiedCopyOfDriver = "";
						String certifiedCopyOfNation = "";
						String CertifiedOfNatinal = "";
						String certifiedCopyOfTRC = "";
						String signedOriginal = "";
						String twoCertified = "";
						String notarizedCopyOfDriver = "";
						String notarizedCopyOfPassport = "";
						String notarizedCopyOfNational = "";
						String originalPolice = "";
						String twoNotarized = "";
						String taxCompliance = "";
						String certificateOfIncorporation = "";
						String articleOfInco = "";
						List<CannabisSupportingDocumentsMaster> cannabisSupportingDocumentsMasters = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocApplicant("Applicant", "Company", "Cultivator Licence");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : cannabisSupportingDocumentsMasters) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
								e.printStackTrace();
							}
							if (title.equals("Certified copy of Driver�s Licence")) {
								certifiedCopyOfDriver = fileName;
							} else if (title.equals("Certified copy of Passport Bio-page")) {
								certifiedCopyOfNation = fileName;
							} else if (title.equals("Certified copy of National Identification Card")) {
								CertifiedOfNatinal = fileName;
							} else if (title.equals(
									"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
								certifiedCopyOfTRC = fileName;
							} else if (title.equals(
									"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant, for each director and for each shareholder (only) with at least 10% shareholding")) {
								signedOriginal = fileName;
							} else if (title.equals(
									"Two (2) certified passport sized photographs for each director and shareholder")) {
								twoCertified = fileName;
							} else if (title.equals("Notarized copy of Driver�s Licence")) {
								notarizedCopyOfDriver = fileName;
							} else if (title.equals("Notarized copy of Passport Bio-page")) {
								notarizedCopyOfPassport = fileName;
							} else if (title.equals("Notarized copy of National Identification Card")) {
								notarizedCopyOfNational = fileName;
							} else if (title.equals(
									"Original Police Certificate from country of residence addressed for each director and for each shareholder (only) with at least 10% shareholding")) {
								originalPolice = fileName;
							} else if (title.equals(
									"Two (2) notarized passport sized photographs for each director and shareholder")) {
								twoNotarized = fileName;
							} else if (title.equals("Tax Compliance Notification Letter")) {
								taxCompliance = fileName;
							} else if (title.equals("Certificate of Incorporation")) {
								certificateOfIncorporation = fileName;
							} else if (title.equals("Articles of Incorporation")) {
								articleOfInco = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//										for the document 
								"[$certifiedCopyOfDriving$]", "[$CerticateCopyOfPassport$]",
								"[$CertifiedCopyOfNationalInde$]", "[$CertifiedCopyOfTaxpayerRegistrationNumber$]",
								"[$signedOriginalPolice$]", "[$twoCertifiedPassport$]", "[$notarizedCopyOfDriving$]",
								"[$notarizedCopyOfPassport$]", "[$notarizedCopyOfNational$]",
								"[$originalPoliceCertificate$]", "[$twoNotarized$]", "[$complianceNotification$]",
								"[$CertificateOfIncorporation$]", "[$ArticleOfIncorporation$]" }, new String[] {
//										for the document 
										Validator.isNotNull(certifiedCopyOfDriver) ? certifiedCopyOfDriver : "",
										Validator.isNotNull(certifiedCopyOfNation) ? certifiedCopyOfNation : "",
										Validator.isNotNull(CertifiedOfNatinal) ? CertifiedOfNatinal : "",
										Validator.isNotNull(certifiedCopyOfTRC) ? certifiedCopyOfTRC : "",
										Validator.isNotNull(signedOriginal) ? signedOriginal : "",
										Validator.isNotNull(twoCertified) ? twoCertified : "",
										Validator.isNotNull(notarizedCopyOfDriver) ? notarizedCopyOfDriver : "",
										Validator.isNotNull(notarizedCopyOfPassport) ? notarizedCopyOfPassport : "",
										Validator.isNotNull(notarizedCopyOfNational) ? notarizedCopyOfNational : "",
										Validator.isNotNull(originalPolice) ? originalPolice : "",
										Validator.isNotNull(twoNotarized) ? twoNotarized : "",
										Validator.isNotNull(taxCompliance) ? taxCompliance : "",
										Validator.isNotNull(certificateOfIncorporation) ? certificateOfIncorporation
												: "",
										Validator.isNotNull(articleOfInco) ? articleOfInco : "" });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certifiedCOpy = "";
						String cretifictecopyOfArticle = "";
						String taxCompliance = "";
						String listOfPer = "";
						String ListOfGanja = "";
						String listOfperson = "";
						String certificate = "";
						String direcyorsAndShareholders = "";
						String directorAndStakeholderCertified = "";
						String directorComplete = "";
						String foregirnNational = "";
						String foregirnNationalDirector = "";
						String foreginNationalDireAndShareholder = "";
						List<CannabisSupportingDocumentsMaster> cannabisSupportingDocumentsMasters = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocApplicant("Applicant", "Cooperative", "Cultivator Licence");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : cannabisSupportingDocumentsMasters) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}

							if (title.equals("Certified copy of Driver�s Licence")) {
								certifiedCOpy = fileName;
							} else if (title.equals("Certified copy of Passport Bio-page")) {
								cretifictecopyOfArticle = fileName;
							} else if (title.equals("Certified copy of National Identification Card")) {
								taxCompliance = fileName;
							} else if (title.equals(
									"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
								listOfPer = fileName;
							} else if (title.equals(
									"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant for each Board member")) {
								ListOfGanja = fileName;
							} else if (title.equals("Two (2) certified passport sized photographs for each member")) {
								listOfperson = fileName;
							} else if (title
									.equals("Certificate of Registration as a Co-operative or Friendly Society")) {
								certificate = fileName;
							} else if (title
									.equals("Registry of the members of the Co-operative or Friendly Society")) {
								direcyorsAndShareholders = fileName;
							} else if (title.equals("Passport Bio-page, if not already uploaded")) {
								directorAndStakeholderCertified = fileName;
							} else if (title.equals("Completed Due Diligence Requirement Form")) {
								directorComplete = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//										for the document 
								"[$certifiedCopyOfDriving$]", "[$CerticateCopyOfPassport$]",
								"[$CertifiedCopyOfNationalInde$]", "[$CertifiedCopyOfTaxpayerRegistrationNumber$]",
								"[$SignedOriginalCertificate$]", "[$certifiedPassportSized$]",
								"[$RegistryOfTheMemeber$]", "[$CertificateOfRegistration$]", "[$PassportBioPage$]",
								"[$CompletedDueDiligence$]" }, new String[] {
//										for the document 
										Validator.isNotNull(certifiedCOpy) ? certifiedCOpy : "",
										Validator.isNotNull(cretifictecopyOfArticle) ? cretifictecopyOfArticle : "",
										Validator.isNotNull(taxCompliance) ? taxCompliance : "",
										Validator.isNotNull(listOfPer) ? listOfPer : "",
										Validator.isNotNull(ListOfGanja) ? ListOfGanja : "",
										Validator.isNotNull(listOfperson) ? listOfperson : "",
										Validator.isNotNull(certificate) ? certificate : "",
										Validator.isNotNull(direcyorsAndShareholders) ? direcyorsAndShareholders : "",
										Validator.isNotNull(directorAndStakeholderCertified)
												? directorAndStakeholderCertified
												: "",
										Validator.isNotNull(directorComplete) ? directorComplete : "" });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certifiedCopyOfCertificateOfTitle = "";
						String cretifictecopyOfTwoStatutory = "";
						String prooofOfPaymentOfProperty = "";
						String surveyDiagramShowing = "";
						List<CannabisSupportingDocumentsMaster> cannabisSupportingDocumentsMasters = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Property", "Company", "Cultivator Licence",
										"Registered Land Applicant Owns Property");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : cannabisSupportingDocumentsMasters) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals(
									"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
								certifiedCopyOfCertificateOfTitle = fileName;
							} else if (title
									.equals("Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
								cretifictecopyOfTwoStatutory = fileName;
							} else if (title.equals(
									"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
								prooofOfPaymentOfProperty = fileName;
							} else if (title.equals(
									"Survey Diagram showing entrance exits receival loading and storage areas")) {
								surveyDiagramShowing = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//										for the document 
								"[$CertifiedCopyOfCertified$]", "[$CertifiedCopyOfTwoStatutory$]", "[$ProofOfPayment$]",
								"[$SurveyDiagram$]" }, new String[] {
//										for the document 
										Validator.isNotNull(certifiedCopyOfCertificateOfTitle)
												? certifiedCopyOfCertificateOfTitle
												: "",
										Validator.isNotNull(cretifictecopyOfTwoStatutory) ? cretifictecopyOfTwoStatutory
												: "",
										Validator.isNotNull(prooofOfPaymentOfProperty) ? prooofOfPaymentOfProperty : "",
										Validator.isNotNull(surveyDiagramShowing) ? surveyDiagramShowing : "" });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certifiedCopyOfCertificateOfTitleInCul = "";
						String cretifictecopyOfTwoStatutoryInCul = "";
						String prooofOfPaymentOfPropertyInCul = "";
						String surveyDiagramShowingInCul = "";
						List<CannabisSupportingDocumentsMaster> cannabisSupportingDocumentsMasters = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Property", "Cooperative", "Cultivator Licence",
										"Registered Land Applicant Owns Property");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : cannabisSupportingDocumentsMasters) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals(
									"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
								certifiedCopyOfCertificateOfTitleInCul = fileName;
							} else if (title
									.equals("Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
								cretifictecopyOfTwoStatutoryInCul = fileName;
							} else if (title.equals(
									"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
								prooofOfPaymentOfPropertyInCul = fileName;
							} else if (title.equals(
									"Survey Diagram showing entrance exits receival loading and storage areas")) {
								surveyDiagramShowingInCul = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//										for the document 
								"[$CertifiedCopyOfCertified$]", "[$CertifiedCopyOfTwoStatutory$]", "[$ProofOfPayment$]",
								"[$SurveyDiagram$]" }, new String[] {
//										for the document 
										Validator.isNotNull(certifiedCopyOfCertificateOfTitleInCul)
												? certifiedCopyOfCertificateOfTitleInCul
												: "",
										Validator.isNotNull(cretifictecopyOfTwoStatutoryInCul)
												? cretifictecopyOfTwoStatutoryInCul
												: "",
										Validator.isNotNull(prooofOfPaymentOfPropertyInCul)
												? prooofOfPaymentOfPropertyInCul
												: "",
										Validator.isNotNull(surveyDiagramShowingInCul) ? surveyDiagramShowingInCul
												: "" });
					}
				}
			} else if (cannabisApplications.getLicenseCategory().equals("Processing Licence")) {
				DateFormat dateFormat4 = new SimpleDateFormat("MM-dd-yyyy");
				CannabisApplicationCompanyInfo applicationCompanyInfo = null;
				CannabisApplicationCompanyAddress cannabisApplicationRegisteredCompanyAddress = null;
				CannabisApplicationCompanyAddress cannabisApplicationMailingCompanyAddress = null;
				CannabisApplicationCompanyAuthorizedAgent cannabisApplicationCompanyAuthorizedAgent = null;
				List<GeneralDelarations> generalDelarations = null;
				List<StatementOfFinancialHistory> financialHistories = null;
				List<CannabisSupplementalInformation> cannabisSupplementalInformations = null;
				CannabisConsentByPropertyOwner cannabisConsentByPropertyOwners = null;
				List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners = null;
				List<CannabisOccupationaLicense> occupationaLicenses = null;
				List<CannabisDeclarationOfOwnership> declarationOfOwnerships = null;
				CannabisApplicationPayment cannabisPayment = null;
				try {
					applicationCompanyInfo = CannabisApplicationCompanyInfoLocalServiceUtil
							.getCA_CI_by_AppId(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisApplicationRegisteredCompanyAddress = CannabisApplicationCompanyAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.REGISTERED_ADDRESS,
									applicationCompanyInfo.getCompanyInformationId());
				}catch (Exception e) {
				}try {
					cannabisApplicationMailingCompanyAddress = CannabisApplicationCompanyAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.MAILING_ADDRESS,
									applicationCompanyInfo.getCompanyInformationId());
				}catch (Exception e) {
				}try {
					cannabisApplicationCompanyAuthorizedAgent = CannabisApplicationCompanyAuthorizedAgentLocalServiceUtil
							.getCAA_by_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					generalDelarations = GeneralDelarationsLocalServiceUtil.getCA_GD_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					financialHistories = StatementOfFinancialHistoryLocalServiceUtil
							.getSOFH_by_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisSupplementalInformations = CannabisSupplementalInformationLocalServiceUtil
							.getCA_SI_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisConsentByPropertyOwners = CannabisConsentByPropertyOwnerLocalServiceUtil
							.getCA_CPO_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisConsentBySoleOwners = CannabisConsentBySoleOwnerLocalServiceUtil
							.getCA_CSO_BY_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					occupationaLicenses = CannabisOccupationaLicenseLocalServiceUtil
							.getCA_OL_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					declarationOfOwnerships = CannabisDeclarationOfOwnershipLocalServiceUtil
							.getCA_DO_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
						cannabisPayment = CannabisApplicationPaymentLocalServiceUtil
								.getCannabisApplicationPaymentByCannabisAppId(cannabisApplicationId);
					} catch (Exception e) {
					}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"cannabis_application_company_processing_form-2");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"cannabis_application_company_processing_form-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate,
							new String[] { "[$AFCL_LicenseCategory$]", "[$ThisIsYourFirstTimeApplying$]",
									"[$AFCL_NAMEOFCOMPANYBUSINESSCOOPERATIVE$]", "[$AFCL_StreetApt$]",
									"[$AFCL_TownCity$]", "[$AFCL_Parish$]", "[$AFCL_MAILINGADDRESSStreetApt$]",
									"[$AFCL_MAILINGADDRESSTownCity$]", "[$AFCL_MAILINGADDRESSParish$]", "[$AFCL_TRN$]",
									"[$AFCL_TYPEOFCOMPANYBUSINESS$]", "[$AFCL_COMPANYTYPE$]",
									"[$AFCL_REGISTRATIONNUMBER$]", "[$AFCL_ContactNumbers$]", "[$AFCL_EmailAddress$]",
									"" + "[$AFCL_AuthorizedAgentSurname$]", "[$AFCL_AuthorizedAgentFirstName$]",
									"[$AFCL_AuthorizedAgentMiddleName$]", "[$AFCL_AuthorizedAgentPosition$]",
									"[$AFCL_AuthorizedAgentGender$]", "[$AFCL_AuthorizedAgentDateofBirth$]",
									"[$AFCL_AuthorizedAgentContactNumbers$]", "[$AFCL_AuthorizedAgentEmailAdresse$]",
//for the general Delarations				
									"[$UnderTheAgeOfEighteen$]", "[$PropertyOwner$]",
									"[$IsRegisteredOrUnregisteredIfTitleOwnerOrNot$]", "[$OnlyTitleOwnerIfRegistered$]",
									"[$IfNotOnlyOwner$]", "[$OwnerNameIfRegistered$]",
									"[$DeclarentNameIfUnRegistered$]", "[$LicensedMotorVehicle$]",
									"[$LicenceToHandleGanja$]", "[$StateJurisdiction$]", "[$TypeOfLicense$]",
									"[$LicenseStatus$]", "[$AppliedForGamingOrRacingLicence$]", "$StateJurisdiction$]",
									"[$TypeOfLicense$]", "[$LicenseStatus$]", "[$ConvictedOfAnyCrime$]",
									"[$TypeOfCrime$]", "[$LocationOfYourProperty$]", "[$BeneficialOwnerOfTheCompany$]",
									"[$RelatedEntitiesIfApplicable$]",
//for the STATEMENT OF FINANCIAL HISTORY	
									"[$JudgmentsOrTaxLiabilities$]", "[$SuchPetitionFiledAgainstIt$]",
									"[$BusinessTrustInstrument$]", "[$ViolationOfAnyFinancialOrTrade$]",
									"[$OtherCountry$]", "[$StatementsEitherAuditedOrUnaudited$]",
									"[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantFIRSTNAME$]", "[$Signature1$]",
									"[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantFIRSTNAME$]",
//for the processing
									"[$TheTypeOfProperty$]", "[$TheSizeOfProperty$]",
									"[$AFCL_Whatganjaproductsareyouintendingtomanufacture$]",
									"[$AFCL_Haveyoustarteddiscussionswithanentityiestosellyourpr$]",
									"[$TheNameOfPerson$]", "[$AFCL_Doyouproposetousearegisteredtrademark_V2$]",
									"[$AFCL_Doyouintendtosellothernoncannabisitemsonthesamepremi$]",
									"[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantFIRSTNAME$]"
//for the Consent Property Owners
									, "[$TypeOfProperty$]", "[$DescriptionOfProperty$]",
									"[$DescriptionOfIntendedUseOfPropertyToCannabis$]",
//									for the sole owner 
									"[$OwnerName1$]", "[$OwnerDate1$]", "[$OwnerPhone1$]", "[$OwnerAddress1$]",
									"[OwnerName2$]", "[$OwnerDate2$]", "[$OwnerPhone2$]", "[$OwnerAddress2$]",
									"[$OwnerName3$]", "[$OwnerDate3$]", "[$OwnerPhone3$]", "[$OwnerAddress3$]",
									"[$OwnerName4$]", "[$OwnerDate4$]", "[$OwnerPhone4$]", "[$OwnerAddress4$]",
									"[$OwnerName5$]", "[$OwnerDate5$]", "[$OwnerPhone5$]", "[$OwnerAddress5$]",
//								for the ocuupational licence 
									"[$First1$]", "[$Middle1$]", "[$Surname1$]", "[$Position1$]", "[$Managment1$]",
									"[$Director1$]", "[$TRN1$]", "[$Birth1$]", "[$IDNumber1$]", "[$TypeID1$]",
									"[$First2$]", "[$Middle2$]", "[$Surname2$]", "[$Position2$]", "[$Managment2$]",
									"[$Director2$]", "[$TRN2$]", "[$Birth2$]", "[$IDNumber2$]", "[$TypeID2$]",
									"[$First3$]", "[$Middle3$]", "[$Surname3$]", "[$Position3$]", "[$Managment3$]",
									"[$Director3$]", "[$TRN3$]", "[$Birth3$]", "[$IDNumber3$]", "[$TypeID3$]",
									"[$First4$]", "[$Middle4$]", "[$Surname4$]", "[$Position4$]", "[$Managment4$]",
									"[$Director4$]", "[$TRN4$]", "[$Birth4$]", "[$IDNumber4$]", "[$TypeID4$]",
									"[$First5$]", "[$Middle5$]", "[$Surname5$]", "[$Position5$]", "[$Managment5$]",
									"[$Director5$]", "[$TRN5$]", "[$Birth5$]", "[$IDNumber5$]", "[$TypeID5$]",

//	for the declaration of ownerShip
									"[$DeFirst1$]", "[$DeMiddle1$]", "[$DeSurname1$]", "[$DePosition1$]",
									"[De$Ownership1$]", "[$DeCitizenship1$]", "[$DeTRN1$]", "[$DateofBirth1$]",
									"[$DeID1$]", "[$DeType1$]", "[$DeFirst2$]", "[$DeMiddle2$]", "[$DeSurname2$]",
									"[$DePosition2$]", "[$DeOwnership2$]", "[$DeCitizenship2$]", "[$DeTRN2$]",
									"[$DateofBirth2$]", "[$DeID2$]", "[$DeType2$]", "[$DeFirst3$]", "[$DeMiddle3$]",
									"[$DeSurname3$]", "[$DePosition3$]", "[$DeOwnership3$]", "[$DeCitizenship3$]",
									"[$DeTRN3$]", "[$DateofBirth3$]", "[$DeID3$]", "[$DeType3$]", "[$DeFirst4$]",
									"[$DeMiddle4$]", "[$DeSurname4$]", "[$DePosition4$]", "[$DeOwnership4$]",
									"[$DeCitizenship4$]", "[$DeTRN4$]", "[$DateofBirth4$]", "[$DeID4$]", "[$DeType4$]",
									"[$DeFirst5$]", "[$DeMiddle5$]", "[$DeSurname5$]", "[$DePosition5$]",
									"[$DeOwnership5$]", "[$DeCitizenship5$]", "[$DeTRN5$]", "[$DateofBirth5$]",
									"[$DeID5$]", "[$DeType5$]", "[$PaymentMethod$]", "[$Signature2$]", "[$Date$]", },
							new String[] { cannabisApplications.getLicenseCategory(),
									cannabisApplications.getRequestType(), applicationCompanyInfo.getCompanyName(),
									cannabisApplicationRegisteredCompanyAddress.getStreetName(),
									cannabisApplicationRegisteredCompanyAddress.getTown(),
									cannabisApplicationRegisteredCompanyAddress.getParish(),
									cannabisApplicationMailingCompanyAddress.getStreetName(),
									cannabisApplicationMailingCompanyAddress.getTown(),
									cannabisApplicationMailingCompanyAddress.getParish(),
									applicationCompanyInfo.getTrn(), applicationCompanyInfo.getTypeOfCompany(),
									applicationCompanyInfo.getOtherCompanyType(),
									applicationCompanyInfo.getRegistrationNumber(),
									applicationCompanyInfo.getContactPhoneNumber(),
									applicationCompanyInfo.getEmailAddress(),
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									cannabisApplicationCompanyAuthorizedAgent.getMiddleName(),
									cannabisApplicationCompanyAuthorizedAgent.getPosition(),
									cannabisApplicationCompanyAuthorizedAgent.getGender(),
									cannabisApplicationCompanyAuthorizedAgent != null
											&& cannabisApplicationCompanyAuthorizedAgent.getDateOfBirth() != null
													? new SimpleDateFormat("yyyy-MM-dd").format(
															cannabisApplicationCompanyAuthorizedAgent.getDateOfBirth())
													: StringPool.BLANK,
									cannabisApplicationCompanyAuthorizedAgent.getContactPhoneNumber(),
									cannabisApplicationCompanyAuthorizedAgent.getEmailAddress(),

//					for the general Delarations	
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 0
											? generalDelarations.get(0).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 1
											? generalDelarations.get(1).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 16
											? generalDelarations.get(16).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 17
											? generalDelarations.get(17).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 18
											? generalDelarations.get(18).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 19
											? generalDelarations.get(19).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 3
											? generalDelarations.get(3).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 20
											? generalDelarations.get(20).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 21
											? generalDelarations.get(21).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 4
											? generalDelarations.get(4).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 5
											? generalDelarations.get(5).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 6
											? generalDelarations.get(6).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 7
											? generalDelarations.get(7).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 8
											? generalDelarations.get(8).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 9
											? generalDelarations.get(9).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 10
											? generalDelarations.get(10).getAnswer()
											: "",

									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 11
											? generalDelarations.get(11).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 12
											? generalDelarations.get(12).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 13
											? generalDelarations.get(13).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 14
											? generalDelarations.get(14).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 15
											? generalDelarations.get(15).getAnswer()
											: "",
									// for the financial Histories
									Validator.isNotNull(financialHistories) && financialHistories.size() > 0
											? financialHistories.get(0).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 1
											? financialHistories.get(1).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 2
											? financialHistories.get(2).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 3
											? financialHistories.get(3).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 4
											? financialHistories.get(4).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 5
											? financialHistories.get(5).getAnswer()
											: "",
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
//for thr processor
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 0
													? cannabisSupplementalInformations.get(0).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 1
													? cannabisSupplementalInformations.get(1).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 2
													? cannabisSupplementalInformations.get(2).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 3
													? cannabisSupplementalInformations.get(3).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 4
													? cannabisSupplementalInformations.get(4).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 5
													? cannabisSupplementalInformations.get(5).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 6
													? cannabisSupplementalInformations.get(6).getAnswer()
													: "",
									previewUrlforAutorizationBackground,
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),

//for the Consent Property Owners
									cannabisConsentByPropertyOwners.getTypeOfProperty(),
									cannabisConsentByPropertyOwners.getDescriptionOfProperty(),
									cannabisConsentByPropertyOwners.getDescriptionOfIntendedUse(),

//									for the sole owner 
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerName()
													: "",
									cannabisConsentBySoleOwners.size() >= 0
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(0).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(0).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(1).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(2).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(3).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(3).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(4).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(4).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerAddress()
													: "",

									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getTrn()
											: "",
									occupationaLicenses.size() > 1
											&& Validator.isNotNull(occupationaLicenses.get(0).getDob())
													? dateFormat.format(occupationaLicenses.get(0).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											&& Validator.isNotNull(occupationaLicenses.get(1).getDob())
													? dateFormat.format(occupationaLicenses.get(1).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											&& Validator.isNotNull(occupationaLicenses.get(2).getDob())
													? dateFormat.format(occupationaLicenses.get(2).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											&& Validator.isNotNull(occupationaLicenses.get(3).getDob())
													? dateFormat.format(occupationaLicenses.get(3).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											&& Validator.isNotNull(occupationaLicenses.get(4).getDob())
													? dateFormat.format(occupationaLicenses.get(4).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getTypeOfId()
											: "",

//									for the declaration of ownership
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getTrn().toString()
											: "",
									declarationOfOwnerships.size() > 1
											&& Validator.isNotNull(declarationOfOwnerships.get(0).getDob())
													? dateFormat.format(declarationOfOwnerships.get(0).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											&& Validator.isNotNull(declarationOfOwnerships.get(1).getDob())
													? dateFormat.format(declarationOfOwnerships.get(1).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											&& Validator.isNotNull(declarationOfOwnerships.get(2).getDob())
													? dateFormat.format(declarationOfOwnerships.get(2).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											&& Validator.isNotNull(declarationOfOwnerships.get(3).getDob())
													? dateFormat.format(declarationOfOwnerships.get(3).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											&& Validator.isNotNull(declarationOfOwnerships.get(4).getDob())
													? dateFormat.format(declarationOfOwnerships.get(4).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getTypeOfId()
											: "",
									Validator.isNotNull(cannabisPayment) ? cannabisPayment.getPaymentMethod() : "",
									previewUrlforSupplymentInfoSignature,
									Validator.isNotNull(cannabisApplications)
											? dateFormat.format(cannabisApplications.getCreateDate())
											: "", });
				} catch (Exception e) {
				}

				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					String title = "";
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certifiedCopyOfDriver = "";
						String cretificteCopyOfPassport = "";
						String certifiedCopyOfNational = "";
						String certifiedCopyOfTRC = "";
						String signedOriginalPolice = "";
						String twoCertifiedOfPassport = "";
						String notarizedCopyOfDriver = "";
						String notarizedCopyOfPassport = "";
						String notarizedCopyOfNational = "";
						String originalPoliceCertificate = "";
						String twoNotarizedPassport = "";
						String taxCompliance = "";
						String certificateOfIncorporation = "";
						String articlesOfIncorporation = "";
						String passportBioPage = "";
						String completeDueDiligence = "";
						List<CannabisSupportingDocumentsMaster> propertyDocuments = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocApplicant("Applicant", "Company", "Processing Licence");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : propertyDocuments) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
								e.printStackTrace();
							}
							if (title.equals("Certified copy of Driver�s Licence")) {
								certifiedCopyOfDriver = fileName;
							} else if (title.equals("Certified copy of Passport Bio-page")) {
								cretificteCopyOfPassport = fileName;
							} else if (title.equals("Certified copy of National Identification Card")) {
								certifiedCopyOfNational = fileName;
							} else if (title.equals(
									"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
								certifiedCopyOfTRC = fileName;
							} else if (title.equals(
									"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant, for each director and for each shareholder (only) with at least 10% shareholding")) {
								signedOriginalPolice = fileName;
							} else if (title.equals(
									"Two (2) certified passport sized photographs for each director and shareholder")) {
								twoCertifiedOfPassport = fileName;
							} else if (title.equals("Notarized copy of Driver�s Licence")) {
								notarizedCopyOfDriver = fileName;
							} else if (title.equals("Notarized copy of Passport Bio-page")) {
								notarizedCopyOfPassport = fileName;
							} else if (title.equals("Notarized copy of National Identification Card")) {
								notarizedCopyOfNational = fileName;
							} else if (title.equals(
									"Original Police Certificate from country of residence addressed for each director and for each shareholder (only) with at least 10% shareholding")) {
								originalPoliceCertificate = fileName;
							} else if (title.equals(
									"Two (2) notarized passport sized photographs for each director and shareholder")) {
								twoNotarizedPassport = fileName;
							} else if (title.equals("Tax Compliance Notification Letter")) {
								taxCompliance = fileName;
							} else if (title.equals("Certificate of Incorporation")) {
								certificateOfIncorporation = fileName;
							} else if (title.equals("Articles of Incorporation")) {
								articlesOfIncorporation = fileName;
							} else if (title.equals("Passport Bio-page, if not already uploaded")) {
								passportBioPage = fileName;
							} else if (title.equals("Completed Due Diligence Requirement Form")) {
								completeDueDiligence = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//									for the document 
								"[$CertifiedCopyOfDriver$]", "[$CertifiedCopyOfPassport$]",
								"[$CertifiesCopyOfNationalIdentification$]", "[$CertifiedCopyOfTRC$]",
								"[$SignedOriginalPolice$]", "[$TwoCertifiedPassport$]", "[$NotarizedCopyOfDriver$]",
								"[$NotarizedCopyOfPassportBioPage$]", "[$NotarIzedCopyOfNational$]",
								"[$OriginalPoliceCertificaeFromCountry$]", "[$NotarizedPassportSizedPhoto$]",
								"[$TaxComplianceNotification$]", "[$CertificateOfIncorporation$]",
								"[$ArticleOfIncorporation$]", "[$PassportBioPage$]", "[$CompleteDueDiligence$]" },
								new String[] {
//									for the document 
										certifiedCopyOfDriver, cretificteCopyOfPassport, certifiedCopyOfNational,
										certifiedCopyOfTRC, signedOriginalPolice, twoCertifiedOfPassport,
										notarizedCopyOfDriver, notarizedCopyOfPassport, notarizedCopyOfNational,
										originalPoliceCertificate, twoNotarizedPassport, taxCompliance,
										certificateOfIncorporation, articlesOfIncorporation, passportBioPage,
										completeDueDiligence });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certificate = "";
						String certificateCopyOfTwoStatutory = "";
						String proofOfPaymentTaxes = "";
						String surveyDiagram = "";
						List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Property", "Company", "Processing Licence",
										"Registered Land Applicant Owns Property");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals(
									"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
								certificate = fileName;
							} else if (title
									.equals("Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
								certificateCopyOfTwoStatutory = fileName;
							} else if (title.equals(
									"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
								proofOfPaymentTaxes = fileName;
							} else if (title.equals(
									"Survey Diagram showing entrance exits receival loading and storage areas")) {
								surveyDiagram = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//											for the document 
								"[$CertifiedCopyOfCertificareIfTitle$]", "[$CertifiedCopyOfTwo$]",
								"[$ProofOfPaymentOfProperty$]", "[$SurveyDiagram$]" }, new String[] {
//											for the document 
										certificate, certificateCopyOfTwoStatutory, proofOfPaymentTaxes,
										surveyDiagram });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certificateCopyOfDriver = "";
						String certificateCopyOfPassport = "";
						String certifiedcopyOfNational = "";
						String certifiedCopyOfTRCCard = "";
						String signedOriginalPoliceCertified = "";
						String twoCertified = "";
						String certifiedOfRegistration = "";
						String registryOfTheMember = "";
						String passportBioPageIf = "";
						String completeDueDiligenceRequirement = "";
						List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocApplicant("Applicant", "Cooperative", "Processing Licence");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals("Certified copy of Driver�s Licence")) {
								certificateCopyOfDriver = fileName;
							} else if (title.equals("Certified copy of Passport Bio-page")) {
								certificateCopyOfPassport = fileName;
							} else if (title.equals("Certified copy of National Identification Card")) {
								certifiedcopyOfNational = fileName;
							} else if (title.equals(
									"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
								certifiedCopyOfTRCCard = fileName;
							} else if (title.equals(
									"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant for each Board member")) {
								signedOriginalPoliceCertified = fileName;
							} else if (title.equals("Two (2) certified passport sized photographs for each member")) {
								twoCertified = fileName;
							} else if (title
									.equals("Certificate of Registration as a Co-operative or Friendly Society")) {
								certifiedOfRegistration = fileName;
							} else if (title
									.equals("Registry of the members of the Co-operative or Friendly Society")) {
								registryOfTheMember = fileName;
							} else if (title.equals("Passport Bio-page, if not already uploaded")) {
								passportBioPageIf = fileName;
							} else if (title.equals("Completed Due Diligence Requirement Form")) {
								completeDueDiligenceRequirement = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//											for the document 
								"[$CertifiedCopyOfDriver$]", "[$CertifiedCopyOfPassport$]",
								"[$CertifiesCopyOfNationalIdentification$]", "[$CertifiedCopyOfTRC$]",
								"[$SignedOriginalPoliceCertificate$]", "[$CertifiedPassportSizedPhoto$]",
								"[$CertifiedOfRegistration$]", "[$RegistryOfTheMember$]", "[$PassportBioPage$]",
								"[$CompleteDueDiligence$]" }, new String[] {
//											for the document 
										certificateCopyOfDriver, certificateCopyOfPassport, certifiedcopyOfNational,
										certifiedCopyOfTRCCard, signedOriginalPoliceCertified, twoCertified,
										certifiedOfRegistration, registryOfTheMember, passportBioPageIf,
										completeDueDiligenceRequirement });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certificate = "";
						String certificateCopyOfTwoStatutory = "";
						String proofOfPaymentTaxes = "";
						String surveyDiagram = "";
						List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Property", "Cooperative", "Processing Licence",
										"Registered Land Applicant Owns Property");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals(
									"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
								certificate = fileName;
							} else if (title
									.equals("Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
								certificateCopyOfTwoStatutory = fileName;
							} else if (title.equals(
									"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
								proofOfPaymentTaxes = fileName;
							} else if (title.equals(
									"Survey Diagram showing entrance exits receival loading and storage areas")) {
								surveyDiagram = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//											for the document 
								"[$CertifiedCopyOfCertificareIfTitle$]", "[$CertifiedCopyOfTwo$]",
								"[$ProofOfPaymentOfProperty$]", "[$SurveyDiagram$]" }, new String[] {
//											for the document 
										certificate, certificateCopyOfTwoStatutory, proofOfPaymentTaxes,
										surveyDiagram });
					}
				}
			} else if (cannabisApplications.getLicenseCategory().equals("Transport Licence")) {
				DateFormat dateFormat4 = new SimpleDateFormat("MM-dd-yyyy");
				CannabisApplicationCompanyInfo applicationCompanyInfo = null;
				CannabisApplicationCompanyAddress cannabisApplicationRegisteredCompanyAddress = null;
				CannabisApplicationCompanyAddress cannabisApplicationMailingCompanyAddress = null;
				CannabisApplicationCompanyAuthorizedAgent cannabisApplicationCompanyAuthorizedAgent = null;
				List<GeneralDelarations> generalDelarations = null;
				List<StatementOfFinancialHistory> financialHistories = null;
				List<CannabisSupplementalInformation> cannabisSupplementalInformations = null;
				CannabisConsentByPropertyOwner cannabisConsentByPropertyOwners = null;
				List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners = null;
				List<CannabisOccupationaLicense> occupationaLicenses = null;
				List<com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnership> declarationOfOwnerships = null;
				CannabisApplicationPayment cannabisPayment = null;
				try {
					applicationCompanyInfo = CannabisApplicationCompanyInfoLocalServiceUtil
							.getCA_CI_by_AppId(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisApplicationRegisteredCompanyAddress = CannabisApplicationCompanyAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.REGISTERED_ADDRESS,
									applicationCompanyInfo.getCompanyInformationId());
				}catch (Exception e) {
				}try {
					cannabisApplicationMailingCompanyAddress = CannabisApplicationCompanyAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.MAILING_ADDRESS,
									applicationCompanyInfo.getCompanyInformationId());
				}catch (Exception e) {
				}try {
					cannabisApplicationCompanyAuthorizedAgent = CannabisApplicationCompanyAuthorizedAgentLocalServiceUtil
							.getCAA_by_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					generalDelarations = GeneralDelarationsLocalServiceUtil.getCA_GD_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					financialHistories = StatementOfFinancialHistoryLocalServiceUtil
							.getSOFH_by_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisSupplementalInformations = CannabisSupplementalInformationLocalServiceUtil
							.getCA_SI_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisConsentByPropertyOwners = CannabisConsentByPropertyOwnerLocalServiceUtil
							.getCA_CPO_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisConsentBySoleOwners = CannabisConsentBySoleOwnerLocalServiceUtil
							.getCA_CSO_BY_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					occupationaLicenses = CannabisOccupationaLicenseLocalServiceUtil
							.getCA_OL_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					declarationOfOwnerships = CannabisDeclarationOfOwnershipLocalServiceUtil
							.getCA_DO_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
						cannabisPayment = CannabisApplicationPaymentLocalServiceUtil
								.getCannabisApplicationPaymentByCannabisAppId(cannabisApplicationId);
					} catch (Exception e) {
					}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"cannabis_application_company_transport_form");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"cannabis_application_company_transport_form-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate,
							new String[] { "[$AFCL_LicenseCategory$]", "[$ThisIsYourFirstTimeApplying$]",
									"[$AFCL_NAMEOFCOMPANYBUSINESSCOOPERATIVE$]", "[$AFCL_StreetApt$]",
									"[$AFCL_TownCity$]", "[$AFCL_Parish$]", "[$AFCL_MAILINGADDRESSStreetApt$]",
									"[$AFCL_MAILINGADDRESSTownCity$]", "[$AFCL_MAILINGADDRESSParish$]", "[$AFCL_TRN$]",
									"[$AFCL_TYPEOFCOMPANYBUSINESS$]", "[$AFCL_COMPANYTYPE$]",
									"[$AFCL_REGISTRATIONNUMBER$]", "[$AFCL_ContactNumbers$]", "[$AFCL_EmailAddress$]",
									"" + "[$AFCL_AuthorizedAgentSurname$]", "[$AFCL_AuthorizedAgentFirstName$]",
									"[$AFCL_AuthorizedAgentMiddleName$]", "[$AFCL_AuthorizedAgentPosition$]",
									"[$AFCL_AuthorizedAgentGender$]", "[$AFCL_AuthorizedAgentDateofBirth$]",
									"[$AFCL_AuthorizedAgentContactNumbers$]", "[$AFCL_AuthorizedAgentEmailAdresse$]",
//	for the general Delarations	
									"[$UnderTheAgeOfEighteen$]", "[$PropertyOwner$]",
									"[$IsRegisteredOrUnregisteredIfTitleOwnerOrNot$]", "[$OnlyTitleOwnerIfRegistered$]",
									"[$IfNotOnlyOwner$]", "[$OwnerNameIfRegistered$]",
									"[$DeclarentNameIfUnRegistered$]", "[$LicensedMotorVehicle$]",
									"[$LicenceToHandleGanja$]", "[$StateJurisdiction$]", "[$TypeOfLicense$]",
									"[$LicenseStatus$]", "[$AppliedForGamingOrRacingLicence$]", "$StateJurisdiction$]",
									"[$TypeOfLicense$]", "[$LicenseStatus$]", "[$ConvictedOfAnyCrime$]",
									"[$TypeOfCrime$]", "[$LocationOfYourProperty$]", "[$BeneficialOwnerOfTheCompany$]",
									"[$RelatedEntitiesIfApplicable$]",
//	for the STATEMENT OF FINANCIAL HISTORY		
									"[$JudgmentsOrTaxLiabilities$]", "[$SuchPetitionFiledAgainstIt$]",
									"[$BusinessTrustInstrument$]", "[$ViolationOfAnyFinancialOrTrade$]",
									"[$OtherCountry$]", "[$StatementsEitherAuditedOrUnaudited$]",
									"[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantFIRSTNAME$]", "[$Signature1$]",
									"[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantFIRSTNAME$]",
//for the  Transport Licence
									"[$AFCL_HowmanyvehiclesdoyouwishtobelicensedAttachlistwith$]",
									"[$WhereWillTheVehicleBeRoutinelyParkred$]",
									"[$ForWhatTypeOfUseAreYouTransporting$]",
									"[$AFCL_Whattypeofproductdoyouintendtotransport$]",
									"[$AFCL_Haveyoustarteddiscussionswithanentitytotransporttheirc$]",
									"[$NameOfPersonOrCompany$]",
									"[$AFCL_Doyouintendtotransportothernoncannabisitemsinthesame$]",
									"[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantFIRSTNAME$]"
//for the Consent Property Owners
									, "[$TypeOfProperty$]", "[$DescriptionOfProperty$]",
									"[$DescriptionOfIntendedUseOfPropertyToCannabis$]"

//									for the owner 
									, "[$OwnerName1$]", "[$OwnerDate1$]", "[$OwnerPhone1$]", "[$OwnerAddress1$]",
									"[OwnerName2$]", "[$OwnerDate2$]", "[$OwnerPhone2$]", "[$OwnerAddress2$]",
									"[$OwnerName3$]", "[$OwnerDate3$]", "[$OwnerPhone3$]", "[$OwnerAddress3$]",
									"[$OwnerName4$]", "[$OwnerDate4$]", "[$OwnerPhone4$]", "[$OwnerAddress4$]",
									"[$OwnerName5$]", "[$OwnerDate5$]", "[$OwnerPhone5$]", "[$OwnerAddress5$]"
//								for the ocuupational licence 
									, "[$First1$]", "[$Middle1$]", "[$Surname1$]", "[$Position1$]", "[$Managment1$]",
									"[$Director1$]", "[$TRN1$]", "[$Birth1$]", "[$IDNumber1$]", "[$TypeID1$]",
									"[$First2$]", "[$Middle2$]", "[$Surname2$]", "[$Position2$]", "[$Managment2$]",
									"[$Director2$]", "[$TRN2$]", "[$Birth2$]", "[$IDNumber2$]", "[$TypeID2$]",
									"[$First3$]", "[$Middle3$]", "[$Surname3$]", "[$Position3$]", "[$Managment3$]",
									"[$Director3$]", "[$TRN3$]", "[$Birth3$]", "[$IDNumber3$]", "[$TypeID3$]",
									"[$First4$]", "[$Middle4$]", "[$Surname4$]", "[$Position4$]", "[$Managment4$]",
									"[$Director4$]", "[$TRN4$]", "[$Birth4$]", "[$IDNumber4$]", "[$TypeID4$]",
									"[$First5$]", "[$Middle5$]", "[$Surname5$]", "[$Position5$]", "[$Managment5$]",
									"[$Director5$]", "[$TRN5$]", "[$Birth5$]", "[$IDNumber5$]", "[$TypeID5$]",
//	for the declaration of ownerShip
									"[$DeFirst1$]", "[$DeMiddle1$]", "[$DeSurname1$]", "[$DePosition1$]",
									"[De$Ownership1$]", "[$DeCitizenship1$]", "[$DeTRN1$]", "[$DateofBirth1$]",
									"[$DeID1$]", "[$DeType1$]", "[$DeFirst2$]", "[$DeMiddle2$]", "[$DeSurname2$]",
									"[$DePosition2$]", "[$DeOwnership2$]", "[$DeCitizenship2$]", "[$DeTRN2$]",
									"[$DateofBirth2$]", "[$DeID2$]", "[$DeType2$]", "[$DeFirst3$]", "[$DeMiddle3$]",
									"[$DeSurname3$]", "[$DePosition3$]", "[$DeOwnership3$]", "[$DeCitizenship3$]",
									"[$DeTRN3$]", "[$DateofBirth3$]", "[$DeID3$]", "[$DeType3$]", "[$DeFirst4$]",
									"[$DeMiddle4$]", "[$DeSurname4$]", "[$DePosition4$]", "[$DeOwnership4$]",
									"[$DeCitizenship4$]", "[$DeTRN4$]", "[$DateofBirth4$]", "[$DeID4$]", "[$DeType4$]",
									"[$DeFirst5$]", "[$DeMiddle5$]", "[$DeSurname5$]", "[$DePosition5$]",
									"[$DeOwnership5$]", "[$DeCitizenship5$]", "[$DeTRN5$]", "[$DateofBirth5$]",
									"[$DeID5$]", "[$DeType5$]", "[$PaymentMethod$]", "[$Signature2$]", "[$Date$]", },

							new String[] { cannabisApplications.getLicenseCategory(),
									cannabisApplications.getRequestType(), applicationCompanyInfo.getCompanyName(),
									cannabisApplicationRegisteredCompanyAddress.getStreetName(),
									cannabisApplicationRegisteredCompanyAddress.getTown(),
									cannabisApplicationRegisteredCompanyAddress.getParish(),
									cannabisApplicationMailingCompanyAddress.getStreetName(),
									cannabisApplicationMailingCompanyAddress.getTown(),
									cannabisApplicationMailingCompanyAddress.getParish(),
									applicationCompanyInfo.getTrn(), applicationCompanyInfo.getTypeOfCompany(),
									applicationCompanyInfo.getOtherCompanyType(),
									applicationCompanyInfo.getRegistrationNumber(),
									applicationCompanyInfo.getContactPhoneNumber(),
									applicationCompanyInfo.getEmailAddress(),
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									cannabisApplicationCompanyAuthorizedAgent.getMiddleName(),
									cannabisApplicationCompanyAuthorizedAgent.getPosition(),
									cannabisApplicationCompanyAuthorizedAgent.getGender(),
									cannabisApplicationCompanyAuthorizedAgent != null
											&& cannabisApplicationCompanyAuthorizedAgent.getDateOfBirth() != null
													? new SimpleDateFormat("yyyy-MM-dd").format(
															cannabisApplicationCompanyAuthorizedAgent.getDateOfBirth())
													: StringPool.BLANK,
									cannabisApplicationCompanyAuthorizedAgent.getContactPhoneNumber(),
									cannabisApplicationCompanyAuthorizedAgent.getEmailAddress(),
//									for the general Delarations	
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 0
											? generalDelarations.get(0).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 1
											? generalDelarations.get(1).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 16
											? generalDelarations.get(16).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 17
											? generalDelarations.get(17).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 18
											? generalDelarations.get(18).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 19
											? generalDelarations.get(19).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 3
											? generalDelarations.get(3).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 20
											? generalDelarations.get(20).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 21
											? generalDelarations.get(21).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 4
											? generalDelarations.get(4).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 5
											? generalDelarations.get(5).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 6
											? generalDelarations.get(6).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 7
											? generalDelarations.get(7).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 8
											? generalDelarations.get(8).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 9
											? generalDelarations.get(9).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 10
											? generalDelarations.get(10).getAnswer()
											: "",

									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 11
											? generalDelarations.get(11).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 12
											? generalDelarations.get(12).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 13
											? generalDelarations.get(13).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 14
											? generalDelarations.get(14).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 15
											? generalDelarations.get(15).getAnswer()
											: "",
									// for the financial Histories
									Validator.isNotNull(financialHistories) && financialHistories.size() > 0
											? financialHistories.get(0).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 1
											? financialHistories.get(1).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 2
											? financialHistories.get(2).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 3
											? financialHistories.get(3).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 4
											? financialHistories.get(4).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 5
											? financialHistories.get(5).getAnswer()
											: "",
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									previewUrlforAutorizationBackground,
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									// for thr processor
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 0
													? cannabisSupplementalInformations.get(0).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 1
													? cannabisSupplementalInformations.get(1).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 2
													? cannabisSupplementalInformations.get(2).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 3
													? cannabisSupplementalInformations.get(3).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 4
													? cannabisSupplementalInformations.get(4).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 5
													? cannabisSupplementalInformations.get(5).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 6
													? cannabisSupplementalInformations.get(6).getAnswer()
													: "",
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
//for the Consent Property Owners
									cannabisConsentByPropertyOwners.getTypeOfProperty(),
									cannabisConsentByPropertyOwners.getDescriptionOfProperty(),
									cannabisConsentByPropertyOwners.getDescriptionOfIntendedUse(),

//									for the sole owner 
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerName()
													: "",
									cannabisConsentBySoleOwners.size() >= 0
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(0).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(0).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(1).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(2).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(3).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(3).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(4).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(4).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerAddress()
													: "",
									// for the occupationaLicenses
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getTrn()
											: "",
									occupationaLicenses.size() > 1
											&& Validator.isNotNull(occupationaLicenses.get(0).getDob())
													? dateFormat.format(occupationaLicenses.get(0).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											&& Validator.isNotNull(occupationaLicenses.get(1).getDob())
													? dateFormat.format(occupationaLicenses.get(1).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											&& Validator.isNotNull(occupationaLicenses.get(2).getDob())
													? dateFormat.format(occupationaLicenses.get(2).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											&& Validator.isNotNull(occupationaLicenses.get(3).getDob())
													? dateFormat.format(occupationaLicenses.get(3).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											&& Validator.isNotNull(occupationaLicenses.get(4).getDob())
													? dateFormat.format(occupationaLicenses.get(4).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getTypeOfId()
											: "",
//															for the declaration of ownership
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getTrn().toString()
											: "",
									declarationOfOwnerships.size() > 1
											&& Validator.isNotNull(declarationOfOwnerships.get(0).getDob())
													? dateFormat.format(declarationOfOwnerships.get(0).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											&& Validator.isNotNull(declarationOfOwnerships.get(1).getDob())
													? dateFormat.format(declarationOfOwnerships.get(1).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											&& Validator.isNotNull(declarationOfOwnerships.get(2).getDob())
													? dateFormat.format(declarationOfOwnerships.get(2).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											&& Validator.isNotNull(declarationOfOwnerships.get(3).getDob())
													? dateFormat.format(declarationOfOwnerships.get(3).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											&& Validator.isNotNull(declarationOfOwnerships.get(4).getDob())
													? dateFormat.format(declarationOfOwnerships.get(4).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getTypeOfId()
											: "",
									Validator.isNotNull(cannabisPayment) ? cannabisPayment.getPaymentMethod() : "",
									previewUrlforSupplymentInfoSignature,
									Validator.isNotNull(cannabisApplications)
											? dateFormat.format(cannabisApplications.getCreateDate())
											: "", });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					String title = "";
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certifiedCopyOfDriver = "";
						String cretificteCopyOfPassport = "";
						String certifiedCopyOfNational = "";
						String certifiedCopyOfTRC = "";
						String signedOriginalPolice = "";
						String twoCertifiedOfPassport = "";
						String notarizedCopyOfDriver = "";
						String notarizedCopyOfPassport = "";
						String notarizedCopyOfNational = "";
						String originalPoliceCertificate = "";
						String twoNotarizedPassport = "";
						String taxCompliance = "";
						String certificateOfIncorporation = "";
						String articlesOfIncorporation = "";
						String passportBioPage = "";
						String completeDueDiligence = "";
						List<CannabisSupportingDocumentsMaster> propertyDocuments = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocApplicant("Applicant", "Company", "Transport Licence");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : propertyDocuments) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
								e.printStackTrace();
							}
							if (title.equals("Certified copy of Driver�s Licence")) {
								certifiedCopyOfDriver = fileName;
							} else if (title.equals("Certified copy of Passport Bio-page")) {
								cretificteCopyOfPassport = fileName;
							} else if (title.equals("Certified copy of National Identification Card")) {
								certifiedCopyOfNational = fileName;
							} else if (title.equals(
									"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
								certifiedCopyOfTRC = fileName;
							} else if (title.equals(
									"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant, for each director and for each shareholder (only) with at least 10% shareholding")) {
								signedOriginalPolice = fileName;
							} else if (title.equals(
									"Two (2) certified passport sized photographs for each director and shareholder")) {
								twoCertifiedOfPassport = fileName;
							} else if (title.equals("Notarized copy of Driver�s Licence")) {
								notarizedCopyOfDriver = fileName;
							} else if (title.equals("Notarized copy of Passport Bio-page")) {
								notarizedCopyOfPassport = fileName;
							} else if (title.equals("Notarized copy of National Identification Card")) {
								notarizedCopyOfNational = fileName;
							} else if (title.equals(
									"Original Police Certificate from country of residence addressed for each director and for each shareholder (only) with at least 10% shareholding")) {
								originalPoliceCertificate = fileName;
							} else if (title.equals(
									"Two (2) notarized passport sized photographs for each director and shareholder")) {
								twoNotarizedPassport = fileName;
							} else if (title.equals("Tax Compliance Notification Letter")) {
								taxCompliance = fileName;
							} else if (title.equals("Certificate of Incorporation")) {
								certificateOfIncorporation = fileName;
							} else if (title.equals("Articles of Incorporation")) {
								articlesOfIncorporation = fileName;
							} else if (title.equals("Passport Bio-page, if not already uploaded")) {
								passportBioPage = fileName;
							} else if (title.equals("Completed Due Diligence Requirement Form")) {
								completeDueDiligence = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//									for the document 
								"[$CertifiedCopyOfDriver$]", "[$CertifiedCopyOfPassport$]",
								"[$CertifiesCopyOfNationalIdentification$]", "[$CertifiedCopyOfTRC$]",
								"[$SignedOriginalPolice$]", "[$TwoCertifiedPassport$]", "[$NotarizedCopyOfDriver$]",
								"[$NotarizedCopyOfPassportBioPage$]", "[$NotarIzedCopyOfNational$]",
								"[$OriginalPoliceCertificaeFromCountry$]", "[$NotarizedPassportSizedPhoto$]",
								"[$TaxComplianceNotification$]", "[$CertificateOfIncorporation$]",
								"[$ArticleOfIncorporation$]", "[$PassportBioPage$]", "[$CompleteDueDiligence$]" },
								new String[] {
//									for the document 
										certifiedCopyOfDriver, cretificteCopyOfPassport, certifiedCopyOfNational,
										certifiedCopyOfTRC, signedOriginalPolice, twoCertifiedOfPassport,
										notarizedCopyOfDriver, notarizedCopyOfPassport, notarizedCopyOfNational,
										originalPoliceCertificate, twoNotarizedPassport, taxCompliance,
										certificateOfIncorporation, articlesOfIncorporation, passportBioPage,
										completeDueDiligence });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certificate = "";
						String certificateCopyOfTwoStatutory = "";
						String proofOfPaymentTaxes = "";
						String surveyDiagram = "";
						List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Property", "Company", "Transport Licence",
										"Registered Land Applicant Owns Property");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals(
									"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
								certificate = fileName;
							} else if (title
									.equals("Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
								certificateCopyOfTwoStatutory = fileName;
							} else if (title.equals(
									"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
								proofOfPaymentTaxes = fileName;
							} else if (title.equals(
									"Survey Diagram showing entrance exits receival loading and storage areas")) {
								surveyDiagram = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//											for the document 
								"[$CertifiedCopyOfCertificareIfTitle$]", "[$CertifiedCopyOfTwo$]",
								"[$ProofOfPaymentOfProperty$]", "[$SurveyDiagram$]" }, new String[] {
//											for the document 
										certificate, certificateCopyOfTwoStatutory, proofOfPaymentTaxes,
										surveyDiagram });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certificateCopyOfDriver = "";
						String certificateCopyOfPassport = "";
						String certifiedcopyOfNational = "";
						String certifiedCopyOfTRCCard = "";
						String signedOriginalPoliceCertified = "";
						String twoCertified = "";
						String certifiedOfRegistration = "";
						String registryOfTheMember = "";
						String passportBioPageIf = "";
						String completeDueDiligenceRequirement = "";
						List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocApplicant("Applicant", "Cooperative", "Transport Licence");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals("Certified copy of Driver�s Licence")) {
								certificateCopyOfDriver = fileName;
							} else if (title.equals("Certified copy of Passport Bio-page")) {
								certificateCopyOfPassport = fileName;
							} else if (title.equals("Certified copy of National Identification Card")) {
								certifiedcopyOfNational = fileName;
							} else if (title.equals(
									"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
								certifiedCopyOfTRCCard = fileName;
							} else if (title.equals(
									"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant for each Board member")) {
								signedOriginalPoliceCertified = fileName;
							} else if (title.equals("Two (2) certified passport sized photographs for each member")) {
								twoCertified = fileName;
							} else if (title
									.equals("Certificate of Registration as a Co-operative or Friendly Society")) {
								certifiedOfRegistration = fileName;
							} else if (title
									.equals("Registry of the members of the Co-operative or Friendly Society")) {
								registryOfTheMember = fileName;
							} else if (title.equals("Passport Bio-page, if not already uploaded")) {
								passportBioPageIf = fileName;
							} else if (title.equals("Completed Due Diligence Requirement Form")) {
								completeDueDiligenceRequirement = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//											for the document 
								"[$CertifiedCopyOfDriver$]", "[$CertifiedCopyOfPassport$]",
								"[$CertifiesCopyOfNationalIdentification$]", "[$CertifiedCopyOfTRC$]",
								"[$SignedOriginalPoliceCertificate$]", "[$CertifiedPassportSizedPhoto$]",
								"[$CertifiedOfRegistration$]", "[$RegistryOfTheMember$]", "[$PassportBioPage$]",
								"[$CompleteDueDiligence$]" }, new String[] {
//											for the document 
										certificateCopyOfDriver, certificateCopyOfPassport, certifiedcopyOfNational,
										certifiedCopyOfTRCCard, signedOriginalPoliceCertified, twoCertified,
										certifiedOfRegistration, registryOfTheMember, passportBioPageIf,
										completeDueDiligenceRequirement });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certificate = "";
						String certificateCopyOfTwoStatutory = "";
						String proofOfPaymentTaxes = "";
						String surveyDiagram = "";
						List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Property", "Cooperative", "Transport Licence",
										"Registered Land Applicant Owns Property");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals(
									"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
								certificate = fileName;
							} else if (title
									.equals("Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
								certificateCopyOfTwoStatutory = fileName;
							} else if (title.equals(
									"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
								proofOfPaymentTaxes = fileName;
							} else if (title.equals(
									"Survey Diagram showing entrance exits receival loading and storage areas")) {
								surveyDiagram = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//											for the document 
								"[$CertifiedCopyOfCertificareIfTitle$]", "[$CertifiedCopyOfTwo$]",
								"[$ProofOfPaymentOfProperty$]", "[$SurveyDiagram$]" }, new String[] {
//											for the document 
										certificate, certificateCopyOfTwoStatutory, proofOfPaymentTaxes,
										surveyDiagram });
					}
				}
			} else if (cannabisApplications.getLicenseCategory().equals("Retail Licence")) {
				CannabisApplicationCompanyInfo applicationCompanyInfo = null;
				CannabisApplicationCompanyAddress cannabisApplicationRegisteredCompanyAddress = null;
				CannabisApplicationCompanyAddress cannabisApplicationMailingCompanyAddress = null;
				CannabisApplicationCompanyAuthorizedAgent cannabisApplicationCompanyAuthorizedAgent = null;
				List<GeneralDelarations> generalDelarations = null;
				List<StatementOfFinancialHistory> financialHistories = null;
				List<CannabisSupplementalInformation> cannabisSupplementalInformations = null;
				CannabisConsentByPropertyOwner cannabisConsentByPropertyOwners = null;
				List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners = null;
				List<CannabisOccupationaLicense> occupationaLicenses = null;
				List<com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnership> declarationOfOwnerships = null;
				CannabisApplicationPayment cannabisPayment = null;
				try {
					applicationCompanyInfo = CannabisApplicationCompanyInfoLocalServiceUtil
							.getCA_CI_by_AppId(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisApplicationRegisteredCompanyAddress = CannabisApplicationCompanyAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.REGISTERED_ADDRESS,
									applicationCompanyInfo.getCompanyInformationId());
				}catch (Exception e) {
				}try {
					cannabisApplicationMailingCompanyAddress = CannabisApplicationCompanyAddressLocalServiceUtil
							.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.MAILING_ADDRESS,
									applicationCompanyInfo.getCompanyInformationId());
				}catch (Exception e) {
				}try {
					cannabisApplicationCompanyAuthorizedAgent = CannabisApplicationCompanyAuthorizedAgentLocalServiceUtil
							.getCAA_by_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					generalDelarations = GeneralDelarationsLocalServiceUtil.getCA_GD_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					financialHistories = StatementOfFinancialHistoryLocalServiceUtil
							.getSOFH_by_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisSupplementalInformations = CannabisSupplementalInformationLocalServiceUtil
							.getCA_SI_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisConsentByPropertyOwners = CannabisConsentByPropertyOwnerLocalServiceUtil
							.getCA_CPO_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					cannabisConsentBySoleOwners = CannabisConsentBySoleOwnerLocalServiceUtil
							.getCA_CSO_BY_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					occupationaLicenses = CannabisOccupationaLicenseLocalServiceUtil
							.getCA_OL_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
					declarationOfOwnerships = CannabisDeclarationOfOwnershipLocalServiceUtil
							.getCA_DO_CAI(cannabisApplicationId);
				}catch (Exception e) {
				}try {
						cannabisPayment = CannabisApplicationPaymentLocalServiceUtil
								.getCannabisApplicationPaymentByCannabisAppId(cannabisApplicationId);
				} catch (Exception e) {
				}
				pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"cannabis_application_company_retail_form");
				if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
							"cannabis_application_company_retail_form-1");
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {

							"[$AFCL_LicenseCategory$]", "[$ThisIsYourFirstTimeApplying$]",
							"[$AFCL_NAMEOFCOMPANYBUSINESSCOOPERATIVE$]", "[$AFCL_StreetApt$]", "[$AFCL_TownCity$]",
							"[$AFCL_Parish$]", "[$AFCL_MAILINGADDRESSStreetApt$]", "[$AFCL_MAILINGADDRESSTownCity$]",
							"[$AFCL_MAILINGADDRESSParish$]", "[$AFCL_TRN$]", "[$AFCL_TYPEOFCOMPANYBUSINESS$]",
							"[$AFCL_ENTERCOMPANYTYPE$]", "[$AFCL_REGISTRATIONNUMBER$]", "[$AFCL_ContactNumbers$]",
							"[$AFCL_EmailAddress$]", "" + "[$AFCL_AuthorizedAgentSurname$]",
							"[$AFCL_AuthorizedAgentFirstName$]", "[$AFCL_AuthorizedAgentMiddleName$]",
							"[$AFCL_AuthorizedAgentPosition$]", "[$AFCL_AuthorizedAgentGender$]",
							"[$AFCL_AuthorizedAgentDateofBirth$]", "[$AFCL_AuthorizedAgentContactNumbers$]",
							"[$AFCL_AuthorizedAgentEmailAdresse$]",
//for the general Delarations				
							"[$UnderTheAgeOfEighteen$]", "[$PropertyOwner$]",
							"[$IsRegisteredOrUnregisteredIfTitleOwnerOrNot$]", "[$OnlyTitleOwnerIfRegistered$]",
							"[$IfNotOnlyOwner$]", "[$OwnerNameIfRegistered$]", "[$DeclarentNameIfUnRegistered$]",
							"[$LicensedMotorVehicle$]", "[$LicenceToHandleGanja$]", "[$StateJurisdiction$]",
							"[$TypeOfLicense$]", "[$LicenseStatus$]", "[$AppliedForGamingOrRacingLicence$]",
							"[$StateJurisdiction$]", "[$TypeOfLicense$]", "[$LicenseStatus$]",
							"[$ConvictedOfAnyCrime$]", "[$TypeOfCrime$]", "[$LocationOfYourProperty$]",
							"[$BeneficialOwnerOfTheCompany$]", "[$RelatedEntitiesIfApplicable$]",
//for the STATEMENT OF FINANCIAL HISTORY		
							"[$JudgmentsOrTaxLiabilities$]", "[$SuchPetitionFiledAgainstIt$]",
							"[$BusinessTrustInstrument$]", "[$ViolationOfAnyFinancialOrTrade$]", "[$OtherCountry$]",
							"[$StatementsEitherAuditedOrUnaudited$]", "[$AFCL_ApplicantSURNAME$]",
							"[$AFCL_ApplicantFIRSTNAME$]", "[$Signature1$]", "[$AFCL_ApplicantSURNAME$]",
							"[$AFCL_ApplicantFIRSTNAME$]",
//for the  Retail Licence
							"[$AFCL_RetailWhatganjaitemsdoyouintendtosell$]",
							"[$AFCL_RetailHaveyoustarteddiscussionswithanentityiestopurch$]",
							"[$AFCL_RetailDoyouintendtosellothernoncannabisitemsonthesam$]",
							"[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantFIRSTNAME$]"
//for the Consent Property Owners
							, "[$TypeOfProperty$]", "[$DescriptionOfProperty$]",
							"[$DescriptionOfIntendedUseOfPropertyToCannabis$]",

//							for the sole owner 
							"[$OwnerName1$]", "[$OwnerDate1$]", "[$OwnerPhone1$]", "[$OwnerAddress1$]", "[OwnerName2$]",
							"[$OwnerDate2$]", "[$OwnerPhone2$]", "[$OwnerAddress2$]", "[$OwnerName3$]",
							"[$OwnerDate3$]", "[$OwnerPhone3$]", "[$OwnerAddress3$]", "[$OwnerName4$]",
							"[$OwnerDate4$]", "[$OwnerPhone4$]", "[$OwnerAddress4$]", "[$OwnerName5$]",
							"[$OwnerDate5$]", "[$OwnerPhone5$]", "[$OwnerAddress5$]",
//						for the ocuupational licence 
							"[$First1$]", "[$Middle1$]", "[$Surname1$]", "[$Position1$]", "[$Managment1$]",
							"[$Director1$]", "[$TRN1$]", "[$Birth1$]", "[$IDNumber1$]", "[$TypeID1$]", "[$First2$]",
							"[$Middle2$]", "[$Surname2$]", "[$Position2$]", "[$Managment2$]", "[$Director2$]",
							"[$TRN2$]", "[$Birth2$]", "[$IDNumber2$]", "[$TypeID2$]", "[$First3$]", "[$Middle3$]",
							"[$Surname3$]", "[$Position3$]", "[$Managment3$]", "[$Director3$]", "[$TRN3$]",
							"[$Birth3$]", "[$IDNumber3$]", "[$TypeID3$]", "[$First4$]", "[$Middle4$]", "[$Surname4$]",
							"[$Position4$]", "[$Managment4$]", "[$Director4$]", "[$TRN4$]", "[$Birth4$]",
							"[$IDNumber4$]", "[$TypeID4$]", "[$First5$]", "[$Middle5$]", "[$Surname5$]",
							"[$Position5$]", "[$Managment5$]", "[$Director5$]", "[$TRN5$]", "[$Birth5$]",
							"[$IDNumber5$]", "[$TypeID5$]",
//for the declaration of ownerShip
							"[$DeFirst1$]", "[$DeMiddle1$]", "[$DeSurname1$]", "[$DePosition1$]", "[De$Ownership1$]",
							"[$DeCitizenship1$]", "[$DeTRN1$]", "[$DateofBirth1$]", "[$DeID1$]", "[$DeType1$]",
							"[$DeFirst2$]", "[$DeMiddle2$]", "[$DeSurname2$]", "[$DePosition2$]", "[$DeOwnership2$]",
							"[$DeCitizenship2$]", "[$DeTRN2$]", "[$DateofBirth2$]", "[$DeID2$]", "[$DeType2$]",
							"[$DeFirst3$]", "[$DeMiddle3$]", "[$DeSurname3$]", "[$DePosition3$]", "[$DeOwnership3$]",
							"[$DeCitizenship3$]", "[$DeTRN3$]", "[$DateofBirth3$]", "[$DeID3$]", "[$DeType3$]",
							"[$DeFirst4$]", "[$DeMiddle4$]", "[$DeSurname4$]", "[$DePosition4$]", "[$DeOwnership4$]",
							"[$DeCitizenship4$]", "[$DeTRN4$]", "[$DateofBirth4$]", "[$DeID4$]", "[$DeType4$]",
							"[$DeFirst5$]", "[$DeMiddle5$]", "[$DeSurname5$]", "[$DePosition5$]", "[$DeOwnership5$]",
							"[$DeCitizenship5$]", "[$DeTRN5$]", "[$DateofBirth5$]", "[$DeID5$]", "[$DeType5$]",
							"[$PaymentMethod$]", "[$Signature2$]", "[$Date$]" },
							new String[] { cannabisApplications.getLicenseCategory(),
									cannabisApplications.getRequestType(), applicationCompanyInfo.getCompanyName(),
									cannabisApplicationRegisteredCompanyAddress.getStreetName(),
									cannabisApplicationRegisteredCompanyAddress.getTown(),
									cannabisApplicationRegisteredCompanyAddress.getParish(),
									cannabisApplicationMailingCompanyAddress.getStreetName(),
									cannabisApplicationMailingCompanyAddress.getTown(),
									cannabisApplicationMailingCompanyAddress.getParish(),
									applicationCompanyInfo.getTrn(), applicationCompanyInfo.getTypeOfCompany(),
									applicationCompanyInfo.getOtherCompanyType(),
									applicationCompanyInfo.getRegistrationNumber(),
									applicationCompanyInfo.getContactPhoneNumber(),
									applicationCompanyInfo.getEmailAddress(),
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									cannabisApplicationCompanyAuthorizedAgent.getMiddleName(),
									cannabisApplicationCompanyAuthorizedAgent.getPosition(),
									cannabisApplicationCompanyAuthorizedAgent.getGender(),
									cannabisApplicationCompanyAuthorizedAgent != null
											&& cannabisApplicationCompanyAuthorizedAgent.getDateOfBirth() != null
													? new SimpleDateFormat("yyyy-MM-dd").format(
															cannabisApplicationCompanyAuthorizedAgent.getDateOfBirth())
													: StringPool.BLANK,
									cannabisApplicationCompanyAuthorizedAgent.getContactPhoneNumber(),
									cannabisApplicationCompanyAuthorizedAgent.getEmailAddress(),
//								for the general Delarations	
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 0
											? generalDelarations.get(0).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 1
											? generalDelarations.get(1).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 16
											? generalDelarations.get(16).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 17
											? generalDelarations.get(17).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 18
											? generalDelarations.get(18).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 19
											? generalDelarations.get(19).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 3
											? generalDelarations.get(3).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 20
											? generalDelarations.get(20).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 21
											? generalDelarations.get(21).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 4
											? generalDelarations.get(4).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 5
											? generalDelarations.get(5).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 6
											? generalDelarations.get(6).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 7
											? generalDelarations.get(7).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 8
											? generalDelarations.get(8).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 9
											? generalDelarations.get(9).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 10
											? generalDelarations.get(10).getAnswer()
											: "",

									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 11
											? generalDelarations.get(11).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 12
											? generalDelarations.get(12).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 13
											? generalDelarations.get(13).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 14
											? generalDelarations.get(14).getAnswer()
											: "",
									Validator.isNotNull(generalDelarations) && generalDelarations.size() > 15
											? generalDelarations.get(15).getAnswer()
											: "",
									// for the financial Histories
									Validator.isNotNull(financialHistories) && financialHistories.size() > 0
											? financialHistories.get(0).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 1
											? financialHistories.get(1).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 2
											? financialHistories.get(2).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 3
											? financialHistories.get(3).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 4
											? financialHistories.get(4).getAnswer()
											: "",
									Validator.isNotNull(financialHistories) && financialHistories.size() > 5
											? financialHistories.get(5).getAnswer()
											: "",
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									previewUrlforAutorizationBackground,
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									// for thr retail
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 0
													? cannabisSupplementalInformations.get(0).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 1
													? cannabisSupplementalInformations.get(1).getAnswer()
													: "",
									Validator.isNotNull(cannabisSupplementalInformations)
											&& cannabisSupplementalInformations.size() > 2
													? cannabisSupplementalInformations.get(2).getAnswer()
													: "",
									cannabisApplicationCompanyAuthorizedAgent.getSurname(),
									cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
									// for the Consent Property Owners
									Validator.isNotNull(cannabisConsentByPropertyOwners)
											&& Validator.isNotNull(cannabisConsentByPropertyOwners.getTypeOfProperty())
													? cannabisConsentByPropertyOwners.getTypeOfProperty()
													: "",
									Validator.isNotNull(cannabisConsentByPropertyOwners) && Validator
											.isNotNull(cannabisConsentByPropertyOwners.getDescriptionOfProperty())
													? cannabisConsentByPropertyOwners.getDescriptionOfProperty()
													: "",
									Validator.isNotNull(cannabisConsentByPropertyOwners) && Validator
											.isNotNull(cannabisConsentByPropertyOwners.getDescriptionOfIntendedUse())
													? cannabisConsentByPropertyOwners.getDescriptionOfIntendedUse()
													: "",
//								for the sole owner 	
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerName()
													: "",
									cannabisConsentBySoleOwners.size() >= 0
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(0).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(0).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 0
													? cannabisConsentBySoleOwners.get(0).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(1).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 1
													? cannabisConsentBySoleOwners.get(1).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(2).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 2
													? cannabisConsentBySoleOwners.get(2).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(3).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(3).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 3
													? cannabisConsentBySoleOwners.get(3).getOwnerAddress()
													: "",

									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerName()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
											&& Validator.isNotNull(cannabisConsentBySoleOwners.get(4).getDate())
													? dateFormat.format(cannabisConsentBySoleOwners.get(4).getDate())
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerPhone()
													: "",
									Validator.isNotNull(cannabisConsentBySoleOwners)
											&& cannabisConsentBySoleOwners.size() > 4
													? cannabisConsentBySoleOwners.get(4).getOwnerAddress()
													: "",
									// for the occupationaLicenses
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getTrn()
											: "",
									occupationaLicenses.size() > 1
											&& Validator.isNotNull(occupationaLicenses.get(0).getDob())
													? dateFormat.format(occupationaLicenses.get(0).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
											? occupationaLicenses.get(0).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											&& Validator.isNotNull(occupationaLicenses.get(1).getDob())
													? dateFormat.format(occupationaLicenses.get(1).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
											? occupationaLicenses.get(1).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											&& Validator.isNotNull(occupationaLicenses.get(2).getDob())
													? dateFormat.format(occupationaLicenses.get(2).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
											? occupationaLicenses.get(2).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											&& Validator.isNotNull(occupationaLicenses.get(3).getDob())
													? dateFormat.format(occupationaLicenses.get(3).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
											? occupationaLicenses.get(3).getTypeOfId()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getFirstName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getMiddleName()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getSurname()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getPosition()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getManagement()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getDirector()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getTrn()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											&& Validator.isNotNull(occupationaLicenses.get(4).getDob())
													? dateFormat.format(occupationaLicenses.get(4).getDob())
													: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getIdNumber()
											: "",
									Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
											? occupationaLicenses.get(4).getTypeOfId()
											: "",
//															for the declaration of ownership
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getTrn().toString()
											: "",
									declarationOfOwnerships.size() > 1
											&& Validator.isNotNull(declarationOfOwnerships.get(0).getDob())
													? dateFormat.format(declarationOfOwnerships.get(0).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
											? declarationOfOwnerships.get(0).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											&& Validator.isNotNull(declarationOfOwnerships.get(1).getDob())
													? dateFormat.format(declarationOfOwnerships.get(1).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
											? declarationOfOwnerships.get(1).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											&& Validator.isNotNull(declarationOfOwnerships.get(2).getDob())
													? dateFormat.format(declarationOfOwnerships.get(2).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
											? declarationOfOwnerships.get(2).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											&& Validator.isNotNull(declarationOfOwnerships.get(3).getDob())
													? dateFormat.format(declarationOfOwnerships.get(3).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
											? declarationOfOwnerships.get(3).getTypeOfId()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getFirstName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getMiddleName()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getSurname()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getPosition()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getPercentOfOwnership()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getCitizenship()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getTrn()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											&& Validator.isNotNull(declarationOfOwnerships.get(4).getDob())
													? dateFormat.format(declarationOfOwnerships.get(4).getDob())
													: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getIdNumber()
											: "",
									Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
											? declarationOfOwnerships.get(4).getTypeOfId()
											: "",
									Validator.isNotNull(cannabisPayment) ? cannabisPayment.getPaymentMethod() : "",
									previewUrlforSupplymentInfoSignature,
									Validator.isNotNull(cannabisApplications)
											? dateFormat.format(cannabisApplications.getCreateDate())
											: "" });
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("fasle")) {
					String title = "";
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certifiedCopyOfDriver = "";
						String cretificteCopyOfPassport = "";
						String certifiedCopyOfNational = "";
						String certifiedCopyOfTRC = "";
						String signedOriginalPolice = "";
						String twoCertifiedOfPassport = "";
						String notarizedCopyOfDriver = "";
						String notarizedCopyOfPassport = "";
						String notarizedCopyOfNational = "";
						String originalPoliceCertificate = "";
						String twoNotarizedPassport = "";
						String taxCompliance = "";
						String certificateOfIncorporation = "";
						String articlesOfIncorporation = "";
						String passportBioPage = "";
						String completeDueDiligence = "";
						List<CannabisSupportingDocumentsMaster> propertyDocuments = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocApplicant("Applicant", "Company", "Retail Licence");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : propertyDocuments) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
								e.printStackTrace();
							}
							if (title.equals("Certified copy of Driver�s Licence")) {
								certifiedCopyOfDriver = fileName;
							} else if (title.equals("Certified copy of Passport Bio-page")) {
								cretificteCopyOfPassport = fileName;
							} else if (title.equals("Certified copy of National Identification Card")) {
								certifiedCopyOfNational = fileName;
							} else if (title.equals(
									"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
								certifiedCopyOfTRC = fileName;
							} else if (title.equals(
									"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant, for each director and for each shareholder (only) with at least 10% shareholding")) {
								signedOriginalPolice = fileName;
							} else if (title.equals(
									"Two (2) certified passport sized photographs for each director and shareholder")) {
								twoCertifiedOfPassport = fileName;
							} else if (title.equals("Notarized copy of Driver�s Licence")) {
								notarizedCopyOfDriver = fileName;
							} else if (title.equals("Notarized copy of Passport Bio-page")) {
								notarizedCopyOfPassport = fileName;
							} else if (title.equals("Notarized copy of National Identification Card")) {
								notarizedCopyOfNational = fileName;
							} else if (title.equals(
									"Original Police Certificate from country of residence addressed for each director and for each shareholder (only) with at least 10% shareholding")) {
								originalPoliceCertificate = fileName;
							} else if (title.equals(
									"Two (2) notarized passport sized photographs for each director and shareholder")) {
								twoNotarizedPassport = fileName;
							} else if (title.equals("Tax Compliance Notification Letter")) {
								taxCompliance = fileName;
							} else if (title.equals("Certificate of Incorporation")) {
								certificateOfIncorporation = fileName;
							} else if (title.equals("Articles of Incorporation")) {
								articlesOfIncorporation = fileName;
							} else if (title.equals("Passport Bio-page, if not already uploaded")) {
								passportBioPage = fileName;
							} else if (title.equals("Completed Due Diligence Requirement Form")) {
								completeDueDiligence = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//									for the document 
								"[$CertifiedCopyOfDriver$]", "[$CertifiedCopyOfPassport$]",
								"[$CertifiesCopyOfNationalIdentification$]", "[$CertifiedCopyOfTRC$]",
								"[$SignedOriginalPolice$]", "[$TwoCertifiedPassport$]", "[$NotarizedCopyOfDriver$]",
								"[$NotarizedCopyOfPassportBioPage$]", "[$NotarIzedCopyOfNational$]",
								"[$OriginalPoliceCertificaeFromCountry$]", "[$NotarizedPassportSizedPhoto$]",
								"[$TaxComplianceNotification$]", "[$CertificateOfIncorporation$]",
								"[$ArticleOfIncorporation$]", "[$PassportBioPage$]", "[$CompleteDueDiligence$]" },
								new String[] {
//									for the document 
										certifiedCopyOfDriver, cretificteCopyOfPassport, certifiedCopyOfNational,
										certifiedCopyOfTRC, signedOriginalPolice, twoCertifiedOfPassport,
										notarizedCopyOfDriver, notarizedCopyOfPassport, notarizedCopyOfNational,
										originalPoliceCertificate, twoNotarizedPassport, taxCompliance,
										certificateOfIncorporation, articlesOfIncorporation, passportBioPage,
										completeDueDiligence });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certificate = "";
						String certificateCopyOfTwoStatutory = "";
						String proofOfPaymentTaxes = "";
						String surveyDiagram = "";
						List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Property", "Company", "Retail Licence",
										"Registered Land Applicant Owns Property");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals(
									"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
								certificate = fileName;
							} else if (title
									.equals("Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
								certificateCopyOfTwoStatutory = fileName;
							} else if (title.equals(
									"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
								proofOfPaymentTaxes = fileName;
							} else if (title.equals(
									"Survey Diagram showing entrance exits receival loading and storage areas")) {
								surveyDiagram = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//											for the document 
								"[$CertifiedCopyOfCertificareIfTitle$]", "[$CertifiedCopyOfTwo$]",
								"[$ProofOfPaymentOfProperty$]", "[$SurveyDiagram$]" }, new String[] {
//											for the document 
										certificate, certificateCopyOfTwoStatutory, proofOfPaymentTaxes,
										surveyDiagram });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certificateCopyOfDriver = "";
						String certificateCopyOfPassport = "";
						String certifiedcopyOfNational = "";
						String certifiedCopyOfTRCCard = "";
						String signedOriginalPoliceCertified = "";
						String twoCertified = "";
						String certifiedOfRegistration = "";
						String registryOfTheMember = "";
						String passportBioPageIf = "";
						String completeDueDiligenceRequirement = "";
						List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocApplicant("Applicant", "Cooperative", "Retail Licence");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals("Certified copy of Driver�s Licence")) {
								certificateCopyOfDriver = fileName;
							} else if (title.equals("Certified copy of Passport Bio-page")) {
								certificateCopyOfPassport = fileName;
							} else if (title.equals("Certified copy of National Identification Card")) {
								certifiedcopyOfNational = fileName;
							} else if (title.equals(
									"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
								certifiedCopyOfTRCCard = fileName;
							} else if (title.equals(
									"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant for each Board member")) {
								signedOriginalPoliceCertified = fileName;
							} else if (title.equals("Two (2) certified passport sized photographs for each member")) {
								twoCertified = fileName;
							} else if (title
									.equals("Certificate of Registration as a Co-operative or Friendly Society")) {
								certifiedOfRegistration = fileName;
							} else if (title
									.equals("Registry of the members of the Co-operative or Friendly Society")) {
								registryOfTheMember = fileName;
							} else if (title.equals("Passport Bio-page, if not already uploaded")) {
								passportBioPageIf = fileName;
							} else if (title.equals("Completed Due Diligence Requirement Form")) {
								completeDueDiligenceRequirement = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//											for the document 
								"[$CertifiedCopyOfDriver$]", "[$CertifiedCopyOfPassport$]",
								"[$CertifiesCopyOfNationalIdentification$]", "[$CertifiedCopyOfTRC$]",
								"[$SignedOriginalPoliceCertificate$]", "[$CertifiedPassportSizedPhoto$]",
								"[$CertifiedOfRegistration$]", "[$RegistryOfTheMember$]", "[$PassportBioPage$]",
								"[$CompleteDueDiligence$]" }, new String[] {
//											for the document 
										certificateCopyOfDriver, certificateCopyOfPassport, certifiedcopyOfNational,
										certifiedCopyOfTRCCard, signedOriginalPoliceCertified, twoCertified,
										certifiedOfRegistration, registryOfTheMember, passportBioPageIf,
										completeDueDiligenceRequirement });
					}
					if (Validator.isNotNull(supportingDocumentsFolder)) {
						String certificate = "";
						String certificateCopyOfTwoStatutory = "";
						String proofOfPaymentTaxes = "";
						String surveyDiagram = "";
						List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
								.getSupportingDocProperty("Property", "Cooperative", "Retail Licence",
										"Registered Land Applicant Owns Property");
						for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
							String fileName = "";
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
										supportingDocumentsFolder.getFolderId(),
										cannabisSupportingDocumentsMaster.getDocumentName());
								fileName = fileEntry.getFileName();
								title = fileEntry.getTitle();
							} catch (Exception e) {
							}
							if (title.equals(
									"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
								certificate = fileName;
							} else if (title
									.equals("Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
								certificateCopyOfTwoStatutory = fileName;
							} else if (title.equals(
									"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
								proofOfPaymentTaxes = fileName;
							} else if (title.equals(
									"Survey Diagram showing entrance exits receival loading and storage areas")) {
								surveyDiagram = fileName;
							}
						}
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//											for the document 
								"[$CertifiedCopyOfCertificareIfTitle$]", "[$CertifiedCopyOfTwo$]",
								"[$ProofOfPaymentOfProperty$]", "[$SurveyDiagram$]" }, new String[] {
//											for the document 
										certificate, certificateCopyOfTwoStatutory, proofOfPaymentTaxes,
										surveyDiagram });
					}
				}
			}
		}
		return pdfTemplate;
	}

	@Override
	public synchronized void updateFolderPermissionGuest(DLFolder dlFolder) throws Exception {
		// TODO Auto-generated method stub
		ResourcePermission resourcePermission = null;
		final Role siteMemberRole = RoleLocalServiceUtil.getRole(dlFolder.getCompanyId(), RoleConstants.GUEST);
		ResourceAction resourceAction = ResourceActionLocalServiceUtil.getResourceAction(DLFolder.class.getName(),
				ActionKeys.VIEW);

		try {
			resourcePermission = ResourcePermissionLocalServiceUtil.getResourcePermission(dlFolder.getCompanyId(),
					DLFolder.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
					String.valueOf(dlFolder.getPrimaryKey()), siteMemberRole.getRoleId());

			if (Validator.isNotNull(resourcePermission)) {

				resourcePermission.setActionIds(resourceAction.getBitwiseValue());
				ResourcePermissionLocalServiceUtil.updateResourcePermission(resourcePermission);
			}
		} catch (NoSuchResourcePermissionException e) {

			resourcePermission = ResourcePermissionLocalServiceUtil
					.createResourcePermission(CounterLocalServiceUtil.increment());
			resourcePermission.setCompanyId(dlFolder.getCompanyId());
			resourcePermission.setName(DLFolder.class.getName());
			resourcePermission.setScope(ResourceConstants.SCOPE_INDIVIDUAL);
			resourcePermission.setPrimKey(String.valueOf(dlFolder.getPrimaryKey()));
			resourcePermission.setRoleId(siteMemberRole.getRoleId());
			resourcePermission.setActionIds(resourceAction.getBitwiseValue());// (ActionKeys.VIEW);
			ResourcePermissionLocalServiceUtil.addResourcePermission(resourcePermission);
		}
	}

	@Override
	public String replaceCannabisPdfVarForCompanyForResearchAndDevelopment(long cannabisApplicationId,
			ThemeDisplay themeDisplay, String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		CannabisApplications cannabisApplications = CannabisApplicationsLocalServiceUtil
				.getCannabisApplications(cannabisApplicationId);
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		DLFolder supportingDocumentsParentFolder = null;
		DLFolder supportingDocumentsFolder = null;
		String previewUrlforAutorizationBackground = null;
		String previewUrlforSupplymentInfoSignature = null;
		try {
			List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Cannabis Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(cannabisApplications.getCannabisApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		try {
			previewUrlforAutorizationBackground = replaceSignatureforCannabis(
					cannabisApplications.getCannabisApplicationId(), "Cannabis Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			previewUrlforSupplymentInfoSignature = replaceSignatureforSupplimentInfo(
					cannabisApplications.getCannabisApplicationId(), "Cannabis Supported Documents",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String pdfTemplate = StringPool.BLANK;
		CannabisApplicationCompanyInfo applicationCompanyInfo = null;
		CannabisApplicationCompanyAddress cannabisApplicationRegisteredCompanyAddress = null;
		CannabisApplicationCompanyAddress cannabisApplicationMailingCompanyAddress = null;
		CannabisApplicationCompanyAuthorizedAgent cannabisApplicationCompanyAuthorizedAgent = null;
		List<GeneralDelarations> generalDelarations = null;
		List<StatementOfFinancialHistory> financialHistories = null;
		List<CannabisSupplementalInformation> cannabisSupplementalInformations = null;
		List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners = null;
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwners = null;
		List<CannabisOccupationaLicense> occupationaLicenses = null;
		List<com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnership> declarationOfOwnerships = null;
		CannabisApplicationPayment cannabisPayment = null;
		try {
			applicationCompanyInfo = CannabisApplicationCompanyInfoLocalServiceUtil
					.getCA_CI_by_AppId(cannabisApplicationId);
		}catch (Exception e) {
		}try {
			cannabisApplicationRegisteredCompanyAddress = CannabisApplicationCompanyAddressLocalServiceUtil
					.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.REGISTERED_ADDRESS,
							applicationCompanyInfo.getCompanyInformationId());
		}catch (Exception e) {
		}try {
			cannabisApplicationMailingCompanyAddress = CannabisApplicationCompanyAddressLocalServiceUtil
					.getCA_CA_by_CI_AT(CommonsUtilWorkFlowConstants.MAILING_ADDRESS,
							applicationCompanyInfo.getCompanyInformationId());
		}catch (Exception e) {
		}try {
			cannabisApplicationCompanyAuthorizedAgent = CannabisApplicationCompanyAuthorizedAgentLocalServiceUtil
					.getCAA_by_CAI(cannabisApplicationId);
		}catch (Exception e) {
		}try {
			generalDelarations = GeneralDelarationsLocalServiceUtil.getCA_GD_CAI(cannabisApplicationId);
		}catch (Exception e) {
		}try {
			financialHistories = StatementOfFinancialHistoryLocalServiceUtil.getSOFH_by_CAI(cannabisApplicationId);
		}catch (Exception e) {
		}try {
			cannabisSupplementalInformations = CannabisSupplementalInformationLocalServiceUtil
					.getCA_SI_CAI(cannabisApplicationId);
		}catch (Exception e) {
		}try {
			cannabisConsentBySoleOwners = CannabisConsentBySoleOwnerLocalServiceUtil
					.getCA_CSO_BY_CAI(cannabisApplicationId);
		}catch (Exception e) {
		}try {
			cannabisConsentByPropertyOwners = CannabisConsentByPropertyOwnerLocalServiceUtil
					.getCA_CPO_CAI(cannabisApplicationId);
		}catch (Exception e) {
		}try {
			occupationaLicenses = CannabisOccupationaLicenseLocalServiceUtil.getCA_OL_CAI(cannabisApplicationId);
		}catch (Exception e) {
		}try {
			declarationOfOwnerships = CannabisDeclarationOfOwnershipLocalServiceUtil
					.getCA_DO_CAI(cannabisApplicationId);
		}catch (Exception e) {
		}try {
				cannabisPayment = CannabisApplicationPaymentLocalServiceUtil
						.getCannabisApplicationPaymentByCannabisAppId(cannabisApplicationId);
			} catch (Exception e) {
			}
		pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
				"cannabis_application_company_research_form");
		if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
					"cannabis_application_company_research_form");
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate,
					new String[] { "[$AFCL_LicenseCategory$]", "[$ThisIsYourFirstTimeApplying$]",
							"[$AFCL_NAMEOFCOMPANYBUSINESSCOOPERATIVE$]", "[$AFCL_StreetApt$]", "[$AFCL_TownCity$]",
							"[$AFCL_Parish$]", "[$AFCL_MAILINGADDRESSStreetApt$]", "[$AFCL_MAILINGADDRESSTownCity$]",
							"[$AFCL_MAILINGADDRESSParish$]", "[$AFCL_TRN$]", "[$AFCL_TYPEOFCOMPANYBUSINESS$]",
							"[$AFCL_COMPANYTYPE$]", "[$AFCL_REGISTRATIONNUMBER$]", "[$AFCL_ContactNumbers$]",
							"[$AFCL_EmailAddress$]", "[$AFCL_AuthorizedAgentSurname$]",
							"[$AFCL_AuthorizedAgentFirstName$]", "[$AFCL_AuthorizedAgentMiddleName$]",
							"[$AFCL_AuthorizedAgentPosition$]", "[$AFCL_AuthorizedAgentGender$]",
							"[$AFCL_AuthorizedAgentDateofBirth$]", "[$AFCL_AuthorizedAgentContactNumbers$]",
							"[$AFCL_AuthorizedAgentEmailAdresse$]",
//for the general Delarations				
							"[$UnderTheAgeOfEighteen$]", "[$PropertyOwner$]",
							"[$IsRegisteredOrUnregisteredIfTitleOwnerOrNot$]", "[$OnlyTitleOwnerIfRegistered$]",
							"[$IfNotOnlyOwner$]", "[$OwnerNameIfRegistered$]", "[$DeclarentNameIfUnRegistered$]",
							"[$LicensedMotorVehicle$]", "[$LicenceToHandleGanja$]", "[$StateJurisdiction$]",
							"[$TypeOfLicense$]", "[$LicenseStatus$]", "[$AppliedForGamingOrRacingLicence$]",
							"[$StateJurisdiction$]", "[$TypeOfLicense$]", "[$LicenseStatus$]",
							"[$ConvictedOfAnyCrime$]", "[$TypeOfCrime$]", "[$LocationOfYourProperty$]",
							"[$BeneficialOwnerOfTheCompany$]", "[$RelatedEntitiesIfApplicable$]",

//for the STATEMENT OF FINANCIAL HISTORY		
							"[$JudgmentsOrTaxLiabilities$]", "[$SuchPetitionFiledAgainstIt$]",
							"[$BusinessTrustInstrument$]", "[$ViolationOfAnyFinancialOrTrade$]", "[$OtherCountry$]",
							"[$StatementsEitherAuditedOrUnaudited$]", "[$AFCL_ApplicantSURNAME$]",
							"[$AFCL_ApplicantFIRSTNAME$]", "[$Signature1$]", "[$AFCL_ApplicantSURNAME$]",
							"[$AFCL_ApplicantFIRSTNAME$]",

//for the  Research and Development Licence
							"[$WhatIsTheSizeOfIndoorProperty$]", "[$WhatIsTheSizeOfOutdoorProperty$]",
							"[$PlanUndertaking$]", "[$AFCL_Doyouintendtoresearchotheritemsonthesamepremises$]",
							"[$AFCL_ApplicantSURNAME$]", "[$AFCL_ApplicantFIRSTNAME$],"
//for the Consent Property Owners
							, "[$TypeOfProperty$]", "[$DescriptionOfProperty$]",
							"[$DescriptionOfIntendedUseOfPropertyToCannabis$]",
//								for the sole owner 
							"[$OwnerName1$]", "[$OwnerDate1$]", "[$OwnerPhone1$]", "[$OwnerAddress1$]", "[OwnerName2$]",
							"[$OwnerDate2$]", "[$OwnerPhone2$]", "[$OwnerAddress2$]", "[$OwnerName3$]",
							"[$OwnerDate3$]", "[$OwnerPhone3$]", "[$OwnerAddress3$]", "[$OwnerName4$]",
							"[$OwnerDate4$]", "[$OwnerPhone4$]", "[$OwnerAddress4$]", "[$OwnerName5$]",
							"[$OwnerDate5$]", "[$OwnerPhone5$]", "[$OwnerAddress5$]",
//							for the ocuupational licence 
							"[$First1$]", "[$Middle1$]", "[$Surname1$]", "[$Position1$]", "[$Managment1$]",
							"[$Director1$]", "[$TRN1$]", "[$Birth1$]", "[$IDNumber1$]", "[$TypeID1$]", "[$First2$]",
							"[$Middle2$]", "[$Surname2$]", "[$Position2$]", "[$Managment2$]", "[$Director2$]",
							"[$TRN2$]", "[$Birth2$]", "[$IDNumber2$]", "[$TypeID2$]", "[$First3$]", "[$Middle3$]",
							"[$Surname3$]", "[$Position3$]", "[$Managment3$]", "[$Director3$]", "[$TRN3$]",
							"[$Birth3$]", "[$IDNumber3$]", "[$TypeID3$]", "[$First4$]", "[$Middle4$]", "[$Surname4$]",
							"[$Position4$]", "[$Managment4$]", "[$Director4$]", "[$TRN4$]", "[$Birth4$]",
							"[$IDNumber4$]", "[$TypeID4$]", "[$First5$]", "[$Middle5$]", "[$Surname5$]",
							"[$Position5$]", "[$Managment5$]", "[$Director5$]", "[$TRN5$]", "[$Birth5$]",
							"[$IDNumber5$]", "[$TypeID5$]",
//for the declaration of ownerShip
							"[$DeFirst1$]", "[$DeMiddle1$]", "[$DeSurname1$]", "[$DePosition1$]", "[De$Ownership1$]",
							"[$DeCitizenship1$]", "[$DeTRN1$]", "[$DateofBirth1$]", "[$DeID1$]", "[$DeType1$]",
							"[$DeFirst2$]", "[$DeMiddle2$]", "[$DeSurname2$]", "[$DePosition2$]", "[$DeOwnership2$]",
							"[$DeCitizenship2$]", "[$DeTRN2$]", "[$DateofBirth2$]", "[$DeID2$]", "[$DeType2$]",
							"[$DeFirst3$]", "[$DeMiddle3$]", "[$DeSurname3$]", "[$DePosition3$]", "[$DeOwnership3$]",
							"[$DeCitizenship3$]", "[$DeTRN3$]", "[$DateofBirth3$]", "[$DeID3$]", "[$DeType3$]",
							"[$DeFirst4$]", "[$DeMiddle4$]", "[$DeSurname4$]", "[$DePosition4$]", "[$DeOwnership4$]",
							"[$DeCitizenship4$]", "[$DeTRN4$]", "[$DateofBirth4$]", "[$DeID4$]", "[$DeType4$]",
							"[$DeFirst5$]", "[$DeMiddle5$]", "[$DeSurname5$]", "[$DePosition5$]", "[$DeOwnership5$]",
							"[$DeCitizenship5$]", "[$DeTRN5$]", "[$DateofBirth5$]", "[$DeID5$]", "[$DeType5$]",
							"[$PaymentMethod$]", "[$Signature2$]", "[$Date$]", },
					new String[] { cannabisApplications.getLicenseCategory(), cannabisApplications.getRequestType(),
							applicationCompanyInfo.getCompanyName(),
							cannabisApplicationRegisteredCompanyAddress.getStreetName(),
							cannabisApplicationRegisteredCompanyAddress.getTown(),
							cannabisApplicationRegisteredCompanyAddress.getParish(),
							cannabisApplicationMailingCompanyAddress.getStreetName(),
							cannabisApplicationMailingCompanyAddress.getTown(),
							cannabisApplicationMailingCompanyAddress.getParish(), applicationCompanyInfo.getTrn(),
							applicationCompanyInfo.getTypeOfCompany(), applicationCompanyInfo.getOtherCompanyType(),
							applicationCompanyInfo.getRegistrationNumber(),
							applicationCompanyInfo.getContactPhoneNumber(), applicationCompanyInfo.getEmailAddress(),
							cannabisApplicationCompanyAuthorizedAgent.getSurname(),
							cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
							cannabisApplicationCompanyAuthorizedAgent.getMiddleName(),
							cannabisApplicationCompanyAuthorizedAgent.getPosition(),
							cannabisApplicationCompanyAuthorizedAgent.getGender(),
							cannabisApplicationCompanyAuthorizedAgent != null
									&& cannabisApplicationCompanyAuthorizedAgent.getDateOfBirth() != null
											? new SimpleDateFormat("yyyy-MM-dd")
													.format(cannabisApplicationCompanyAuthorizedAgent.getDateOfBirth())
											: StringPool.BLANK,
							cannabisApplicationCompanyAuthorizedAgent.getContactPhoneNumber(),
							cannabisApplicationCompanyAuthorizedAgent.getEmailAddress(),
//							for the general Delarations	
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 0
									? generalDelarations.get(0).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 1
									? generalDelarations.get(1).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 16
									? generalDelarations.get(16).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 17
									? generalDelarations.get(17).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 18
									? generalDelarations.get(18).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 19
									? generalDelarations.get(19).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 3
									? generalDelarations.get(3).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 20
									? generalDelarations.get(20).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 21
									? generalDelarations.get(21).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 4
									? generalDelarations.get(4).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 5
									? generalDelarations.get(5).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 6
									? generalDelarations.get(6).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 7
									? generalDelarations.get(7).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 8
									? generalDelarations.get(8).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 9
									? generalDelarations.get(9).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 10
									? generalDelarations.get(10).getAnswer()
									: "",

							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 11
									? generalDelarations.get(11).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 12
									? generalDelarations.get(12).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 13
									? generalDelarations.get(13).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 14
									? generalDelarations.get(14).getAnswer()
									: "",
							Validator.isNotNull(generalDelarations) && generalDelarations.size() > 15
									? generalDelarations.get(15).getAnswer()
									: "",
							// for the financial Histories
							Validator.isNotNull(financialHistories) && financialHistories.size() > 0
									? financialHistories.get(0).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 1
									? financialHistories.get(1).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 2
									? financialHistories.get(2).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 3
									? financialHistories.get(3).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 4
									? financialHistories.get(4).getAnswer()
									: "",
							Validator.isNotNull(financialHistories) && financialHistories.size() > 5
									? financialHistories.get(5).getAnswer()
									: "",
							cannabisApplicationCompanyAuthorizedAgent.getSurname(),
							cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
							previewUrlforAutorizationBackground, cannabisApplicationCompanyAuthorizedAgent.getSurname(),
							cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
							// for thr processor
							Validator.isNotNull(cannabisSupplementalInformations)
									&& cannabisSupplementalInformations.size() > 0
											? cannabisSupplementalInformations.get(0).getAnswer()
											: "",
							Validator.isNotNull(cannabisSupplementalInformations)
									&& cannabisSupplementalInformations.size() > 1
											? cannabisSupplementalInformations.get(1).getAnswer()
											: "",
							Validator.isNotNull(cannabisSupplementalInformations)
									&& cannabisSupplementalInformations.size() > 2
											? cannabisSupplementalInformations.get(2).getAnswer()
											: "",
							Validator.isNotNull(cannabisSupplementalInformations)
									&& cannabisSupplementalInformations.size() > 3
											? cannabisSupplementalInformations.get(3).getAnswer()
											: "",
							cannabisApplicationCompanyAuthorizedAgent.getSurname(),
							cannabisApplicationCompanyAuthorizedAgent.getFirstName(),
							// for the Consent Property Owners
							Validator.isNotNull(cannabisConsentByPropertyOwners)
									&& Validator.isNotNull(cannabisConsentByPropertyOwners.getTypeOfProperty())
											? cannabisConsentByPropertyOwners.getTypeOfProperty()
											: "",
							Validator.isNotNull(cannabisConsentByPropertyOwners)
									&& Validator.isNotNull(cannabisConsentByPropertyOwners.getDescriptionOfProperty())
											? cannabisConsentByPropertyOwners.getDescriptionOfProperty()
											: "",
							Validator.isNotNull(cannabisConsentByPropertyOwners) && Validator
									.isNotNull(cannabisConsentByPropertyOwners.getDescriptionOfIntendedUse())
											? cannabisConsentByPropertyOwners.getDescriptionOfIntendedUse()
											: "",
//							for the sole owner 
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 0
									? cannabisConsentBySoleOwners.get(0).getOwnerName()
									: "",
							cannabisConsentBySoleOwners.size() >= 0
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(0).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(0).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 0
									? cannabisConsentBySoleOwners.get(0).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 0
									? cannabisConsentBySoleOwners.get(0).getOwnerAddress()
									: "",

							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 1
									? cannabisConsentBySoleOwners.get(1).getOwnerName()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 1
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(1).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 1
									? cannabisConsentBySoleOwners.get(1).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 1
									? cannabisConsentBySoleOwners.get(1).getOwnerAddress()
									: "",

							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 2
									? cannabisConsentBySoleOwners.get(2).getOwnerName()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 2
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(2).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(1).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 2
									? cannabisConsentBySoleOwners.get(2).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 2
									? cannabisConsentBySoleOwners.get(2).getOwnerAddress()
									: "",

							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 3
									? cannabisConsentBySoleOwners.get(3).getOwnerName()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 3
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(3).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(3).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 3
									? cannabisConsentBySoleOwners.get(3).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 3
									? cannabisConsentBySoleOwners.get(3).getOwnerAddress()
									: "",

							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 4
									? cannabisConsentBySoleOwners.get(4).getOwnerName()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 4
									&& Validator.isNotNull(cannabisConsentBySoleOwners.get(4).getDate())
											? dateFormat.format(cannabisConsentBySoleOwners.get(4).getDate())
											: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 4
									? cannabisConsentBySoleOwners.get(4).getOwnerPhone()
									: "",
							Validator.isNotNull(cannabisConsentBySoleOwners) && cannabisConsentBySoleOwners.size() > 4
									? cannabisConsentBySoleOwners.get(4).getOwnerAddress()
									: "",
							// for the occupationaLicenses
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
									? occupationaLicenses.get(0).getFirstName()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
									? occupationaLicenses.get(0).getMiddleName()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
									? occupationaLicenses.get(0).getSurname()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
									? occupationaLicenses.get(0).getPosition()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
									? occupationaLicenses.get(0).getManagement()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
									? occupationaLicenses.get(0).getDirector()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
									? occupationaLicenses.get(0).getTrn()
									: "",
							occupationaLicenses.size() > 1 && Validator.isNotNull(occupationaLicenses.get(0).getDob())
									? dateFormat.format(occupationaLicenses.get(0).getDob())
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
									? occupationaLicenses.get(0).getIdNumber()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() >= 0
									? occupationaLicenses.get(0).getTypeOfId()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
									? occupationaLicenses.get(1).getFirstName()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
									? occupationaLicenses.get(1).getMiddleName()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
									? occupationaLicenses.get(1).getSurname()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
									? occupationaLicenses.get(1).getPosition()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
									? occupationaLicenses.get(1).getManagement()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
									? occupationaLicenses.get(1).getDirector()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
									? occupationaLicenses.get(1).getTrn()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
									&& Validator.isNotNull(occupationaLicenses.get(1).getDob())
											? dateFormat.format(occupationaLicenses.get(1).getDob())
											: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
									? occupationaLicenses.get(1).getIdNumber()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 1
									? occupationaLicenses.get(1).getTypeOfId()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
									? occupationaLicenses.get(2).getFirstName()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
									? occupationaLicenses.get(2).getMiddleName()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
									? occupationaLicenses.get(2).getSurname()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
									? occupationaLicenses.get(2).getPosition()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
									? occupationaLicenses.get(2).getManagement()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
									? occupationaLicenses.get(2).getDirector()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
									? occupationaLicenses.get(2).getTrn()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
									&& Validator.isNotNull(occupationaLicenses.get(2).getDob())
											? dateFormat.format(occupationaLicenses.get(2).getDob())
											: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
									? occupationaLicenses.get(2).getIdNumber()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 2
									? occupationaLicenses.get(2).getTypeOfId()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
									? occupationaLicenses.get(3).getFirstName()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
									? occupationaLicenses.get(3).getMiddleName()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
									? occupationaLicenses.get(3).getSurname()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
									? occupationaLicenses.get(3).getPosition()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
									? occupationaLicenses.get(3).getManagement()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
									? occupationaLicenses.get(3).getDirector()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
									? occupationaLicenses.get(3).getTrn()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
									&& Validator.isNotNull(occupationaLicenses.get(3).getDob())
											? dateFormat.format(occupationaLicenses.get(3).getDob())
											: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
									? occupationaLicenses.get(3).getIdNumber()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 3
									? occupationaLicenses.get(3).getTypeOfId()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
									? occupationaLicenses.get(4).getFirstName()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
									? occupationaLicenses.get(4).getMiddleName()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
									? occupationaLicenses.get(4).getSurname()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
									? occupationaLicenses.get(4).getPosition()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
									? occupationaLicenses.get(4).getManagement()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
									? occupationaLicenses.get(4).getDirector()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
									? occupationaLicenses.get(4).getTrn()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
									&& Validator.isNotNull(occupationaLicenses.get(4).getDob())
											? dateFormat.format(occupationaLicenses.get(4).getDob())
											: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
									? occupationaLicenses.get(4).getIdNumber()
									: "",
							Validator.isNotNull(occupationaLicenses) && occupationaLicenses.size() > 4
									? occupationaLicenses.get(4).getTypeOfId()
									: "",
//																		for the declaration of ownership
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
									? declarationOfOwnerships.get(0).getFirstName()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
									? declarationOfOwnerships.get(0).getMiddleName()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
									? declarationOfOwnerships.get(0).getSurname()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
									? declarationOfOwnerships.get(0).getPosition()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
									? declarationOfOwnerships.get(0).getPercentOfOwnership()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
									? declarationOfOwnerships.get(0).getCitizenship()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
									? declarationOfOwnerships.get(0).getTrn().toString()
									: "",
							declarationOfOwnerships.size() > 1
									&& Validator.isNotNull(declarationOfOwnerships.get(0).getDob())
											? dateFormat.format(declarationOfOwnerships.get(0).getDob())
											: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
									? declarationOfOwnerships.get(0).getIdNumber()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 0
									? declarationOfOwnerships.get(0).getTypeOfId()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
									? declarationOfOwnerships.get(1).getFirstName()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
									? declarationOfOwnerships.get(1).getMiddleName()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
									? declarationOfOwnerships.get(1).getSurname()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
									? declarationOfOwnerships.get(1).getPosition()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
									? declarationOfOwnerships.get(1).getPercentOfOwnership()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
									? declarationOfOwnerships.get(1).getCitizenship()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
									? declarationOfOwnerships.get(1).getTrn()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
									&& Validator.isNotNull(declarationOfOwnerships.get(1).getDob())
											? dateFormat.format(declarationOfOwnerships.get(1).getDob())
											: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
									? declarationOfOwnerships.get(1).getIdNumber()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 1
									? declarationOfOwnerships.get(1).getTypeOfId()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
									? declarationOfOwnerships.get(2).getFirstName()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
									? declarationOfOwnerships.get(2).getMiddleName()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
									? declarationOfOwnerships.get(2).getSurname()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
									? declarationOfOwnerships.get(2).getPosition()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
									? declarationOfOwnerships.get(2).getPercentOfOwnership()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
									? declarationOfOwnerships.get(2).getCitizenship()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
									? declarationOfOwnerships.get(2).getTrn()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
									&& Validator.isNotNull(declarationOfOwnerships.get(2).getDob())
											? dateFormat.format(declarationOfOwnerships.get(2).getDob())
											: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
									? declarationOfOwnerships.get(2).getIdNumber()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 2
									? declarationOfOwnerships.get(2).getTypeOfId()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
									? declarationOfOwnerships.get(3).getFirstName()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
									? declarationOfOwnerships.get(3).getMiddleName()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
									? declarationOfOwnerships.get(3).getSurname()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
									? declarationOfOwnerships.get(3).getPosition()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
									? declarationOfOwnerships.get(3).getPercentOfOwnership()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
									? declarationOfOwnerships.get(3).getCitizenship()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
									? declarationOfOwnerships.get(3).getTrn()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
									&& Validator.isNotNull(declarationOfOwnerships.get(3).getDob())
											? dateFormat.format(declarationOfOwnerships.get(3).getDob())
											: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
									? declarationOfOwnerships.get(3).getIdNumber()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 3
									? declarationOfOwnerships.get(3).getTypeOfId()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
									? declarationOfOwnerships.get(4).getFirstName()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
									? declarationOfOwnerships.get(4).getMiddleName()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
									? declarationOfOwnerships.get(4).getSurname()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
									? declarationOfOwnerships.get(4).getPosition()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
									? declarationOfOwnerships.get(4).getPercentOfOwnership()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
									? declarationOfOwnerships.get(4).getCitizenship()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
									? declarationOfOwnerships.get(4).getTrn()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
									&& Validator.isNotNull(declarationOfOwnerships.get(4).getDob())
											? dateFormat.format(declarationOfOwnerships.get(4).getDob())
											: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
									? declarationOfOwnerships.get(4).getIdNumber()
									: "",
							Validator.isNotNull(declarationOfOwnerships) && declarationOfOwnerships.size() > 4
									? declarationOfOwnerships.get(4).getTypeOfId()
									: "",
							Validator.isNotNull(cannabisPayment) ? cannabisPayment.getPaymentMethod() : "",
							previewUrlforSupplymentInfoSignature,
							Validator.isNotNull(cannabisApplications)
									? dateFormat.format(cannabisApplications.getCreateDate())
									: "", });
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("fasle")) {
			String title = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
				String certifiedCopyOfDriver = "";
				String cretificteCopyOfPassport = "";
				String certifiedCopyOfNational = "";
				String certifiedCopyOfTRC = "";
				String signedOriginalPolice = "";
				String twoCertifiedOfPassport = "";
				String notarizedCopyOfDriver = "";
				String notarizedCopyOfPassport = "";
				String notarizedCopyOfNational = "";
				String originalPoliceCertificate = "";
				String twoNotarizedPassport = "";
				String taxCompliance = "";
				String certificateOfIncorporation = "";
				String articlesOfIncorporation = "";
				String passportBioPage = "";
				String completeDueDiligence = "";
				List<CannabisSupportingDocumentsMaster> propertyDocuments = CannabisSupportingDocumentsMasterLocalServiceUtil
						.getSupportingDocApplicant("Applicant", "Company", "Research and Development Licence");
				for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : propertyDocuments) {
					String fileName = "";
					try {
						FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
								supportingDocumentsFolder.getFolderId(),
								cannabisSupportingDocumentsMaster.getDocumentName());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (title.equals("Certified copy of Driver�s Licence")) {
						certifiedCopyOfDriver = fileName;
					} else if (title.equals("Certified copy of Passport Bio-page")) {
						cretificteCopyOfPassport = fileName;
					} else if (title.equals("Certified copy of National Identification Card")) {
						certifiedCopyOfNational = fileName;
					} else if (title.equals(
							"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
						certifiedCopyOfTRC = fileName;
					} else if (title.equals(
							"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant, for each director and for each shareholder (only) with at least 10% shareholding")) {
						signedOriginalPolice = fileName;
					} else if (title
							.equals("Two (2) certified passport sized photographs for each director and shareholder")) {
						twoCertifiedOfPassport = fileName;
					} else if (title.equals("Notarized copy of Driver�s Licence")) {
						notarizedCopyOfDriver = fileName;
					} else if (title.equals("Notarized copy of Passport Bio-page")) {
						notarizedCopyOfPassport = fileName;
					} else if (title.equals("Notarized copy of National Identification Card")) {
						notarizedCopyOfNational = fileName;
					} else if (title.equals(
							"Original Police Certificate from country of residence addressed for each director and for each shareholder (only) with at least 10% shareholding")) {
						originalPoliceCertificate = fileName;
					} else if (title
							.equals("Two (2) notarized passport sized photographs for each director and shareholder")) {
						twoNotarizedPassport = fileName;
					} else if (title.equals("Tax Compliance Notification Letter")) {
						taxCompliance = fileName;
					} else if (title.equals("Certificate of Incorporation")) {
						certificateOfIncorporation = fileName;
					} else if (title.equals("Articles of Incorporation")) {
						articlesOfIncorporation = fileName;
					} else if (title.equals("Passport Bio-page, if not already uploaded")) {
						passportBioPage = fileName;
					} else if (title.equals("Completed Due Diligence Requirement Form")) {
						completeDueDiligence = fileName;
					}
				}
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//								for the document 
						"[$CertifiedCopyOfDriver$]", "[$CertifiedCopyOfPassport$]",
						"[$CertifiesCopyOfNationalIdentification$]", "[$CertifiedCopyOfTRC$]",
						"[$SignedOriginalPolice$]", "[$TwoCertifiedPassport$]", "[$NotarizedCopyOfDriver$]",
						"[$NotarizedCopyOfPassportBioPage$]", "[$NotarIzedCopyOfNational$]",
						"[$OriginalPoliceCertificaeFromCountry$]", "[$NotarizedPassportSizedPhoto$]",
						"[$TaxComplianceNotification$]", "[$CertificateOfIncorporation$]", "[$ArticleOfIncorporation$]",
						"[$PassportBioPage$]", "[$CompleteDueDiligence$]" }, new String[] {
//								for the document 
								certifiedCopyOfDriver, cretificteCopyOfPassport, certifiedCopyOfNational,
								certifiedCopyOfTRC, signedOriginalPolice, twoCertifiedOfPassport, notarizedCopyOfDriver,
								notarizedCopyOfPassport, notarizedCopyOfNational, originalPoliceCertificate,
								twoNotarizedPassport, taxCompliance, certificateOfIncorporation,
								articlesOfIncorporation, passportBioPage, completeDueDiligence });
			}
			if (Validator.isNotNull(supportingDocumentsFolder)) {
				String certificate = "";
				String certificateCopyOfTwoStatutory = "";
				String proofOfPaymentTaxes = "";
				String surveyDiagram = "";
				List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
						.getSupportingDocProperty("Property", "Company", "Research and Development Licence",
								"Registered Land Applicant Owns Property");
				for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
					String fileName = "";
					try {
						FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
								supportingDocumentsFolder.getFolderId(),
								cannabisSupportingDocumentsMaster.getDocumentName());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
					} catch (Exception e) {
					}
					if (title.equals(
							"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
						certificate = fileName;
					} else if (title.equals("Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
						certificateCopyOfTwoStatutory = fileName;
					} else if (title.equals(
							"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
						proofOfPaymentTaxes = fileName;
					} else if (title
							.equals("Survey Diagram showing entrance exits receival loading and storage areas")) {
						surveyDiagram = fileName;
					}
				}
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//										for the document 
						"[$CertifiedCopyOfCertificareIfTitle$]", "[$CertifiedCopyOfTwo$]",
						"[$ProofOfPaymentOfProperty$]", "[$SurveyDiagram$]" }, new String[] {
//										for the document 
								certificate, certificateCopyOfTwoStatutory, proofOfPaymentTaxes, surveyDiagram });
			}
			if (Validator.isNotNull(supportingDocumentsFolder)) {
				String certificateCopyOfDriver = "";
				String certificateCopyOfPassport = "";
				String certifiedcopyOfNational = "";
				String certifiedCopyOfTRCCard = "";
				String signedOriginalPoliceCertified = "";
				String twoCertified = "";
				String certifiedOfRegistration = "";
				String registryOfTheMember = "";
				String passportBioPageIf = "";
				String completeDueDiligenceRequirement = "";
				List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
						.getSupportingDocApplicant("Applicant", "Cooperative", "Research and Development Licence");
				for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
					String fileName = "";
					try {
						FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
								supportingDocumentsFolder.getFolderId(),
								cannabisSupportingDocumentsMaster.getDocumentName());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
					} catch (Exception e) {
					}
					if (title.equals("Certified copy of Driver�s Licence")) {
						certificateCopyOfDriver = fileName;
					} else if (title.equals("Certified copy of Passport Bio-page")) {
						certificateCopyOfPassport = fileName;
					} else if (title.equals("Certified copy of National Identification Card")) {
						certifiedcopyOfNational = fileName;
					} else if (title.equals(
							"Certified copy of Taxpayer Registration Card (TRN), if no Driver�s Licence is submitted")) {
						certifiedCopyOfTRCCard = fileName;
					} else if (title.equals(
							"Signed original Police Certificate addressed to the Cannabis Licensing Authority or in the correct and full name of the applicant for each Board member")) {
						signedOriginalPoliceCertified = fileName;
					} else if (title.equals("Two (2) certified passport sized photographs for each member")) {
						twoCertified = fileName;
					} else if (title.equals("Certificate of Registration as a Co-operative or Friendly Society")) {
						certifiedOfRegistration = fileName;
					} else if (title.equals("Registry of the members of the Co-operative or Friendly Society")) {
						registryOfTheMember = fileName;
					} else if (title.equals("Passport Bio-page, if not already uploaded")) {
						passportBioPageIf = fileName;
					} else if (title.equals("Completed Due Diligence Requirement Form")) {
						completeDueDiligenceRequirement = fileName;
					}
				}
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//										for the document 
						"[$CertifiedCopyOfDriver$]", "[$CertifiedCopyOfPassport$]",
						"[$CertifiesCopyOfNationalIdentification$]", "[$CertifiedCopyOfTRC$]",
						"[$SignedOriginalPoliceCertificate$]", "[$CertifiedPassportSizedPhoto$]",
						"[$CertifiedOfRegistration$]", "[$RegistryOfTheMember$]", "[$PassportBioPage$]",
						"[$CompleteDueDiligence$]" }, new String[] {
//										for the document 
								certificateCopyOfDriver, certificateCopyOfPassport, certifiedcopyOfNational,
								certifiedCopyOfTRCCard, signedOriginalPoliceCertified, twoCertified,
								certifiedOfRegistration, registryOfTheMember, passportBioPageIf,
								completeDueDiligenceRequirement });
			}
			if (Validator.isNotNull(supportingDocumentsFolder)) {
				String certificate = "";
				String certificateCopyOfTwoStatutory = "";
				String proofOfPaymentTaxes = "";
				String surveyDiagram = "";
				List<CannabisSupportingDocumentsMaster> supportingMaster = CannabisSupportingDocumentsMasterLocalServiceUtil
						.getSupportingDocProperty("Property", "Cooperative", "Research and Development Licence",
								"Registered Land Applicant Owns Property");
				for (CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster : supportingMaster) {
					String fileName = "";
					try {
						FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
								supportingDocumentsFolder.getFolderId(),
								cannabisSupportingDocumentsMaster.getDocumentName());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
					} catch (Exception e) {
					}
					if (title.equals(
							"Certified copy of Certificate of Title/Will/Deed of Gift/Contract of Sale (Registered Land)")) {
						certificate = fileName;
					} else if (title.equals("Certified copy of Two (2) Statutory Declarations (Unregistered Land)")) {
						certificateCopyOfTwoStatutory = fileName;
					} else if (title.equals(
							"Proof of Payment of Property Taxes Paid up to Current Financial Year April 1 to March 31")) {
						proofOfPaymentTaxes = fileName;
					} else if (title
							.equals("Survey Diagram showing entrance exits receival loading and storage areas")) {
						surveyDiagram = fileName;
					}
				}
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//										for the document 
						"[$CertifiedCopyOfCertificareIfTitle$]", "[$CertifiedCopyOfTwo$]",
						"[$ProofOfPaymentOfProperty$]", "[$SurveyDiagram$]" }, new String[] {
//										for the document 
								certificate, certificateCopyOfTwoStatutory, proofOfPaymentTaxes, surveyDiagram });
			}
		}
		return pdfTemplate;
	}

	@Override
	public JSONObject gettingSupportingDocumentArray(ResourceRequest resourceRequest, String applicationCategory,
			String apiPathModuleName) {
		Log _log = LogFactoryUtil.getLog(CommonsUtil.class.getName());
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String authenticationKey = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("authentication-key");
		String getDocumentEndpoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("get-document-url");
		JSONObject documentListJsonArray = new JSONFactoryUtil().createJSONObject();
		try {
			HttpResponse<String> response = null;
			try {
				response = Unirest.get(getDocumentEndpoint + "o/c/" + apiPathModuleName + "/?pageSize=-1")
						.header("Authorization", "Basic " + authenticationKey).asString();
			} catch (Exception e) {
				e.printStackTrace();
				e.getCause();
				e.getMessage();
			}
			JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
			JSONArray itemsJsonArray = responseJsonObj.getJSONArray("items");

			ArrayList<String> requiredDocumentList = new ArrayList<String>();
			ArrayList<String> notRequiredDocumentList = new ArrayList<String>();
			for (int i = 0; i < itemsJsonArray.length(); i++) {
				JSONObject supportingDocumentObject = itemsJsonArray.getJSONObject(i);
				String documentName = supportingDocumentObject.getString("documentName");
				String required = supportingDocumentObject.getString("required");
				JSONObject categoryObject = supportingDocumentObject.getJSONObject("category");
				String categoryName = categoryObject.getString("name");
				if (categoryName.equals(applicationCategory) && required.equals("true")) {
					requiredDocumentList.add(documentName);
				} else if (categoryName.equals(applicationCategory) && required.equals("false")) {
					notRequiredDocumentList.add(documentName);
				} else if (categoryName.equals("Category Not Needed") && required.equals("true")) {
 				} else if (categoryName.equals("Category Not Needed") && required.equals("false")) {
					notRequiredDocumentList.add(documentName);
				}
			}
			documentListJsonArray.put("requiredSupportingDocuments", requiredDocumentList);
			documentListJsonArray.put("notRequiredSupportingDocuments", notRequiredDocumentList);
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return documentListJsonArray;
	}

	@Override
	public String replaceSEZApplicationPdfVar(String category, long sezApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDoc) throws PortalException {
		SezStatusApplication sezStatus = null;
		try {
			sezStatus = SezStatusApplicationLocalServiceUtil.getSezStatusApplication(sezApplicationId);
		} catch (Exception e) {
		}
		category = sezStatus.getSezStatus();
		String pdfTemplate = null;
		if (category.equals("SEZ Occupant")) {
			pdfTemplate = SezOccupantPDf.sezPfdfForOccupant(sezApplicationId, themeDisplay, checkPdfDownloadWithoutDoc);
		} else if (category.equals("SEZ Zone User")) {
			pdfTemplate = SezZoneUserPdf.sezPdfForZoneUser(sezApplicationId, themeDisplay, checkPdfDownloadWithoutDoc);
		} else if (category.equals("SEZ Developer")) {
			pdfTemplate = SezPdfForDeveloper.sezPDfFOrDeveloper(sezApplicationId, themeDisplay,
					checkPdfDownloadWithoutDoc);
		}else if(sezStatus.getDoYouWantTo().equals("Submit an Application for A Work From Home Certificate")) {
			pdfTemplate = SezPdfForWorkFromHome.sezPfdfForWorkFromHome(sezApplicationId, themeDisplay,
					checkPdfDownloadWithoutDoc);
		}
		return pdfTemplate;
	}

	public String replaceFireBirgadeApplicationPdfVar(long fireBrigadeApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) throws PortalException {
		FireBrigadeApplication fbApplication = null;
		try {
			fbApplication = FireBrigadeApplicationLocalServiceUtil.getFireBrigadeApplication(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		String pdfTemplate = FireBirgadeApplicationPdf.fireBrigadeAppPdf(fireBrigadeApplicationId, themeDisplay,
				checkPdfDownloadWithoutDocument);

		return pdfTemplate;
	}

	public String replaceNCRAApplicationPdfVar(String category, long ncraApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) throws PortalException {
		NcraApplication ncraApplication = null;
		try {
			ncraApplication = NcraApplicationLocalServiceUtil.getNcraApplication(ncraApplicationId);
		} catch (Exception e) {
		}
		category = ncraApplication.getDoYouWant();
		String pdfTemplate = null;
		if (category.equals("Weighing Device")) {
			System.out.println("%%----Weighing Device----->>>>>>");
			pdfTemplate = NcraApplicationPdf.ncraAppPdf(ncraApplicationId, themeDisplay,
					checkPdfDownloadWithoutDocument);
		} else if (category.equals("Imported Petrol Sample")) {
			System.out.println("%%----Imported Petrol Sample----->>>>>>");
			pdfTemplate = NcraImportedPetrolPdf.ncraPetrolAppPdf(ncraApplicationId, themeDisplay,
					checkPdfDownloadWithoutDocument);
		}
		return pdfTemplate;
	}

	public String replaceMIICApplicationPdfVar(String category, long miicApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) throws PortalException {
		MiicApplication miicApplication = null;
		try {
			miicApplication = MiicApplicationLocalServiceUtil.getMiicApplication(miicApplicationId);
		} catch (Exception e) {
		}
		category = miicApplication.getMiicApplication();
		String pdfTemplate = null;
		if (category.equals("Suspension of CET")) {
			pdfTemplate = MiicSusCETPdf.getMiicCetPdf(miicApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
		} else if (category.equals("Safeguard Certification")) {
			pdfTemplate = MiicSafeguardMechPdf.getMiicSafeguardPdf(miicApplicationId, themeDisplay,
					checkPdfDownloadWithoutDocument);
		}
		return pdfTemplate;
	}

	public String replaceOsiServicesPdfVar(String category,String subcategory ,long osiServiceApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) throws PortalException {
		OsiServicesApplication osiServicesApplication = null;
		try {
			osiServicesApplication = OsiServicesApplicationLocalServiceUtil.getOsiServicesApplication(osiServiceApplicationId);
		} catch (Exception e) {
		}
		category = osiServicesApplication.getDoYouWant();
		subcategory = osiServicesApplication.getNatureOfApplicant();
		String pdfTemplate = null;
		if (category.equals("Certificate of Assignment")) {
			pdfTemplate = CertificateAssignmentPdf.getCertificateAssignmentPdf(osiServiceApplicationId,
					themeDisplay, checkPdfDownloadWithoutDocument);
		} else if (subcategory.equals("Individual")) {
			pdfTemplate = TrusteeLicenceIndividual.getOsiIndividualPdf(osiServiceApplicationId,
					themeDisplay, checkPdfDownloadWithoutDocument);
		} else if (subcategory.equals("Company")) {
			pdfTemplate = TrusteeLicenceCompany.getCompanyPdf(osiServiceApplicationId, themeDisplay,
					checkPdfDownloadWithoutDocument);
		}
		return pdfTemplate;
	}

	@Override
	public String replaceJtbPdfVar(String typeOfApplication, String otherCategories, String accoCategory,
			long jtbApplicationId, ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument)
			throws PortalException {
		JTBApplication jtbApplication = null;
		try {
			jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
		} catch (Exception e) {

		}
		
		String typeOfApplications = jtbApplication.getTypeOfApplication();
		accoCategory = jtbApplication.getCategoryTypeValAccomo();
		String otherCategoriess = jtbApplication.getOtherCategories();
		String pdfTemplate = null;
		if (typeOfApplication.equals("Accommodations Licence")) {
			if (accoCategory.equals("Hotels")) {
				pdfTemplate = JtbAccomodationHotelPdf.getJtbAccomodationHotelPdf(jtbApplicationId, themeDisplay,
						checkPdfDownloadWithoutDocument);
			} else if (accoCategory.equals("Resort Cottages")) {
				pdfTemplate = JtbAccomodationResortCottagePdf.getJtbAccomodationResortCottagesPdf(jtbApplicationId,
						themeDisplay, checkPdfDownloadWithoutDocument);
			} else if (accoCategory.equals("Home Stay")) {
				pdfTemplate = JtbAccomodationHomeStayPdf.getJtbAccomodationHomeStayPdf(jtbApplicationId, themeDisplay,
						checkPdfDownloadWithoutDocument);
			}

		}
		if (typeOfApplication.equals("Attractions")) {
			pdfTemplate = JtbAttractionsPdf.getJtbAccomodationAttractionPdf(jtbApplicationId, themeDisplay,
					checkPdfDownloadWithoutDocument);
		}
		if (typeOfApplication.equals("Other Tourism Related Licences")) {
			if (otherCategoriess.contains("Car Rentals")) {
				
				pdfTemplate = JtbOtherCarRental.getJtbOtherCarRentalPdf(jtbApplicationId, themeDisplay,
						checkPdfDownloadWithoutDocument);
			} else if (otherCategoriess.contains("Travel Agencies")) {
				
				pdfTemplate = JtbTravelAgency.getJtbOtherTravelAgencyPdf(jtbApplicationId, themeDisplay,
						checkPdfDownloadWithoutDocument);
			} else if (otherCategoriess.contains("Places of Interest/Worship")) {
				pdfTemplate = JtbOtherPlaceOfInterest.getJtbOtherPlaceOfInterestPdf(jtbApplicationId, themeDisplay,
						checkPdfDownloadWithoutDocument);
			} else if (otherCategoriess.contains("Domestic Tours")) {
				  pdfTemplate =
				  JtbOtherDomesticTour.getJtbOtherDomesticTourPdf(jtbApplicationId,
				  themeDisplay, checkPdfDownloadWithoutDocument);
			
		} else if (otherCategoriess.contains("Travel Halts")) {
			pdfTemplate =
					JtbOtherTravelHault.getJtbOtherTravelHaultPdf(jtbApplicationId,
							themeDisplay, checkPdfDownloadWithoutDocument);
		}else if (otherCategoriess.contains("Contract Carriage")) {
				
				  pdfTemplate = JtbContractCarriage.getJtbOtherContractPdf(jtbApplicationId,
				  themeDisplay, checkPdfDownloadWithoutDocument);
				 
		}else if (otherCategoriess.contains("Craft Traders")) {
			
			  pdfTemplate = JtbOtherCraft.getJtbCraftPdf(jtbApplicationId,
			  themeDisplay, checkPdfDownloadWithoutDocument);
			 
		}
		else if (otherCategoriess.contains("Bike Rental")) {
				
				  pdfTemplate = JtbBikeRental.getJtbBikeRentalPdf(jtbApplicationId,
				  themeDisplay, checkPdfDownloadWithoutDocument);
				 
		}else if (otherCategoriess.contains("Water Sports Operators")) {
			 pdfTemplate = JtbOtherWaterSportsOperatorPdf.getJtbOtherWaterSportOperatorPdf(jtbApplicationId,
					  themeDisplay, checkPdfDownloadWithoutDocument);
		}else if (otherCategoriess.contains("Water Sports Employees")) {
				  pdfTemplate = JtbOtherWaterSportsEmployeesPdf.getJtbWaterSportEmployeePdf(jtbApplicationId,
				  themeDisplay, checkPdfDownloadWithoutDocument);
				 
		}
	}
		return pdfTemplate;
	}

	@Override
	public String replaceQuarryPdfVar(String typeOfApplication, long quarryApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) throws PortalException {
		QuarryApplication quarryApplication = null;
		try {
			quarryApplication = QuarryApplicationLocalServiceUtil.getQuarryApplication(quarryApplicationId);
		} catch (Exception e) {
		}
		typeOfApplication = quarryApplication.getNatureOfApplicant();
		String typeOfTransaction=quarryApplication.getTypeOfTransaction();
		String pdfTemplate = null;
		if (typeOfApplication.equals("Individual")||typeOfApplication.equals("Company")) {
			if(typeOfTransaction.equals("Transfer of Licence")) {
			pdfTemplate = QuarryTransferDownloadPdf.getQuarryTransferPdf(quarryApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}
			else {
			pdfTemplate = QuarryApplicationPdf.getQuarryAppPdf(quarryApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}
		} 
		return pdfTemplate;
	}

	@Override
	public String replaceMedicalFaciltiesPdfVar(String natureOfApplicant,String medicalCategory, String subCategory,String nursingHomeCategory ,long medicalApplicationId,
				ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) throws PortalException {
		MedicalFacilitiesApp medicalApplication=null;
		try {
			medicalApplication= MedicalFacilitiesAppLocalServiceUtil.getMedicalFacilitiesApp(medicalApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		natureOfApplicant= medicalApplication.getNatureOfApplicant();
		medicalCategory= medicalApplication.getMedicalCategory();
		subCategory=medicalApplication.getSubCategory();
		nursingHomeCategory=medicalApplication.getNursingHomesCategory();
		String nursingSubCategory=medicalApplication.getNursingSubCategoryVal();
		String pdfTemplate = null;
		if(natureOfApplicant.equals("Individual")) {
			
			if (medicalCategory.contains("Hospitals")||medicalCategory.contains("Ambulatory Facilities")) {
				if(subCategory.equals("Maternity")) {
					pdfTemplate= IndiHospitalAmbulatoryFacilitiesPdf.getHospitalAmbulatoryFacilitiesPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
				}else if(subCategory.equals("Non-Maternity")) {
					pdfTemplate= LongTermsIndiNonMaternityHomePdf.getIndiLongTermNonMaternityHomesPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
				}else if(subCategory.equals("Mixed")) {
					pdfTemplate= LongTermsIndiMixedCategoryPdf.getIndiLongTermMixedCategoryPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
				}
			}else if(medicalCategory.contains("Long Term Care Facilities")) {
				if(subCategory.equals("Residential Care Facilities")) {
					pdfTemplate= LongTermIndiResidentialCareFacilitiesPdf.getResidentialCareFacilitiesPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
				}else if(subCategory.equals("Nursing Homes")) {
					if(nursingHomeCategory.equals("Maternity Homes")) {
						if(nursingSubCategory.equals("Maternity Only")) {
							pdfTemplate= IndiHospitalAmbulatoryFacilitiesPdf.getHospitalAmbulatoryFacilitiesPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
						}else if(nursingSubCategory.equals("Mixed")) {
							pdfTemplate= LongTermsIndiMixedCategoryPdf.getIndiLongTermMixedCategoryPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
						}
					}else {
						if(nursingSubCategory.equals("Maternity Only")) {
							pdfTemplate= IndiHospitalAmbulatoryFacilitiesPdf.getHospitalAmbulatoryFacilitiesPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
						}else if(nursingSubCategory.equals("Mixed")) {
							pdfTemplate= LongTermsIndiMixedCategoryPdf.getIndiLongTermMixedCategoryPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
						}
					}
				}
			}
	}else if(natureOfApplicant.equals("Company/Society/Association")) {
		if (medicalCategory.contains("Hospitals")||medicalCategory.contains("Ambulatory Facilities")) {
			if(subCategory.equals("Maternity")) {
			pdfTemplate= ComMaternityHospitalAmbulatoryFacilitiesPdf.getComHospitalAmbulatoryFacilitiesPdf(medicalApplicationId, themeDisplay,checkPdfDownloadWithoutDocument);
			}else if(subCategory.equals("Non-Maternity")) {
				pdfTemplate= ComNonMaternityHospitalAmbulatoryFacilitiesPdf.getComNonMatHospitalAmbulatoryFacilitiesPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}else if(subCategory.equals("Mixed")) {
				pdfTemplate= ComMixedHospitalAmbulatoryFacilitiesPdf.getComMixedHospitalAmbulatoryFacilitiesPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}
		  }else if(medicalCategory.contains("Long Term Care Facilities")) {
			if(subCategory.equals("Residential Care Facilities")) {
				pdfTemplate= LongTermIndiResidentialCareFacilitiesPdf.getResidentialCareFacilitiesPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}else if(subCategory.equals("Nursing Homes")) {
				if(nursingHomeCategory.equals("Maternity Homes")) {
					if(nursingSubCategory.equals("Maternity Only")) {
						pdfTemplate= ComMaternityHospitalAmbulatoryFacilitiesPdf.getComHospitalAmbulatoryFacilitiesPdf(medicalApplicationId, themeDisplay,checkPdfDownloadWithoutDocument);
					}else if(nursingSubCategory.equals("Mixed")) {
						pdfTemplate= ComMixedHospitalAmbulatoryFacilitiesPdf.getComMixedHospitalAmbulatoryFacilitiesPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
					}
				}else {
					if(nursingSubCategory.equals("Maternity Only")) {
						pdfTemplate= ComMaternityHospitalAmbulatoryFacilitiesPdf.getComHospitalAmbulatoryFacilitiesPdf(medicalApplicationId, themeDisplay,checkPdfDownloadWithoutDocument);
					}else if(nursingSubCategory.equals("Mixed")) {
						pdfTemplate= ComMixedHospitalAmbulatoryFacilitiesPdf.getComMixedHospitalAmbulatoryFacilitiesPdf(medicalApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
					}
				}
			}
		  }
		}
		return pdfTemplate;
	}

	@Override
	public JSONArray getDownloadUrlForPreview(FileEntry addFileEntry, JSONArray jsonArray, ThemeDisplay themeDisplay,JSONObject propertiesObj)  {
		String	downloadfileUrl ="";
		try {
			downloadfileUrl=	DLURLHelperUtil.getDownloadURL(addFileEntry, addFileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
		}catch (Exception e){}

		String	fileNameOfDocument=addFileEntry.getFileName();
		propertiesObj.put("downloadFileUrl", downloadfileUrl);
		propertiesObj.put("title",addFileEntry.getTitle());
		propertiesObj.put("fileName", fileNameOfDocument);
		//jsonObject.put("values",propertiesObj);
		jsonArray.put(propertiesObj);
		return jsonArray;
	}

	@Override
	public String replaceMiningApplicationPdfVar(String typeOfApplication, long miningApplicationId,
			ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) throws PortalException {
	
		MiningLeaseApplication miningApplication=null;
		try {
			miningApplication = MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningApplicationId);
		} catch (Exception e) {
		}
		System.out.println("MINING APPLICATION*************"+miningApplication);
		
		typeOfApplication = miningApplication.getTypeOfApplicant();
		String typeOfProspRight=miningApplication.getProspectingRightNumber();
		String typeOfProspLicence=miningApplication.getTypeOfProspectingLicence();
		String typeOfTransaction=miningApplication.getTypeOfTransaction();
		String pdfTemplate = null;
		
		if (typeOfApplication.equals("Prospecting Rights")) {
		System.out.println("----------------Inside prospecting Rights---------------------"+typeOfProspRight);
			if (typeOfProspRight.contains("New")||typeOfProspRight.contains("Renewal")||typeOfProspRight.contains("Surrender")) {
				pdfTemplate =MiningProspectingRightsPdf.miningProspectingRightPdf(miningApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			} 
		}
		
		else if(typeOfApplication.equals("Prospecting Licence")) {
			System.out.println("----------------Inside prospecting Licence---------------------");
		    if (typeOfProspLicence.equals("New")||typeOfProspLicence.equals("Additional Minerals")) {
			pdfTemplate = MiningProspectingLicencePdf.miningProspectingLicencePdf(miningApplicationId, themeDisplay,
						checkPdfDownloadWithoutDocument);
	       }
			else if (typeOfProspLicence.equals("Renewal &amp; Amendment")) {
				pdfTemplate = MiningProspectingLicenceRenewalPdf.miningProspectingLicenceRenewalPdf(miningApplicationId,
						themeDisplay, checkPdfDownloadWithoutDocument);
		   } 
		
			else if (typeOfProspLicence.equals("Surrender")) {
				pdfTemplate = MiningProspectingLicenceSurrenderPdf.miningProspectingLicenceSurrenderPdf(miningApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}
		
			else if (typeOfProspLicence.equals("Transfer")) {
				pdfTemplate = MiningProspectingLicenceTransferPdf.miningProspectingLicenceTransferPdf(miningApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}
		}


		else if(typeOfApplication.equals("Mining Lease")) {
			if (typeOfTransaction.equals("New")||typeOfTransaction.equals("Temporary Permission")) {
				pdfTemplate = MiningLeaseNewTemporaryPermissionPdf.miningLeaseNewTemporaryPermissionPdf(miningApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}

            else if (typeOfTransaction.equals("Renewal")||typeOfTransaction.equals("Amendment")) {
				pdfTemplate = MiningLeaseRenewPdf.miningLeaseRenewPdf(miningApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
    		}
            else if (typeOfTransaction.equals("Surrender")) {
            	pdfTemplate = MiningProspectingLicenceSurrenderPdf.miningProspectingLicenceSurrenderPdf(miningApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
    		}
            else if (typeOfTransaction.equals("Transfer")) {
            	pdfTemplate = MiningProspectingLicenceTransferPdf.miningProspectingLicenceTransferPdf(miningApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
    		}
			
		}
			
		
		return pdfTemplate;
	}

	@Override
	public String replacNcbjAppPdfVar(String typeOfCertification, String numberOfSite, long ncbjApplicationId,
			ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) throws PortalException {
		NcbjApplication ncbjApplication=null;
		try {
			ncbjApplication= NcbjApplicationLocalServiceUtil.getNcbjApplication(ncbjApplicationId);
		}catch(Exception e) {}
		typeOfCertification=ncbjApplication.getTypeOfCertification();
		String typeOfServices=ncbjApplication.getTypeOfServices();
		String typeOfTransaction=ncbjApplication.getTypeOfTransaction();
		numberOfSite=ncbjApplication.getNumberOfSite();
		String pdfTemplate = null;
		if(typeOfCertification.equals("ISO 9001-2015 Certification")) {
			if(typeOfTransaction.equals("New Client")) {
				 if(numberOfSite.equals("Single Site/Location")) {
				  pdfTemplate= NcbjIsoFirstCertifiicationPdf.getIsoFirstFormSingleSitePdf(ncbjApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
		          }else if(numberOfSite.equals("Multiple Sites more than one Location")) {
                  pdfTemplate=NcbjIso9000MultiSitesPdf.getNcbjIso9000MultiSitesPdf(ncbjApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
		          }
			}else if(typeOfTransaction.equals("NCBJ Certified Clients")) {
				if(typeOfServices.equals("Recertification")) {
					pdfTemplate=NcbjIsoFirstRecertifiicationPdf.getIsoFirstFormRecertificationPdf(ncbjApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
				}
			}
		}else if(typeOfCertification.equals("ISO 22000-2018 Certification")) {
			if(numberOfSite.equals("Single Site/Location")) {
				pdfTemplate= NcbjIsoSecondCertifiicationSinglePdf.getIsoSecondFormSingleSitePdf(ncbjApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}else if(numberOfSite.equals("Multiple Sites more than one Location")) {
				pdfTemplate= NcbjIsoSecondCertifiicationMultipleSitesPdf.getIsoSecondFormMultipleSitesPdf(ncbjApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}
		}
		// TODO Auto-generated method stub
		return pdfTemplate;
	}

	public String replaceOgtApplicationPdfVar(String typeOfMatter, long ogtApplicationId,
			ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) throws PortalException {
		
		OgtApplication ogtApplication=null;
		String pdfTemplate = null;
		try {
			ogtApplication=OgtApplicationLocalServiceUtil.getOgtApplication(ogtApplicationId);
		}catch(Exception e) {
		}
		String typeOfBankruptcy=ogtApplication.getTypeOfBankruptcy();
		typeOfMatter=ogtApplication.getTypeOfMatter();
		if(typeOfBankruptcy.equals("Claim by Creditor")) {
		   pdfTemplate= OgtBankruptcyClaimByCreditorPdf.ogtClaimByCreditorPdf(ogtApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
		}if(typeOfBankruptcy.equals("Claim to Property")) {
			   pdfTemplate= OgtBankruptcyClaimToPropertyPdf.ogtClaimByCreditorPdf(ogtApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
		}if(typeOfBankruptcy.equals("Claim by Spouse")) {
			   pdfTemplate= OgtBankruptcyClaimBySpousePdf.ogtClaimBySpousePdf(ogtApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
		}if(typeOfMatter.equals("Proposal")||typeOfMatter.equals("Receivership")) {
			   pdfTemplate= OgtProposalOrReceivershipPdf.ogtProposalOrReceivershipPdf(ogtApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
		}
		return pdfTemplate;
	}


	@Override
	public String replaceHsraApplicationPdfVar(String typeOfApplicant, long hsraApplicationId,
			ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) throws PortalException {
		
		HsraApplication hsraApplication=null;
		String pdfTemplate = null;
		
		try {
			hsraApplication=HsraApplicationLocalServiceUtil.getHsraApplication(hsraApplicationId);
			
		}catch(Exception e) {
		}
		
		typeOfApplicant= hsraApplication.getTypeOfApplicant();
		String brokerTransactionType= hsraApplication.getBrokerTransactionType();
		String typeOfTransaction=hsraApplication.getTypeOfTransaction();
		if(typeOfApplicant.equals("Brokers")) {
			System.out.println("Inside Brokers---------------------------------------");
			if(brokerTransactionType.equals("New")||brokerTransactionType.equals("Renewal")||brokerTransactionType.equals("Variation")) {
				System.out.println("------------------------inside new/renewal/variation");
				 pdfTemplate=HsraBrokerPdf.hraBrokerPdf(hsraApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}
		}
		else if(typeOfApplicant.equals("Qualified Experts")) {
			if(brokerTransactionType.equals("New")||brokerTransactionType.equals("Renewal")||brokerTransactionType.equals("Variation")) {
				 pdfTemplate= HsraQualifiedExpertsPdf.hsraQualifiedExpertsPdf(hsraApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}	
		}
		else if(typeOfApplicant.equals("Service Providers")) {
			if(typeOfTransaction.equals("New")||typeOfTransaction.equals("Renewal")||typeOfTransaction.equals("Amendent")) {
				 pdfTemplate= HsraServiceProviderPdf.hsraServiceProviderPdf(hsraApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}	
		}
		else if(typeOfApplicant.equals("Users of Radiation Sources")) {
		    if(typeOfTransaction.equals("New")||typeOfTransaction.equals("Renewal")||typeOfTransaction.equals("Amendent")) {
		    	System.out.println("-----------------INSIDE USER RADIATION NEW/RENEWAL/AMENDMENT------------------------");
				 pdfTemplate= HsraRadiationPdf.hsraRadiationPdf(hsraApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}	
		}
		
	
		return pdfTemplate;
	}


	@Override
	public String replaceFactoriesRegistrationAppPdfVar(String processingCategory, long factoriesApplicationId,
			ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) throws PortalException {
		FactoriesApplicationRegistration factoriesApplication=null;
		try {
			factoriesApplication= FactoriesApplicationRegistrationLocalServiceUtil.getFactoriesApplicationRegistration(factoriesApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		processingCategory= factoriesApplication.getAreYouProcessing();
		System.out.println("Product Category-->>"+processingCategory);
		String pdfTemplate = null;
		
		  if(processingCategory.equals("Prescribed Foods")) {
			  System.out.println("Inside PRESCRIBED FOOODS--->>>>");
			  pdfTemplate=FactoriesPrescribedFoodsPdf.getPrescribedFoodFactRegstPdf(factoriesApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
		  }
		  else if(processingCategory.equals("Non-Prescribed Foods")) {
			  System.out.println("Inside NON*PRESCRIBED FOOODS--->>>>");
			  pdfTemplate= FactoriesNonPrescribedFoodsPdf.getNonPrescribedFoodFactRegstPdf(factoriesApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
		 }
		 
		return pdfTemplate;
	}

	@Override
	public String replaceWraApplicationPdfVar(String typeOfApplication, String typeOfTransaction, String typeOfPermit,
			long wraApplicationId, ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument)
			throws PortalException {
		WRAApplication wraApplication=null;
		try {
			wraApplication= WRAApplicationLocalServiceUtil.getWRAApplication(wraApplicationId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		typeOfApplication= wraApplication.getTypeOfApplication();
		typeOfTransaction= wraApplication.getTypeOfTransaction();
		System.out.println("TYEPE OF TRANSACTION---->>"+typeOfTransaction);
		String pdfTemplate = null;
		if(typeOfApplication.equals("Application for a Licence to Abstract & User Water")) {
			System.out.println("INSIDE*****Abstract & User Water NEW Licence-->>"+typeOfApplication);
			if(typeOfTransaction.contains("New Licence")){
				System.out.println("INSIDE*****Abstract NEW Licence-->>");
				pdfTemplate = LicenceAbstarctAndUserWaterPdf.getLicenceAbstractAndUserWaterPdf(wraApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}else if(typeOfTransaction.contains("Licence Renewal")) {	
				System.out.println("INSIDE*****RENEWAL Licence-->>");
				pdfTemplate = RenewalLicenceAbstractPdf.getRenewLicAbstractAndUserWaterPdf(wraApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}
		}else if(typeOfApplication.equals("Application for a Permit to Drill a Well")) {
			pdfTemplate= PermitToDrillWellPdf.getPermitToDrillWellPdf(wraApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
		}else if(typeOfApplication.equals("Application for a Well Drillers Licence")) {
			pdfTemplate= WellDrillersLicenceApplicationPdf.getWellDrillersLicencePdf(wraApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
		}
		return pdfTemplate;
		}

	@Override
	public String replaceJadscApplicationPdfVar(String typeOfApplicant,String typeOfTransaction, long jadscApplicationId,
			ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) throws PortalException {
		
		JADSCApplication jadscApplication=null;
		String pdfTemplate=null;

       try {
    	   jadscApplication=JADSCApplicationLocalServiceUtil.getJADSCApplication(jadscApplicationId);
       }catch(Exception e) {
       }
       
    typeOfApplicant=jadscApplication.getTypeOfApplicant();
    typeOfTransaction=jadscApplication.getBreachOfConfidentiality();
    
       if(typeOfTransaction.equals("Confidential Version")) {
    	   if(typeOfApplicant.equals("Applicant/Company")) {
    	   pdfTemplate=JadscFirstApplicantCompanypdf.jadscFirstApplicantCompanypdf(jadscApplicationId, themeDisplay, checkPdfDownloadWithoutDocument); 
						}
       		  else if(typeOfApplicant.equals("Acting on Behalf of Company E.g. Legal Council")) {
       					pdfTemplate=JadscSecondApplicantBehalfOfCompanyPdf.jadscSecondApplicantBehalfOfCompanyPdf(jadscApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
       					}
       				}
       else if(typeOfTransaction.equals("Public (Non-Confidential) Version")) {
       	    	   if(typeOfApplicant.equals("Applicant/Company") || typeOfApplicant.equals("Acting on Behalf of Company E.g. Legal Council")){
       	    		pdfTemplate=JadscThirdTransationPublicVersionPdf.jadscThirdTransationPublicVersionPdf(jadscApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
       	    	   }
       	    	   
       			}
		return pdfTemplate;
	}

	@Override
	public String replaceJanaacApplicationPdfVar(String accreditationType, String accServiceType,
			long janaacApplicationId, ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument)
			throws PortalException {
		
		JanaacApplication janaacApplication=null;
		String pdfTemplate=null;
		
		try {
			janaacApplication=JanaacApplicationLocalServiceUtil.getJanaacApplication(janaacApplicationId);
	
		}catch(Exception e) {}
		
		accreditationType= janaacApplication.getAccreditationType();
		accServiceType=janaacApplication.getAccServiceType();
		
		if(accreditationType.equals("FDA Approvals")) {
			if(accServiceType.equals("FDA TPP Accreditation of 3rd Party Certification Bodies Under the FDA-Food Safety Modernisation Act (FSMA)")) {
				pdfTemplate=FDAApprovalsFirstSubCatPdf.janaacFdaFirstCatPdf(janaacApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
				
			}
		}
		if(accreditationType.equals("Accreditation for Certification Bodies")) {
			if(accServiceType.equals("Accreditation of Certification Bodies to the ISO/IEC 17021-1 Standard")) {
				pdfTemplate=CertificationBodies17021Pdf.janaacCertificationBodies17021Pdf(janaacApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
				
			}
			else if(accServiceType.equals("Accreditation of Certification Bodies to the ISO/IEC 17065 Standard")) {
				pdfTemplate=CertificationBodies17065Pdf.janaacCertificationBodies17065Pdf(janaacApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
				
			}
			else if(accServiceType.equals("Accreditation of Certification Bodies to the ISO/IEC 17024 Standard")) {
				pdfTemplate=CertificationBodies17024Pdf.janaacCertificationBodiesThirdCatPdf(janaacApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}
		}
		
		
	    if(accreditationType.equals("Accreditation for Inspection Bodies")) {
				pdfTemplate=AccreditationInspectionBodiesPdf.janaacAccreditationInspectionCatPdf(janaacApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
		}
	    if(accreditationType.equals("Accreditation for Labs")) {
	    	if(accServiceType.equals("Accreditation of Medical Labs to the ISO 15189 Standard")) {
	    		pdfTemplate=MedicalLabPdf.janaacMedicalLabPdf(janaacApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
	    	}
	    	else if(accServiceType.equals("Accreditation of Testing Labs to the ISO/IEC 17025 Standard")) {
	    		pdfTemplate=TestingLab17025Pdf.janaacTestingLab17025Pdf(janaacApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);	    		
	    	}
	    	else if(accServiceType.equals("Accreditation of Calibration Labs to the ISO/IEC 17025 Standard")) {
	    		pdfTemplate=CalibrationLabPdf.janaacCaliberationLabPdf(janaacApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);	    		
	    	}
	    	
	    	
	    }
		return pdfTemplate;
	}

	@Override

	public JSONObject gettingSupportingDocumentArrayQuarry(ResourceRequest resourceRequest, String applicationCategory,String catName,
			String apiPathModuleName) {
		Log _log = LogFactoryUtil.getLog(CommonsUtil.class.getName());
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String authenticationKey = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("authentication-key");
		String getDocumentEndpoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("get-document-url");
		JSONObject documentListJsonArray = new JSONFactoryUtil().createJSONObject();
		try {
			HttpResponse<String> response = null;
			try {
				response = Unirest.get(getDocumentEndpoint + "o/c/" + apiPathModuleName + "/?pageSize=-1")
						.header("Authorization", "Basic " + authenticationKey).asString();
			} catch (Exception e) {
				e.printStackTrace();
				e.getCause();
				e.getMessage();
			}
			JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
			JSONArray itemsJsonArray = responseJsonObj.getJSONArray("items");

			ArrayList<String> requiredDocumentList = new ArrayList<String>();
			ArrayList<String> notRequiredDocumentList = new ArrayList<String>();
			for (int i = 0; i < itemsJsonArray.length(); i++) {
				JSONObject supportingDocumentObject = itemsJsonArray.getJSONObject(i);
				String documentName = supportingDocumentObject.getString("documentName");
				String required = supportingDocumentObject.getString("required");
				JSONObject categoryObject = supportingDocumentObject.getJSONObject("category");
				String categoryName = categoryObject.getString("name");
				if (categoryName.equals(applicationCategory) && required.equals("true")) {
					requiredDocumentList.add(documentName);
				}else if (categoryName.equals(catName) && required.equals("true")) {
					requiredDocumentList.add(documentName);
				} else if (categoryName.equals(applicationCategory) && required.equals("false")) {
					notRequiredDocumentList.add(documentName);
				} else if (categoryName.equals("Category Not Needed") && required.equals("true")) {
 				} else if (categoryName.equals("Category Not Needed") && required.equals("false")) {
					notRequiredDocumentList.add(documentName);
				}
			}
			documentListJsonArray.put("requiredSupportingDocuments", requiredDocumentList);
			documentListJsonArray.put("notRequiredSupportingDocuments", notRequiredDocumentList);
			System.out.println("[DOC FETCHED]");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return documentListJsonArray;
	}

	@Override
	public JSONObject gettingSupportingDocumentArrayJtb(ResourceRequest resourceRequest, String applicationType,
			String catName, String apiPathModuleName) {
		Log _log = LogFactoryUtil.getLog(CommonsUtil.class.getName());
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String authenticationKey = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("authentication-key");
		String getDocumentEndpoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("get-document-url");
		JSONObject documentListJsonArray = new JSONFactoryUtil().createJSONObject();
		try {
			HttpResponse<String> response = null;
			try {
				response = Unirest.get(getDocumentEndpoint + "o/c/" + apiPathModuleName + "/?pageSize=-1")
						.header("Authorization", "Basic " + authenticationKey).asString();
			} catch (Exception e) {
				e.printStackTrace();
				e.getCause();
				e.getMessage();
			}
			JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
			JSONArray itemsJsonArray = responseJsonObj.getJSONArray("items");

			ArrayList<String> requiredDocumentList = new ArrayList<String>();
			ArrayList<String> notRequiredDocumentList = new ArrayList<String>();
			for (int i = 0; i < itemsJsonArray.length(); i++) {
				JSONObject supportingDocumentObject = itemsJsonArray.getJSONObject(i);
				String documentName = supportingDocumentObject.getString("documentName");
				String required = supportingDocumentObject.getString("required");
				JSONObject categoryObject = supportingDocumentObject.getJSONObject("category");
				String categoryName = categoryObject.getString("name");
				if (categoryName.equals(applicationType) && required.equals("true")) {
					requiredDocumentList.add(documentName);
				}else if (categoryName.equals(catName) && required.equals("true")) {
					requiredDocumentList.add(documentName);
				} else if (categoryName.equals(applicationType) && required.equals("false")) {
					notRequiredDocumentList.add(documentName);
				} else if (categoryName.equals("Category Not Needed") && required.equals("true")) {
 				} else if (categoryName.equals("Category Not Needed") && required.equals("false")) {
					notRequiredDocumentList.add(documentName);
				}
			}
			documentListJsonArray.put("requiredSupportingDocuments", requiredDocumentList);
			documentListJsonArray.put("notRequiredSupportingDocuments", notRequiredDocumentList);
			System.out.println("[DOC FETCHED]");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return documentListJsonArray;
	}
	//getting token for object store api
		@Override
		public String getToken(ThemeDisplay themeDisplay,String url1) throws Exception {
			
			String url = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("get-document-url");
			System.out.println("url is -----------"+url);
			Unirest.setTimeouts(0, 0);
			String token = "";
			 String clientId=(String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("client-id");
			 String tokenSecret=(String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("client- secret");
			System.out.println("clientId is------------"+clientId);
			System.out.println("tokenSecret is------------"+tokenSecret);
			try {
				HttpResponse<String> response;
				response = Unirest.post(url+"/o/oauth2/token").header("Content-Type", "application/x-www-form-urlencoded")
						.field("client_id", clientId)
						.field("client_secret", tokenSecret)
						.field("grant_type", "client_credentials").asString();
				System.out.println("Respones Code Token--"+response.getCode());
				JSONObject jsonObj;
				try {
					jsonObj = JSONFactoryUtil.createJSONObject(response.getBody());
					token = jsonObj.getString("access_token");
				} catch (JSONException e) {
					e.printStackTrace();
				}
			} catch (UnirestException e) {
				e.printStackTrace();
			}
			return token;
	}
//		getting value of objectStore
		@Override
		public String getBpmObjectData(ThemeDisplay themeDisplay ,String token,String moduleId,String url1) throws Exception {
			HttpResponse<String> response = null;
			String url = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("get-document-url");
			System.out.println("URL---------------"+url);
			System.out.println("token---------------"+token);
			System.out.println("moduleId---------------"+moduleId);
			try {
					response = Unirest.get(url + "o/c/bpmobjectstores/?search=" + moduleId)
					 .header("Content-Type", "application/json")
					.header("Authorization","Bearer "+token).asString();
					System.out.println("response----" + response.getBody());
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("response is---------"+response.getBody());
			System.out.println("response is---------"+response);
			JSONObject locationData = null;
			try {
				locationData = JSONFactoryUtil.createJSONObject(response.getBody());
			} catch (JSONException e) {
				e.printStackTrace();
			}
			String valueObjStore=null;
			JSONArray listTypeEntries = JSONFactoryUtil.createJSONArray();
			listTypeEntries = locationData.getJSONArray("items");
			for (int i = 0; i < listTypeEntries.length(); i++) {
				JSONObject array_element = listTypeEntries.getJSONObject(i);
				 valueObjStore = array_element.getString("objectStore");
			}
			// Response JSON Object
			
			System.out.println("OBJECT STORE VALUE----" + valueObjStore);
			System.out.println("Getting Object Response----" + response.getCode());
			return valueObjStore;
		}

		@Override
		public String replaceExplosivePdfVar(String typeOfApplication, long explosivesApplicationId,
				ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) throws PortalException {
			ExplosivesApplication explosivesApplication = null;
			try {
				explosivesApplication=ExplosivesApplicationLocalServiceUtil.getExplosivesApplication(explosivesApplicationId);
			} catch (Exception e) {}
			String pdfTemplate = null;
			if(typeOfApplication.equals("Blaster's Competency Certificate")) {
				System.out.println("----------inside--Blaster's--------------");
				pdfTemplate = ExplosiveApplicationPdf.getBlasterPdf(explosivesApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}else if(typeOfApplication.equals("Pyrotechnic Competency Certificate")) {
				pdfTemplate = ExplosivePyrotechnicApplicationPdf.getPyrotechnicPdf(explosivesApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
			}
		
			return pdfTemplate;
		}

}
