/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JADSCCertificateOfVeracity. This utility wraps
 * <code>com.nbp.jadsc.application.form.service.service.impl.JADSCCertificateOfVeracityLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfVeracityLocalService
 * @generated
 */
public class JADSCCertificateOfVeracityLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jadsc.application.form.service.service.impl.JADSCCertificateOfVeracityLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jadsc certificate of veracity to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfVeracityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfVeracity the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity that was added
	 */
	public static JADSCCertificateOfVeracity addJADSCCertificateOfVeracity(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		return getService().addJADSCCertificateOfVeracity(
			jadscCertificateOfVeracity);
	}

	/**
	 * Creates a new jadsc certificate of veracity with the primary key. Does not add the jadsc certificate of veracity to the database.
	 *
	 * @param jadscCOVId the primary key for the new jadsc certificate of veracity
	 * @return the new jadsc certificate of veracity
	 */
	public static JADSCCertificateOfVeracity createJADSCCertificateOfVeracity(
		long jadscCOVId) {

		return getService().createJADSCCertificateOfVeracity(jadscCOVId);
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
	 * Deletes the jadsc certificate of veracity from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfVeracityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfVeracity the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity that was removed
	 */
	public static JADSCCertificateOfVeracity deleteJADSCCertificateOfVeracity(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		return getService().deleteJADSCCertificateOfVeracity(
			jadscCertificateOfVeracity);
	}

	/**
	 * Deletes the jadsc certificate of veracity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfVeracityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity that was removed
	 * @throws PortalException if a jadsc certificate of veracity with the primary key could not be found
	 */
	public static JADSCCertificateOfVeracity deleteJADSCCertificateOfVeracity(
			long jadscCOVId)
		throws PortalException {

		return getService().deleteJADSCCertificateOfVeracity(jadscCOVId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityModelImpl</code>.
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

	public static JADSCCertificateOfVeracity fetchJADSCCertificateOfVeracity(
		long jadscCOVId) {

		return getService().fetchJADSCCertificateOfVeracity(jadscCOVId);
	}

	/**
	 * Returns the jadsc certificate of veracity matching the UUID and group.
	 *
	 * @param uuid the jadsc certificate of veracity's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity
		fetchJADSCCertificateOfVeracityByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchJADSCCertificateOfVeracityByUuidAndGroupId(
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

	public static JADSCCertificateOfVeracity getJADSCBy_Id(
			long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getService().getJADSCBy_Id(jadscApplicationId);
	}

	/**
	 * Returns a range of all the jadsc certificate of veracities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @return the range of jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity>
		getJADSCCertificateOfVeracities(int start, int end) {

		return getService().getJADSCCertificateOfVeracities(start, end);
	}

	/**
	 * Returns all the jadsc certificate of veracities matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc certificate of veracities
	 * @param companyId the primary key of the company
	 * @return the matching jadsc certificate of veracities, or an empty list if no matches were found
	 */
	public static List<JADSCCertificateOfVeracity>
		getJADSCCertificateOfVeracitiesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getJADSCCertificateOfVeracitiesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of jadsc certificate of veracities matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc certificate of veracities
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc certificate of veracities, or an empty list if no matches were found
	 */
	public static List<JADSCCertificateOfVeracity>
		getJADSCCertificateOfVeracitiesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		return getService().getJADSCCertificateOfVeracitiesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc certificate of veracities.
	 *
	 * @return the number of jadsc certificate of veracities
	 */
	public static int getJADSCCertificateOfVeracitiesCount() {
		return getService().getJADSCCertificateOfVeracitiesCount();
	}

	/**
	 * Returns the jadsc certificate of veracity with the primary key.
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity
	 * @throws PortalException if a jadsc certificate of veracity with the primary key could not be found
	 */
	public static JADSCCertificateOfVeracity getJADSCCertificateOfVeracity(
			long jadscCOVId)
		throws PortalException {

		return getService().getJADSCCertificateOfVeracity(jadscCOVId);
	}

	/**
	 * Returns the jadsc certificate of veracity matching the UUID and group.
	 *
	 * @param uuid the jadsc certificate of veracity's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc certificate of veracity
	 * @throws PortalException if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity
			getJADSCCertificateOfVeracityByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getJADSCCertificateOfVeracityByUuidAndGroupId(
			uuid, groupId);
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
	 * Updates the jadsc certificate of veracity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfVeracityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfVeracity the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity that was updated
	 */
	public static JADSCCertificateOfVeracity updateJADSCCertificateOfVeracity(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		return getService().updateJADSCCertificateOfVeracity(
			jadscCertificateOfVeracity);
	}

	public static JADSCCertificateOfVeracityLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JADSCCertificateOfVeracityLocalService>
		_serviceSnapshot = new Snapshot<>(
			JADSCCertificateOfVeracityLocalServiceUtil.class,
			JADSCCertificateOfVeracityLocalService.class);

}