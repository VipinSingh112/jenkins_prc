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

import com.nbp.healthcare.application.form.service.model.HealthCareEquipmentInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HealthCareEquipmentInfo. This utility wraps
 * <code>com.nbp.healthcare.application.form.service.service.impl.HealthCareEquipmentInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareEquipmentInfoLocalService
 * @generated
 */
public class HealthCareEquipmentInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.healthcare.application.form.service.service.impl.HealthCareEquipmentInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the health care equipment info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareEquipmentInfo the health care equipment info
	 * @return the health care equipment info that was added
	 */
	public static HealthCareEquipmentInfo addHealthCareEquipmentInfo(
		HealthCareEquipmentInfo healthCareEquipmentInfo) {

		return getService().addHealthCareEquipmentInfo(healthCareEquipmentInfo);
	}

	/**
	 * Creates a new health care equipment info with the primary key. Does not add the health care equipment info to the database.
	 *
	 * @param healthCareEquipmentInfoId the primary key for the new health care equipment info
	 * @return the new health care equipment info
	 */
	public static HealthCareEquipmentInfo createHealthCareEquipmentInfo(
		long healthCareEquipmentInfoId) {

		return getService().createHealthCareEquipmentInfo(
			healthCareEquipmentInfoId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteHC_EB_HAI(long healthCareApplicationId) {
		getService().deleteHC_EB_HAI(healthCareApplicationId);
	}

	/**
	 * Deletes the health care equipment info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareEquipmentInfo the health care equipment info
	 * @return the health care equipment info that was removed
	 */
	public static HealthCareEquipmentInfo deleteHealthCareEquipmentInfo(
		HealthCareEquipmentInfo healthCareEquipmentInfo) {

		return getService().deleteHealthCareEquipmentInfo(
			healthCareEquipmentInfo);
	}

	/**
	 * Deletes the health care equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info that was removed
	 * @throws PortalException if a health care equipment info with the primary key could not be found
	 */
	public static HealthCareEquipmentInfo deleteHealthCareEquipmentInfo(
			long healthCareEquipmentInfoId)
		throws PortalException {

		return getService().deleteHealthCareEquipmentInfo(
			healthCareEquipmentInfoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareEquipmentInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareEquipmentInfoModelImpl</code>.
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

	public static HealthCareEquipmentInfo fetchHealthCareEquipmentInfo(
		long healthCareEquipmentInfoId) {

		return getService().fetchHealthCareEquipmentInfo(
			healthCareEquipmentInfoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<HealthCareEquipmentInfo> getHC_EB_HAI(
		long healthCareApplicationId) {

		return getService().getHC_EB_HAI(healthCareApplicationId);
	}

	/**
	 * Returns the health care equipment info with the primary key.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info
	 * @throws PortalException if a health care equipment info with the primary key could not be found
	 */
	public static HealthCareEquipmentInfo getHealthCareEquipmentInfo(
			long healthCareEquipmentInfoId)
		throws PortalException {

		return getService().getHealthCareEquipmentInfo(
			healthCareEquipmentInfoId);
	}

	/**
	 * Returns a range of all the health care equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @return the range of health care equipment infos
	 */
	public static List<HealthCareEquipmentInfo> getHealthCareEquipmentInfos(
		int start, int end) {

		return getService().getHealthCareEquipmentInfos(start, end);
	}

	/**
	 * Returns the number of health care equipment infos.
	 *
	 * @return the number of health care equipment infos
	 */
	public static int getHealthCareEquipmentInfosCount() {
		return getService().getHealthCareEquipmentInfosCount();
	}

	public static HealthCareEquipmentInfo getHelathCareById(
		long healthCareApplicationId) {

		return getService().getHelathCareById(healthCareApplicationId);
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
	 * Updates the health care equipment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareEquipmentInfo the health care equipment info
	 * @return the health care equipment info that was updated
	 */
	public static HealthCareEquipmentInfo updateHealthCareEquipmentInfo(
		HealthCareEquipmentInfo healthCareEquipmentInfo) {

		return getService().updateHealthCareEquipmentInfo(
			healthCareEquipmentInfo);
	}

	public static HealthCareEquipmentInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<HealthCareEquipmentInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			HealthCareEquipmentInfoLocalServiceUtil.class,
			HealthCareEquipmentInfoLocalService.class);

}