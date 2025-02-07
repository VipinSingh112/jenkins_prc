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

import com.nbp.osi.services.application.form.service.model.OsiServicesInsolventPersoninfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiServicesInsolventPersoninfo. This utility wraps
 * <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesInsolventPersoninfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesInsolventPersoninfoLocalService
 * @generated
 */
public class OsiServicesInsolventPersoninfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesInsolventPersoninfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi services insolvent personinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesInsolventPersoninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesInsolventPersoninfo the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo that was added
	 */
	public static OsiServicesInsolventPersoninfo
		addOsiServicesInsolventPersoninfo(
			OsiServicesInsolventPersoninfo osiServicesInsolventPersoninfo) {

		return getService().addOsiServicesInsolventPersoninfo(
			osiServicesInsolventPersoninfo);
	}

	/**
	 * Creates a new osi services insolvent personinfo with the primary key. Does not add the osi services insolvent personinfo to the database.
	 *
	 * @param osiServicesInsoId the primary key for the new osi services insolvent personinfo
	 * @return the new osi services insolvent personinfo
	 */
	public static OsiServicesInsolventPersoninfo
		createOsiServicesInsolventPersoninfo(long osiServicesInsoId) {

		return getService().createOsiServicesInsolventPersoninfo(
			osiServicesInsoId);
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
	 * Deletes the osi services insolvent personinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesInsolventPersoninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesInsoId the primary key of the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo that was removed
	 * @throws PortalException if a osi services insolvent personinfo with the primary key could not be found
	 */
	public static OsiServicesInsolventPersoninfo
			deleteOsiServicesInsolventPersoninfo(long osiServicesInsoId)
		throws PortalException {

		return getService().deleteOsiServicesInsolventPersoninfo(
			osiServicesInsoId);
	}

	/**
	 * Deletes the osi services insolvent personinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesInsolventPersoninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesInsolventPersoninfo the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo that was removed
	 */
	public static OsiServicesInsolventPersoninfo
		deleteOsiServicesInsolventPersoninfo(
			OsiServicesInsolventPersoninfo osiServicesInsolventPersoninfo) {

		return getService().deleteOsiServicesInsolventPersoninfo(
			osiServicesInsolventPersoninfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesInsolventPersoninfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesInsolventPersoninfoModelImpl</code>.
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

	public static OsiServicesInsolventPersoninfo
		fetchOsiServicesInsolventPersoninfo(long osiServicesInsoId) {

		return getService().fetchOsiServicesInsolventPersoninfo(
			osiServicesInsoId);
	}

	/**
	 * Returns the osi services insolvent personinfo matching the UUID and group.
	 *
	 * @param uuid the osi services insolvent personinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services insolvent personinfo, or <code>null</code> if a matching osi services insolvent personinfo could not be found
	 */
	public static OsiServicesInsolventPersoninfo
		fetchOsiServicesInsolventPersoninfoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchOsiServicesInsolventPersoninfoByUuidAndGroupId(
			uuid, groupId);
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

	/**
	 * Returns the osi services insolvent personinfo with the primary key.
	 *
	 * @param osiServicesInsoId the primary key of the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo
	 * @throws PortalException if a osi services insolvent personinfo with the primary key could not be found
	 */
	public static OsiServicesInsolventPersoninfo
			getOsiServicesInsolventPersoninfo(long osiServicesInsoId)
		throws PortalException {

		return getService().getOsiServicesInsolventPersoninfo(
			osiServicesInsoId);
	}

	public static OsiServicesInsolventPersoninfo
			getOsiServicesInsolventPersoninfoById(long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesInsolventPersoninfoException {

		return getService().getOsiServicesInsolventPersoninfoById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services insolvent personinfo matching the UUID and group.
	 *
	 * @param uuid the osi services insolvent personinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services insolvent personinfo
	 * @throws PortalException if a matching osi services insolvent personinfo could not be found
	 */
	public static OsiServicesInsolventPersoninfo
			getOsiServicesInsolventPersoninfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getOsiServicesInsolventPersoninfoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services insolvent personinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesInsolventPersoninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @return the range of osi services insolvent personinfos
	 */
	public static List<OsiServicesInsolventPersoninfo>
		getOsiServicesInsolventPersoninfos(int start, int end) {

		return getService().getOsiServicesInsolventPersoninfos(start, end);
	}

	/**
	 * Returns all the osi services insolvent personinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services insolvent personinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services insolvent personinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesInsolventPersoninfo>
		getOsiServicesInsolventPersoninfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getOsiServicesInsolventPersoninfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services insolvent personinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services insolvent personinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services insolvent personinfos
	 * @param end the upper bound of the range of osi services insolvent personinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services insolvent personinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesInsolventPersoninfo>
		getOsiServicesInsolventPersoninfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesInsolventPersoninfo>
				orderByComparator) {

		return getService().
			getOsiServicesInsolventPersoninfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services insolvent personinfos.
	 *
	 * @return the number of osi services insolvent personinfos
	 */
	public static int getOsiServicesInsolventPersoninfosCount() {
		return getService().getOsiServicesInsolventPersoninfosCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services insolvent personinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesInsolventPersoninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesInsolventPersoninfo the osi services insolvent personinfo
	 * @return the osi services insolvent personinfo that was updated
	 */
	public static OsiServicesInsolventPersoninfo
		updateOsiServicesInsolventPersoninfo(
			OsiServicesInsolventPersoninfo osiServicesInsolventPersoninfo) {

		return getService().updateOsiServicesInsolventPersoninfo(
			osiServicesInsolventPersoninfo);
	}

	public static OsiServicesInsolventPersoninfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiServicesInsolventPersoninfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiServicesInsolventPersoninfoLocalServiceUtil.class,
			OsiServicesInsolventPersoninfoLocalService.class);

}