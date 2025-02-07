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

import com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AccInsBodiesPhyResource. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AccInsBodiesPhyResourceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesPhyResourceLocalService
 * @generated
 */
public class AccInsBodiesPhyResourceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AccInsBodiesPhyResourceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acc ins bodies phy resource to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesPhyResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesPhyResource the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource that was added
	 */
	public static AccInsBodiesPhyResource addAccInsBodiesPhyResource(
		AccInsBodiesPhyResource accInsBodiesPhyResource) {

		return getService().addAccInsBodiesPhyResource(accInsBodiesPhyResource);
	}

	/**
	 * Creates a new acc ins bodies phy resource with the primary key. Does not add the acc ins bodies phy resource to the database.
	 *
	 * @param accInsBodiesPhyResourceId the primary key for the new acc ins bodies phy resource
	 * @return the new acc ins bodies phy resource
	 */
	public static AccInsBodiesPhyResource createAccInsBodiesPhyResource(
		long accInsBodiesPhyResourceId) {

		return getService().createAccInsBodiesPhyResource(
			accInsBodiesPhyResourceId);
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
	 * Deletes the acc ins bodies phy resource from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesPhyResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesPhyResource the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource that was removed
	 */
	public static AccInsBodiesPhyResource deleteAccInsBodiesPhyResource(
		AccInsBodiesPhyResource accInsBodiesPhyResource) {

		return getService().deleteAccInsBodiesPhyResource(
			accInsBodiesPhyResource);
	}

	/**
	 * Deletes the acc ins bodies phy resource with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesPhyResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource that was removed
	 * @throws PortalException if a acc ins bodies phy resource with the primary key could not be found
	 */
	public static AccInsBodiesPhyResource deleteAccInsBodiesPhyResource(
			long accInsBodiesPhyResourceId)
		throws PortalException {

		return getService().deleteAccInsBodiesPhyResource(
			accInsBodiesPhyResourceId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesPhyResourceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesPhyResourceModelImpl</code>.
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

	public static AccInsBodiesPhyResource fetchAccInsBodiesPhyResource(
		long accInsBodiesPhyResourceId) {

		return getService().fetchAccInsBodiesPhyResource(
			accInsBodiesPhyResourceId);
	}

	/**
	 * Returns the acc ins bodies phy resource matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies phy resource's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource
		fetchAccInsBodiesPhyResourceByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchAccInsBodiesPhyResourceByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acc ins bodies phy resource with the primary key.
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource
	 * @throws PortalException if a acc ins bodies phy resource with the primary key could not be found
	 */
	public static AccInsBodiesPhyResource getAccInsBodiesPhyResource(
			long accInsBodiesPhyResourceId)
		throws PortalException {

		return getService().getAccInsBodiesPhyResource(
			accInsBodiesPhyResourceId);
	}

	/**
	 * Returns the acc ins bodies phy resource matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies phy resource's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies phy resource
	 * @throws PortalException if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource
			getAccInsBodiesPhyResourceByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getAccInsBodiesPhyResourceByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acc ins bodies phy resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @return the range of acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> getAccInsBodiesPhyResources(
		int start, int end) {

		return getService().getAccInsBodiesPhyResources(start, end);
	}

	/**
	 * Returns all the acc ins bodies phy resources matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies phy resources
	 * @param companyId the primary key of the company
	 * @return the matching acc ins bodies phy resources, or an empty list if no matches were found
	 */
	public static List<AccInsBodiesPhyResource>
		getAccInsBodiesPhyResourcesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getAccInsBodiesPhyResourcesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acc ins bodies phy resources matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies phy resources
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc ins bodies phy resources, or an empty list if no matches were found
	 */
	public static List<AccInsBodiesPhyResource>
		getAccInsBodiesPhyResourcesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccInsBodiesPhyResource> orderByComparator) {

		return getService().getAccInsBodiesPhyResourcesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc ins bodies phy resources.
	 *
	 * @return the number of acc ins bodies phy resources
	 */
	public static int getAccInsBodiesPhyResourcesCount() {
		return getService().getAccInsBodiesPhyResourcesCount();
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

	public static AccInsBodiesPhyResource getJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

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
	 * Updates the acc ins bodies phy resource in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesPhyResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesPhyResource the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource that was updated
	 */
	public static AccInsBodiesPhyResource updateAccInsBodiesPhyResource(
		AccInsBodiesPhyResource accInsBodiesPhyResource) {

		return getService().updateAccInsBodiesPhyResource(
			accInsBodiesPhyResource);
	}

	public static AccInsBodiesPhyResourceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AccInsBodiesPhyResourceLocalService>
		_serviceSnapshot = new Snapshot<>(
			AccInsBodiesPhyResourceLocalServiceUtil.class,
			AccInsBodiesPhyResourceLocalService.class);

}