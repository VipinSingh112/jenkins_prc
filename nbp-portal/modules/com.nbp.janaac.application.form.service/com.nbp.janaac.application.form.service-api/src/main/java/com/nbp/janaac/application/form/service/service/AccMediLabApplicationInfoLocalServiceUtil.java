/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AccMediLabApplicationInfo. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AccMediLabApplicationInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabApplicationInfoLocalService
 * @generated
 */
public class AccMediLabApplicationInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AccMediLabApplicationInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acc medi lab application info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabApplicationInfo the acc medi lab application info
	 * @return the acc medi lab application info that was added
	 */
	public static AccMediLabApplicationInfo addAccMediLabApplicationInfo(
		AccMediLabApplicationInfo accMediLabApplicationInfo) {

		return getService().addAccMediLabApplicationInfo(
			accMediLabApplicationInfo);
	}

	/**
	 * Creates a new acc medi lab application info with the primary key. Does not add the acc medi lab application info to the database.
	 *
	 * @param accMediLabApplicationInfoId the primary key for the new acc medi lab application info
	 * @return the new acc medi lab application info
	 */
	public static AccMediLabApplicationInfo createAccMediLabApplicationInfo(
		long accMediLabApplicationInfoId) {

		return getService().createAccMediLabApplicationInfo(
			accMediLabApplicationInfoId);
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
	 * Deletes the acc medi lab application info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabApplicationInfo the acc medi lab application info
	 * @return the acc medi lab application info that was removed
	 */
	public static AccMediLabApplicationInfo deleteAccMediLabApplicationInfo(
		AccMediLabApplicationInfo accMediLabApplicationInfo) {

		return getService().deleteAccMediLabApplicationInfo(
			accMediLabApplicationInfo);
	}

	/**
	 * Deletes the acc medi lab application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabApplicationInfoId the primary key of the acc medi lab application info
	 * @return the acc medi lab application info that was removed
	 * @throws PortalException if a acc medi lab application info with the primary key could not be found
	 */
	public static AccMediLabApplicationInfo deleteAccMediLabApplicationInfo(
			long accMediLabApplicationInfoId)
		throws PortalException {

		return getService().deleteAccMediLabApplicationInfo(
			accMediLabApplicationInfoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabApplicationInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabApplicationInfoModelImpl</code>.
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

	public static AccMediLabApplicationInfo fetchAccMediLabApplicationInfo(
		long accMediLabApplicationInfoId) {

		return getService().fetchAccMediLabApplicationInfo(
			accMediLabApplicationInfoId);
	}

	/**
	 * Returns the acc medi lab application info matching the UUID and group.
	 *
	 * @param uuid the acc medi lab application info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo
		fetchAccMediLabApplicationInfoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchAccMediLabApplicationInfoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acc medi lab application info with the primary key.
	 *
	 * @param accMediLabApplicationInfoId the primary key of the acc medi lab application info
	 * @return the acc medi lab application info
	 * @throws PortalException if a acc medi lab application info with the primary key could not be found
	 */
	public static AccMediLabApplicationInfo getAccMediLabApplicationInfo(
			long accMediLabApplicationInfoId)
		throws PortalException {

		return getService().getAccMediLabApplicationInfo(
			accMediLabApplicationInfoId);
	}

	/**
	 * Returns the acc medi lab application info matching the UUID and group.
	 *
	 * @param uuid the acc medi lab application info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab application info
	 * @throws PortalException if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo
			getAccMediLabApplicationInfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getAccMediLabApplicationInfoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acc medi lab application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @return the range of acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> getAccMediLabApplicationInfos(
		int start, int end) {

		return getService().getAccMediLabApplicationInfos(start, end);
	}

	/**
	 * Returns all the acc medi lab application infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab application infos
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab application infos, or an empty list if no matches were found
	 */
	public static List<AccMediLabApplicationInfo>
		getAccMediLabApplicationInfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getAccMediLabApplicationInfosByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acc medi lab application infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab application infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab application infos, or an empty list if no matches were found
	 */
	public static List<AccMediLabApplicationInfo>
		getAccMediLabApplicationInfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccMediLabApplicationInfo> orderByComparator) {

		return getService().getAccMediLabApplicationInfosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc medi lab application infos.
	 *
	 * @return the number of acc medi lab application infos
	 */
	public static int getAccMediLabApplicationInfosCount() {
		return getService().getAccMediLabApplicationInfosCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static AccMediLabApplicationInfo getApplicantInfo(
			long jannacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getService().getApplicantInfo(jannacApplicationId);
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
	 * Updates the acc medi lab application info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabApplicationInfo the acc medi lab application info
	 * @return the acc medi lab application info that was updated
	 */
	public static AccMediLabApplicationInfo updateAccMediLabApplicationInfo(
		AccMediLabApplicationInfo accMediLabApplicationInfo) {

		return getService().updateAccMediLabApplicationInfo(
			accMediLabApplicationInfo);
	}

	public static AccMediLabApplicationInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AccMediLabApplicationInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			AccMediLabApplicationInfoLocalServiceUtil.class,
			AccMediLabApplicationInfoLocalService.class);

}