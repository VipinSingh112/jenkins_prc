/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireDueDiligence;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AcquireDueDiligence. This utility wraps
 * <code>com.nbp.acquire.stages.service.service.impl.AcquireDueDiligenceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDueDiligenceLocalService
 * @generated
 */
public class AcquireDueDiligenceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.acquire.stages.service.service.impl.AcquireDueDiligenceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acquire due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDueDiligence the acquire due diligence
	 * @return the acquire due diligence that was added
	 */
	public static AcquireDueDiligence addAcquireDueDiligence(
		AcquireDueDiligence acquireDueDiligence) {

		return getService().addAcquireDueDiligence(acquireDueDiligence);
	}

	/**
	 * Creates a new acquire due diligence with the primary key. Does not add the acquire due diligence to the database.
	 *
	 * @param sampleId the primary key for the new acquire due diligence
	 * @return the new acquire due diligence
	 */
	public static AcquireDueDiligence createAcquireDueDiligence(long sampleId) {
		return getService().createAcquireDueDiligence(sampleId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the acquire due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDueDiligence the acquire due diligence
	 * @return the acquire due diligence that was removed
	 */
	public static AcquireDueDiligence deleteAcquireDueDiligence(
		AcquireDueDiligence acquireDueDiligence) {

		return getService().deleteAcquireDueDiligence(acquireDueDiligence);
	}

	/**
	 * Deletes the acquire due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence that was removed
	 * @throws PortalException if a acquire due diligence with the primary key could not be found
	 */
	public static AcquireDueDiligence deleteAcquireDueDiligence(long sampleId)
		throws PortalException {

		return getService().deleteAcquireDueDiligence(sampleId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static AcquireDueDiligence fetchAcquireDueDiligence(long sampleId) {
		return getService().fetchAcquireDueDiligence(sampleId);
	}

	public static AcquireDueDiligence getAcquireDD_By_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getService().getAcquireDD_By_CI(caseId);
	}

	/**
	 * Returns the acquire due diligence with the primary key.
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence
	 * @throws PortalException if a acquire due diligence with the primary key could not be found
	 */
	public static AcquireDueDiligence getAcquireDueDiligence(long sampleId)
		throws PortalException {

		return getService().getAcquireDueDiligence(sampleId);
	}

	public static List<AcquireDueDiligence> getAcquireDueDiligenceBy_CI(
		String caseId) {

		return getService().getAcquireDueDiligenceBy_CI(caseId);
	}

	public static AcquireDueDiligence getAcquireDueDiligenceBy_CI_SN(
			String caseId, String agncyName)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getService().getAcquireDueDiligenceBy_CI_SN(caseId, agncyName);
	}

	/**
	 * Returns a range of all the acquire due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @return the range of acquire due diligences
	 */
	public static List<AcquireDueDiligence> getAcquireDueDiligences(
		int start, int end) {

		return getService().getAcquireDueDiligences(start, end);
	}

	/**
	 * Returns the number of acquire due diligences.
	 *
	 * @return the number of acquire due diligences
	 */
	public static int getAcquireDueDiligencesCount() {
		return getService().getAcquireDueDiligencesCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<String> getDistinctAgencies() {
		return getService().getDistinctAgencies();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static AcquireDueDiligence updateAcquireApplication(
		String caseId, String siteVisitRequires,
		java.util.Date prefferedsiteVisitDate, String statusApproved,
		String agencyName, java.util.Date dateSubmittedToAgency,
		java.util.Date dateFeedbackReceived, String agencyRecommendations) {

		return getService().updateAcquireApplication(
			caseId, siteVisitRequires, prefferedsiteVisitDate, statusApproved,
			agencyName, dateSubmittedToAgency, dateFeedbackReceived,
			agencyRecommendations);
	}

	/**
	 * Updates the acquire due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDueDiligence the acquire due diligence
	 * @return the acquire due diligence that was updated
	 */
	public static AcquireDueDiligence updateAcquireDueDiligence(
		AcquireDueDiligence acquireDueDiligence) {

		return getService().updateAcquireDueDiligence(acquireDueDiligence);
	}

	public static AcquireDueDiligenceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AcquireDueDiligenceLocalService>
		_serviceSnapshot = new Snapshot<>(
			AcquireDueDiligenceLocalServiceUtil.class,
			AcquireDueDiligenceLocalService.class);

}