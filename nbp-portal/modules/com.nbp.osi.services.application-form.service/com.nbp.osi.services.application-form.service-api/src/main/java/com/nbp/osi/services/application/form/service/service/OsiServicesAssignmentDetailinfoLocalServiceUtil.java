/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.application.form.service.model.OsiServicesAssignmentDetailinfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiServicesAssignmentDetailinfo. This utility wraps
 * <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesAssignmentDetailinfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAssignmentDetailinfoLocalService
 * @generated
 */
public class OsiServicesAssignmentDetailinfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesAssignmentDetailinfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi services assignment detailinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesAssignmentDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesAssignmentDetailinfo the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo that was added
	 */
	public static OsiServicesAssignmentDetailinfo
		addOsiServicesAssignmentDetailinfo(
			OsiServicesAssignmentDetailinfo osiServicesAssignmentDetailinfo) {

		return getService().addOsiServicesAssignmentDetailinfo(
			osiServicesAssignmentDetailinfo);
	}

	/**
	 * Creates a new osi services assignment detailinfo with the primary key. Does not add the osi services assignment detailinfo to the database.
	 *
	 * @param osiADId the primary key for the new osi services assignment detailinfo
	 * @return the new osi services assignment detailinfo
	 */
	public static OsiServicesAssignmentDetailinfo
		createOsiServicesAssignmentDetailinfo(long osiADId) {

		return getService().createOsiServicesAssignmentDetailinfo(osiADId);
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
	 * Deletes the osi services assignment detailinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesAssignmentDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiADId the primary key of the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo that was removed
	 * @throws PortalException if a osi services assignment detailinfo with the primary key could not be found
	 */
	public static OsiServicesAssignmentDetailinfo
			deleteOsiServicesAssignmentDetailinfo(long osiADId)
		throws PortalException {

		return getService().deleteOsiServicesAssignmentDetailinfo(osiADId);
	}

	/**
	 * Deletes the osi services assignment detailinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesAssignmentDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesAssignmentDetailinfo the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo that was removed
	 */
	public static OsiServicesAssignmentDetailinfo
		deleteOsiServicesAssignmentDetailinfo(
			OsiServicesAssignmentDetailinfo osiServicesAssignmentDetailinfo) {

		return getService().deleteOsiServicesAssignmentDetailinfo(
			osiServicesAssignmentDetailinfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesAssignmentDetailinfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesAssignmentDetailinfoModelImpl</code>.
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

	public static OsiServicesAssignmentDetailinfo
		fetchOsiServicesAssignmentDetailinfo(long osiADId) {

		return getService().fetchOsiServicesAssignmentDetailinfo(osiADId);
	}

	/**
	 * Returns the osi services assignment detailinfo matching the UUID and group.
	 *
	 * @param uuid the osi services assignment detailinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services assignment detailinfo, or <code>null</code> if a matching osi services assignment detailinfo could not be found
	 */
	public static OsiServicesAssignmentDetailinfo
		fetchOsiServicesAssignmentDetailinfoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchOsiServicesAssignmentDetailinfoByUuidAndGroupId(uuid, groupId);
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

	public static OsiServicesAssignmentDetailinfo
			getOsiServiceAssignmentInfoById(long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesAssignmentDetailinfoException {

		return getService().getOsiServiceAssignmentInfoById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services assignment detailinfo with the primary key.
	 *
	 * @param osiADId the primary key of the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo
	 * @throws PortalException if a osi services assignment detailinfo with the primary key could not be found
	 */
	public static OsiServicesAssignmentDetailinfo
			getOsiServicesAssignmentDetailinfo(long osiADId)
		throws PortalException {

		return getService().getOsiServicesAssignmentDetailinfo(osiADId);
	}

	/**
	 * Returns the osi services assignment detailinfo matching the UUID and group.
	 *
	 * @param uuid the osi services assignment detailinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services assignment detailinfo
	 * @throws PortalException if a matching osi services assignment detailinfo could not be found
	 */
	public static OsiServicesAssignmentDetailinfo
			getOsiServicesAssignmentDetailinfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getOsiServicesAssignmentDetailinfoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services assignment detailinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesAssignmentDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @return the range of osi services assignment detailinfos
	 */
	public static List<OsiServicesAssignmentDetailinfo>
		getOsiServicesAssignmentDetailinfos(int start, int end) {

		return getService().getOsiServicesAssignmentDetailinfos(start, end);
	}

	/**
	 * Returns all the osi services assignment detailinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services assignment detailinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services assignment detailinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesAssignmentDetailinfo>
		getOsiServicesAssignmentDetailinfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getOsiServicesAssignmentDetailinfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services assignment detailinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services assignment detailinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services assignment detailinfos
	 * @param end the upper bound of the range of osi services assignment detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services assignment detailinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesAssignmentDetailinfo>
		getOsiServicesAssignmentDetailinfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesAssignmentDetailinfo>
				orderByComparator) {

		return getService().
			getOsiServicesAssignmentDetailinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services assignment detailinfos.
	 *
	 * @return the number of osi services assignment detailinfos
	 */
	public static int getOsiServicesAssignmentDetailinfosCount() {
		return getService().getOsiServicesAssignmentDetailinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services assignment detailinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesAssignmentDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesAssignmentDetailinfo the osi services assignment detailinfo
	 * @return the osi services assignment detailinfo that was updated
	 */
	public static OsiServicesAssignmentDetailinfo
		updateOsiServicesAssignmentDetailinfo(
			OsiServicesAssignmentDetailinfo osiServicesAssignmentDetailinfo) {

		return getService().updateOsiServicesAssignmentDetailinfo(
			osiServicesAssignmentDetailinfo);
	}

	public static OsiServicesAssignmentDetailinfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiServicesAssignmentDetailinfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiServicesAssignmentDetailinfoLocalServiceUtil.class,
			OsiServicesAssignmentDetailinfoLocalService.class);

}