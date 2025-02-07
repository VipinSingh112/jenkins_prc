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

import com.nbp.janaac.application.form.service.model.AccMediLabOrganization;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AccMediLabOrganization. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AccMediLabOrganizationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabOrganizationLocalService
 * @generated
 */
public class AccMediLabOrganizationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AccMediLabOrganizationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acc medi lab organization to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabOrganization the acc medi lab organization
	 * @return the acc medi lab organization that was added
	 */
	public static AccMediLabOrganization addAccMediLabOrganization(
		AccMediLabOrganization accMediLabOrganization) {

		return getService().addAccMediLabOrganization(accMediLabOrganization);
	}

	/**
	 * Creates a new acc medi lab organization with the primary key. Does not add the acc medi lab organization to the database.
	 *
	 * @param accMediLabOrganizationId the primary key for the new acc medi lab organization
	 * @return the new acc medi lab organization
	 */
	public static AccMediLabOrganization createAccMediLabOrganization(
		long accMediLabOrganizationId) {

		return getService().createAccMediLabOrganization(
			accMediLabOrganizationId);
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
	 * Deletes the acc medi lab organization from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabOrganization the acc medi lab organization
	 * @return the acc medi lab organization that was removed
	 */
	public static AccMediLabOrganization deleteAccMediLabOrganization(
		AccMediLabOrganization accMediLabOrganization) {

		return getService().deleteAccMediLabOrganization(
			accMediLabOrganization);
	}

	/**
	 * Deletes the acc medi lab organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabOrganizationId the primary key of the acc medi lab organization
	 * @return the acc medi lab organization that was removed
	 * @throws PortalException if a acc medi lab organization with the primary key could not be found
	 */
	public static AccMediLabOrganization deleteAccMediLabOrganization(
			long accMediLabOrganizationId)
		throws PortalException {

		return getService().deleteAccMediLabOrganization(
			accMediLabOrganizationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabOrganizationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabOrganizationModelImpl</code>.
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

	public static AccMediLabOrganization fetchAccMediLabOrganization(
		long accMediLabOrganizationId) {

		return getService().fetchAccMediLabOrganization(
			accMediLabOrganizationId);
	}

	/**
	 * Returns the acc medi lab organization matching the UUID and group.
	 *
	 * @param uuid the acc medi lab organization's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab organization, or <code>null</code> if a matching acc medi lab organization could not be found
	 */
	public static AccMediLabOrganization
		fetchAccMediLabOrganizationByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchAccMediLabOrganizationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acc medi lab organization with the primary key.
	 *
	 * @param accMediLabOrganizationId the primary key of the acc medi lab organization
	 * @return the acc medi lab organization
	 * @throws PortalException if a acc medi lab organization with the primary key could not be found
	 */
	public static AccMediLabOrganization getAccMediLabOrganization(
			long accMediLabOrganizationId)
		throws PortalException {

		return getService().getAccMediLabOrganization(accMediLabOrganizationId);
	}

	/**
	 * Returns the acc medi lab organization matching the UUID and group.
	 *
	 * @param uuid the acc medi lab organization's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab organization
	 * @throws PortalException if a matching acc medi lab organization could not be found
	 */
	public static AccMediLabOrganization
			getAccMediLabOrganizationByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getAccMediLabOrganizationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acc medi lab organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @return the range of acc medi lab organizations
	 */
	public static List<AccMediLabOrganization> getAccMediLabOrganizations(
		int start, int end) {

		return getService().getAccMediLabOrganizations(start, end);
	}

	/**
	 * Returns all the acc medi lab organizations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab organizations
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab organizations, or an empty list if no matches were found
	 */
	public static List<AccMediLabOrganization>
		getAccMediLabOrganizationsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getAccMediLabOrganizationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acc medi lab organizations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab organizations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab organizations
	 * @param end the upper bound of the range of acc medi lab organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab organizations, or an empty list if no matches were found
	 */
	public static List<AccMediLabOrganization>
		getAccMediLabOrganizationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccMediLabOrganization> orderByComparator) {

		return getService().getAccMediLabOrganizationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc medi lab organizations.
	 *
	 * @return the number of acc medi lab organizations
	 */
	public static int getAccMediLabOrganizationsCount() {
		return getService().getAccMediLabOrganizationsCount();
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

	public static AccMediLabOrganization getJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabOrganizationException {

		return getService().getJANAAC_ByApplicationId(janaacApplicationId);
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
	 * Updates the acc medi lab organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabOrganization the acc medi lab organization
	 * @return the acc medi lab organization that was updated
	 */
	public static AccMediLabOrganization updateAccMediLabOrganization(
		AccMediLabOrganization accMediLabOrganization) {

		return getService().updateAccMediLabOrganization(
			accMediLabOrganization);
	}

	public static AccMediLabOrganizationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AccMediLabOrganizationLocalService>
		_serviceSnapshot = new Snapshot<>(
			AccMediLabOrganizationLocalServiceUtil.class,
			AccMediLabOrganizationLocalService.class);

}