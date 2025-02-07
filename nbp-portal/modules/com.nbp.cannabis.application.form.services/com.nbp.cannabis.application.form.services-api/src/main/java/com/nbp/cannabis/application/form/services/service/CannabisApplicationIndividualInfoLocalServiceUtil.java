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

import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisApplicationIndividualInfo. This utility wraps
 * <code>com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationIndividualInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualInfoLocalService
 * @generated
 */
public class CannabisApplicationIndividualInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationIndividualInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis application individual info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationIndividualInfo the cannabis application individual info
	 * @return the cannabis application individual info that was added
	 */
	public static CannabisApplicationIndividualInfo
		addCannabisApplicationIndividualInfo(
			CannabisApplicationIndividualInfo
				cannabisApplicationIndividualInfo) {

		return getService().addCannabisApplicationIndividualInfo(
			cannabisApplicationIndividualInfo);
	}

	/**
	 * Creates a new cannabis application individual info with the primary key. Does not add the cannabis application individual info to the database.
	 *
	 * @param individualInformationId the primary key for the new cannabis application individual info
	 * @return the new cannabis application individual info
	 */
	public static CannabisApplicationIndividualInfo
		createCannabisApplicationIndividualInfo(long individualInformationId) {

		return getService().createCannabisApplicationIndividualInfo(
			individualInformationId);
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
	 * Deletes the cannabis application individual info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationIndividualInfo the cannabis application individual info
	 * @return the cannabis application individual info that was removed
	 */
	public static CannabisApplicationIndividualInfo
		deleteCannabisApplicationIndividualInfo(
			CannabisApplicationIndividualInfo
				cannabisApplicationIndividualInfo) {

		return getService().deleteCannabisApplicationIndividualInfo(
			cannabisApplicationIndividualInfo);
	}

	/**
	 * Deletes the cannabis application individual info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param individualInformationId the primary key of the cannabis application individual info
	 * @return the cannabis application individual info that was removed
	 * @throws PortalException if a cannabis application individual info with the primary key could not be found
	 */
	public static CannabisApplicationIndividualInfo
			deleteCannabisApplicationIndividualInfo(
				long individualInformationId)
		throws PortalException {

		return getService().deleteCannabisApplicationIndividualInfo(
			individualInformationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualInfoModelImpl</code>.
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

	public static CannabisApplicationIndividualInfo
		fetchCannabisApplicationIndividualInfo(long individualInformationId) {

		return getService().fetchCannabisApplicationIndividualInfo(
			individualInformationId);
	}

	/**
	 * Returns the cannabis application individual info matching the UUID and group.
	 *
	 * @param uuid the cannabis application individual info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo
		fetchCannabisApplicationIndividualInfoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchCannabisApplicationIndividualInfoByUuidAndGroupId(
				uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static CannabisApplicationIndividualInfo getCA_CI_by_AppId(
		long cannabisApplicationId) {

		return getService().getCA_CI_by_AppId(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application individual info with the primary key.
	 *
	 * @param individualInformationId the primary key of the cannabis application individual info
	 * @return the cannabis application individual info
	 * @throws PortalException if a cannabis application individual info with the primary key could not be found
	 */
	public static CannabisApplicationIndividualInfo
			getCannabisApplicationIndividualInfo(long individualInformationId)
		throws PortalException {

		return getService().getCannabisApplicationIndividualInfo(
			individualInformationId);
	}

	/**
	 * Returns the cannabis application individual info matching the UUID and group.
	 *
	 * @param uuid the cannabis application individual info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application individual info
	 * @throws PortalException if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo
			getCannabisApplicationIndividualInfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().
			getCannabisApplicationIndividualInfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis application individual infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @return the range of cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo>
		getCannabisApplicationIndividualInfos(int start, int end) {

		return getService().getCannabisApplicationIndividualInfos(start, end);
	}

	/**
	 * Returns all the cannabis application individual infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application individual infos
	 * @param companyId the primary key of the company
	 * @return the matching cannabis application individual infos, or an empty list if no matches were found
	 */
	public static List<CannabisApplicationIndividualInfo>
		getCannabisApplicationIndividualInfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getCannabisApplicationIndividualInfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis application individual infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application individual infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis application individual infos, or an empty list if no matches were found
	 */
	public static List<CannabisApplicationIndividualInfo>
		getCannabisApplicationIndividualInfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CannabisApplicationIndividualInfo>
				orderByComparator) {

		return getService().
			getCannabisApplicationIndividualInfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis application individual infos.
	 *
	 * @return the number of cannabis application individual infos
	 */
	public static int getCannabisApplicationIndividualInfosCount() {
		return getService().getCannabisApplicationIndividualInfosCount();
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
	 * Updates the cannabis application individual info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationIndividualInfo the cannabis application individual info
	 * @return the cannabis application individual info that was updated
	 */
	public static CannabisApplicationIndividualInfo
		updateCannabisApplicationIndividualInfo(
			CannabisApplicationIndividualInfo
				cannabisApplicationIndividualInfo) {

		return getService().updateCannabisApplicationIndividualInfo(
			cannabisApplicationIndividualInfo);
	}

	public static CannabisApplicationIndividualInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisApplicationIndividualInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisApplicationIndividualInfoLocalServiceUtil.class,
			CannabisApplicationIndividualInfoLocalService.class);

}