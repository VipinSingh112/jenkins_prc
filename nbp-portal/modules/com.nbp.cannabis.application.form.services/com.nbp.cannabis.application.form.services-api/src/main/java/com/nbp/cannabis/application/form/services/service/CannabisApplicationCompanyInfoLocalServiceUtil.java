/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisApplicationCompanyInfo. This utility wraps
 * <code>com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationCompanyInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyInfoLocalService
 * @generated
 */
public class CannabisApplicationCompanyInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationCompanyInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis application company info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyInfo the cannabis application company info
	 * @return the cannabis application company info that was added
	 */
	public static CannabisApplicationCompanyInfo
		addCannabisApplicationCompanyInfo(
			CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo) {

		return getService().addCannabisApplicationCompanyInfo(
			cannabisApplicationCompanyInfo);
	}

	/**
	 * Creates a new cannabis application company info with the primary key. Does not add the cannabis application company info to the database.
	 *
	 * @param companyInformationId the primary key for the new cannabis application company info
	 * @return the new cannabis application company info
	 */
	public static CannabisApplicationCompanyInfo
		createCannabisApplicationCompanyInfo(long companyInformationId) {

		return getService().createCannabisApplicationCompanyInfo(
			companyInformationId);
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
	 * Deletes the cannabis application company info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyInfo the cannabis application company info
	 * @return the cannabis application company info that was removed
	 */
	public static CannabisApplicationCompanyInfo
		deleteCannabisApplicationCompanyInfo(
			CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo) {

		return getService().deleteCannabisApplicationCompanyInfo(
			cannabisApplicationCompanyInfo);
	}

	/**
	 * Deletes the cannabis application company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyInformationId the primary key of the cannabis application company info
	 * @return the cannabis application company info that was removed
	 * @throws PortalException if a cannabis application company info with the primary key could not be found
	 */
	public static CannabisApplicationCompanyInfo
			deleteCannabisApplicationCompanyInfo(long companyInformationId)
		throws PortalException {

		return getService().deleteCannabisApplicationCompanyInfo(
			companyInformationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyInfoModelImpl</code>.
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

	public static CannabisApplicationCompanyInfo
		fetchCannabisApplicationCompanyInfo(long companyInformationId) {

		return getService().fetchCannabisApplicationCompanyInfo(
			companyInformationId);
	}

	/**
	 * Returns the cannabis application company info matching the UUID and group.
	 *
	 * @param uuid the cannabis application company info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application company info, or <code>null</code> if a matching cannabis application company info could not be found
	 */
	public static CannabisApplicationCompanyInfo
		fetchCannabisApplicationCompanyInfoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchCannabisApplicationCompanyInfoByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static CannabisApplicationCompanyInfo getCA_CI_by_AppId(
		long cannabisApplicationId) {

		return getService().getCA_CI_by_AppId(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application company info with the primary key.
	 *
	 * @param companyInformationId the primary key of the cannabis application company info
	 * @return the cannabis application company info
	 * @throws PortalException if a cannabis application company info with the primary key could not be found
	 */
	public static CannabisApplicationCompanyInfo
			getCannabisApplicationCompanyInfo(long companyInformationId)
		throws PortalException {

		return getService().getCannabisApplicationCompanyInfo(
			companyInformationId);
	}

	/**
	 * Returns the cannabis application company info matching the UUID and group.
	 *
	 * @param uuid the cannabis application company info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application company info
	 * @throws PortalException if a matching cannabis application company info could not be found
	 */
	public static CannabisApplicationCompanyInfo
			getCannabisApplicationCompanyInfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getCannabisApplicationCompanyInfoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis application company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @return the range of cannabis application company infos
	 */
	public static List<CannabisApplicationCompanyInfo>
		getCannabisApplicationCompanyInfos(int start, int end) {

		return getService().getCannabisApplicationCompanyInfos(start, end);
	}

	/**
	 * Returns all the cannabis application company infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application company infos
	 * @param companyId the primary key of the company
	 * @return the matching cannabis application company infos, or an empty list if no matches were found
	 */
	public static List<CannabisApplicationCompanyInfo>
		getCannabisApplicationCompanyInfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getCannabisApplicationCompanyInfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis application company infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application company infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis application company infos
	 * @param end the upper bound of the range of cannabis application company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis application company infos, or an empty list if no matches were found
	 */
	public static List<CannabisApplicationCompanyInfo>
		getCannabisApplicationCompanyInfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CannabisApplicationCompanyInfo>
				orderByComparator) {

		return getService().
			getCannabisApplicationCompanyInfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis application company infos.
	 *
	 * @return the number of cannabis application company infos
	 */
	public static int getCannabisApplicationCompanyInfosCount() {
		return getService().getCannabisApplicationCompanyInfosCount();
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

	/**
	 * Updates the cannabis application company info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyInfo the cannabis application company info
	 * @return the cannabis application company info that was updated
	 */
	public static CannabisApplicationCompanyInfo
		updateCannabisApplicationCompanyInfo(
			CannabisApplicationCompanyInfo cannabisApplicationCompanyInfo) {

		return getService().updateCannabisApplicationCompanyInfo(
			cannabisApplicationCompanyInfo);
	}

	public static CannabisApplicationCompanyInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisApplicationCompanyInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisApplicationCompanyInfoLocalServiceUtil.class,
			CannabisApplicationCompanyInfoLocalService.class);

}