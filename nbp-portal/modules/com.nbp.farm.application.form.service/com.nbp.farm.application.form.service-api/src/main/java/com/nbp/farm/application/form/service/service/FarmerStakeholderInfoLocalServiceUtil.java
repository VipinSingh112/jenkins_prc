/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.farm.application.form.service.model.FarmerStakeholderInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FarmerStakeholderInfo. This utility wraps
 * <code>com.nbp.farm.application.form.service.service.impl.FarmerStakeholderInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderInfoLocalService
 * @generated
 */
public class FarmerStakeholderInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.farm.application.form.service.service.impl.FarmerStakeholderInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the farmer stakeholder info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderInfo the farmer stakeholder info
	 * @return the farmer stakeholder info that was added
	 */
	public static FarmerStakeholderInfo addFarmerStakeholderInfo(
		FarmerStakeholderInfo farmerStakeholderInfo) {

		return getService().addFarmerStakeholderInfo(farmerStakeholderInfo);
	}

	/**
	 * Creates a new farmer stakeholder info with the primary key. Does not add the farmer stakeholder info to the database.
	 *
	 * @param farmerStakeholderInfoId the primary key for the new farmer stakeholder info
	 * @return the new farmer stakeholder info
	 */
	public static FarmerStakeholderInfo createFarmerStakeholderInfo(
		long farmerStakeholderInfoId) {

		return getService().createFarmerStakeholderInfo(
			farmerStakeholderInfoId);
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
	 * Deletes the farmer stakeholder info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderInfo the farmer stakeholder info
	 * @return the farmer stakeholder info that was removed
	 */
	public static FarmerStakeholderInfo deleteFarmerStakeholderInfo(
		FarmerStakeholderInfo farmerStakeholderInfo) {

		return getService().deleteFarmerStakeholderInfo(farmerStakeholderInfo);
	}

	/**
	 * Deletes the farmer stakeholder info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info that was removed
	 * @throws PortalException if a farmer stakeholder info with the primary key could not be found
	 */
	public static FarmerStakeholderInfo deleteFarmerStakeholderInfo(
			long farmerStakeholderInfoId)
		throws PortalException {

		return getService().deleteFarmerStakeholderInfo(
			farmerStakeholderInfoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderInfoModelImpl</code>.
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

	public static FarmerStakeholderInfo fetchBygetFA_FSH_by_AppId(
		long ApplicationId) {

		return getService().fetchBygetFA_FSH_by_AppId(ApplicationId);
	}

	public static FarmerStakeholderInfo fetchFarmerStakeholderInfo(
		long farmerStakeholderInfoId) {

		return getService().fetchFarmerStakeholderInfo(farmerStakeholderInfoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<FarmerStakeholderInfo> getFA_SH_FAI(long ApplicationId) {
		return getService().getFA_SH_FAI(ApplicationId);
	}

	public static FarmerStakeholderInfo getFarmerById(long ApplicationId) {
		return getService().getFarmerById(ApplicationId);
	}

	/**
	 * Returns the farmer stakeholder info with the primary key.
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info
	 * @throws PortalException if a farmer stakeholder info with the primary key could not be found
	 */
	public static FarmerStakeholderInfo getFarmerStakeholderInfo(
			long farmerStakeholderInfoId)
		throws PortalException {

		return getService().getFarmerStakeholderInfo(farmerStakeholderInfoId);
	}

	/**
	 * Returns a range of all the farmer stakeholder infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @return the range of farmer stakeholder infos
	 */
	public static List<FarmerStakeholderInfo> getFarmerStakeholderInfos(
		int start, int end) {

		return getService().getFarmerStakeholderInfos(start, end);
	}

	/**
	 * Returns the number of farmer stakeholder infos.
	 *
	 * @return the number of farmer stakeholder infos
	 */
	public static int getFarmerStakeholderInfosCount() {
		return getService().getFarmerStakeholderInfosCount();
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
	 * Updates the farmer stakeholder info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderInfo the farmer stakeholder info
	 * @return the farmer stakeholder info that was updated
	 */
	public static FarmerStakeholderInfo updateFarmerStakeholderInfo(
		FarmerStakeholderInfo farmerStakeholderInfo) {

		return getService().updateFarmerStakeholderInfo(farmerStakeholderInfo);
	}

	public static FarmerStakeholderInfoLocalService getService() {
		return _service;
	}

	private static volatile FarmerStakeholderInfoLocalService _service;

}