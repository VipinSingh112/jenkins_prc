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

import com.nbp.sez.status.application.stage.services.model.SezStatusPreApprovalConditions;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezStatusPreApprovalConditions. This utility wraps
 * <code>com.nbp.sez.status.application.stage.services.service.impl.SezStatusPreApprovalConditionsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPreApprovalConditionsLocalService
 * @generated
 */
public class SezStatusPreApprovalConditionsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.stage.services.service.impl.SezStatusPreApprovalConditionsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez status pre approval conditions to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusPreApprovalConditionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusPreApprovalConditions the sez status pre approval conditions
	 * @return the sez status pre approval conditions that was added
	 */
	public static SezStatusPreApprovalConditions
		addSezStatusPreApprovalConditions(
			SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		return getService().addSezStatusPreApprovalConditions(
			sezStatusPreApprovalConditions);
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
	 * Creates a new sez status pre approval conditions with the primary key. Does not add the sez status pre approval conditions to the database.
	 *
	 * @param preApprovalId the primary key for the new sez status pre approval conditions
	 * @return the new sez status pre approval conditions
	 */
	public static SezStatusPreApprovalConditions
		createSezStatusPreApprovalConditions(long preApprovalId) {

		return getService().createSezStatusPreApprovalConditions(preApprovalId);
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
	 * Deletes the sez status pre approval conditions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusPreApprovalConditionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions that was removed
	 * @throws PortalException if a sez status pre approval conditions with the primary key could not be found
	 */
	public static SezStatusPreApprovalConditions
			deleteSezStatusPreApprovalConditions(long preApprovalId)
		throws PortalException {

		return getService().deleteSezStatusPreApprovalConditions(preApprovalId);
	}

	/**
	 * Deletes the sez status pre approval conditions from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusPreApprovalConditionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusPreApprovalConditions the sez status pre approval conditions
	 * @return the sez status pre approval conditions that was removed
	 */
	public static SezStatusPreApprovalConditions
		deleteSezStatusPreApprovalConditions(
			SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		return getService().deleteSezStatusPreApprovalConditions(
			sezStatusPreApprovalConditions);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusPreApprovalConditionsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusPreApprovalConditionsModelImpl</code>.
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

	public static SezStatusPreApprovalConditions
		fetchSezStatusPreApprovalConditions(long preApprovalId) {

		return getService().fetchSezStatusPreApprovalConditions(preApprovalId);
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

	public static SezStatusPreApprovalConditions getPreApprovalCondition_By_CI(
			String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusPreApprovalConditionsException {

		return getService().getPreApprovalCondition_By_CI(caseId);
	}

	/**
	 * Returns the sez status pre approval conditions with the primary key.
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions
	 * @throws PortalException if a sez status pre approval conditions with the primary key could not be found
	 */
	public static SezStatusPreApprovalConditions
			getSezStatusPreApprovalConditions(long preApprovalId)
		throws PortalException {

		return getService().getSezStatusPreApprovalConditions(preApprovalId);
	}

	/**
	 * Returns a range of all the sez status pre approval conditionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusPreApprovalConditionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status pre approval conditionses
	 * @param end the upper bound of the range of sez status pre approval conditionses (not inclusive)
	 * @return the range of sez status pre approval conditionses
	 */
	public static List<SezStatusPreApprovalConditions>
		getSezStatusPreApprovalConditionses(int start, int end) {

		return getService().getSezStatusPreApprovalConditionses(start, end);
	}

	/**
	 * Returns the number of sez status pre approval conditionses.
	 *
	 * @return the number of sez status pre approval conditionses
	 */
	public static int getSezStatusPreApprovalConditionsesCount() {
		return getService().getSezStatusPreApprovalConditionsesCount();
	}

	public static SezStatusPreApprovalConditions updatePreApprovalConditions(
		String caseId, long preApprovalConditionLetterId) {

		return getService().updatePreApprovalConditions(
			caseId, preApprovalConditionLetterId);
	}

	/**
	 * Updates the sez status pre approval conditions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusPreApprovalConditionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusPreApprovalConditions the sez status pre approval conditions
	 * @return the sez status pre approval conditions that was updated
	 */
	public static SezStatusPreApprovalConditions
		updateSezStatusPreApprovalConditions(
			SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		return getService().updateSezStatusPreApprovalConditions(
			sezStatusPreApprovalConditions);
	}

	public static SezStatusPreApprovalConditionsLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezStatusPreApprovalConditionsLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezStatusPreApprovalConditionsLocalServiceUtil.class,
			SezStatusPreApprovalConditionsLocalService.class);

}