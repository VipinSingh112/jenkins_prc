/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcbjApplicationCorrectiveAction. This utility wraps
 * <code>com.nbp.ncbj.stages.services.service.impl.NcbjApplicationCorrectiveActionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationCorrectiveActionLocalService
 * @generated
 */
public class NcbjApplicationCorrectiveActionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncbj.stages.services.service.impl.NcbjApplicationCorrectiveActionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncbj application corrective action to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationCorrectiveActionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationCorrectiveAction the ncbj application corrective action
	 * @return the ncbj application corrective action that was added
	 */
	public static NcbjApplicationCorrectiveAction
		addNcbjApplicationCorrectiveAction(
			NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction) {

		return getService().addNcbjApplicationCorrectiveAction(
			ncbjApplicationCorrectiveAction);
	}

	/**
	 * Creates a new ncbj application corrective action with the primary key. Does not add the ncbj application corrective action to the database.
	 *
	 * @param ncbjAppCorrActionId the primary key for the new ncbj application corrective action
	 * @return the new ncbj application corrective action
	 */
	public static NcbjApplicationCorrectiveAction
		createNcbjApplicationCorrectiveAction(long ncbjAppCorrActionId) {

		return getService().createNcbjApplicationCorrectiveAction(
			ncbjAppCorrActionId);
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
	 * Deletes the ncbj application corrective action with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationCorrectiveActionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action that was removed
	 * @throws PortalException if a ncbj application corrective action with the primary key could not be found
	 */
	public static NcbjApplicationCorrectiveAction
			deleteNcbjApplicationCorrectiveAction(long ncbjAppCorrActionId)
		throws PortalException {

		return getService().deleteNcbjApplicationCorrectiveAction(
			ncbjAppCorrActionId);
	}

	/**
	 * Deletes the ncbj application corrective action from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationCorrectiveActionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationCorrectiveAction the ncbj application corrective action
	 * @return the ncbj application corrective action that was removed
	 */
	public static NcbjApplicationCorrectiveAction
		deleteNcbjApplicationCorrectiveAction(
			NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction) {

		return getService().deleteNcbjApplicationCorrectiveAction(
			ncbjApplicationCorrectiveAction);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationCorrectiveActionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationCorrectiveActionModelImpl</code>.
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

	public static NcbjApplicationCorrectiveAction
		fetchNcbjApplicationCorrectiveAction(long ncbjAppCorrActionId) {

		return getService().fetchNcbjApplicationCorrectiveAction(
			ncbjAppCorrActionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the ncbj application corrective action with the primary key.
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action
	 * @throws PortalException if a ncbj application corrective action with the primary key could not be found
	 */
	public static NcbjApplicationCorrectiveAction
			getNcbjApplicationCorrectiveAction(long ncbjAppCorrActionId)
		throws PortalException {

		return getService().getNcbjApplicationCorrectiveAction(
			ncbjAppCorrActionId);
	}

	/**
	 * Returns a range of all the ncbj application corrective actions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationCorrectiveActionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application corrective actions
	 * @param end the upper bound of the range of ncbj application corrective actions (not inclusive)
	 * @return the range of ncbj application corrective actions
	 */
	public static List<NcbjApplicationCorrectiveAction>
		getNcbjApplicationCorrectiveActions(int start, int end) {

		return getService().getNcbjApplicationCorrectiveActions(start, end);
	}

	/**
	 * Returns the number of ncbj application corrective actions.
	 *
	 * @return the number of ncbj application corrective actions
	 */
	public static int getNcbjApplicationCorrectiveActionsCount() {
		return getService().getNcbjApplicationCorrectiveActionsCount();
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

	public static NcbjApplicationCorrectiveAction getPreAPprovalConditionBy_CI(
			String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationCorrectiveActionException {

		return getService().getPreAPprovalConditionBy_CI(caseId);
	}

	public static NcbjApplicationCorrectiveAction updateCorrectionAction(
		String caseId, long ncbjAppCorrActionId) {

		return getService().updateCorrectionAction(caseId, ncbjAppCorrActionId);
	}

	/**
	 * Updates the ncbj application corrective action in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationCorrectiveActionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationCorrectiveAction the ncbj application corrective action
	 * @return the ncbj application corrective action that was updated
	 */
	public static NcbjApplicationCorrectiveAction
		updateNcbjApplicationCorrectiveAction(
			NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction) {

		return getService().updateNcbjApplicationCorrectiveAction(
			ncbjApplicationCorrectiveAction);
	}

	public static NcbjApplicationCorrectiveActionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcbjApplicationCorrectiveActionLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcbjApplicationCorrectiveActionLocalServiceUtil.class,
			NcbjApplicationCorrectiveActionLocalService.class);

}