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

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualQualificationinfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiServicesTrusteeIndividualQualificationinfo. This utility wraps
 * <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeIndividualQualificationinfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualQualificationinfoLocalService
 * @generated
 */
public class OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeIndividualQualificationinfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi services trustee individual qualificationinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualQualificationinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeIndividualQualificationinfo the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo that was added
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
		addOsiServicesTrusteeIndividualQualificationinfo(
			OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo) {

		return getService().addOsiServicesTrusteeIndividualQualificationinfo(
			osiServicesTrusteeIndividualQualificationinfo);
	}

	/**
	 * Creates a new osi services trustee individual qualificationinfo with the primary key. Does not add the osi services trustee individual qualificationinfo to the database.
	 *
	 * @param osQualificationId the primary key for the new osi services trustee individual qualificationinfo
	 * @return the new osi services trustee individual qualificationinfo
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
		createOsiServicesTrusteeIndividualQualificationinfo(
			long osQualificationId) {

		return getService().createOsiServicesTrusteeIndividualQualificationinfo(
			osQualificationId);
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
	 * Deletes the osi services trustee individual qualificationinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualQualificationinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo that was removed
	 * @throws PortalException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
			deleteOsiServicesTrusteeIndividualQualificationinfo(
				long osQualificationId)
		throws PortalException {

		return getService().deleteOsiServicesTrusteeIndividualQualificationinfo(
			osQualificationId);
	}

	/**
	 * Deletes the osi services trustee individual qualificationinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualQualificationinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeIndividualQualificationinfo the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo that was removed
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
		deleteOsiServicesTrusteeIndividualQualificationinfo(
			OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo) {

		return getService().deleteOsiServicesTrusteeIndividualQualificationinfo(
			osiServicesTrusteeIndividualQualificationinfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
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

	public static OsiServicesTrusteeIndividualQualificationinfo
		fetchOsiServicesTrusteeIndividualQualificationinfo(
			long osQualificationId) {

		return getService().fetchOsiServicesTrusteeIndividualQualificationinfo(
			osQualificationId);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee individual qualificationinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
		fetchOsiServicesTrusteeIndividualQualificationinfoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchOsiServicesTrusteeIndividualQualificationinfoByUuidAndGroupId(
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
	 * Returns the osi services trustee individual qualificationinfo with the primary key.
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo
	 * @throws PortalException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
			getOsiServicesTrusteeIndividualQualificationinfo(
				long osQualificationId)
		throws PortalException {

		return getService().getOsiServicesTrusteeIndividualQualificationinfo(
			osQualificationId);
	}

	public static OsiServicesTrusteeIndividualQualificationinfo
			getOsiServicesTrusteeIndividualQualificationinfoById(
				long applicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getService().
			getOsiServicesTrusteeIndividualQualificationinfoById(applicationId);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee individual qualificationinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee individual qualificationinfo
	 * @throws PortalException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
			getOsiServicesTrusteeIndividualQualificationinfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().
			getOsiServicesTrusteeIndividualQualificationinfoByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services trustee individual qualificationinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @return the range of osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		getOsiServicesTrusteeIndividualQualificationinfos(int start, int end) {

		return getService().getOsiServicesTrusteeIndividualQualificationinfos(
			start, end);
	}

	/**
	 * Returns all the osi services trustee individual qualificationinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee individual qualificationinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee individual qualificationinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		getOsiServicesTrusteeIndividualQualificationinfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getOsiServicesTrusteeIndividualQualificationinfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services trustee individual qualificationinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee individual qualificationinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee individual qualificationinfos, or an empty list if no matches were found
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		getOsiServicesTrusteeIndividualQualificationinfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator) {

		return getService().
			getOsiServicesTrusteeIndividualQualificationinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services trustee individual qualificationinfos.
	 *
	 * @return the number of osi services trustee individual qualificationinfos
	 */
	public static int getOsiServicesTrusteeIndividualQualificationinfosCount() {
		return getService().
			getOsiServicesTrusteeIndividualQualificationinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services trustee individual qualificationinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeIndividualQualificationinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeIndividualQualificationinfo the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo that was updated
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
		updateOsiServicesTrusteeIndividualQualificationinfo(
			OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo) {

		return getService().updateOsiServicesTrusteeIndividualQualificationinfo(
			osiServicesTrusteeIndividualQualificationinfo);
	}

	public static OsiServicesTrusteeIndividualQualificationinfoLocalService
		getService() {

		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<OsiServicesTrusteeIndividualQualificationinfoLocalService>
			_serviceSnapshot = new Snapshot<>(
				OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil.
					class,
				OsiServicesTrusteeIndividualQualificationinfoLocalService.
					class);

}