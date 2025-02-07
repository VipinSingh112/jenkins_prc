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

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiServicesTrusteeCompanyinfo. This utility wraps
 * <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeCompanyinfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeCompanyinfoLocalService
 * @generated
 */
public class OsiServicesTrusteeCompanyinfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeCompanyinfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi services trustee companyinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeCompanyinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeCompanyinfo the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo that was added
	 */
	public static OsiServicesTrusteeCompanyinfo
		addOsiServicesTrusteeCompanyinfo(
			OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		return getService().addOsiServicesTrusteeCompanyinfo(
			osiServicesTrusteeCompanyinfo);
	}

	/**
	 * Creates a new osi services trustee companyinfo with the primary key. Does not add the osi services trustee companyinfo to the database.
	 *
	 * @param osiTrusId the primary key for the new osi services trustee companyinfo
	 * @return the new osi services trustee companyinfo
	 */
	public static OsiServicesTrusteeCompanyinfo
		createOsiServicesTrusteeCompanyinfo(long osiTrusId) {

		return getService().createOsiServicesTrusteeCompanyinfo(osiTrusId);
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
	 * Deletes the osi services trustee companyinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeCompanyinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiTrusId the primary key of the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo that was removed
	 * @throws PortalException if a osi services trustee companyinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeCompanyinfo
			deleteOsiServicesTrusteeCompanyinfo(long osiTrusId)
		throws PortalException {

		return getService().deleteOsiServicesTrusteeCompanyinfo(osiTrusId);
	}

	/**
	 * Deletes the osi services trustee companyinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeCompanyinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeCompanyinfo the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo that was removed
	 */
	public static OsiServicesTrusteeCompanyinfo
		deleteOsiServicesTrusteeCompanyinfo(
			OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		return getService().deleteOsiServicesTrusteeCompanyinfo(
			osiServicesTrusteeCompanyinfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeCompanyinfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeCompanyinfoModelImpl</code>.
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

	public static OsiServicesTrusteeCompanyinfo
		fetchOsiServicesTrusteeCompanyinfo(long osiTrusId) {

		return getService().fetchOsiServicesTrusteeCompanyinfo(osiTrusId);
	}

	/**
	 * Returns the osi services trustee companyinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee companyinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	public static OsiServicesTrusteeCompanyinfo
		fetchOsiServicesTrusteeCompanyinfoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchOsiServicesTrusteeCompanyinfoByUuidAndGroupId(
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
	 * Returns the osi services trustee companyinfo with the primary key.
	 *
	 * @param osiTrusId the primary key of the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo
	 * @throws PortalException if a osi services trustee companyinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeCompanyinfo
			getOsiServicesTrusteeCompanyinfo(long osiTrusId)
		throws PortalException {

		return getService().getOsiServicesTrusteeCompanyinfo(osiTrusId);
	}

	public static OsiServicesTrusteeCompanyinfo
			getOsiServicesTrusteeCompanyinfoById(long applicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeCompanyinfoException {

		return getService().getOsiServicesTrusteeCompanyinfoById(applicationId);
	}

	/**
	 * Returns the osi services trustee companyinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee companyinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee companyinfo
	 * @throws PortalException if a matching osi services trustee companyinfo could not be found
	 */
	public static OsiServicesTrusteeCompanyinfo
			getOsiServicesTrusteeCompanyinfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getOsiServicesTrusteeCompanyinfoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services trustee companyinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @return the range of osi services trustee companyinfos
	 */
	public static List<OsiServicesTrusteeCompanyinfo>
		getOsiServicesTrusteeCompanyinfos(int start, int end) {

		return getService().getOsiServicesTrusteeCompanyinfos(start, end);
	}

	/**
	 * Returns all the osi services trustee companyinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee companyinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee companyinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesTrusteeCompanyinfo>
		getOsiServicesTrusteeCompanyinfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getOsiServicesTrusteeCompanyinfosByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of osi services trustee companyinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee companyinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee companyinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesTrusteeCompanyinfo>
		getOsiServicesTrusteeCompanyinfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesTrusteeCompanyinfo>
				orderByComparator) {

		return getService().getOsiServicesTrusteeCompanyinfosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services trustee companyinfos.
	 *
	 * @return the number of osi services trustee companyinfos
	 */
	public static int getOsiServicesTrusteeCompanyinfosCount() {
		return getService().getOsiServicesTrusteeCompanyinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services trustee companyinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeCompanyinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeCompanyinfo the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo that was updated
	 */
	public static OsiServicesTrusteeCompanyinfo
		updateOsiServicesTrusteeCompanyinfo(
			OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		return getService().updateOsiServicesTrusteeCompanyinfo(
			osiServicesTrusteeCompanyinfo);
	}

	public static OsiServicesTrusteeCompanyinfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiServicesTrusteeCompanyinfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiServicesTrusteeCompanyinfoLocalServiceUtil.class,
			OsiServicesTrusteeCompanyinfoLocalService.class);

}