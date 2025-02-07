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

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeLicenseBreakdowninfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiServicesTrusteeLicenseBreakdowninfo. This utility wraps
 * <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeLicenseBreakdowninfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeLicenseBreakdowninfoLocalService
 * @generated
 */
public class OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeLicenseBreakdowninfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi services trustee license breakdowninfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeLicenseBreakdowninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeLicenseBreakdowninfo the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo that was added
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo
		addOsiServicesTrusteeLicenseBreakdowninfo(
			OsiServicesTrusteeLicenseBreakdowninfo
				osiServicesTrusteeLicenseBreakdowninfo) {

		return getService().addOsiServicesTrusteeLicenseBreakdowninfo(
			osiServicesTrusteeLicenseBreakdowninfo);
	}

	/**
	 * Creates a new osi services trustee license breakdowninfo with the primary key. Does not add the osi services trustee license breakdowninfo to the database.
	 *
	 * @param osiLicBreakId the primary key for the new osi services trustee license breakdowninfo
	 * @return the new osi services trustee license breakdowninfo
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo
		createOsiServicesTrusteeLicenseBreakdowninfo(long osiLicBreakId) {

		return getService().createOsiServicesTrusteeLicenseBreakdowninfo(
			osiLicBreakId);
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
	 * Deletes the osi services trustee license breakdowninfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeLicenseBreakdowninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo that was removed
	 * @throws PortalException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo
			deleteOsiServicesTrusteeLicenseBreakdowninfo(long osiLicBreakId)
		throws PortalException {

		return getService().deleteOsiServicesTrusteeLicenseBreakdowninfo(
			osiLicBreakId);
	}

	/**
	 * Deletes the osi services trustee license breakdowninfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeLicenseBreakdowninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeLicenseBreakdowninfo the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo that was removed
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo
		deleteOsiServicesTrusteeLicenseBreakdowninfo(
			OsiServicesTrusteeLicenseBreakdowninfo
				osiServicesTrusteeLicenseBreakdowninfo) {

		return getService().deleteOsiServicesTrusteeLicenseBreakdowninfo(
			osiServicesTrusteeLicenseBreakdowninfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
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

	public static OsiServicesTrusteeLicenseBreakdowninfo
		fetchOsiServicesTrusteeLicenseBreakdowninfo(long osiLicBreakId) {

		return getService().fetchOsiServicesTrusteeLicenseBreakdowninfo(
			osiLicBreakId);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee license breakdowninfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo
		fetchOsiServicesTrusteeLicenseBreakdowninfoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchOsiServicesTrusteeLicenseBreakdowninfoByUuidAndGroupId(
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
	 * Returns the osi services trustee license breakdowninfo with the primary key.
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo
	 * @throws PortalException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo
			getOsiServicesTrusteeLicenseBreakdowninfo(long osiLicBreakId)
		throws PortalException {

		return getService().getOsiServicesTrusteeLicenseBreakdowninfo(
			osiLicBreakId);
	}

	public static OsiServicesTrusteeLicenseBreakdowninfo
			getOsiServicesTrusteeLicenseBreakdowninfoById(long applicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getService().getOsiServicesTrusteeLicenseBreakdowninfoById(
			applicationId);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee license breakdowninfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee license breakdowninfo
	 * @throws PortalException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo
			getOsiServicesTrusteeLicenseBreakdowninfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().
			getOsiServicesTrusteeLicenseBreakdowninfoByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services trustee license breakdowninfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @return the range of osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo>
		getOsiServicesTrusteeLicenseBreakdowninfos(int start, int end) {

		return getService().getOsiServicesTrusteeLicenseBreakdowninfos(
			start, end);
	}

	/**
	 * Returns all the osi services trustee license breakdowninfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee license breakdowninfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee license breakdowninfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo>
		getOsiServicesTrusteeLicenseBreakdowninfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getOsiServicesTrusteeLicenseBreakdowninfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services trustee license breakdowninfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee license breakdowninfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee license breakdowninfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo>
		getOsiServicesTrusteeLicenseBreakdowninfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
				orderByComparator) {

		return getService().
			getOsiServicesTrusteeLicenseBreakdowninfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services trustee license breakdowninfos.
	 *
	 * @return the number of osi services trustee license breakdowninfos
	 */
	public static int getOsiServicesTrusteeLicenseBreakdowninfosCount() {
		return getService().getOsiServicesTrusteeLicenseBreakdowninfosCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services trustee license breakdowninfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeLicenseBreakdowninfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeLicenseBreakdowninfo the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo that was updated
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo
		updateOsiServicesTrusteeLicenseBreakdowninfo(
			OsiServicesTrusteeLicenseBreakdowninfo
				osiServicesTrusteeLicenseBreakdowninfo) {

		return getService().updateOsiServicesTrusteeLicenseBreakdowninfo(
			osiServicesTrusteeLicenseBreakdowninfo);
	}

	public static OsiServicesTrusteeLicenseBreakdowninfoLocalService
		getService() {

		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<OsiServicesTrusteeLicenseBreakdowninfoLocalService> _serviceSnapshot =
			new Snapshot<>(
				OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil.class,
				OsiServicesTrusteeLicenseBreakdowninfoLocalService.class);

}