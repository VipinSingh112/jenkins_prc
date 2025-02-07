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

import com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AccInsBodiesOrganization. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AccInsBodiesOrganizationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOrganizationLocalService
 * @generated
 */
public class AccInsBodiesOrganizationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AccInsBodiesOrganizationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acc ins bodies organization to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOrganization the acc ins bodies organization
	 * @return the acc ins bodies organization that was added
	 */
	public static AccInsBodiesOrganization addAccInsBodiesOrganization(
		AccInsBodiesOrganization accInsBodiesOrganization) {

		return getService().addAccInsBodiesOrganization(
			accInsBodiesOrganization);
	}

	/**
	 * Creates a new acc ins bodies organization with the primary key. Does not add the acc ins bodies organization to the database.
	 *
	 * @param accInsBodiesOrganizationId the primary key for the new acc ins bodies organization
	 * @return the new acc ins bodies organization
	 */
	public static AccInsBodiesOrganization createAccInsBodiesOrganization(
		long accInsBodiesOrganizationId) {

		return getService().createAccInsBodiesOrganization(
			accInsBodiesOrganizationId);
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
	 * Deletes the acc ins bodies organization from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOrganization the acc ins bodies organization
	 * @return the acc ins bodies organization that was removed
	 */
	public static AccInsBodiesOrganization deleteAccInsBodiesOrganization(
		AccInsBodiesOrganization accInsBodiesOrganization) {

		return getService().deleteAccInsBodiesOrganization(
			accInsBodiesOrganization);
	}

	/**
	 * Deletes the acc ins bodies organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOrganizationId the primary key of the acc ins bodies organization
	 * @return the acc ins bodies organization that was removed
	 * @throws PortalException if a acc ins bodies organization with the primary key could not be found
	 */
	public static AccInsBodiesOrganization deleteAccInsBodiesOrganization(
			long accInsBodiesOrganizationId)
		throws PortalException {

		return getService().deleteAccInsBodiesOrganization(
			accInsBodiesOrganizationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOrganizationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOrganizationModelImpl</code>.
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

	public static AccInsBodiesOrganization fetchAccInsBodiesOrganization(
		long accInsBodiesOrganizationId) {

		return getService().fetchAccInsBodiesOrganization(
			accInsBodiesOrganizationId);
	}

	/**
	 * Returns the acc ins bodies organization matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies organization's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization
		fetchAccInsBodiesOrganizationByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchAccInsBodiesOrganizationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acc ins bodies organization with the primary key.
	 *
	 * @param accInsBodiesOrganizationId the primary key of the acc ins bodies organization
	 * @return the acc ins bodies organization
	 * @throws PortalException if a acc ins bodies organization with the primary key could not be found
	 */
	public static AccInsBodiesOrganization getAccInsBodiesOrganization(
			long accInsBodiesOrganizationId)
		throws PortalException {

		return getService().getAccInsBodiesOrganization(
			accInsBodiesOrganizationId);
	}

	/**
	 * Returns the acc ins bodies organization matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies organization's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies organization
	 * @throws PortalException if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization
			getAccInsBodiesOrganizationByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getAccInsBodiesOrganizationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acc ins bodies organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @return the range of acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> getAccInsBodiesOrganizations(
		int start, int end) {

		return getService().getAccInsBodiesOrganizations(start, end);
	}

	/**
	 * Returns all the acc ins bodies organizations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies organizations
	 * @param companyId the primary key of the company
	 * @return the matching acc ins bodies organizations, or an empty list if no matches were found
	 */
	public static List<AccInsBodiesOrganization>
		getAccInsBodiesOrganizationsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getAccInsBodiesOrganizationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acc ins bodies organizations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies organizations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc ins bodies organizations, or an empty list if no matches were found
	 */
	public static List<AccInsBodiesOrganization>
		getAccInsBodiesOrganizationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccInsBodiesOrganization> orderByComparator) {

		return getService().getAccInsBodiesOrganizationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc ins bodies organizations.
	 *
	 * @return the number of acc ins bodies organizations
	 */
	public static int getAccInsBodiesOrganizationsCount() {
		return getService().getAccInsBodiesOrganizationsCount();
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

	public static AccInsBodiesOrganization getJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

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
	 * Updates the acc ins bodies organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOrganization the acc ins bodies organization
	 * @return the acc ins bodies organization that was updated
	 */
	public static AccInsBodiesOrganization updateAccInsBodiesOrganization(
		AccInsBodiesOrganization accInsBodiesOrganization) {

		return getService().updateAccInsBodiesOrganization(
			accInsBodiesOrganization);
	}

	public static AccInsBodiesOrganizationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AccInsBodiesOrganizationLocalService>
		_serviceSnapshot = new Snapshot<>(
			AccInsBodiesOrganizationLocalServiceUtil.class,
			AccInsBodiesOrganizationLocalService.class);

}