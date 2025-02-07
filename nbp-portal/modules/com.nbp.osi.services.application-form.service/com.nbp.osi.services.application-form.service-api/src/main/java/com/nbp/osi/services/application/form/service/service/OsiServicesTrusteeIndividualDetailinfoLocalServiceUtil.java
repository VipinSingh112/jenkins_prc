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

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualDetailinfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiServicesTrusteeIndividualDetailinfo. This utility wraps
 * <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeIndividualDetailinfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualDetailinfoLocalService
 * @generated
 */
public class OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeIndividualDetailinfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi services trustee individual detailinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeIndividualDetailinfo the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo that was added
	 */
	public static OsiServicesTrusteeIndividualDetailinfo
		addOsiServicesTrusteeIndividualDetailinfo(
			OsiServicesTrusteeIndividualDetailinfo
				osiServicesTrusteeIndividualDetailinfo) {

		return getService().addOsiServicesTrusteeIndividualDetailinfo(
			osiServicesTrusteeIndividualDetailinfo);
	}

	/**
	 * Creates a new osi services trustee individual detailinfo with the primary key. Does not add the osi services trustee individual detailinfo to the database.
	 *
	 * @param osTIId the primary key for the new osi services trustee individual detailinfo
	 * @return the new osi services trustee individual detailinfo
	 */
	public static OsiServicesTrusteeIndividualDetailinfo
		createOsiServicesTrusteeIndividualDetailinfo(long osTIId) {

		return getService().createOsiServicesTrusteeIndividualDetailinfo(
			osTIId);
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
	 * Deletes the osi services trustee individual detailinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osTIId the primary key of the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo that was removed
	 * @throws PortalException if a osi services trustee individual detailinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeIndividualDetailinfo
			deleteOsiServicesTrusteeIndividualDetailinfo(long osTIId)
		throws PortalException {

		return getService().deleteOsiServicesTrusteeIndividualDetailinfo(
			osTIId);
	}

	/**
	 * Deletes the osi services trustee individual detailinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeIndividualDetailinfo the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo that was removed
	 */
	public static OsiServicesTrusteeIndividualDetailinfo
		deleteOsiServicesTrusteeIndividualDetailinfo(
			OsiServicesTrusteeIndividualDetailinfo
				osiServicesTrusteeIndividualDetailinfo) {

		return getService().deleteOsiServicesTrusteeIndividualDetailinfo(
			osiServicesTrusteeIndividualDetailinfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
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

	public static OsiServicesTrusteeIndividualDetailinfo
		fetchOsiServicesTrusteeIndividualDetailinfo(long osTIId) {

		return getService().fetchOsiServicesTrusteeIndividualDetailinfo(osTIId);
	}

	/**
	 * Returns the osi services trustee individual detailinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee individual detailinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee individual detailinfo, or <code>null</code> if a matching osi services trustee individual detailinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualDetailinfo
		fetchOsiServicesTrusteeIndividualDetailinfoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchOsiServicesTrusteeIndividualDetailinfoByUuidAndGroupId(
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
	 * Returns the osi services trustee individual detailinfo with the primary key.
	 *
	 * @param osTIId the primary key of the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo
	 * @throws PortalException if a osi services trustee individual detailinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeIndividualDetailinfo
			getOsiServicesTrusteeIndividualDetailinfo(long osTIId)
		throws PortalException {

		return getService().getOsiServicesTrusteeIndividualDetailinfo(osTIId);
	}

	public static OsiServicesTrusteeIndividualDetailinfo
			getOsiServicesTrusteeIndividualDetailinfoById(long applicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualDetailinfoException {

		return getService().getOsiServicesTrusteeIndividualDetailinfoById(
			applicationId);
	}

	/**
	 * Returns the osi services trustee individual detailinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee individual detailinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee individual detailinfo
	 * @throws PortalException if a matching osi services trustee individual detailinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualDetailinfo
			getOsiServicesTrusteeIndividualDetailinfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().
			getOsiServicesTrusteeIndividualDetailinfoByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services trustee individual detailinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualDetailinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @return the range of osi services trustee individual detailinfos
	 */
	public static List<OsiServicesTrusteeIndividualDetailinfo>
		getOsiServicesTrusteeIndividualDetailinfos(int start, int end) {

		return getService().getOsiServicesTrusteeIndividualDetailinfos(
			start, end);
	}

	/**
	 * Returns all the osi services trustee individual detailinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee individual detailinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee individual detailinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesTrusteeIndividualDetailinfo>
		getOsiServicesTrusteeIndividualDetailinfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getOsiServicesTrusteeIndividualDetailinfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services trustee individual detailinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee individual detailinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee individual detailinfos
	 * @param end the upper bound of the range of osi services trustee individual detailinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee individual detailinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesTrusteeIndividualDetailinfo>
		getOsiServicesTrusteeIndividualDetailinfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesTrusteeIndividualDetailinfo>
				orderByComparator) {

		return getService().
			getOsiServicesTrusteeIndividualDetailinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services trustee individual detailinfos.
	 *
	 * @return the number of osi services trustee individual detailinfos
	 */
	public static int getOsiServicesTrusteeIndividualDetailinfosCount() {
		return getService().getOsiServicesTrusteeIndividualDetailinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services trustee individual detailinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualDetailinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeIndividualDetailinfo the osi services trustee individual detailinfo
	 * @return the osi services trustee individual detailinfo that was updated
	 */
	public static OsiServicesTrusteeIndividualDetailinfo
		updateOsiServicesTrusteeIndividualDetailinfo(
			OsiServicesTrusteeIndividualDetailinfo
				osiServicesTrusteeIndividualDetailinfo) {

		return getService().updateOsiServicesTrusteeIndividualDetailinfo(
			osiServicesTrusteeIndividualDetailinfo);
	}

	public static OsiServicesTrusteeIndividualDetailinfoLocalService
		getService() {

		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<OsiServicesTrusteeIndividualDetailinfoLocalService> _serviceSnapshot =
			new Snapshot<>(
				OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil.class,
				OsiServicesTrusteeIndividualDetailinfoLocalService.class);

}