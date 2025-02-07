/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezStatusARCDecision. This utility wraps
 * <code>com.nbp.sez.status.application.stage.services.service.impl.SezStatusARCDecisionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusARCDecisionLocalService
 * @generated
 */
public class SezStatusARCDecisionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.stage.services.service.impl.SezStatusARCDecisionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez status arc decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusARCDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusARCDecision the sez status arc decision
	 * @return the sez status arc decision that was added
	 */
	public static SezStatusARCDecision addSezStatusARCDecision(
		SezStatusARCDecision sezStatusARCDecision) {

		return getService().addSezStatusARCDecision(sezStatusARCDecision);
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
	 * Creates a new sez status arc decision with the primary key. Does not add the sez status arc decision to the database.
	 *
	 * @param sezStatusCommitteeId the primary key for the new sez status arc decision
	 * @return the new sez status arc decision
	 */
	public static SezStatusARCDecision createSezStatusARCDecision(
		long sezStatusCommitteeId) {

		return getService().createSezStatusARCDecision(sezStatusCommitteeId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sez status arc decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusARCDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusCommitteeId the primary key of the sez status arc decision
	 * @return the sez status arc decision that was removed
	 * @throws PortalException if a sez status arc decision with the primary key could not be found
	 */
	public static SezStatusARCDecision deleteSezStatusARCDecision(
			long sezStatusCommitteeId)
		throws PortalException {

		return getService().deleteSezStatusARCDecision(sezStatusCommitteeId);
	}

	/**
	 * Deletes the sez status arc decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusARCDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusARCDecision the sez status arc decision
	 * @return the sez status arc decision that was removed
	 */
	public static SezStatusARCDecision deleteSezStatusARCDecision(
		SezStatusARCDecision sezStatusARCDecision) {

		return getService().deleteSezStatusARCDecision(sezStatusARCDecision);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusARCDecisionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusARCDecisionModelImpl</code>.
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

	public static SezStatusARCDecision fetchSezStatusARCDecision(
		long sezStatusCommitteeId) {

		return getService().fetchSezStatusARCDecision(sezStatusCommitteeId);
	}

	/**
	 * Returns the sez status arc decision matching the UUID and group.
	 *
	 * @param uuid the sez status arc decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	public static SezStatusARCDecision
		fetchSezStatusARCDecisionByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchSezStatusARCDecisionByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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

	public static SezStatusARCDecision getSeStatusARCDecision_By_CI(
			String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusARCDecisionException {

		return getService().getSeStatusARCDecision_By_CI(caseId);
	}

	/**
	 * Returns the sez status arc decision with the primary key.
	 *
	 * @param sezStatusCommitteeId the primary key of the sez status arc decision
	 * @return the sez status arc decision
	 * @throws PortalException if a sez status arc decision with the primary key could not be found
	 */
	public static SezStatusARCDecision getSezStatusARCDecision(
			long sezStatusCommitteeId)
		throws PortalException {

		return getService().getSezStatusARCDecision(sezStatusCommitteeId);
	}

	/**
	 * Returns the sez status arc decision matching the UUID and group.
	 *
	 * @param uuid the sez status arc decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status arc decision
	 * @throws PortalException if a matching sez status arc decision could not be found
	 */
	public static SezStatusARCDecision getSezStatusARCDecisionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getSezStatusARCDecisionByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the sez status arc decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @return the range of sez status arc decisions
	 */
	public static List<SezStatusARCDecision> getSezStatusARCDecisions(
		int start, int end) {

		return getService().getSezStatusARCDecisions(start, end);
	}

	/**
	 * Returns all the sez status arc decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status arc decisions
	 * @param companyId the primary key of the company
	 * @return the matching sez status arc decisions, or an empty list if no matches were found
	 */
	public static List<SezStatusARCDecision>
		getSezStatusARCDecisionsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getSezStatusARCDecisionsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of sez status arc decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status arc decisions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sez status arc decisions, or an empty list if no matches were found
	 */
	public static List<SezStatusARCDecision>
		getSezStatusARCDecisionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<SezStatusARCDecision> orderByComparator) {

		return getService().getSezStatusARCDecisionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sez status arc decisions.
	 *
	 * @return the number of sez status arc decisions
	 */
	public static int getSezStatusARCDecisionsCount() {
		return getService().getSezStatusARCDecisionsCount();
	}

	/**
	 * Updates the sez status arc decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusARCDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusARCDecision the sez status arc decision
	 * @return the sez status arc decision that was updated
	 */
	public static SezStatusARCDecision updateSezStatusARCDecision(
		SezStatusARCDecision sezStatusARCDecision) {

		return getService().updateSezStatusARCDecision(sezStatusARCDecision);
	}

	public static SezStatusARCDecision updateSezStatusARCDecision(
		String caseId, String committeeDecision,
		java.util.Date dateOfdecision) {

		return getService().updateSezStatusARCDecision(
			caseId, committeeDecision, dateOfdecision);
	}

	public static SezStatusARCDecisionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezStatusARCDecisionLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezStatusARCDecisionLocalServiceUtil.class,
			SezStatusARCDecisionLocalService.class);

}