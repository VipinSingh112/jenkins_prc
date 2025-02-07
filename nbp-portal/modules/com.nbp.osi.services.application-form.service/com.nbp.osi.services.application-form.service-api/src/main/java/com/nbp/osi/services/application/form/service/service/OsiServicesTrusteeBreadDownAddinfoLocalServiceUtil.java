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

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiServicesTrusteeBreadDownAddinfo. This utility wraps
 * <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeBreadDownAddinfoLocalService
 * @generated
 */
public class OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi services trustee bread down addinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was added
	 */
	public static OsiServicesTrusteeBreadDownAddinfo
		addOsiServicesTrusteeBreadDownAddinfo(
			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo) {

		return getService().addOsiServicesTrusteeBreadDownAddinfo(
			osiServicesTrusteeBreadDownAddinfo);
	}

	/**
	 * Creates a new osi services trustee bread down addinfo with the primary key. Does not add the osi services trustee bread down addinfo to the database.
	 *
	 * @param osiTrusId the primary key for the new osi services trustee bread down addinfo
	 * @return the new osi services trustee bread down addinfo
	 */
	public static OsiServicesTrusteeBreadDownAddinfo
		createOsiServicesTrusteeBreadDownAddinfo(long osiTrusId) {

		return getService().createOsiServicesTrusteeBreadDownAddinfo(osiTrusId);
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
	 * Deletes the osi services trustee bread down addinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was removed
	 * @throws PortalException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo
			deleteOsiServicesTrusteeBreadDownAddinfo(long osiTrusId)
		throws PortalException {

		return getService().deleteOsiServicesTrusteeBreadDownAddinfo(osiTrusId);
	}

	/**
	 * Deletes the osi services trustee bread down addinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was removed
	 */
	public static OsiServicesTrusteeBreadDownAddinfo
		deleteOsiServicesTrusteeBreadDownAddinfo(
			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo) {

		return getService().deleteOsiServicesTrusteeBreadDownAddinfo(
			osiServicesTrusteeBreadDownAddinfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
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

	public static OsiServicesTrusteeBreadDownAddinfo
		fetchOsiServicesTrusteeBreadDownAddinfo(long osiTrusId) {

		return getService().fetchOsiServicesTrusteeBreadDownAddinfo(osiTrusId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee bread down addinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo
		fetchOsiServicesTrusteeBreadDownAddinfoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchOsiServicesTrusteeBreadDownAddinfoByUuidAndGroupId(
				uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<OsiServicesTrusteeBreadDownAddinfo>
		getBreakDownAdd_By_Id(long osiId) {

		return getService().getBreakDownAdd_By_Id(osiId);
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
	 * Returns the osi services trustee bread down addinfo with the primary key.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo
	 * @throws PortalException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo
			getOsiServicesTrusteeBreadDownAddinfo(long osiTrusId)
		throws PortalException {

		return getService().getOsiServicesTrusteeBreadDownAddinfo(osiTrusId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee bread down addinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee bread down addinfo
	 * @throws PortalException if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo
			getOsiServicesTrusteeBreadDownAddinfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().
			getOsiServicesTrusteeBreadDownAddinfoByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo>
		getOsiServicesTrusteeBreadDownAddinfos(int start, int end) {

		return getService().getOsiServicesTrusteeBreadDownAddinfos(start, end);
	}

	/**
	 * Returns all the osi services trustee bread down addinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee bread down addinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee bread down addinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo>
		getOsiServicesTrusteeBreadDownAddinfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getOsiServicesTrusteeBreadDownAddinfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services trustee bread down addinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee bread down addinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee bread down addinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo>
		getOsiServicesTrusteeBreadDownAddinfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator) {

		return getService().
			getOsiServicesTrusteeBreadDownAddinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos.
	 *
	 * @return the number of osi services trustee bread down addinfos
	 */
	public static int getOsiServicesTrusteeBreadDownAddinfosCount() {
		return getService().getOsiServicesTrusteeBreadDownAddinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services trustee bread down addinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was updated
	 */
	public static OsiServicesTrusteeBreadDownAddinfo
		updateOsiServicesTrusteeBreadDownAddinfo(
			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo) {

		return getService().updateOsiServicesTrusteeBreadDownAddinfo(
			osiServicesTrusteeBreadDownAddinfo);
	}

	public static OsiServicesTrusteeBreadDownAddinfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<OsiServicesTrusteeBreadDownAddinfoLocalService> _serviceSnapshot =
			new Snapshot<>(
				OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil.class,
				OsiServicesTrusteeBreadDownAddinfoLocalService.class);

}