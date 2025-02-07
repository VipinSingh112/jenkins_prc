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

import com.nbp.sez.status.application.stage.services.model.SezStatusBoardDecision;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezStatusBoardDecision. This utility wraps
 * <code>com.nbp.sez.status.application.stage.services.service.impl.SezStatusBoardDecisionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusBoardDecisionLocalService
 * @generated
 */
public class SezStatusBoardDecisionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.stage.services.service.impl.SezStatusBoardDecisionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez status board decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusBoardDecision the sez status board decision
	 * @return the sez status board decision that was added
	 */
	public static SezStatusBoardDecision addSezStatusBoardDecision(
		SezStatusBoardDecision sezStatusBoardDecision) {

		return getService().addSezStatusBoardDecision(sezStatusBoardDecision);
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
	 * Creates a new sez status board decision with the primary key. Does not add the sez status board decision to the database.
	 *
	 * @param sezStatusBoardId the primary key for the new sez status board decision
	 * @return the new sez status board decision
	 */
	public static SezStatusBoardDecision createSezStatusBoardDecision(
		long sezStatusBoardId) {

		return getService().createSezStatusBoardDecision(sezStatusBoardId);
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
	 * Deletes the sez status board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision that was removed
	 * @throws PortalException if a sez status board decision with the primary key could not be found
	 */
	public static SezStatusBoardDecision deleteSezStatusBoardDecision(
			long sezStatusBoardId)
		throws PortalException {

		return getService().deleteSezStatusBoardDecision(sezStatusBoardId);
	}

	/**
	 * Deletes the sez status board decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusBoardDecision the sez status board decision
	 * @return the sez status board decision that was removed
	 */
	public static SezStatusBoardDecision deleteSezStatusBoardDecision(
		SezStatusBoardDecision sezStatusBoardDecision) {

		return getService().deleteSezStatusBoardDecision(
			sezStatusBoardDecision);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusBoardDecisionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusBoardDecisionModelImpl</code>.
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

	public static SezStatusBoardDecision fetchSezStatusBoardDecision(
		long sezStatusBoardId) {

		return getService().fetchSezStatusBoardDecision(sezStatusBoardId);
	}

	/**
	 * Returns the sez status board decision matching the UUID and group.
	 *
	 * @param uuid the sez status board decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision
		fetchSezStatusBoardDecisionByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchSezStatusBoardDecisionByUuidAndGroupId(
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

	public static SezStatusBoardDecision getSezStatus_Board_Decision_By_Id(
		String caseId) {

		return getService().getSezStatus_Board_Decision_By_Id(caseId);
	}

	/**
	 * Returns the sez status board decision with the primary key.
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision
	 * @throws PortalException if a sez status board decision with the primary key could not be found
	 */
	public static SezStatusBoardDecision getSezStatusBoardDecision(
			long sezStatusBoardId)
		throws PortalException {

		return getService().getSezStatusBoardDecision(sezStatusBoardId);
	}

	/**
	 * Returns the sez status board decision matching the UUID and group.
	 *
	 * @param uuid the sez status board decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status board decision
	 * @throws PortalException if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision
			getSezStatusBoardDecisionByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getSezStatusBoardDecisionByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the sez status board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @return the range of sez status board decisions
	 */
	public static List<SezStatusBoardDecision> getSezStatusBoardDecisions(
		int start, int end) {

		return getService().getSezStatusBoardDecisions(start, end);
	}

	/**
	 * Returns all the sez status board decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status board decisions
	 * @param companyId the primary key of the company
	 * @return the matching sez status board decisions, or an empty list if no matches were found
	 */
	public static List<SezStatusBoardDecision>
		getSezStatusBoardDecisionsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getSezStatusBoardDecisionsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of sez status board decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status board decisions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sez status board decisions, or an empty list if no matches were found
	 */
	public static List<SezStatusBoardDecision>
		getSezStatusBoardDecisionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		return getService().getSezStatusBoardDecisionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sez status board decisions.
	 *
	 * @return the number of sez status board decisions
	 */
	public static int getSezStatusBoardDecisionsCount() {
		return getService().getSezStatusBoardDecisionsCount();
	}

	/**
	 * Updates the sez status board decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusBoardDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusBoardDecision the sez status board decision
	 * @return the sez status board decision that was updated
	 */
	public static SezStatusBoardDecision updateSezStatusBoardDecision(
		SezStatusBoardDecision sezStatusBoardDecision) {

		return getService().updateSezStatusBoardDecision(
			sezStatusBoardDecision);
	}

	public static SezStatusBoardDecision updateSezStatusDecision(
		String caseId, java.util.Date dateOfBoardDecision,
		String boardDecisio) {

		return getService().updateSezStatusDecision(
			caseId, dateOfBoardDecision, boardDecisio);
	}

	public static SezStatusBoardDecisionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezStatusBoardDecisionLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezStatusBoardDecisionLocalServiceUtil.class,
			SezStatusBoardDecisionLocalService.class);

}