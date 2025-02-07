/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MedicalFacilitiesHomeInfo. This utility wraps
 * <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesHomeInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesHomeInfoLocalService
 * @generated
 */
public class MedicalFacilitiesHomeInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesHomeInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the medical facilities home info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeInfo the medical facilities home info
	 * @return the medical facilities home info that was added
	 */
	public static MedicalFacilitiesHomeInfo addMedicalFacilitiesHomeInfo(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		return getService().addMedicalFacilitiesHomeInfo(
			medicalFacilitiesHomeInfo);
	}

	/**
	 * Creates a new medical facilities home info with the primary key. Does not add the medical facilities home info to the database.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key for the new medical facilities home info
	 * @return the new medical facilities home info
	 */
	public static MedicalFacilitiesHomeInfo createMedicalFacilitiesHomeInfo(
		long medicalFacilitiesHomeInfoId) {

		return getService().createMedicalFacilitiesHomeInfo(
			medicalFacilitiesHomeInfoId);
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
	 * Deletes the medical facilities home info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info that was removed
	 * @throws PortalException if a medical facilities home info with the primary key could not be found
	 */
	public static MedicalFacilitiesHomeInfo deleteMedicalFacilitiesHomeInfo(
			long medicalFacilitiesHomeInfoId)
		throws PortalException {

		return getService().deleteMedicalFacilitiesHomeInfo(
			medicalFacilitiesHomeInfoId);
	}

	/**
	 * Deletes the medical facilities home info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeInfo the medical facilities home info
	 * @return the medical facilities home info that was removed
	 */
	public static MedicalFacilitiesHomeInfo deleteMedicalFacilitiesHomeInfo(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		return getService().deleteMedicalFacilitiesHomeInfo(
			medicalFacilitiesHomeInfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeInfoModelImpl</code>.
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

	public static MedicalFacilitiesHomeInfo fetchMedicalFacilitiesHomeInfo(
		long medicalFacilitiesHomeInfoId) {

		return getService().fetchMedicalFacilitiesHomeInfo(
			medicalFacilitiesHomeInfoId);
	}

	/**
	 * Returns the medical facilities home info matching the UUID and group.
	 *
	 * @param uuid the medical facilities home info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo
		fetchMedicalFacilitiesHomeInfoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchMedicalFacilitiesHomeInfoByUuidAndGroupId(
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

	public static MedicalFacilitiesHomeInfo getMedicalFacilities_ByAppId(
			long applicationId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getService().getMedicalFacilities_ByAppId(applicationId);
	}

	public static List<MedicalFacilitiesHomeInfo>
		getMedicalFacilitiesAppliInfoBy_Id(long applicationId) {

		return getService().getMedicalFacilitiesAppliInfoBy_Id(applicationId);
	}

	/**
	 * Returns the medical facilities home info with the primary key.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info
	 * @throws PortalException if a medical facilities home info with the primary key could not be found
	 */
	public static MedicalFacilitiesHomeInfo getMedicalFacilitiesHomeInfo(
			long medicalFacilitiesHomeInfoId)
		throws PortalException {

		return getService().getMedicalFacilitiesHomeInfo(
			medicalFacilitiesHomeInfoId);
	}

	/**
	 * Returns the medical facilities home info matching the UUID and group.
	 *
	 * @param uuid the medical facilities home info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home info
	 * @throws PortalException if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo
			getMedicalFacilitiesHomeInfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getMedicalFacilitiesHomeInfoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities home infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> getMedicalFacilitiesHomeInfos(
		int start, int end) {

		return getService().getMedicalFacilitiesHomeInfos(start, end);
	}

	/**
	 * Returns all the medical facilities home infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home infos
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities home infos, or an empty list if no matches were found
	 */
	public static List<MedicalFacilitiesHomeInfo>
		getMedicalFacilitiesHomeInfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getMedicalFacilitiesHomeInfosByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities home infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities home infos, or an empty list if no matches were found
	 */
	public static List<MedicalFacilitiesHomeInfo>
		getMedicalFacilitiesHomeInfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return getService().getMedicalFacilitiesHomeInfosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities home infos.
	 *
	 * @return the number of medical facilities home infos
	 */
	public static int getMedicalFacilitiesHomeInfosCount() {
		return getService().getMedicalFacilitiesHomeInfosCount();
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
	 * Updates the medical facilities home info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeInfo the medical facilities home info
	 * @return the medical facilities home info that was updated
	 */
	public static MedicalFacilitiesHomeInfo updateMedicalFacilitiesHomeInfo(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		return getService().updateMedicalFacilitiesHomeInfo(
			medicalFacilitiesHomeInfo);
	}

	public static MedicalFacilitiesHomeInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MedicalFacilitiesHomeInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			MedicalFacilitiesHomeInfoLocalServiceUtil.class,
			MedicalFacilitiesHomeInfoLocalService.class);

}