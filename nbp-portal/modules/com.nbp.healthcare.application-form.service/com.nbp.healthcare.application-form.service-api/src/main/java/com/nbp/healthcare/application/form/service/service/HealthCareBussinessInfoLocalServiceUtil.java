/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.application.form.service.model.HealthCareBussinessInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HealthCareBussinessInfo. This utility wraps
 * <code>com.nbp.healthcare.application.form.service.service.impl.HealthCareBussinessInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBussinessInfoLocalService
 * @generated
 */
public class HealthCareBussinessInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.healthcare.application.form.service.service.impl.HealthCareBussinessInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the health care bussiness info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareBussinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareBussinessInfo the health care bussiness info
	 * @return the health care bussiness info that was added
	 */
	public static HealthCareBussinessInfo addHealthCareBussinessInfo(
		HealthCareBussinessInfo healthCareBussinessInfo) {

		return getService().addHealthCareBussinessInfo(healthCareBussinessInfo);
	}

	/**
	 * Creates a new health care bussiness info with the primary key. Does not add the health care bussiness info to the database.
	 *
	 * @param healthCareBussinessInfoId the primary key for the new health care bussiness info
	 * @return the new health care bussiness info
	 */
	public static HealthCareBussinessInfo createHealthCareBussinessInfo(
		long healthCareBussinessInfoId) {

		return getService().createHealthCareBussinessInfo(
			healthCareBussinessInfoId);
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
	 * Deletes the health care bussiness info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareBussinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareBussinessInfo the health care bussiness info
	 * @return the health care bussiness info that was removed
	 */
	public static HealthCareBussinessInfo deleteHealthCareBussinessInfo(
		HealthCareBussinessInfo healthCareBussinessInfo) {

		return getService().deleteHealthCareBussinessInfo(
			healthCareBussinessInfo);
	}

	/**
	 * Deletes the health care bussiness info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareBussinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareBussinessInfoId the primary key of the health care bussiness info
	 * @return the health care bussiness info that was removed
	 * @throws PortalException if a health care bussiness info with the primary key could not be found
	 */
	public static HealthCareBussinessInfo deleteHealthCareBussinessInfo(
			long healthCareBussinessInfoId)
		throws PortalException {

		return getService().deleteHealthCareBussinessInfo(
			healthCareBussinessInfoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareBussinessInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareBussinessInfoModelImpl</code>.
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

	public static HealthCareBussinessInfo fetchHealthCareBussinessInfo(
		long healthCareBussinessInfoId) {

		return getService().fetchHealthCareBussinessInfo(
			healthCareBussinessInfoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the health care bussiness info with the primary key.
	 *
	 * @param healthCareBussinessInfoId the primary key of the health care bussiness info
	 * @return the health care bussiness info
	 * @throws PortalException if a health care bussiness info with the primary key could not be found
	 */
	public static HealthCareBussinessInfo getHealthCareBussinessInfo(
			long healthCareBussinessInfoId)
		throws PortalException {

		return getService().getHealthCareBussinessInfo(
			healthCareBussinessInfoId);
	}

	/**
	 * Returns a range of all the health care bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care bussiness infos
	 * @param end the upper bound of the range of health care bussiness infos (not inclusive)
	 * @return the range of health care bussiness infos
	 */
	public static List<HealthCareBussinessInfo> getHealthCareBussinessInfos(
		int start, int end) {

		return getService().getHealthCareBussinessInfos(start, end);
	}

	/**
	 * Returns the number of health care bussiness infos.
	 *
	 * @return the number of health care bussiness infos
	 */
	public static int getHealthCareBussinessInfosCount() {
		return getService().getHealthCareBussinessInfosCount();
	}

	public static HealthCareBussinessInfo getHealthCareById(
		long healthCareById) {

		return getService().getHealthCareById(healthCareById);
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
	 * Updates the health care bussiness info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareBussinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareBussinessInfo the health care bussiness info
	 * @return the health care bussiness info that was updated
	 */
	public static HealthCareBussinessInfo updateHealthCareBussinessInfo(
		HealthCareBussinessInfo healthCareBussinessInfo) {

		return getService().updateHealthCareBussinessInfo(
			healthCareBussinessInfo);
	}

	public static HealthCareBussinessInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<HealthCareBussinessInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			HealthCareBussinessInfoLocalServiceUtil.class,
			HealthCareBussinessInfoLocalService.class);

}