/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.stage.service.model.HealthCarePermit;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HealthCarePermit. This utility wraps
 * <code>com.nbp.healthcare.stage.service.service.impl.HealthCarePermitLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCarePermitLocalService
 * @generated
 */
public class HealthCarePermitLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.healthcare.stage.service.service.impl.HealthCarePermitLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the health care permit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCarePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCarePermit the health care permit
	 * @return the health care permit that was added
	 */
	public static HealthCarePermit addHealthCarePermit(
		HealthCarePermit healthCarePermit) {

		return getService().addHealthCarePermit(healthCarePermit);
	}

	/**
	 * Creates a new health care permit with the primary key. Does not add the health care permit to the database.
	 *
	 * @param healthPermitId the primary key for the new health care permit
	 * @return the new health care permit
	 */
	public static HealthCarePermit createHealthCarePermit(long healthPermitId) {
		return getService().createHealthCarePermit(healthPermitId);
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
	 * Deletes the health care permit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCarePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCarePermit the health care permit
	 * @return the health care permit that was removed
	 */
	public static HealthCarePermit deleteHealthCarePermit(
		HealthCarePermit healthCarePermit) {

		return getService().deleteHealthCarePermit(healthCarePermit);
	}

	/**
	 * Deletes the health care permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCarePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit that was removed
	 * @throws PortalException if a health care permit with the primary key could not be found
	 */
	public static HealthCarePermit deleteHealthCarePermit(long healthPermitId)
		throws PortalException {

		return getService().deleteHealthCarePermit(healthPermitId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCarePermitModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCarePermitModelImpl</code>.
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

	public static HealthCarePermit fetchHealthCarePermit(long healthPermitId) {
		return getService().fetchHealthCarePermit(healthPermitId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static HealthCarePermit getHealthCareBy_CI(String caseId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCarePermitException {

		return getService().getHealthCareBy_CI(caseId);
	}

	/**
	 * Returns the health care permit with the primary key.
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit
	 * @throws PortalException if a health care permit with the primary key could not be found
	 */
	public static HealthCarePermit getHealthCarePermit(long healthPermitId)
		throws PortalException {

		return getService().getHealthCarePermit(healthPermitId);
	}

	/**
	 * Returns a range of all the health care permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCarePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care permits
	 * @param end the upper bound of the range of health care permits (not inclusive)
	 * @return the range of health care permits
	 */
	public static List<HealthCarePermit> getHealthCarePermits(
		int start, int end) {

		return getService().getHealthCarePermits(start, end);
	}

	/**
	 * Returns the number of health care permits.
	 *
	 * @return the number of health care permits
	 */
	public static int getHealthCarePermitsCount() {
		return getService().getHealthCarePermitsCount();
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

	/**
	 * Updates the health care permit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCarePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCarePermit the health care permit
	 * @return the health care permit that was updated
	 */
	public static HealthCarePermit updateHealthCarePermit(
		HealthCarePermit healthCarePermit) {

		return getService().updateHealthCarePermit(healthCarePermit);
	}

	public static HealthCarePermit updateHealthCarePermit(
		String caseId, String transaction, String nameofApplicant,
		String Category, String pirPermt, String bonafideHC, String tariffCode,
		java.util.Date dateofIssue) {

		return getService().updateHealthCarePermit(
			caseId, transaction, nameofApplicant, Category, pirPermt,
			bonafideHC, tariffCode, dateofIssue);
	}

	public static HealthCarePermitLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<HealthCarePermitLocalService>
		_serviceSnapshot = new Snapshot<>(
			HealthCarePermitLocalServiceUtil.class,
			HealthCarePermitLocalService.class);

}